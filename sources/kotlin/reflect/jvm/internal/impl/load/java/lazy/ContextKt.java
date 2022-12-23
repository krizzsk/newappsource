package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ag0.C20989e;
import bf0.C21049c;
import kg0.C23777b;
import kg0.C23780d;
import kg0.C23783g;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import mf0.C24362h;
import og0.C24610y;
import zf0.C25434d;

public final class ContextKt {
    /* renamed from: a */
    public static C23780d m59008a(C23780d dVar, C25434d dVar2, C24610y yVar, int i) {
        C23783g gVar;
        if ((i & 2) != 0) {
            yVar = null;
        }
        C24362h.m61211f(dVar, "<this>");
        C24362h.m61211f(dVar2, "containingDeclaration");
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(dVar, dVar2));
        C23777b bVar = dVar.f60080a;
        if (yVar == null) {
            gVar = dVar.f60081b;
        } else {
            gVar = new LazyJavaTypeParameterResolver(dVar, dVar2, yVar, 0);
        }
        return new C23780d(bVar, gVar, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0020 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final hg0.C23478n m59009b(kg0.C23780d r10, ag0.C20989e r11) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r10, r0)
            java.lang.String r0 = "additionalAnnotations"
            mf0.C24362h.m61211f(r11, r0)
            kg0.b r0 = r10.f60080a
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r0 = r0.f60076v
            boolean r0 = r0.f60555c
            if (r0 == 0) goto L_0x0017
            hg0.n r10 = r10.mo59011a()
            return r10
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0020:
            boolean r1 = r11.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r11.next()
            ag0.c r1 = (ag0.C20986c) r1
            kg0.b r4 = r10.f60080a
            kotlin.reflect.jvm.internal.impl.load.java.a r4 = r4.f60071q
            r4.getClass()
            java.lang.String r5 = "annotationDescriptor"
            mf0.C24362h.m61211f(r1, r5)
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r5 = r4.f60576a
            boolean r5 = r5.f60555c
            r6 = 0
            if (r5 == 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            java.util.LinkedHashMap r5 = hg0.C23459a.f59239g
            ug0.c r7 = r1.mo53066f()
            java.lang.Object r5 = r5.get(r7)
            hg0.i r5 = (hg0.C23469i) r5
            if (r5 != 0) goto L_0x0051
            goto L_0x007b
        L_0x0051:
            ug0.c r7 = r1.mo53066f()
            if (r7 == 0) goto L_0x006a
            java.util.Map<ug0.c, hg0.i> r8 = hg0.C23459a.f59238f
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x006a
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r8 = r4.f60576a
            lf0.l<ug0.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r8 = r8.f60554b
            java.lang.Object r7 = r8.invoke(r7)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r7 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r7
            goto L_0x006e
        L_0x006a:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r7 = r4.mo59498b(r1)
        L_0x006e:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r8 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            if (r7 == r8) goto L_0x0074
            r8 = 1
            goto L_0x0075
        L_0x0074:
            r8 = 0
        L_0x0075:
            if (r8 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r7 = r6
        L_0x0079:
            if (r7 != 0) goto L_0x007d
        L_0x007b:
            r9 = r6
            goto L_0x0095
        L_0x007d:
            pg0.f r8 = r5.f59251a
            boolean r7 = r7.isWarning()
            pg0.f r7 = pg0.C24700f.m62168a(r8, r6, r7, r3)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r8 = r5.f59252b
            boolean r5 = r5.f59253c
            java.lang.String r9 = "qualifierApplicabilityTypes"
            mf0.C24362h.m61211f(r8, r9)
            hg0.i r9 = new hg0.i
            r9.<init>(r7, r8, r5)
        L_0x0095:
            if (r9 != 0) goto L_0x00d5
            kotlin.reflect.jvm.internal.impl.load.java.a$a r5 = r4.mo59501e(r1)
            if (r5 != 0) goto L_0x009e
            goto L_0x00d6
        L_0x009e:
            ag0.c r7 = r5.f60578a
            java.util.ArrayList r5 = r5.mo59502a()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.mo59499c(r1)
            if (r1 != 0) goto L_0x00ae
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.mo59498b(r7)
        L_0x00ae:
            boolean r4 = r1.isIgnore()
            if (r4 == 0) goto L_0x00b5
            goto L_0x00d6
        L_0x00b5:
            kg0.b r4 = r10.f60080a
            kg0.c r4 = r4.f60074t
            r4.mo59010c()
            kg0.b r4 = r10.f60080a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r4 = r4.f60072r
            pg0.f r2 = r4.mo59575c(r7, r2, r2)
            if (r2 != 0) goto L_0x00c7
            goto L_0x00d6
        L_0x00c7:
            boolean r1 = r1.isWarning()
            pg0.f r1 = pg0.C24700f.m62168a(r2, r6, r1, r3)
            hg0.i r6 = new hg0.i
            r6.<init>(r1, r5)
            goto L_0x00d6
        L_0x00d5:
            r6 = r9
        L_0x00d6:
            if (r6 != 0) goto L_0x00da
            goto L_0x0020
        L_0x00da:
            r0.add(r6)
            goto L_0x0020
        L_0x00df:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x00ea
            hg0.n r10 = r10.mo59011a()
            return r10
        L_0x00ea:
            hg0.n r11 = r10.mo59011a()
            if (r11 != 0) goto L_0x00f8
            java.util.EnumMap r11 = new java.util.EnumMap
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class
            r11.<init>(r1)
            goto L_0x0100
        L_0x00f8:
            java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, hg0.i> r11 = r11.f59265a
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r11)
            r11 = r1
        L_0x0100:
            java.util.Iterator r0 = r0.iterator()
        L_0x0104:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0127
            java.lang.Object r1 = r0.next()
            hg0.i r1 = (hg0.C23469i) r1
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r4 = r1.f59252b
            java.util.Iterator r4 = r4.iterator()
        L_0x0116:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r2 = r4.next()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r2 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r2
            r11.put(r2, r1)
            r2 = 1
            goto L_0x0116
        L_0x0127:
            if (r2 != 0) goto L_0x012e
            hg0.n r10 = r10.mo59011a()
            goto L_0x0133
        L_0x012e:
            hg0.n r10 = new hg0.n
            r10.<init>(r11)
        L_0x0133:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m59009b(kg0.d, ag0.e):hg0.n");
    }

    /* renamed from: c */
    public static final C23780d m59010c(C23780d dVar, C20989e eVar) {
        C24362h.m61211f(dVar, "<this>");
        C24362h.m61211f(eVar, "additionalAnnotations");
        if (eVar.isEmpty()) {
            return dVar;
        }
        return new C23780d(dVar.f60080a, dVar.f60081b, C23812a.m58431a(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(dVar, eVar)));
    }
}
