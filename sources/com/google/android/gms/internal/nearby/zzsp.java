package com.google.android.gms.internal.nearby;

final class zzsp extends zzsq {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzsq zzc;

    public zzsp(zzsq zzsq, int i, int i2) {
        this.zzc = zzsq;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzsg.zza(i, this.zzb, "index");
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
    public final zzsq subList(int i, int i2) {
        zzsg.zzg(i, i2, this.zzb);
        zzsq zzsq = this.zzc;
        int i3 = this.zza;
        return zzsq.subList(i + i3, i2 + i3);
    }
}
