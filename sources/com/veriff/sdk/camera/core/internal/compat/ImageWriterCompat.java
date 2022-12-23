package com.veriff.sdk.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

public final class ImageWriterCompat {
    public static ImageWriter newInstance(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i, i2);
        }
        if (i3 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i, i2);
        }
        throw new RuntimeException(C25541a.m63878h("Unable to call newInstance(Surface, int, int) on API ", i3, ". Version 26 or higher required."));
    }
}
