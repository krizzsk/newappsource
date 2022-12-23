package fg0;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import og0.C24589d;
import p584jl.C17885a;
import ug0.C25066c;

/* renamed from: fg0.g */
public interface C23361g extends C24589d {

    /* renamed from: fg0.g$a */
    public static final class C23362a {
        /* renamed from: a */
        public static C23358d m57440a(C23361g gVar, C25066c cVar) {
            Annotation[] declaredAnnotations;
            C24362h.m61211f(gVar, "this");
            C24362h.m61211f(cVar, "fqName");
            AnnotatedElement t = gVar.mo58484t();
            if (t == null || (declaredAnnotations = t.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C17885a.m44414N(declaredAnnotations, cVar);
        }

        /* renamed from: b */
        public static List<C23358d> m57441b(C23361g gVar) {
            Annotation[] annotationArr;
            C24362h.m61211f(gVar, "this");
            AnnotatedElement t = gVar.mo58484t();
            if (t == null) {
                annotationArr = null;
            } else {
                annotationArr = t.getDeclaredAnnotations();
            }
            if (annotationArr == null) {
                return EmptyList.f60173b;
            }
            return C17885a.m44418P(annotationArr);
        }
    }

    /* renamed from: t */
    AnnotatedElement mo58484t();
}
