package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzay extends AbstractSet {
    public final /* synthetic */ zzbb zza;

    public zzay(zzbb zzbb) {
        this.zza = zzbb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzbb zzbb = this.zza;
        Map zzc = zzbb.zzc();
        if (zzc != null) {
            return zzc.keySet().iterator();
        }
        return new zzat(zzbb);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        if (this.zza.zzs(obj) == zzbb.zzd) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
