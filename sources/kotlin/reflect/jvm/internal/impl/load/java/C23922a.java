package kotlin.reflect.jvm.internal.impl.load.java;

import ag0.C20986c;
import cf0.C21140n;
import hg0.C23459a;
import hg0.C23480p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh0.C23788d;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24240p;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25069e;
import zf0.C25432c;
import zg0.C25493b;
import zg0.C25498g;
import zg0.C25500i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a */
public final class C23922a {

    /* renamed from: a */
    public final JavaTypeEnhancementState f60576a;

    /* renamed from: b */
    public final C23788d<C25432c, C20986c> f60577b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$a */
    public static final class C23923a {

        /* renamed from: a */
        public final C20986c f60578a;

        /* renamed from: b */
        public final int f60579b;

        public C23923a(C20986c cVar, int i) {
            C24362h.m61211f(cVar, "typeQualifier");
            this.f60578a = cVar;
            this.f60579b = i;
        }

        /* renamed from: a */
        public final ArrayList mo59502a() {
            boolean z;
            boolean z2;
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            ArrayList arrayList = new ArrayList();
            int length = values.length;
            int i = 0;
            while (i < length) {
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = values[i];
                i++;
                boolean z3 = true;
                if ((this.f60579b & (1 << annotationQualifierApplicabilityType.ordinal())) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.TYPE_USE;
                    if (((1 << annotationQualifierApplicabilityType2.ordinal()) & this.f60579b) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        z3 = false;
                    }
                }
                if (z3) {
                    arrayList.add(annotationQualifierApplicabilityType);
                }
            }
            return arrayList;
        }
    }

    public C23922a(LockBasedStorageManager lockBasedStorageManager, JavaTypeEnhancementState javaTypeEnhancementState) {
        C24362h.m61211f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f60576a = javaTypeEnhancementState;
        this.f60577b = lockBasedStorageManager.mo59016a(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    /* renamed from: a */
    public static List m58985a(C25498g gVar, C24240p pVar) {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        if (gVar instanceof C25493b) {
            ArrayList arrayList = new ArrayList();
            for (C25498g a : (Iterable) ((C25493b) gVar).f63774a) {
                C21140n.m49439a0(m58985a(a, pVar), arrayList);
            }
            return arrayList;
        } else if (!(gVar instanceof C25500i)) {
            return EmptyList.f60173b;
        } else {
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    annotationQualifierApplicabilityType = null;
                    break;
                }
                annotationQualifierApplicabilityType = values[i];
                i++;
                if (((Boolean) pVar.invoke(gVar, annotationQualifierApplicabilityType)).booleanValue()) {
                    break;
                }
            }
            return C17875h.m44282F(annotationQualifierApplicabilityType);
        }
    }

    /* renamed from: b */
    public final ReportLevel mo59498b(C20986c cVar) {
        C24362h.m61211f(cVar, "annotationDescriptor");
        ReportLevel c = mo59499c(cVar);
        if (c == null) {
            return this.f60576a.f60553a.f60580a;
        }
        return c;
    }

    /* renamed from: c */
    public final ReportLevel mo59499c(C20986c cVar) {
        C25498g gVar;
        C25500i iVar;
        C24362h.m61211f(cVar, "annotationDescriptor");
        ReportLevel reportLevel = this.f60576a.f60553a.f60582c.get(cVar.mo53066f());
        if (reportLevel != null) {
            return reportLevel;
        }
        C25432c d = DescriptorUtilsKt.m60283d(cVar);
        if (d == null) {
            return null;
        }
        C20986c c = d.getAnnotations().mo53071c(C23459a.f59236d);
        if (c == null) {
            gVar = null;
        } else {
            gVar = (C25498g) C23825c.m58514k0(c.mo53067g().values());
        }
        if (gVar instanceof C25500i) {
            iVar = (C25500i) gVar;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        ReportLevel reportLevel2 = this.f60576a.f60553a.f60581b;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        String f = iVar.f63776c.mo61604f();
        int hashCode = f.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && f.equals("WARN")) {
                    return ReportLevel.WARN;
                }
                return null;
            } else if (!f.equals("STRICT")) {
                return null;
            } else {
                return ReportLevel.STRICT;
            }
        } else if (!f.equals("IGNORE")) {
            return null;
        } else {
            return ReportLevel.IGNORE;
        }
    }

    /* renamed from: d */
    public final C20986c mo59500d(C20986c cVar) {
        C25432c d;
        boolean z;
        C24362h.m61211f(cVar, "annotationDescriptor");
        if (this.f60576a.f60553a.f60583d || (d = DescriptorUtilsKt.m60283d(cVar)) == null) {
            return null;
        }
        if (C23459a.f59240h.contains(DescriptorUtilsKt.m60286g(d)) || d.getAnnotations().mo53070b1(C23459a.f59234b)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return cVar;
        }
        if (d.mo53513p() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.f60577b.invoke(d);
    }

    /* renamed from: e */
    public final C23923a mo59501e(C20986c cVar) {
        Object obj;
        boolean z;
        Iterable iterable;
        if (this.f60576a.f60553a.f60583d) {
            return null;
        }
        C25432c d = DescriptorUtilsKt.m60283d(cVar);
        if (d == null || !d.getAnnotations().mo53070b1(C23459a.f59235c)) {
            d = null;
        }
        if (d == null) {
            return null;
        }
        C25432c d2 = DescriptorUtilsKt.m60283d(cVar);
        C24362h.m61208c(d2);
        C20986c c = d2.getAnnotations().mo53071c(C23459a.f59235c);
        C24362h.m61208c(c);
        Map<C25069e, C25498g<?>> g = c.mo53067g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : g.entrySet()) {
            C25498g gVar = (C25498g) next.getValue();
            if (C24362h.m61206a((C25069e) next.getKey(), C23480p.f59269b)) {
                iterable = m58985a(gVar, C23913xefd2e52b.f60545f);
            } else {
                iterable = EmptyList.f60173b;
            }
            C21140n.m49439a0(iterable, arrayList);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= 1 << ((AnnotationQualifierApplicabilityType) it.next()).ordinal();
        }
        Iterator it2 = d.getAnnotations().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (mo59500d((C20986c) obj) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C20986c cVar2 = (C20986c) obj;
        if (cVar2 == null) {
            return null;
        }
        return new C23923a(cVar2, i);
    }
}
