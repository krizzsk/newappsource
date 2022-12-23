package com.google.android.gms.internal.contextmanager;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzos extends AbstractList<String> implements RandomAccess, zzmx {
    /* access modifiers changed from: private */
    public final zzmx zza;

    public zzos(zzmx zzmx) {
        this.zza = zzmx;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzmw) this.zza).get(i);
    }

    public final Iterator<String> iterator() {
        return new zzor(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzoq(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzmx zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List<?> zzh() {
        return this.zza.zzh();
    }
}
