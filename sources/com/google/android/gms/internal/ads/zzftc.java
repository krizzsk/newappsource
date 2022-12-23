package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public final class zzftc {
    public static int zza(Set set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfot zzfot) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfsz) {
                zzfsz zzfsz = (zzfsz) sortedSet;
                return new zzfta((SortedSet) zzfsz.zza, zzfow.zza(zzfsz.zzb, zzfot));
            }
            sortedSet.getClass();
            zzfot.getClass();
            return new zzfta(sortedSet, zzfot);
        } else if (set instanceof zzfsz) {
            zzfsz zzfsz2 = (zzfsz) set;
            return new zzfsz(zzfsz2.zza, zzfow.zza(zzfsz2.zzb, zzfot));
        } else {
            set.getClass();
            zzfot.getClass();
            return new zzfsz(set, zzfot);
        }
    }

    public static boolean zzc(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfsm) {
            collection = ((zzfsm) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
