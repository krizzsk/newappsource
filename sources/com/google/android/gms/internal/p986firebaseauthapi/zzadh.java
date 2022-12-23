package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadh */
final class zzadh {
    public static final int zza(int i, Object obj, Object obj2) {
        zzadg zzadg = (zzadg) obj;
        zzadf zzadf = (zzadf) obj2;
        if (zzadg.isEmpty()) {
            return 0;
        }
        Iterator it = zzadg.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzadg) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzadg zzadg = (zzadg) obj;
        zzadg zzadg2 = (zzadg) obj2;
        if (!zzadg2.isEmpty()) {
            if (!zzadg.zze()) {
                zzadg = zzadg.zzb();
            }
            zzadg.zzd(zzadg2);
        }
        return zzadg;
    }
}
