package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm */
public final class zzabm extends IOException {
    public zzabm() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzabm(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzabm(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
