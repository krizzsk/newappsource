package vi0;

import com.appboy.support.ValidationUtils;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.TException;
import p531he.C17394d0;
import xi0.C25276a;

/* renamed from: vi0.a */
public final class C25111a extends C25121g {

    /* renamed from: j */
    public static final C17394d0 f63334j = new C17394d0(1);

    /* renamed from: b */
    public byte[] f63335b = new byte[1];

    /* renamed from: c */
    public byte[] f63336c = new byte[2];

    /* renamed from: d */
    public byte[] f63337d = new byte[4];

    /* renamed from: e */
    public byte[] f63338e = new byte[8];

    /* renamed from: f */
    public byte[] f63339f = new byte[1];

    /* renamed from: g */
    public byte[] f63340g = new byte[2];

    /* renamed from: h */
    public byte[] f63341h = new byte[4];

    /* renamed from: i */
    public byte[] f63342i = new byte[8];

    public C25111a(C25276a aVar) {
        super(aVar);
    }

    /* renamed from: A */
    public final void mo61677A(short s) throws TException {
        byte[] bArr = this.f63336c;
        bArr[0] = (byte) ((s >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[1] = (byte) (s & 255);
        this.f63399a.mo61878c(bArr, 0, 2);
    }

    /* renamed from: B */
    public final void mo61678B(int i) throws TException {
        byte[] bArr = this.f63337d;
        bArr[0] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[1] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[2] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[3] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        this.f63399a.mo61878c(bArr, 0, 4);
    }

    /* renamed from: C */
    public final void mo61679C(long j) throws TException {
        byte[] bArr = this.f63338e;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.f63399a.mo61878c(bArr, 0, 8);
    }

    /* renamed from: D */
    public final void mo61680D(C25119e eVar) throws TException {
        mo61709v(eVar.f63394a);
        mo61678B(eVar.f63395b);
    }

    /* renamed from: E */
    public final void mo61681E() {
    }

    /* renamed from: F */
    public final void mo61682F(C25120f fVar) throws TException {
        mo61709v(fVar.f63396a);
        mo61709v(fVar.f63397b);
        mo61678B(fVar.f63398c);
    }

    /* renamed from: G */
    public final void mo61683G() {
    }

    /* renamed from: H */
    public final void mo61684H(C25123i iVar) throws TException {
        mo61709v(iVar.f63400a);
        mo61678B(iVar.f63401b);
    }

    /* renamed from: I */
    public final void mo61685I() {
    }

    /* renamed from: J */
    public final void mo61686J(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo61678B(bytes.length);
            this.f63399a.mo61878c(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: K */
    public final void mo61687K() {
    }

    /* renamed from: L */
    public final void mo61688L() {
    }

    /* renamed from: b */
    public final ByteBuffer mo61689b() throws TException {
        int i = mo61696i();
        this.f63399a.getClass();
        if (-1 >= i) {
            this.f63399a.getClass();
            this.f63399a.getClass();
            ByteBuffer wrap = ByteBuffer.wrap((byte[]) null, 0, i);
            this.f63399a.getClass();
            return wrap;
        }
        byte[] bArr = new byte[i];
        this.f63399a.mo61879b(i, bArr);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final boolean mo61690c() throws TException {
        return mo61691d() == 1;
    }

    /* renamed from: d */
    public final byte mo61691d() throws TException {
        this.f63399a.getClass();
        this.f63399a.mo61879b(1, this.f63339f);
        return this.f63339f[0];
    }

    /* renamed from: e */
    public final double mo61692e() throws TException {
        return Double.longBitsToDouble(mo61697j());
    }

    /* renamed from: f */
    public final C25113c mo61693f() throws TException {
        short s;
        byte d = mo61691d();
        if (d == 0) {
            s = 0;
        } else {
            s = mo61695h();
        }
        return new C25113c("", d, s);
    }

    /* renamed from: g */
    public final void mo61694g() {
    }

    /* renamed from: h */
    public final short mo61695h() throws TException {
        byte[] bArr = this.f63340g;
        this.f63399a.getClass();
        this.f63399a.mo61879b(2, this.f63340g);
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    /* renamed from: i */
    public final int mo61696i() throws TException {
        byte[] bArr = this.f63341h;
        this.f63399a.getClass();
        this.f63399a.mo61879b(4, this.f63341h);
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: j */
    public final long mo61697j() throws TException {
        byte[] bArr = this.f63342i;
        this.f63399a.getClass();
        this.f63399a.mo61879b(8, this.f63342i);
        return (((long) (bArr[0] & 255)) << 56) | (((long) (bArr[1] & 255)) << 48) | (((long) (bArr[2] & 255)) << 40) | (((long) (bArr[3] & 255)) << 32) | (((long) (bArr[4] & 255)) << 24) | (((long) (bArr[5] & 255)) << 16) | (((long) (bArr[6] & 255)) << 8) | ((long) (bArr[7] & 255));
    }

    /* renamed from: k */
    public final C25119e mo61698k() throws TException {
        return new C25119e(mo61691d(), mo61696i());
    }

    /* renamed from: l */
    public final void mo61699l() {
    }

    /* renamed from: m */
    public final C25120f mo61700m() throws TException {
        return new C25120f(mo61691d(), mo61691d(), mo61696i());
    }

    /* renamed from: n */
    public final void mo61701n() {
    }

    /* renamed from: o */
    public final C25123i mo61702o() throws TException {
        return new C25123i(mo61691d(), mo61696i());
    }

    /* renamed from: p */
    public final void mo61703p() {
    }

    /* renamed from: q */
    public final String mo61704q() throws TException {
        int i = mo61696i();
        this.f63399a.getClass();
        if (-1 >= i) {
            try {
                this.f63399a.getClass();
                this.f63399a.getClass();
                String str = new String((byte[]) null, 0, i, "UTF-8");
                this.f63399a.getClass();
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new TException("JVM DOES NOT SUPPORT UTF-8");
            }
        } else {
            try {
                byte[] bArr = new byte[i];
                this.f63399a.mo61879b(i, bArr);
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
                throw new TException("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    /* renamed from: r */
    public final C17394d0 mo61705r() {
        return f63334j;
    }

    /* renamed from: s */
    public final void mo61706s() {
    }

    /* renamed from: t */
    public final void mo61707t(ByteBuffer byteBuffer) throws TException {
        int limit = byteBuffer.limit() - byteBuffer.position();
        mo61678B(limit);
        this.f63399a.mo61878c(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), limit);
    }

    /* renamed from: u */
    public final void mo61708u(boolean z) throws TException {
        mo61709v(z ? (byte) 1 : 0);
    }

    /* renamed from: v */
    public final void mo61709v(byte b) throws TException {
        byte[] bArr = this.f63335b;
        bArr[0] = b;
        this.f63399a.mo61878c(bArr, 0, 1);
    }

    /* renamed from: w */
    public final void mo61710w(double d) throws TException {
        mo61679C(Double.doubleToLongBits(d));
    }

    /* renamed from: x */
    public final void mo61711x(C25113c cVar) throws TException {
        mo61709v(cVar.f63356b);
        mo61677A(cVar.f63357c);
    }

    /* renamed from: y */
    public final void mo61712y() {
    }

    /* renamed from: z */
    public final void mo61713z() throws TException {
        mo61709v((byte) 0);
    }
}
