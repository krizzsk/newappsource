package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzss */
final class zzss implements zzxi {
    public final /* synthetic */ EmailAuthCredential zza;
    public final /* synthetic */ zzwc zzb;
    public final /* synthetic */ zzuh zzc;

    public zzss(zzuh zzuh, EmailAuthCredential emailAuthCredential, zzwc zzwc) {
        this.zzc = zzuh;
        this.zza = emailAuthCredential;
        this.zzb = zzwc;
    }

    public final void zza(String str) {
        this.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zzN(new zzyi(this.zza, ((zzza) obj).zze()), this.zzb);
    }
}
