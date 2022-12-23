package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww */
final class zzww implements zzxb {
    public final /* synthetic */ PhoneAuthCredential zza;

    public zzww(zzxa zzxa, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    public final void zza(C13416c cVar, Object... objArr) {
        cVar.onVerificationCompleted(this.zza);
    }
}
