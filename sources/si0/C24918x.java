package si0;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import mf0.C24361g;
import mf0.C24362h;
import okio.ByteString;
import p001a0.C0016g;
import p584jl.C17885a;
import ti0.C25014a;

/* renamed from: si0.x */
public final class C24918x implements C24902i {

    /* renamed from: b */
    public final C24898f f62987b = new C24898f();

    /* renamed from: c */
    public boolean f62988c;

    /* renamed from: d */
    public final C24893c0 f62989d;

    public C24918x(C24893c0 c0Var) {
        C24362h.m61211f(c0Var, "source");
        this.f62989d = c0Var;
    }

    /* renamed from: A1 */
    public final String mo61375A1(Charset charset) {
        C24362h.m61211f(charset, "charset");
        this.f62987b.mo61417q1(this.f62989d);
        return this.f62987b.mo61375A1(charset);
    }

    /* renamed from: D */
    public final C24898f mo61377D() {
        return this.f62987b;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62989d.mo58974E();
    }

    /* renamed from: N0 */
    public final void mo61384N0(long j) {
        if (!mo61427t0(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: R0 */
    public final int mo61389R0(C24913t tVar) {
        C24362h.m61211f(tVar, "options");
        if (!this.f62988c) {
            while (true) {
                int b = C25014a.m62722b(this.f62987b, tVar, true);
                if (b == -2) {
                    if (this.f62989d.mo53601m(this.f62987b, (long) 8192) == -1) {
                        break;
                    }
                } else if (b != -1) {
                    this.f62987b.skip((long) tVar.f62974b[b].mo60873k());
                    return b;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: V0 */
    public final ByteString mo61396V0(long j) {
        mo61384N0(j);
        return this.f62987b.mo61396V0(j);
    }

    /* renamed from: W1 */
    public final long mo61398W1(C24898f fVar) {
        long j = 0;
        while (this.f62989d.mo53601m(this.f62987b, (long) 8192) != -1) {
            long r = this.f62987b.mo61418r();
            if (r > 0) {
                j += r;
                fVar.mo58998P(this.f62987b, r);
            }
        }
        C24898f fVar2 = this.f62987b;
        long j2 = fVar2.f62947c;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fVar.mo58998P(fVar2, j2);
        return j3;
    }

    /* renamed from: a */
    public final long mo61463a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f62988c) {
            long j3 = 0;
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long w = this.f62987b.mo61431w(b, j3, j2);
                    if (w != -1) {
                        return w;
                    }
                    C24898f fVar = this.f62987b;
                    long j4 = fVar.f62947c;
                    if (j4 >= j2 || this.f62989d.mo53601m(fVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            StringBuilder g = C16759e.m42351g("fromIndex=", 0, " toIndex=");
            g.append(j2);
            throw new IllegalArgumentException(g.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f62988c) {
            this.f62988c = true;
            this.f62989d.close();
            this.f62987b.mo61413i();
        }
    }

    /* renamed from: e */
    public final C24918x mo61464e() {
        return C24911r.m62547c(new C24916v(this));
    }

    /* renamed from: f1 */
    public final byte[] mo61408f1() {
        this.f62987b.mo61417q1(this.f62989d);
        return this.f62987b.mo61408f1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo61409f2() {
        /*
            r5 = this;
            r0 = 1
            r5.mo61384N0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo61427t0(r2)
            if (r2 == 0) goto L_0x0062
            si0.f r2 = r5.f62987b
            long r3 = (long) r0
            byte r2 = r2.mo61430v(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            mf0.C24361g.m61189u(r3)
            mf0.C24361g.m61189u(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            mf0.C24362h.m61210e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            si0.f r0 = r5.f62987b
            long r0 = r0.mo61409f2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24918x.mo61409f2():long");
    }

    public final C24898f getBuffer() {
        return this.f62987b;
    }

    /* renamed from: h2 */
    public final InputStream mo61411h2() {
        return new C24919a(this);
    }

    /* renamed from: i */
    public final long mo61465i() {
        int i;
        mo61384N0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo61427t0(j2)) {
                break;
            }
            byte v = this.f62987b.mo61430v(j);
            if ((v >= ((byte) 48) && v <= ((byte) 57)) || (j == 0 && v == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                C24361g.m61189u(16);
                C24361g.m61189u(16);
                String num = Integer.toString(v, 16);
                C24362h.m61210e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f62987b.mo61374A();
    }

    public final boolean isOpen() {
        return !this.f62988c;
    }

    /* renamed from: j */
    public final void mo61467j(byte[] bArr) {
        int i = 0;
        try {
            mo61384N0((long) bArr.length);
            C24898f fVar = this.f62987b;
            fVar.getClass();
            while (i < bArr.length) {
                int read = fVar.read(bArr, i, bArr.length - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e) {
            while (true) {
                C24898f fVar2 = this.f62987b;
                long j = fVar2.f62947c;
                if (j > 0) {
                    int read2 = fVar2.read(bArr, i, (int) j);
                    if (read2 != -1) {
                        i += read2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: l1 */
    public final boolean mo61415l1() {
        if (!(!this.f62988c)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f62987b.mo61415l1() || this.f62989d.mo53601m(this.f62987b, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) {
        boolean z;
        C24362h.m61211f(fVar, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j).toString());
        } else if (!this.f62988c) {
            C24898f fVar2 = this.f62987b;
            if (fVar2.f62947c == 0 && this.f62989d.mo53601m(fVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f62987b.mo53601m(fVar, Math.min(j, this.f62987b.f62947c));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        C24362h.m61211f(byteBuffer, "sink");
        C24898f fVar = this.f62987b;
        if (fVar.f62947c == 0 && this.f62989d.mo53601m(fVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f62987b.read(byteBuffer);
    }

    public final byte readByte() {
        mo61384N0(1);
        return this.f62987b.readByte();
    }

    public final int readInt() {
        mo61384N0(4);
        return this.f62987b.readInt();
    }

    public final short readShort() {
        mo61384N0(2);
        return this.f62987b.readShort();
    }

    /* renamed from: s */
    public final long mo61424s(ByteString byteString) {
        C24362h.m61211f(byteString, "targetBytes");
        if (!this.f62988c) {
            long j = 0;
            while (true) {
                long x = this.f62987b.mo61437x(byteString, j);
                if (x != -1) {
                    return x;
                }
                C24898f fVar = this.f62987b;
                long j2 = fVar.f62947c;
                if (this.f62989d.mo53601m(fVar, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void skip(long j) {
        if (!this.f62988c) {
            while (j > 0) {
                C24898f fVar = this.f62987b;
                if (fVar.f62947c == 0 && this.f62989d.mo53601m(fVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f62987b.f62947c);
                this.f62987b.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t0 */
    public final boolean mo61427t0(long j) {
        boolean z;
        C24898f fVar;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j).toString());
        } else if (!this.f62988c) {
            do {
                fVar = this.f62987b;
                if (fVar.f62947c >= j) {
                    return true;
                }
            } while (this.f62989d.mo53601m(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("buffer(");
        k.append(this.f62989d);
        k.append(')');
        return k.toString();
    }

    /* renamed from: u */
    public final String mo61429u(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long a = mo61463a(b, 0, j2);
            if (a != -1) {
                return C25014a.m62721a(this.f62987b, a);
            }
            if (j2 < Long.MAX_VALUE && mo61427t0(j2) && this.f62987b.mo61430v(j2 - 1) == ((byte) 13) && mo61427t0(1 + j2) && this.f62987b.mo61430v(j2) == b) {
                return C25014a.m62721a(this.f62987b, j2);
            }
            C24898f fVar = new C24898f();
            C24898f fVar2 = this.f62987b;
            fVar2.mo61426t(fVar, 0, Math.min((long) 32, fVar2.f62947c));
            StringBuilder k = C13555b.m33972k("\\n not found: limit=");
            k.append(Math.min(this.f62987b.f62947c, j));
            k.append(" content=");
            k.append(fVar.mo61439z().mo60874l());
            k.append("…");
            throw new EOFException(k.toString());
        }
        throw new IllegalArgumentException(C0016g.m29l("limit < 0: ", j).toString());
    }

    /* renamed from: z0 */
    public final String mo61440z0() {
        return mo61429u(Long.MAX_VALUE);
    }

    /* renamed from: si0.x$a */
    public static final class C24919a extends InputStream {

        /* renamed from: b */
        public final /* synthetic */ C24918x f62990b;

        public C24919a(C24918x xVar) {
            this.f62990b = xVar;
        }

        public final int available() {
            C24918x xVar = this.f62990b;
            if (!xVar.f62988c) {
                return (int) Math.min(xVar.f62987b.f62947c, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f62990b.close();
        }

        public final int read() {
            C24918x xVar = this.f62990b;
            if (!xVar.f62988c) {
                C24898f fVar = xVar.f62987b;
                if (fVar.f62947c == 0 && xVar.f62989d.mo53601m(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f62990b.f62987b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f62990b + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i2) {
            C24362h.m61211f(bArr, "data");
            if (!this.f62990b.f62988c) {
                C17885a.m44460s((long) bArr.length, (long) i, (long) i2);
                C24918x xVar = this.f62990b;
                C24898f fVar = xVar.f62987b;
                if (fVar.f62947c == 0 && xVar.f62989d.mo53601m(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f62990b.f62987b.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
