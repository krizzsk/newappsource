package com.google.android.gms.internal.mlkit_vision_face;

final /* synthetic */ class zzkk implements Runnable {
    private final zzko zza;
    private final zzio zzb;
    private final zzkp zzc;

    public zzkk(zzko zzko, zzkp zzkp, zzio zzio, byte[] bArr) {
        this.zza = zzko;
        this.zzc = zzkp;
        this.zzb = zzio;
    }

    public final void run() {
        this.zza.zze(this.zzc, this.zzb);
    }
}
