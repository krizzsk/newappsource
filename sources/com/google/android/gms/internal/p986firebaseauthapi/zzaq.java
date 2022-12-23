package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq */
public final class zzaq implements zzbj {
    private final OutputStream zza;

    private zzaq(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzbj zza(OutputStream outputStream) {
        return new zzaq(outputStream);
    }

    public final void zzb(zzlq zzlq) throws IOException {
        throw null;
    }

    public final void zzc(zznh zznh) throws IOException {
        try {
            zznh.zzq(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
