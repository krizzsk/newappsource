package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.List;

public final class zzvg<F, T> extends AbstractList<T> {
    private final List<F> zza;
    private final zzvf<F, T> zzb;

    public zzvg(List<F> list, zzvf<F, T> zzvf) {
        this.zza = list;
        this.zzb = zzvf;
    }

    public final T get(int i) {
        return this.zzb.zzb(this.zza.get(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
