
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "gameId",
    "name",
    "packageType",
    "path",
    "initialInclusionPattern",
    "extraIncludePattern",
    "gameCategoryId"
})
public class CategorySectionJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("gameId")
    private long gameId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("packageType")
    private long packageType;
    @JsonProperty("path")
    private String path;
    @JsonProperty("initialInclusionPattern")
    private String initialInclusionPattern;
    @JsonProperty("extraIncludePattern")
    private Object extraIncludePattern;
    @JsonProperty("gameCategoryId")
    private long gameCategoryId;

    public CategorySectionJson() {
    }

    private CategorySectionJson(long id, long gameId, String name, long packageType, String path,
                                String initialInclusionPattern, Object extraIncludePattern, long gameCategoryId) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.packageType = packageType;
        this.path = path;
        this.initialInclusionPattern = initialInclusionPattern;
        this.extraIncludePattern = extraIncludePattern;
        this.gameCategoryId = gameCategoryId;
    }

    public long getId() {
        return id;
    }

    public long getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public long getPackageType() {
        return packageType;
    }

    public String getPath() {
        return path;
    }

    public String getInitialInclusionPattern() {
        return initialInclusionPattern;
    }

    public Object getExtraIncludePattern() {
        return extraIncludePattern;
    }

    public long getGameCategoryId() {
        return gameCategoryId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("gameId", gameId)
                .append("name", name)
                .append("packageType", packageType)
                .append("path", path)
                .append("initialInclusionPattern", initialInclusionPattern)
                .append("extraIncludePattern", extraIncludePattern)
                .append("gameCategoryId", gameCategoryId)
                .toString();
    }

    public static CategorySectionJson create(long id, long gameId, String name, long packageType,
                                             String path, String initialInclusionPattern,
                                             Object extraIncludePattern, long gameCategoryId) {
        if (name == null)
            throw new NullPointerException("Name cannot be null");
        if (path == null)
            throw new NullPointerException("Path cannot be null");
        if (initialInclusionPattern == null)
            throw new NullPointerException("InitialInclusionPattern cannot be null");
        if (extraIncludePattern == null)
            throw new NullPointerException("ExtraIncludePattern cannot be null");
        return new CategorySectionJson(id, gameId, name, packageType, path, initialInclusionPattern,
                extraIncludePattern, gameCategoryId);
    }

    public static class Builder {
        private long id;
        private long gameId;
        private String name;
        private long packageType;
        private String path;
        private String initialInclusionPattern;
        private Object extraIncludePattern;
        private long gameCategoryId;

        public Builder() {
        }

        public Builder(long id, long gameId, String name, long packageType, String path,
                       String initialInclusionPattern, Object extraIncludePattern,
                       long gameCategoryId) {
            this.id = id;
            this.gameId = gameId;
            this.name = name;
            this.packageType = packageType;
            this.path = path;
            this.initialInclusionPattern = initialInclusionPattern;
            this.extraIncludePattern = extraIncludePattern;
            this.gameCategoryId = gameCategoryId;
        }

        public CategorySectionJson build() {
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (path == null)
                throw new IllegalStateException("No path specified");
            if (initialInclusionPattern == null)
                throw new IllegalStateException("No initialInclusionPattern specified");
            if (extraIncludePattern == null)
                throw new IllegalStateException("No extraIncludePattern specified");
            return new CategorySectionJson(id, gameId, name, packageType, path, initialInclusionPattern,
                    extraIncludePattern, gameCategoryId);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public long getGameId() {
            return gameId;
        }

        public Builder setGameId(long gameId) {
            this.gameId = gameId;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public long getPackageType() {
            return packageType;
        }

        public Builder setPackageType(long packageType) {
            this.packageType = packageType;
            return this;
        }

        public String getPath() {
            return path;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public String getInitialInclusionPattern() {
            return initialInclusionPattern;
        }

        public Builder setInitialInclusionPattern(String initialInclusionPattern) {
            this.initialInclusionPattern = initialInclusionPattern;
            return this;
        }

        public Object getExtraIncludePattern() {
            return extraIncludePattern;
        }

        public Builder setExtraIncludePattern(Object extraIncludePattern) {
            this.extraIncludePattern = extraIncludePattern;
            return this;
        }

        public long getGameCategoryId() {
            return gameCategoryId;
        }

        public Builder setGameCategoryId(long gameCategoryId) {
            this.gameCategoryId = gameCategoryId;
            return this;
        }
    }
}
