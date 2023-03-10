package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class zzfps extends zzfrz {
    public final /* synthetic */ zzfqc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfps(zzfqc zzfqc, Map map) {
        super(map);
        this.zza = zzfqc;
    }

    public final void clear() {
        zzfrr.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzfpr(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfqc.zzg(this.zza, size);
        if (size > 0) {
            return true;
        }
        return false;
    }
}
