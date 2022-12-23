package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxp */
final class zzxp extends C13416c {
    public final /* synthetic */ C13416c zza;
    public final /* synthetic */ String zzb;

    public zzxp(C13416c cVar, String str) {
        this.zza = cVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzxr.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.zza.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzxr.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    public final void onVerificationFailed(FirebaseException firebaseException) {
        zzxr.zza.remove(this.zzb);
        this.zza.onVerificationFailed(firebaseException);
    }
}
