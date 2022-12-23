package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.C23812a;
import kotlin.collections.C23826d;
import mf0.C24362h;
import ug0.C25066c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.c */
public final class C23925c {

    /* renamed from: a */
    public final ReportLevel f60580a;

    /* renamed from: b */
    public final ReportLevel f60581b;

    /* renamed from: c */
    public final Map<C25066c, ReportLevel> f60582c;

    /* renamed from: d */
    public final boolean f60583d;

    public C23925c() {
        throw null;
    }

    public C23925c(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map<C25066c, ReportLevel> U = C23826d.m58530U();
        this.f60580a = reportLevel;
        this.f60581b = reportLevel2;
        this.f60582c = U;
        C23812a.m58432b(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f60583d = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23925c)) {
            return false;
        }
        C23925c cVar = (C23925c) obj;
        return this.f60580a == cVar.f60580a && this.f60581b == cVar.f60581b && C24362h.m61206a(this.f60582c, cVar.f60582c);
    }

    public final int hashCode() {
        int hashCode = this.f60580a.hashCode() * 31;
        ReportLevel reportLevel = this.f60581b;
        return this.f60582c.hashCode() + ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Jsr305Settings(globalLevel=");
        k.append(this.f60580a);
        k.append(", migrationLevel=");
        k.append(this.f60581b);
        k.append(", userDefinedLevelForSpecificAnnotation=");
        k.append(this.f60582c);
        k.append(')');
        return k.toString();
    }
}
