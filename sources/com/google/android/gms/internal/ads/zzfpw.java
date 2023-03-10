package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class zzfpw extends zzfpp implements SortedMap {
    public SortedSet zzd;
    public final /* synthetic */ zzfqc zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfpw(zzfqc zzfqc, SortedMap sortedMap) {
        super(zzfqc, sortedMap);
        this.zze = zzfqc;
    }

    public final Comparator comparator() {
        return zzf().comparator();
    }

    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfpw(this.zze, zzf().headMap(obj));
    }

    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfpw(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfpw(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfpx(this.zze, zzf());
    }

    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zze();
        this.zzd = zzg;
        return zzg;
    }
}
