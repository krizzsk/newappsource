package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;
import zg0.C25500i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 */
final class C23913xefd2e52b extends Lambda implements C24240p<C25500i, AnnotationQualifierApplicabilityType, Boolean> {

    /* renamed from: f */
    public static final C23913xefd2e52b f60545f = new C23913xefd2e52b();

    public C23913xefd2e52b() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        C25500i iVar = (C25500i) obj;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) obj2;
        C24362h.m61211f(iVar, "$this$mapConstantToQualifierApplicabilityTypes");
        C24362h.m61211f(annotationQualifierApplicabilityType, "it");
        return Boolean.valueOf(C24362h.m61206a(iVar.f63776c.mo61605g(), annotationQualifierApplicabilityType.getJavaTarget()));
    }
}
