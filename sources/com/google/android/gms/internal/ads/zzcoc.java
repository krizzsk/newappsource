package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzcoc implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcoc(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    /* renamed from: zza */
    public final zzcaf zzb() {
        Context zza2 = ((zzcnk) this.zza).zza();
        zzfhs zzfhs = (zzfhs) this.zzb.zzb();
        zzbsz zzb2 = zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhs);
        zzbst zzbst = zzbsw.zza;
        zzb2.zza("google.afma.request.getAdDictionary", zzbst, zzbst);
        return new zzcae(zza2, zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhs).zza("google.afma.sdkConstants.getSdkConstants", zzbst, zzbst));
    }
}
