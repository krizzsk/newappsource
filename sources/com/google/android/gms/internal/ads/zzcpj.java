package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcpj implements zzexs {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    public /* synthetic */ zzcpj(zzcrb zzcrb, zzcpi zzcpi) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzexs zza(zzq zzq) {
        zzq.getClass();
        this.zzd = zzq;
        return this;
    }

    public final /* synthetic */ zzexs zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzexs zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzext zzd() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        zzgqc.zzc(this.zzd, zzq.class);
        return new zzcpl(this.zza, this.zzb, this.zzc, this.zzd, (zzcpk) null);
    }
}
