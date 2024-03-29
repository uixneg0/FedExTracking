package org.uixneg0.oauth;

import com.google.gson.Gson;
import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.HashMap;

@Getter
public class OAuthJsonParser {
	public static OAuthJson readJson() {
		File file = new File(System.getProperty("user.dir") + "/oauth.json");
		if (file.exists()) {
			try {
				Gson gson = new Gson();
				return gson.fromJson(new FileReader(file), OAuthJson.class);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("Could not read FedExTrackerChecker.requests.OAuthJson file at: " + file.getAbsolutePath());
		return null;
	}

	public static HashMap<String, String> getOAuthFields() {
		OAuthJson oAuthJson = readJson();
		if (oAuthJson == null) return null;
		HashMap<String, String> oAuthFields = new HashMap<>();
		for (Field field : oAuthJson.getClass().getDeclaredFields()) {
			String fieldName = field.getName();
			String fieldVal = null;
			try {
				fieldVal = (String) field.get(oAuthJson);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
			if (fieldVal != null) {
				oAuthFields.put(fieldName, fieldVal);
			}
		}
		return oAuthFields;
	}
}


