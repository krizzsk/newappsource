package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeo */
public final class zzaeo extends RuntimeException {
    public zzaeo(zzadm zzadm) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzacp zza() {
        return new zzacp(getMessage());
    }
}
