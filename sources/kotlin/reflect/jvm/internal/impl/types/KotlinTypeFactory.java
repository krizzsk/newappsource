package kotlin.reflect.jvm.internal.impl.types;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import lh0.C24254a0;
import lh0.C24262e;
import lh0.C24265f0;
import lh0.C24267g0;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24289p;
import lh0.C24301s;
import lh0.C24306u0;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25446h0;

public final class KotlinTypeFactory {

    /* renamed from: a */
    public static final /* synthetic */ int f61338a = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$a */
    public static final class C24155a {
    }

    static {
        int i = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.f61339f;
    }

    /* renamed from: a */
    public static final C24155a m60472a(C24274i0 i0Var, C24378d dVar, List list) {
        C25437e o = i0Var.mo53460o();
        if (o == null) {
            return null;
        }
        dVar.mo60525x(o);
        return null;
    }

    /* renamed from: b */
    public static final C24312z m60473b(C25446h0 h0Var, List<? extends C24281l0> list) {
        C24362h.m61211f(h0Var, "<this>");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        return new C24265f0().mo60421b(C24267g0.C24268a.m60826a((C24267g0) null, h0Var, list), C20989e.C20990a.f52739a, false, 0, true);
    }

    /* renamed from: c */
    public static final C24306u0 m60474c(C24312z zVar, C24312z zVar2) {
        C24362h.m61211f(zVar, "lowerBound");
        C24362h.m61211f(zVar2, "upperBound");
        if (C24362h.m61206a(zVar, zVar2)) {
            return zVar;
        }
        return new C24301s(zVar, zVar2);
    }

    /* renamed from: d */
    public static final C24312z m60475d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        C24362h.m61211f(integerLiteralTypeConstructor, "constructor");
        return m60479h(EmptyList.f60173b, aVar, C24289p.m60913c("Scope for integer literal type", true), integerLiteralTypeConstructor, false);
    }

    /* renamed from: e */
    public static final C24312z m60476e(C20989e eVar, C25432c cVar, List<? extends C24281l0> list) {
        C24362h.m61211f(cVar, "descriptor");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        C24274i0 j = cVar.mo53481j();
        C24362h.m61210e(j, "descriptor.typeConstructor");
        return m60477f(eVar, j, list, false, (C24378d) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: zf0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: cg0.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: zf0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: cg0.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final lh0.C24312z m60477f(ag0.C20989e r6, lh0.C24274i0 r7, java.util.List<? extends lh0.C24281l0> r8, boolean r9, mh0.C24378d r10) {
        /*
            java.lang.String r0 = "annotations"
            mf0.C24362h.m61211f(r6, r0)
            java.lang.String r0 = "constructor"
            mf0.C24362h.m61211f(r7, r0)
            java.lang.String r0 = "arguments"
            mf0.C24362h.m61211f(r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0034
            if (r9 != 0) goto L_0x0034
            zf0.e r0 = r7.mo53460o()
            if (r0 == 0) goto L_0x0034
            zf0.e r6 = r7.mo53460o()
            mf0.C24362h.m61208c(r6)
            lh0.z r6 = r6.mo53412q()
            java.lang.String r7 = "constructor.declarationDescriptor!!.defaultType"
            mf0.C24362h.m61210e(r6, r7)
            return r6
        L_0x0034:
            zf0.e r0 = r7.mo53460o()
            boolean r1 = r0 instanceof zf0.C25448i0
            if (r1 == 0) goto L_0x0049
            zf0.i0 r0 = (zf0.C25448i0) r0
            lh0.z r10 = r0.mo53412q()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo59564o()
        L_0x0046:
            r4 = r10
            goto L_0x00cf
        L_0x0049:
            boolean r1 = r0 instanceof zf0.C25432c
            if (r1 == 0) goto L_0x00a8
            if (r10 != 0) goto L_0x0057
            zf0.t r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60289j(r0)
            mh0.d$a r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60288i(r10)
        L_0x0057:
            boolean r1 = r8.isEmpty()
            r2 = 0
            java.lang.String r3 = "kotlinTypeRefiner"
            java.lang.String r4 = "<this>"
            if (r1 == 0) goto L_0x0082
            zf0.c r0 = (zf0.C25432c) r0
            mf0.C24362h.m61211f(r0, r4)
            mf0.C24362h.m61211f(r10, r3)
            boolean r1 = r0 instanceof cg0.C21198w
            if (r1 == 0) goto L_0x0071
            r2 = r0
            cg0.w r2 = (cg0.C21198w) r2
        L_0x0071:
            if (r2 != 0) goto L_0x007d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r0.mo53406Z()
            java.lang.String r0 = "this.unsubstitutedMemberScope"
            mf0.C24362h.m61210e(r10, r0)
            goto L_0x0046
        L_0x007d:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r2.mo53505C(r10)
            goto L_0x0046
        L_0x0082:
            zf0.c r0 = (zf0.C25432c) r0
            lh0.k0$a r1 = lh0.C24278k0.f61571b
            lh0.o0 r1 = r1.mo60438b(r7, r8)
            mf0.C24362h.m61211f(r0, r4)
            mf0.C24362h.m61211f(r10, r3)
            boolean r3 = r0 instanceof cg0.C21198w
            if (r3 == 0) goto L_0x0097
            r2 = r0
            cg0.w r2 = (cg0.C21198w) r2
        L_0x0097:
            if (r2 != 0) goto L_0x00a3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r0.mo53411n0(r1)
            java.lang.String r0 = "this.getMemberScope(\n   …ubstitution\n            )"
            mf0.C24362h.m61210e(r10, r0)
            goto L_0x0046
        L_0x00a3:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r2.mo53403A(r1, r10)
            goto L_0x0046
        L_0x00a8:
            boolean r10 = r0 instanceof zf0.C25446h0
            if (r10 == 0) goto L_0x00be
            zf0.h0 r0 = (zf0.C25446h0) r0
            ug0.e r10 = r0.getName()
            java.lang.String r0 = "Scope for abbreviation: "
            java.lang.String r10 = mf0.C24362h.m61216k(r10, r0)
            r0 = 1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = lh0.C24289p.m60913c(r10, r0)
            goto L_0x0046
        L_0x00be:
            boolean r10 = r7 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r10 == 0) goto L_0x00dd
            r10 = r7
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r10 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r10
            java.util.LinkedHashSet<lh0.v> r10 = r10.f61334b
            java.lang.String r0 = "member scope for intersection type"
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.C24120a.m60322a(r0, r10)
            goto L_0x0046
        L_0x00cf:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1 r5 = new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1
            r5.<init>(r8, r6, r7, r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            lh0.z r6 = m60478g(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x00dd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unsupported classifier: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = " for constructor: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(ag0.e, lh0.i0, java.util.List, boolean, mh0.d):lh0.z");
    }

    /* renamed from: g */
    public static final C24312z m60478g(C20989e eVar, C24274i0 i0Var, List<? extends C24281l0> list, boolean z, MemberScope memberScope, C24236l<? super C24378d, ? extends C24312z> lVar) {
        C24362h.m61211f(eVar, "annotations");
        C24362h.m61211f(i0Var, "constructor");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(memberScope, "memberScope");
        C24362h.m61211f(lVar, "refinedTypeFactory");
        C24254a0 a0Var = new C24254a0(i0Var, list, z, memberScope, lVar);
        if (eVar.isEmpty()) {
            return a0Var;
        }
        return new C24262e(a0Var, eVar);
    }

    /* renamed from: h */
    public static final C24312z m60479h(List list, C20989e eVar, MemberScope memberScope, C24274i0 i0Var, boolean z) {
        C24362h.m61211f(eVar, "annotations");
        C24362h.m61211f(i0Var, "constructor");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(memberScope, "memberScope");
        C24254a0 a0Var = new C24254a0(i0Var, list, z, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(list, eVar, memberScope, i0Var, z));
        if (eVar.isEmpty()) {
            return a0Var;
        }
        return new C24262e(a0Var, eVar);
    }
}
