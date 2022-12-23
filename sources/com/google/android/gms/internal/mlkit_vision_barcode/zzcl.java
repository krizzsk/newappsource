package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;

class zzcl extends zzcx {
    public final Map zzb;

    public zzcl(Map map) {
        map.getClass();
        this.zzb = map;
    }

    public void clear() {
        this.zzb.clear();
    }

    public final boolean contains(Object obj) {
        return this.zzb.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.zzb.isEmpty();
    }

    public Iterator iterator() {
        return new zzci(this.zzb.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.zzb.remove(obj);
        return true;
    }

    public final int size() {
        return this.zzb.size();
    }
}
