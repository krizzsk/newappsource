package com.veriff.sdk.camera.core;

public class CameraUnavailableException extends Exception {
    private final int mReason;

    public CameraUnavailableException(int i, Throwable th) {
        super(th);
        this.mReason = i;
    }
}
