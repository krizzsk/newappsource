package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.CameraQuirks;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.CamcorderProfileResolutionValidator;
import com.veriff.sdk.camera.core.Logger;

public class Camera2CamcorderProfileProvider {
    public Camera2CamcorderProfileProvider(String str, CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Logger.m32245w("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
        }
        new CamcorderProfileResolutionValidator((CamcorderProfileResolutionQuirk) CameraQuirks.get(str, cameraCharacteristicsCompat).get(CamcorderProfileResolutionQuirk.class));
    }
}
