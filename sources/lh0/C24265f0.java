package lh0;

import ag0.C20986c;
import ag0.C20989e;
import cf0.C21136j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lh0.C24267g0;
import lh0.C24270h0;
import mf0.C24361g;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import p626lf.C18201b;
import p845um.C19958a;
import zf0.C25437e;
import zf0.C25446h0;
import zf0.C25448i0;

/* renamed from: lh0.f0 */
public final class C24265f0 {

    /* renamed from: a */
    public final C24270h0 f61558a = C24270h0.C24271a.f61565a;

    /* renamed from: b */
    public final boolean f61559b = false;

    /* renamed from: a */
    public final void mo60420a(C20989e eVar, C20989e eVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C20986c) it.next()).mo53066f());
        }
        Iterator it2 = eVar2.iterator();
        while (it2.hasNext()) {
            C20986c cVar = (C20986c) it2.next();
            if (hashSet.contains(cVar.mo53066f())) {
                this.f61558a.mo60431c(cVar);
            }
        }
    }

    /* renamed from: b */
    public final C24312z mo60421b(C24267g0 g0Var, C20989e eVar, boolean z, int i, boolean z2) {
        C20989e eVar2;
        C24281l0 c = mo60422c(new C24285n0(g0Var.f61562b.mo58973x0(), Variance.INVARIANT), g0Var, (C25448i0) null, i);
        C24307v type = c.getType();
        C24362h.m61210e(type, "expandedProjection.type");
        C24312z k = C24361g.m61170k(type);
        if (C13637c.m34082y(k)) {
            return k;
        }
        c.mo60241b();
        mo60420a(k.getAnnotations(), eVar);
        if (!C13637c.m34082y(k)) {
            if (C13637c.m34082y(k)) {
                eVar2 = k.getAnnotations();
            } else {
                eVar2 = C18201b.m44914k(eVar, k.getAnnotations());
            }
            k = C24361g.m61171k0(k, (List) null, eVar2, 1);
        }
        C24312z l = C24299r0.m60980l(k, z);
        C24362h.m61210e(l, "expandedType.combineAnno…fNeeded(it, isNullable) }");
        if (!z2) {
            return l;
        }
        C24274i0 j = g0Var.f61562b.mo53481j();
        C24362h.m61210e(j, "descriptor.typeConstructor");
        return C19958a.m47446v(l, KotlinTypeFactory.m60479h(g0Var.f61563c, eVar, MemberScope.C24119a.f61217b, j, z));
    }

    /* renamed from: c */
    public final C24281l0 mo60422c(C24281l0 l0Var, C24267g0 g0Var, C25448i0 i0Var, int i) {
        C24307v vVar;
        C20989e eVar;
        C20989e eVar2;
        Variance variance;
        Variance variance2;
        C24281l0 l0Var2;
        C24267g0 g0Var2 = g0Var;
        int i2 = i;
        C25446h0 h0Var = g0Var2.f61562b;
        if (i2 > 100) {
            throw new AssertionError(C24362h.m61216k(h0Var.getName(), "Too deep recursion while expanding type alias "));
        } else if (l0Var.mo60240a()) {
            C24362h.m61208c(i0Var);
            return C24299r0.m60981m(i0Var);
        } else {
            C24307v type = l0Var.getType();
            C24362h.m61210e(type, "underlyingProjection.type");
            C24274i0 O0 = type.mo60411O0();
            C24362h.m61211f(O0, "constructor");
            C25437e o = O0.mo53460o();
            C24281l0 l0Var3 = o instanceof C25448i0 ? g0Var2.f61564d.get(o) : null;
            if (l0Var3 == null) {
                C24306u0 R0 = l0Var.getType().mo60450R0();
                if (!C24361g.m61151U(R0)) {
                    C24312z k = C24361g.m61170k(R0);
                    if (!C13637c.m34082y(k) && TypeUtilsKt.m60529n(k)) {
                        C24274i0 O02 = k.mo60411O0();
                        C25437e o2 = O02.mo53460o();
                        O02.getParameters().size();
                        k.mo60410N0().size();
                        if (o2 instanceof C25448i0) {
                            l0Var2 = l0Var;
                        } else {
                            int i3 = 0;
                            if (o2 instanceof C25446h0) {
                                C25446h0 h0Var2 = (C25446h0) o2;
                                if (g0Var.mo60426a(h0Var2)) {
                                    this.f61558a.mo60432d(h0Var2);
                                    return new C24285n0(C24289p.m60914d(C24362h.m61216k(h0Var2.getName(), "Recursive type alias: ")), Variance.INVARIANT);
                                }
                                List<C24281l0> N0 = k.mo60410N0();
                                ArrayList arrayList = new ArrayList(C21136j.m49436X(N0, 10));
                                for (T next : N0) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        arrayList.add(mo60422c((C24281l0) next, g0Var, O02.getParameters().get(i3), i2 + 1));
                                        i3 = i4;
                                    } else {
                                        C17875h.m44294U();
                                        throw null;
                                    }
                                }
                                C24312z b = mo60421b(C24267g0.C24268a.m60826a(g0Var, h0Var2, arrayList), k.getAnnotations(), k.mo60412P0(), i2 + 1, false);
                                C24312z d = mo60423d(k, g0Var, i2);
                                if (!C24361g.m61151U(b)) {
                                    b = C19958a.m47446v(b, d);
                                }
                                l0Var2 = new C24285n0(b, l0Var.mo60241b());
                            } else {
                                C24312z d2 = mo60423d(k, g0Var, i2);
                                TypeSubstitutor d3 = TypeSubstitutor.m60493d(d2);
                                for (T next2 : d2.mo60410N0()) {
                                    int i5 = i3 + 1;
                                    if (i3 >= 0) {
                                        C24281l0 l0Var4 = (C24281l0) next2;
                                        if (!l0Var4.mo60240a()) {
                                            C24307v type2 = l0Var4.getType();
                                            C24362h.m61210e(type2, "substitutedArgument.type");
                                            if (!TypeUtilsKt.m60519d(type2)) {
                                                C24281l0 l0Var5 = k.mo60410N0().get(i3);
                                                C25448i0 i0Var2 = k.mo60411O0().getParameters().get(i3);
                                                if (this.f61559b) {
                                                    C24270h0 h0Var3 = this.f61558a;
                                                    C24307v type3 = l0Var5.getType();
                                                    C24362h.m61210e(type3, "unsubstitutedArgument.type");
                                                    C24307v type4 = l0Var4.getType();
                                                    C24362h.m61210e(type4, "substitutedArgument.type");
                                                    C24362h.m61210e(i0Var2, "typeParameter");
                                                    h0Var3.mo60429a(d3, type3, type4, i0Var2);
                                                }
                                            }
                                        }
                                        i3 = i5;
                                    } else {
                                        C17875h.m44294U();
                                        throw null;
                                    }
                                }
                                l0Var2 = new C24285n0(d2, l0Var.mo60241b());
                            }
                        }
                        return l0Var2;
                    }
                }
                return l0Var;
            } else if (l0Var3.mo60240a()) {
                C24362h.m61208c(i0Var);
                return C24299r0.m60981m(i0Var);
            } else {
                C24306u0 R02 = l0Var3.getType().mo60450R0();
                Variance b2 = l0Var3.mo60241b();
                C24362h.m61210e(b2, "argument.projectionKind");
                Variance b3 = l0Var.mo60241b();
                C24362h.m61210e(b3, "underlyingProjection.projectionKind");
                if (!(b3 == b2 || b3 == (variance2 = Variance.INVARIANT))) {
                    if (b2 == variance2) {
                        b2 = b3;
                    } else {
                        this.f61558a.mo60430b(g0Var2.f61562b, R02);
                    }
                }
                Variance l = i0Var == null ? Variance.INVARIANT : i0Var.mo53482l();
                C24362h.m61210e(l, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
                if (!(l == b2 || l == (variance = Variance.INVARIANT))) {
                    if (b2 == variance) {
                        b2 = variance;
                    } else {
                        this.f61558a.mo60430b(g0Var2.f61562b, R02);
                    }
                }
                mo60420a(type.getAnnotations(), R02.getAnnotations());
                if (R02 instanceof C24284n) {
                    C24284n nVar = (C24284n) R02;
                    C20989e annotations = type.getAnnotations();
                    if (C13637c.m34082y(nVar)) {
                        eVar2 = nVar.getAnnotations();
                    } else {
                        eVar2 = C18201b.m44914k(annotations, nVar.getAnnotations());
                    }
                    C24362h.m61211f(eVar2, "newAnnotations");
                    vVar = new C24284n(TypeUtilsKt.m60522g(nVar.f61595d), eVar2);
                } else {
                    C24312z l2 = C24299r0.m60980l(C24361g.m61170k(R02), type.mo60412P0());
                    C24362h.m61210e(l2, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
                    C20989e annotations2 = type.getAnnotations();
                    if (C13637c.m34082y(l2)) {
                        vVar = l2;
                    } else {
                        if (C13637c.m34082y(l2)) {
                            eVar = l2.getAnnotations();
                        } else {
                            eVar = C18201b.m44914k(annotations2, l2.getAnnotations());
                        }
                        vVar = C24361g.m61171k0(l2, (List) null, eVar, 1);
                    }
                }
                return new C24285n0(vVar, b2);
            }
        }
    }

    /* renamed from: d */
    public final C24312z mo60423d(C24312z zVar, C24267g0 g0Var, int i) {
        C24274i0 O0 = zVar.mo60411O0();
        List<C24281l0> N0 = zVar.mo60410N0();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(N0, 10));
        int i2 = 0;
        for (T next : N0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C24281l0 l0Var = (C24281l0) next;
                C24281l0 c = mo60422c(l0Var, g0Var, O0.getParameters().get(i2), i + 1);
                if (!c.mo60240a()) {
                    c = new C24285n0(C24299r0.m60979k(c.getType(), l0Var.getType().mo60412P0()), c.mo60241b());
                }
                arrayList.add(c);
                i2 = i3;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        return C24361g.m61171k0(zVar, arrayList, (C20989e) null, 2);
    }
}
