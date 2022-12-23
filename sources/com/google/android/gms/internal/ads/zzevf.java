package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

public final class zzevf {
    private final zzbzu zza;
    private final int zzb;

    public zzevf(zzbzu zzbzu, int i) {
        this.zza = zzbzu;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return this.zza.zza.getString("ms");
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    public final boolean zzg() {
        return this.zza.zza.getBoolean("is_gbid");
    }
}
