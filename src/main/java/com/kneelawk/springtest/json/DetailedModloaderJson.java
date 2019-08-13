
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "gameVersionId",
    "minecraftGameVersionId",
    "forgeVersion",
    "name",
    "type",
    "downloadUrl",
    "filename",
    "installMethod",
    "latest",
    "recommended",
    "approved",
    "dateModified",
    "mavenVersionString",
    "versionJson",
    "librariesInstallLocation",
    "minecraftVersion",
    "additionalFilesJson",
    "modLoaderGameVersionId",
    "modLoaderGameVersionTypeId",
    "modLoaderGameVersionStatus",
    "modLoaderGameVersionTypeStatus",
    "mcGameVersionId",
    "mcGameVersionTypeId",
    "mcGameVersionStatus",
    "mcGameVersionTypeStatus",
    "installProfileJson"
})
public class DetailedModloaderJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("gameVersionId")
    private long gameVersionId;
    @JsonProperty("minecraftGameVersionId")
    private long minecraftGameVersionId;
    @JsonProperty("forgeVersion")
    private String forgeVersion;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private long type;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("installMethod")
    private long installMethod;
    @JsonProperty("latest")
    private boolean latest;
    @JsonProperty("recommended")
    private boolean recommended;
    @JsonProperty("approved")
    private boolean approved;
    @JsonProperty("dateModified")
    private Date dateModified;
    @JsonProperty("mavenVersionString")
    private String mavenVersionString;
    @JsonProperty("versionJson")
    private String versionJson;
    @JsonProperty("librariesInstallLocation")
    private String librariesInstallLocation;
    @JsonProperty("minecraftVersion")
    private String minecraftVersion;
    @JsonProperty("additionalFilesJson")
    private Object additionalFilesJson;
    @JsonProperty("modLoaderGameVersionId")
    private long modLoaderGameVersionId;
    @JsonProperty("modLoaderGameVersionTypeId")
    private long modLoaderGameVersionTypeId;
    @JsonProperty("modLoaderGameVersionStatus")
    private long modLoaderGameVersionStatus;
    @JsonProperty("modLoaderGameVersionTypeStatus")
    private long modLoaderGameVersionTypeStatus;
    @JsonProperty("mcGameVersionId")
    private long mcGameVersionId;
    @JsonProperty("mcGameVersionTypeId")
    private long mcGameVersionTypeId;
    @JsonProperty("mcGameVersionStatus")
    private long mcGameVersionStatus;
    @JsonProperty("mcGameVersionTypeStatus")
    private long mcGameVersionTypeStatus;
    @JsonProperty("installProfileJson")
    private Object installProfileJson;

    public DetailedModloaderJson() {
    }

    private DetailedModloaderJson(long id, long gameVersionId, long minecraftGameVersionId, String forgeVersion,
                                  String name, long type, String downloadUrl, String filename, long installMethod,
                                  boolean latest, boolean recommended, boolean approved, Date dateModified,
                                  String mavenVersionString, String versionJson, String librariesInstallLocation,
                                  String minecraftVersion, Object additionalFilesJson, long modLoaderGameVersionId,
                                  long modLoaderGameVersionTypeId, long modLoaderGameVersionStatus,
                                  long modLoaderGameVersionTypeStatus, long mcGameVersionId, long mcGameVersionTypeId,
                                  long mcGameVersionStatus, long mcGameVersionTypeStatus,
                                  Object installProfileJson) {
        this.id = id;
        this.gameVersionId = gameVersionId;
        this.minecraftGameVersionId = minecraftGameVersionId;
        this.forgeVersion = forgeVersion;
        this.name = name;
        this.type = type;
        this.downloadUrl = downloadUrl;
        this.filename = filename;
        this.installMethod = installMethod;
        this.latest = latest;
        this.recommended = recommended;
        this.approved = approved;
        this.dateModified = dateModified;
        this.mavenVersionString = mavenVersionString;
        this.versionJson = versionJson;
        this.librariesInstallLocation = librariesInstallLocation;
        this.minecraftVersion = minecraftVersion;
        this.additionalFilesJson = additionalFilesJson;
        this.modLoaderGameVersionId = modLoaderGameVersionId;
        this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
        this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
        this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
        this.mcGameVersionId = mcGameVersionId;
        this.mcGameVersionTypeId = mcGameVersionTypeId;
        this.mcGameVersionStatus = mcGameVersionStatus;
        this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
        this.installProfileJson = installProfileJson;
    }

    public long getId() {
        return id;
    }

    public long getGameVersionId() {
        return gameVersionId;
    }

    public long getMinecraftGameVersionId() {
        return minecraftGameVersionId;
    }

    public String getForgeVersion() {
        return forgeVersion;
    }

    public String getName() {
        return name;
    }

    public long getType() {
        return type;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public String getFilename() {
        return filename;
    }

    public long getInstallMethod() {
        return installMethod;
    }

    public boolean isLatest() {
        return latest;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public boolean isApproved() {
        return approved;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public String getMavenVersionString() {
        return mavenVersionString;
    }

    public String getVersionJson() {
        return versionJson;
    }

    public String getLibrariesInstallLocation() {
        return librariesInstallLocation;
    }

    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    public Object getAdditionalFilesJson() {
        return additionalFilesJson;
    }

    public long getModLoaderGameVersionId() {
        return modLoaderGameVersionId;
    }

    public long getModLoaderGameVersionTypeId() {
        return modLoaderGameVersionTypeId;
    }

    public long getModLoaderGameVersionStatus() {
        return modLoaderGameVersionStatus;
    }

    public long getModLoaderGameVersionTypeStatus() {
        return modLoaderGameVersionTypeStatus;
    }

    public long getMcGameVersionId() {
        return mcGameVersionId;
    }

    public long getMcGameVersionTypeId() {
        return mcGameVersionTypeId;
    }

    public long getMcGameVersionStatus() {
        return mcGameVersionStatus;
    }

    public long getMcGameVersionTypeStatus() {
        return mcGameVersionTypeStatus;
    }

    public Object getInstallProfileJson() {
        return installProfileJson;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("gameVersionId", gameVersionId)
                .append("minecraftGameVersionId", minecraftGameVersionId)
                .append("forgeVersion", forgeVersion)
                .append("name", name)
                .append("type", type)
                .append("downloadUrl", downloadUrl)
                .append("filename", filename)
                .append("installMethod", installMethod)
                .append("latest", latest)
                .append("recommended", recommended)
                .append("approved", approved)
                .append("dateModified", dateModified)
                .append("mavenVersionString", mavenVersionString)
                .append("versionJson", versionJson)
                .append("librariesInstallLocation", librariesInstallLocation)
                .append("minecraftVersion", minecraftVersion)
                .append("additionalFilesJson", additionalFilesJson)
                .append("modLoaderGameVersionId", modLoaderGameVersionId)
                .append("modLoaderGameVersionTypeId", modLoaderGameVersionTypeId)
                .append("modLoaderGameVersionStatus", modLoaderGameVersionStatus)
                .append("modLoaderGameVersionTypeStatus", modLoaderGameVersionTypeStatus)
                .append("mcGameVersionId", mcGameVersionId)
                .append("mcGameVersionTypeId", mcGameVersionTypeId)
                .append("mcGameVersionStatus", mcGameVersionStatus)
                .append("mcGameVersionTypeStatus", mcGameVersionTypeStatus)
                .append("installProfileJson", installProfileJson)
                .toString();
    }

    public static class Builder {
        private long id;
        private long gameVersionId;
        private long minecraftGameVersionId;
        private String forgeVersion;
        private String name;
        private long type;
        private String downloadUrl;
        private String filename;
        private long installMethod;
        private boolean latest;
        private boolean recommended;
        private boolean approved;
        private Date dateModified;
        private String mavenVersionString;
        private String versionJson;
        private String librariesInstallLocation;
        private String minecraftVersion;
        private Object additionalFilesJson;
        private long modLoaderGameVersionId;
        private long modLoaderGameVersionTypeId;
        private long modLoaderGameVersionStatus;
        private long modLoaderGameVersionTypeStatus;
        private long mcGameVersionId;
        private long mcGameVersionTypeId;
        private long mcGameVersionStatus;
        private long mcGameVersionTypeStatus;
        private Object installProfileJson;

        public Builder() {
        }

        public Builder(long id, long gameVersionId, long minecraftGameVersionId, String forgeVersion,
                       String name, long type, String downloadUrl, String filename,
                       long installMethod, boolean latest, boolean recommended, boolean approved,
                       Date dateModified, String mavenVersionString, String versionJson,
                       String librariesInstallLocation, String minecraftVersion,
                       Object additionalFilesJson, long modLoaderGameVersionId,
                       long modLoaderGameVersionTypeId, long modLoaderGameVersionStatus,
                       long modLoaderGameVersionTypeStatus, long mcGameVersionId, long mcGameVersionTypeId,
                       long mcGameVersionStatus, long mcGameVersionTypeStatus, Object installProfileJson) {
            this.id = id;
            this.gameVersionId = gameVersionId;
            this.minecraftGameVersionId = minecraftGameVersionId;
            this.forgeVersion = forgeVersion;
            this.name = name;
            this.type = type;
            this.downloadUrl = downloadUrl;
            this.filename = filename;
            this.installMethod = installMethod;
            this.latest = latest;
            this.recommended = recommended;
            this.approved = approved;
            this.dateModified = dateModified;
            this.mavenVersionString = mavenVersionString;
            this.versionJson = versionJson;
            this.librariesInstallLocation = librariesInstallLocation;
            this.minecraftVersion = minecraftVersion;
            this.additionalFilesJson = additionalFilesJson;
            this.modLoaderGameVersionId = modLoaderGameVersionId;
            this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
            this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
            this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
            this.mcGameVersionId = mcGameVersionId;
            this.mcGameVersionTypeId = mcGameVersionTypeId;
            this.mcGameVersionStatus = mcGameVersionStatus;
            this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
            this.installProfileJson = installProfileJson;
        }

        public DetailedModloaderJson build() {
            if (forgeVersion == null)
                throw new IllegalStateException("No forgeVersion specified");
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (downloadUrl == null)
                throw new IllegalStateException("No downloadUrl specified");
            if (filename == null)
                throw new IllegalStateException("No filename specified");
            if (dateModified == null)
                throw new IllegalStateException("No dateModified specified");
            if (mavenVersionString == null)
                throw new IllegalStateException("No mavenVersionString specified");
            if (versionJson == null)
                throw new IllegalStateException("No versionJson specified");
            if (librariesInstallLocation == null)
                throw new IllegalStateException("No librariesInstallLocation specified");
            if (minecraftVersion == null)
                throw new IllegalStateException("No minecraftVersion specified");
            if (additionalFilesJson == null)
                throw new IllegalStateException("No additionalFilesJson specified");
            if (installProfileJson == null)
                throw new IllegalStateException("No installProfileJson specified");
            return new DetailedModloaderJson(id, gameVersionId, minecraftGameVersionId, forgeVersion, name, type,
                    downloadUrl, filename, installMethod, latest, recommended, approved, dateModified,
                    mavenVersionString, versionJson, librariesInstallLocation, minecraftVersion, additionalFilesJson,
                    modLoaderGameVersionId, modLoaderGameVersionTypeId, modLoaderGameVersionStatus,
                    modLoaderGameVersionTypeStatus, mcGameVersionId, mcGameVersionTypeId, mcGameVersionStatus,
                    mcGameVersionTypeStatus, installProfileJson);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public long getGameVersionId() {
            return gameVersionId;
        }

        public Builder setGameVersionId(long gameVersionId) {
            this.gameVersionId = gameVersionId;
            return this;
        }

        public long getMinecraftGameVersionId() {
            return minecraftGameVersionId;
        }

        public Builder setMinecraftGameVersionId(long minecraftGameVersionId) {
            this.minecraftGameVersionId = minecraftGameVersionId;
            return this;
        }

        public String getForgeVersion() {
            return forgeVersion;
        }

        public Builder setForgeVersion(String forgeVersion) {
            this.forgeVersion = forgeVersion;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public long getType() {
            return type;
        }

        public Builder setType(long type) {
            this.type = type;
            return this;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public Builder setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        public String getFilename() {
            return filename;
        }

        public Builder setFilename(String filename) {
            this.filename = filename;
            return this;
        }

        public long getInstallMethod() {
            return installMethod;
        }

        public Builder setInstallMethod(long installMethod) {
            this.installMethod = installMethod;
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

        public boolean isApproved() {
            return approved;
        }

        public Builder setApproved(boolean approved) {
            this.approved = approved;
            return this;
        }

        public Date getDateModified() {
            return dateModified;
        }

        public Builder setDateModified(Date dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public String getMavenVersionString() {
            return mavenVersionString;
        }

        public Builder setMavenVersionString(String mavenVersionString) {
            this.mavenVersionString = mavenVersionString;
            return this;
        }

        public String getVersionJson() {
            return versionJson;
        }

        public Builder setVersionJson(String versionJson) {
            this.versionJson = versionJson;
            return this;
        }

        public String getLibrariesInstallLocation() {
            return librariesInstallLocation;
        }

        public Builder setLibrariesInstallLocation(String librariesInstallLocation) {
            this.librariesInstallLocation = librariesInstallLocation;
            return this;
        }

        public String getMinecraftVersion() {
            return minecraftVersion;
        }

        public Builder setMinecraftVersion(String minecraftVersion) {
            this.minecraftVersion = minecraftVersion;
            return this;
        }

        public Object getAdditionalFilesJson() {
            return additionalFilesJson;
        }

        public Builder setAdditionalFilesJson(Object additionalFilesJson) {
            this.additionalFilesJson = additionalFilesJson;
            return this;
        }

        public long getModLoaderGameVersionId() {
            return modLoaderGameVersionId;
        }

        public Builder setModLoaderGameVersionId(long modLoaderGameVersionId) {
            this.modLoaderGameVersionId = modLoaderGameVersionId;
            return this;
        }

        public long getModLoaderGameVersionTypeId() {
            return modLoaderGameVersionTypeId;
        }

        public Builder setModLoaderGameVersionTypeId(long modLoaderGameVersionTypeId) {
            this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
            return this;
        }

        public long getModLoaderGameVersionStatus() {
            return modLoaderGameVersionStatus;
        }

        public Builder setModLoaderGameVersionStatus(long modLoaderGameVersionStatus) {
            this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
            return this;
        }

        public long getModLoaderGameVersionTypeStatus() {
            return modLoaderGameVersionTypeStatus;
        }

        public Builder setModLoaderGameVersionTypeStatus(long modLoaderGameVersionTypeStatus) {
            this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
            return this;
        }

        public long getMcGameVersionId() {
            return mcGameVersionId;
        }

        public Builder setMcGameVersionId(long mcGameVersionId) {
            this.mcGameVersionId = mcGameVersionId;
            return this;
        }

        public long getMcGameVersionTypeId() {
            return mcGameVersionTypeId;
        }

        public Builder setMcGameVersionTypeId(long mcGameVersionTypeId) {
            this.mcGameVersionTypeId = mcGameVersionTypeId;
            return this;
        }

        public long getMcGameVersionStatus() {
            return mcGameVersionStatus;
        }

        public Builder setMcGameVersionStatus(long mcGameVersionStatus) {
            this.mcGameVersionStatus = mcGameVersionStatus;
            return this;
        }

        public long getMcGameVersionTypeStatus() {
            return mcGameVersionTypeStatus;
        }

        public Builder setMcGameVersionTypeStatus(long mcGameVersionTypeStatus) {
            this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
            return this;
        }

        public Object getInstallProfileJson() {
            return installProfileJson;
        }

        public Builder setInstallProfileJson(Object installProfileJson) {
            this.installProfileJson = installProfileJson;
            return this;
        }
    }
}
