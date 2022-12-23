package com.google.android.gms.internal.contextmanager;

import java.util.Iterator;
import java.util.Map;

final class zzni {
    public static final int zza(int i, Object obj, Object obj2) {
        zznh zznh = (zznh) obj;
        zzng zzng = (zzng) obj2;
        if (zznh.isEmpty()) {
            return 0;
        }
        Iterator it = zznh.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zznh zznh = (zznh) obj;
        zznh zznh2 = (zznh) obj2;
        if (!zznh2.isEmpty()) {
            if (!zznh.zze()) {
                zznh = zznh.zzb();
            }
            zznh.zzd(zznh2);
        }
        return zznh;
    }
}
