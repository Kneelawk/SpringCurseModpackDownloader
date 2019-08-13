
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categoryId",
    "name",
    "url",
    "avatarUrl",
    "parentId",
    "rootId",
    "projectId",
    "avatarId",
    "gameId"
})
public class CategoryJson {

    @JsonProperty("categoryId")
    private long categoryId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    @JsonProperty("parentId")
    private long parentId;
    @JsonProperty("rootId")
    private long rootId;
    @JsonProperty("projectId")
    private long projectId;
    @JsonProperty("avatarId")
    private long avatarId;
    @JsonProperty("gameId")
    private long gameId;

    public CategoryJson() {
    }

    private CategoryJson(long categoryId, String name, String url, String avatarUrl, long parentId, long rootId,
                         long projectId, long avatarId, long gameId) {
        this.categoryId = categoryId;
        this.name = name;
        this.url = url;
        this.avatarUrl = avatarUrl;
        this.parentId = parentId;
        this.rootId = rootId;
        this.projectId = projectId;
        this.avatarId = avatarId;
        this.gameId = gameId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public long getParentId() {
        return parentId;
    }

    public long getRootId() {
        return rootId;
    }

    public long getProjectId() {
        return projectId;
    }

    public long getAvatarId() {
        return avatarId;
    }

    public long getGameId() {
        return gameId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("categoryId", categoryId)
                .append("name", name)
                .append("url", url)
                .append("avatarUrl", avatarUrl)
                .append("parentId", parentId)
                .append("rootId", rootId)
                .append("projectId", projectId)
                .append("avatarId", avatarId)
                .append("gameId", gameId)
                .toString();
    }

    public static CategoryJson create(long categoryId, String name, String url,
                                      String avatarUrl, long parentId, long rootId, long projectId,
                                      long avatarId, long gameId) {
        if (name == null)
            throw new NullPointerException("Name cannot be null");
        if (url == null)
            throw new NullPointerException("Url cannot be null");
        if (avatarUrl == null)
            throw new NullPointerException("AvatarUrl cannot be null");
        return new CategoryJson(categoryId, name, url, avatarUrl, parentId, rootId, projectId, avatarId, gameId);
    }

    public static class Builder {
        private long categoryId;
        private String name;
        private String url;
        private String avatarUrl;
        private long parentId;
        private long rootId;
        private long projectId;
        private long avatarId;
        private long gameId;

        public Builder() {
        }

        public Builder(long categoryId, String name, String url, String avatarUrl,
                       long parentId, long rootId, long projectId, long avatarId, long gameId) {
            this.categoryId = categoryId;
            this.name = name;
            this.url = url;
            this.avatarUrl = avatarUrl;
            this.parentId = parentId;
            this.rootId = rootId;
            this.projectId = projectId;
            this.avatarId = avatarId;
            this.gameId = gameId;
        }

        public CategoryJson build() {
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (url == null)
                throw new IllegalStateException("No url specified");
            if (avatarUrl == null)
                throw new IllegalStateException("No avatarUrl specified");
            return new CategoryJson(categoryId, name, url, avatarUrl, parentId, rootId, projectId, avatarId, gameId);
        }

        public long getCategoryId() {
            return categoryId;
        }

        public Builder setCategoryId(long categoryId) {
            this.categoryId = categoryId;
            return this;
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

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public Builder setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public long getParentId() {
            return parentId;
        }

        public Builder setParentId(long parentId) {
            this.parentId = parentId;
            return this;
        }

        public long getRootId() {
            return rootId;
        }

        public Builder setRootId(long rootId) {
            this.rootId = rootId;
            return this;
        }

        public long getProjectId() {
            return projectId;
        }

        public Builder setProjectId(long projectId) {
            this.projectId = projectId;
            return this;
        }

        public long getAvatarId() {
            return avatarId;
        }

        public Builder setAvatarId(long avatarId) {
            this.avatarId = avatarId;
            return this;
        }

        public long getGameId() {
            return gameId;
        }

        public Builder setGameId(long gameId) {
            this.gameId = gameId;
            return this;
        }
    }
}
