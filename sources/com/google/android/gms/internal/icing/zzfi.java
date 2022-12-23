package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzfi extends AbstractList<String> implements RandomAccess, zzdo {
    /* access modifiers changed from: private */
    public final zzdo zza;

    public zzfi(zzdo zzdo) {
        this.zza = zzdo;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzdn) this.zza).get(i);
    }

    public final Iterator<String> iterator() {
        return new zzfh(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzfg(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zzf(zzcf zzcf) {
        throw new UnsupportedOperationException();
    }

    public final Object zzg(int i) {
        return this.zza.zzg(i);
    }

    public final List<?> zzh() {
        return this.zza.zzh();
    }

    public final zzdo zzi() {
        return this;
    }
}
