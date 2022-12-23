package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd */
final class zztd implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zztd(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaaj zzaaj = (zzaaj) obj;
        this.zzb.zzO(new zzza(zzaaj.zze(), zzaaj.zzc(), Long.valueOf(zzaaj.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaaj.zzg()), (zze) null, this.zza, this);
    }
}
