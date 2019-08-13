
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "addonId",
    "type",
    "fileId"
})
public class DependencyJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("addonId")
    private long addonId;
    @JsonProperty("type")
    private long type;
    @JsonProperty("fileId")
    private long fileId;

    public DependencyJson() {
    }

    private DependencyJson(long id, long addonId, long type, long fileId) {
        this.id = id;
        this.addonId = addonId;
        this.type = type;
        this.fileId = fileId;
    }

    public long getId() {
        return id;
    }

    public long getAddonId() {
        return addonId;
    }

    public long getType() {
        return type;
    }

    public long getFileId() {
        return fileId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("addonId", addonId)
                .append("type", type)
                .append("fileId", fileId)
                .toString();
    }

    public static DependencyJson create(long id, long addonId, long type, long fileId) {
        return new DependencyJson(id, addonId, type, fileId);
    }

    public static class Builder {
        private long id;
        private long addonId;
        private long type;
        private long fileId;

        public Builder() {
        }

        public Builder(long id, long addonId, long type, long fileId) {
            this.id = id;
            this.addonId = addonId;
            this.type = type;
            this.fileId = fileId;
        }

        public DependencyJson build() {
            return new DependencyJson(id, addonId, type, fileId);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public long getAddonId() {
            return addonId;
        }

        public Builder setAddonId(long addonId) {
            this.addonId = addonId;
            return this;
        }

        public long getType() {
            return type;
        }

        public Builder setType(long type) {
            this.type = type;
            return this;
        }

        public long getFileId() {
            return fileId;
        }

        public Builder setFileId(long fileId) {
            this.fileId = fileId;
            return this;
        }
    }
}
