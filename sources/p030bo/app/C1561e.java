package p030bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: bo.app.e */
public class C1561e implements Closeable {

    /* renamed from: a */
    public final InputStream f5624a;

    /* renamed from: b */
    public final Charset f5625b;

    /* renamed from: c */
    public byte[] f5626c;

    /* renamed from: d */
    public int f5627d;

    /* renamed from: e */
    public int f5628e;

    /* renamed from: bo.app.e$a */
    public class C1562a extends ByteArrayOutputStream {
        public C1562a(int i) {
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
                return new String(this.buf, 0, i, C1561e.this.f5625b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1561e(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public boolean mo6024b() {
        return this.f5628e == -1;
    }

    /* renamed from: c */
    public String mo6025c() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f5624a) {
            if (this.f5626c != null) {
                if (this.f5627d >= this.f5628e) {
                    mo6023a();
                }
                for (int i3 = this.f5627d; i3 != this.f5628e; i3++) {
                    byte[] bArr2 = this.f5626c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f5627d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f5625b.name());
                                this.f5627d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f5625b.name());
                        this.f5627d = i3 + 1;
                        return str2;
                    }
                }
                C1562a aVar = new C1562a((this.f5628e - this.f5627d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f5626c;
                    int i5 = this.f5627d;
                    aVar.write(bArr3, i5, this.f5628e - i5);
                    this.f5628e = -1;
                    mo6023a();
                    i = this.f5627d;
                    while (true) {
                        if (i != this.f5628e) {
                            bArr = this.f5626c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f5627d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f5627d = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() {
        synchronized (this.f5624a) {
            if (this.f5626c != null) {
                this.f5626c = null;
                this.f5624a.close();
            }
        }
    }

    public C1561e(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1571f.f5674a)) {
            this.f5624a = inputStream;
            this.f5625b = charset;
            this.f5626c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public final void mo6023a() {
        InputStream inputStream = this.f5624a;
        byte[] bArr = this.f5626c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f5627d = 0;
            this.f5628e = read;
            return;
        }
        throw new EOFException();
    }
}
