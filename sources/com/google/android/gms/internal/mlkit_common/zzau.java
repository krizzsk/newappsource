package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

final class zzau extends zzap {
    private final transient zzao zza;
    private final transient zzam zzb;

    public zzau(zzao zzao, zzam zzam) {
        this.zza = zzao;
        this.zzb = zzam;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzay zzd() {
        return this.zzb.listIterator(0);
    }
}
