package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzae extends zzbs {
    public final /* synthetic */ zzag zza;

    public zzae(zzag zzag) {
        this.zza = zzag;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new zzaf(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        zzao.zzo(this.zza.zzb, ((Map.Entry) obj).getKey());
        return true;
    }

    public final Map zza() {
        return this.zza;
    }
}
