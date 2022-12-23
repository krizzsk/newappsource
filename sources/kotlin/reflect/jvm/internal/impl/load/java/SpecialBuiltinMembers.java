package kotlin.reflect.jvm.internal.impl.load.java;

import hg0.C23460b;
import hg0.C23461c;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mf0.C24362h;
import p584jl.C17885a;
import ug0.C25069e;
import zf0.C25491z;

public final class SpecialBuiltinMembers {
    /* renamed from: a */
    public static final String m58980a(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2;
        C25069e eVar;
        C25069e eVar2;
        if (C23867c.m58670A(callableMemberDescriptor)) {
            callableMemberDescriptor2 = m58981b(callableMemberDescriptor);
        } else {
            callableMemberDescriptor2 = null;
        }
        if (callableMemberDescriptor2 == null) {
            return null;
        }
        CallableMemberDescriptor l = DescriptorUtilsKt.m60291l(callableMemberDescriptor2);
        if (l instanceof C25491z) {
            C23867c.m58670A(l);
            CallableMemberDescriptor b = DescriptorUtilsKt.m60281b(DescriptorUtilsKt.m60291l(l), C23917xccd5eab2.f60549f);
            if (b == null || (eVar2 = C23461c.f59242a.get(DescriptorUtilsKt.m60286g(b))) == null) {
                return null;
            }
            return eVar2.mo61604f();
        } else if (!(l instanceof C23903e)) {
            return null;
        } else {
            int i = C23460b.f59241m;
            LinkedHashMap linkedHashMap = SpecialGenericSignatures.f60571j;
            String A = C17885a.m44388A((C23903e) l);
            if (A == null) {
                eVar = null;
            } else {
                eVar = (C25069e) linkedHashMap.get(A);
            }
            if (eVar == null) {
                return null;
            }
            return eVar.mo61604f();
        }
    }

    /* renamed from: b */
    public static final <T extends CallableMemberDescriptor> T m58981b(T t) {
        boolean z;
        C24362h.m61211f(t, "<this>");
        if (!SpecialGenericSignatures.f60572k.contains(t.getName()) && !C23461c.f59245d.contains(DescriptorUtilsKt.m60291l(t).getName())) {
            return null;
        }
        if (t instanceof C25491z) {
            z = true;
        } else {
            z = t instanceof C23902d;
        }
        if (z) {
            return DescriptorUtilsKt.m60281b(t, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.f60559f);
        }
        if (t instanceof C23903e) {
            return DescriptorUtilsKt.m60281b(t, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.f60560f);
        }
        return null;
    }

    /* renamed from: c */
    public static final <T extends CallableMemberDescriptor> T m58982c(T t) {
        C24362h.m61211f(t, "<this>");
        T b = m58981b(t);
        if (b != null) {
            return b;
        }
        int i = BuiltinMethodsWithSpecialGenericSignature.f60546m;
        C25069e name = t.getName();
        C24362h.m61210e(name, "name");
        if (!BuiltinMethodsWithSpecialGenericSignature.m58977b(name)) {
            return null;
        }
        return DescriptorUtilsKt.m60281b(t, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.f60561f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m58983d(zf0.C25432c r12, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r13) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r12, r0)
            java.lang.String r0 = "specialCallableDescriptor"
            mf0.C24362h.m61211f(r13, r0)
            zf0.g r13 = r13.mo53399b()
            zf0.c r13 = (zf0.C25432c) r13
            lh0.z r13 = r13.mo53412q()
            java.lang.String r0 = "specialCallableDescripto…ssDescriptor).defaultType"
            mf0.C24362h.m61210e(r13, r0)
            zf0.c r12 = xg0.C25260c.m63393j(r12)
        L_0x001d:
            r0 = 0
            if (r12 == 0) goto L_0x016c
            boolean r1 = r12 instanceof jg0.C23722c
            if (r1 != 0) goto L_0x0166
            lh0.z r1 = r12.mo53412q()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x014b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            mh0.k r5 = new mh0.k
            r6 = 0
            r5.<init>(r1, r6)
            r4.add(r5)
            lh0.i0 r1 = r13.mo60411O0()
        L_0x003e:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0140
            java.lang.Object r5 = r4.poll()
            mh0.k r5 = (mh0.C24387k) r5
            lh0.v r7 = r5.f61729a
            lh0.i0 r8 = r7.mo60411O0()
            if (r8 == 0) goto L_0x013c
            if (r1 == 0) goto L_0x0137
            boolean r9 = r8.equals(r1)
            if (r9 == 0) goto L_0x0115
            boolean r4 = r7.mo60412P0()
            mh0.k r5 = r5.f61730b
        L_0x0060:
            if (r5 == 0) goto L_0x00d1
            lh0.v r8 = r5.f61729a
            java.util.List r9 = r8.mo60410N0()
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x0073
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0073
            goto L_0x0092
        L_0x0073:
            java.util.Iterator r9 = r9.iterator()
        L_0x0077:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0092
            java.lang.Object r10 = r9.next()
            lh0.l0 r10 = (lh0.C24281l0) r10
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = r10.mo60241b()
            kotlin.reflect.jvm.internal.impl.types.Variance r11 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r10 == r11) goto L_0x008d
            r10 = 1
            goto L_0x008e
        L_0x008d:
            r10 = 0
        L_0x008e:
            if (r10 == 0) goto L_0x0077
            r9 = 1
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            if (r9 == 0) goto L_0x00b2
            lh0.k0$a r9 = lh0.C24278k0.f61571b
            lh0.o0 r9 = r9.mo60437a(r8)
            lh0.o0 r9 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.m60271b(r9)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r9 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60494e(r9)
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            lh0.v r7 = r9.mo60250i(r7, r10)
            ph0.a r7 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.m60530a(r7)
            T r7 = r7.f62557b
            lh0.v r7 = (lh0.C24307v) r7
            goto L_0x00c2
        L_0x00b2:
            lh0.k0$a r9 = lh0.C24278k0.f61571b
            lh0.o0 r9 = r9.mo60437a(r8)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r9 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60494e(r9)
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            lh0.v r7 = r9.mo60250i(r7, r10)
        L_0x00c2:
            if (r4 != 0) goto L_0x00cd
            boolean r4 = r8.mo60412P0()
            if (r4 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r4 = 0
            goto L_0x00ce
        L_0x00cd:
            r4 = 1
        L_0x00ce:
            mh0.k r5 = r5.f61730b
            goto L_0x0060
        L_0x00d1:
            lh0.i0 r5 = r7.mo60411O0()
            if (r5 == 0) goto L_0x0111
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L_0x00e2
            lh0.u0 r6 = lh0.C24299r0.m60978j(r7, r4)
            goto L_0x0140
        L_0x00e2:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r13 = "Type constructors should be equals!\nsubstitutedSuperType: "
            java.lang.StringBuilder r13 = p379.C13555b.m33972k(r13)
            java.lang.String r0 = p584jl.C17885a.m44402H(r5)
            r13.append(r0)
            java.lang.String r0 = ", \n\nsupertype: "
            r13.append(r0)
            java.lang.String r0 = p584jl.C17885a.m44402H(r1)
            r13.append(r0)
            java.lang.String r0 = " \n"
            r13.append(r0)
            boolean r0 = r5.equals(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0111:
            wh0.C25154a0.m63136a(r2)
            throw r6
        L_0x0115:
            java.util.Collection r7 = r8.mo53459n()
            java.util.Iterator r7 = r7.iterator()
        L_0x011d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x003e
            java.lang.Object r8 = r7.next()
            lh0.v r8 = (lh0.C24307v) r8
            mh0.k r9 = new mh0.k
            java.lang.String r10 = "immediateSupertype"
            mf0.C24362h.m61210e(r8, r10)
            r9.<init>(r8, r5)
            r4.add(r9)
            goto L_0x011d
        L_0x0137:
            r12 = 4
            wh0.C25154a0.m63136a(r12)
            throw r6
        L_0x013c:
            wh0.C25154a0.m63136a(r2)
            throw r6
        L_0x0140:
            if (r6 == 0) goto L_0x0143
            r0 = 1
        L_0x0143:
            if (r0 == 0) goto L_0x0166
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58670A(r12)
            r12 = r12 ^ r3
            return r12
        L_0x014b:
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r1 = "subtype"
            r13[r0] = r1
            java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure"
            r13[r3] = r0
            java.lang.String r0 = "findCorrespondingSupertype"
            r13[r12] = r0
            java.lang.String r12 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r12)
            throw r13
        L_0x0166:
            zf0.c r12 = xg0.C25260c.m63393j(r12)
            goto L_0x001d
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58983d(zf0.c, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor):boolean");
    }
}
