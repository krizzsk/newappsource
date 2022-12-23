package com.veriff.sdk.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

public class ApiCompat$Api26Impl {
    public static <T> OutputConfiguration newOutputConfiguration(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
