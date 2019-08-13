
package com.kneelawk.springtest.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "foldername",
    "fingerprint",
    "type"
})
public class ModuleJson {

    @JsonProperty("foldername")
    private String foldername;
    @JsonProperty("fingerprint")
    private long fingerprint;
    @JsonProperty("type")
    private long type;

    public ModuleJson() {
    }

    private ModuleJson(String foldername, long fingerprint, long type) {
        this.foldername = foldername;
        this.fingerprint = fingerprint;
        this.type = type;
    }

    public String getFoldername() {
        return foldername;
    }

    public long getFingerprint() {
        return fingerprint;
    }

    public long getType() {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("foldername", foldername)
                .append("fingerprint", fingerprint)
                .append("type", type)
                .toString();
    }

    public static ModuleJson create(String foldername, long fingerprint, long type) {
        if (foldername == null)
            throw new NullPointerException("Foldername cannot be null");
        return new ModuleJson(foldername, fingerprint, type);
    }

    public static class Builder {
        private String foldername;
        private long fingerprint;
        private long type;

        public Builder() {
        }

        public Builder(String foldername, long fingerprint, long type) {
            this.foldername = foldername;
            this.fingerprint = fingerprint;
            this.type = type;
        }

        public ModuleJson build() {
            if (foldername == null)
                throw new IllegalStateException("No foldername specified");
            return new ModuleJson(foldername, fingerprint, type);
        }

        public String getFoldername() {
            return foldername;
        }

        public Builder setFoldername(String foldername) {
            this.foldername = foldername;
            return this;
        }

        public long getFingerprint() {
            return fingerprint;
        }

        public Builder setFingerprint(long fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public long getType() {
            return type;
        }

        public Builder setType(long type) {
            this.type = type;
            return this;
        }
    }
}
