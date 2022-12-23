package com.google.android.gms.internal.p986firebaseauthapi;

import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue */
final class zzue implements zzxi {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzwc zzb;
    public final /* synthetic */ zzuh zzc;

    public zzue(zzuh zzuh, String str, zzwc zzwc) {
        this.zzc = zzuh;
        this.zza = str;
        this.zzb = zzwc;
    }

    public final void zza(String str) {
        this.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzza zzza = (zzza) obj;
        String zze = zzza.zze();
        zzzq zzzq = new zzzq();
        zzzq.zze(zze);
        zzzq.zzg(this.zza);
        zzuh.zze(this.zzc, this.zzb, zzza, zzzq, this);
    }
}
