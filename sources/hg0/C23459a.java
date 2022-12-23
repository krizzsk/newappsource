package hg0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p389bl.C13637c;
import p583jk.C17875h;
import p583jk.C17884p;
import pg0.C24700f;
import ug0.C25066c;

/* renamed from: hg0.a */
public final class C23459a {

    /* renamed from: a */
    public static final C25066c f59233a = new C25066c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    public static final C25066c f59234b = new C25066c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    public static final C25066c f59235c = new C25066c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    public static final C25066c f59236d = new C25066c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    public static final List<AnnotationQualifierApplicabilityType> f59237e;

    /* renamed from: f */
    public static final Map<C25066c, C23469i> f59238f;

    /* renamed from: g */
    public static final LinkedHashMap f59239g;

    /* renamed from: h */
    public static final Set<C25066c> f59240h = C17884p.m44349T(C23481q.f59288e, C23481q.f59289f);

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> E = C17875h.m44281E(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f59237e = E;
        C25066c cVar = C23481q.f59286c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<C25066c, C23469i> A = C13637c.m34046A(new Pair(cVar, new C23469i(new C24700f(nullabilityQualifier, false), E, false)));
        f59238f = A;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C23826d.m58533X(new Pair(new C25066c("javax.annotation.ParametersAreNullableByDefault"), new C23469i(new C24700f(NullabilityQualifier.NULLABLE, false), C17875h.m44280D(annotationQualifierApplicabilityType))), new Pair(new C25066c("javax.annotation.ParametersAreNonnullByDefault"), new C23469i(new C24700f(nullabilityQualifier, false), C17875h.m44280D(annotationQualifierApplicabilityType)))));
        linkedHashMap.putAll(A);
        f59239g = linkedHashMap;
    }
}
