package com.google.android.gms.internal.p986firebaseauthapi;

import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzua */
final class zzua implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zzua(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaac zzaac = (zzaac) obj;
        if (!zzaac.zzm()) {
            zzuh.zzd(this.zzb, zzaac, this.zza, this);
        } else {
            this.zza.zzf(new zzso(zzaac.zzg(), zzaac.zzl(), zzaac.zzc()));
        }
    }
}
