package com.google.android.play.core.assetpacks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
public final class C14251c0 extends InputStream {

    /* renamed from: b */
    public final InputStream f35812b;

    /* renamed from: c */
    public long f35813c;

    public C14251c0(FileInputStream fileInputStream, long j) {
        this.f35812b = fileInputStream;
        this.f35813c = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f35812b.close();
        this.f35813c = 0;
    }

    public final int read() throws IOException {
        long j = this.f35813c;
        if (j <= 0) {
            return -1;
        }
        this.f35813c = j - 1;
        return this.f35812b.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f35813c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f35812b.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f35813c -= (long) read;
        }
        return read;
    }
}
