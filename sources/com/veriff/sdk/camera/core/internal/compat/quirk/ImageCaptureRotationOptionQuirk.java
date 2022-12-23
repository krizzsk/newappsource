package com.veriff.sdk.camera.core.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.Quirk;

public final class ImageCaptureRotationOptionQuirk implements Quirk {
    private static boolean isHonor9X() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isHuaweiMate20Lite() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isHuaweiMate20Lite() || isHonor9X();
    }

    public boolean isSupported(Config.Option<?> option) {
        return option != CaptureConfig.OPTION_ROTATION;
    }
}
