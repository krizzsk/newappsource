package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

final class zzcs extends zzcc {
    public final /* synthetic */ zzct zza;

    public zzcs(zzct zzct) {
        this.zza = zzct;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzaq.zza(i, this.zza.zzc, "index");
        zzct zzct = this.zza;
        int i2 = i + i;
        Object obj = zzct.zzb[i2];
        obj.getClass();
        Object obj2 = zzct.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
