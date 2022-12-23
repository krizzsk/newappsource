package rj0;

import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p981xz.XZIOException;
import zj0.C25539d;

/* renamed from: rj0.j */
public final class C24843j extends InputStream {

    /* renamed from: k */
    public static final /* synthetic */ boolean f62798k = true;

    /* renamed from: l */
    public static /* synthetic */ Class f62799l = class$("org.tukaani.xz.SimpleInputStream");

    /* renamed from: b */
    public InputStream f62800b;

    /* renamed from: c */
    public final C25539d f62801c;

    /* renamed from: d */
    public final byte[] f62802d = new byte[4096];

    /* renamed from: e */
    public int f62803e = 0;

    /* renamed from: f */
    public int f62804f = 0;

    /* renamed from: g */
    public int f62805g = 0;

    /* renamed from: h */
    public boolean f62806h = false;

    /* renamed from: i */
    public IOException f62807i = null;

    /* renamed from: j */
    public final byte[] f62808j = new byte[1];

    static {
        if (f62799l == null) {
        }
    }

    public C24843j(InputStream inputStream, C25539d dVar) {
        inputStream.getClass();
        if (f62798k || dVar != null) {
            this.f62800b = inputStream;
            this.f62801c = dVar;
            return;
        }
        throw new AssertionError();
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public final int available() throws IOException {
        if (this.f62800b != null) {
            IOException iOException = this.f62807i;
            if (iOException == null) {
                return this.f62804f;
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f62800b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f62800b = null;
            }
        }
    }

    public final int read() throws IOException {
        if (read(this.f62808j, 0, 1) == -1) {
            return -1;
        }
        return this.f62808j[0] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f62800b != null) {
                IOException iOException = this.f62807i;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.f62804f, i2);
                            System.arraycopy(this.f62802d, this.f62803e, bArr, i, min);
                            int i5 = this.f62803e + min;
                            this.f62803e = i5;
                            int i6 = this.f62804f - min;
                            this.f62804f = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.f62805g;
                            if (i5 + i6 + i7 == 4096) {
                                byte[] bArr2 = this.f62802d;
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.f62803e = 0;
                            }
                            if (i2 == 0) {
                                break;
                            } else if (this.f62806h) {
                                break;
                            } else {
                                boolean z = f62798k;
                                if (!z) {
                                    if (this.f62804f != 0) {
                                        throw new AssertionError();
                                    }
                                }
                                int i8 = this.f62803e;
                                int i9 = this.f62804f;
                                int i11 = this.f62805g;
                                int read = this.f62800b.read(this.f62802d, i8 + i9 + i11, 4096 - ((i8 + i9) + i11));
                                if (read == -1) {
                                    this.f62806h = true;
                                    this.f62804f = this.f62805g;
                                    this.f62805g = 0;
                                } else {
                                    int i12 = this.f62805g + read;
                                    this.f62805g = i12;
                                    int a = this.f62801c.mo21181a(this.f62803e, i12, this.f62802d);
                                    this.f62804f = a;
                                    if (!z) {
                                        if (a > this.f62805g) {
                                            throw new AssertionError();
                                        }
                                    }
                                    this.f62805g -= a;
                                }
                            }
                        } catch (IOException e) {
                            this.f62807i = e;
                            throw e;
                        }
                    }
                    if (i4 > 0) {
                        return i4;
                    }
                    return -1;
                }
                throw iOException;
            }
            throw new XZIOException("Stream closed");
        }
    }
}
