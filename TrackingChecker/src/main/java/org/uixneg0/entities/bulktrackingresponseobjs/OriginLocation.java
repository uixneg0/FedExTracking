package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"locationContactAndAddress"
})

public class OriginLocation {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("locationContactAndAddress")
	private LocationContactAndAddress locationContactAndAddress;

	@JsonProperty("locationContactAndAddress")
	public LocationContactAndAddress getLocationContactAndAddress() {
		return locationContactAndAddress;
	}

	@JsonProperty("locationContactAndAddress")
	public void setLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
		this.locationContactAndAddress = locationContactAndAddress;
	}

	public OriginLocation withLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
		this.locationContactAndAddress = locationContactAndAddress;
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

	public OriginLocation withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(OriginLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("locationContactAndAddress");
		sb.append('=');
		sb.append(((this.locationContactAndAddress == null) ? "<null>" : this.locationContactAndAddress));
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
		result = ((result * 31) + ((this.locationContactAndAddress == null) ? 0 : this.locationContactAndAddress.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof OriginLocation)) {
			return false;
		}
		OriginLocation rhs = ((OriginLocation) other);
		return ((Objects.equals(this.locationContactAndAddress, rhs.locationContactAndAddress)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
	}

}
