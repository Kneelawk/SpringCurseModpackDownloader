package com.kneelawk.springtest.curse;

import com.kneelawk.springtest.json.ManifestJson;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.nio.file.Path;
import java.util.Objects;

/**
 * Created by Kneelawk on 8/11/19.
 */
public class Modpack {
    private final ManifestJson manifest;
    private final Path file;

    private Modpack(ManifestJson manifest, Path file) {
        this.manifest = manifest;
        this.file = file;
    }

    public ManifestJson getManifest() {
        return manifest;
    }

    public Path getFile() {
        return file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modpack modpack = (Modpack) o;
        return manifest.equals(modpack.manifest) &&
                file.equals(modpack.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifest, file);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("manifest", manifest)
                .append("file", file)
                .toString();
    }

    public static Modpack create(ManifestJson manifest, Path file) {
        if (manifest == null)
            throw new NullPointerException("Manifest cannot be null");
        if (file == null)
            throw new NullPointerException("File cannot be null");
        return new Modpack(manifest, file);
    }

    public static class Builder {
        private ManifestJson manifest;
        private Path file;

        public Builder() {
        }

        public Builder(ManifestJson manifest, Path file) {
            this.manifest = manifest;
            this.file = file;
        }

        public Modpack build() {
            if (manifest == null)
                throw new IllegalStateException("No manifest specified");
            if (file == null)
                throw new IllegalStateException("No file specified");
            return new Modpack(manifest, file);
        }

        public ManifestJson getManifest() {
            return manifest;
        }

        public Builder setManifest(ManifestJson manifest) {
            this.manifest = manifest;
            return this;
        }

        public Path getFile() {
            return file;
        }

        public Builder setFile(Path file) {
            this.file = file;
            return this;
        }
    }
}
