package com.veriff.sdk.camera.view.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.core.impl.Quirk;

public class PreviewOneThirdWiderQuirk implements Quirk {
    public static boolean load() {
        boolean z;
        String str = Build.DEVICE;
        if (!"ON5XELTE".equals(str.toUpperCase()) || Build.VERSION.SDK_INT < 26) {
            z = false;
        } else {
            z = true;
        }
        boolean equals = "A3Y17LTE".equals(str.toUpperCase());
        if (z || equals) {
            return true;
        }
        return false;
    }

    public float getCropRectScaleX() {
        return 0.75f;
    }
}
