package com.kneelawk.springtest.net;

/**
 * Created by Kneelawk on 8/4/19.
 */
public class ProgressEvent {
    private final long current;
    private final long max;
    private final String message;

    private ProgressEvent(long current, long max, String message) {
        this.current = current;
        this.max = max;
        this.message = message;
    }

    public long getCurrent() {
        return current;
    }

    public long getMax() {
        return max;
    }

    public String getMessage() {
        return message;
    }

    public static ProgressEvent create(long current, long max, String message) {
        if (message == null)
            throw new NullPointerException("Message cannot be null");
        return new ProgressEvent(current, max, message);
    }

    public static ProgressEvent createDownloadKb(long current, long max, String displayName) {
        StringBuilder message = new StringBuilder("Downloading");

        if (displayName != null) {
            message.append(' ').append(displayName);
        }

        message.append("...");

        if (current > 0) {
            message.append(' ').append(current / 1000);
            if (max > 0) {
                message.append('/').append(max / 1000);
            }
            message.append("kb");
        }

        return new ProgressEvent(current, max, message.toString());
    }

    public static ProgressEvent createDownloadMods(long modsDownloaded, long numMods, String displayName) {
        StringBuilder message = new StringBuilder("Downloading");

        if (displayName != null) {
            message.append(' ').append(displayName);
        }

        message.append(" Mods...");

        if (modsDownloaded > 0) {
            message.append(' ').append(modsDownloaded / 1000);
            if (numMods > 0) {
                message.append('/').append(numMods / 1000);
            }
        }

        return new ProgressEvent(modsDownloaded, numMods, message.toString());
    }
}
