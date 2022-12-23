package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.k0 */
public final class C14283k0 extends FilterInputStream {

    /* renamed from: b */
    public final C14316s1 f35928b = new C14316s1();

    /* renamed from: c */
    public byte[] f35929c = new byte[4096];

    /* renamed from: d */
    public long f35930d;

    /* renamed from: e */
    public boolean f35931e = false;

    /* renamed from: f */
    public boolean f35932f = false;

    public C14283k0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: e */
    public final C14275i0 mo42849e() throws IOException {
        byte[] bArr;
        if (this.f35930d > 0) {
            do {
                bArr = this.f35929c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f35931e || this.f35932f) {
            return new C14275i0((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!mo42850f(30)) {
            this.f35931e = true;
            return this.f35928b.mo42893b();
        }
        C14275i0 b = this.f35928b.mo42893b();
        if (b.f35902e) {
            this.f35932f = true;
            return b;
        } else if (b.f35899b != 4294967295L) {
            int i = this.f35928b.f36036f - 30;
            long j = (long) i;
            int length = this.f35929c.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f35929c = Arrays.copyOf(this.f35929c, length);
            }
            if (!mo42850f(i)) {
                this.f35931e = true;
                return this.f35928b.mo42893b();
            }
            C14275i0 b2 = this.f35928b.mo42893b();
            this.f35930d = b2.f35899b;
            return b2;
        } else {
            throw new zzck("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: f */
    public final boolean mo42850f(int i) throws IOException {
        int max = Math.max(0, super.read(this.f35929c, 0, i));
        if (max != i) {
            int i2 = i - max;
            if (Math.max(0, super.read(this.f35929c, max, i2)) != i2) {
                this.f35928b.mo42892a(this.f35929c, 0, max);
                return false;
            }
        }
        this.f35928b.mo42892a(this.f35929c, 0, i);
        return true;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f35930d;
        if (j <= 0 || this.f35931e) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.f35930d -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f35931e = true;
        return 0;
    }
}
