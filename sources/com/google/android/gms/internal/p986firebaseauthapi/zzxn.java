package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxn */
public final class zzxn {
    public static zzaai zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.f36403g)) {
            return zzaai.zzc(phoneAuthCredential.f36401e, phoneAuthCredential.f36403g, phoneAuthCredential.f36402f);
        }
        return zzaai.zzb(phoneAuthCredential.f36398b, phoneAuthCredential.f36399c, phoneAuthCredential.f36402f);
    }
}
