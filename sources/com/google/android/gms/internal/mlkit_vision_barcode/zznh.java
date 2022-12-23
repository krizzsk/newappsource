package com.google.android.gms.internal.mlkit_vision_barcode;

public final /* synthetic */ class zznh implements Runnable {
    public final /* synthetic */ zznm zza;
    public final /* synthetic */ zzkk zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zznp zzd;

    public /* synthetic */ zznh(zznm zznm, zznp zznp, zzkk zzkk, String str, byte[] bArr) {
        this.zza = zznm;
        this.zzd = zznp;
        this.zzb = zzkk;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zzc(this.zzd, this.zzb, this.zzc);
    }
}
