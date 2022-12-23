package com.google.android.gms.internal.ads;

import p358af.C13437d;

final class zzfdq {
    private final zzfdp zza = new zzfdp();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfdp zza() {
        zzfdp zza2 = this.zza.clone();
        zzfdp zzfdp = this.zza;
        zzfdp.zza = false;
        zzfdp.zzb = false;
        return zza2;
    }

    public final String zzb() {
        StringBuilder k = C13555b.m33972k("\n\tPool does not exist: ");
        k.append(this.zzd);
        k.append("\n\tNew pools created: ");
        k.append(this.zzb);
        k.append("\n\tPools removed: ");
        k.append(this.zzc);
        k.append("\n\tEntries added: ");
        k.append(this.zzf);
        k.append("\n\tNo entries retrieved: ");
        return C13437d.m33707l(k, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
