package com.google.android.gms.tagmanager;

import java.util.List;

final class zzat implements zzaw {
    public final /* synthetic */ DataLayer zza;

    public zzat(DataLayer dataLayer) {
        this.zza = dataLayer;
    }

    public final void zza(List<zzau> list) {
        for (zzau next : list) {
            DataLayer dataLayer = this.zza;
            dataLayer.zzi(dataLayer.zza(next.zza, next.zzb));
        }
        this.zza.zzh.countDown();
    }
}
