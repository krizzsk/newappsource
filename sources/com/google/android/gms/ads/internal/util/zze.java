package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcfi;

public final class zze extends zzcfi {
    public static void zza(String str) {
        if (zzc() && str != null && str.length() > 4000) {
            for (String str2 : zzcfi.zza.zzd(str)) {
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        if (!zzcfi.zzm(2) || !((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return false;
        }
        return true;
    }
}
