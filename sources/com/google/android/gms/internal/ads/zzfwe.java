package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class zzfwe {
    private final InputStream zza;

    private zzfwe(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzfwe zzb(byte[] bArr) {
        return new zzfwe(new ByteArrayInputStream(bArr));
    }

    public final zzgfu zza() throws IOException {
        try {
            return zzgfu.zzf(this.zza, zzgka.zza());
        } finally {
            this.zza.close();
        }
    }
}
