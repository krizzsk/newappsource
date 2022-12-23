package com.google.android.gms.internal.location;

final class zzbw extends zzbx {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzbx zzc;

    public zzbw(zzbx zzbx, int i, int i2) {
        this.zzc = zzbx;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzbr.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    /* renamed from: zzh */
    public final zzbx subList(int i, int i2) {
        zzbr.zzc(i, i2, this.zzb);
        zzbx zzbx = this.zzc;
        int i3 = this.zza;
        return zzbx.subList(i + i3, i2 + i3);
    }
}
