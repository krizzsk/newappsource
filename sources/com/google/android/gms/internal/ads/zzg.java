package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

final class zzg {
    public static void zza(AudioAttributes.Builder builder, int i) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", new Class[]{Integer.TYPE}).invoke(builder, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }
}
