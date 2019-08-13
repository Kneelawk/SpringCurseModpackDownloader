
package com.kneelawk.springtest.json;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "displayName",
    "fileName",
    "fileDate",
    "fileLength",
    "releaseType",
    "fileStatus",
    "downloadUrl",
    "isAlternate",
    "alternateFileId",
    "dependencies",
    "isAvailable",
    "modules",
    "packageFingerprint",
    "gameVersion",
    "sortableGameVersion",
    "installMetadata",
    "changelog",
    "hasInstallScript",
    "isCompatibleWithClient",
    "categorySectionPackageType",
    "restrictProjectFileAccess",
    "projectStatus",
    "renderCacheId",
    "fileLegacyMappingId",
    "projectId",
    "parentProjectFileId",
    "parentFileLegacyMappingId",
    "fileTypeId",
    "exposeAsAlternative",
    "packageFingerprintId",
    "gameVersionDateReleased",
    "gameVersionMappingId",
    "gameVersionId",
    "gameId",
    "isServerPack",
    "serverPackFileId",
    "gameVersionFlavor"
})
public class AddonFileJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("fileDate")
    private Date fileDate;
    @JsonProperty("fileLength")
    private long fileLength;
    @JsonProperty("releaseType")
    private long releaseType;
    @JsonProperty("fileStatus")
    private long fileStatus;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("isAlternate")
    private boolean isAlternate;
    @JsonProperty("alternateFileId")
    private long alternateFileId;
    @JsonProperty("dependencies")
    private List<DependencyJson> dependencies = Lists.newArrayList();
    @JsonProperty("isAvailable")
    private boolean isAvailable;
    @JsonProperty("modules")
    private List<ModuleJson> modules = Lists.newArrayList();
    @JsonProperty("packageFingerprint")
    private long packageFingerprint;
    @JsonProperty("gameVersion")
    private List<String> gameVersion = Lists.newArrayList();
    @JsonProperty("sortableGameVersion")
    private List<SortableGameVersionJson> sortableGameVersion = Lists.newArrayList();
    @JsonProperty("installMetadata")
    private Object installMetadata;
    @JsonProperty("changelog")
    private Object changelog;
    @JsonProperty("hasInstallScript")
    private boolean hasInstallScript;
    @JsonProperty("isCompatibleWithClient")
    private boolean isCompatibleWithClient;
    @JsonProperty("categorySectionPackageType")
    private long categorySectionPackageType;
    @JsonProperty("restrictProjectFileAccess")
    private long restrictProjectFileAccess;
    @JsonProperty("projectStatus")
    private long projectStatus;
    @JsonProperty("renderCacheId")
    private long renderCacheId;
    @JsonProperty("fileLegacyMappingId")
    private Object fileLegacyMappingId;
    @JsonProperty("projectId")
    private long projectId;
    @JsonProperty("parentProjectFileId")
    private Object parentProjectFileId;
    @JsonProperty("parentFileLegacyMappingId")
    private Object parentFileLegacyMappingId;
    @JsonProperty("fileTypeId")
    private Object fileTypeId;
    @JsonProperty("exposeAsAlternative")
    private Object exposeAsAlternative;
    @JsonProperty("packageFingerprintId")
    private long packageFingerprintId;
    @JsonProperty("gameVersionDateReleased")
    private Date gameVersionDateReleased;
    @JsonProperty("gameVersionMappingId")
    private long gameVersionMappingId;
    @JsonProperty("gameVersionId")
    private long gameVersionId;
    @JsonProperty("gameId")
    private long gameId;
    @JsonProperty("isServerPack")
    private boolean isServerPack;
    @JsonProperty("serverPackFileId")
    private Object serverPackFileId;
    @JsonProperty("gameVersionFlavor")
    private Object gameVersionFlavor;

    /*
     * Reflection initializer.
     */
    public AddonFileJson() {
    }

    private AddonFileJson(long id, String displayName, String fileName, Date fileDate, long fileLength, long releaseType,
                         long fileStatus, String downloadUrl, boolean isAlternate, long alternateFileId,
                         List<DependencyJson> dependencies, boolean isAvailable,
                         List<ModuleJson> modules, long packageFingerprint, List<String> gameVersion,
                         List<SortableGameVersionJson> sortableGameVersion, Object installMetadata,
                         Object changelog, boolean hasInstallScript, boolean isCompatibleWithClient,
                         long categorySectionPackageType, long restrictProjectFileAccess, long projectStatus,
                         long renderCacheId, Object fileLegacyMappingId, long projectId,
                         Object parentProjectFileId, Object parentFileLegacyMappingId, Object fileTypeId,
                         Object exposeAsAlternative, long packageFingerprintId, Date gameVersionDateReleased,
                         long gameVersionMappingId, long gameVersionId, long gameId, boolean isServerPack,
                         Object serverPackFileId, Object gameVersionFlavor) {
        this.id = id;
        this.displayName = displayName;
        this.fileName = fileName;
        this.fileDate = fileDate;
        this.fileLength = fileLength;
        this.releaseType = releaseType;
        this.fileStatus = fileStatus;
        this.downloadUrl = downloadUrl;
        this.isAlternate = isAlternate;
        this.alternateFileId = alternateFileId;
        this.dependencies = dependencies;
        this.isAvailable = isAvailable;
        this.modules = modules;
        this.packageFingerprint = packageFingerprint;
        this.gameVersion = gameVersion;
        this.sortableGameVersion = sortableGameVersion;
        this.installMetadata = installMetadata;
        this.changelog = changelog;
        this.hasInstallScript = hasInstallScript;
        this.isCompatibleWithClient = isCompatibleWithClient;
        this.categorySectionPackageType = categorySectionPackageType;
        this.restrictProjectFileAccess = restrictProjectFileAccess;
        this.projectStatus = projectStatus;
        this.renderCacheId = renderCacheId;
        this.fileLegacyMappingId = fileLegacyMappingId;
        this.projectId = projectId;
        this.parentProjectFileId = parentProjectFileId;
        this.parentFileLegacyMappingId = parentFileLegacyMappingId;
        this.fileTypeId = fileTypeId;
        this.exposeAsAlternative = exposeAsAlternative;
        this.packageFingerprintId = packageFingerprintId;
        this.gameVersionDateReleased = gameVersionDateReleased;
        this.gameVersionMappingId = gameVersionMappingId;
        this.gameVersionId = gameVersionId;
        this.gameId = gameId;
        this.isServerPack = isServerPack;
        this.serverPackFileId = serverPackFileId;
        this.gameVersionFlavor = gameVersionFlavor;
    }

    public long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFileName() {
        return fileName;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public long getFileLength() {
        return fileLength;
    }

    public long getReleaseType() {
        return releaseType;
    }

    public long getFileStatus() {
        return fileStatus;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public boolean isAlternate() {
        return isAlternate;
    }

    public long getAlternateFileId() {
        return alternateFileId;
    }

    public List<DependencyJson> getDependencies() {
        return dependencies;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public List<ModuleJson> getModules() {
        return modules;
    }

    public long getPackageFingerprint() {
        return packageFingerprint;
    }

    public List<String> getGameVersion() {
        return gameVersion;
    }

    public List<SortableGameVersionJson> getSortableGameVersion() {
        return sortableGameVersion;
    }

    public Object getInstallMetadata() {
        return installMetadata;
    }

    public Object getChangelog() {
        return changelog;
    }

    public boolean isHasInstallScript() {
        return hasInstallScript;
    }

    public boolean isCompatibleWithClient() {
        return isCompatibleWithClient;
    }

    public long getCategorySectionPackageType() {
        return categorySectionPackageType;
    }

    public long getRestrictProjectFileAccess() {
        return restrictProjectFileAccess;
    }

    public long getProjectStatus() {
        return projectStatus;
    }

    public long getRenderCacheId() {
        return renderCacheId;
    }

    public Object getFileLegacyMappingId() {
        return fileLegacyMappingId;
    }

    public long getProjectId() {
        return projectId;
    }

    public Object getParentProjectFileId() {
        return parentProjectFileId;
    }

    public Object getParentFileLegacyMappingId() {
        return parentFileLegacyMappingId;
    }

    public Object getFileTypeId() {
        return fileTypeId;
    }

    public Object getExposeAsAlternative() {
        return exposeAsAlternative;
    }

    public long getPackageFingerprintId() {
        return packageFingerprintId;
    }

    public Date getGameVersionDateReleased() {
        return gameVersionDateReleased;
    }

    public long getGameVersionMappingId() {
        return gameVersionMappingId;
    }

    public long getGameVersionId() {
        return gameVersionId;
    }

    public long getGameId() {
        return gameId;
    }

    public boolean isServerPack() {
        return isServerPack;
    }

    public Object getServerPackFileId() {
        return serverPackFileId;
    }

    public Object getGameVersionFlavor() {
        return gameVersionFlavor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("displayName", displayName)
                .append("fileName", fileName)
                .append("fileDate", fileDate)
                .append("fileLength", fileLength)
                .append("releaseType", releaseType)
                .append("fileStatus", fileStatus)
                .append("downloadUrl", downloadUrl)
                .append("isAlternate", isAlternate)
                .append("alternateFileId", alternateFileId)
                .append("dependencies", dependencies)
                .append("isAvailable", isAvailable)
                .append("modules", modules)
                .append("packageFingerprint", packageFingerprint)
                .append("gameVersion", gameVersion)
                .append("sortableGameVersion", sortableGameVersion)
                .append("installMetadata", installMetadata)
                .append("changelog", changelog)
                .append("hasInstallScript", hasInstallScript)
                .append("isCompatibleWithClient", isCompatibleWithClient)
                .append("categorySectionPackageType", categorySectionPackageType)
                .append("restrictProjectFileAccess", restrictProjectFileAccess)
                .append("projectStatus", projectStatus)
                .append("renderCacheId", renderCacheId)
                .append("fileLegacyMappingId", fileLegacyMappingId)
                .append("projectId", projectId)
                .append("parentProjectFileId", parentProjectFileId)
                .append("parentFileLegacyMappingId", parentFileLegacyMappingId)
                .append("fileTypeId", fileTypeId)
                .append("exposeAsAlternative", exposeAsAlternative)
                .append("packageFingerprintId", packageFingerprintId)
                .append("gameVersionDateReleased", gameVersionDateReleased)
                .append("gameVersionMappingId", gameVersionMappingId)
                .append("gameVersionId", gameVersionId)
                .append("gameId", gameId)
                .append("isServerPack", isServerPack)
                .append("serverPackFileId", serverPackFileId)
                .append("gameVersionFlavor", gameVersionFlavor)
                .toString();
    }

    public static class Builder {
        private long id;
        private String displayName;
        private String fileName;
        private Date fileDate;
        private long fileLength;
        private long releaseType;
        private long fileStatus;
        private String downloadUrl;
        private boolean isAlternate;
        private long alternateFileId;
        private final List<DependencyJson> dependencies =
                Lists.newArrayList();
        private boolean isAvailable;
        private final List<ModuleJson> modules =
                Lists.newArrayList();
        private long packageFingerprint;
        private final List<String> gameVersion = Lists.newArrayList();
        private final List<SortableGameVersionJson> sortableGameVersion =
                Lists.newArrayList();
        private Object installMetadata;
        private Object changelog;
        private boolean hasInstallScript;
        private boolean isCompatibleWithClient;
        private long categorySectionPackageType;
        private long restrictProjectFileAccess;
        private long projectStatus;
        private long renderCacheId;
        private Object fileLegacyMappingId;
        private long projectId;
        private Object parentProjectFileId;
        private Object parentFileLegacyMappingId;
        private Object fileTypeId;
        private Object exposeAsAlternative;
        private long packageFingerprintId;
        private Date gameVersionDateReleased;
        private long gameVersionMappingId;
        private long gameVersionId;
        private long gameId;
        private boolean isServerPack;
        private Object serverPackFileId;
        private Object gameVersionFlavor;

        public Builder() {
        }

        public Builder(long id, String displayName, String fileName, Date fileDate,
                       long fileLength, long releaseType, long fileStatus, String downloadUrl,
                       boolean isAlternate, long alternateFileId,
                       Collection<DependencyJson> dependencies,
                       boolean isAvailable, Collection<ModuleJson> modules,
                       long packageFingerprint, Collection<String> gameVersion,
                       Collection<SortableGameVersionJson> sortableGameVersion,
                       Object installMetadata, Object changelog, boolean hasInstallScript,
                       boolean isCompatibleWithClient, long categorySectionPackageType, long restrictProjectFileAccess,
                       long projectStatus, long renderCacheId, Object fileLegacyMappingId, long projectId,
                       Object parentProjectFileId, Object parentFileLegacyMappingId,
                       Object fileTypeId, Object exposeAsAlternative, long packageFingerprintId,
                       Date gameVersionDateReleased, long gameVersionMappingId, long gameVersionId,
                       long gameId, boolean isServerPack, Object serverPackFileId,
                       Object gameVersionFlavor) {
            this.id = id;
            this.displayName = displayName;
            this.fileName = fileName;
            this.fileDate = fileDate;
            this.fileLength = fileLength;
            this.releaseType = releaseType;
            this.fileStatus = fileStatus;
            this.downloadUrl = downloadUrl;
            this.isAlternate = isAlternate;
            this.alternateFileId = alternateFileId;
            this.dependencies.addAll(dependencies);
            this.isAvailable = isAvailable;
            this.modules.addAll(modules);
            this.packageFingerprint = packageFingerprint;
            this.gameVersion.addAll(gameVersion);
            this.sortableGameVersion.addAll(sortableGameVersion);
            this.installMetadata = installMetadata;
            this.changelog = changelog;
            this.hasInstallScript = hasInstallScript;
            this.isCompatibleWithClient = isCompatibleWithClient;
            this.categorySectionPackageType = categorySectionPackageType;
            this.restrictProjectFileAccess = restrictProjectFileAccess;
            this.projectStatus = projectStatus;
            this.renderCacheId = renderCacheId;
            this.fileLegacyMappingId = fileLegacyMappingId;
            this.projectId = projectId;
            this.parentProjectFileId = parentProjectFileId;
            this.parentFileLegacyMappingId = parentFileLegacyMappingId;
            this.fileTypeId = fileTypeId;
            this.exposeAsAlternative = exposeAsAlternative;
            this.packageFingerprintId = packageFingerprintId;
            this.gameVersionDateReleased = gameVersionDateReleased;
            this.gameVersionMappingId = gameVersionMappingId;
            this.gameVersionId = gameVersionId;
            this.gameId = gameId;
            this.isServerPack = isServerPack;
            this.serverPackFileId = serverPackFileId;
            this.gameVersionFlavor = gameVersionFlavor;
        }

        public AddonFileJson build() {
            if (displayName == null)
                throw new IllegalStateException("No displayName specified");
            if (fileName == null)
                throw new IllegalStateException("No fileName specified");
            if (fileDate == null)
                throw new IllegalStateException("No fileDate specified");
            if (downloadUrl == null)
                throw new IllegalStateException("No downloadUrl specified");
            if (installMetadata == null)
                throw new IllegalStateException("No installMetadata specified");
            if (changelog == null)
                throw new IllegalStateException("No changelog specified");
            if (fileLegacyMappingId == null)
                throw new IllegalStateException("No fileLegacyMappingId specified");
            if (parentProjectFileId == null)
                throw new IllegalStateException("No parentProjectFileId specified");
            if (parentFileLegacyMappingId == null)
                throw new IllegalStateException("No parentFileLegacyMappingId specified");
            if (fileTypeId == null)
                throw new IllegalStateException("No fileTypeId specified");
            if (exposeAsAlternative == null)
                throw new IllegalStateException("No exposeAsAlternative specified");
            if (gameVersionDateReleased == null)
                throw new IllegalStateException("No gameVersionDateReleased specified");
            if (serverPackFileId == null)
                throw new IllegalStateException("No serverPackFileId specified");
            if (gameVersionFlavor == null)
                throw new IllegalStateException("No gameVersionFlavor specified");
            return new AddonFileJson(id, displayName, fileName, fileDate, fileLength, releaseType, fileStatus,
                    downloadUrl, isAlternate, alternateFileId,
                    ImmutableList.copyOf(dependencies), isAvailable,
                    ImmutableList.copyOf(modules), packageFingerprint,
                    ImmutableList.copyOf(gameVersion),
                    ImmutableList.copyOf(sortableGameVersion), installMetadata, changelog,
                    hasInstallScript, isCompatibleWithClient, categorySectionPackageType, restrictProjectFileAccess,
                    projectStatus, renderCacheId, fileLegacyMappingId, projectId, parentProjectFileId,
                    parentFileLegacyMappingId, fileTypeId, exposeAsAlternative, packageFingerprintId,
                    gameVersionDateReleased, gameVersionMappingId, gameVersionId, gameId, isServerPack,
                    serverPackFileId, gameVersionFlavor);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public String getDisplayName() {
            return displayName;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public String getFileName() {
            return fileName;
        }

        public Builder setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Date getFileDate() {
            return fileDate;
        }

        public Builder setFileDate(Date fileDate) {
            this.fileDate = fileDate;
            return this;
        }

        public long getFileLength() {
            return fileLength;
        }

        public Builder setFileLength(long fileLength) {
            this.fileLength = fileLength;
            return this;
        }

        public long getReleaseType() {
            return releaseType;
        }

        public Builder setReleaseType(long releaseType) {
            this.releaseType = releaseType;
            return this;
        }

        public long getFileStatus() {
            return fileStatus;
        }

        public Builder setFileStatus(long fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public Builder setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        public boolean isAlternate() {
            return isAlternate;
        }

        public Builder setAlternate(boolean isAlternate) {
            this.isAlternate = isAlternate;
            return this;
        }

        public long getAlternateFileId() {
            return alternateFileId;
        }

        public Builder setAlternateFileId(long alternateFileId) {
            this.alternateFileId = alternateFileId;
            return this;
        }

        public List<DependencyJson> getDependencies() {
            return dependencies;
        }

        public Builder setDependencies(Collection<DependencyJson> dependencies) {
            this.dependencies.clear();
            this.dependencies.addAll(dependencies);
            return this;
        }

        public Builder addDependencie(DependencyJson dependencie) {
            this.dependencies.add(dependencie);
            return this;
        }

        public Builder addDependencie(DependencyJson... dependencies) {
            this.dependencies.addAll(Arrays.asList(dependencies));
            return this;
        }

        public Builder addDependencies(Collection<DependencyJson> dependencies) {
            this.dependencies.addAll(dependencies);
            return this;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public Builder setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public List<ModuleJson> getModules() {
            return modules;
        }

        public Builder setModules(Collection<ModuleJson> modules) {
            this.modules.clear();
            this.modules.addAll(modules);
            return this;
        }

        public Builder addModule(ModuleJson module) {
            this.modules.add(module);
            return this;
        }

        public Builder addModule(ModuleJson... modules) {
            this.modules.addAll(Arrays.asList(modules));
            return this;
        }

        public Builder addModules(Collection<ModuleJson> modules) {
            this.modules.addAll(modules);
            return this;
        }

        public long getPackageFingerprint() {
            return packageFingerprint;
        }

        public Builder setPackageFingerprint(long packageFingerprint) {
            this.packageFingerprint = packageFingerprint;
            return this;
        }

        public List<String> getGameVersion() {
            return gameVersion;
        }

        public Builder setGameVersion(Collection<String> gameVersion) {
            this.gameVersion.clear();
            this.gameVersion.addAll(gameVersion);
            return this;
        }

        public Builder addGameVersion(String gameVersion) {
            this.gameVersion.add(gameVersion);
            return this;
        }

        public Builder addGameVersion(String... gameVersion) {
            this.gameVersion.addAll(Arrays.asList(gameVersion));
            return this;
        }

        public Builder addGameVersion(Collection<String> gameVersion) {
            this.gameVersion.addAll(gameVersion);
            return this;
        }

        public List<SortableGameVersionJson> getSortableGameVersion() {
            return sortableGameVersion;
        }

        public Builder setSortableGameVersion(
                Collection<SortableGameVersionJson> sortableGameVersion) {
            this.sortableGameVersion.clear();
            this.sortableGameVersion.addAll(sortableGameVersion);
            return this;
        }

        public Builder addSortableGameVersion(
                SortableGameVersionJson sortableGameVersion) {
            this.sortableGameVersion.add(sortableGameVersion);
            return this;
        }

        public Builder addSortableGameVersion(
                SortableGameVersionJson... sortableGameVersion) {
            this.sortableGameVersion.addAll(Arrays.asList(sortableGameVersion));
            return this;
        }

        public Builder addSortableGameVersion(
                Collection<SortableGameVersionJson> sortableGameVersion) {
            this.sortableGameVersion.addAll(sortableGameVersion);
            return this;
        }

        public Object getInstallMetadata() {
            return installMetadata;
        }

        public Builder setInstallMetadata(Object installMetadata) {
            this.installMetadata = installMetadata;
            return this;
        }

        public Object getChangelog() {
            return changelog;
        }

        public Builder setChangelog(Object changelog) {
            this.changelog = changelog;
            return this;
        }

        public boolean isHasInstallScript() {
            return hasInstallScript;
        }

        public Builder setHasInstallScript(boolean hasInstallScript) {
            this.hasInstallScript = hasInstallScript;
            return this;
        }

        public boolean isCompatibleWithClient() {
            return isCompatibleWithClient;
        }

        public Builder setCompatibleWithClient(boolean isCompatibleWithClient) {
            this.isCompatibleWithClient = isCompatibleWithClient;
            return this;
        }

        public long getCategorySectionPackageType() {
            return categorySectionPackageType;
        }

        public Builder setCategorySectionPackageType(long categorySectionPackageType) {
            this.categorySectionPackageType = categorySectionPackageType;
            return this;
        }

        public long getRestrictProjectFileAccess() {
            return restrictProjectFileAccess;
        }

        public Builder setRestrictProjectFileAccess(long restrictProjectFileAccess) {
            this.restrictProjectFileAccess = restrictProjectFileAccess;
            return this;
        }

        public long getProjectStatus() {
            return projectStatus;
        }

        public Builder setProjectStatus(long projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }

        public long getRenderCacheId() {
            return renderCacheId;
        }

        public Builder setRenderCacheId(long renderCacheId) {
            this.renderCacheId = renderCacheId;
            return this;
        }

        public Object getFileLegacyMappingId() {
            return fileLegacyMappingId;
        }

        public Builder setFileLegacyMappingId(Object fileLegacyMappingId) {
            this.fileLegacyMappingId = fileLegacyMappingId;
            return this;
        }

        public long getProjectId() {
            return projectId;
        }

        public Builder setProjectId(long projectId) {
            this.projectId = projectId;
            return this;
        }

        public Object getParentProjectFileId() {
            return parentProjectFileId;
        }

        public Builder setParentProjectFileId(Object parentProjectFileId) {
            this.parentProjectFileId = parentProjectFileId;
            return this;
        }

        public Object getParentFileLegacyMappingId() {
            return parentFileLegacyMappingId;
        }

        public Builder setParentFileLegacyMappingId(Object parentFileLegacyMappingId) {
            this.parentFileLegacyMappingId = parentFileLegacyMappingId;
            return this;
        }

        public Object getFileTypeId() {
            return fileTypeId;
        }

        public Builder setFileTypeId(Object fileTypeId) {
            this.fileTypeId = fileTypeId;
            return this;
        }

        public Object getExposeAsAlternative() {
            return exposeAsAlternative;
        }

        public Builder setExposeAsAlternative(Object exposeAsAlternative) {
            this.exposeAsAlternative = exposeAsAlternative;
            return this;
        }

        public long getPackageFingerprintId() {
            return packageFingerprintId;
        }

        public Builder setPackageFingerprintId(long packageFingerprintId) {
            this.packageFingerprintId = packageFingerprintId;
            return this;
        }

        public Date getGameVersionDateReleased() {
            return gameVersionDateReleased;
        }

        public Builder setGameVersionDateReleased(Date gameVersionDateReleased) {
            this.gameVersionDateReleased = gameVersionDateReleased;
            return this;
        }

        public long getGameVersionMappingId() {
            return gameVersionMappingId;
        }

        public Builder setGameVersionMappingId(long gameVersionMappingId) {
            this.gameVersionMappingId = gameVersionMappingId;
            return this;
        }

        public long getGameVersionId() {
            return gameVersionId;
        }

        public Builder setGameVersionId(long gameVersionId) {
            this.gameVersionId = gameVersionId;
            return this;
        }

        public long getGameId() {
            return gameId;
        }

        public Builder setGameId(long gameId) {
            this.gameId = gameId;
            return this;
        }

        public boolean isServerPack() {
            return isServerPack;
        }

        public Builder setServerPack(boolean isServerPack) {
            this.isServerPack = isServerPack;
            return this;
        }

        public Object getServerPackFileId() {
            return serverPackFileId;
        }

        public Builder setServerPackFileId(Object serverPackFileId) {
            this.serverPackFileId = serverPackFileId;
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
