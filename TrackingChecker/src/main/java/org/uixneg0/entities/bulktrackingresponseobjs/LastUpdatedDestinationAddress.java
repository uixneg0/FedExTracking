package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"city",
		"stateOrProvinceCode",
		"countryCode",
		"residential",
		"countryName"
})

public class LastUpdatedDestinationAddress {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("city")
	private String city;
	@JsonProperty("stateOrProvinceCode")
	private String stateOrProvinceCode;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("residential")
	private Boolean residential;
	@JsonProperty("countryName")
	private String countryName;

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	public LastUpdatedDestinationAddress withCity(String city) {
		this.city = city;
		return this;
	}

	@JsonProperty("stateOrProvinceCode")
	public String getStateOrProvinceCode() {
		return stateOrProvinceCode;
	}

	@JsonProperty("stateOrProvinceCode")
	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}

	public LastUpdatedDestinationAddress withStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
		return this;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public LastUpdatedDestinationAddress withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	@JsonProperty("residential")
	public Boolean getResidential() {
		return residential;
	}

	@JsonProperty("residential")
	public void setResidential(Boolean residential) {
		this.residential = residential;
	}

	public LastUpdatedDestinationAddress withResidential(Boolean residential) {
		this.residential = residential;
		return this;
	}

	@JsonProperty("countryName")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("countryName")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public LastUpdatedDestinationAddress withCountryName(String countryName) {
		this.countryName = countryName;
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

	public LastUpdatedDestinationAddress withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(LastUpdatedDestinationAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("city");
		sb.append('=');
		sb.append(((this.city == null) ? "<null>" : this.city));
		sb.append(',');
		sb.append("stateOrProvinceCode");
		sb.append('=');
		sb.append(((this.stateOrProvinceCode == null) ? "<null>" : this.stateOrProvinceCode));
		sb.append(',');
		sb.append("countryCode");
		sb.append('=');
		sb.append(((this.countryCode == null) ? "<null>" : this.countryCode));
		sb.append(',');
		sb.append("residential");
		sb.append('=');
		sb.append(((this.residential == null) ? "<null>" : this.residential));
		sb.append(',');
		sb.append("countryName");
		sb.append('=');
		sb.append(((this.countryName == null) ? "<null>" : this.countryName));
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
		result = ((result * 31) + ((this.residential == null) ? 0 : this.residential.hashCode()));
		result = ((result * 31) + ((this.city == null) ? 0 : this.city.hashCode()));
		result = ((result * 31) + ((this.countryCode == null) ? 0 : this.countryCode.hashCode()));
		result = ((result * 31) + ((this.stateOrProvinceCode == null) ? 0 : this.stateOrProvinceCode.hashCode()));
		result = ((result * 31) + ((this.countryName == null) ? 0 : this.countryName.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof LastUpdatedDestinationAddress)) {
			return false;
		}
		LastUpdatedDestinationAddress rhs = ((LastUpdatedDestinationAddress) other);
		return ((((((Objects.equals(this.residential, rhs.residential)) && (Objects.equals(this.city, rhs.city))) && (Objects.equals(this.countryCode, rhs.countryCode))) && (Objects.equals(this.stateOrProvinceCode, rhs.stateOrProvinceCode))) && (Objects.equals(this.countryName, rhs.countryName))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
	}

}
