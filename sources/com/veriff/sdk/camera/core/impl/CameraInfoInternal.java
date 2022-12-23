package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.CameraInfo;
import java.util.concurrent.Executor;

public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    String getCameraId();

    Quirks getCameraQuirks();

    Integer getLensFacing();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);
}
