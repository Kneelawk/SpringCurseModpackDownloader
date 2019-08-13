
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gameVersion",
    "projectFileId",
    "projectFileName",
    "fileType",
    "gameVersionFlavor"
})
public class GameVersionLatestFileJson {

    @JsonProperty("gameVersion")
    private String gameVersion;
    @JsonProperty("projectFileId")
    private long projectFileId;
    @JsonProperty("projectFileName")
    private String projectFileName;
    @JsonProperty("fileType")
    private long fileType;
    @JsonProperty("gameVersionFlavor")
    private Object gameVersionFlavor;

    public GameVersionLatestFileJson() {
    }

    private GameVersionLatestFileJson(String gameVersion, long projectFileId, String projectFileName, long fileType,
                                      Object gameVersionFlavor) {
        this.gameVersion = gameVersion;
        this.projectFileId = projectFileId;
        this.projectFileName = projectFileName;
        this.fileType = fileType;
        this.gameVersionFlavor = gameVersionFlavor;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public long getProjectFileId() {
        return projectFileId;
    }

    public String getProjectFileName() {
        return projectFileName;
    }

    public long getFileType() {
        return fileType;
    }

    public Object getGameVersionFlavor() {
        return gameVersionFlavor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("gameVersion", gameVersion)
                .append("projectFileId", projectFileId)
                .append("projectFileName", projectFileName)
                .append("fileType", fileType)
                .append("gameVersionFlavor", gameVersionFlavor)
                .toString();
    }

    public static GameVersionLatestFileJson create(String gameVersion, long projectFileId,
                                                   String projectFileName, long fileType,
                                                   Object gameVersionFlavor) {
        if (gameVersion == null)
            throw new NullPointerException("GameVersion cannot be null");
        if (projectFileName == null)
            throw new NullPointerException("ProjectFileName cannot be null");
        if (gameVersionFlavor == null)
            throw new NullPointerException("GameVersionFlavor cannot be null");
        return new GameVersionLatestFileJson(gameVersion, projectFileId, projectFileName, fileType, gameVersionFlavor);
    }

    public static class Builder {
        private String gameVersion;
        private long projectFileId;
        private String projectFileName;
        private long fileType;
        private Object gameVersionFlavor;

        public Builder() {
        }

        public Builder(String gameVersion, long projectFileId, String projectFileName,
                       long fileType, Object gameVersionFlavor) {
            this.gameVersion = gameVersion;
            this.projectFileId = projectFileId;
            this.projectFileName = projectFileName;
            this.fileType = fileType;
            this.gameVersionFlavor = gameVersionFlavor;
        }

        public GameVersionLatestFileJson build() {
            if (gameVersion == null)
                throw new IllegalStateException("No gameVersion specified");
            if (projectFileName == null)
                throw new IllegalStateException("No projectFileName specified");
            if (gameVersionFlavor == null)
                throw new IllegalStateException("No gameVersionFlavor specified");
            return new GameVersionLatestFileJson(gameVersion, projectFileId, projectFileName, fileType,
                    gameVersionFlavor);
        }

        public String getGameVersion() {
            return gameVersion;
        }

        public Builder setGameVersion(String gameVersion) {
            this.gameVersion = gameVersion;
            return this;
        }

        public long getProjectFileId() {
            return projectFileId;
        }

        public Builder setProjectFileId(long projectFileId) {
            this.projectFileId = projectFileId;
            return this;
        }

        public String getProjectFileName() {
            return projectFileName;
        }

        public Builder setProjectFileName(String projectFileName) {
            this.projectFileName = projectFileName;
            return this;
        }

        public long getFileType() {
            return fileType;
        }

        public Builder setFileType(long fileType) {
            this.fileType = fileType;
            return this;
        }

        public Object getGameVersionFlavor() {
            return gameVersionFlavor;
        }

        public Builder setGameVersionFlavor(Object gameVersionFlavor) {
            this.gameVersionFlavor = gameVersionFlavor;
            return this;
        }
    }
}
