package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.cache.l */
public class C2983l implements Closeable {

    /* renamed from: a */
    public final InputStream f10204a;

    /* renamed from: b */
    public final Charset f10205b;

    /* renamed from: c */
    public byte[] f10206c;

    /* renamed from: d */
    public int f10207d;

    /* renamed from: e */
    public int f10208e;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.l$a */
    public class C2984a extends ByteArrayOutputStream {
        public C2984a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(this.buf, 0, i, C2983l.this.f10205b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C2983l(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2985m.f10210a)) {
            this.f10204a = inputStream;
            this.f10205b = charset;
            this.f10206c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public final void mo13798a() throws IOException {
        InputStream inputStream = this.f10204a;
        byte[] bArr = this.f10206c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f10207d = 0;
            this.f10208e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo13799b() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f10204a) {
            if (this.f10206c != null) {
                if (this.f10207d >= this.f10208e) {
                    mo13798a();
                }
                for (int i3 = this.f10207d; i3 != this.f10208e; i3++) {
                    byte[] bArr2 = this.f10206c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f10207d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f10205b.name());
                                this.f10207d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f10205b.name());
                        this.f10207d = i3 + 1;
                        return str2;
                    }
                }
                C2984a aVar = new C2984a((this.f10208e - this.f10207d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f10206c;
                    int i5 = this.f10207d;
                    aVar.write(bArr3, i5, this.f10208e - i5);
                    this.f10208e = -1;
                    mo13798a();
                    i = this.f10207d;
                    while (true) {
                        if (i != this.f10208e) {
                            bArr = this.f10206c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f10207d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f10207d = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f10204a) {
            if (this.f10206c != null) {
                this.f10206c = null;
                this.f10204a.close();
            }
        }
    }
}
