package com.google.android.gms.internal.nearby;

import java.util.Iterator;

final class zzsx extends zzss {
    public final transient Object zza;

    public zzsx(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzst(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('[');
        q.append(this.zza.toString());
        q.append(']');
        return q.toString();
    }

    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzsq zzd() {
        return zzsq.zzm(this.zza);
    }

    public final zzsy zze() {
        return new zzst(this.zza);
    }

    public final boolean zzf() {
        throw null;
    }
}
