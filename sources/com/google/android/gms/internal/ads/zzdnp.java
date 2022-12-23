package com.google.android.gms.internal.ads;

import p241s0.C6313h;

public final class zzdnp {
    public zzbmb zza;
    public zzbly zzb;
    public zzbmo zzc;
    public zzbml zzd;
    public zzbra zze;
    public final C6313h zzf = new C6313h();
    public final C6313h zzg = new C6313h();

    public final zzdnp zza(zzbly zzbly) {
        this.zzb = zzbly;
        return this;
    }

    public final zzdnp zzb(zzbmb zzbmb) {
        this.zza = zzbmb;
        return this;
    }

    public final zzdnp zzc(String str, zzbmh zzbmh, zzbme zzbme) {
        this.zzf.put(str, zzbmh);
        if (zzbme != null) {
            this.zzg.put(str, zzbme);
        }
        return this;
    }

    public final zzdnp zzd(zzbra zzbra) {
        this.zze = zzbra;
        return this;
    }

    public final zzdnp zze(zzbml zzbml) {
        this.zzd = zzbml;
        return this;
    }

    public final zzdnp zzf(zzbmo zzbmo) {
        this.zzc = zzbmo;
        return this;
    }

    public final zzdnr zzg() {
        return new zzdnr(this);
    }
}
