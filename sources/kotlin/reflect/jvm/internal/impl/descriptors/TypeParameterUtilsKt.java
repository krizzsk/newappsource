package kotlin.reflect.jvm.internal.impl.descriptors;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import p583jk.C17875h;
import th0.C25003h;
import th0.C25010m;
import zf0.C25428a;
import zf0.C25432c;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25448i0;

public final class TypeParameterUtilsKt {
    /* JADX WARNING: type inference failed for: r3v0, types: [zf0.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p559ii.C17601a m58767a(lh0.C24312z r5, zf0.C25440f r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0059
            boolean r1 = lh0.C24289p.m60918h(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x0059
        L_0x000a:
            java.util.List r1 = r6.mo53514r()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.mo53506E()
            if (r2 != 0) goto L_0x003c
            java.util.List r2 = r5.mo60410N0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0026
            xg0.C25260c.m63398o(r6)
        L_0x0026:
            ii.a r1 = new ii.a
            java.util.List r2 = r5.mo60410N0()
            java.util.List r5 = r5.mo60410N0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>((zf0.C25440f) r6, (java.util.List) r5, (p559ii.C17601a) r0)
            return r1
        L_0x003c:
            java.util.List r2 = r5.mo60410N0()
            java.util.List r7 = r2.subList(r7, r1)
            ii.a r2 = new ii.a
            zf0.g r3 = r6.mo53399b()
            boolean r4 = r3 instanceof zf0.C25440f
            if (r4 == 0) goto L_0x0051
            r0 = r3
            zf0.f r0 = (zf0.C25440f) r0
        L_0x0051:
            ii.a r5 = m58767a(r5, r0, r1)
            r2.<init>((zf0.C25440f) r6, (java.util.List) r7, (p559ii.C17601a) r5)
            return r2
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.m58767a(lh0.z, zf0.f, int):ii.a");
    }

    /* renamed from: b */
    public static final List<C25448i0> m58768b(C25440f fVar) {
        List<C25448i0> list;
        C25442g gVar;
        C24362h.m61211f(fVar, "<this>");
        List<C25448i0> r = fVar.mo53514r();
        C24362h.m61210e(r, "declaredTypeParameters");
        if (!fVar.mo53506E() && !(fVar.mo53399b() instanceof C23894a)) {
            return r;
        }
        C25003h<C25442g> k = DescriptorUtilsKt.m60290k(fVar);
        C23891x246a49e2 typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 = C23891x246a49e2.f60436f;
        C24362h.m61211f(k, "<this>");
        C24362h.m61211f(typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1, "predicate");
        List I = C17875h.m44285I(C24177b.m60553n0(C24177b.m60547h0(C24177b.m60543d0(new C25010m(k, typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1), C23892x246a49e3.f60437f), C23893x246a49e4.f60438f)));
        Iterator<C25442g> it = DescriptorUtilsKt.m60290k(fVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = it.next();
            if (gVar instanceof C25432c) {
                break;
            }
        }
        C25432c cVar = (C25432c) gVar;
        if (cVar != null) {
            list = cVar.mo53481j().getParameters();
        }
        if (list == null) {
            list = EmptyList.f60173b;
        }
        if (!I.isEmpty() || !list.isEmpty()) {
            ArrayList x0 = C23825c.m58527x0(list, I);
            ArrayList arrayList = new ArrayList(C21136j.m49436X(x0, 10));
            Iterator it2 = x0.iterator();
            while (it2.hasNext()) {
                C25448i0 i0Var = (C25448i0) it2.next();
                C24362h.m61210e(i0Var, "it");
                arrayList.add(new C25428a(i0Var, fVar, r.size()));
            }
            return C23825c.m58527x0(arrayList, r);
        }
        List<C25448i0> r2 = fVar.mo53514r();
        C24362h.m61210e(r2, "declaredTypeParameters");
        return r2;
    }
}
