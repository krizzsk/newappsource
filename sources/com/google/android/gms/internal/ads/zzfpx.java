package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class zzfpx extends zzfps implements SortedSet {
    public final /* synthetic */ zzfqc zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfpx(zzfqc zzfqc, SortedMap sortedMap) {
        super(zzfqc, sortedMap);
        this.zzc = zzfqc;
    }

    public final Comparator comparator() {
        return zza().comparator();
    }

    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfpx(this.zzc, zza().headMap(obj));
    }

    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfpx(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfpx(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
