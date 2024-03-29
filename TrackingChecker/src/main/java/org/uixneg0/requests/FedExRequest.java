package org.uixneg0.requests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import okhttp3.*;
import org.uixneg0.entities.OAuthResponse;
import org.uixneg0.oauth.OAuthJsonParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FedExRequest {
	public static String oAuthUrl = "https://apis.fedex.com/oauth/token";
	public static String getTrackingUrl = "https://apis.fedex.com/track/v1/trackingnumbers";

	public static Response getTrackingResults(ArrayList<Long> trackingNumbers, String oAuthToken) {
		JsonObject baseJson = new JsonObject();
		JsonArray trackingInfo = new JsonArray();
		for (Long trackingNumber : trackingNumbers) {
			JsonObject containerObject = new JsonObject();
			JsonObject trackingNumberInfo = new JsonObject();
			trackingNumberInfo.addProperty("trackingNumber", trackingNumber.toString());
			containerObject.add("trackingNumberInfo", trackingNumberInfo);
			trackingInfo.add(containerObject);
		}
		baseJson.add("trackingInfo", trackingInfo);
		HashMap<String, String> headerFields = new HashMap<>();
		headerFields.put("Content-Type", "application/json");
		headerFields.put("X-Locale", "en_US");
		headerFields.put("Authorization", "Bearer " + oAuthToken);
		return jsonPostRequest(baseJson, headerFields, getTrackingUrl);
	}

	public static Response jsonPostRequest(JsonObject jsonObject, HashMap<String, String> headerFields, String url) { // TODO actually make a reusable request function if I do more with this project
		OkHttpClient client = new OkHttpClient();
		Request.Builder requestBuilder = new Request.Builder();
		requestBuilder.url(url);
		requestBuilder.post(RequestBody.create(jsonObject.toString(), MediaType.parse("application/json")));
		for (String key : headerFields.keySet()) {
			requestBuilder.addHeader(key, headerFields.get(key));
		}
		Request request = requestBuilder.build();
		try {
			return client.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Response sendOAuthRequest(HashMap<String, String> bodyFields, HashMap<String, String> headerFields, String url) { // TODO actually make a reusable request function if I do more with this project
		OkHttpClient client = new OkHttpClient();
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : bodyFields.keySet())
			builder.add(key, bodyFields.get(key));

		Request.Builder requestBuilder = new Request.Builder();
		requestBuilder.url(url);
		requestBuilder.post(builder.build());
		for (String key : headerFields.keySet()) {
			requestBuilder.addHeader(key, headerFields.get(key));
		}
		Request request = requestBuilder.build();
		try {
			return client.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getNewOAuthToken() {
		HashMap<String, String> bodyFields = null;
		bodyFields = OAuthJsonParser.getOAuthFields();
		if (bodyFields == null) return null;
		HashMap<String, String> headerFields = new HashMap<>();
		headerFields.put("content-type", "application/x-www-form-urlencoded");
		Response response = FedExRequest.sendOAuthRequest(bodyFields, headerFields, oAuthUrl);
		if (response.body() == null) {
			System.out.println("Response for OAuth token is null.");
			return null;
		}
		OAuthResponse oAuthResponse = null;
		try {
			oAuthResponse = new Gson().fromJson(response.body().string(), OAuthResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return oAuthResponse.getAccessToken();
	}
}
