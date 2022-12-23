package com.google.android.gms.internal.mlkit_vision_barcode;

final class zzcb extends zzcc {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzcc, int i, int i2) {
        this.zzc = zzcc;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzaq.zza(i, this.zzb, "index");
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
    public final zzcc subList(int i, int i2) {
        zzaq.zzc(i, i2, this.zzb);
        zzcc zzcc = this.zzc;
        int i3 = this.zza;
        return zzcc.subList(i + i3, i2 + i3);
    }
}
