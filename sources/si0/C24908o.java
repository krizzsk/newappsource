package si0;

import com.appboy.support.ValidationUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import mf0.C24362h;
import p001a0.C0016g;

/* renamed from: si0.o */
public final class C24908o implements C24893c0 {

    /* renamed from: b */
    public byte f62961b;

    /* renamed from: c */
    public final C24918x f62962c;

    /* renamed from: d */
    public final Inflater f62963d;

    /* renamed from: e */
    public final C24909p f62964e;

    /* renamed from: f */
    public final CRC32 f62965f = new CRC32();

    public C24908o(C24893c0 c0Var) {
        C24362h.m61211f(c0Var, "source");
        C24918x xVar = new C24918x(c0Var);
        this.f62962c = xVar;
        Inflater inflater = new Inflater(true);
        this.f62963d = inflater;
        this.f62964e = new C24909p(xVar, inflater);
    }

    /* renamed from: a */
    public static void m62537a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(C13555b.m33971j(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
        }
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62962c.mo58974E();
    }

    /* renamed from: c */
    public final void mo61455c(C24898f fVar, long j, long j2) {
        C24920y yVar = fVar.f62946b;
        C24362h.m61208c(yVar);
        while (true) {
            int i = yVar.f62993c;
            int i2 = yVar.f62992b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            yVar = yVar.f62996f;
            C24362h.m61208c(yVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) yVar.f62992b) + j);
            int min = (int) Math.min((long) (yVar.f62993c - i3), j2);
            this.f62965f.update(yVar.f62991a, i3, min);
            j2 -= (long) min;
            yVar = yVar.f62996f;
            C24362h.m61208c(yVar);
            j = 0;
        }
    }

    public final void close() throws IOException {
        this.f62964e.close();
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2;
        C24898f fVar2 = fVar;
        long j3 = j;
        C24362h.m61211f(fVar2, "sink");
        boolean z5 = false;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f62961b == 0) {
                this.f62962c.mo61384N0(10);
                byte v = this.f62962c.f62987b.mo61430v(3);
                if (((v >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    mo61455c(this.f62962c.f62987b, 0, 10);
                }
                m62537a(8075, this.f62962c.readShort(), "ID1ID2");
                this.f62962c.skip(8);
                if (((v >> 2) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    this.f62962c.mo61384N0(2);
                    if (z2) {
                        mo61455c(this.f62962c.f62987b, 0, 2);
                    }
                    short readShort = this.f62962c.f62987b.readShort() & 65535;
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    this.f62962c.mo61384N0(j4);
                    if (z2) {
                        j2 = j4;
                        mo61455c(this.f62962c.f62987b, 0, j4);
                    } else {
                        j2 = j4;
                    }
                    this.f62962c.skip(j2);
                }
                if (((v >> 3) & 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    long a = this.f62962c.mo61463a((byte) 0, 0, Long.MAX_VALUE);
                    if (a != -1) {
                        if (z2) {
                            mo61455c(this.f62962c.f62987b, 0, a + 1);
                        }
                        this.f62962c.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((v >> 4) & 1) == 1) {
                    z5 = true;
                }
                if (z5) {
                    long a2 = this.f62962c.mo61463a((byte) 0, 0, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z2) {
                            mo61455c(this.f62962c.f62987b, 0, a2 + 1);
                        }
                        this.f62962c.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    C24918x xVar = this.f62962c;
                    xVar.mo61384N0(2);
                    short readShort2 = xVar.f62987b.readShort() & 65535;
                    m62537a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) this.f62965f.getValue()), "FHCRC");
                    this.f62965f.reset();
                }
                this.f62961b = 1;
            }
            if (this.f62961b == 1) {
                long j5 = fVar2.f62947c;
                long m = this.f62964e.mo53601m(fVar2, j3);
                if (m != -1) {
                    mo61455c(fVar, j5, m);
                    return m;
                }
                this.f62961b = 2;
            }
            if (this.f62961b == 2) {
                C24918x xVar2 = this.f62962c;
                xVar2.mo61384N0(4);
                int readInt = xVar2.f62987b.readInt();
                m62537a(((readInt & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24) | ((readInt & -16777216) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) this.f62965f.getValue(), "CRC");
                C24918x xVar3 = this.f62962c;
                xVar3.mo61384N0(4);
                int readInt2 = xVar3.f62987b.readInt();
                m62537a(((readInt2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24) | ((readInt2 & -16777216) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & 65280) << 8), (int) this.f62963d.getBytesWritten(), "ISIZE");
                this.f62961b = 3;
                if (!this.f62962c.mo61415l1()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
