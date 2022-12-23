package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class zzdw implements InitializationStatus {
    public final /* synthetic */ zzee zza;

    public /* synthetic */ zzdw(zzee zzee) {
        this.zza = zzee;
    }

    public final Map getAdapterStatusMap() {
        zzee zzee = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzdz(zzee));
        return hashMap;
    }
}
