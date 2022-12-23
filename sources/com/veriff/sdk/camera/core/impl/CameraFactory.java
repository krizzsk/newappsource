package com.veriff.sdk.camera.core.impl;

import android.content.Context;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.InitializationException;
import java.util.Set;

public interface CameraFactory {

    public interface Provider {
        CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) throws InitializationException;
    }

    Set<String> getAvailableCameraIds();

    CameraInternal getCamera(String str) throws CameraUnavailableException;

    Object getCameraManager();
}
