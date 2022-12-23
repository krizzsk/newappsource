package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

final class zzfg {
    public static final int zza(int i, Object obj, Object obj2) {
        zzff zzff = (zzff) obj;
        zzfe zzfe = (zzfe) obj2;
        if (zzff.isEmpty()) {
            return 0;
        }
        Iterator it = zzff.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzff zzff = (zzff) obj;
        zzff zzff2 = (zzff) obj2;
        if (!zzff2.isEmpty()) {
            if (!zzff.zze()) {
                zzff = zzff.zzb();
            }
            zzff.zzd(zzff2);
        }
        return zzff;
    }
}
