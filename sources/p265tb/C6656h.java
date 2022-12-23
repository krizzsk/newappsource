package p265tb;

import java.io.IOException;
import java.io.InputStream;
import p583jk.C17875h;

/* renamed from: tb.h */
public final class C6656h extends InputStream {

    /* renamed from: b */
    public final C6654g f20663b;

    /* renamed from: c */
    public final C6657i f20664c;

    /* renamed from: d */
    public final byte[] f20665d;

    /* renamed from: e */
    public boolean f20666e = false;

    /* renamed from: f */
    public boolean f20667f = false;

    public C6656h(C6670t tVar, C6657i iVar) {
        this.f20663b = tVar;
        this.f20664c = iVar;
        this.f20665d = new byte[1];
    }

    public final void close() throws IOException {
        if (!this.f20667f) {
            this.f20663b.close();
            this.f20667f = true;
        }
    }

    public final int read() throws IOException {
        if (read(this.f20665d) == -1) {
            return -1;
        }
        return this.f20665d[0] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C17875h.m44304o(!this.f20667f);
        if (!this.f20666e) {
            this.f20663b.mo16699e(this.f20664c);
            this.f20666e = true;
        }
        int read = this.f20663b.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
