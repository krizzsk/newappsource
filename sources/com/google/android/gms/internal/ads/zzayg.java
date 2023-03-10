package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class zzayg implements zzayi {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;

    public zzayg(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        this.zza = bArr;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.zza, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        return min;
    }

    public final long zzb(zzayk zzayk) throws IOException {
        this.zzb = zzayk.zza;
        long j = zzayk.zzc;
        int i = (int) j;
        this.zzc = i;
        long j2 = zzayk.zzd;
        long j3 = -1;
        if (j2 == -1) {
            j2 = ((long) this.zza.length) - j;
        } else {
            j3 = j2;
        }
        int i2 = (int) j2;
        this.zzd = i2;
        if (i2 > 0 && i + i2 <= this.zza.length) {
            return (long) i2;
        }
        int length = this.zza.length;
        throw new IOException("Unsatisfiable range: [" + i + ", " + j3 + "], length: " + length);
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws IOException {
        this.zzb = null;
    }
}
