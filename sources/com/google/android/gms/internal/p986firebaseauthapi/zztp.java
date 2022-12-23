package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztp */
final class zztp implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zztp(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaae zzaae = (zzaae) obj;
        this.zzb.zzO(new zzza(zzaae.zzd(), zzaae.zzc(), Long.valueOf(zzaae.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaae.zze()), (zze) null, this.zza, this);
    }
}
