package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

final class zzas extends zzam {
    public final /* synthetic */ zzat zza;

    public zzas(zzat zzat) {
        this.zza = zzat;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzab.zza(i, this.zza.zzc, "index");
        zzat zzat = this.zza;
        int i2 = i + i;
        Object obj = zzat.zzb[i2];
        obj.getClass();
        Object obj2 = zzat.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
