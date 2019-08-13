package com.kneelawk.springtest.curse;

import com.kneelawk.springtest.json.AddonFileJson;
import com.kneelawk.springtest.json.FileJson;

import java.nio.file.Path;

/**
 * Created by Kneelawk on 8/4/19.
 */
public class ModDownloadResult {
    private final AddonFileJson addonFile;
    private final Path downloadedFile;

    public ModDownloadResult(AddonFileJson addonFile, Path downloadedFile) {
        this.addonFile = addonFile;
        this.downloadedFile = downloadedFile;
    }

    public AddonFileJson getAddonFile() {
        return addonFile;
    }

    public Path getDownloadedFile() {
        return downloadedFile;
    }
}
