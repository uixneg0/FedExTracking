package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"nickname",
		"packageIdentifiers",
		"hasAssociatedShipments"
})

public class AdditionalTrackingInfo {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("nickname")
	private String nickname;
	@JsonProperty("packageIdentifiers")
	private List<PackageIdentifier> packageIdentifiers = new ArrayList<PackageIdentifier>();
	@JsonProperty("hasAssociatedShipments")
	private Boolean hasAssociatedShipments;

	@JsonProperty("nickname")
	public String getNickname() {
		return nickname;
	}

	@JsonProperty("nickname")
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public AdditionalTrackingInfo withNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	@JsonProperty("packageIdentifiers")
	public List<PackageIdentifier> getPackageIdentifiers() {
		return packageIdentifiers;
	}

	@JsonProperty("packageIdentifiers")
	public void setPackageIdentifiers(List<PackageIdentifier> packageIdentifiers) {
		this.packageIdentifiers = packageIdentifiers;
	}

	public AdditionalTrackingInfo withPackageIdentifiers(List<PackageIdentifier> packageIdentifiers) {
		this.packageIdentifiers = packageIdentifiers;
		return this;
	}

	@JsonProperty("hasAssociatedShipments")
	public Boolean getHasAssociatedShipments() {
		return hasAssociatedShipments;
	}

	@JsonProperty("hasAssociatedShipments")
	public void setHasAssociatedShipments(Boolean hasAssociatedShipments) {
		this.hasAssociatedShipments = hasAssociatedShipments;
	}

	public AdditionalTrackingInfo withHasAssociatedShipments(Boolean hasAssociatedShipments) {
		this.hasAssociatedShipments = hasAssociatedShipments;
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

	public AdditionalTrackingInfo withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(AdditionalTrackingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("nickname");
		sb.append('=');
		sb.append(((this.nickname == null) ? "<null>" : this.nickname));
		sb.append(',');
		sb.append("packageIdentifiers");
		sb.append('=');
		sb.append(((this.packageIdentifiers == null) ? "<null>" : this.packageIdentifiers));
		sb.append(',');
		sb.append("hasAssociatedShipments");
		sb.append('=');
		sb.append(((this.hasAssociatedShipments == null) ? "<null>" : this.hasAssociatedShipments));
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
		result = ((result * 31) + ((this.nickname == null) ? 0 : this.nickname.hashCode()));
		result = ((result * 31) + ((this.packageIdentifiers == null) ? 0 : this.packageIdentifiers.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.hasAssociatedShipments == null) ? 0 : this.hasAssociatedShipments.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof AdditionalTrackingInfo)) {
			return false;
		}
		AdditionalTrackingInfo rhs = ((AdditionalTrackingInfo) other);
		return ((((Objects.equals(this.nickname, rhs.nickname)) && (Objects.equals(this.packageIdentifiers, rhs.packageIdentifiers))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.hasAssociatedShipments, rhs.hasAssociatedShipments)));
	}

}
