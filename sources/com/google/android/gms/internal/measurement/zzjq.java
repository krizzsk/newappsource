package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzjq {
    public static final zzjq zza = new zzjq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzjq zzd;
    private final Map zze;

    public zzjq() {
        this.zze = new HashMap();
    }

    public static zzjq zza() {
        Class<zzjq> cls = zzjq.class;
        zzjq zzjq = zzd;
        if (zzjq != null) {
            return zzjq;
        }
        synchronized (cls) {
            zzjq zzjq2 = zzd;
            if (zzjq2 != null) {
                return zzjq2;
            }
            zzjq zzb2 = zzjy.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzkc zzb(zzll zzll, int i) {
        return (zzkc) this.zze.get(new zzjp(zzll, i));
    }

    public zzjq(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
