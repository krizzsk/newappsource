package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
public final class zzbie {
    public static final void zza(zzbid zzbid, zzbib zzbib) {
        if (zzbib.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzbib.zzb())) {
            zzbid.zzd(zzbib.zza(), zzbib.zzb(), zzbib.zzc(), zzbib.zzd());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
