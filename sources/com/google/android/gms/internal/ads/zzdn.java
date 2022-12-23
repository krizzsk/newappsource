package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class zzdn {
    public static void zza(String str, String str2, Throwable th) {
        zzc(str2, th);
    }

    public static void zzb(String str, String str2, Throwable th) {
        zzc(str2, th);
    }

    private static String zzc(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return C25541a.m63882l(str, "\n  ", str2.replace("\n", "\n  "), "\n");
        }
        return str;
    }
}
