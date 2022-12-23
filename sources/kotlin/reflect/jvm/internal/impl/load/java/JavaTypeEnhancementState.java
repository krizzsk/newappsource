package kotlin.reflect.jvm.internal.impl.load.java;

import bf0.C21048b;
import hg0.C23476l;
import hg0.C23477m;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;

public final class JavaTypeEnhancementState {

    /* renamed from: d */
    public static final JavaTypeEnhancementState f60552d;

    /* renamed from: a */
    public final C23925c f60553a;

    /* renamed from: b */
    public final C24236l<C25066c, ReportLevel> f60554b;

    /* renamed from: c */
    public final boolean f60555c;

    static {
        ReportLevel reportLevel;
        ReportLevel reportLevel2;
        C25066c cVar = C23476l.f59258a;
        C21048b bVar = C21048b.f52851f;
        C24362h.m61211f(bVar, "configuredKotlinVersion");
        C23477m mVar = C23476l.f59260c;
        C21048b bVar2 = mVar.f59263b;
        if (bVar2 == null || bVar2.f52855e - bVar.f52855e > 0) {
            reportLevel = mVar.f59262a;
        } else {
            reportLevel = mVar.f59264c;
        }
        C24362h.m61211f(reportLevel, "globalReportLevel");
        if (reportLevel == ReportLevel.WARN) {
            reportLevel2 = null;
        } else {
            reportLevel2 = reportLevel;
        }
        f60552d = new JavaTypeEnhancementState(new C23925c(reportLevel, reportLevel2), JavaTypeEnhancementState$Companion$DEFAULT$1.f60556b);
    }

    public JavaTypeEnhancementState(C23925c cVar, C24236l<? super C25066c, ? extends ReportLevel> lVar) {
        boolean z;
        C24362h.m61211f(lVar, "getReportLevelForAnnotation");
        this.f60553a = cVar;
        this.f60554b = lVar;
        if (!cVar.f60583d) {
            if (((JavaTypeEnhancementState$Companion$DEFAULT$1) lVar).invoke(C23476l.f59258a) != ReportLevel.IGNORE) {
                z = false;
                this.f60555c = z;
            }
        }
        z = true;
        this.f60555c = z;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JavaTypeEnhancementState(jsr305=");
        k.append(this.f60553a);
        k.append(", getReportLevelForAnnotation=");
        k.append(this.f60554b);
        k.append(')');
        return k.toString();
    }
}
