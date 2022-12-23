package kotlin.reflect.jvm.internal.impl.load.java;

import bf0.C21048b;
import hg0.C23476l;
import hg0.C23477m;
import hg0.C23482r;
import kotlin.jvm.internal.FunctionReference;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import ug0.C25066c;

public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements C24236l<C25066c, ReportLevel> {

    /* renamed from: b */
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 f60556b = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    public final C24857d getOwner() {
        return C24365j.f61688a.mo59365c(C23476l.class, "compiler.common.jvm");
    }

    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    public final Object invoke(Object obj) {
        ReportLevel reportLevel;
        C25066c cVar = (C25066c) obj;
        C24362h.m61211f(cVar, "p0");
        C25066c cVar2 = C23476l.f59258a;
        C23482r.f59297a.getClass();
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = C23482r.C23483a.f59299b;
        C21048b bVar = C21048b.f52851f;
        C24362h.m61211f(nullabilityAnnotationStatesImpl, "configuredReportLevels");
        C24362h.m61211f(bVar, "configuredKotlinVersion");
        ReportLevel reportLevel2 = (ReportLevel) nullabilityAnnotationStatesImpl.f60558c.invoke(cVar);
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl2 = C23476l.f59259b;
        nullabilityAnnotationStatesImpl2.getClass();
        C23477m mVar = (C23477m) nullabilityAnnotationStatesImpl2.f60558c.invoke(cVar);
        if (mVar == null) {
            return ReportLevel.IGNORE;
        }
        C21048b bVar2 = mVar.f59263b;
        if (bVar2 == null || bVar2.f52855e - bVar.f52855e > 0) {
            reportLevel = mVar.f59262a;
        } else {
            reportLevel = mVar.f59264c;
        }
        return reportLevel;
    }
}
