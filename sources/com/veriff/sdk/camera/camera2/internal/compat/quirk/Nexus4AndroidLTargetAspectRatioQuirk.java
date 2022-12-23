package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

public class Nexus4AndroidLTargetAspectRatioQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList(new String[]{"NEXUS 4"});

    public static boolean load() {
        if (!"GOOGLE".equals(Build.BRAND.toUpperCase()) || Build.VERSION.SDK_INT >= 23 || !DEVICE_MODELS.contains(Build.MODEL.toUpperCase())) {
            return false;
        }
        return true;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
