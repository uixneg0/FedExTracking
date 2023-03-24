package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"type",
		"values",
		"trackingNumberUniqueId",
		"carrierCode"
})

public class PackageIdentifier {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("type")
	private String type;
	@JsonProperty("values")
	private List<String> values = new ArrayList<String>();
	@JsonProperty("trackingNumberUniqueId")
	private String trackingNumberUniqueId;
	@JsonProperty("carrierCode")
	private String carrierCode;

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public PackageIdentifier withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("values")
	public List<String> getValues() {
		return values;
	}

	@JsonProperty("values")
	public void setValues(List<String> values) {
		this.values = values;
	}

	public PackageIdentifier withValues(List<String> values) {
		this.values = values;
		return this;
	}

	@JsonProperty("trackingNumberUniqueId")
	public String getTrackingNumberUniqueId() {
		return trackingNumberUniqueId;
	}

	@JsonProperty("trackingNumberUniqueId")
	public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
		this.trackingNumberUniqueId = trackingNumberUniqueId;
	}

	public PackageIdentifier withTrackingNumberUniqueId(String trackingNumberUniqueId) {
		this.trackingNumberUniqueId = trackingNumberUniqueId;
		return this;
	}

	@JsonProperty("carrierCode")
	public String getCarrierCode() {
		return carrierCode;
	}

	@JsonProperty("carrierCode")
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public PackageIdentifier withCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public PackageIdentifier withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(PackageIdentifier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("type");
		sb.append('=');
		sb.append(((this.type == null) ? "<null>" : this.type));
		sb.append(',');
		sb.append("values");
		sb.append('=');
		sb.append(((this.values == null) ? "<null>" : this.values));
		sb.append(',');
		sb.append("trackingNumberUniqueId");
		sb.append('=');
		sb.append(((this.trackingNumberUniqueId == null) ? "<null>" : this.trackingNumberUniqueId));
		sb.append(',');
		sb.append("carrierCode");
		sb.append('=');
		sb.append(((this.carrierCode == null) ? "<null>" : this.carrierCode));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.trackingNumberUniqueId == null) ? 0 : this.trackingNumberUniqueId.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result = ((result * 31) + ((this.values == null) ? 0 : this.values.hashCode()));
		result = ((result * 31) + ((this.carrierCode == null) ? 0 : this.carrierCode.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof PackageIdentifier)) {
			return false;
		}
		PackageIdentifier rhs = ((PackageIdentifier) other);
		return (((((Objects.equals(this.trackingNumberUniqueId, rhs.trackingNumberUniqueId)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.type, rhs.type))) && (Objects.equals(this.values, rhs.values))) && (Objects.equals(this.carrierCode, rhs.carrierCode)));
	}

}
