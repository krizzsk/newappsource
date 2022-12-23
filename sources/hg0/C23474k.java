package hg0;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import mf0.C24362h;
import qg0.C24747h;
import zf0.C25452k0;

/* renamed from: hg0.k */
public final class C23474k implements ExternalOverridabilityCondition {

    /* renamed from: hg0.k$a */
    public static final class C23475a {
        /* renamed from: a */
        public static boolean m57576a(C23894a aVar, C23894a aVar2) {
            C24362h.m61211f(aVar, "superDescriptor");
            C24362h.m61211f(aVar2, "subDescriptor");
            if (!(aVar2 instanceof JavaMethodDescriptor) || !(aVar instanceof C23900c)) {
                return false;
            }
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
            javaMethodDescriptor.mo53442h().size();
            C23900c cVar = (C23900c) aVar;
            cVar.mo53442h().size();
            List<C25452k0> h = javaMethodDescriptor.m49592a().mo53442h();
            C24362h.m61210e(h, "subDescriptor.original.valueParameters");
            List<C25452k0> h2 = cVar.mo53407a().mo53442h();
            C24362h.m61210e(h2, "superDescriptor.original.valueParameters");
            Iterator it = C23825c.m58505Q0(h, h2).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C25452k0 k0Var = (C25452k0) pair.mo59066a();
                C25452k0 k0Var2 = (C25452k0) pair.mo59067b();
                C24362h.m61210e(k0Var, "subParameter");
                boolean z = m57577b((C23900c) aVar2, k0Var) instanceof C24747h.C24750c;
                C24362h.m61210e(k0Var2, "superParameter");
                if (z != (m57577b(cVar, k0Var2) instanceof C24747h.C24750c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r6v11, types: [zf0.e] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static qg0.C24747h m57577b(kotlin.reflect.jvm.internal.impl.descriptors.C23900c r6, zf0.C25452k0 r7) {
            /*
                java.lang.String r0 = "f"
                mf0.C24362h.m61211f(r6, r0)
                ug0.e r0 = r6.getName()
                java.lang.String r0 = r0.mo61604f()
                java.lang.String r1 = "remove"
                boolean r0 = mf0.C24362h.m61206a(r0, r1)
                r1 = 0
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x00c1
                java.util.List r0 = r6.mo53442h()
                int r0 = r0.size()
                if (r0 != r2) goto L_0x00c1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60291l(r6)
                zf0.g r0 = r0.mo53399b()
                boolean r0 = r0 instanceof jg0.C23722c
                if (r0 != 0) goto L_0x0037
                boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58670A(r6)
                if (r0 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r0 = 0
                goto L_0x0038
            L_0x0037:
                r0 = 1
            L_0x0038:
                if (r0 == 0) goto L_0x003c
                goto L_0x00c1
            L_0x003c:
                kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r6.mo53407a()
                java.util.List r0 = r0.mo53442h()
                java.lang.String r4 = "f.original.valueParameters"
                mf0.C24362h.m61210e(r0, r4)
                java.lang.Object r0 = kotlin.collections.C23825c.m58491C0(r0)
                zf0.k0 r0 = (zf0.C25452k0) r0
                lh0.v r0 = r0.getType()
                java.lang.String r4 = "f.original.valueParameters.single().type"
                mf0.C24362h.m61210e(r0, r4)
                qg0.h r0 = p584jl.C17885a.m44444j0(r0)
                boolean r4 = r0 instanceof qg0.C24747h.C24750c
                if (r4 == 0) goto L_0x0063
                qg0.h$c r0 = (qg0.C24747h.C24750c) r0
                goto L_0x0064
            L_0x0063:
                r0 = r3
            L_0x0064:
                if (r0 != 0) goto L_0x0068
                r0 = r3
                goto L_0x006a
            L_0x0068:
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = r0.f62657i
            L_0x006a:
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
                if (r0 == r4) goto L_0x006f
                goto L_0x00c1
            L_0x006f:
                kotlin.reflect.jvm.internal.impl.descriptors.c r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58976a(r6)
                if (r0 != 0) goto L_0x0076
                goto L_0x00c1
            L_0x0076:
                kotlin.reflect.jvm.internal.impl.descriptors.c r4 = r0.mo53407a()
                java.util.List r4 = r4.mo53442h()
                java.lang.String r5 = "overridden.original.valueParameters"
                mf0.C24362h.m61210e(r4, r5)
                java.lang.Object r4 = kotlin.collections.C23825c.m58491C0(r4)
                zf0.k0 r4 = (zf0.C25452k0) r4
                lh0.v r4 = r4.getType()
                java.lang.String r5 = "overridden.original.valueParameters.single().type"
                mf0.C24362h.m61210e(r4, r5)
                qg0.h r4 = p584jl.C17885a.m44444j0(r4)
                zf0.g r0 = r0.mo53399b()
                java.lang.String r5 = "overridden.containingDeclaration"
                mf0.C24362h.m61210e(r0, r5)
                ug0.d r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60287h(r0)
                ug0.c r5 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60343I
                ug0.d r5 = r5.mo61589i()
                boolean r0 = mf0.C24362h.m61206a(r0, r5)
                if (r0 == 0) goto L_0x00c1
                boolean r0 = r4 instanceof qg0.C24747h.C24749b
                if (r0 == 0) goto L_0x00c1
                qg0.h$b r4 = (qg0.C24747h.C24749b) r4
                java.lang.String r0 = r4.f62656i
                java.lang.String r4 = "java/lang/Object"
                boolean r0 = mf0.C24362h.m61206a(r0, r4)
                if (r0 == 0) goto L_0x00c1
                r0 = 1
                goto L_0x00c2
            L_0x00c1:
                r0 = 0
            L_0x00c2:
                java.lang.String r4 = "valueParameterDescriptor.type"
                if (r0 != 0) goto L_0x012e
                java.util.List r0 = r6.mo53442h()
                int r0 = r0.size()
                if (r0 == r2) goto L_0x00d1
                goto L_0x011f
            L_0x00d1:
                zf0.g r0 = r6.mo53399b()
                boolean r5 = r0 instanceof zf0.C25432c
                if (r5 == 0) goto L_0x00dc
                zf0.c r0 = (zf0.C25432c) r0
                goto L_0x00dd
            L_0x00dc:
                r0 = r3
            L_0x00dd:
                if (r0 != 0) goto L_0x00e0
                goto L_0x011f
            L_0x00e0:
                java.util.List r6 = r6.mo53442h()
                java.lang.String r5 = "f.valueParameters"
                mf0.C24362h.m61210e(r6, r5)
                java.lang.Object r6 = kotlin.collections.C23825c.m58491C0(r6)
                zf0.k0 r6 = (zf0.C25452k0) r6
                lh0.v r6 = r6.getType()
                lh0.i0 r6 = r6.mo60411O0()
                zf0.e r6 = r6.mo53460o()
                boolean r5 = r6 instanceof zf0.C25432c
                if (r5 == 0) goto L_0x0102
                r3 = r6
                zf0.c r3 = (zf0.C25432c) r3
            L_0x0102:
                if (r3 != 0) goto L_0x0105
                goto L_0x011f
            L_0x0105:
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r6 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58685u(r0)
                if (r6 == 0) goto L_0x010d
                r6 = 1
                goto L_0x010e
            L_0x010d:
                r6 = 0
            L_0x010e:
                if (r6 == 0) goto L_0x011f
                ug0.c r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r0)
                ug0.c r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r3)
                boolean r6 = mf0.C24362h.m61206a(r6, r0)
                if (r6 == 0) goto L_0x011f
                r1 = 1
            L_0x011f:
                if (r1 == 0) goto L_0x0122
                goto L_0x012e
            L_0x0122:
                lh0.v r6 = r7.getType()
                mf0.C24362h.m61210e(r6, r4)
                qg0.h r6 = p584jl.C17885a.m44444j0(r6)
                goto L_0x013d
            L_0x012e:
                lh0.v r6 = r7.getType()
                mf0.C24362h.m61210e(r6, r4)
                lh0.u0 r6 = lh0.C24299r0.m60978j(r6, r2)
                qg0.h r6 = p584jl.C17885a.m44444j0(r6)
            L_0x013d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg0.C23474k.C23475a.m57577b(kotlin.reflect.jvm.internal.impl.descriptors.c, zf0.k0):qg0.h");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (mf0.C24362h.m61206a(r0, p584jl.C17885a.m44474z(r3, 2)) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60572k.contains(r3) == false) goto L_0x00ad;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result mo58576a(kotlin.reflect.jvm.internal.impl.descriptors.C23894a r8, kotlin.reflect.jvm.internal.impl.descriptors.C23894a r9, zf0.C25432c r10) {
        /*
            r7 = this;
            java.lang.String r0 = "superDescriptor"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "subDescriptor"
            mf0.C24362h.m61211f(r9, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r0 == 0) goto L_0x00ad
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58670A(r9)
            if (r0 == 0) goto L_0x001c
            goto L_0x00ad
        L_0x001c:
            int r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f60546m
            r0 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r0
            ug0.e r3 = r0.getName()
            java.lang.String r4 = "subDescriptor.name"
            mf0.C24362h.m61210e(r3, r4)
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58977b(r3)
            if (r3 != 0) goto L_0x0043
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60562a
            ug0.e r3 = r0.getName()
            mf0.C24362h.m61210e(r3, r4)
            java.util.ArrayList r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60572k
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0043
            goto L_0x00ad
        L_0x0043:
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58982c(r3)
            boolean r4 = r0.mo53415H0()
            boolean r5 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            r6 = 0
            if (r5 == 0) goto L_0x0056
            r6 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.c r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r6
        L_0x0056:
            if (r6 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            boolean r6 = r6.mo53415H0()
            if (r4 != r6) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x00ac
            boolean r4 = r0.mo53415H0()
            if (r4 != 0) goto L_0x006e
            goto L_0x00ac
        L_0x006e:
            boolean r4 = r10 instanceof jg0.C23722c
            if (r4 == 0) goto L_0x00ad
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = r0.mo53438w0()
            if (r4 == 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            if (r3 == 0) goto L_0x00ad
            boolean r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58983d(r10, r3)
            if (r10 == 0) goto L_0x0082
            goto L_0x00ad
        L_0x0082:
            boolean r10 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r10 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00ac
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r3
            kotlin.reflect.jvm.internal.impl.descriptors.c r10 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58976a(r3)
            if (r10 == 0) goto L_0x00ac
            r10 = 2
            java.lang.String r0 = p584jl.C17885a.m44474z(r0, r10)
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r3
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r3.mo53407a()
            java.lang.String r4 = "superDescriptor.original"
            mf0.C24362h.m61210e(r3, r4)
            java.lang.String r10 = p584jl.C17885a.m44474z(r3, r10)
            boolean r10 = mf0.C24362h.m61206a(r0, r10)
            if (r10 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r1 = 1
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r8
        L_0x00b2:
            boolean r8 = hg0.C23474k.C23475a.m57576a(r8, r9)
            if (r8 == 0) goto L_0x00bb
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r8
        L_0x00bb:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C23474k.mo58576a(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a, zf0.c):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }

    /* renamed from: b */
    public ExternalOverridabilityCondition.Contract mo58577b() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }
}
