package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.impl.Quirk;

public class AspectRatioLegacyApi21Quirk implements Quirk {
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
