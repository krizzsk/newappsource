package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcjm extends zzb {
    public final zzchr zza;
    public final zzcju zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcjm(zzchr zzchr, zzcju zzcju, String str, String[] strArr) {
        this.zza = zzchr;
        this.zzb = zzcju;
        this.zzc = str;
        this.zzd = strArr;
        zzt.zzy().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzr(this.zzc, this.zzd);
        } finally {
            zzs.zza.post(new zzcjl(this));
        }
    }

    public final zzfvj zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzbI)).booleanValue() || !(this.zzb instanceof zzckd)) {
            return super.zzb();
        }
        return zzcfv.zze.zzb(new zzcjk(this));
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzs(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
