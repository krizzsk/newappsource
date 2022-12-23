package com.veriff.sdk.camera.core;

import androidx.lifecycle.LiveData;

public interface CameraInfo {
    String getImplementationType();

    int getSensorRotationDegrees(int i);

    LiveData<Integer> getTorchState();

    boolean hasFlashUnit();
}
