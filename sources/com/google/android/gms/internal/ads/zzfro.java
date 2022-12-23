package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfro extends zzfpk {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ zzfot zzb;

    public zzfro(Iterator it, zzfot zzfot) {
        this.zza = it;
        this.zzb = zzfot;
    }

    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
