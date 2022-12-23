package com.google.android.exoplayer2.drm;

public final class UnsupportedDrmException extends Exception {
    public final int reason;

    public UnsupportedDrmException() {
        this.reason = 1;
    }

    public UnsupportedDrmException(int i, Exception exc) {
        super(exc);
        this.reason = i;
    }
}
