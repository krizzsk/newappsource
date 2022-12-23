package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzts */
final class zzts implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zzts(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzyn zzyn = (zzyn) obj;
        this.zzb.zzO(new zzza(zzyn.zzc(), zzyn.zzb(), Long.valueOf(zzzc.zza(zzyn.zzb())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (zze) null, this.zza, this);
    }
}
