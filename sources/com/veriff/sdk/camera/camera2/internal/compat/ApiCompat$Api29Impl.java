package com.veriff.sdk.camera.camera2.internal.compat;

import android.hardware.camera2.CameraManager;

public class ApiCompat$Api29Impl {
    public static void onCameraAccessPrioritiesChanged(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
