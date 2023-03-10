package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

public final class zzcuf implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzcuf(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcuc zzcuc = (zzcuc) this.zza.zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        if (((JSONObject) this.zzc.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzdiy(zzcuc, zzfvk));
        }
        zzgqc.zzb(set);
        return set;
    }
}
