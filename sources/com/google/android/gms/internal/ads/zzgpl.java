package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzgpl extends AbstractList {
    private static final zzgpm zzc = zzgpm.zzb(zzgpl.class);
    public final List zza;
    public final Iterator zzb;

    public zzgpl(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    public final Object get(int i) {
        if (this.zza.size() > i) {
            return this.zza.get(i);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new zzgpk(this);
    }

    public final int size() {
        zzgpm zzgpm = zzc;
        zzgpm.zza("potentially expensive size() call");
        zzgpm.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
