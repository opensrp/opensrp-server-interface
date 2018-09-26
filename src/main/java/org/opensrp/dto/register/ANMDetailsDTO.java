package org.opensrp.dto.register;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

public class ANMDetailsDTO {
	
	@JsonProperty
	private List<ANMDetailDTO> anmDetails;
	
	public ANMDetailsDTO(List<ANMDetailDTO> anmDetails) {
		this.anmDetails = anmDetails;
	}
	
	public List<ANMDetailDTO> getAnmDetails() {
		return anmDetails;
	}
	
	@Override
	public final boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
