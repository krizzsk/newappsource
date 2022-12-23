package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class zzgpp {
    public final LinkedHashMap zza;

    public zzgpp(int i) {
        this.zza = zzgpr.zzb(i);
    }

    public final zzgpp zza(Object obj, zzgqh zzgqh) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgqc.zza(obj, LinksConfiguration.KEY_KEY);
        zzgqc.zza(zzgqh, "provider");
        linkedHashMap.put(obj, zzgqh);
        return this;
    }
}
