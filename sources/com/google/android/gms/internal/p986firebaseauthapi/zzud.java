package com.google.android.gms.internal.p986firebaseauthapi;

import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzud */
final class zzud implements zzxi {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzwc zzb;
    public final /* synthetic */ zzuh zzc;

    public zzud(zzuh zzuh, String str, zzwc zzwc) {
        this.zzc = zzuh;
        this.zza = str;
        this.zzb = zzwc;
    }

    public final void zza(String str) {
        this.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzza zzza = (zzza) obj;
        zzzq zzzq = new zzzq();
        zzzq.zze(zzza.zze());
        zzzq.zzd(this.zza);
        zzuh.zze(this.zzc, this.zzb, zzza, zzzq, this);
    }
}
