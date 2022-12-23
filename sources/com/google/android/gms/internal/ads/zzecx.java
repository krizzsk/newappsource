package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.usebutton.sdk.internal.events.Events;

public final class zzecx implements zzden, zzddg, zzdbv {
    private final zzfgn zza;
    private final zzfgo zzb;
    private final zzcev zzc;

    public zzecx(zzfgn zzfgn, zzfgo zzfgo, zzcev zzcev) {
        this.zza = zzfgn;
        this.zzb = zzfgo;
        this.zzc = zzcev;
    }

    public final void zza(zze zze) {
        zzfgn zzfgn = this.zza;
        zzfgn.zza(Events.PROPERTY_ACTION, "ftl");
        zzfgn.zza("ftl", String.valueOf(zze.zza));
        zzfgn.zza("ed", zze.zzc);
        this.zzb.zzb(this.zza);
    }

    public final void zzb(zzfbs zzfbs) {
        this.zza.zzh(zzfbs, this.zzc);
    }

    public final void zzbE(zzbzu zzbzu) {
        this.zza.zzi(zzbzu.zza);
    }

    public final void zzn() {
        zzfgo zzfgo = this.zzb;
        zzfgn zzfgn = this.zza;
        zzfgn.zza(Events.PROPERTY_ACTION, "loaded");
        zzfgo.zzb(zzfgn);
    }
}
