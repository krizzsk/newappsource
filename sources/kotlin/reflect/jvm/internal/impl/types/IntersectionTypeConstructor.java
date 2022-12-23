package kotlin.reflect.jvm.internal.impl.types;

import ag0.C20989e;
import ce0.C21100e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import lf0.C24236l;
import lh0.C24274i0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import oh0.C24616e;
import zf0.C25437e;
import zf0.C25448i0;

public final class IntersectionTypeConstructor implements C24274i0, C24616e {

    /* renamed from: a */
    public C24307v f61333a;

    /* renamed from: b */
    public final LinkedHashSet<C24307v> f61334b;

    /* renamed from: c */
    public final int f61335c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$a */
    public static final class C24154a<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ C24236l f61336b;

        public C24154a(C24236l lVar) {
            this.f61336b = lVar;
        }

        public final int compare(T t, T t2) {
            C24307v vVar = (C24307v) t;
            C24236l lVar = this.f61336b;
            C24362h.m61210e(vVar, "it");
            String obj = lVar.invoke(vVar).toString();
            C24307v vVar2 = (C24307v) t2;
            C24236l lVar2 = this.f61336b;
            C24362h.m61210e(vVar2, "it");
            return C21100e.m49298B(obj, lVar2.invoke(vVar2).toString());
        }
    }

    public IntersectionTypeConstructor() {
        throw null;
    }

    public IntersectionTypeConstructor(AbstractCollection abstractCollection) {
        C24362h.m61211f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet<C24307v> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.f61334b = linkedHashSet;
        this.f61335c = linkedHashSet.hashCode();
    }

    /* renamed from: a */
    public final C24312z mo60233a() {
        return KotlinTypeFactory.m60478g(C20989e.C20990a.f52739a, this, EmptyList.f60173b, false, TypeIntersectionScope.C24120a.m60322a("member scope for intersection type", this.f61334b), new IntersectionTypeConstructor$createType$1(this));
    }

    /* renamed from: b */
    public final String mo60234b(C24236l<? super C24307v, ? extends Object> lVar) {
        C24362h.m61211f(lVar, "getProperTypeRelatedToStringify");
        return C23825c.m58520q0(C23825c.m58496H0(this.f61334b, new C24154a(lVar)), " & ", "{", "}", new IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(lVar), 24);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [lh0.v] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor mo60235c(mh0.C24378d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            mf0.C24362h.m61211f(r5, r0)
            java.util.LinkedHashSet<lh0.v> r0 = r4.f61334b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = cf0.C21136j.m49436X(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            lh0.v r2 = (lh0.C24307v) r2
            lh0.v r2 = r2.mo59558Q0(r5)
            r1.add(r2)
            r2 = 1
            goto L_0x0017
        L_0x002c:
            r0 = 0
            if (r2 != 0) goto L_0x0030
            goto L_0x0048
        L_0x0030:
            lh0.v r2 = r4.f61333a
            if (r2 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            lh0.v r0 = r2.mo59558Q0(r5)
        L_0x0039:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r5 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r5.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            java.util.LinkedHashSet<lh0.v> r5 = r5.f61334b
            r1.<init>(r5)
            r1.f61333a = r0
            r0 = r1
        L_0x0048:
            if (r0 != 0) goto L_0x004b
            r0 = r4
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.mo60235c(mh0.d):kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return C24362h.m61206a(this.f61334b, ((IntersectionTypeConstructor) obj).f61334b);
    }

    public final List<C25448i0> getParameters() {
        return EmptyList.f60173b;
    }

    public final int hashCode() {
        return this.f61335c;
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        C23867c m = this.f61334b.iterator().next().mo60411O0().mo53458m();
        C24362h.m61210e(m, "intersectedTypes.iterato…xt().constructor.builtIns");
        return m;
    }

    /* renamed from: n */
    public final Collection<C24307v> mo53459n() {
        return this.f61334b;
    }

    /* renamed from: o */
    public final C25437e mo53460o() {
        return null;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return false;
    }

    public final String toString() {
        return mo60234b(IntersectionTypeConstructor$makeDebugNameForIntersectionType$1.f61337f);
    }
}
