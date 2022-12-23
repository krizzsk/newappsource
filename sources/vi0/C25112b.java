package vi0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import p066e0.C4444m0;
import p531he.C17394d0;
import xi0.C25276a;
import xi0.C25277b;

/* renamed from: vi0.b */
public class C25112b extends C25121g {

    /* renamed from: k */
    public static final C17394d0 f63343k = new C17394d0("");

    /* renamed from: l */
    public static final C25113c f63344l = new C25113c("", (byte) 0, 0);

    /* renamed from: m */
    public static final byte[] f63345m;

    /* renamed from: b */
    public C4444m0 f63346b = new C4444m0();

    /* renamed from: c */
    public short f63347c = 0;

    /* renamed from: d */
    public C25113c f63348d = null;

    /* renamed from: e */
    public Boolean f63349e = null;

    /* renamed from: f */
    public final long f63350f = -1;

    /* renamed from: g */
    public byte[] f63351g = new byte[5];

    /* renamed from: h */
    public byte[] f63352h = new byte[10];

    /* renamed from: i */
    public byte[] f63353i = new byte[1];

    /* renamed from: j */
    public byte[] f63354j = new byte[1];

    static {
        byte[] bArr = new byte[16];
        f63345m = bArr;
        bArr[0] = 0;
        bArr[2] = 1;
        bArr[3] = 3;
        bArr[6] = 4;
        bArr[8] = 5;
        bArr[10] = 6;
        bArr[4] = 7;
        bArr[11] = 8;
        bArr[15] = 9;
        bArr[14] = 10;
        bArr[13] = 11;
        bArr[12] = 12;
    }

    public C25112b(C25276a aVar) {
        super(aVar);
    }

    /* renamed from: N */
    public static byte m62956N(byte b) throws TProtocolException {
        byte b2 = (byte) (b & 15);
        switch (b2) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 10;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return 15;
            case 10:
                return 14;
            case 11:
                return 13;
            case 12:
                return 12;
            default:
                throw new TProtocolException(C16759e.m42349e("don't know what type: ", b2));
        }
    }

    /* renamed from: A */
    public final void mo61677A(short s) throws TException {
        mo61719S((s >> 31) ^ (s << 1));
    }

    /* renamed from: B */
    public final void mo61678B(int i) throws TException {
        mo61719S((i >> 31) ^ (i << 1));
    }

    /* renamed from: C */
    public final void mo61679C(long j) throws TException {
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while ((-128 & j2) != 0) {
            this.f63352h[i] = (byte) ((int) ((127 & j2) | 128));
            j2 >>>= 7;
            i++;
        }
        byte[] bArr = this.f63352h;
        bArr[i] = (byte) ((int) j2);
        this.f63399a.mo61878c(bArr, 0, i + 1);
    }

    /* renamed from: D */
    public final void mo61680D(C25119e eVar) throws TException {
        mo61717Q(eVar.f63394a, eVar.f63395b);
    }

    /* renamed from: E */
    public final void mo61681E() throws TException {
    }

    /* renamed from: F */
    public final void mo61682F(C25120f fVar) throws TException {
        int i = fVar.f63398c;
        if (i == 0) {
            mo61716P((byte) 0);
            return;
        }
        mo61719S(i);
        byte b = fVar.f63396a;
        byte[] bArr = f63345m;
        mo61716P((byte) (bArr[fVar.f63397b] | (bArr[b] << 4)));
    }

    /* renamed from: G */
    public final void mo61683G() throws TException {
    }

    /* renamed from: H */
    public final void mo61684H(C25123i iVar) throws TException {
        mo61717Q(iVar.f63400a, iVar.f63401b);
    }

    /* renamed from: I */
    public final void mo61685I() throws TException {
    }

    /* renamed from: J */
    public final void mo61686J(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            mo61719S(length);
            this.f63399a.mo61878c(bytes, 0, length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    /* renamed from: K */
    public final void mo61687K() throws TException {
        this.f63346b.mo19981a(this.f63347c);
        this.f63347c = 0;
    }

    /* renamed from: L */
    public final void mo61688L() throws TException {
        C4444m0 m0Var = this.f63346b;
        int i = m0Var.f15503b;
        m0Var.f15503b = i - 1;
        this.f63347c = ((short[]) m0Var.f15504c)[i];
    }

    /* renamed from: M */
    public final void mo61714M(int i) throws TProtocolException {
        if (i >= 0) {
            long j = this.f63350f;
            if (j != -1 && ((long) i) > j) {
                throw new TProtocolException(C16759e.m42349e("Length exceeded max allowed: ", i));
            }
            return;
        }
        throw new TProtocolException(C16759e.m42349e("Negative length: ", i));
    }

    /* renamed from: O */
    public final int mo61715O() throws TException {
        this.f63399a.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte d = mo61691d();
            i |= (d & Byte.MAX_VALUE) << i2;
            if ((d & 128) != 128) {
                return i;
            }
            i2 += 7;
        }
    }

    /* renamed from: P */
    public final void mo61716P(byte b) throws TException {
        byte[] bArr = this.f63353i;
        bArr[0] = b;
        C25277b bVar = this.f63399a;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, bArr.length);
    }

    /* renamed from: Q */
    public final void mo61717Q(byte b, int i) throws TException {
        if (i <= 14) {
            mo61716P((byte) (f63345m[b] | (i << 4)));
            return;
        }
        mo61716P((byte) (f63345m[b] | 240));
        mo61719S(i);
    }

    /* renamed from: R */
    public final void mo61718R(C25113c cVar, byte b) throws TException {
        if (b == -1) {
            b = f63345m[cVar.f63356b];
        }
        short s = cVar.f63357c;
        short s2 = this.f63347c;
        if (s <= s2 || s - s2 > 15) {
            mo61716P(b);
            mo61677A(cVar.f63357c);
        } else {
            mo61716P((byte) (b | ((s - s2) << 4)));
        }
        this.f63347c = cVar.f63357c;
    }

    /* renamed from: S */
    public final void mo61719S(int i) throws TException {
        int i2 = 0;
        while ((i & -128) != 0) {
            this.f63351g[i2] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
            i2++;
        }
        byte[] bArr = this.f63351g;
        bArr[i2] = (byte) i;
        this.f63399a.mo61878c(bArr, 0, i2 + 1);
    }

    /* renamed from: b */
    public final ByteBuffer mo61689b() throws TException {
        int O = mo61715O();
        mo61714M(O);
        if (O == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[O];
        this.f63399a.mo61879b(O, bArr);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final boolean mo61690c() throws TException {
        Boolean bool = this.f63349e;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f63349e = null;
            return booleanValue;
        } else if (mo61691d() == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final byte mo61691d() throws TException {
        this.f63399a.getClass();
        this.f63399a.mo61879b(1, this.f63354j);
        return this.f63354j[0];
    }

    /* renamed from: e */
    public final double mo61692e() throws TException {
        byte[] bArr = new byte[8];
        this.f63399a.mo61879b(8, bArr);
        return Double.longBitsToDouble((((long) bArr[0]) & 255) | ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8));
    }

    /* renamed from: f */
    public final C25113c mo61693f() throws TException {
        short s;
        boolean z;
        Boolean bool;
        byte d = mo61691d();
        if (d == 0) {
            return f63344l;
        }
        short s2 = (short) ((d & 240) >> 4);
        if (s2 == 0) {
            s = mo61695h();
        } else {
            s = (short) (this.f63347c + s2);
        }
        byte b = d & 15;
        byte b2 = (byte) b;
        C25113c cVar = new C25113c("", m62956N(b2), s);
        if (b == 1 || b == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b2 == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.f63349e = bool;
        }
        this.f63347c = s;
        return cVar;
    }

    /* renamed from: g */
    public final void mo61694g() throws TException {
    }

    /* renamed from: h */
    public final short mo61695h() throws TException {
        int O = mo61715O();
        return (short) ((-(O & 1)) ^ (O >>> 1));
    }

    /* renamed from: i */
    public final int mo61696i() throws TException {
        int O = mo61715O();
        return (-(O & 1)) ^ (O >>> 1);
    }

    /* renamed from: j */
    public final long mo61697j() throws TException {
        this.f63399a.getClass();
        int i = 0;
        long j = 0;
        while (true) {
            byte d = mo61691d();
            j |= ((long) (d & Byte.MAX_VALUE)) << i;
            if ((d & 128) != 128) {
                return (-(j & 1)) ^ (j >>> 1);
            }
            i += 7;
        }
    }

    /* renamed from: k */
    public final C25119e mo61698k() throws TException {
        byte d = mo61691d();
        int i = (d >> 4) & 15;
        if (i == 15) {
            i = mo61715O();
        }
        return new C25119e(m62956N(d), i);
    }

    /* renamed from: l */
    public final void mo61699l() throws TException {
    }

    /* renamed from: m */
    public final C25120f mo61700m() throws TException {
        byte b;
        int O = mo61715O();
        if (O == 0) {
            b = 0;
        } else {
            b = mo61691d();
        }
        return new C25120f(m62956N((byte) (b >> 4)), m62956N((byte) (b & 15)), O);
    }

    /* renamed from: n */
    public final void mo61701n() throws TException {
    }

    /* renamed from: o */
    public final C25123i mo61702o() throws TException {
        C25119e k = mo61698k();
        return new C25123i(k.f63394a, k.f63395b);
    }

    /* renamed from: p */
    public final void mo61703p() throws TException {
    }

    /* renamed from: q */
    public final String mo61704q() throws TException {
        byte[] bArr;
        int O = mo61715O();
        mo61714M(O);
        if (O == 0) {
            return "";
        }
        try {
            this.f63399a.getClass();
            if (-1 >= O) {
                this.f63399a.getClass();
                this.f63399a.getClass();
                String str = new String((byte[]) null, 0, O, "UTF-8");
                this.f63399a.getClass();
                return str;
            }
            if (O == 0) {
                bArr = new byte[0];
            } else {
                byte[] bArr2 = new byte[O];
                this.f63399a.mo61879b(O, bArr2);
                bArr = bArr2;
            }
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    /* renamed from: r */
    public final C17394d0 mo61705r() throws TException {
        this.f63346b.mo19981a(this.f63347c);
        this.f63347c = 0;
        return f63343k;
    }

    /* renamed from: s */
    public final void mo61706s() throws TException {
        C4444m0 m0Var = this.f63346b;
        int i = m0Var.f15503b;
        m0Var.f15503b = i - 1;
        this.f63347c = ((short[]) m0Var.f15504c)[i];
    }

    /* renamed from: t */
    public final void mo61707t(ByteBuffer byteBuffer) throws TException {
        int limit = byteBuffer.limit() - byteBuffer.position();
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        mo61719S(limit);
        this.f63399a.mo61878c(array, arrayOffset, limit);
    }

    /* renamed from: u */
    public final void mo61708u(boolean z) throws TException {
        C25113c cVar = this.f63348d;
        byte b = 1;
        if (cVar != null) {
            if (!z) {
                b = 2;
            }
            mo61718R(cVar, b);
            this.f63348d = null;
            return;
        }
        if (!z) {
            b = 2;
        }
        mo61716P(b);
    }

    /* renamed from: v */
    public final void mo61709v(byte b) throws TException {
        mo61716P(b);
    }

    /* renamed from: w */
    public final void mo61710w(double d) throws TException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        long doubleToLongBits = Double.doubleToLongBits(d);
        bArr[0] = (byte) ((int) (doubleToLongBits & 255));
        bArr[1] = (byte) ((int) ((doubleToLongBits >> 8) & 255));
        bArr[2] = (byte) ((int) ((doubleToLongBits >> 16) & 255));
        bArr[3] = (byte) ((int) ((doubleToLongBits >> 24) & 255));
        bArr[4] = (byte) ((int) ((doubleToLongBits >> 32) & 255));
        bArr[5] = (byte) ((int) ((doubleToLongBits >> 40) & 255));
        bArr[6] = (byte) ((int) ((doubleToLongBits >> 48) & 255));
        bArr[7] = (byte) ((int) ((doubleToLongBits >> 56) & 255));
        C25277b bVar = this.f63399a;
        bVar.getClass();
        bVar.mo61878c(bArr, 0, 8);
    }

    /* renamed from: x */
    public final void mo61711x(C25113c cVar) throws TException {
        if (cVar.f63356b == 2) {
            this.f63348d = cVar;
        } else {
            mo61718R(cVar, (byte) -1);
        }
    }

    /* renamed from: y */
    public final void mo61712y() throws TException {
    }

    /* renamed from: z */
    public final void mo61713z() throws TException {
        mo61716P((byte) 0);
    }
}
