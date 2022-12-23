package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt */
final class zzxt implements OnFailureListener {
    public zzxt(zzxx zzxx) {
    }

    public final void onFailure(Exception exc) {
        zzxx.zza.mo65852e("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}
