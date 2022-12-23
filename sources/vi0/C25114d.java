package vi0;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Stack;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import p172m9.C5720b;
import p531he.C17394d0;
import ui0.C25084b;
import xi0.C25276a;
import xi0.C25277b;

/* renamed from: vi0.d */
public final class C25114d extends C25121g {

    /* renamed from: A */
    public static final byte[] f63358A = {108, 115, 116};

    /* renamed from: B */
    public static final byte[] f63359B = {115, 101, 116};

    /* renamed from: C */
    public static final C17394d0 f63360C = new C17394d0(1);

    /* renamed from: f */
    public static final byte[] f63361f = {44};

    /* renamed from: g */
    public static final byte[] f63362g = {58};

    /* renamed from: h */
    public static final byte[] f63363h = {123};

    /* renamed from: i */
    public static final byte[] f63364i = {125};

    /* renamed from: j */
    public static final byte[] f63365j = {91};

    /* renamed from: k */
    public static final byte[] f63366k = {93};

    /* renamed from: l */
    public static final byte[] f63367l = {34};

    /* renamed from: m */
    public static final byte[] f63368m = {92};

    /* renamed from: n */
    public static final byte[] f63369n = {48};

    /* renamed from: o */
    public static final byte[] f63370o = {92, 117, 48, 48};

    /* renamed from: p */
    public static final byte[] f63371p = {0, 0, 0, 0, 0, 0, 0, 0, 98, 116, 110, 0, 102, 114, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* renamed from: q */
    public static final byte[] f63372q = {34, 92, 8, 12, 10, 13, 9};

    /* renamed from: r */
    public static final byte[] f63373r = {116, 102};

    /* renamed from: s */
    public static final byte[] f63374s = {105, 56};

    /* renamed from: t */
    public static final byte[] f63375t = {105, 49, 54};

    /* renamed from: u */
    public static final byte[] f63376u = {105, 51, 50};

    /* renamed from: v */
    public static final byte[] f63377v = {105, 54, 52};

    /* renamed from: w */
    public static final byte[] f63378w = {100, 98, 108};

    /* renamed from: x */
    public static final byte[] f63379x = {114, 101, 99};

    /* renamed from: y */
    public static final byte[] f63380y = {115, 116, 114};

    /* renamed from: z */
    public static final byte[] f63381z = {109, 97, 112};

    /* renamed from: b */
    public Stack<C25115a> f63382b = new Stack<>();

    /* renamed from: c */
    public C25115a f63383c = new C25115a();

    /* renamed from: d */
    public C25118d f63384d = new C25118d();

    /* renamed from: e */
    public byte[] f63385e = new byte[4];

    /* renamed from: vi0.d$a */
    public class C25115a {
        /* renamed from: a */
        public boolean mo61731a() {
            return false;
        }

        /* renamed from: b */
        public void mo61732b() throws TException {
        }

        /* renamed from: c */
        public void mo61733c() throws TException {
        }
    }

    /* renamed from: vi0.d$b */
    public class C25116b extends C25115a {

        /* renamed from: a */
        public boolean f63386a = true;

        public C25116b() {
        }

        /* renamed from: b */
        public final void mo61732b() throws TException {
            if (this.f63386a) {
                this.f63386a = false;
            } else {
                C25114d.this.mo61726U(C25114d.f63361f);
            }
        }

        /* renamed from: c */
        public final void mo61733c() throws TException {
            if (this.f63386a) {
                this.f63386a = false;
                return;
            }
            C25277b bVar = C25114d.this.f63399a;
            byte[] bArr = C25114d.f63361f;
            bVar.getClass();
            bVar.mo61878c(bArr, 0, 1);
        }
    }

    /* renamed from: vi0.d$c */
    public class C25117c extends C25115a {

        /* renamed from: a */
        public boolean f63388a = true;

        /* renamed from: b */
        public boolean f63389b = true;

        public C25117c() {
        }

        /* renamed from: a */
        public final boolean mo61731a() {
            return this.f63389b;
        }

        /* renamed from: b */
        public final void mo61732b() throws TException {
            byte[] bArr;
            if (this.f63388a) {
                this.f63388a = false;
                this.f63389b = true;
                return;
            }
            C25114d dVar = C25114d.this;
            if (this.f63389b) {
                bArr = C25114d.f63362g;
            } else {
                bArr = C25114d.f63361f;
            }
            dVar.mo61726U(bArr);
            this.f63389b = !this.f63389b;
        }

        /* renamed from: c */
        public final void mo61733c() throws TException {
            byte[] bArr;
            if (this.f63388a) {
                this.f63388a = false;
                this.f63389b = true;
                return;
            }
            C25277b bVar = C25114d.this.f63399a;
            if (this.f63389b) {
                bArr = C25114d.f63362g;
            } else {
                bArr = C25114d.f63361f;
            }
            bVar.getClass();
            bVar.mo61878c(bArr, 0, bArr.length);
            this.f63389b = !this.f63389b;
        }
    }

    /* renamed from: vi0.d$d */
    public class C25118d {

        /* renamed from: a */
        public boolean f63391a;

        /* renamed from: b */
        public byte[] f63392b = new byte[1];

        public C25118d() {
        }

        /* renamed from: a */
        public final byte mo61734a() throws TException {
            if (!this.f63391a) {
                C25114d.this.f63399a.mo61879b(1, this.f63392b);
            }
            this.f63391a = true;
            return this.f63392b[0];
        }

        /* renamed from: b */
        public final byte mo61735b() throws TException {
            if (this.f63391a) {
                this.f63391a = false;
            } else {
                C25114d.this.f63399a.mo61879b(1, this.f63392b);
            }
            return this.f63392b[0];
        }
    }

    public C25114d(C25276a aVar) {
        super(aVar);
    }

    /* renamed from: M */
    public static final byte m63000M(byte[] bArr) throws TException {
        byte b = 0;
        if (bArr.length > 1) {
            byte b2 = bArr[0];
            if (b2 == 100) {
                b = 4;
            } else if (b2 == 105) {
                byte b3 = bArr[1];
                if (b3 == 49) {
                    b = 6;
                } else if (b3 == 51) {
                    b = 8;
                } else if (b3 == 54) {
                    b = 10;
                } else if (b3 == 56) {
                    b = 3;
                }
            } else if (b2 == 108) {
                b = 15;
            } else if (b2 != 109) {
                switch (b2) {
                    case 114:
                        b = 12;
                        break;
                    case 115:
                        byte b4 = bArr[1];
                        if (b4 != 116) {
                            if (b4 == 101) {
                                b = 14;
                                break;
                            }
                        } else {
                            b = 11;
                            break;
                        }
                        break;
                    case 116:
                        b = 2;
                        break;
                }
            } else {
                b = 13;
            }
        }
        if (b != 0) {
            return b;
        }
        throw new TProtocolException(5, "Unrecognized type");
    }

    /* renamed from: N */
    public static final byte[] m63001N(byte b) throws TException {
        switch (b) {
            case 2:
                return f63373r;
            case 3:
                return f63374s;
            case 4:
                return f63378w;
            case 6:
                return f63375t;
            case 8:
                return f63376u;
            case 10:
                return f63377v;
            case 11:
                return f63380y;
            case 12:
                return f63379x;
            case 13:
                return f63381z;
            case 14:
                return f63359B;
            case 15:
                return f63358A;
            default:
                throw new TProtocolException(5, "Unrecognized type");
        }
    }

    /* renamed from: O */
    public static final byte m63002O(byte b) throws TException {
        int i;
        if (b >= 48 && b <= 57) {
            i = ((char) b) - '0';
        } else if (b < 97 || b > 102) {
            throw new TProtocolException(1, "Expected hex character");
        } else {
            i = (((char) b) - 'a') + 10;
        }
        return (byte) i;
    }

    /* renamed from: A */
    public final void mo61677A(short s) throws TException {
        mo61728W((long) s);
    }

    /* renamed from: B */
    public final void mo61678B(int i) throws TException {
        mo61728W((long) i);
    }

    /* renamed from: C */
    public final void mo61679C(long j) throws TException {
        mo61728W(j);
    }

    /* renamed from: D */
    public final void mo61680D(C25119e eVar) throws TException {
        mo61727V();
        mo61730Y(m63001N(eVar.f63394a));
        mo61728W((long) eVar.f63395b);
    }

    /* renamed from: E */
    public final void mo61681E() throws TException {
        this.f63383c = this.f63382b.pop();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63366k;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
    }

    /* renamed from: F */
    public final void mo61682F(C25120f fVar) throws TException {
        mo61727V();
        mo61730Y(m63001N(fVar.f63396a));
        mo61730Y(m63001N(fVar.f63397b));
        mo61728W((long) fVar.f63398c);
        mo61729X();
    }

    /* renamed from: G */
    public final void mo61683G() throws TException {
        this.f63383c = this.f63382b.pop();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63364i;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
        this.f63383c = this.f63382b.pop();
        C25277b bVar2 = this.f63399a;
        byte[] bArr2 = f63366k;
        bVar2.getClass();
        bVar2.mo61878c(bArr2, 0, 1);
    }

    /* renamed from: H */
    public final void mo61684H(C25123i iVar) throws TException {
        mo61727V();
        mo61730Y(m63001N(iVar.f63400a));
        mo61728W((long) iVar.f63401b);
    }

    /* renamed from: I */
    public final void mo61685I() throws TException {
        this.f63383c = this.f63382b.pop();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63366k;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
    }

    /* renamed from: J */
    public final void mo61686J(String str) throws TException {
        try {
            mo61730Y(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: K */
    public final void mo61687K() throws TException {
        mo61729X();
    }

    /* renamed from: L */
    public final void mo61688L() throws TException {
        this.f63383c = this.f63382b.pop();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63364i;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
    }

    /* renamed from: P */
    public final void mo61721P() throws TException {
        this.f63383c.mo61732b();
        mo61726U(f63365j);
        C25116b bVar = new C25116b();
        this.f63382b.push(this.f63383c);
        this.f63383c = bVar;
    }

    /* renamed from: Q */
    public final long mo61722Q() throws TException {
        this.f63383c.mo61732b();
        if (this.f63383c.mo61731a()) {
            mo61726U(f63367l);
        }
        String R = mo61723R();
        if (this.f63383c.mo61731a()) {
            mo61726U(f63367l);
        }
        try {
            return Long.valueOf(R).longValue();
        } catch (NumberFormatException unused) {
            throw new TProtocolException(1, "Bad data encounted in numeric data");
        }
    }

    /* renamed from: R */
    public final String mo61723R() throws TException {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte a = this.f63384d.mo61734a();
            if (!(a == 43 || a == 69 || a == 101 || a == 45 || a == 46)) {
                switch (a) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            z = true;
            if (!z) {
                return sb.toString();
            }
            sb.append((char) this.f63384d.mo61735b());
        }
    }

    /* renamed from: S */
    public final void mo61724S() throws TException {
        this.f63383c.mo61732b();
        mo61726U(f63363h);
        C25117c cVar = new C25117c();
        this.f63382b.push(this.f63383c);
        this.f63383c = cVar;
    }

    /* renamed from: T */
    public final C25084b mo61725T(boolean z) throws TException {
        C25084b bVar = new C25084b();
        if (!z) {
            this.f63383c.mo61732b();
        }
        mo61726U(f63367l);
        while (true) {
            byte b = this.f63384d.mo61735b();
            if (b == f63367l[0]) {
                return bVar;
            }
            byte[] bArr = f63370o;
            if (b == bArr[0]) {
                byte b2 = this.f63384d.mo61735b();
                if (b2 == bArr[1]) {
                    byte[] bArr2 = f63369n;
                    mo61726U(bArr2);
                    mo61726U(bArr2);
                    this.f63399a.mo61879b(2, this.f63385e);
                    b = (byte) (m63002O(this.f63385e[1]) + (m63002O(this.f63385e[0]) << 4));
                } else {
                    int indexOf = "\"\\bfnrt".indexOf(b2);
                    if (indexOf != -1) {
                        b = f63372q[indexOf];
                    } else {
                        throw new TProtocolException(1, "Expected control char");
                    }
                }
            }
            bVar.write(b);
        }
    }

    /* renamed from: U */
    public final void mo61726U(byte[] bArr) throws TException {
        byte b = this.f63384d.mo61735b();
        if (b != bArr[0]) {
            StringBuilder k = C13555b.m33972k("Unexpected character:");
            k.append((char) b);
            throw new TProtocolException(1, k.toString());
        }
    }

    /* renamed from: V */
    public final void mo61727V() throws TException {
        this.f63383c.mo61733c();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63365j;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
        C25116b bVar2 = new C25116b();
        this.f63382b.push(this.f63383c);
        this.f63383c = bVar2;
    }

    /* renamed from: W */
    public final void mo61728W(long j) throws TException {
        this.f63383c.mo61733c();
        String l = Long.toString(j);
        boolean a = this.f63383c.mo61731a();
        if (a) {
            C25277b bVar = this.f63399a;
            byte[] bArr = f63367l;
            bVar.getClass();
            bVar.mo61878c(bArr, 0, 1);
        }
        try {
            byte[] bytes = l.getBytes("UTF-8");
            C25277b bVar2 = this.f63399a;
            bVar2.getClass();
            bVar2.mo61878c(bytes, 0, bytes.length);
            if (a) {
                C25277b bVar3 = this.f63399a;
                byte[] bArr2 = f63367l;
                bVar3.getClass();
                bVar3.mo61878c(bArr2, 0, 1);
            }
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: X */
    public final void mo61729X() throws TException {
        this.f63383c.mo61733c();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63363h;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
        C25117c cVar = new C25117c();
        this.f63382b.push(this.f63383c);
        this.f63383c = cVar;
    }

    /* renamed from: Y */
    public final void mo61730Y(byte[] bArr) throws TException {
        int i;
        int i2;
        this.f63383c.mo61733c();
        C25277b bVar = this.f63399a;
        byte[] bArr2 = f63367l;
        bVar.getClass();
        bVar.mo61878c(bArr2, 0, 1);
        int length = bArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b = bArr[i3];
            if ((b & 255) >= 48) {
                byte[] bArr3 = f63368m;
                if (b == bArr3[0]) {
                    C25277b bVar2 = this.f63399a;
                    bVar2.getClass();
                    bVar2.mo61878c(bArr3, 0, 1);
                    C25277b bVar3 = this.f63399a;
                    bVar3.getClass();
                    bVar3.mo61878c(bArr3, 0, 1);
                } else {
                    this.f63399a.mo61878c(bArr, i3, 1);
                }
            } else {
                byte[] bArr4 = this.f63385e;
                byte b2 = f63371p[b];
                bArr4[0] = b2;
                if (b2 == 1) {
                    this.f63399a.mo61878c(bArr, i3, 1);
                } else if (b2 > 1) {
                    C25277b bVar4 = this.f63399a;
                    byte[] bArr5 = f63368m;
                    bVar4.getClass();
                    bVar4.mo61878c(bArr5, 0, 1);
                    this.f63399a.mo61878c(this.f63385e, 0, 1);
                } else {
                    C25277b bVar5 = this.f63399a;
                    byte[] bArr6 = f63370o;
                    bVar5.getClass();
                    bVar5.mo61878c(bArr6, 0, 4);
                    byte[] bArr7 = this.f63385e;
                    byte b3 = (byte) (((byte) (bArr[i3] >> 4)) & 15);
                    if (b3 < 10) {
                        i = ((char) b3) + '0';
                    } else {
                        i = ((char) (b3 - 10)) + 'a';
                    }
                    bArr7[0] = (byte) i;
                    byte b4 = (byte) (bArr[i3] & 15);
                    if (b4 < 10) {
                        i2 = ((char) b4) + '0';
                    } else {
                        i2 = ((char) (b4 - 10)) + 'a';
                    }
                    bArr7[1] = (byte) i2;
                    this.f63399a.mo61878c(bArr7, 0, 2);
                }
            }
        }
        C25277b bVar6 = this.f63399a;
        byte[] bArr8 = f63367l;
        bVar6.getClass();
        bVar6.mo61878c(bArr8, 0, 1);
    }

    /* renamed from: b */
    public final ByteBuffer mo61689b() throws TException {
        C25084b T = mo61725T(false);
        byte[] e = T.mo61612e();
        int i = T.mo61613i();
        int i2 = 0;
        int i3 = 0;
        while (i >= 4) {
            C5720b.m14054e(i2, e, 4, e, i3);
            i2 += 4;
            i -= 4;
            i3 += 3;
        }
        if (i > 1) {
            C5720b.m14054e(i2, e, i, e, i3);
            i3 += i - 1;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(e, 0, bArr, 0, i3);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final boolean mo61690c() throws TException {
        return mo61722Q() != 0;
    }

    /* renamed from: d */
    public final byte mo61691d() throws TException {
        return (byte) ((int) mo61722Q());
    }

    /* renamed from: e */
    public final double mo61692e() throws TException {
        this.f63383c.mo61732b();
        byte a = this.f63384d.mo61734a();
        byte[] bArr = f63367l;
        if (a == bArr[0]) {
            try {
                double doubleValue = Double.valueOf(mo61725T(true).toString("UTF-8")).doubleValue();
                if (this.f63383c.mo61731a() || Double.isNaN(doubleValue)) {
                    return doubleValue;
                }
                if (Double.isInfinite(doubleValue)) {
                    return doubleValue;
                }
                throw new TProtocolException(1, "Numeric data unexpectedly quoted");
            } catch (UnsupportedEncodingException unused) {
                throw new TException("JVM DOES NOT SUPPORT UTF-8");
            }
        } else {
            if (this.f63383c.mo61731a()) {
                mo61726U(bArr);
            }
            try {
                return Double.valueOf(mo61723R()).doubleValue();
            } catch (NumberFormatException unused2) {
                throw new TProtocolException(1, "Bad data encounted in numeric data");
            }
        }
    }

    /* renamed from: f */
    public final C25113c mo61693f() throws TException {
        short s;
        byte b = 0;
        if (this.f63384d.mo61734a() == f63364i[0]) {
            s = 0;
        } else {
            s = (short) ((int) mo61722Q());
            mo61724S();
            b = m63000M(mo61725T(false).mo61612e());
        }
        return new C25113c("", b, s);
    }

    /* renamed from: g */
    public final void mo61694g() throws TException {
        mo61726U(f63364i);
        this.f63383c = this.f63382b.pop();
    }

    /* renamed from: h */
    public final short mo61695h() throws TException {
        return (short) ((int) mo61722Q());
    }

    /* renamed from: i */
    public final int mo61696i() throws TException {
        return (int) mo61722Q();
    }

    /* renamed from: j */
    public final long mo61697j() throws TException {
        return mo61722Q();
    }

    /* renamed from: k */
    public final C25119e mo61698k() throws TException {
        mo61721P();
        return new C25119e(m63000M(mo61725T(false).mo61612e()), (int) mo61722Q());
    }

    /* renamed from: l */
    public final void mo61699l() throws TException {
        mo61726U(f63366k);
        this.f63383c = this.f63382b.pop();
    }

    /* renamed from: m */
    public final C25120f mo61700m() throws TException {
        mo61721P();
        mo61724S();
        return new C25120f(m63000M(mo61725T(false).mo61612e()), m63000M(mo61725T(false).mo61612e()), (int) mo61722Q());
    }

    /* renamed from: n */
    public final void mo61701n() throws TException {
        mo61726U(f63364i);
        this.f63383c = this.f63382b.pop();
        mo61726U(f63366k);
        this.f63383c = this.f63382b.pop();
    }

    /* renamed from: o */
    public final C25123i mo61702o() throws TException {
        mo61721P();
        return new C25123i(m63000M(mo61725T(false).mo61612e()), (int) mo61722Q());
    }

    /* renamed from: p */
    public final void mo61703p() throws TException {
        mo61726U(f63366k);
        this.f63383c = this.f63382b.pop();
    }

    /* renamed from: q */
    public final String mo61704q() throws TException {
        try {
            return mo61725T(false).toString("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: r */
    public final C17394d0 mo61705r() throws TException {
        mo61724S();
        return f63360C;
    }

    /* renamed from: s */
    public final void mo61706s() throws TException {
        mo61726U(f63364i);
        this.f63383c = this.f63382b.pop();
    }

    /* renamed from: t */
    public final void mo61707t(ByteBuffer byteBuffer) throws TException {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        this.f63383c.mo61733c();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63367l;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
        while (limit >= 3) {
            C5720b.m14056g(arrayOffset, array, 3, this.f63385e);
            this.f63399a.mo61878c(this.f63385e, 0, 4);
            arrayOffset += 3;
            limit -= 3;
        }
        if (limit > 0) {
            C5720b.m14056g(arrayOffset, array, limit, this.f63385e);
            this.f63399a.mo61878c(this.f63385e, 0, limit + 1);
        }
        C25277b bVar2 = this.f63399a;
        byte[] bArr2 = f63367l;
        bVar2.getClass();
        bVar2.mo61878c(bArr2, 0, 1);
    }

    /* renamed from: u */
    public final void mo61708u(boolean z) throws TException {
        mo61728W(z ? 1 : 0);
    }

    /* renamed from: v */
    public final void mo61709v(byte b) throws TException {
        mo61728W((long) b);
    }

    /* renamed from: w */
    public final void mo61710w(double d) throws TException {
        boolean z;
        boolean z2;
        this.f63383c.mo61733c();
        String d2 = Double.toString(d);
        char charAt = d2.charAt(0);
        if (charAt == '-' ? d2.charAt(1) != 'I' : !(charAt == 'I' || charAt == 'N')) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f63383c.mo61731a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C25277b bVar = this.f63399a;
            byte[] bArr = f63367l;
            bVar.getClass();
            bVar.mo61878c(bArr, 0, 1);
        }
        try {
            byte[] bytes = d2.getBytes("UTF-8");
            this.f63399a.mo61878c(bytes, 0, bytes.length);
            if (z2) {
                C25277b bVar2 = this.f63399a;
                byte[] bArr2 = f63367l;
                bVar2.getClass();
                bVar2.mo61878c(bArr2, 0, 1);
            }
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: x */
    public final void mo61711x(C25113c cVar) throws TException {
        mo61728W((long) cVar.f63357c);
        mo61729X();
        mo61730Y(m63001N(cVar.f63356b));
    }

    /* renamed from: y */
    public final void mo61712y() throws TException {
        this.f63383c = this.f63382b.pop();
        C25277b bVar = this.f63399a;
        byte[] bArr = f63364i;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 1);
    }

    /* renamed from: z */
    public final void mo61713z() {
    }
}
