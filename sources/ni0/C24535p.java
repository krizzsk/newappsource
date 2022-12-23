package ni0;

import com.appboy.support.ValidationUtils;
import com.facebook.appevents.C2349o;
import ii0.C23610d;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import ni0.C24506b;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p988j$.util.Spliterator;
import si0.C24898f;
import si0.C24901h;

/* renamed from: ni0.p */
public final class C24535p implements Closeable {

    /* renamed from: h */
    public static final Logger f62147h = Logger.getLogger(C24509c.class.getName());

    /* renamed from: b */
    public final C24901h f62148b;

    /* renamed from: c */
    public final boolean f62149c;

    /* renamed from: d */
    public final C24898f f62150d;

    /* renamed from: e */
    public int f62151e = Spliterator.SUBSIZED;

    /* renamed from: f */
    public boolean f62152f;

    /* renamed from: g */
    public final C24506b.C24508b f62153g;

    public C24535p(C24901h hVar, boolean z) {
        this.f62148b = hVar;
        this.f62149c = z;
        C24898f fVar = new C24898f();
        this.f62150d = fVar;
        this.f62153g = new C24506b.C24508b(fVar);
    }

    /* renamed from: a */
    public final synchronized void mo60789a(C2349o oVar) throws IOException {
        int i;
        int i2;
        if (!this.f62152f) {
            int i3 = this.f62151e;
            int i4 = oVar.f8561a;
            if ((i4 & 32) != 0) {
                i3 = ((int[]) oVar.f8562b)[5];
            }
            this.f62151e = i3;
            if ((i4 & 2) != 0) {
                i = ((int[]) oVar.f8562b)[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                C24506b.C24508b bVar = this.f62153g;
                if ((i4 & 2) != 0) {
                    i2 = ((int[]) oVar.f8562b)[1];
                } else {
                    i2 = -1;
                }
                bVar.getClass();
                int min = Math.min(i2, Spliterator.SUBSIZED);
                int i5 = bVar.f62033d;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.f62031b = Math.min(bVar.f62031b, min);
                    }
                    bVar.f62032c = true;
                    bVar.f62033d = min;
                    int i6 = bVar.f62037h;
                    if (min < i6) {
                        if (min == 0) {
                            Arrays.fill(bVar.f62034e, (Object) null);
                            bVar.f62035f = bVar.f62034e.length - 1;
                            bVar.f62036g = 0;
                            bVar.f62037h = 0;
                        } else {
                            bVar.mo60753a(i6 - min);
                        }
                    }
                }
            }
            mo60792e(0, 0, (byte) 4, (byte) 1);
            this.f62148b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final synchronized void mo60790c(boolean z, int i, C24898f fVar, int i2) throws IOException {
        byte b;
        if (!this.f62152f) {
            if (z) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            mo60792e(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f62148b.mo58998P(fVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() throws IOException {
        this.f62152f = true;
        this.f62148b.close();
    }

    /* renamed from: e */
    public final void mo60792e(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f62147h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C24509c.m61646a(false, i, i2, b, b2));
        }
        int i3 = this.f62151e;
        if (i2 > i3) {
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i2)};
            ByteString byteString = C24509c.f62038a;
            throw new IllegalArgumentException(C23610d.m57802j("FRAME_SIZE_ERROR length > %d: %d", objArr));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            C24901h hVar = this.f62148b;
            hVar.writeByte((i2 >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            hVar.writeByte((i2 >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            hVar.writeByte(i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f62148b.writeByte(b & 255);
            this.f62148b.writeByte(b2 & 255);
            this.f62148b.writeInt(i & Integer.MAX_VALUE);
        } else {
            Object[] objArr2 = {Integer.valueOf(i)};
            ByteString byteString2 = C24509c.f62038a;
            throw new IllegalArgumentException(C23610d.m57802j("reserved bit set: %s", objArr2));
        }
    }

    /* renamed from: f */
    public final synchronized void mo60793f(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f62152f) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            mo60792e(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f62148b.writeInt(i);
            this.f62148b.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f62148b.write(bArr);
            }
            this.f62148b.flush();
        } else {
            ByteString byteString = C24509c.f62038a;
            throw new IllegalArgumentException(C23610d.m57802j("errorCode.httpCode == -1", new Object[0]));
        }
    }

    /* renamed from: g */
    public final synchronized void mo60794g(int i, int i2, boolean z) throws IOException {
        byte b;
        if (!this.f62152f) {
            if (z) {
                b = 1;
            } else {
                b = 0;
            }
            mo60792e(0, 8, (byte) 6, b);
            this.f62148b.writeInt(i);
            this.f62148b.writeInt(i2);
            this.f62148b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void mo60795h(int i, ErrorCode errorCode) throws IOException {
        if (this.f62152f) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            mo60792e(i, 4, (byte) 3, (byte) 0);
            this.f62148b.writeInt(errorCode.httpCode);
            this.f62148b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public final synchronized void mo60796i(int i, long j) throws IOException {
        if (this.f62152f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            Object[] objArr = {Long.valueOf(j)};
            ByteString byteString = C24509c.f62038a;
            throw new IllegalArgumentException(C23610d.m57802j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        } else {
            mo60792e(i, 4, (byte) 8, (byte) 0);
            this.f62148b.writeInt((int) j);
            this.f62148b.flush();
        }
    }

    /* renamed from: j */
    public final void mo60797j(int i, long j) throws IOException {
        byte b;
        while (j > 0) {
            int min = (int) Math.min((long) this.f62151e, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            mo60792e(i, min, (byte) 9, b);
            this.f62148b.mo58998P(this.f62150d, j2);
        }
    }
}
