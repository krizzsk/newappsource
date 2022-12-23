package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzceh implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcga zzb;

    public zzceh(zzcei zzcei, Context context, zzcga zzcga) {
        this.zza = context;
        this.zzb = zzcga;
    }

    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zze(e);
            zzcfi.zzh("Exception while getting advertising Id info", e);
        }
    }
}
