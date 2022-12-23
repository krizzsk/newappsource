package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;

final class zzbrx implements zzbol {
    public final /* synthetic */ zzbrg zza;
    public final /* synthetic */ zzca zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbrx(zzbsl zzbsl, zzaoc zzaoc, zzbrg zzbrg, zzca zzca) {
        this.zzc = zzbsl;
        this.zza = zzbrg;
        this.zzb = zzca;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbol, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbsm zzbsm = (zzbsm) obj;
        synchronized (this.zzc.zza) {
            zzcfi.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zzcfi.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzaoc) null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
