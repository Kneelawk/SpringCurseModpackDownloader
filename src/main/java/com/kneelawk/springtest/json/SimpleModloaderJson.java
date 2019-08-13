
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "gameVersion",
    "latest",
    "recommended",
    "dateModified"
})
public class SimpleModloaderJson {

    @JsonProperty("name")
    private String name;
    @JsonProperty("gameVersion")
    private String gameVersion;
    @JsonProperty("latest")
    private boolean latest;
    @JsonProperty("recommended")
    private boolean recommended;
    @JsonProperty("dateModified")
    private String dateModified;

    public SimpleModloaderJson() {
    }

    private SimpleModloaderJson(String name, String gameVersion, boolean latest, boolean recommended,
                                String dateModified) {
        this.name = name;
        this.gameVersion = gameVersion;
        this.latest = latest;
        this.recommended = recommended;
        this.dateModified = dateModified;
    }

    public String getName() {
        return name;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public boolean isLatest() {
        return latest;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public String getDateModified() {
        return dateModified;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("gameVersion", gameVersion)
                .append("latest", latest)
                .append("recommended", recommended)
                .append("dateModified", dateModified)
                .toString();
    }

    public static SimpleModloaderJson create(String name, String gameVersion, boolean latest,
                                             boolean recommended, String dateModified) {
        if (name == null)
            throw new NullPointerException("Name cannot be null");
        if (gameVersion == null)
            throw new NullPointerException("GameVersion cannot be null");
        if (dateModified == null)
            throw new NullPointerException("DateModified cannot be null");
        return new SimpleModloaderJson(name, gameVersion, latest, recommended, dateModified);
    }

    public static class Builder {
        private String name;
        private String gameVersion;
        private boolean latest;
        private boolean recommended;
        private String dateModified;

        public Builder() {
        }

        public Builder(String name, String gameVersion, boolean latest, boolean recommended,
                       String dateModified) {
            this.name = name;
            this.gameVersion = gameVersion;
            this.latest = latest;
            this.recommended = recommended;
            this.dateModified = dateModified;
        }

        public SimpleModloaderJson build() {
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (gameVersion == null)
                throw new IllegalStateException("No gameVersion specified");
            if (dateModified == null)
                throw new IllegalStateException("No dateModified specified");
            return new SimpleModloaderJson(name, gameVersion, latest, recommended, dateModified);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGameVersion() {
            return gameVersion;
        }

        public Builder setGameVersion(String gameVersion) {
            this.gameVersion = gameVersion;
            return this;
        }

        public boolean isLatest() {
            return latest;
        }

        public Builder setLatest(boolean latest) {
            this.latest = latest;
            return this;
        }

        public boolean isRecommended() {
            return recommended;
        }

        public Builder setRecommended(boolean recommended) {
            this.recommended = recommended;
            return this;
        }

        public String getDateModified() {
            return dateModified;
        }

        public Builder setDateModified(String dateModified) {
            this.dateModified = dateModified;
            return this;
        }
    }
}
