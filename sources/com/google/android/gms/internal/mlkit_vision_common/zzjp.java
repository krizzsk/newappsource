package com.google.android.gms.internal.mlkit_vision_common;

public final /* synthetic */ class zzjp implements Runnable {
    public final /* synthetic */ zzjt zza;
    public final /* synthetic */ zzgz zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzju zzd;

    public /* synthetic */ zzjp(zzjt zzjt, zzju zzju, zzgz zzgz, String str, byte[] bArr) {
        this.zza = zzjt;
        this.zzd = zzju;
        this.zzb = zzgz;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zza(this.zzd, this.zzb, this.zzc);
    }
}
