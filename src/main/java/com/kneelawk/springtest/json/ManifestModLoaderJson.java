
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "primary"
})
public class ManifestModLoaderJson {

    @JsonProperty("id")
    private String id;
    @JsonProperty("primary")
    private boolean primary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ManifestModLoaderJson() {
    }

    private ManifestModLoaderJson(String id, boolean primary) {
        this.id = id;
        this.primary = primary;
    }

    public String getId() {
        return id;
    }

    public boolean isPrimary() {
        return primary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("primary", primary)
                .toString();
    }

    public static ManifestModLoaderJson create(String id, boolean primary) {
        if (id == null)
            throw new NullPointerException("Id cannot be null");
        return new ManifestModLoaderJson(id, primary);
    }

    public static class Builder {
        private String id;
        private boolean primary;

        public Builder() {
        }

        public Builder(String id, boolean primary) {
            this.id = id;
            this.primary = primary;
        }

        public ManifestModLoaderJson build() {
            if (id == null)
                throw new IllegalStateException("No id specified");
            return new ManifestModLoaderJson(id, primary);
        }

        public String getId() {
            return id;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public boolean isPrimary() {
            return primary;
        }

        public Builder setPrimary(boolean primary) {
            this.primary = primary;
            return this;
        }
    }
}
