package com.google.android.gms.internal.mlkit_common;

final class zzal extends zzam {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzam zzc;

    public zzal(zzam zzam, int i, int i2) {
        this.zzc = zzam;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzab.zza(i, this.zzb, "index");
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

    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzf */
    public final zzam subList(int i, int i2) {
        zzab.zzc(i, i2, this.zzb);
        zzam zzam = this.zzc;
        int i3 = this.zza;
        return zzam.subList(i + i3, i2 + i3);
    }
}
