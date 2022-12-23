package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

abstract class zzbs<K, V> extends zzcc<Map.Entry<K, V>> {
    public final void clear() {
        zza().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object zza = zzbw.zza(zza(), key);
        if (!zzw.zza(zza, entry.getValue())) {
            return false;
        }
        if (zza != null || zzbw.zzb(((zzag) zza()).zza, key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    public boolean remove(Object obj) {
        if (contains(obj)) {
            return ((zzag) zza()).zzb.zzp().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        try {
            return zzcd.zzb(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzcd.zza(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i = size + 1;
                } else {
                    throw new IllegalArgumentException(C13715c.m34241g(52, "expectedSize cannot be negative but was: ", size));
                }
            } else if (size < 1073741824) {
                i = (int) ((((float) size) / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return ((zzag) zza()).zzb.zzp().retainAll(hashSet);
        }
    }

    public final int size() {
        return zza().size();
    }

    public abstract Map<K, V> zza();
}
