package p333z5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: z5.b */
public final class C7485b implements Closeable {

    /* renamed from: b */
    public final InputStream f22961b;

    /* renamed from: c */
    public final Charset f22962c;

    /* renamed from: d */
    public byte[] f22963d;

    /* renamed from: e */
    public int f22964e;

    /* renamed from: f */
    public int f22965f;

    /* renamed from: z5.b$a */
    public class C7486a extends ByteArrayOutputStream {
        public C7486a(int i) {
            super(i);
        }

        public final String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C7485b.this.f22962c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C7485b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(C7487c.f22967a)) {
            this.f22961b = fileInputStream;
            this.f22962c = charset;
            this.f22963d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() throws IOException {
        synchronized (this.f22961b) {
            if (this.f22963d != null) {
                this.f22963d = null;
                this.f22961b.close();
            }
        }
    }

    /* renamed from: e */
    public final String mo23759e() throws IOException {
        int i;
        synchronized (this.f22961b) {
            byte[] bArr = this.f22963d;
            if (bArr != null) {
                if (this.f22964e >= this.f22965f) {
                    int read = this.f22961b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f22964e = 0;
                        this.f22965f = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f22964e; i2 != this.f22965f; i2++) {
                    byte[] bArr2 = this.f22963d;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f22964e;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f22962c.name());
                                this.f22964e = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f22962c.name());
                        this.f22964e = i2 + 1;
                        return str2;
                    }
                }
                C7486a aVar = new C7486a((this.f22965f - this.f22964e) + 80);
                while (true) {
                    byte[] bArr3 = this.f22963d;
                    int i4 = this.f22964e;
                    aVar.write(bArr3, i4, this.f22965f - i4);
                    this.f22965f = -1;
                    InputStream inputStream = this.f22961b;
                    byte[] bArr4 = this.f22963d;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f22964e = 0;
                        this.f22965f = read2;
                        int i5 = 0;
                        while (true) {
                            if (i5 != this.f22965f) {
                                byte[] bArr5 = this.f22963d;
                                if (bArr5[i5] == 10) {
                                    int i6 = this.f22964e;
                                    if (i5 != i6) {
                                        aVar.write(bArr5, i6, i5 - i6);
                                    }
                                    this.f22964e = i5 + 1;
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
