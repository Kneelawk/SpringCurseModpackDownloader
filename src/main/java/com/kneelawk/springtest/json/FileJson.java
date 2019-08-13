
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "projectID",
    "fileID",
    "required"
})
public class FileJson {

    @JsonProperty("projectID")
    private long projectID;
    @JsonProperty("fileID")
    private long fileID;
    @JsonProperty("required")
    private boolean required;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileJson() {
    }

    private FileJson(long projectID, long fileID, boolean required) {
        this.projectID = projectID;
        this.fileID = fileID;
        this.required = required;
    }

    public long getProjectID() {
        return projectID;
    }

    public long getFileID() {
        return fileID;
    }

    public boolean isRequired() {
        return required;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("projectID", projectID)
                .append("fileID", fileID)
                .append("required", required)
                .toString();
    }

    public static FileJson create(long projectID, long fileID, boolean required) {
        return new FileJson(projectID, fileID, required);
    }

    public static class Builder {
        private long projectID;
        private long fileID;
        private boolean required;

        public Builder() {
        }

        public Builder(long projectID, long fileID, boolean required) {
            this.projectID = projectID;
            this.fileID = fileID;
            this.required = required;
        }

        public FileJson build() {
            return new FileJson(projectID, fileID, required);
        }

        public long getProjectID() {
            return projectID;
        }

        public Builder setProjectID(long projectID) {
            this.projectID = projectID;
            return this;
        }

        public long getFileID() {
            return fileID;
        }

        public Builder setFileID(long fileID) {
            this.fileID = fileID;
            return this;
        }

        public boolean isRequired() {
            return required;
        }

        public Builder setRequired(boolean required) {
            this.required = required;
            return this;
        }
    }
}
