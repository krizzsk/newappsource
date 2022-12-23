package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzfel {
    private final long zza;
    private final zzfek zzb = new zzfek();
    private long zzc;
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfel() {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfek zzd() {
        zzfek zza2 = this.zzb.clone();
        zzfek zzfek = this.zzb;
        zzfek.zza = false;
        zzfek.zzb = 0;
        return zza2;
    }

    public final String zze() {
        StringBuilder k = C13555b.m33972k("Created: ");
        k.append(this.zza);
        k.append(" Last accessed: ");
        k.append(this.zzc);
        k.append(" Accesses: ");
        k.append(this.zzd);
        k.append("\nEntries retrieved: Valid: ");
        k.append(this.zze);
        k.append(" Stale: ");
        k.append(this.zzf);
        return k.toString();
    }

    public final void zzf() {
        this.zzc = zzt.zzA().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
