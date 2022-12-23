package com.veriff.sdk.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.veriff.sdk.internal.cc */
final class C21503cc extends InputStream {

    /* renamed from: a */
    private final InputStream f54080a;

    /* renamed from: b */
    private long f54081b;

    /* renamed from: c */
    private long f54082c;

    /* renamed from: d */
    private long f54083d;

    /* renamed from: e */
    private long f54084e;

    /* renamed from: f */
    private boolean f54085f;

    /* renamed from: g */
    private int f54086g;

    public C21503cc(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: b */
    private void m51396b(long j) {
        try {
            long j2 = this.f54082c;
            long j3 = this.f54081b;
            if (j2 >= j3 || j3 > this.f54083d) {
                this.f54082c = j3;
                this.f54080a.mark((int) (j - j3));
            } else {
                this.f54080a.reset();
                this.f54080a.mark((int) (j - this.f54082c));
                m51395a(this.f54082c, this.f54081b);
            }
            this.f54083d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: a */
    public long mo54470a(int i) {
        long j = this.f54081b + ((long) i);
        if (this.f54083d < j) {
            m51396b(j);
        }
        return this.f54081b;
    }

    public int available() throws IOException {
        return this.f54080a.available();
    }

    public void close() throws IOException {
        this.f54080a.close();
    }

    public void mark(int i) {
        this.f54084e = mo54470a(i);
    }

    public boolean markSupported() {
        return this.f54080a.markSupported();
    }

    public int read() throws IOException {
        if (!this.f54085f) {
            long j = this.f54083d;
            if (this.f54081b + 1 > j) {
                m51396b(j + ((long) this.f54086g));
            }
        }
        int read = this.f54080a.read();
        if (read != -1) {
            this.f54081b++;
        }
        return read;
    }

    public void reset() throws IOException {
        mo54471a(this.f54084e);
    }

    public long skip(long j) throws IOException {
        if (!this.f54085f) {
            long j2 = this.f54081b;
            if (j2 + j > this.f54083d) {
                m51396b(j2 + j + ((long) this.f54086g));
            }
        }
        long skip = this.f54080a.skip(j);
        this.f54081b += skip;
        return skip;
    }

    public C21503cc(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private C21503cc(InputStream inputStream, int i, int i2) {
        this.f54084e = -1;
        this.f54085f = true;
        this.f54086g = -1;
        this.f54080a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
        this.f54086g = i2;
    }

    /* renamed from: a */
    public void mo54472a(boolean z) {
        this.f54085f = z;
    }

    public int read(byte[] bArr) throws IOException {
        if (!this.f54085f) {
            long j = this.f54081b;
            if (((long) bArr.length) + j > this.f54083d) {
                m51396b(j + ((long) bArr.length) + ((long) this.f54086g));
            }
        }
        int read = this.f54080a.read(bArr);
        if (read != -1) {
            this.f54081b += (long) read;
        }
        return read;
    }

    /* renamed from: a */
    public void mo54471a(long j) throws IOException {
        if (this.f54081b > this.f54083d || j < this.f54082c) {
            throw new IOException("Cannot reset");
        }
        this.f54080a.reset();
        m51395a(this.f54082c, j);
        this.f54081b = j;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f54085f) {
            long j = this.f54081b;
            long j2 = (long) i2;
            if (j + j2 > this.f54083d) {
                m51396b(j + j2 + ((long) this.f54086g));
            }
        }
        int read = this.f54080a.read(bArr, i, i2);
        if (read != -1) {
            this.f54081b += (long) read;
        }
        return read;
    }

    /* renamed from: a */
    private void m51395a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f54080a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }
}
