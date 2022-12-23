package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzau extends zzck {
    public final /* synthetic */ zzaw zza;

    public zzau(zzaw zzaw) {
        this.zza = zzaw;
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

    public final Iterator iterator() {
        return new zzav(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzbe.zzm(this.zza.zzb, entry.getKey());
        return true;
    }

    public final Map zza() {
        return this.zza;
    }
}
