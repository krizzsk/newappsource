package com.veriff.sdk.camera.core.impl;

import android.content.Context;
import com.veriff.sdk.camera.core.CameraInfo;
import fd0.C12682c;

public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new C12682c();

    CameraConfig getConfig(CameraInfo cameraInfo, Context context);
}
