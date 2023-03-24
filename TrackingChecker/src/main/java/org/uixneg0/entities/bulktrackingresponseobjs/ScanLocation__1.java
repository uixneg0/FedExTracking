package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"streetLines",
		"city",
		"stateOrProvinceCode",
		"postalCode",
		"countryCode",
		"residential",
		"countryName"
})

public class ScanLocation__1 {

	@JsonProperty("streetLines")
	private List<String> streetLines = new ArrayList<String>();
	@JsonProperty("city")
	private String city;
	@JsonProperty("stateOrProvinceCode")
	private String stateOrProvinceCode;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("residential")
	private Boolean residential;
	@JsonProperty("countryName")
	private String countryName;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("streetLines")
	public List<String> getStreetLines() {
		return streetLines;
	}

	@JsonProperty("streetLines")
	public void setStreetLines(List<String> streetLines) {
		this.streetLines = streetLines;
	}

	public ScanLocation__1 withStreetLines(List<String> streetLines) {
		this.streetLines = streetLines;
		return this;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	public ScanLocation__1 withCity(String city) {
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

	public ScanLocation__1 withStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
		return this;
	}

	@JsonProperty("postalCode")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public ScanLocation__1 withPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public ScanLocation__1 withCountryCode(String countryCode) {
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

	public ScanLocation__1 withResidential(Boolean residential) {
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

	public ScanLocation__1 withCountryName(String countryName) {
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

	public ScanLocation__1 withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ScanLocation__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("streetLines");
		sb.append('=');
		sb.append(((this.streetLines == null) ? "<null>" : this.streetLines));
		sb.append(',');
		sb.append("city");
		sb.append('=');
		sb.append(((this.city == null) ? "<null>" : this.city));
		sb.append(',');
		sb.append("stateOrProvinceCode");
		sb.append('=');
		sb.append(((this.stateOrProvinceCode == null) ? "<null>" : this.stateOrProvinceCode));
		sb.append(',');
		sb.append("postalCode");
		sb.append('=');
		sb.append(((this.postalCode == null) ? "<null>" : this.postalCode));
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
		result = ((result * 31) + ((this.streetLines == null) ? 0 : this.streetLines.hashCode()));
		result = ((result * 31) + ((this.postalCode == null) ? 0 : this.postalCode.hashCode()));
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
		if (!(other instanceof ScanLocation__1)) {
			return false;
		}
		ScanLocation__1 rhs = ((ScanLocation__1) other);
		return ((((((((Objects.equals(this.residential, rhs.residential)) && (Objects.equals(this.city, rhs.city))) && (Objects.equals(this.countryCode, rhs.countryCode))) && (Objects.equals(this.streetLines, rhs.streetLines))) && (Objects.equals(this.postalCode, rhs.postalCode))) && (Objects.equals(this.stateOrProvinceCode, rhs.stateOrProvinceCode))) && (Objects.equals(this.countryName, rhs.countryName))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
	}

}
