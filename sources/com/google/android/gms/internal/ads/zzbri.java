package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

public final /* synthetic */ class zzbri implements Predicate {
    public final /* synthetic */ zzbol zza;

    public /* synthetic */ zzbri(zzbol zzbol) {
        this.zza = zzbol;
    }

    public final boolean apply(Object obj) {
        zzbol zzbol = this.zza;
        zzbol zzbol2 = (zzbol) obj;
        if (!(zzbol2 instanceof zzbrn) || !((zzbrn) zzbol2).zzb.equals(zzbol)) {
            return false;
        }
        return true;
    }
}
