package com.google.android.gms.internal.p986firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Map;
import java.util.concurrent.Executor;
import p241s0.C6302b;
import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr */
public final class zzxr {
    private static final Map zza = new C6302b();

    public static C13416c zza(String str, C13416c cVar, zzxd zzxd) {
        zze(str, zzxd);
        return new zzxp(cVar, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, C13416c cVar, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzxq zzxq = (zzxq) map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzxq.zzb < 120000) {
                zzxd zzxd = zzxq.zza;
                if (zzxd == null) {
                    return true;
                }
                zzxd.zzh(cVar, activity, executor, str);
                return true;
            }
            zze(str, (zzxd) null);
            return false;
        }
        zze(str, (zzxd) null);
        return false;
    }

    private static void zze(String str, zzxd zzxd) {
        zza.put(str, new zzxq(zzxd, DefaultClock.getInstance().currentTimeMillis()));
    }
}
