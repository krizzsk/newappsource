package com.google.android.gms.internal.ads;

final class zzfrg extends zzfrh {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzfrh zzc;

    public zzfrg(zzfrh zzfrh, int i, int i2) {
        this.zzc = zzfrh;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzfos.zza(i, this.zzb, "index");
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
    public final zzfrh subList(int i, int i2) {
        zzfos.zzg(i, i2, this.zzb);
        zzfrh zzfrh = this.zzc;
        int i3 = this.zza;
        return zzfrh.subList(i + i3, i2 + i3);
    }
}
