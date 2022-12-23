package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class zzbr extends AbstractCollection {
    public final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbs) {
        this.zza = zzbs;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzbs zzbs = this.zza;
        Map zzl = zzbs.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzbm(zzbs);
    }

    public final int size() {
        return this.zza.size();
    }
}
