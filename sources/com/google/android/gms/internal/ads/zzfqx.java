package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class zzfqx extends zzfqy implements Map {
    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    public Object get(Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    public final Collection values() {
        return zzb().values();
    }

    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Map zzb();

    public final int zzc() {
        return zzftc.zza(entrySet());
    }

    public final boolean zzd(Object obj) {
        zzfrx zzfrx = new zzfrx(entrySet().iterator());
        if (obj == null) {
            while (zzfrx.hasNext()) {
                if (zzfrx.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfrx.hasNext()) {
                if (obj.equals(zzfrx.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zze(Object obj) {
        return zzfsc.zzb(this, obj);
    }
}
