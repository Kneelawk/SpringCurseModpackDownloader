
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "url",
    "projectId",
    "id",
    "projectTitleId",
    "projectTitleTitle",
    "userId",
    "twitchId"
})
public class AuthorJson {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("projectId")
    private long projectId;
    @JsonProperty("id")
    private long id;
    @JsonProperty("projectTitleId")
    private long projectTitleId;
    @JsonProperty("projectTitleTitle")
    private String projectTitleTitle;
    @JsonProperty("userId")
    private long userId;
    @JsonProperty("twitchId")
    private long twitchId;

    public AuthorJson() {
    }

    private AuthorJson(String name, String url, long projectId, long id, long projectTitleId,
                       String projectTitleTitle, long userId, long twitchId) {
        this.name = name;
        this.url = url;
        this.projectId = projectId;
        this.id = id;
        this.projectTitleId = projectTitleId;
        this.projectTitleTitle = projectTitleTitle;
        this.userId = userId;
        this.twitchId = twitchId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public long getProjectId() {
        return projectId;
    }

    public long getId() {
        return id;
    }

    public long getProjectTitleId() {
        return projectTitleId;
    }

    public String getProjectTitleTitle() {
        return projectTitleTitle;
    }

    public long getUserId() {
        return userId;
    }

    public long getTwitchId() {
        return twitchId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("url", url)
                .append("projectId", projectId)
                .append("id", id)
                .append("projectTitleId", projectTitleId)
                .append("projectTitleTitle", projectTitleTitle)
                .append("userId", userId)
                .append("twitchId", twitchId)
                .toString();
    }

    public static AuthorJson create(String name, String url, long projectId, long id,
                                    long projectTitleId, String projectTitleTitle, long userId,
                                    long twitchId) {
        if (name == null)
            throw new NullPointerException("Name cannot be null");
        if (url == null)
            throw new NullPointerException("Url cannot be null");
        if (projectTitleTitle == null)
            throw new NullPointerException("ProjectTitleTitle cannot be null");
        return new AuthorJson(name, url, projectId, id, projectTitleId, projectTitleTitle, userId, twitchId);
    }

    public static class Builder {
        private String name;
        private String url;
        private long projectId;
        private long id;
        private long projectTitleId;
        private String projectTitleTitle;
        private long userId;
        private long twitchId;

        public Builder() {
        }

        public Builder(String name, String url, long projectId, long id, long projectTitleId,
                       String projectTitleTitle, long userId, long twitchId) {
            this.name = name;
            this.url = url;
            this.projectId = projectId;
            this.id = id;
            this.projectTitleId = projectTitleId;
            this.projectTitleTitle = projectTitleTitle;
            this.userId = userId;
            this.twitchId = twitchId;
        }

        public AuthorJson build() {
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (url == null)
                throw new IllegalStateException("No url specified");
            if (projectTitleTitle == null)
                throw new IllegalStateException("No projectTitleTitle specified");
            return new AuthorJson(name, url, projectId, id, projectTitleId, projectTitleTitle, userId, twitchId);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public long getProjectId() {
            return projectId;
        }

        public Builder setProjectId(long projectId) {
            this.projectId = projectId;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public long getProjectTitleId() {
            return projectTitleId;
        }

        public Builder setProjectTitleId(long projectTitleId) {
            this.projectTitleId = projectTitleId;
            return this;
        }

        public String getProjectTitleTitle() {
            return projectTitleTitle;
        }

        public Builder setProjectTitleTitle(String projectTitleTitle) {
            this.projectTitleTitle = projectTitleTitle;
            return this;
        }

        public long getUserId() {
            return userId;
        }

        public Builder setUserId(long userId) {
            this.userId = userId;
            return this;
        }

        public long getTwitchId() {
            return twitchId;
        }

        public Builder setTwitchId(long twitchId) {
            this.twitchId = twitchId;
            return this;
        }
    }
}
