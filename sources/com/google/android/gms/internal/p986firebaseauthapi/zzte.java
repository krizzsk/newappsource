package com.google.android.gms.internal.p986firebaseauthapi;

import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzte */
final class zzte implements zzxi {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzwc zzc;
    public final /* synthetic */ zzuh zzd;

    public zzte(zzuh zzuh, String str, String str2, zzwc zzwc) {
        this.zzd = zzuh;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzwc;
    }

    public final void zza(String str) {
        this.zzc.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzza zzza = (zzza) obj;
        zzzq zzzq = new zzzq();
        zzzq.zze(zzza.zze());
        zzzq.zzd(this.zza);
        zzzq.zzg(this.zzb);
        zzuh.zze(this.zzd, this.zzc, zzza, zzzq, this);
    }
}
