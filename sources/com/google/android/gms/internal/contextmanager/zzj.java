package com.google.android.gms.internal.contextmanager;

import android.util.Log;

public final class zzj {
    public static String zza(String str, String str2) {
        if (zzd(6)) {
            return zzc(str, str2, new Object[0]);
        }
        return "";
    }

    public static String zzb(String str, String str2, Object obj) {
        if (!zzd(6)) {
            return "";
        }
        return zzc(str, str2, obj);
    }

    private static String zzc(String str, String str2, Object... objArr) {
        if (objArr.length == 0) {
            return String.format("[%s]%s", new Object[]{str, str2});
        }
        String valueOf = String.valueOf(String.format("[%s]", new Object[]{str}));
        String valueOf2 = String.valueOf(String.format(str2, objArr));
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    private static boolean zzd(int i) {
        return Log.isLoggable("ctxmgr", 6);
    }
}
