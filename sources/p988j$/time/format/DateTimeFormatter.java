package p988j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p988j$.time.C25784c;
import p988j$.time.C25826n;
import p988j$.time.chrono.C25791g;
import p988j$.time.chrono.C25792h;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25839j;
import p988j$.time.temporal.C25841l;

/* renamed from: j$.time.format.DateTimeFormatter */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f */
    public static final DateTimeFormatter f64338f;

    /* renamed from: a */
    private final C25801f f64339a;

    /* renamed from: b */
    private final Locale f64340b;

    /* renamed from: c */
    private final C25817v f64341c;

    /* renamed from: d */
    private final C25791g f64342d;

    /* renamed from: e */
    private final C25826n f64343e;

    static {
        C25811p pVar = new C25811p();
        C25830a aVar = C25830a.YEAR;
        pVar.mo83699m(aVar, 4, 10, 5);
        pVar.mo83692e('-');
        C25830a aVar2 = C25830a.MONTH_OF_YEAR;
        pVar.mo83698l(aVar2, 2);
        pVar.mo83692e('-');
        C25830a aVar3 = C25830a.DAY_OF_MONTH;
        pVar.mo83698l(aVar3, 2);
        C25792h hVar = C25792h.f64330a;
        DateTimeFormatter v = pVar.mo83707v(1, hVar);
        ISO_LOCAL_DATE = v;
        C25811p pVar2 = new C25811p();
        pVar2.mo83703q();
        pVar2.mo83689a(v);
        pVar2.mo83695h();
        pVar2.mo83707v(1, hVar);
        C25811p pVar3 = new C25811p();
        pVar3.mo83703q();
        pVar3.mo83689a(v);
        pVar3.mo83702p();
        pVar3.mo83695h();
        pVar3.mo83707v(1, hVar);
        C25811p pVar4 = new C25811p();
        C25830a aVar4 = C25830a.HOUR_OF_DAY;
        pVar4.mo83698l(aVar4, 2);
        pVar4.mo83692e(':');
        C25830a aVar5 = C25830a.MINUTE_OF_HOUR;
        pVar4.mo83698l(aVar5, 2);
        pVar4.mo83702p();
        pVar4.mo83692e(':');
        C25830a aVar6 = C25830a.SECOND_OF_MINUTE;
        pVar4.mo83698l(aVar6, 2);
        pVar4.mo83702p();
        pVar4.mo83690b(C25830a.NANO_OF_SECOND);
        DateTimeFormatter v2 = pVar4.mo83707v(1, (C25792h) null);
        C25811p pVar5 = new C25811p();
        pVar5.mo83703q();
        pVar5.mo83689a(v2);
        pVar5.mo83695h();
        pVar5.mo83707v(1, (C25792h) null);
        C25811p pVar6 = new C25811p();
        pVar6.mo83703q();
        pVar6.mo83689a(v2);
        pVar6.mo83702p();
        pVar6.mo83695h();
        pVar6.mo83707v(1, (C25792h) null);
        C25811p pVar7 = new C25811p();
        pVar7.mo83703q();
        pVar7.mo83689a(v);
        pVar7.mo83692e('T');
        pVar7.mo83689a(v2);
        DateTimeFormatter v3 = pVar7.mo83707v(1, hVar);
        C25811p pVar8 = new C25811p();
        pVar8.mo83703q();
        pVar8.mo83689a(v3);
        pVar8.mo83695h();
        DateTimeFormatter v4 = pVar8.mo83707v(1, hVar);
        C25811p pVar9 = new C25811p();
        pVar9.mo83689a(v4);
        pVar9.mo83702p();
        pVar9.mo83692e('[');
        pVar9.mo83704r();
        pVar9.mo83700n();
        pVar9.mo83692e(']');
        pVar9.mo83707v(1, hVar);
        C25811p pVar10 = new C25811p();
        pVar10.mo83689a(v3);
        pVar10.mo83702p();
        pVar10.mo83695h();
        pVar10.mo83702p();
        pVar10.mo83692e('[');
        pVar10.mo83704r();
        pVar10.mo83700n();
        pVar10.mo83692e(']');
        pVar10.mo83707v(1, hVar);
        C25811p pVar11 = new C25811p();
        pVar11.mo83703q();
        pVar11.mo83699m(aVar, 4, 10, 5);
        pVar11.mo83692e('-');
        pVar11.mo83698l(C25830a.DAY_OF_YEAR, 3);
        pVar11.mo83702p();
        pVar11.mo83695h();
        pVar11.mo83707v(1, hVar);
        C25811p pVar12 = new C25811p();
        pVar12.mo83703q();
        pVar12.mo83699m(C25839j.f64432c, 4, 10, 5);
        pVar12.mo83693f("-W");
        pVar12.mo83698l(C25839j.f64431b, 2);
        pVar12.mo83692e('-');
        C25830a aVar7 = C25830a.DAY_OF_WEEK;
        pVar12.mo83698l(aVar7, 1);
        pVar12.mo83702p();
        pVar12.mo83695h();
        pVar12.mo83707v(1, hVar);
        C25811p pVar13 = new C25811p();
        pVar13.mo83703q();
        pVar13.mo83691c();
        f64338f = pVar13.mo83707v(1, (C25792h) null);
        C25811p pVar14 = new C25811p();
        pVar14.mo83703q();
        pVar14.mo83698l(aVar, 4);
        pVar14.mo83698l(aVar2, 2);
        pVar14.mo83698l(aVar3, 2);
        pVar14.mo83702p();
        pVar14.mo83694g("+HHMMss", "Z");
        pVar14.mo83707v(1, hVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C25792h hVar2 = hVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C25811p pVar15 = new C25811p();
        pVar15.mo83703q();
        pVar15.mo83705s();
        pVar15.mo83702p();
        pVar15.mo83697j(aVar7, hashMap);
        pVar15.mo83693f(", ");
        pVar15.mo83701o();
        pVar15.mo83699m(aVar3, 1, 2, 4);
        pVar15.mo83692e(' ');
        pVar15.mo83697j(aVar2, hashMap2);
        pVar15.mo83692e(' ');
        pVar15.mo83698l(aVar, 4);
        pVar15.mo83692e(' ');
        pVar15.mo83698l(aVar4, 2);
        pVar15.mo83692e(':');
        pVar15.mo83698l(aVar5, 2);
        pVar15.mo83702p();
        pVar15.mo83692e(':');
        pVar15.mo83698l(aVar6, 2);
        pVar15.mo83701o();
        pVar15.mo83692e(' ');
        pVar15.mo83694g("+HHMM", "GMT");
        pVar15.mo83707v(2, hVar2);
    }

    DateTimeFormatter(C25801f fVar, Locale locale, int i, C25792h hVar) {
        C25817v vVar = C25817v.f64389a;
        this.f64339a = fVar;
        if (locale != null) {
            this.f64340b = locale;
            this.f64341c = vVar;
            if (i != 0) {
                this.f64342d = hVar;
                this.f64343e = null;
                return;
            }
            throw new NullPointerException("resolverStyle");
        }
        throw new NullPointerException("locale");
    }

    /* renamed from: a */
    public final String mo83665a(C25841l lVar) {
        StringBuilder sb = new StringBuilder(32);
        if (lVar != null) {
            try {
                this.f64339a.mo83675a(new C25814s(lVar, this), sb);
                return sb.toString();
            } catch (IOException e) {
                throw new C25784c(e.getMessage(), e);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    /* renamed from: b */
    public final C25791g mo83666b() {
        return this.f64342d;
    }

    /* renamed from: c */
    public final C25817v mo83667c() {
        return this.f64341c;
    }

    /* renamed from: d */
    public final Locale mo83668d() {
        return this.f64340b;
    }

    /* renamed from: e */
    public final C25826n mo83669e() {
        return this.f64343e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C25801f mo83670f() {
        return this.f64339a.mo83677b();
    }

    public final String toString() {
        String fVar = this.f64339a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
