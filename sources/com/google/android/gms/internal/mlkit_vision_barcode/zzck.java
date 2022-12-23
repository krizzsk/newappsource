package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

abstract class zzck extends zzcx {
    public final void clear() {
        zza().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object zza = zzco.zza(zza(), key);
        if (!zzam.zza(zza, entry.getValue())) {
            return false;
        }
        if (zza != null || zzco.zzb(((zzaw) zza()).zza, key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return ((zzaw) zza()).zzb.zzq().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return zzcy.zzb(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzcy.zzc(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzbj.zza(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) ((((float) size) / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return ((zzaw) zza()).zzb.zzq().retainAll(hashSet);
        }
    }

    public final int size() {
        return zza().size();
    }

    public abstract Map zza();
}
