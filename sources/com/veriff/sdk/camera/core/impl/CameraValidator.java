package com.veriff.sdk.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.Logger;

public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void validateCameras(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer num;
        if (cameraSelector != null) {
            try {
                num = cameraSelector.getLensFacing();
                if (num == null) {
                    Logger.m32245w("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                Logger.m32242e("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            num = null;
        }
        StringBuilder k = C13555b.m33972k("Verifying camera lens facing on ");
        k.append(Build.DEVICE);
        k.append(", lensFacingInteger: ");
        k.append(num);
        Logger.m32239d("CameraValidator", k.toString());
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || num.intValue() == 1)) {
                CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (cameraSelector == null || num.intValue() == 0) {
                CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
            }
        } catch (IllegalArgumentException e2) {
            StringBuilder k2 = C13555b.m33972k("Camera LensFacing verification failed, existing cameras: ");
            k2.append(cameraRepository.getCameras());
            Logger.m32241e("CameraValidator", k2.toString());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }
}
