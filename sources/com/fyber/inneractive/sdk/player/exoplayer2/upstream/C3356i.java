package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.i */
public final class C3356i extends InputStream {

    /* renamed from: a */
    public final C3353g f11998a;

    /* renamed from: b */
    public final C3357j f11999b;

    /* renamed from: c */
    public final byte[] f12000c;

    /* renamed from: d */
    public boolean f12001d = false;

    /* renamed from: e */
    public boolean f12002e = false;

    /* renamed from: f */
    public long f12003f;

    public C3356i(C3353g gVar, C3357j jVar) {
        this.f11998a = gVar;
        this.f11999b = jVar;
        this.f12000c = new byte[1];
    }

    public void close() throws IOException {
        if (!this.f12002e) {
            this.f11998a.close();
            this.f12002e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f12000c) == -1) {
            return -1;
        }
        return this.f12000c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C3380a.m8507b(!this.f12002e);
        if (!this.f12001d) {
            this.f11998a.mo13780a(this.f11999b);
            this.f12001d = true;
        }
        int a = this.f11998a.mo13779a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f12003f += (long) a;
        return a;
    }
}
