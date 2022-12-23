package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.veriff.sdk.camera.core.CameraUnavailableException;

public final class CameraUnavailableExceptionHelper {
    public static CameraUnavailableException createFrom(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i = 5;
        if (reason == 1) {
            i = 1;
        } else if (reason == 2) {
            i = 2;
        } else if (reason == 3) {
            i = 3;
        } else if (reason == 4) {
            i = 4;
        } else if (reason != 5) {
            if (reason != 10001) {
                i = 0;
            } else {
                i = 6;
            }
        }
        return new CameraUnavailableException(i, cameraAccessExceptionCompat);
    }
}
