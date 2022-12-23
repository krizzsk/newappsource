package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class zzbde extends PushbackInputStream {
    public final /* synthetic */ zzbdf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbde(zzbdf zzbdf, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbdf;
    }

    public final synchronized void close() throws IOException {
        zzbdh.zze(this.zza.zzc);
        super.close();
    }
}
