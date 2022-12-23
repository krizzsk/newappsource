package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class zzdbe {
    private final Context zza;
    private final zzfby zzb;
    private final Bundle zzc;
    private final zzfbt zzd;

    public /* synthetic */ zzdbe(zzdbc zzdbc, zzdbd zzdbd) {
        this.zza = zzdbc.zza;
        this.zzb = zzdbc.zzb;
        this.zzc = zzdbc.zzc;
        this.zzd = zzdbc.zzd;
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzdbc zzc() {
        zzdbc zzdbc = new zzdbc();
        zzdbc.zzc(this.zza);
        zzdbc.zzf(this.zzb);
        zzdbc.zzd(this.zzc);
        return zzdbc;
    }

    public final zzfbt zzd() {
        return this.zzd;
    }

    public final zzfby zze() {
        return this.zzb;
    }
}
