package p988j$.time.format;

import com.appboy.configuration.AppboyConfigurationProvider;
import p988j$.time.C25783b;
import p988j$.time.C25784c;
import p988j$.time.temporal.C25842m;

/* renamed from: j$.time.format.j */
final class C25805j implements C25802g {

    /* renamed from: f */
    static final long[] f64354f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final C25842m f64355a;

    /* renamed from: b */
    final int f64356b;

    /* renamed from: c */
    final int f64357c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f64358d;

    /* renamed from: e */
    final int f64359e;

    C25805j(C25842m mVar, int i, int i2, int i3) {
        this.f64355a = mVar;
        this.f64356b = i;
        this.f64357c = i2;
        this.f64358d = i3;
        this.f64359e = 0;
    }

    protected C25805j(C25842m mVar, int i, int i2, int i3, int i4) {
        this.f64355a = mVar;
        this.f64356b = i;
        this.f64357c = i2;
        this.f64358d = i3;
        this.f64359e = i4;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        Long e = sVar.mo83712e(this.f64355a);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        C25817v b = sVar.mo83709b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        if (l.length() <= this.f64357c) {
            b.getClass();
            int i = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            int[] iArr = C25799d.f64346a;
            int a = C25818w.m64485a(this.f64358d);
            if (i >= 0) {
                if ((r4 = iArr[a]) != 1) {
                }
                sb.append('+');
            } else {
                int i2 = iArr[a];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    sb.append('-');
                } else if (i2 == 4) {
                    StringBuilder a2 = C25783b.m64414a("Field ");
                    a2.append(this.f64355a);
                    a2.append(" cannot be printed as the value ");
                    a2.append(longValue);
                    a2.append(" cannot be negative according to the SignStyle");
                    throw new C25784c(a2.toString());
                }
            }
            for (int i3 = 0; i3 < this.f64356b - l.length(); i3++) {
                sb.append('0');
            }
            sb.append(l);
            return true;
        }
        StringBuilder a3 = C25783b.m64414a("Field ");
        a3.append(this.f64355a);
        a3.append(" cannot be printed as the value ");
        a3.append(longValue);
        a3.append(" exceeds the maximum print width of ");
        a3.append(this.f64357c);
        throw new C25784c(a3.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C25805j mo83681c() {
        return this.f64359e == -1 ? this : new C25805j(this.f64355a, this.f64356b, this.f64357c, this.f64358d, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C25805j mo83682d(int i) {
        return new C25805j(this.f64355a, this.f64356b, this.f64357c, this.f64358d, this.f64359e + i);
    }

    public final String toString() {
        StringBuilder sb;
        int i = this.f64356b;
        if (i == 1 && this.f64357c == 19 && this.f64358d == 1) {
            sb = C25783b.m64414a("Value(");
            sb.append(this.f64355a);
        } else if (i == this.f64357c && this.f64358d == 4) {
            sb = C25783b.m64414a("Value(");
            sb.append(this.f64355a);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            sb.append(this.f64356b);
        } else {
            sb = C25783b.m64414a("Value(");
            sb.append(this.f64355a);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            sb.append(this.f64356b);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            sb.append(this.f64357c);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            sb.append(C25818w.m64486b(this.f64358d));
        }
        sb.append(")");
        return sb.toString();
    }
}
