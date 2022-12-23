package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcqh implements zzezl {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    public /* synthetic */ zzcqh(zzcrb zzcrb, zzcqg zzcqg) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzezl zza(zzq zzq) {
        zzq.getClass();
        this.zzd = zzq;
        return this;
    }

    public final /* synthetic */ zzezl zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzezl zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzezm zzd() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        zzgqc.zzc(this.zzd, zzq.class);
        return new zzcqj(this.zza, this.zzb, this.zzc, this.zzd, (zzcqi) null);
    }
}
