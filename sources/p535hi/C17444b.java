package p535hi;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: hi.b */
public final class C17444b implements Closeable {

    /* renamed from: b */
    public final InputStream f44939b;

    /* renamed from: c */
    public final Charset f44940c;

    /* renamed from: d */
    public byte[] f44941d;

    /* renamed from: e */
    public int f44942e;

    /* renamed from: f */
    public int f44943f;

    /* renamed from: hi.b$a */
    public class C17445a extends ByteArrayOutputStream {
        public C17445a(int i) {
            super(i);
        }

        public final String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C17444b.this.f44940c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C17444b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(C17446c.f44945a)) {
            this.f44939b = fileInputStream;
            this.f44940c = charset;
            this.f44941d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() throws IOException {
        synchronized (this.f44939b) {
            if (this.f44941d != null) {
                this.f44941d = null;
                this.f44939b.close();
            }
        }
    }

    /* renamed from: e */
    public final String mo49918e() throws IOException {
        int i;
        synchronized (this.f44939b) {
            byte[] bArr = this.f44941d;
            if (bArr != null) {
                if (this.f44942e >= this.f44943f) {
                    int read = this.f44939b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f44942e = 0;
                        this.f44943f = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f44942e; i2 != this.f44943f; i2++) {
                    byte[] bArr2 = this.f44941d;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f44942e;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f44940c.name());
                                this.f44942e = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f44940c.name());
                        this.f44942e = i2 + 1;
                        return str2;
                    }
                }
                C17445a aVar = new C17445a((this.f44943f - this.f44942e) + 80);
                while (true) {
                    byte[] bArr3 = this.f44941d;
                    int i4 = this.f44942e;
                    aVar.write(bArr3, i4, this.f44943f - i4);
                    this.f44943f = -1;
                    InputStream inputStream = this.f44939b;
                    byte[] bArr4 = this.f44941d;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f44942e = 0;
                        this.f44943f = read2;
                        int i5 = 0;
                        while (true) {
                            if (i5 != this.f44943f) {
                                byte[] bArr5 = this.f44941d;
                                if (bArr5[i5] == 10) {
                                    int i6 = this.f44942e;
                                    if (i5 != i6) {
                                        aVar.write(bArr5, i6, i5 - i6);
                                    }
                                    this.f44942e = i5 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i5++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }
}
