package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class zzfpn extends zzfry {
    public final /* synthetic */ zzfpp zza;

    public zzfpn(zzfpp zzfpp) {
        this.zza = zzfpp;
    }

    public final boolean contains(Object obj) {
        return zzfqi.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfpo(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfqc.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    public final Map zza() {
        return this.zza;
    }
}
