package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwv */
final class zzwv implements zzxb {
    public final /* synthetic */ String zza;

    public zzwv(zzxa zzxa, String str) {
        this.zza = str;
    }

    public final void zza(C13416c cVar, Object... objArr) {
        cVar.onCodeSent(this.zza, new PhoneAuthProvider$ForceResendingToken());
    }
}
