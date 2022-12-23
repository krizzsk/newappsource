package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

public final class zzfwf {
    private final OutputStream zza;

    private zzfwf(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfwf zzb(OutputStream outputStream) {
        return new zzfwf(outputStream);
    }

    public final void zza(zzgfu zzgfu) throws IOException {
        try {
            zzgfu.zzat(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
