package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class zzfjv {
    private final zzfjd zza;
    private final ArrayList zzb;

    public zzfjv(zzfjd zzfjd, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfjd;
        arrayList.add(str);
    }

    public final zzfjd zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
