package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

final class zzfpu extends zzfpx implements NavigableSet {
    public final /* synthetic */ zzfqc zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfpu(zzfqc zzfqc, NavigableMap navigableMap) {
        super(zzfqc, navigableMap);
        this.zzb = zzfqc;
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new zzfpu(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return zzfrr.zza(iterator());
    }

    public final Object pollLast() {
        return zzfrr.zza(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final /* synthetic */ SortedMap zza() {
        return (NavigableMap) ((SortedMap) this.zzd);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzfpu(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfpu(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzfpu(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).tailMap(obj, z));
    }
}
