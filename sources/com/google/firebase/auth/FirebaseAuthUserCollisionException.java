package com.google.firebase.auth;

public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {
    private AuthCredential zza;
    private String zzb;
    private String zzc;

    public FirebaseAuthUserCollisionException(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: b */
    public final void mo43276b(AuthCredential authCredential) {
        this.zza = authCredential;
    }

    /* renamed from: c */
    public final void mo43277c(String str) {
        this.zzb = str;
    }

    /* renamed from: d */
    public final void mo43278d(String str) {
        this.zzc = str;
    }
}
