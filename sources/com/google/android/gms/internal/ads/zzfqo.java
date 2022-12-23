package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzfqo extends AbstractSet {
    public final /* synthetic */ zzfqr zza;

    public zzfqo(zzfqr zzfqr) {
        this.zza = zzfqr;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfqr zzfqr = this.zza;
        Map zzl = zzfqr.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfqj(zzfqr);
    }

    public final boolean remove(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        if (this.zza.zzx(obj) == zzfqr.zzd) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
