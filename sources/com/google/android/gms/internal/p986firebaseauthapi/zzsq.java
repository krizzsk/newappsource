package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsq */
final class zzsq implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zzsq(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzzt zzzt = (zzzt) obj;
        this.zzb.zzO(new zzza(zzzt.zzd(), zzzt.zzc(), Long.valueOf(zzzt.zzb()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (zze) null, this.zza, this);
    }
}
