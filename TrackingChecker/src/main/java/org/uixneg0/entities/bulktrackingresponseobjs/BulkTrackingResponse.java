package org.uixneg0.entities.bulktrackingresponseobjs;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"transactionId",
		"output"
})

public class BulkTrackingResponse {

	@JsonIgnore
	private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("transactionId")
	private String transactionId;
	@JsonProperty("output")
	private Output output;

	@JsonProperty("transactionId")
	public String getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BulkTrackingResponse withTransactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	@JsonProperty("output")
	public Output getOutput() {
		return output;
	}

	@JsonProperty("output")
	public void setOutput(Output output) {
		this.output = output;
	}

	public BulkTrackingResponse withOutput(Output output) {
		this.output = output;
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

	public BulkTrackingResponse withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(BulkTrackingResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("transactionId");
		sb.append('=');
		sb.append(((this.transactionId == null) ? "<null>" : this.transactionId));
		sb.append(',');
		sb.append("output");
		sb.append('=');
		sb.append(((this.output == null) ? "<null>" : this.output));
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
		result = ((result * 31) + ((this.output == null) ? 0 : this.output.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.transactionId == null) ? 0 : this.transactionId.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof BulkTrackingResponse)) {
			return false;
		}
		BulkTrackingResponse rhs = ((BulkTrackingResponse) other);
		return (((Objects.equals(this.output, rhs.output)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.transactionId, rhs.transactionId)));
	}

	public List<CompleteTrackResult> getCompleteTrackResults() {
		Output output = this.getOutput();
		if (output == null) return null;
		return output.getCompleteTrackResults();
	}

}
