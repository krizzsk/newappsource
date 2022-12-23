package p988j$.time.format;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p988j$.time.C25783b;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25848s;

/* renamed from: j$.time.format.h */
final class C25803h implements C25802g {

    /* renamed from: a */
    private final C25842m f64350a;

    /* renamed from: b */
    private final int f64351b;

    /* renamed from: c */
    private final int f64352c;

    /* renamed from: d */
    private final boolean f64353d;

    C25803h(C25830a aVar) {
        if (aVar == null) {
            throw new NullPointerException("field");
        } else if (aVar.mo83772c().mo83793f()) {
            this.f64350a = aVar;
            this.f64351b = 0;
            this.f64352c = 9;
            this.f64353d = true;
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        Long e = sVar.mo83712e(this.f64350a);
        if (e == null) {
            return false;
        }
        C25817v b = sVar.mo83709b();
        long longValue = e.longValue();
        C25848s c = this.f64350a.mo83772c();
        c.mo83789b(longValue, this.f64350a);
        BigDecimal valueOf = BigDecimal.valueOf(c.mo83791e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(c.mo83790d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f64351b), this.f64352c), RoundingMode.FLOOR).toPlainString().substring(2);
            b.getClass();
            if (this.f64353d) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (this.f64351b <= 0) {
            return true;
        } else {
            if (this.f64353d) {
                b.getClass();
                sb.append('.');
            }
            for (int i = 0; i < this.f64351b; i++) {
                b.getClass();
                sb.append('0');
            }
            return true;
        }
    }

    public final String toString() {
        String str = this.f64353d ? ",DecimalPoint" : "";
        StringBuilder a = C25783b.m64414a("Fraction(");
        a.append(this.f64350a);
        a.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        a.append(this.f64351b);
        a.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        a.append(this.f64352c);
        a.append(str);
        a.append(")");
        return a.toString();
    }
}
