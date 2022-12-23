package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ag0.C20989e;
import ce0.C21100e;
import cf0.C21136j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24285n0;
import lh0.C24299r0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import mh0.C24376c;
import p584jl.C17885a;
import ph0.C24709a;
import ph0.C24710b;
import ph0.C24711c;
import yg0.C25302b;
import zf0.C25448i0;

public final class CapturedTypeApproximationKt {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$a */
    public /* synthetic */ class C24168a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61369a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f61369a = iArr;
        }
    }

    /* renamed from: a */
    public static final C24709a<C24307v> m60530a(C24307v vVar) {
        Object obj;
        Variance variance;
        C24711c cVar;
        C24362h.m61211f(vVar, "type");
        if (C21100e.m49356o0(vVar)) {
            C24709a<C24307v> a = m60530a(C21100e.m49358p0(vVar));
            C24709a<C24307v> a2 = m60530a(C21100e.m49309G0(vVar));
            return new C24709a<>(C17885a.m44434d0(KotlinTypeFactory.m60474c(C21100e.m49358p0((C24307v) a.f62556a), C21100e.m49309G0((C24307v) a2.f62556a)), vVar), C17885a.m44434d0(KotlinTypeFactory.m60474c(C21100e.m49358p0((C24307v) a.f62557b), C21100e.m49309G0((C24307v) a2.f62557b)), vVar));
        }
        C24274i0 O0 = vVar.mo60411O0();
        if (vVar.mo60411O0() instanceof C25302b) {
            C24281l0 projection = ((C25302b) O0).getProjection();
            C24307v type = projection.getType();
            C24362h.m61210e(type, "typeProjection.type");
            C24307v k = C24299r0.m60979k(type, vVar.mo60412P0());
            int i = C24168a.f61369a[projection.mo60241b().ordinal()];
            if (i == 2) {
                return new C24709a<>(k, TypeUtilsKt.m60522g(vVar).mo59393p());
            }
            if (i == 3) {
                C24312z o = TypeUtilsKt.m60522g(vVar).mo59392o();
                C24362h.m61210e(o, "type.builtIns.nothingType");
                return new C24709a<>(C24299r0.m60979k(o, vVar.mo60412P0()), k);
            }
            throw new AssertionError(C24362h.m61216k(projection, "Only nontrivial projections should have been captured, not: "));
        } else if (vVar.mo60410N0().isEmpty() || vVar.mo60410N0().size() != O0.getParameters().size()) {
            return new C24709a<>(vVar, vVar);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C24281l0> N0 = vVar.mo60410N0();
            List<C25448i0> parameters = O0.getParameters();
            C24362h.m61210e(parameters, "typeConstructor.parameters");
            Iterator it = C23825c.m58505Q0(N0, parameters).iterator();
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    C24281l0 l0Var = (C24281l0) pair.mo59066a();
                    C25448i0 i0Var = (C25448i0) pair.mo59067b();
                    C24362h.m61210e(i0Var, "typeParameter");
                    Variance l = i0Var.mo53482l();
                    if (l == null) {
                        TypeSubstitutor.m60490a(35);
                        throw null;
                    } else if (l0Var != null) {
                        TypeSubstitutor typeSubstitutor = TypeSubstitutor.f61353b;
                        if (l0Var.mo60240a()) {
                            variance = Variance.OUT_VARIANCE;
                            if (variance == null) {
                                TypeSubstitutor.m60490a(37);
                                throw null;
                            }
                        } else {
                            variance = TypeSubstitutor.m60491b(l, l0Var.mo60241b());
                        }
                        int i2 = C24168a.f61369a[variance.ordinal()];
                        if (i2 == 1) {
                            C24307v type2 = l0Var.getType();
                            C24362h.m61210e(type2, "type");
                            C24307v type3 = l0Var.getType();
                            C24362h.m61210e(type3, "type");
                            cVar = new C24711c(i0Var, type2, type3);
                        } else if (i2 == 2) {
                            C24307v type4 = l0Var.getType();
                            C24362h.m61210e(type4, "type");
                            cVar = new C24711c(i0Var, type4, DescriptorUtilsKt.m60284e(i0Var).mo59393p());
                        } else if (i2 == 3) {
                            C24312z o2 = DescriptorUtilsKt.m60284e(i0Var).mo59392o();
                            C24362h.m61210e(o2, "typeParameter.builtIns.nothingType");
                            C24307v type5 = l0Var.getType();
                            C24362h.m61210e(type5, "type");
                            cVar = new C24711c(i0Var, o2, type5);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (l0Var.mo60240a()) {
                            arrayList.add(cVar);
                            arrayList2.add(cVar);
                        } else {
                            C24709a<C24307v> a3 = m60530a(cVar.f62559b);
                            C24709a<C24307v> a4 = m60530a(cVar.f62560c);
                            C24711c cVar2 = new C24711c(cVar.f62558a, (C24307v) a3.f62557b, (C24307v) a4.f62556a);
                            C24711c cVar3 = new C24711c(cVar.f62558a, (C24307v) a3.f62556a, (C24307v) a4.f62557b);
                            arrayList.add(cVar2);
                            arrayList2.add(cVar3);
                        }
                    } else {
                        TypeSubstitutor.m60490a(36);
                        throw null;
                    }
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C24711c cVar4 = (C24711c) it2.next();
                            cVar4.getClass();
                            if (!C24376c.f61714a.mo60531f(cVar4.f62559b, cVar4.f62560c)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        obj = TypeUtilsKt.m60522g(vVar).mo59392o();
                        C24362h.m61210e(obj, "type.builtIns.nothingType");
                    } else {
                        obj = m60532c(arrayList, vVar);
                    }
                    return new C24709a<>(obj, m60532c(arrayList2, vVar));
                }
            }
        }
    }

    /* renamed from: b */
    public static final C24281l0 m60531b(C24281l0 l0Var, boolean z) {
        if (l0Var == null) {
            return null;
        }
        if (l0Var.mo60240a()) {
            return l0Var;
        }
        C24307v type = l0Var.getType();
        C24362h.m61210e(type, "typeProjection.type");
        if (!C24299r0.m60971c(type, C24169x21acc51c.f61370f)) {
            return l0Var;
        }
        Variance b = l0Var.mo60241b();
        C24362h.m61210e(b, "typeProjection.projectionKind");
        if (b == Variance.OUT_VARIANCE) {
            return new C24285n0((C24307v) m60530a(type).f62557b, b);
        }
        if (z) {
            return new C24285n0((C24307v) m60530a(type).f62556a, b);
        }
        TypeSubstitutor e = TypeSubstitutor.m60494e(new C24710b());
        if (e.mo60249h()) {
            return l0Var;
        }
        try {
            return e.mo60252l(l0Var, (C25448i0) null, 0);
        } catch (TypeSubstitutor.SubstitutionException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C24307v m60532c(ArrayList arrayList, C24307v vVar) {
        C24285n0 n0Var;
        Variance variance;
        boolean z;
        vVar.mo60410N0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24711c cVar = (C24711c) it.next();
            cVar.getClass();
            C24376c.f61714a.mo60531f(cVar.f62559b, cVar.f62560c);
            if (C24362h.m61206a(cVar.f62559b, cVar.f62560c) || cVar.f62558a.mo53482l() == (variance = Variance.IN_VARIANCE)) {
                n0Var = new C24285n0(cVar.f62559b);
            } else if (!C23867c.m58675F(cVar.f62559b) || cVar.f62558a.mo53482l() == variance) {
                C24307v vVar2 = cVar.f62560c;
                if (vVar2 != null) {
                    if (!C23867c.m58686y(vVar2) || !vVar2.mo60412P0()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (variance == cVar.f62558a.mo53482l()) {
                            variance = Variance.INVARIANT;
                        }
                        n0Var = new C24285n0(cVar.f62559b, variance);
                    } else {
                        Variance variance2 = Variance.OUT_VARIANCE;
                        if (variance2 == cVar.f62558a.mo53482l()) {
                            variance2 = Variance.INVARIANT;
                        }
                        n0Var = new C24285n0(cVar.f62560c, variance2);
                    }
                } else {
                    C23867c.m58681a(140);
                    throw null;
                }
            } else {
                Variance variance3 = Variance.OUT_VARIANCE;
                if (variance3 == cVar.f62558a.mo53482l()) {
                    variance3 = Variance.INVARIANT;
                }
                n0Var = new C24285n0(cVar.f62560c, variance3);
            }
            arrayList2.add(n0Var);
        }
        return C24361g.m61169j0(vVar, arrayList2, (C20989e) null, 6);
    }
}
