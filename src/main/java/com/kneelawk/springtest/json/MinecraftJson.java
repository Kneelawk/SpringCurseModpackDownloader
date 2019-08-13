
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
    "version",
    "modLoaders"
})
public class MinecraftJson {

    @JsonProperty("version")
    private String version;
    @JsonProperty("modLoaders")
    private List<ManifestModLoaderJson> modLoaders = Lists.newArrayList();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MinecraftJson() {
    }

    private MinecraftJson(String version, List<ManifestModLoaderJson> modLoaders) {
        this.version = version;
        this.modLoaders = modLoaders;
    }

    public String getVersion() {
        return version;
    }

    public List<ManifestModLoaderJson> getModLoaders() {
        return modLoaders;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("version", version)
                .append("modLoaders", modLoaders)
                .toString();
    }

    public static MinecraftJson create(String version, Iterable<ManifestModLoaderJson>
            modLoaders) {
        if (version == null)
            throw new NullPointerException("Version cannot be null");
        return new MinecraftJson(version, ImmutableList.copyOf(modLoaders));
    }

    public static MinecraftJson create(String version, ManifestModLoaderJson...
            modLoaders) {
        if (version == null)
            throw new NullPointerException("Version cannot be null");
        return new MinecraftJson(version, ImmutableList.copyOf(modLoaders));
    }

    public static class Builder {
        private String version;
        private final List<ManifestModLoaderJson> modLoaders =
                Lists.newArrayList();

        public Builder() {
        }

        public Builder(String version,
                       Collection<ManifestModLoaderJson> modLoaders) {
            this.version = version;
            this.modLoaders.addAll(modLoaders);
        }

        public MinecraftJson build() {
            if (version == null)
                throw new IllegalStateException("No version specified");
            return new MinecraftJson(version, ImmutableList.copyOf(modLoaders));
        }

        public String getVersion() {
            return version;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public List<ManifestModLoaderJson> getModLoaders() {
            return modLoaders;
        }

        public Builder setModLoaders(Collection<ManifestModLoaderJson> modLoaders) {
            this.modLoaders.clear();
            this.modLoaders.addAll(modLoaders);
            return this;
        }

        public Builder addModLoader(ManifestModLoaderJson modLoader) {
            this.modLoaders.add(modLoader);
            return this;
        }

        public Builder addModLoader(ManifestModLoaderJson... modLoaders) {
            this.modLoaders.addAll(Arrays.asList(modLoaders));
            return this;
        }

        public Builder addModLoaders(Collection<ManifestModLoaderJson> modLoaders) {
            this.modLoaders.addAll(modLoaders);
            return this;
        }
    }
}
