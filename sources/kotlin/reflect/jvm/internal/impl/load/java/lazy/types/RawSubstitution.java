package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ag0.C20989e;
import ce0.C21100e;
import cf0.C21136j;
import cg0.C21174i;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24283m0;
import lh0.C24285n0;
import lh0.C24287o0;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import mg0.C24372b;
import mh0.C24378d;
import p389bl.C13637c;
import p583jk.C17875h;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25448i0;

public final class RawSubstitution extends C24287o0 {

    /* renamed from: c */
    public static final C24371a f60710c;

    /* renamed from: d */
    public static final C24371a f60711d;

    /* renamed from: b */
    public final TypeParameterUpperBoundEraser f60712b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$a */
    public /* synthetic */ class C23941a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60713a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            f60713a = iArr;
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f60710c = C24372b.m61251b(typeUsage, false, (C21174i) null, 3).mo60518b(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f60711d = C24372b.m61251b(typeUsage, false, (C21174i) null, 3).mo60518b(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f60712b = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(this) : typeParameterUpperBoundEraser;
    }

    /* renamed from: g */
    public static C24283m0 m59144g(C25448i0 i0Var, C24371a aVar, C24307v vVar) {
        C24362h.m61211f(aVar, "attr");
        C24362h.m61211f(vVar, "erasedUpperBound");
        int i = C23941a.f60713a[aVar.f61707b.ordinal()];
        if (i == 1) {
            return new C24285n0(vVar, Variance.INVARIANT);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (!i0Var.mo53482l().getAllowsOutPosition()) {
            return new C24285n0(DescriptorUtilsKt.m60284e(i0Var).mo59392o(), Variance.INVARIANT);
        } else {
            List<C25448i0> parameters = vVar.mo60411O0().getParameters();
            C24362h.m61210e(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new C24285n0(vVar, Variance.OUT_VARIANCE);
            }
            return C24372b.m61250a(i0Var, aVar);
        }
    }

    /* renamed from: d */
    public final C24281l0 mo59555d(C24307v vVar) {
        return new C24285n0(mo59557i(vVar, new C24371a(TypeUsage.COMMON, false, (Set) null, 30)));
    }

    /* renamed from: h */
    public final Pair<C24312z, Boolean> mo59556h(C24312z zVar, C25432c cVar, C24371a aVar) {
        if (zVar.mo60411O0().getParameters().isEmpty()) {
            return new Pair<>(zVar, Boolean.FALSE);
        }
        if (C23867c.m58687z(zVar)) {
            C24281l0 l0Var = zVar.mo60410N0().get(0);
            Variance b = l0Var.mo60241b();
            C24307v type = l0Var.getType();
            C24362h.m61210e(type, "componentTypeProjection.type");
            return new Pair<>(KotlinTypeFactory.m60477f(zVar.getAnnotations(), zVar.mo60411O0(), C17875h.m44280D(new C24285n0(mo59557i(type, aVar), b)), zVar.mo60412P0(), (C24378d) null), Boolean.FALSE);
        } else if (C13637c.m34082y(zVar)) {
            return new Pair<>(C24289p.m60914d(C24362h.m61216k(zVar.mo60411O0(), "Raw error type: ")), Boolean.FALSE);
        } else {
            MemberScope n0 = cVar.mo53411n0(this);
            C24362h.m61210e(n0, "declaration.getMemberScope(this)");
            C20989e annotations = zVar.getAnnotations();
            C24274i0 j = cVar.mo53481j();
            C24362h.m61210e(j, "declaration.typeConstructor");
            List<C25448i0> parameters = cVar.mo53481j().getParameters();
            C24362h.m61210e(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters, 10));
            for (C25448i0 i0Var : parameters) {
                C24362h.m61210e(i0Var, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C24307v a = this.f60712b.mo59565a(i0Var, true, aVar);
                C24362h.m61210e(a, "fun computeProjection(\n …er, attr)\n        }\n    }");
                arrayList.add(m59144g(i0Var, aVar, a));
            }
            return new Pair<>(KotlinTypeFactory.m60478g(annotations, j, arrayList, zVar.mo60412P0(), n0, new RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(cVar, aVar, this, zVar)), Boolean.TRUE);
        }
    }

    /* renamed from: i */
    public final C24307v mo59557i(C24307v vVar, C24371a aVar) {
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o instanceof C25448i0) {
            C24307v a = this.f60712b.mo59565a((C25448i0) o, true, aVar);
            C24362h.m61210e(a, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return mo59557i(a, aVar);
        } else if (o instanceof C25432c) {
            C25437e o2 = C21100e.m49309G0(vVar).mo60411O0().mo53460o();
            if (o2 instanceof C25432c) {
                Pair<C24312z, Boolean> h = mo59556h(C21100e.m49358p0(vVar), (C25432c) o, f60710c);
                C24312z a2 = h.mo59066a();
                boolean booleanValue = h.mo59067b().booleanValue();
                Pair<C24312z, Boolean> h2 = mo59556h(C21100e.m49309G0(vVar), (C25432c) o2, f60711d);
                C24312z a3 = h2.mo59066a();
                boolean booleanValue2 = h2.mo59067b().booleanValue();
                if (booleanValue || booleanValue2) {
                    return new RawTypeImpl(a2, a3);
                }
                return KotlinTypeFactory.m60474c(a2, a3);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + o2 + "\" while for lower it's \"" + o + '\"').toString());
        } else {
            throw new IllegalStateException(C24362h.m61216k(o, "Unexpected declaration kind: ").toString());
        }
    }
}
