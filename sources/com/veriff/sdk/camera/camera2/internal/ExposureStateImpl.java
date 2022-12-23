package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;

class ExposureStateImpl {
    private int mExposureCompensation;
    private final Object mLock = new Object();

    public ExposureStateImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i) {
        this.mExposureCompensation = i;
    }

    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.mLock) {
            i = this.mExposureCompensation;
        }
        return i;
    }

    public void setExposureCompensationIndex(int i) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i;
        }
    }
}
