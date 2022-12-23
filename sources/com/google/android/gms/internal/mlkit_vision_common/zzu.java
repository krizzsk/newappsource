package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

final class zzu extends zzp {
    public final /* synthetic */ zzv zza;

    public zzu(zzv zzv) {
        this.zza = zzv;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzf.zza(i, this.zza.zzc, "index");
        zzv zzv = this.zza;
        int i2 = i + i;
        Object obj = zzv.zzb[i2];
        obj.getClass();
        Object obj2 = zzv.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
