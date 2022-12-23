package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

public class zzcfi {
    public static final zzfpe zza = zzfpe.zzb(4000);

    @VisibleForTesting
    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            return C16759e.m42350f(str, " @", stackTrace[3].getLineNumber());
        }
        return str;
    }

    public static void zze(String str) {
        if (zzm(3) && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (zzm(6) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzh(String str, Throwable th) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (zzm(4) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzj(String str) {
        if (zzm(5) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th) {
        if (!zzm(5)) {
            return;
        }
        if (th != null) {
            zzk(zzd(str), th);
        } else {
            zzj(zzd(str));
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
