package org.opensrp.dto.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class MultimediaDTO {
	
	@JsonProperty
	private String caseId;
	
	@JsonProperty
	private String providerId;
	
	@JsonProperty
	private String contentType;
	
	@JsonProperty
	private String filePath;
	
	@JsonProperty
	private String fileCategory;

	@JsonProperty
	private Date dateUploaded = new Date();

	@JsonProperty
	private String summary;

	@JsonProperty
	private String originalFileName;
	
	public MultimediaDTO() {
		
	}
	
	public MultimediaDTO(String caseId, String providerId, String contentType, String filePath, String fileCategory) {
		this.caseId = caseId;
		this.providerId = providerId;
		this.contentType = contentType;
		this.filePath = filePath;
		this.fileCategory = fileCategory;
	}
	
	public String getCaseId() {
		return this.caseId;
	}
	
	public String getProviderId() {
		return this.providerId;
	}
	
	public String getContentType() {
		return this.contentType;
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	
	public String getFileCategory() {
		return this.fileCategory;
	}

	public Date getDateUploaded() {
		return dateUploaded;
	}

	public String getSummary() {
		return summary;
	}

	public String getOriginalFileName() {
		return originalFileName;
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
	
	public MultimediaDTO withFilePath(String filePath) {
		this.filePath = filePath;
		return this;
	}

	public MultimediaDTO withDateUploaded(Date dateUploaded) {
		this.dateUploaded = dateUploaded;
		return this;
	}

	public MultimediaDTO withSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public MultimediaDTO withOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
		return this;
	}
	
}
