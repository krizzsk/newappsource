package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class zzcd {
    public static boolean zza(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        if (true != z) {
            return false;
        }
        return true;
    }

    public static boolean zzb(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof zzby) {
            collection = ((zzby) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zza(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
