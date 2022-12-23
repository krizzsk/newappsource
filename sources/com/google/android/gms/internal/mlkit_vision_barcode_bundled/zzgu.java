package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzgu extends AbstractList implements RandomAccess, zzev {
    /* access modifiers changed from: private */
    public final zzev zza;

    public zzgu(zzev zzev) {
        this.zza = zzev;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzeu) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzgt(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzgs(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzev zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }
}
