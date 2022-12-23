package ig0;

import com.appboy.models.InAppMessageBase;
import com.appsflyer.share.Constants;
import hg0.C23480p;
import java.util.Map;
import jg0.C23725f;
import kg0.C23780d;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import mf0.C24362h;
import og0.C24585a;
import og0.C24589d;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;

/* renamed from: ig0.b */
public final class C23595b {

    /* renamed from: a */
    public static final C25069e f59671a = C25069e.m62820i(InAppMessageBase.MESSAGE);

    /* renamed from: b */
    public static final C25069e f59672b = C25069e.m62820i("allowedTargets");

    /* renamed from: c */
    public static final C25069e f59673c = C25069e.m62820i("value");

    /* renamed from: d */
    public static final Map<C25066c, C25066c> f59674d;

    /* renamed from: e */
    public static final Map<C25066c, C25066c> f59675e;

    static {
        C25066c cVar = C23872e.C23873a.f60381s;
        C25066c cVar2 = C23480p.f59270c;
        C25066c cVar3 = C23872e.C23873a.f60384v;
        C25066c cVar4 = C23480p.f59271d;
        C25066c cVar5 = C23872e.C23873a.f60385w;
        C25066c cVar6 = C23480p.f59273f;
        f59674d = C23826d.m58533X(new Pair(cVar, cVar2), new Pair(cVar3, cVar4), new Pair(cVar5, cVar6));
        f59675e = C23826d.m58533X(new Pair(cVar2, cVar), new Pair(cVar4, cVar3), new Pair(C23480p.f59272e, C23872e.C23873a.f60375m), new Pair(cVar6, cVar5));
    }

    /* renamed from: a */
    public static C23725f m57782a(C25066c cVar, C24589d dVar, C23780d dVar2) {
        C24585a c;
        C24362h.m61211f(cVar, "kotlinName");
        C24362h.m61211f(dVar, "annotationOwner");
        C24362h.m61211f(dVar2, Constants.URL_CAMPAIGN);
        if (C24362h.m61206a(cVar, C23872e.C23873a.f60375m)) {
            C25066c cVar2 = C23480p.f59272e;
            C24362h.m61210e(cVar2, "DEPRECATED_ANNOTATION");
            C24585a c2 = dVar.mo58494c(cVar2);
            if (c2 != null) {
                return new JavaDeprecatedAnnotationDescriptor(c2, dVar2);
            }
            dVar.mo58487F();
        }
        C25066c cVar3 = f59674d.get(cVar);
        if (cVar3 == null || (c = dVar.mo58494c(cVar3)) == null) {
            return null;
        }
        return m57783b(dVar2, c, false);
    }

    /* renamed from: b */
    public static C23725f m57783b(C23780d dVar, C24585a aVar, boolean z) {
        C24362h.m61211f(aVar, "annotation");
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C25065b d = aVar.mo58476d();
        if (C24362h.m61206a(d, C25065b.m62790l(C23480p.f59270c))) {
            return new JavaTargetAnnotationDescriptor(aVar, dVar);
        }
        if (C24362h.m61206a(d, C25065b.m62790l(C23480p.f59271d))) {
            return new JavaRetentionAnnotationDescriptor(aVar, dVar);
        }
        if (C24362h.m61206a(d, C25065b.m62790l(C23480p.f59273f))) {
            return new JavaAnnotationDescriptor(dVar, aVar, C23872e.C23873a.f60385w);
        }
        if (C24362h.m61206a(d, C25065b.m62790l(C23480p.f59272e))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(dVar, aVar, z);
    }
}
