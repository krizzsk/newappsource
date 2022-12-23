package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final /* synthetic */ class zzdoi implements zzbol {
    public final /* synthetic */ zzdoj zza;
    public final /* synthetic */ zzbmu zzb;

    public /* synthetic */ zzdoi(zzdoj zzdoj, zzbmu zzbmu) {
        this.zza = zzdoj;
        this.zzb = zzbmu;
    }

    public final void zza(Object obj, Map map) {
        zzdoj zzdoj = this.zza;
        zzbmu zzbmu = this.zzb;
        try {
            zzdoj.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzcfi.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdoj.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbmu == null) {
            zzcfi.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbmu.zzf(str);
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
