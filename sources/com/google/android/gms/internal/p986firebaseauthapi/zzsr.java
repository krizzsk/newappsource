package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr */
final class zzsr implements zzxi {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzuh zzb;

    public zzsr(zzuh zzuh, zzwc zzwc) {
        this.zzb = zzuh;
        this.zza = zzwc;
    }

    public final void zza(String str) {
        this.zza.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaah zzaah = (zzaah) obj;
        if (zzaah.zzg()) {
            this.zza.zzf(new zzso(zzaah.zzd(), zzaah.zzf(), (zze) null));
            return;
        }
        this.zzb.zzO(new zzza(zzaah.zze(), zzaah.zzc(), Long.valueOf(zzaah.zzb()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (zze) null, this.zza, this);
    }
}
