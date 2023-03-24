package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"weight",
		"dimensions"
})

public class WeightAndDimensions {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("weight")
	private List<Weight> weight = new ArrayList<Weight>();
	@JsonProperty("dimensions")
	private List<Dimension> dimensions = new ArrayList<Dimension>();

	@JsonProperty("weight")
	public List<Weight> getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(List<Weight> weight) {
		this.weight = weight;
	}

	public WeightAndDimensions withWeight(List<Weight> weight) {
		this.weight = weight;
		return this;
	}

	@JsonProperty("dimensions")
	public List<Dimension> getDimensions() {
		return dimensions;
	}

	@JsonProperty("dimensions")
	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
	}

	public WeightAndDimensions withDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
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

	public WeightAndDimensions withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(WeightAndDimensions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("weight");
		sb.append('=');
		sb.append(((this.weight == null) ? "<null>" : this.weight));
		sb.append(',');
		sb.append("dimensions");
		sb.append('=');
		sb.append(((this.dimensions == null) ? "<null>" : this.dimensions));
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
		result = ((result * 31) + ((this.weight == null) ? 0 : this.weight.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.dimensions == null) ? 0 : this.dimensions.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof WeightAndDimensions)) {
			return false;
		}
		WeightAndDimensions rhs = ((WeightAndDimensions) other);
		return (((Objects.equals(this.weight, rhs.weight)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.dimensions, rhs.dimensions)));
	}

}
