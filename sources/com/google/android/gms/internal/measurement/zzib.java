package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p241s0.C6302b;

public final class zzib implements zzhj {
    private static final Map zza = new C6302b();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzib zza(Context context, String str, Runnable runnable) {
        zzib zzib;
        if (!zzha.zzb()) {
            synchronized (zzib.class) {
                zzib = (zzib) zza.get((Object) null);
                if (zzib == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return zzib;
        }
        throw null;
    }

    public static synchronized void zzc() {
        synchronized (zzib.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzib) it.next()).zzb;
                throw null;
            }
        }
    }

    public final Object zzb(String str) {
        throw null;
    }
}
