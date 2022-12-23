package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

final class zzxa {
    public static void zza(Surface surface, float f) {
        int i;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            zzdn.zza("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
