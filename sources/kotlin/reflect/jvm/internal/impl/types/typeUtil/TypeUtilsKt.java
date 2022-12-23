package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import ag0.C20989e;
import cf0.C21136j;
import cf0.C21144r;
import cf0.C21145s;
import cf0.C21146t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24236l;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24285n0;
import lh0.C24298r;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import p584jl.C17885a;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25448i0;

public final class TypeUtilsKt {
    /* renamed from: a */
    public static final C24285n0 m60516a(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        return new C24285n0(vVar);
    }

    /* renamed from: b */
    public static final boolean m60517b(C24307v vVar, C24236l<? super C24306u0, Boolean> lVar) {
        C24362h.m61211f(vVar, "<this>");
        C24362h.m61211f(lVar, "predicate");
        return C24299r0.m60971c(vVar, lVar);
    }

    /* renamed from: c */
    public static final boolean m60518c(C24307v vVar, C24274i0 i0Var, Set<? extends C25448i0> set) {
        C25440f fVar;
        List<C25448i0> list;
        C25448i0 i0Var2;
        boolean z;
        boolean z2;
        if (C24362h.m61206a(vVar.mo60411O0(), i0Var)) {
            return true;
        }
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o instanceof C25440f) {
            fVar = (C25440f) o;
        } else {
            fVar = null;
        }
        if (fVar == null) {
            list = null;
        } else {
            list = fVar.mo53514r();
        }
        C21145s P0 = C23825c.m58504P0(vVar.mo60410N0());
        if (!(P0 instanceof Collection) || !((Collection) P0).isEmpty()) {
            Iterator it = P0.iterator();
            do {
                C21146t tVar = (C21146t) it;
                if (tVar.hasNext()) {
                    C21144r rVar = (C21144r) tVar.next();
                    int i = rVar.f53001a;
                    C24281l0 l0Var = (C24281l0) rVar.f53002b;
                    if (list == null) {
                        i0Var2 = null;
                    } else {
                        i0Var2 = (C25448i0) C23825c.m58516m0(i, list);
                    }
                    if (i0Var2 == null || set == null || !set.contains(i0Var2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || l0Var.mo60240a()) {
                        z2 = false;
                        continue;
                    } else {
                        C24307v type = l0Var.getType();
                        C24362h.m61210e(type, "argument.type");
                        z2 = m60518c(type, i0Var, set);
                        continue;
                    }
                }
            } while (!z2);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m60519d(C24307v vVar) {
        return m60517b(vVar, TypeUtilsKt$containsTypeAliasParameters$1.f61367f);
    }

    /* renamed from: e */
    public static final C24285n0 m60520e(C24307v vVar, Variance variance, C25448i0 i0Var) {
        C24362h.m61211f(vVar, "type");
        C24362h.m61211f(variance, "projectionKind");
        if ((i0Var == null ? null : i0Var.mo53482l()) == variance) {
            variance = Variance.INVARIANT;
        }
        return new C24285n0(vVar, variance);
    }

    /* renamed from: f */
    public static final void m60521f(C24307v vVar, C24312z zVar, LinkedHashSet linkedHashSet, Set set) {
        C25440f fVar;
        List<C25448i0> list;
        C25448i0 i0Var;
        boolean z;
        C25437e o = vVar.mo60411O0().mo53460o();
        if (!(o instanceof C25448i0)) {
            C25437e o2 = vVar.mo60411O0().mo53460o();
            if (o2 instanceof C25440f) {
                fVar = (C25440f) o2;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                list = null;
            } else {
                list = fVar.mo53514r();
            }
            int i = 0;
            for (C24281l0 next : vVar.mo60410N0()) {
                int i2 = i + 1;
                if (list == null) {
                    i0Var = null;
                } else {
                    i0Var = (C25448i0) C23825c.m58516m0(i, list);
                }
                if (i0Var == null || set == null || !set.contains(i0Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && !next.mo60240a() && !C23825c.m58507d0(linkedHashSet, next.getType().mo60411O0().mo53460o()) && !C24362h.m61206a(next.getType().mo60411O0(), zVar.mo60411O0())) {
                    C24307v type = next.getType();
                    C24362h.m61210e(type, "argument.type");
                    m60521f(type, zVar, linkedHashSet, set);
                }
                i = i2;
            }
        } else if (!C24362h.m61206a(vVar.mo60411O0(), zVar.mo60411O0())) {
            linkedHashSet.add(o);
        } else {
            for (C24307v next2 : ((C25448i0) o).getUpperBounds()) {
                C24362h.m61210e(next2, "upperBound");
                m60521f(next2, zVar, linkedHashSet, set);
            }
        }
    }

    /* renamed from: g */
    public static final C23867c m60522g(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C23867c m = vVar.mo60411O0().mo53458m();
        C24362h.m61210e(m, "constructor.builtIns");
        return m;
    }

    /* renamed from: h */
    public static final C24307v m60523h(C25448i0 i0Var) {
        T t;
        List<C24307v> upperBounds = i0Var.getUpperBounds();
        C24362h.m61210e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<C24307v> upperBounds2 = i0Var.getUpperBounds();
        C24362h.m61210e(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T o = ((C24307v) next).mo60411O0().mo53460o();
            if (o instanceof C25432c) {
                t = (C25432c) o;
            }
            boolean z = false;
            if (!(t == null || t.mo53513p() == ClassKind.INTERFACE || t.mo53513p() == ClassKind.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        C24307v vVar = (C24307v) t;
        if (vVar != null) {
            return vVar;
        }
        List<C24307v> upperBounds3 = i0Var.getUpperBounds();
        C24362h.m61210e(upperBounds3, "upperBounds");
        Object j0 = C23825c.m58513j0(upperBounds3);
        C24362h.m61210e(j0, "upperBounds.first()");
        return (C24307v) j0;
    }

    /* renamed from: i */
    public static final boolean m60524i(C25448i0 i0Var, C24274i0 i0Var2, Set<? extends C25448i0> set) {
        boolean z;
        C24362h.m61211f(i0Var, "typeParameter");
        List<C24307v> upperBounds = i0Var.getUpperBounds();
        C24362h.m61210e(upperBounds, "typeParameter.upperBounds");
        if (!upperBounds.isEmpty()) {
            for (C24307v vVar : upperBounds) {
                C24362h.m61210e(vVar, "upperBound");
                if (!m60518c(vVar, i0Var.mo53412q().mo60411O0(), set) || (i0Var2 != null && !C24362h.m61206a(vVar.mo60411O0(), i0Var2))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m60525j(C25448i0 i0Var, C24274i0 i0Var2, int i) {
        if ((i & 2) != 0) {
            i0Var2 = null;
        }
        return m60524i(i0Var, i0Var2, (Set<? extends C25448i0>) null);
    }

    /* renamed from: k */
    public static final C24307v m60526k(C24307v vVar, C20989e eVar) {
        if (!vVar.getAnnotations().isEmpty() || !eVar.isEmpty()) {
            return vVar.mo60450R0().mo59561U0(eVar);
        }
        return vVar;
    }

    /* renamed from: l */
    public static final C24307v m60527l(C24307v vVar, TypeSubstitutor typeSubstitutor, LinkedHashMap linkedHashMap, Variance variance, Set set) {
        C24306u0 u0Var;
        boolean z;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Variance variance2 = variance;
        Set set2 = set;
        C24362h.m61211f(variance2, "variance");
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            C24298r rVar = (C24298r) R0;
            C24312z zVar = rVar.f61594c;
            if (!zVar.mo60411O0().getParameters().isEmpty() && zVar.mo60411O0().mo53460o() != null) {
                List<C25448i0> parameters = zVar.mo60411O0().getParameters();
                C24362h.m61210e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters, 10));
                for (C25448i0 i0Var : parameters) {
                    C24281l0 l0Var = (C24281l0) C23825c.m58516m0(i0Var.getIndex(), vVar.mo60410N0());
                    if (set2 == null || !set2.contains(i0Var)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 || l0Var == null || !linkedHashMap2.containsKey(l0Var.getType().mo60411O0())) {
                        l0Var = new StarProjectionImpl(i0Var);
                    }
                    arrayList.add(l0Var);
                }
                zVar = C24361g.m61171k0(zVar, arrayList, (C20989e) null, 2);
            }
            C24312z zVar2 = rVar.f61595d;
            if (!zVar2.mo60411O0().getParameters().isEmpty() && zVar2.mo60411O0().mo53460o() != null) {
                List<C25448i0> parameters2 = zVar2.mo60411O0().getParameters();
                C24362h.m61210e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C21136j.m49436X(parameters2, 10));
                for (C25448i0 i0Var2 : parameters2) {
                    C24281l0 l0Var2 = (C24281l0) C23825c.m58516m0(i0Var2.getIndex(), vVar.mo60410N0());
                    if (set2 == null || !set2.contains(i0Var2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2 || l0Var2 == null || !linkedHashMap2.containsKey(l0Var2.getType().mo60411O0())) {
                        l0Var2 = new StarProjectionImpl(i0Var2);
                    }
                    arrayList2.add(l0Var2);
                }
                zVar2 = C24361g.m61171k0(zVar2, arrayList2, (C20989e) null, 2);
            }
            u0Var = KotlinTypeFactory.m60474c(zVar, zVar2);
        } else if (R0 instanceof C24312z) {
            C24312z zVar3 = (C24312z) R0;
            if (zVar3.mo60411O0().getParameters().isEmpty() || zVar3.mo60411O0().mo53460o() == null) {
                u0Var = zVar3;
            } else {
                List<C25448i0> parameters3 = zVar3.mo60411O0().getParameters();
                C24362h.m61210e(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C21136j.m49436X(parameters3, 10));
                for (C25448i0 i0Var3 : parameters3) {
                    C24281l0 l0Var3 = (C24281l0) C23825c.m58516m0(i0Var3.getIndex(), vVar.mo60410N0());
                    if (set2 == null || !set2.contains(i0Var3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || l0Var3 == null || !linkedHashMap2.containsKey(l0Var3.getType().mo60411O0())) {
                        l0Var3 = new StarProjectionImpl(i0Var3);
                    }
                    arrayList3.add(l0Var3);
                }
                u0Var = C24361g.m61171k0(zVar3, arrayList3, (C20989e) null, 2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return typeSubstitutor.mo60250i(C17885a.m44434d0(u0Var, R0), variance2);
    }

    /* renamed from: m */
    public static final C24306u0 m60528m(C24307v vVar) {
        C24312z zVar;
        C24362h.m61211f(vVar, "<this>");
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            C24298r rVar = (C24298r) R0;
            C24312z zVar2 = rVar.f61594c;
            if (!zVar2.mo60411O0().getParameters().isEmpty() && zVar2.mo60411O0().mo53460o() != null) {
                List<C25448i0> parameters = zVar2.mo60411O0().getParameters();
                C24362h.m61210e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters, 10));
                for (C25448i0 starProjectionImpl : parameters) {
                    arrayList.add(new StarProjectionImpl(starProjectionImpl));
                }
                zVar2 = C24361g.m61171k0(zVar2, arrayList, (C20989e) null, 2);
            }
            C24312z zVar3 = rVar.f61595d;
            if (!zVar3.mo60411O0().getParameters().isEmpty() && zVar3.mo60411O0().mo53460o() != null) {
                List<C25448i0> parameters2 = zVar3.mo60411O0().getParameters();
                C24362h.m61210e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C21136j.m49436X(parameters2, 10));
                for (C25448i0 starProjectionImpl2 : parameters2) {
                    arrayList2.add(new StarProjectionImpl(starProjectionImpl2));
                }
                zVar3 = C24361g.m61171k0(zVar3, arrayList2, (C20989e) null, 2);
            }
            zVar = KotlinTypeFactory.m60474c(zVar2, zVar3);
        } else if (R0 instanceof C24312z) {
            C24312z zVar4 = (C24312z) R0;
            boolean isEmpty = zVar4.mo60411O0().getParameters().isEmpty();
            zVar = zVar4;
            if (!isEmpty) {
                C25437e o = zVar4.mo60411O0().mo53460o();
                zVar = zVar4;
                if (o != null) {
                    List<C25448i0> parameters3 = zVar4.mo60411O0().getParameters();
                    C24362h.m61210e(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C21136j.m49436X(parameters3, 10));
                    for (C25448i0 starProjectionImpl3 : parameters3) {
                        arrayList3.add(new StarProjectionImpl(starProjectionImpl3));
                    }
                    zVar = C24361g.m61171k0(zVar4, arrayList3, (C20989e) null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C17885a.m44434d0(zVar, R0);
    }

    /* renamed from: n */
    public static final boolean m60529n(C24312z zVar) {
        return m60517b(zVar, TypeUtilsKt$requiresTypeAliasExpansion$1.f61368f);
    }
}
