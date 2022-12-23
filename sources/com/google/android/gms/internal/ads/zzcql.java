package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcql implements zzfaz {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcql(zzcrb zzcrb, zzcqk zzcqk) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzfaz zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfaz zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfba zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, (zzcqm) null);
    }
}
