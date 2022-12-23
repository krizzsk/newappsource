package kotlin.sequences;

import cf0.C21142p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lf0.C24236l;
import mf0.C24362h;
import th0.C24997e;
import th0.C24999f;
import th0.C25003h;
import th0.C25012n;

/* renamed from: kotlin.sequences.b */
public class C24177b extends C24176a {
    /* renamed from: d0 */
    public static final C24997e m60543d0(C25003h hVar, C24236l lVar) {
        C24362h.m61211f(lVar, "predicate");
        return new C24997e(hVar, true, lVar);
    }

    /* renamed from: e0 */
    public static final C24997e m60544e0(C25003h hVar, C24236l lVar) {
        C24362h.m61211f(lVar, "predicate");
        return new C24997e(hVar, false, lVar);
    }

    /* renamed from: f0 */
    public static final C24997e m60545f0(C25003h hVar) {
        return m60544e0(hVar, SequencesKt___SequencesKt$filterNotNull$1.f61406f);
    }

    /* renamed from: g0 */
    public static final <T> T m60546g0(C25003h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: h0 */
    public static final C24999f m60547h0(C25003h hVar, C24236l lVar) {
        C24362h.m61211f(lVar, "transform");
        return new C24999f(hVar, lVar, SequencesKt___SequencesKt$flatMap$2.f61408b);
    }

    /* renamed from: i0 */
    public static final C24999f m60548i0(C21142p pVar, C24236l lVar) {
        C24362h.m61211f(lVar, "transform");
        return new C24999f(pVar, lVar, SequencesKt___SequencesKt$flatMap$1.f61407b);
    }

    /* renamed from: j0 */
    public static final C25012n m60549j0(C25003h hVar, C24236l lVar) {
        C24362h.m61211f(lVar, "transform");
        return new C25012n(hVar, lVar);
    }

    /* renamed from: k0 */
    public static final C24997e m60550k0(C25003h hVar, C24236l lVar) {
        C24362h.m61211f(lVar, "transform");
        return m60544e0(new C25012n(hVar, lVar), SequencesKt___SequencesKt$filterNotNull$1.f61406f);
    }

    /* renamed from: l0 */
    public static final C24999f m60551l0(C25012n nVar, Object obj) {
        return SequencesKt__SequencesKt.m60538Y(SequencesKt__SequencesKt.m60541b0(nVar, SequencesKt__SequencesKt.m60541b0(obj)));
    }

    /* renamed from: m0 */
    public static final void m60552m0(C25003h hVar, Collection collection) {
        C24362h.m61211f(hVar, "<this>");
        for (Object add : hVar) {
            collection.add(add);
        }
    }

    /* renamed from: n0 */
    public static final <T> List<T> m60553n0(C25003h<? extends T> hVar) {
        C24362h.m61211f(hVar, "<this>");
        ArrayList arrayList = new ArrayList();
        m60552m0(hVar, arrayList);
        return arrayList;
    }
}
