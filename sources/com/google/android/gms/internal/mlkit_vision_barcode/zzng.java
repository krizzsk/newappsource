package com.google.android.gms.internal.mlkit_vision_barcode;

import p767rg.C19265e;

public final /* synthetic */ class zzng implements Runnable {
    public final /* synthetic */ zznm zza;
    public final /* synthetic */ zzkk zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ C19265e zze;

    public /* synthetic */ zzng(zznm zznm, zzkk zzkk, Object obj, long j, C19265e eVar, byte[] bArr) {
        this.zza = zznm;
        this.zzb = zzkk;
        this.zzc = obj;
        this.zzd = j;
        this.zze = eVar;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
