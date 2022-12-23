package com.google.firebase.auth;

import com.google.firebase.auth.internal.zzae;

public class FirebaseAuthMultiFactorException extends FirebaseAuthException {
    private MultiFactorResolver zza;

    public FirebaseAuthMultiFactorException(String str, String str2, zzae zzae) {
        super(str, str2);
        this.zza = zzae;
    }
}
