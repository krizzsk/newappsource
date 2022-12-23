package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

public final class zzfje {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfje zza = new zzfje();
    private Context zzb;

    private zzfje() {
    }

    public static zzfje zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
