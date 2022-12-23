package com.google.android.gms.internal.ads;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class zzebj implements zzebl {
    private final Map zza;
    private final zzfvk zzb;
    /* access modifiers changed from: private */
    public final zzdel zzc;

    public zzebj(Map map, zzfvk zzfvk, zzdel zzdel) {
        this.zza = map;
        this.zzb = zzfvk;
        this.zzc = zzdel;
    }

    public final zzfvj zzb(zzbzu zzbzu) {
        this.zzc.zzbE(zzbzu);
        zzfvj zzh = zzfva.zzh(new zzdzk(3));
        for (String trim : ((String) zzay.zzc().zzb(zzbhy.zzgO)).split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
            zzgqh zzgqh = (zzgqh) this.zza.get(trim.trim());
            if (zzgqh != null) {
                zzh = zzfva.zzg(zzh, zzdzk.class, new zzebh(zzgqh, zzbzu), this.zzb);
            }
        }
        zzfva.zzr(zzh, new zzebi(this), zzcfv.zzf);
        return zzh;
    }
}
