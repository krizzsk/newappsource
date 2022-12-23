package com.veriff.sdk.camera.view.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Quirk;

public class SurfaceViewStretchedQuirk implements Quirk {
    public static boolean load() {
        if (!"SAMSUNG".equals(Build.MANUFACTURER.toUpperCase()) || !"F2Q".equals(Build.DEVICE.toUpperCase())) {
            return false;
        }
        return true;
    }
}
