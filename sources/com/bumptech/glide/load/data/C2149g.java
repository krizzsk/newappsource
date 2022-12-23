package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
public final class C2149g extends FilterInputStream {

    /* renamed from: d */
    public static final byte[] f6965d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e */
    public static final int f6966e = 31;

    /* renamed from: b */
    public final byte f6967b;

    /* renamed from: c */
    public int f6968c;

    public C2149g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C16759e.m42349e("Cannot add invalid orientation: ", i));
        }
        this.f6967b = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f6968c;
        if (i3 < 2 || i3 > (i2 = f6966e)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f6967b;
        } else {
            i = f6965d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f6968c++;
        }
        return i;
    }

    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f6968c = (int) (((long) this.f6968c) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f6968c;
        int i5 = f6966e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f6967b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f6965d, this.f6968c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f6968c += i3;
        }
        return i3;
    }
}
