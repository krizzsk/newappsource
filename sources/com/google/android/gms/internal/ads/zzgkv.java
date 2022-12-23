package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class zzgkv extends AbstractList {
    private final List zza;
    private final zzgku zzb;

    public zzgkv(List list, zzgku zzgku) {
        this.zza = list;
        this.zzb = zzgku;
    }

    public final Object get(int i) {
        zzbej zzb2 = zzbej.zzb(((Integer) this.zza.get(i)).intValue());
        if (zzb2 == null) {
            return zzbej.AD_FORMAT_TYPE_UNSPECIFIED;
        }
        return zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
