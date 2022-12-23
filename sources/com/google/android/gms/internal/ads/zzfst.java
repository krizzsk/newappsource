package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfst extends zzfrm {
    private final transient zzfrk zza;
    private final transient zzfrh zzb;

    public zzfst(zzfrk zzfrk, zzfrh zzfrh) {
        this.zza = zzfrk;
        this.zzb = zzfrh;
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
        return this.zzb.zza(objArr, i);
    }

    public final zzfrh zzd() {
        return this.zzb;
    }

    public final zzftg zze() {
        return this.zzb.listIterator(0);
    }

    public final boolean zzf() {
        throw null;
    }
}
