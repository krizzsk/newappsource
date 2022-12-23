package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzfju {
    public static float zza(View view) {
        return view.getZ();
    }

    public static String zzb(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == 4) {
                return "viewInvisible";
            }
            if (visibility != 8) {
                return "viewNotVisible";
            }
            return "viewGone";
        } else if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
            return "viewAlphaZero";
        } else {
            return null;
        }
    }
}
