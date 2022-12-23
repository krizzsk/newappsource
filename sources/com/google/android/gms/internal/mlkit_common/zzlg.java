package com.google.android.gms.internal.mlkit_common;

public final /* synthetic */ class zzlg implements Runnable {
    public final /* synthetic */ zzll zza;
    public final /* synthetic */ zzlc zzb;
    public final /* synthetic */ zzie zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzlg(zzll zzll, zzlc zzlc, zzie zzie, String str) {
        this.zza = zzll;
        this.zzb = zzlc;
        this.zzc = zzie;
        this.zzd = str;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}
