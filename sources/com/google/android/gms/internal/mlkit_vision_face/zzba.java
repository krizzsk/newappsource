package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class zzba extends AbstractCollection {
    public final /* synthetic */ zzbb zza;

    public zzba(zzbb zzbb) {
        this.zza = zzbb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzbb zzbb = this.zza;
        Map zzc = zzbb.zzc();
        if (zzc != null) {
            return zzc.values().iterator();
        }
        return new zzav(zzbb);
    }

    public final int size() {
        return this.zza.size();
    }
}
