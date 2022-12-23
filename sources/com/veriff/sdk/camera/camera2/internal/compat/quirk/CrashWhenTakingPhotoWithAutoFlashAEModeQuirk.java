package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements Quirk {
    public static final List<String> AFFECTED_MODELS = Arrays.asList(new String[]{"5059X"});

    public static boolean load() {
        boolean z;
        if (!"SAMSUNG".equals(Build.MANUFACTURER.toUpperCase()) || !Build.MODEL.toUpperCase().startsWith("SM-A300")) {
            z = false;
        } else {
            z = true;
        }
        if (z || AFFECTED_MODELS.contains(Build.MODEL.toUpperCase())) {
            return true;
        }
        return false;
    }
}
