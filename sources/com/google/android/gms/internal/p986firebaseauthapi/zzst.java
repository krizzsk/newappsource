package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzst */
final class zzst implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zzst(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzyj zzyj = (zzyj) obj;
        if (zzyj.zzg()) {
            this.zza.zzf(new zzso(zzyj.zzd(), zzyj.zzf(), (zze) null));
            return;
        }
        this.zzb.zzO(new zzza(zzyj.zze(), zzyj.zzc(), Long.valueOf(zzyj.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzyj.zzh()), (zze) null, this.zza, this);
    }
}
