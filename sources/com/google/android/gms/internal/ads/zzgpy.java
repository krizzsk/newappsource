package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzgpy extends zzgpq {
    private static final zzgqh zza = zzgpv.zza(Collections.emptyMap());

    public /* synthetic */ zzgpy(Map map, zzgpw zzgpw) {
        super(map);
    }

    public static zzgpx zzc(int i) {
        return new zzgpx(i, (zzgpw) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzgpr.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgqh) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
