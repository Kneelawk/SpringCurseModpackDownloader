
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gameVersionPadded",
    "gameVersion",
    "gameVersionReleaseDate",
    "gameVersionName"
})
public class SortableGameVersionJson {

    @JsonProperty("gameVersionPadded")
    private String gameVersionPadded;
    @JsonProperty("gameVersion")
    private String gameVersion;
    @JsonProperty("gameVersionReleaseDate")
    private Date gameVersionReleaseDate;
    @JsonProperty("gameVersionName")
    private String gameVersionName;

    public SortableGameVersionJson() {
    }

    private SortableGameVersionJson(String gameVersionPadded, String gameVersion, Date gameVersionReleaseDate,
                                    String gameVersionName) {
        this.gameVersionPadded = gameVersionPadded;
        this.gameVersion = gameVersion;
        this.gameVersionReleaseDate = gameVersionReleaseDate;
        this.gameVersionName = gameVersionName;
    }

    public String getGameVersionPadded() {
        return gameVersionPadded;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public Date getGameVersionReleaseDate() {
        return gameVersionReleaseDate;
    }

    public String getGameVersionName() {
        return gameVersionName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("gameVersionPadded", gameVersionPadded)
                .append("gameVersion", gameVersion)
                .append("gameVersionReleaseDate", gameVersionReleaseDate)
                .append("gameVersionName", gameVersionName)
                .toString();
    }

    public static SortableGameVersionJson create(String gameVersionPadded, String gameVersion,
                                                 Date gameVersionReleaseDate,
                                                 String gameVersionName) {
        if (gameVersionPadded == null)
            throw new NullPointerException("GameVersionPadded cannot be null");
        if (gameVersion == null)
            throw new NullPointerException("GameVersion cannot be null");
        if (gameVersionReleaseDate == null)
            throw new NullPointerException("GameVersionReleaseDate cannot be null");
        if (gameVersionName == null)
            throw new NullPointerException("GameVersionName cannot be null");
        return new SortableGameVersionJson(gameVersionPadded, gameVersion, gameVersionReleaseDate, gameVersionName);
    }

    public static class Builder {
        private String gameVersionPadded;
        private String gameVersion;
        private Date gameVersionReleaseDate;
        private String gameVersionName;

        public Builder() {
        }

        public Builder(String gameVersionPadded, String gameVersion,
                       Date gameVersionReleaseDate, String gameVersionName) {
            this.gameVersionPadded = gameVersionPadded;
            this.gameVersion = gameVersion;
            this.gameVersionReleaseDate = gameVersionReleaseDate;
            this.gameVersionName = gameVersionName;
        }

        public SortableGameVersionJson build() {
            if (gameVersionPadded == null)
                throw new IllegalStateException("No gameVersionPadded specified");
            if (gameVersion == null)
                throw new IllegalStateException("No gameVersion specified");
            if (gameVersionReleaseDate == null)
                throw new IllegalStateException("No gameVersionReleaseDate specified");
            if (gameVersionName == null)
                throw new IllegalStateException("No gameVersionName specified");
            return new SortableGameVersionJson(gameVersionPadded, gameVersion, gameVersionReleaseDate, gameVersionName);
        }

        public String getGameVersionPadded() {
            return gameVersionPadded;
        }

        public Builder setGameVersionPadded(String gameVersionPadded) {
            this.gameVersionPadded = gameVersionPadded;
            return this;
        }

        public String getGameVersion() {
            return gameVersion;
        }

        public Builder setGameVersion(String gameVersion) {
            this.gameVersion = gameVersion;
            return this;
        }

        public Date getGameVersionReleaseDate() {
            return gameVersionReleaseDate;
        }

        public Builder setGameVersionReleaseDate(Date gameVersionReleaseDate) {
            this.gameVersionReleaseDate = gameVersionReleaseDate;
            return this;
        }

        public String getGameVersionName() {
            return gameVersionName;
        }

        public Builder setGameVersionName(String gameVersionName) {
            this.gameVersionName = gameVersionName;
            return this;
        }
    }
}
