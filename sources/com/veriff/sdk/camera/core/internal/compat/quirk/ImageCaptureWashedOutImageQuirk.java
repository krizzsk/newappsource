package com.veriff.sdk.camera.core.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ImageCaptureWashedOutImageQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList(new String[]{"SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P"});

    public static boolean load() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!"SAMSUNG".equals(str.toUpperCase(locale)) || !DEVICE_MODELS.contains(Build.MODEL.toUpperCase(locale))) {
            return false;
        }
        return true;
    }
}
