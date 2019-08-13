
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "projectId",
        "description",
        "isDefault",
        "thumbnailUrl",
        "title",
        "url",
        "status"
})
public class AttachmentJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("projectId")
    private long projectId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isDefault")
    private boolean isDefault;
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("status")
    private long status;

    public AttachmentJson() {
    }

    private AttachmentJson(long id, long projectId, String description, boolean isDefault, String thumbnailUrl,
                           String title, String url, long status) {
        this.id = id;
        this.projectId = projectId;
        this.description = description;
        this.isDefault = isDefault;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.url = url;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public long getProjectId() {
        return projectId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public long getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("projectId", projectId)
                .append("description", description)
                .append("isDefault", isDefault)
                .append("thumbnailUrl", thumbnailUrl)
                .append("title", title)
                .append("url", url)
                .append("status", status)
                .toString();
    }

    public static AttachmentJson create(long id, long projectId, String description, boolean isDefault,
                                        String thumbnailUrl, String title, String url,
                                        long status) {
        if (description == null)
            throw new NullPointerException("Description cannot be null");
        if (thumbnailUrl == null)
            throw new NullPointerException("ThumbnailUrl cannot be null");
        if (title == null)
            throw new NullPointerException("Title cannot be null");
        if (url == null)
            throw new NullPointerException("Url cannot be null");
        return new AttachmentJson(id, projectId, description, isDefault, thumbnailUrl, title, url, status);
    }

    public static class Builder {
        private long id;
        private long projectId;
        private String description;
        private boolean isDefault;
        private String thumbnailUrl;
        private String title;
        private String url;
        private long status;

        public Builder() {
        }

        public Builder(long id, long projectId, String description, boolean isDefault,
                       String thumbnailUrl, String title, String url, long status) {
            this.id = id;
            this.projectId = projectId;
            this.description = description;
            this.isDefault = isDefault;
            this.thumbnailUrl = thumbnailUrl;
            this.title = title;
            this.url = url;
            this.status = status;
        }

        public AttachmentJson build() {
            if (description == null)
                throw new IllegalStateException("No description specified");
            if (thumbnailUrl == null)
                throw new IllegalStateException("No thumbnailUrl specified");
            if (title == null)
                throw new IllegalStateException("No title specified");
            if (url == null)
                throw new IllegalStateException("No url specified");
            return new AttachmentJson(id, projectId, description, isDefault, thumbnailUrl, title, url, status);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public long getProjectId() {
            return projectId;
        }

        public Builder setProjectId(long projectId) {
            this.projectId = projectId;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public boolean isDefault() {
            return isDefault;
        }

        public Builder setDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public long getStatus() {
            return status;
        }

        public Builder setStatus(long status) {
            this.status = status;
            return this;
        }
    }
}
