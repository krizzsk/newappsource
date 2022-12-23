package com.google.android.gms.internal.mlkit_vision_face;

final class zzbk extends zzbl {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzbl zzc;

    public zzbk(zzbl zzbl, int i, int i2) {
        this.zzc = zzbl;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzaa.zzb(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* renamed from: zzf */
    public final zzbl subList(int i, int i2) {
        zzaa.zzd(i, i2, this.zzb);
        zzbl zzbl = this.zzc;
        int i3 = this.zza;
        return zzbl.subList(i + i3, i2 + i3);
    }
}
