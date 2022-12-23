package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzfru extends AbstractSequentialList implements Serializable {
    public final List zza;
    public final zzfoi zzb;

    public zzfru(List list, zzfoi zzfoi) {
        this.zza = list;
        this.zzb = zzfoi;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i) {
        return new zzfrt(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
