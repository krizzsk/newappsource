package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.PreviewConfig;
import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

public class SamsungPreviewTargetAspectRatioQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList(new String[]{"SM-J710MN", "SM-T580"});

    public static boolean load() {
        if (!"SAMSUNG".equals(Build.BRAND.toUpperCase()) || !DEVICE_MODELS.contains(Build.MODEL.toUpperCase())) {
            return false;
        }
        return true;
    }

    public boolean require16_9(Config config) {
        return config instanceof PreviewConfig;
    }
}
