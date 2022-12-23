package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzaoe extends zzamm {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzaoe() {
    }

    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzaoe(String str) {
        HashMap zza2 = zzamm.zza(str);
        if (zza2 != null) {
            this.zza = (Long) zza2.get(0);
            this.zzb = (Long) zza2.get(1);
            this.zzc = (Long) zza2.get(2);
        }
    }
}
