package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import p241s0.C6306f;

final class zzfm extends C6306f {
    public final /* synthetic */ zzfp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfm(zzfp zzfp, int i) {
        super(20);
        this.zza = zzfp;
    }

    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfp.zzd(this.zza, str);
    }
}
