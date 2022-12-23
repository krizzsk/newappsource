package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.usebutton.sdk.internal.events.Events;

public final class zzdvr implements zzden, zzddg, zzdbv {
    private final zzdwb zza;
    private final zzdwl zzb;

    public zzdvr(zzdwb zzdwb, zzdwl zzdwl) {
        this.zza = zzdwb;
        this.zzb = zzdwl;
    }

    public final void zza(zze zze) {
        this.zza.zza().put(Events.PROPERTY_ACTION, "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze.zza));
        this.zza.zza().put("ed", zze.zzc);
        this.zzb.zze(this.zza.zza());
    }

    public final void zzb(zzfbs zzfbs) {
        this.zza.zzb(zzfbs);
    }

    public final void zzbE(zzbzu zzbzu) {
        this.zza.zzc(zzbzu.zza);
    }

    public final void zzn() {
        this.zza.zza().put(Events.PROPERTY_ACTION, "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
