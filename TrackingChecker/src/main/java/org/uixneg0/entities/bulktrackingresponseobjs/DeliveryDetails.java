package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"actualDeliveryAddress",
		"deliveryAttempts",
		"receivedByName",
		"deliveryOptionEligibilityDetails",
		"destinationServiceArea"
})
public class DeliveryDetails {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("actualDeliveryAddress")
	private ActualDeliveryAddress actualDeliveryAddress;
	@JsonProperty("deliveryAttempts")
	private String deliveryAttempts;
	@JsonProperty("receivedByName")
	private String receivedByName;
	@JsonProperty("deliveryOptionEligibilityDetails")
	private List<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails = new ArrayList<DeliveryOptionEligibilityDetail>();
	@JsonProperty("destinationServiceArea")
	private String destinationServiceArea;

	@JsonProperty("actualDeliveryAddress")
	public ActualDeliveryAddress getActualDeliveryAddress() {
		return actualDeliveryAddress;
	}

	@JsonProperty("actualDeliveryAddress")
	public void setActualDeliveryAddress(ActualDeliveryAddress actualDeliveryAddress) {
		this.actualDeliveryAddress = actualDeliveryAddress;
	}

	public DeliveryDetails withActualDeliveryAddress(ActualDeliveryAddress actualDeliveryAddress) {
		this.actualDeliveryAddress = actualDeliveryAddress;
		return this;
	}

	@JsonProperty("deliveryAttempts")
	public String getDeliveryAttempts() {
		return deliveryAttempts;
	}

	@JsonProperty("deliveryAttempts")
	public void setDeliveryAttempts(String deliveryAttempts) {
		this.deliveryAttempts = deliveryAttempts;
	}

	public DeliveryDetails withDeliveryAttempts(String deliveryAttempts) {
		this.deliveryAttempts = deliveryAttempts;
		return this;
	}

	@JsonProperty("receivedByName")
	public String getReceivedByName() {
		return receivedByName;
	}

	@JsonProperty("receivedByName")
	public void setReceivedByName(String receivedByName) {
		this.receivedByName = receivedByName;
	}

	public DeliveryDetails withReceivedByName(String receivedByName) {
		this.receivedByName = receivedByName;
		return this;
	}

	@JsonProperty("deliveryOptionEligibilityDetails")
	public List<DeliveryOptionEligibilityDetail> getDeliveryOptionEligibilityDetails() {
		return deliveryOptionEligibilityDetails;
	}

	@JsonProperty("deliveryOptionEligibilityDetails")
	public void setDeliveryOptionEligibilityDetails(List<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails) {
		this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
	}

	public DeliveryDetails withDeliveryOptionEligibilityDetails(List<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails) {
		this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
		return this;
	}

	@JsonProperty("destinationServiceArea")
	public String getDestinationServiceArea() {
		return destinationServiceArea;
	}

	@JsonProperty("destinationServiceArea")
	public void setDestinationServiceArea(String destinationServiceArea) {
		this.destinationServiceArea = destinationServiceArea;
	}

	public DeliveryDetails withDestinationServiceArea(String destinationServiceArea) {
		this.destinationServiceArea = destinationServiceArea;
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

	public DeliveryDetails withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(DeliveryDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("actualDeliveryAddress");
		sb.append('=');
		sb.append(((this.actualDeliveryAddress == null) ? "<null>" : this.actualDeliveryAddress));
		sb.append(',');
		sb.append("deliveryAttempts");
		sb.append('=');
		sb.append(((this.deliveryAttempts == null) ? "<null>" : this.deliveryAttempts));
		sb.append(',');
		sb.append("receivedByName");
		sb.append('=');
		sb.append(((this.receivedByName == null) ? "<null>" : this.receivedByName));
		sb.append(',');
		sb.append("deliveryOptionEligibilityDetails");
		sb.append('=');
		sb.append(((this.deliveryOptionEligibilityDetails == null) ? "<null>" : this.deliveryOptionEligibilityDetails));
		sb.append(',');
		sb.append("destinationServiceArea");
		sb.append('=');
		sb.append(((this.destinationServiceArea == null) ? "<null>" : this.destinationServiceArea));
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
		result = ((result * 31) + ((this.receivedByName == null) ? 0 : this.receivedByName.hashCode()));
		result = ((result * 31) + ((this.actualDeliveryAddress == null) ? 0 : this.actualDeliveryAddress.hashCode()));
		result = ((result * 31) + ((this.deliveryOptionEligibilityDetails == null) ? 0 : this.deliveryOptionEligibilityDetails.hashCode()));
		result = ((result * 31) + ((this.destinationServiceArea == null) ? 0 : this.destinationServiceArea.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.deliveryAttempts == null) ? 0 : this.deliveryAttempts.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof DeliveryDetails)) {
			return false;
		}
		DeliveryDetails rhs = ((DeliveryDetails) other);
		return ((((((Objects.equals(this.receivedByName, rhs.receivedByName)) && (Objects.equals(this.actualDeliveryAddress, rhs.actualDeliveryAddress))) && (Objects.equals(this.deliveryOptionEligibilityDetails, rhs.deliveryOptionEligibilityDetails))) && (Objects.equals(this.destinationServiceArea, rhs.destinationServiceArea))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.deliveryAttempts, rhs.deliveryAttempts)));
	}

}
