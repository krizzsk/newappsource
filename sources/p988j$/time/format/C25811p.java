package p988j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25839j;
import p988j$.time.temporal.C25842m;

/* renamed from: j$.time.format.p */
public final class C25811p {

    /* renamed from: f */
    private static final C25796a f64371f = new C25796a();

    /* renamed from: g */
    public static final /* synthetic */ int f64372g = 0;

    /* renamed from: a */
    private C25811p f64373a;

    /* renamed from: b */
    private final C25811p f64374b;

    /* renamed from: c */
    private final ArrayList f64375c;

    /* renamed from: d */
    private final boolean f64376d;

    /* renamed from: e */
    private int f64377e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', C25830a.ERA);
        hashMap.put('y', C25830a.YEAR_OF_ERA);
        hashMap.put('u', C25830a.YEAR);
        C25842m mVar = C25839j.f64430a;
        hashMap.put('Q', mVar);
        hashMap.put('q', mVar);
        C25830a aVar = C25830a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', C25830a.DAY_OF_YEAR);
        hashMap.put('d', C25830a.DAY_OF_MONTH);
        hashMap.put('F', C25830a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C25830a aVar2 = C25830a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', C25830a.AMPM_OF_DAY);
        hashMap.put('H', C25830a.HOUR_OF_DAY);
        hashMap.put('k', C25830a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C25830a.HOUR_OF_AMPM);
        hashMap.put('h', C25830a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', C25830a.MINUTE_OF_HOUR);
        hashMap.put('s', C25830a.SECOND_OF_MINUTE);
        C25830a aVar3 = C25830a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', C25830a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C25830a.NANO_OF_DAY);
    }

    public C25811p() {
        this.f64373a = this;
        this.f64375c = new ArrayList();
        this.f64377e = -1;
        this.f64374b = null;
        this.f64376d = false;
    }

    private C25811p(C25811p pVar) {
        this.f64373a = this;
        this.f64375c = new ArrayList();
        this.f64377e = -1;
        this.f64374b = pVar;
        this.f64376d = true;
    }

    /* renamed from: d */
    private int m64447d(C25802g gVar) {
        if (gVar != null) {
            C25811p pVar = this.f64373a;
            pVar.getClass();
            pVar.f64375c.add(gVar);
            C25811p pVar2 = this.f64373a;
            pVar2.f64377e = -1;
            return pVar2.f64375c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    /* renamed from: k */
    private void m64448k(C25805j jVar) {
        C25805j jVar2;
        C25811p pVar = this.f64373a;
        int i = pVar.f64377e;
        if (i >= 0) {
            C25805j jVar3 = (C25805j) pVar.f64375c.get(i);
            if (jVar.f64356b == jVar.f64357c && jVar.f64358d == 4) {
                jVar2 = jVar3.mo83682d(jVar.f64357c);
                m64447d(jVar.mo83681c());
                this.f64373a.f64377e = i;
            } else {
                jVar2 = jVar3.mo83681c();
                this.f64373a.f64377e = m64447d(jVar);
            }
            this.f64373a.f64375c.set(i, jVar2);
            return;
        }
        pVar.f64377e = m64447d(jVar);
    }

    /* renamed from: u */
    private DateTimeFormatter m64449u(Locale locale, int i, C25792h hVar) {
        if (locale != null) {
            while (this.f64373a.f64374b != null) {
                mo83701o();
            }
            C25801f fVar = new C25801f(this.f64375c, false);
            C25817v vVar = C25817v.f64389a;
            return new DateTimeFormatter(fVar, locale, i, hVar);
        }
        throw new NullPointerException("locale");
    }

    /* renamed from: a */
    public final void mo83689a(DateTimeFormatter dateTimeFormatter) {
        m64447d(dateTimeFormatter.mo83670f());
    }

    /* renamed from: b */
    public final void mo83690b(C25830a aVar) {
        m64447d(new C25803h(aVar));
    }

    /* renamed from: c */
    public final void mo83691c() {
        m64447d(new C25804i());
    }

    /* renamed from: e */
    public final void mo83692e(char c) {
        m64447d(new C25800e(c));
    }

    /* renamed from: f */
    public final void mo83693f(String str) {
        if (str.length() > 0) {
            m64447d(str.length() == 1 ? new C25800e(str.charAt(0)) : new C25808m(str));
        }
    }

    /* renamed from: g */
    public final void mo83694g(String str, String str2) {
        m64447d(new C25806k(str, str2));
    }

    /* renamed from: h */
    public final void mo83695h() {
        m64447d(C25806k.f64361d);
    }

    /* renamed from: i */
    public final void mo83696i(C25830a aVar, TextStyle textStyle) {
        if (aVar == null) {
            throw new NullPointerException("field");
        } else if (textStyle != null) {
            m64447d(new C25809n(aVar, textStyle, new C25816u()));
        } else {
            throw new NullPointerException("textStyle");
        }
    }

    /* renamed from: j */
    public final void mo83697j(C25830a aVar, HashMap hashMap) {
        if (aVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
            TextStyle textStyle = TextStyle.FULL;
            m64447d(new C25809n(aVar, textStyle, new C25797b(new C25815t(Collections.singletonMap(textStyle, linkedHashMap)))));
            return;
        }
        throw new NullPointerException("field");
    }

    /* renamed from: l */
    public final void mo83698l(C25842m mVar, int i) {
        if (mVar == null) {
            throw new NullPointerException("field");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        } else {
            m64448k(new C25805j(mVar, i, i, 4));
        }
    }

    /* renamed from: m */
    public final C25811p mo83699m(C25842m mVar, int i, int i2, int i3) {
        if (i == i2 && i3 == 4) {
            mo83698l(mVar, i2);
            return this;
        } else if (mVar == null) {
            throw new NullPointerException("field");
        } else if (i3 == 0) {
            throw new NullPointerException("signStyle");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m64448k(new C25805j(mVar, i, i2, i3));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: n */
    public final void mo83700n() {
        m64447d(new C25810o(f64371f));
    }

    /* renamed from: o */
    public final void mo83701o() {
        C25811p pVar = this.f64373a;
        if (pVar.f64374b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (pVar.f64375c.size() > 0) {
            C25811p pVar2 = this.f64373a;
            C25801f fVar = new C25801f(pVar2.f64375c, pVar2.f64376d);
            this.f64373a = this.f64373a.f64374b;
            m64447d(fVar);
        } else {
            this.f64373a = this.f64373a.f64374b;
        }
    }

    /* renamed from: p */
    public final void mo83702p() {
        C25811p pVar = this.f64373a;
        pVar.f64377e = -1;
        this.f64373a = new C25811p(pVar);
    }

    /* renamed from: q */
    public final void mo83703q() {
        m64447d(C25807l.INSENSITIVE);
    }

    /* renamed from: r */
    public final void mo83704r() {
        m64447d(C25807l.SENSITIVE);
    }

    /* renamed from: s */
    public final void mo83705s() {
        m64447d(C25807l.LENIENT);
    }

    /* renamed from: t */
    public final DateTimeFormatter mo83706t(Locale locale) {
        return m64449u(locale, 2, (C25792h) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final DateTimeFormatter mo83707v(int i, C25792h hVar) {
        return m64449u(Locale.getDefault(), i, hVar);
    }
}
