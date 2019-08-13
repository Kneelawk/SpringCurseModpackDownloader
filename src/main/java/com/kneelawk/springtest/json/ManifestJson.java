
package com.kneelawk.springtest.json;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minecraft",
    "manifestType",
    "manifestVersion",
    "name",
    "version",
    "author",
    "projectID",
    "files",
    "overrides"
})
public class ManifestJson {

    @JsonProperty("minecraft")
    private MinecraftJson minecraft;
    @JsonProperty("manifestType")
    private String manifestType;
    @JsonProperty("manifestVersion")
    private long manifestVersion;
    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;
    @JsonProperty("author")
    private String author;
    @JsonProperty("projectID")
    private long projectID;
    @JsonProperty("files")
    private List<FileJson> files = Lists.newArrayList();
    @JsonProperty("overrides")
    private String overrides;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ManifestJson() {
    }

    private ManifestJson(MinecraftJson minecraft, String manifestType, long manifestVersion, String name,
                        String version, String author, long projectID,
                        List<FileJson> files, String overrides) {
        this.minecraft = minecraft;
        this.manifestType = manifestType;
        this.manifestVersion = manifestVersion;
        this.name = name;
        this.version = version;
        this.author = author;
        this.projectID = projectID;
        this.files = files;
        this.overrides = overrides;
    }

    public MinecraftJson getMinecraft() {
        return minecraft;
    }

    public String getManifestType() {
        return manifestType;
    }

    public long getManifestVersion() {
        return manifestVersion;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }

    public long getProjectID() {
        return projectID;
    }

    public List<FileJson> getFiles() {
        return files;
    }

    public String getOverrides() {
        return overrides;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("minecraft", minecraft)
                .append("manifestType", manifestType)
                .append("manifestVersion", manifestVersion)
                .append("name", name)
                .append("version", version)
                .append("author", author)
                .append("projectID", projectID)
                .append("files", files)
                .append("overrides", overrides)
                .toString();
    }

    public static class Builder {
        private MinecraftJson minecraft;
        private String manifestType;
        private long manifestVersion;
        private String name;
        private String version;
        private String author;
        private long projectID;
        private final List<FileJson> files =
                Lists.newArrayList();
        private String overrides;

        public Builder() {
        }

        public Builder(MinecraftJson minecraft, String manifestType,
                       long manifestVersion, String name, String version, String author,
                       long projectID, Collection<FileJson> files,
                       String overrides) {
            this.minecraft = minecraft;
            this.manifestType = manifestType;
            this.manifestVersion = manifestVersion;
            this.name = name;
            this.version = version;
            this.author = author;
            this.projectID = projectID;
            this.files.addAll(files);
            this.overrides = overrides;
        }

        public ManifestJson build() {
            if (minecraft == null)
                throw new IllegalStateException("No minecraft specified");
            if (manifestType == null)
                throw new IllegalStateException("No manifestType specified");
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (version == null)
                throw new IllegalStateException("No version specified");
            if (author == null)
                throw new IllegalStateException("No author specified");
            if (overrides == null)
                throw new IllegalStateException("No overrides specified");
            return new ManifestJson(minecraft, manifestType, manifestVersion, name, version, author, projectID,
                    ImmutableList.copyOf(files), overrides);
        }

        public MinecraftJson getMinecraft() {
            return minecraft;
        }

        public Builder setMinecraft(MinecraftJson minecraft) {
            this.minecraft = minecraft;
            return this;
        }

        public String getManifestType() {
            return manifestType;
        }

        public Builder setManifestType(String manifestType) {
            this.manifestType = manifestType;
            return this;
        }

        public long getManifestVersion() {
            return manifestVersion;
        }

        public Builder setManifestVersion(long manifestVersion) {
            this.manifestVersion = manifestVersion;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getAuthor() {
            return author;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public long getProjectID() {
            return projectID;
        }

        public Builder setProjectID(long projectID) {
            this.projectID = projectID;
            return this;
        }

        public List<FileJson> getFiles() {
            return files;
        }

        public Builder setFiles(Collection<FileJson> files) {
            this.files.clear();
            this.files.addAll(files);
            return this;
        }

        public Builder addFile(FileJson file) {
            this.files.add(file);
            return this;
        }

        public Builder addFile(FileJson... files) {
            this.files.addAll(Arrays.asList(files));
            return this;
        }

        public Builder addFiles(Collection<FileJson> files) {
            this.files.addAll(files);
            return this;
        }

        public String getOverrides() {
            return overrides;
        }

        public Builder setOverrides(String overrides) {
            this.overrides = overrides;
            return this;
        }
    }
}
