package com.google.android.gms.internal.mlkit_vision_face;

import java.io.OutputStream;

final class zzct extends OutputStream {
    private long zza = 0;

    public final void write(int i) {
        this.zza++;
    }

    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    public final long zza() {
        return this.zza;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.zza += (long) i2;
    }
}
