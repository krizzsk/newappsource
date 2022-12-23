package p988j$.time.format;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.Locale;
import p988j$.time.C25783b;
import p988j$.time.chrono.C25791g;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;

/* renamed from: j$.time.format.n */
final class C25809n implements C25802g {

    /* renamed from: a */
    private final C25842m f64366a;

    /* renamed from: b */
    private final TextStyle f64367b;

    /* renamed from: c */
    private final C25816u f64368c;

    /* renamed from: d */
    private volatile C25805j f64369d;

    C25809n(C25830a aVar, TextStyle textStyle, C25816u uVar) {
        this.f64366a = aVar;
        this.f64367b = textStyle;
        this.f64368c = uVar;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        String str;
        C25792h hVar;
        Long e = sVar.mo83712e(this.f64366a);
        if (e == null) {
            return false;
        }
        C25791g gVar = (C25791g) sVar.mo83711d().mo83606h(C25844o.m64619a());
        if (gVar == null || gVar == (hVar = C25792h.f64330a)) {
            str = this.f64368c.mo83673c(this.f64366a, e.longValue(), this.f64367b, sVar.mo83710c());
        } else {
            C25816u uVar = this.f64368c;
            C25842m mVar = this.f64366a;
            long longValue = e.longValue();
            TextStyle textStyle = this.f64367b;
            Locale c = sVar.mo83710c();
            uVar.getClass();
            str = (gVar == hVar || !(mVar instanceof C25830a)) ? uVar.mo83673c(mVar, longValue, textStyle, c) : null;
        }
        if (str == null) {
            if (this.f64369d == null) {
                this.f64369d = new C25805j(this.f64366a, 1, 19, 1);
            }
            return this.f64369d.mo83675a(sVar, sb);
        }
        sb.append(str);
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb;
        if (this.f64367b == TextStyle.FULL) {
            sb = C25783b.m64414a("Text(");
            obj = this.f64366a;
        } else {
            sb = C25783b.m64414a("Text(");
            sb.append(this.f64366a);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            obj = this.f64367b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
