package com.veriff.sdk.internal;

import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.veriff.sdk.internal.C21430ba;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: com.veriff.sdk.internal.bc */
final class C21434bc extends C21430ba {

    /* renamed from: g */
    private static final abl f53905g = abl.m50461a("'\\");

    /* renamed from: h */
    private static final abl f53906h = abl.m50461a("\"\\");

    /* renamed from: i */
    private static final abl f53907i = abl.m50461a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: j */
    private static final abl f53908j = abl.m50461a("\n\r");

    /* renamed from: k */
    private static final abl f53909k = abl.m50461a("*/");

    /* renamed from: l */
    private final abk f53910l;

    /* renamed from: m */
    private final abi f53911m;

    /* renamed from: n */
    private int f53912n = 0;

    /* renamed from: o */
    private long f53913o;

    /* renamed from: p */
    private int f53914p;

    /* renamed from: q */
    private String f53915q;

    public C21434bc(abk abk) {
        if (abk != null) {
            this.f53910l = abk;
            this.f53911m = abk.mo53880d();
            mo54238a(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    private void m51082A() throws IOException {
        long j;
        long c = this.f53910l.mo53874c(f53908j);
        abi abi = this.f53911m;
        if (c != -1) {
            j = c + 1;
        } else {
            j = abi.mo53864b();
        }
        abi.mo53900i(j);
    }

    /* renamed from: B */
    private boolean m51083B() throws IOException {
        boolean z;
        long j;
        abk abk = this.f53910l;
        abl abl = f53909k;
        long b = abk.mo53865b(abl);
        if (b != -1) {
            z = true;
        } else {
            z = false;
        }
        abi abi = this.f53911m;
        if (z) {
            j = b + ((long) abl.mo53946h());
        } else {
            j = abi.mo53864b();
        }
        abi.mo53900i(j);
        return z;
    }

    /* renamed from: C */
    private char m51084C() throws IOException {
        int i;
        int i2;
        if (this.f53910l.mo53872b(1)) {
            byte j = this.f53911m.mo53902j();
            if (j == 10 || j == 34 || j == 39 || j == 47 || j == 92) {
                return (char) j;
            }
            if (j == 98) {
                return 8;
            }
            if (j == 102) {
                return 12;
            }
            if (j == 110) {
                return 10;
            }
            if (j == 114) {
                return 13;
            }
            if (j == 116) {
                return 9;
            }
            if (j != 117) {
                if (this.f53890e) {
                    return (char) j;
                }
                StringBuilder k = C13555b.m33972k("Invalid escape sequence: \\");
                k.append((char) j);
                throw mo54237a(k.toString());
            } else if (this.f53910l.mo53872b(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte c2 = this.f53911m.mo53873c((long) i3);
                    char c3 = (char) (c << 4);
                    if (c2 < 48 || c2 > 57) {
                        if (c2 >= 97 && c2 <= 102) {
                            i2 = c2 - 97;
                        } else if (c2 < 65 || c2 > 70) {
                            StringBuilder k2 = C13555b.m33972k("\\u");
                            k2.append(this.f53911m.mo53886e(4));
                            throw mo54237a(k2.toString());
                        } else {
                            i2 = c2 - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = c2 - 48;
                    }
                    c = (char) (i + c3);
                }
                this.f53911m.mo53900i(4);
                return c;
            } else {
                StringBuilder k3 = C13555b.m33972k("Unterminated escape sequence at path ");
                k3.append(mo54259r());
                throw new EOFException(k3.toString());
            }
        } else {
            throw mo54237a("Unterminated escape sequence");
        }
    }

    /* renamed from: b */
    private boolean m51089b(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m51096z();
        return false;
    }

    /* renamed from: u */
    private int m51091u() throws IOException {
        int[] iArr = this.f53887b;
        int i = this.f53886a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int c = m51090c(true);
            this.f53911m.mo53902j();
            if (c != 44) {
                if (c == 59) {
                    m51096z();
                } else if (c == 93) {
                    this.f53912n = 4;
                    return 4;
                } else {
                    throw mo54237a("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int c2 = m51090c(true);
                this.f53911m.mo53902j();
                if (c2 != 44) {
                    if (c2 == 59) {
                        m51096z();
                    } else if (c2 == 125) {
                        this.f53912n = 2;
                        return 2;
                    } else {
                        throw mo54237a("Unterminated object");
                    }
                }
            }
            int c3 = m51090c(true);
            if (c3 == 34) {
                this.f53911m.mo53902j();
                this.f53912n = 13;
                return 13;
            } else if (c3 == 39) {
                this.f53911m.mo53902j();
                m51096z();
                this.f53912n = 12;
                return 12;
            } else if (c3 != 125) {
                m51096z();
                if (m51089b((int) (char) c3)) {
                    this.f53912n = 14;
                    return 14;
                }
                throw mo54237a("Expected name");
            } else if (i2 != 5) {
                this.f53911m.mo53902j();
                this.f53912n = 2;
                return 2;
            } else {
                throw mo54237a("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int c4 = m51090c(true);
            this.f53911m.mo53902j();
            if (c4 != 58) {
                if (c4 == 61) {
                    m51096z();
                    if (this.f53910l.mo53872b(1) && this.f53911m.mo53873c(0) == 62) {
                        this.f53911m.mo53902j();
                    }
                } else {
                    throw mo54237a("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m51090c(false) == -1) {
                this.f53912n = 18;
                return 18;
            }
            m51096z();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int c5 = m51090c(true);
        if (c5 == 34) {
            this.f53911m.mo53902j();
            this.f53912n = 9;
            return 9;
        } else if (c5 != 39) {
            if (!(c5 == 44 || c5 == 59)) {
                if (c5 == 91) {
                    this.f53911m.mo53902j();
                    this.f53912n = 3;
                    return 3;
                } else if (c5 != 93) {
                    if (c5 != 123) {
                        int v = m51092v();
                        if (v != 0) {
                            return v;
                        }
                        int w = m51093w();
                        if (w != 0) {
                            return w;
                        }
                        if (m51089b((int) this.f53911m.mo53873c(0))) {
                            m51096z();
                            this.f53912n = 10;
                            return 10;
                        }
                        throw mo54237a("Expected value");
                    }
                    this.f53911m.mo53902j();
                    this.f53912n = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f53911m.mo53902j();
                    this.f53912n = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m51096z();
                this.f53912n = 7;
                return 7;
            }
            throw mo54237a("Unexpected value");
        } else {
            m51096z();
            this.f53911m.mo53902j();
            this.f53912n = 8;
            return 8;
        }
    }

    /* renamed from: v */
    private int m51092v() throws IOException {
        String str;
        String str2;
        int i;
        byte c = this.f53911m.mo53873c(0);
        if (c == 116 || c == 84) {
            i = 5;
            str2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            str = "TRUE";
        } else if (c == 102 || c == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 110 && c != 78) {
            return 0;
        } else {
            i = 7;
            str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f53910l.mo53872b((long) i3)) {
                return 0;
            }
            byte c2 = this.f53911m.mo53873c((long) i2);
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f53910l.mo53872b((long) (length + 1)) && m51089b((int) this.f53911m.mo53873c((long) length))) {
            return 0;
        }
        this.f53911m.mo53900i((long) length);
        this.f53912n = i;
        return i;
    }

    /* renamed from: w */
    private int m51093w() throws IOException {
        byte c;
        boolean z;
        boolean z2 = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f53910l.mo53872b((long) i3)) {
                break;
            }
            c = this.f53911m.mo53873c((long) i2);
            if (c != 43) {
                if (c != 69 && c != 101) {
                    if (c != 45) {
                        if (c != 46) {
                            if (c >= 48 && c <= 57) {
                                if (c2 == z2 || c2 == 0) {
                                    j = (long) (-(c - 48));
                                    i = 0;
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (c - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        if (i4 > 0 || (i4 == 0 && j2 < j)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        z3 &= z;
                                        j = j2;
                                    } else if (c2 == 3) {
                                        i = 0;
                                        c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
                                        i = 0;
                                        c2 = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c2 != 2) {
                            return i;
                        } else {
                            c2 = 3;
                        }
                    } else if (c2 == 0) {
                        c2 = 1;
                        z4 = true;
                    } else if (c2 != 5) {
                        return i;
                    }
                    i2 = i3;
                    z2 = true;
                } else if (c2 != 2 && c2 != 4) {
                    return i;
                } else {
                    c2 = 5;
                    i2 = i3;
                    z2 = true;
                }
            } else if (c2 != 5) {
                return i;
            }
            c2 = 6;
            i2 = i3;
            z2 = true;
        }
        if (m51089b((int) c)) {
            return 0;
        }
        if (c2 == 2 && z3 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
            if (!z4) {
                j = -j;
            }
            this.f53913o = j;
            this.f53911m.mo53900i((long) i2);
            this.f53912n = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f53914p = i2;
            this.f53912n = 17;
            return 17;
        }
    }

    /* renamed from: x */
    private String m51094x() throws IOException {
        long c = this.f53910l.mo53874c(f53907i);
        if (c != -1) {
            return this.f53911m.mo53886e(c);
        }
        return this.f53911m.mo53914r();
    }

    /* renamed from: y */
    private void m51095y() throws IOException {
        long c = this.f53910l.mo53874c(f53907i);
        abi abi = this.f53911m;
        if (c == -1) {
            c = abi.mo53864b();
        }
        abi.mo53900i(c);
    }

    /* renamed from: z */
    private void m51096z() throws IOException {
        if (!this.f53890e) {
            throw mo54237a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: a */
    public int mo54236a(C21430ba.C21431a aVar) throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m51085a(this.f53915q, aVar);
        }
        int a = this.f53910l.mo53843a(aVar.f53893b);
        if (a != -1) {
            this.f53912n = 0;
            this.f53888c[this.f53886a - 1] = aVar.f53892a[a];
            return a;
        }
        String str = this.f53888c[this.f53886a - 1];
        String t = mo54262t();
        int a2 = m51085a(t, aVar);
        if (a2 == -1) {
            this.f53912n = 15;
            this.f53915q = t;
            this.f53888c[this.f53886a - 1] = str;
        }
        return a2;
    }

    /* renamed from: c */
    public void mo54244c() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 3) {
            mo54238a(1);
            this.f53889d[this.f53886a - 1] = 0;
            this.f53912n = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_ARRAY but was ");
        k.append(mo54249h());
        k.append(" at path ");
        k.append(mo54259r());
        throw new C21426ax(k.toString());
    }

    public void close() throws IOException {
        this.f53912n = 0;
        this.f53887b[0] = 8;
        this.f53886a = 1;
        this.f53911m.mo53920v();
        this.f53910l.close();
    }

    /* renamed from: d */
    public void mo54245d() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 4) {
            int i2 = this.f53886a - 1;
            this.f53886a = i2;
            int[] iArr = this.f53889d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f53912n = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_ARRAY but was ");
        k.append(mo54249h());
        k.append(" at path ");
        k.append(mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: e */
    public void mo54246e() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 1) {
            mo54238a(3);
            this.f53912n = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_OBJECT but was ");
        k.append(mo54249h());
        k.append(" at path ");
        k.append(mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: f */
    public void mo54247f() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 2) {
            int i2 = this.f53886a - 1;
            this.f53886a = i2;
            this.f53888c[i2] = null;
            int[] iArr = this.f53889d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f53912n = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_OBJECT but was ");
        k.append(mo54249h());
        k.append(" at path ");
        k.append(mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: g */
    public boolean mo54248g() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C21430ba.C21432b mo54249h() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        switch (i) {
            case 1:
                return C21430ba.C21432b.BEGIN_OBJECT;
            case 2:
                return C21430ba.C21432b.END_OBJECT;
            case 3:
                return C21430ba.C21432b.BEGIN_ARRAY;
            case 4:
                return C21430ba.C21432b.END_ARRAY;
            case 5:
            case 6:
                return C21430ba.C21432b.BOOLEAN;
            case 7:
                return C21430ba.C21432b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C21430ba.C21432b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C21430ba.C21432b.NAME;
            case 16:
            case 17:
                return C21430ba.C21432b.NUMBER;
            case 18:
                return C21430ba.C21432b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: i */
    public void mo54250i() throws IOException {
        if (!this.f53891f) {
            int i = this.f53912n;
            if (i == 0) {
                i = m51091u();
            }
            if (i == 14) {
                m51095y();
            } else if (i == 13) {
                m51088b(f53906h);
            } else if (i == 12) {
                m51088b(f53905g);
            } else if (i != 15) {
                StringBuilder k = C13555b.m33972k("Expected a name but was ");
                k.append(mo54249h());
                k.append(" at path ");
                k.append(mo54259r());
                throw new C21426ax(k.toString());
            }
            this.f53912n = 0;
            this.f53888c[this.f53886a - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            return;
        }
        C21430ba.C21432b h = mo54249h();
        mo54262t();
        throw new C21426ax("Cannot skip unexpected " + h + " at " + mo54259r());
    }

    /* renamed from: j */
    public String mo54251j() throws IOException {
        String str;
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 10) {
            str = m51094x();
        } else if (i == 9) {
            str = m51086a(f53906h);
        } else if (i == 8) {
            str = m51086a(f53905g);
        } else if (i == 11) {
            str = this.f53915q;
            this.f53915q = null;
        } else if (i == 16) {
            str = Long.toString(this.f53913o);
        } else if (i == 17) {
            str = this.f53911m.mo53886e((long) this.f53914p);
        } else {
            StringBuilder k = C13555b.m33972k("Expected a string but was ");
            k.append(mo54249h());
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
        this.f53912n = 0;
        int[] iArr = this.f53889d;
        int i2 = this.f53886a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: k */
    public boolean mo54252k() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 5) {
            this.f53912n = 0;
            int[] iArr = this.f53889d;
            int i2 = this.f53886a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f53912n = 0;
            int[] iArr2 = this.f53889d;
            int i3 = this.f53886a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a boolean but was ");
            k.append(mo54249h());
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
    }

    /* renamed from: l */
    public <T> T mo54253l() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 7) {
            this.f53912n = 0;
            int[] iArr = this.f53889d;
            int i2 = this.f53886a - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        StringBuilder k = C13555b.m33972k("Expected null but was ");
        k.append(mo54249h());
        k.append(" at path ");
        k.append(mo54259r());
        throw new C21426ax(k.toString());
    }

    /* renamed from: m */
    public double mo54254m() throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 16) {
            this.f53912n = 0;
            int[] iArr = this.f53889d;
            int i2 = this.f53886a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f53913o;
        }
        if (i == 17) {
            this.f53915q = this.f53911m.mo53886e((long) this.f53914p);
        } else if (i == 9) {
            this.f53915q = m51086a(f53906h);
        } else if (i == 8) {
            this.f53915q = m51086a(f53905g);
        } else if (i == 10) {
            this.f53915q = m51094x();
        } else if (i != 11) {
            StringBuilder k = C13555b.m33972k("Expected a double but was ");
            k.append(mo54249h());
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
        this.f53912n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f53915q);
            if (this.f53890e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f53915q = null;
                this.f53912n = 0;
                int[] iArr2 = this.f53889d;
                int i3 = this.f53886a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C21427ay("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo54259r());
        } catch (NumberFormatException unused) {
            StringBuilder k2 = C13555b.m33972k("Expected a double but was ");
            k2.append(this.f53915q);
            k2.append(" at path ");
            k2.append(mo54259r());
            throw new C21426ax(k2.toString());
        }
    }

    /* renamed from: n */
    public long mo54255n() throws IOException {
        String str;
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 16) {
            this.f53912n = 0;
            int[] iArr = this.f53889d;
            int i2 = this.f53886a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f53913o;
        }
        if (i == 17) {
            this.f53915q = this.f53911m.mo53886e((long) this.f53914p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m51086a(f53906h);
            } else {
                str = m51086a(f53905g);
            }
            this.f53915q = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f53912n = 0;
                int[] iArr2 = this.f53889d;
                int i3 = this.f53886a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder k = C13555b.m33972k("Expected a long but was ");
            k.append(mo54249h());
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
        this.f53912n = 11;
        try {
            long longValueExact = new BigDecimal(this.f53915q).longValueExact();
            this.f53915q = null;
            this.f53912n = 0;
            int[] iArr3 = this.f53889d;
            int i4 = this.f53886a - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder k2 = C13555b.m33972k("Expected a long but was ");
            k2.append(this.f53915q);
            k2.append(" at path ");
            k2.append(mo54259r());
            throw new C21426ax(k2.toString());
        }
    }

    /* renamed from: o */
    public int mo54256o() throws IOException {
        String str;
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 16) {
            long j = this.f53913o;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f53912n = 0;
                int[] iArr = this.f53889d;
                int i3 = this.f53886a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder k = C13555b.m33972k("Expected an int but was ");
            k.append(this.f53913o);
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
        if (i == 17) {
            this.f53915q = this.f53911m.mo53886e((long) this.f53914p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m51086a(f53906h);
            } else {
                str = m51086a(f53905g);
            }
            this.f53915q = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f53912n = 0;
                int[] iArr2 = this.f53889d;
                int i4 = this.f53886a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder k2 = C13555b.m33972k("Expected an int but was ");
            k2.append(mo54249h());
            k2.append(" at path ");
            k2.append(mo54259r());
            throw new C21426ax(k2.toString());
        }
        this.f53912n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f53915q);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f53915q = null;
                this.f53912n = 0;
                int[] iArr3 = this.f53889d;
                int i6 = this.f53886a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder k3 = C13555b.m33972k("Expected an int but was ");
            k3.append(this.f53915q);
            k3.append(" at path ");
            k3.append(mo54259r());
            throw new C21426ax(k3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder k4 = C13555b.m33972k("Expected an int but was ");
            k4.append(this.f53915q);
            k4.append(" at path ");
            k4.append(mo54259r());
            throw new C21426ax(k4.toString());
        }
    }

    /* renamed from: p */
    public void mo54257p() throws IOException {
        if (!this.f53891f) {
            int i = 0;
            do {
                int i2 = this.f53912n;
                if (i2 == 0) {
                    i2 = m51091u();
                }
                if (i2 == 3) {
                    mo54238a(1);
                } else if (i2 == 1) {
                    mo54238a(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f53886a--;
                        } else {
                            StringBuilder k = C13555b.m33972k("Expected a value but was ");
                            k.append(mo54249h());
                            k.append(" at path ");
                            k.append(mo54259r());
                            throw new C21426ax(k.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f53886a--;
                        } else {
                            StringBuilder k2 = C13555b.m33972k("Expected a value but was ");
                            k2.append(mo54249h());
                            k2.append(" at path ");
                            k2.append(mo54259r());
                            throw new C21426ax(k2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m51095y();
                    } else if (i2 == 9 || i2 == 13) {
                        m51088b(f53906h);
                    } else if (i2 == 8 || i2 == 12) {
                        m51088b(f53905g);
                    } else if (i2 == 17) {
                        this.f53911m.mo53900i((long) this.f53914p);
                    } else if (i2 == 18) {
                        StringBuilder k3 = C13555b.m33972k("Expected a value but was ");
                        k3.append(mo54249h());
                        k3.append(" at path ");
                        k3.append(mo54259r());
                        throw new C21426ax(k3.toString());
                    }
                    this.f53912n = 0;
                }
                i++;
                this.f53912n = 0;
            } while (i != 0);
            int[] iArr = this.f53889d;
            int i3 = this.f53886a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f53888c[i3 - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            return;
        }
        StringBuilder k4 = C13555b.m33972k("Cannot skip unexpected ");
        k4.append(mo54249h());
        k4.append(" at ");
        k4.append(mo54259r());
        throw new C21426ax(k4.toString());
    }

    /* renamed from: q */
    public C21430ba mo54258q() {
        return new C21434bc(this);
    }

    /* renamed from: s */
    public void mo54260s() throws IOException {
        if (mo54248g()) {
            this.f53915q = mo54262t();
            this.f53912n = 11;
        }
    }

    /* renamed from: t */
    public String mo54262t() throws IOException {
        String str;
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i == 14) {
            str = m51094x();
        } else if (i == 13) {
            str = m51086a(f53906h);
        } else if (i == 12) {
            str = m51086a(f53905g);
        } else if (i == 15) {
            str = this.f53915q;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a name but was ");
            k.append(mo54249h());
            k.append(" at path ");
            k.append(mo54259r());
            throw new C21426ax(k.toString());
        }
        this.f53912n = 0;
        this.f53888c[this.f53886a - 1] = str;
        return str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("JsonReader(");
        k.append(this.f53910l);
        k.append(")");
        return k.toString();
    }

    /* renamed from: b */
    public int mo54241b(C21430ba.C21431a aVar) throws IOException {
        int i = this.f53912n;
        if (i == 0) {
            i = m51091u();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m51087b(this.f53915q, aVar);
        }
        int a = this.f53910l.mo53843a(aVar.f53893b);
        if (a != -1) {
            this.f53912n = 0;
            int[] iArr = this.f53889d;
            int i2 = this.f53886a - 1;
            iArr[i2] = iArr[i2] + 1;
            return a;
        }
        String j = mo54251j();
        int b = m51087b(j, aVar);
        if (b == -1) {
            this.f53912n = 11;
            this.f53915q = j;
            int[] iArr2 = this.f53889d;
            int i3 = this.f53886a - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return b;
    }

    public C21434bc(C21434bc bcVar) {
        super(bcVar);
        abk g = bcVar.f53910l.mo53892g();
        this.f53910l = g;
        this.f53911m = g.mo53880d();
        this.f53912n = bcVar.f53912n;
        this.f53913o = bcVar.f53913o;
        this.f53914p = bcVar.f53914p;
        this.f53915q = bcVar.f53915q;
        try {
            g.mo53860a(bcVar.f53911m.mo53864b());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private int m51085a(String str, C21430ba.C21431a aVar) {
        int length = aVar.f53892a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f53892a[i])) {
                this.f53912n = 0;
                this.f53888c[this.f53886a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private int m51087b(String str, C21430ba.C21431a aVar) {
        int length = aVar.f53892a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f53892a[i])) {
                this.f53912n = 0;
                int[] iArr = this.f53889d;
                int i2 = this.f53886a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f53911m.mo53900i((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f53910l.mo53872b(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m51096z();
        r3 = r6.f53911m.mo53873c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f53911m.mo53902j();
        r6.f53911m.mo53902j();
        m51082A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f53911m.mo53902j();
        r6.f53911m.mo53902j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m51083B() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo54237a("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m51096z();
        m51082A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m51090c(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            com.veriff.sdk.internal.abk r2 = r6.f53910l
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo53872b((long) r4)
            if (r2 == 0) goto L_0x0082
            com.veriff.sdk.internal.abi r2 = r6.f53911m
            long r4 = (long) r1
            byte r1 = r2.mo53873c((long) r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            com.veriff.sdk.internal.abi r2 = r6.f53911m
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo53900i((long) r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            com.veriff.sdk.internal.abk r3 = r6.f53910l
            r4 = 2
            boolean r3 = r3.mo53872b((long) r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m51096z()
            com.veriff.sdk.internal.abi r3 = r6.f53911m
            r4 = 1
            byte r3 = r3.mo53873c((long) r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            com.veriff.sdk.internal.abi r1 = r6.f53911m
            r1.mo53902j()
            com.veriff.sdk.internal.abi r1 = r6.f53911m
            r1.mo53902j()
            r6.m51082A()
            goto L_0x0001
        L_0x005c:
            com.veriff.sdk.internal.abi r1 = r6.f53911m
            r1.mo53902j()
            com.veriff.sdk.internal.abi r1 = r6.f53911m
            r1.mo53902j()
            boolean r1 = r6.m51083B()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.veriff.sdk.internal.ay r7 = r6.mo54237a((java.lang.String) r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m51096z()
            r6.m51082A()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21434bc.m51090c(boolean):int");
    }

    /* renamed from: a */
    private String m51086a(abl abl) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long c = this.f53910l.mo53874c(abl);
            if (c == -1) {
                throw mo54237a("Unterminated string");
            } else if (this.f53911m.mo53873c(c) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f53911m.mo53886e(c));
                this.f53911m.mo53902j();
                sb.append(m51084C());
            } else if (sb == null) {
                String e = this.f53911m.mo53886e(c);
                this.f53911m.mo53902j();
                return e;
            } else {
                sb.append(this.f53911m.mo53886e(c));
                this.f53911m.mo53902j();
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private void m51088b(abl abl) throws IOException {
        while (true) {
            long c = this.f53910l.mo53874c(abl);
            if (c == -1) {
                throw mo54237a("Unterminated string");
            } else if (this.f53911m.mo53873c(c) == 92) {
                this.f53911m.mo53900i(c + 1);
                m51084C();
            } else {
                this.f53911m.mo53900i(c + 1);
                return;
            }
        }
    }
}
