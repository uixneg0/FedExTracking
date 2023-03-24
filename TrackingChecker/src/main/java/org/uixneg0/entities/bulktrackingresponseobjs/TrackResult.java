package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"trackingNumberInfo",
		"error",
		"additionalTrackingInfo",
		"shipperInformation",
		"recipientInformation",
		"latestStatusDetail",
		"dateAndTimes",
		"availableImages",
		"packageDetails",
		"shipmentDetails",
		"scanEvents",
		"availableNotifications",
		"deliveryDetails",
		"originLocation",
		"lastUpdatedDestinationAddress",
		"serviceDetail",
		"standardTransitTimeWindow",
		"estimatedDeliveryTimeWindow",
		"goodsClassificationCode",
		"returnDetail",
		"serviceCommitMessage"
})

public class TrackResult {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("trackingNumberInfo")
	private TrackingNumberInfo trackingNumberInfo;
	@JsonProperty("error")
	private java.lang.Error error;
	@JsonProperty("additionalTrackingInfo")
	private AdditionalTrackingInfo additionalTrackingInfo;
	@JsonProperty("shipperInformation")
	private ShipperInformation shipperInformation;
	@JsonProperty("recipientInformation")
	private RecipientInformation recipientInformation;
	@JsonProperty("latestStatusDetail")
	private LatestStatusDetail latestStatusDetail;
	@JsonProperty("dateAndTimes")
	private List<DateAndTime> dateAndTimes = new ArrayList<DateAndTime>();
	@JsonProperty("availableImages")
	private List<AvailableImage> availableImages = new ArrayList<AvailableImage>();
	@JsonProperty("packageDetails")
	private PackageDetails packageDetails;
	@JsonProperty("shipmentDetails")
	private ShipmentDetails shipmentDetails;
	@JsonProperty("scanEvents")
	private List<ScanEvent> scanEvents = new ArrayList<ScanEvent>();
	@JsonProperty("availableNotifications")
	private List<String> availableNotifications = new ArrayList<String>();
	@JsonProperty("deliveryDetails")
	private DeliveryDetails deliveryDetails;
	@JsonProperty("originLocation")
	private OriginLocation originLocation;
	@JsonProperty("lastUpdatedDestinationAddress")
	private LastUpdatedDestinationAddress lastUpdatedDestinationAddress;
	@JsonProperty("serviceDetail")
	private ServiceDetail serviceDetail;
	@JsonProperty("standardTransitTimeWindow")
	private StandardTransitTimeWindow standardTransitTimeWindow;
	@JsonProperty("estimatedDeliveryTimeWindow")
	private EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow;
	@JsonProperty("goodsClassificationCode")
	private String goodsClassificationCode;
	@JsonProperty("returnDetail")
	private ReturnDetail returnDetail;
	@JsonProperty("serviceCommitMessage")
	private ServiceCommitMessage serviceCommitMessage;

	@JsonProperty("trackingNumberInfo")
	public TrackingNumberInfo getTrackingNumberInfo() {
		return trackingNumberInfo;
	}

	@JsonProperty("trackingNumberInfo")
	public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
		this.trackingNumberInfo = trackingNumberInfo;
	}

	public TrackResult withTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
		this.trackingNumberInfo = trackingNumberInfo;
		return this;
	}

	@JsonProperty("error")
	public java.lang.Error getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(java.lang.Error error) {
		this.error = error;
	}

	public TrackResult withError(java.lang.Error error) {
		this.error = error;
		return this;
	}

	@JsonProperty("additionalTrackingInfo")
	public AdditionalTrackingInfo getAdditionalTrackingInfo() {
		return additionalTrackingInfo;
	}

	@JsonProperty("additionalTrackingInfo")
	public void setAdditionalTrackingInfo(AdditionalTrackingInfo additionalTrackingInfo) {
		this.additionalTrackingInfo = additionalTrackingInfo;
	}

	public TrackResult withAdditionalTrackingInfo(AdditionalTrackingInfo additionalTrackingInfo) {
		this.additionalTrackingInfo = additionalTrackingInfo;
		return this;
	}

	@JsonProperty("shipperInformation")
	public ShipperInformation getShipperInformation() {
		return shipperInformation;
	}

	@JsonProperty("shipperInformation")
	public void setShipperInformation(ShipperInformation shipperInformation) {
		this.shipperInformation = shipperInformation;
	}

	public TrackResult withShipperInformation(ShipperInformation shipperInformation) {
		this.shipperInformation = shipperInformation;
		return this;
	}

	@JsonProperty("recipientInformation")
	public RecipientInformation getRecipientInformation() {
		return recipientInformation;
	}

	@JsonProperty("recipientInformation")
	public void setRecipientInformation(RecipientInformation recipientInformation) {
		this.recipientInformation = recipientInformation;
	}

	public TrackResult withRecipientInformation(RecipientInformation recipientInformation) {
		this.recipientInformation = recipientInformation;
		return this;
	}

	@JsonProperty("latestStatusDetail")
	public LatestStatusDetail getLatestStatusDetail() {
		return latestStatusDetail;
	}

	@JsonProperty("latestStatusDetail")
	public void setLatestStatusDetail(LatestStatusDetail latestStatusDetail) {
		this.latestStatusDetail = latestStatusDetail;
	}

	public TrackResult withLatestStatusDetail(LatestStatusDetail latestStatusDetail) {
		this.latestStatusDetail = latestStatusDetail;
		return this;
	}

	@JsonProperty("dateAndTimes")
	public List<DateAndTime> getDateAndTimes() {
		return dateAndTimes;
	}

	@JsonProperty("dateAndTimes")
	public void setDateAndTimes(List<DateAndTime> dateAndTimes) {
		this.dateAndTimes = dateAndTimes;
	}

	public TrackResult withDateAndTimes(List<DateAndTime> dateAndTimes) {
		this.dateAndTimes = dateAndTimes;
		return this;
	}

	@JsonProperty("availableImages")
	public List<AvailableImage> getAvailableImages() {
		return availableImages;
	}

	@JsonProperty("availableImages")
	public void setAvailableImages(List<AvailableImage> availableImages) {
		this.availableImages = availableImages;
	}

	public TrackResult withAvailableImages(List<AvailableImage> availableImages) {
		this.availableImages = availableImages;
		return this;
	}

	@JsonProperty("packageDetails")
	public PackageDetails getPackageDetails() {
		return packageDetails;
	}

	@JsonProperty("packageDetails")
	public void setPackageDetails(PackageDetails packageDetails) {
		this.packageDetails = packageDetails;
	}

	public TrackResult withPackageDetails(PackageDetails packageDetails) {
		this.packageDetails = packageDetails;
		return this;
	}

	@JsonProperty("shipmentDetails")
	public ShipmentDetails getShipmentDetails() {
		return shipmentDetails;
	}

	@JsonProperty("shipmentDetails")
	public void setShipmentDetails(ShipmentDetails shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
	}

	public TrackResult withShipmentDetails(ShipmentDetails shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
		return this;
	}

	@JsonProperty("scanEvents")
	public List<ScanEvent> getScanEvents() {
		return scanEvents;
	}

	@JsonProperty("scanEvents")
	public void setScanEvents(List<ScanEvent> scanEvents) {
		this.scanEvents = scanEvents;
	}

	public TrackResult withScanEvents(List<ScanEvent> scanEvents) {
		this.scanEvents = scanEvents;
		return this;
	}

	@JsonProperty("availableNotifications")
	public List<String> getAvailableNotifications() {
		return availableNotifications;
	}

	@JsonProperty("availableNotifications")
	public void setAvailableNotifications(List<String> availableNotifications) {
		this.availableNotifications = availableNotifications;
	}

	public TrackResult withAvailableNotifications(List<String> availableNotifications) {
		this.availableNotifications = availableNotifications;
		return this;
	}

	@JsonProperty("deliveryDetails")
	public DeliveryDetails getDeliveryDetails() {
		return deliveryDetails;
	}

	@JsonProperty("deliveryDetails")
	public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

	public TrackResult withDeliveryDetails(DeliveryDetails deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
		return this;
	}

	@JsonProperty("originLocation")
	public OriginLocation getOriginLocation() {
		return originLocation;
	}

	@JsonProperty("originLocation")
	public void setOriginLocation(OriginLocation originLocation) {
		this.originLocation = originLocation;
	}

	public TrackResult withOriginLocation(OriginLocation originLocation) {
		this.originLocation = originLocation;
		return this;
	}

	@JsonProperty("lastUpdatedDestinationAddress")
	public LastUpdatedDestinationAddress getLastUpdatedDestinationAddress() {
		return lastUpdatedDestinationAddress;
	}

	@JsonProperty("lastUpdatedDestinationAddress")
	public void setLastUpdatedDestinationAddress(LastUpdatedDestinationAddress lastUpdatedDestinationAddress) {
		this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
	}

	public TrackResult withLastUpdatedDestinationAddress(LastUpdatedDestinationAddress lastUpdatedDestinationAddress) {
		this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
		return this;
	}

	@JsonProperty("serviceDetail")
	public ServiceDetail getServiceDetail() {
		return serviceDetail;
	}

	@JsonProperty("serviceDetail")
	public void setServiceDetail(ServiceDetail serviceDetail) {
		this.serviceDetail = serviceDetail;
	}

	public TrackResult withServiceDetail(ServiceDetail serviceDetail) {
		this.serviceDetail = serviceDetail;
		return this;
	}

	@JsonProperty("standardTransitTimeWindow")
	public StandardTransitTimeWindow getStandardTransitTimeWindow() {
		return standardTransitTimeWindow;
	}

	@JsonProperty("standardTransitTimeWindow")
	public void setStandardTransitTimeWindow(StandardTransitTimeWindow standardTransitTimeWindow) {
		this.standardTransitTimeWindow = standardTransitTimeWindow;
	}

	public TrackResult withStandardTransitTimeWindow(StandardTransitTimeWindow standardTransitTimeWindow) {
		this.standardTransitTimeWindow = standardTransitTimeWindow;
		return this;
	}

	@JsonProperty("estimatedDeliveryTimeWindow")
	public EstimatedDeliveryTimeWindow getEstimatedDeliveryTimeWindow() {
		return estimatedDeliveryTimeWindow;
	}

	@JsonProperty("estimatedDeliveryTimeWindow")
	public void setEstimatedDeliveryTimeWindow(EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow) {
		this.estimatedDeliveryTimeWindow = estimatedDeliveryTimeWindow;
	}

	public TrackResult withEstimatedDeliveryTimeWindow(EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow) {
		this.estimatedDeliveryTimeWindow = estimatedDeliveryTimeWindow;
		return this;
	}

	@JsonProperty("goodsClassificationCode")
	public String getGoodsClassificationCode() {
		return goodsClassificationCode;
	}

	@JsonProperty("goodsClassificationCode")
	public void setGoodsClassificationCode(String goodsClassificationCode) {
		this.goodsClassificationCode = goodsClassificationCode;
	}

	public TrackResult withGoodsClassificationCode(String goodsClassificationCode) {
		this.goodsClassificationCode = goodsClassificationCode;
		return this;
	}

	@JsonProperty("returnDetail")
	public ReturnDetail getReturnDetail() {
		return returnDetail;
	}

	@JsonProperty("returnDetail")
	public void setReturnDetail(ReturnDetail returnDetail) {
		this.returnDetail = returnDetail;
	}

	public TrackResult withReturnDetail(ReturnDetail returnDetail) {
		this.returnDetail = returnDetail;
		return this;
	}

	@JsonProperty("serviceCommitMessage")
	public ServiceCommitMessage getServiceCommitMessage() {
		return serviceCommitMessage;
	}

	@JsonProperty("serviceCommitMessage")
	public void setServiceCommitMessage(ServiceCommitMessage serviceCommitMessage) {
		this.serviceCommitMessage = serviceCommitMessage;
	}

	public TrackResult withServiceCommitMessage(ServiceCommitMessage serviceCommitMessage) {
		this.serviceCommitMessage = serviceCommitMessage;
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

	public TrackResult withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TrackResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("trackingNumberInfo");
		sb.append('=');
		sb.append(((this.trackingNumberInfo == null) ? "<null>" : this.trackingNumberInfo));
		sb.append(',');
		sb.append("error");
		sb.append('=');
		sb.append(((this.error == null) ? "<null>" : this.error));
		sb.append(',');
		sb.append("additionalTrackingInfo");
		sb.append('=');
		sb.append(((this.additionalTrackingInfo == null) ? "<null>" : this.additionalTrackingInfo));
		sb.append(',');
		sb.append("shipperInformation");
		sb.append('=');
		sb.append(((this.shipperInformation == null) ? "<null>" : this.shipperInformation));
		sb.append(',');
		sb.append("recipientInformation");
		sb.append('=');
		sb.append(((this.recipientInformation == null) ? "<null>" : this.recipientInformation));
		sb.append(',');
		sb.append("latestStatusDetail");
		sb.append('=');
		sb.append(((this.latestStatusDetail == null) ? "<null>" : this.latestStatusDetail));
		sb.append(',');
		sb.append("dateAndTimes");
		sb.append('=');
		sb.append(((this.dateAndTimes == null) ? "<null>" : this.dateAndTimes));
		sb.append(',');
		sb.append("availableImages");
		sb.append('=');
		sb.append(((this.availableImages == null) ? "<null>" : this.availableImages));
		sb.append(',');
		sb.append("packageDetails");
		sb.append('=');
		sb.append(((this.packageDetails == null) ? "<null>" : this.packageDetails));
		sb.append(',');
		sb.append("shipmentDetails");
		sb.append('=');
		sb.append(((this.shipmentDetails == null) ? "<null>" : this.shipmentDetails));
		sb.append(',');
		sb.append("scanEvents");
		sb.append('=');
		sb.append(((this.scanEvents == null) ? "<null>" : this.scanEvents));
		sb.append(',');
		sb.append("availableNotifications");
		sb.append('=');
		sb.append(((this.availableNotifications == null) ? "<null>" : this.availableNotifications));
		sb.append(',');
		sb.append("deliveryDetails");
		sb.append('=');
		sb.append(((this.deliveryDetails == null) ? "<null>" : this.deliveryDetails));
		sb.append(',');
		sb.append("originLocation");
		sb.append('=');
		sb.append(((this.originLocation == null) ? "<null>" : this.originLocation));
		sb.append(',');
		sb.append("lastUpdatedDestinationAddress");
		sb.append('=');
		sb.append(((this.lastUpdatedDestinationAddress == null) ? "<null>" : this.lastUpdatedDestinationAddress));
		sb.append(',');
		sb.append("serviceDetail");
		sb.append('=');
		sb.append(((this.serviceDetail == null) ? "<null>" : this.serviceDetail));
		sb.append(',');
		sb.append("standardTransitTimeWindow");
		sb.append('=');
		sb.append(((this.standardTransitTimeWindow == null) ? "<null>" : this.standardTransitTimeWindow));
		sb.append(',');
		sb.append("estimatedDeliveryTimeWindow");
		sb.append('=');
		sb.append(((this.estimatedDeliveryTimeWindow == null) ? "<null>" : this.estimatedDeliveryTimeWindow));
		sb.append(',');
		sb.append("goodsClassificationCode");
		sb.append('=');
		sb.append(((this.goodsClassificationCode == null) ? "<null>" : this.goodsClassificationCode));
		sb.append(',');
		sb.append("returnDetail");
		sb.append('=');
		sb.append(((this.returnDetail == null) ? "<null>" : this.returnDetail));
		sb.append(',');
		sb.append("serviceCommitMessage");
		sb.append('=');
		sb.append(((this.serviceCommitMessage == null) ? "<null>" : this.serviceCommitMessage));
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
		result = ((result * 31) + ((this.packageDetails == null) ? 0 : this.packageDetails.hashCode()));
		result = ((result * 31) + ((this.goodsClassificationCode == null) ? 0 : this.goodsClassificationCode.hashCode()));
		result = ((result * 31) + ((this.returnDetail == null) ? 0 : this.returnDetail.hashCode()));
		result = ((result * 31) + ((this.serviceDetail == null) ? 0 : this.serviceDetail.hashCode()));
		result = ((result * 31) + ((this.serviceCommitMessage == null) ? 0 : this.serviceCommitMessage.hashCode()));
		result = ((result * 31) + ((this.error == null) ? 0 : this.error.hashCode()));
		result = ((result * 31) + ((this.estimatedDeliveryTimeWindow == null) ? 0 : this.estimatedDeliveryTimeWindow.hashCode()));
		result = ((result * 31) + ((this.latestStatusDetail == null) ? 0 : this.latestStatusDetail.hashCode()));
		result = ((result * 31) + ((this.originLocation == null) ? 0 : this.originLocation.hashCode()));
		result = ((result * 31) + ((this.recipientInformation == null) ? 0 : this.recipientInformation.hashCode()));
		result = ((result * 31) + ((this.standardTransitTimeWindow == null) ? 0 : this.standardTransitTimeWindow.hashCode()));
		result = ((result * 31) + ((this.additionalTrackingInfo == null) ? 0 : this.additionalTrackingInfo.hashCode()));
		result = ((result * 31) + ((this.shipmentDetails == null) ? 0 : this.shipmentDetails.hashCode()));
		result = ((result * 31) + ((this.availableImages == null) ? 0 : this.availableImages.hashCode()));
		result = ((result * 31) + ((this.scanEvents == null) ? 0 : this.scanEvents.hashCode()));
		result = ((result * 31) + ((this.availableNotifications == null) ? 0 : this.availableNotifications.hashCode()));
		result = ((result * 31) + ((this.deliveryDetails == null) ? 0 : this.deliveryDetails.hashCode()));
		result = ((result * 31) + ((this.shipperInformation == null) ? 0 : this.shipperInformation.hashCode()));
		result = ((result * 31) + ((this.trackingNumberInfo == null) ? 0 : this.trackingNumberInfo.hashCode()));
		result = ((result * 31) + ((this.lastUpdatedDestinationAddress == null) ? 0 : this.lastUpdatedDestinationAddress.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.dateAndTimes == null) ? 0 : this.dateAndTimes.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof TrackResult)) {
			return false;
		}
		TrackResult rhs = ((TrackResult) other);
		return ((((((((((((((((((((((Objects.equals(this.packageDetails, rhs.packageDetails)) && (Objects.equals(this.goodsClassificationCode, rhs.goodsClassificationCode))) && (Objects.equals(this.returnDetail, rhs.returnDetail))) && (Objects.equals(this.serviceDetail, rhs.serviceDetail))) && (Objects.equals(this.serviceCommitMessage, rhs.serviceCommitMessage))) && (Objects.equals(this.error, rhs.error))) && (Objects.equals(this.estimatedDeliveryTimeWindow, rhs.estimatedDeliveryTimeWindow))) && (Objects.equals(this.latestStatusDetail, rhs.latestStatusDetail))) && (Objects.equals(this.originLocation, rhs.originLocation))) && (Objects.equals(this.recipientInformation, rhs.recipientInformation))) && (Objects.equals(this.standardTransitTimeWindow, rhs.standardTransitTimeWindow))) && (Objects.equals(this.additionalTrackingInfo, rhs.additionalTrackingInfo))) && (Objects.equals(this.shipmentDetails, rhs.shipmentDetails))) && (Objects.equals(this.availableImages, rhs.availableImages))) && (Objects.equals(this.scanEvents, rhs.scanEvents))) && (Objects.equals(this.availableNotifications, rhs.availableNotifications))) && (Objects.equals(this.deliveryDetails, rhs.deliveryDetails))) && (Objects.equals(this.shipperInformation, rhs.shipperInformation))) && (Objects.equals(this.trackingNumberInfo, rhs.trackingNumberInfo))) && (Objects.equals(this.lastUpdatedDestinationAddress, rhs.lastUpdatedDestinationAddress))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.dateAndTimes, rhs.dateAndTimes)));
	}

}
