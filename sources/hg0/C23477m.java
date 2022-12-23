package hg0;

import bf0.C21048b;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import mf0.C24362h;

/* renamed from: hg0.m */
public final class C23477m {

    /* renamed from: d */
    public static final C23477m f59261d = new C23477m(ReportLevel.STRICT, 6);

    /* renamed from: a */
    public final ReportLevel f59262a;

    /* renamed from: b */
    public final C21048b f59263b;

    /* renamed from: c */
    public final ReportLevel f59264c;

    public C23477m(ReportLevel reportLevel, C21048b bVar, ReportLevel reportLevel2) {
        C24362h.m61211f(reportLevel, "reportLevelBefore");
        C24362h.m61211f(reportLevel2, "reportLevelAfter");
        this.f59262a = reportLevel;
        this.f59263b = bVar;
        this.f59264c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23477m)) {
            return false;
        }
        C23477m mVar = (C23477m) obj;
        return this.f59262a == mVar.f59262a && C24362h.m61206a(this.f59263b, mVar.f59263b) && this.f59264c == mVar.f59264c;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f59262a.hashCode() * 31;
        C21048b bVar = this.f59263b;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.f52855e;
        }
        return this.f59264c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JavaNullabilityAnnotationsStatus(reportLevelBefore=");
        k.append(this.f59262a);
        k.append(", sinceVersion=");
        k.append(this.f59263b);
        k.append(", reportLevelAfter=");
        k.append(this.f59264c);
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23477m(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new C21048b(0, 0) : null, (i & 4) != 0 ? reportLevel : null);
    }
}
