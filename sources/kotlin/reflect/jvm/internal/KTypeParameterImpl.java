package kotlin.reflect.jvm.internal;

import bf0.C21050d;
import eg0.C23293d;
import java.util.List;
import jh0.C23730d;
import jh0.C23731e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mf0.C24362h;
import mf0.C24365j;
import mf0.C24370o;
import qg0.C24746g;
import qg0.C24757k;
import sf0.C24855b;
import sf0.C24866j;
import sf0.C24867k;
import sf0.C24868l;
import tf0.C24961a;
import tf0.C24971g;
import tf0.C24973i;
import tf0.C24979k;
import zf0.C25432c;
import zf0.C25442g;
import zf0.C25448i0;

public final class KTypeParameterImpl implements C24868l {

    /* renamed from: e */
    public static final /* synthetic */ C24866j<Object>[] f60275e = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: b */
    public final C25448i0 f60276b;

    /* renamed from: c */
    public final C24973i.C24974a f60277c = C24973i.m62670c(new KTypeParameterImpl$upperBounds$2(this));

    /* renamed from: d */
    public final C24971g f60278d;

    /* renamed from: kotlin.reflect.jvm.internal.KTypeParameterImpl$a */
    public /* synthetic */ class C23851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60279a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f60279a = iArr;
        }
    }

    public KTypeParameterImpl(C24971g gVar, C25448i0 i0Var) {
        Object obj;
        KClassImpl kClassImpl;
        C23731e eVar;
        C24757k kVar;
        C24362h.m61211f(i0Var, "descriptor");
        this.f60276b = i0Var;
        if (gVar == null) {
            C25442g b = i0Var.mo53399b();
            C24362h.m61210e(b, "descriptor.containingDeclaration");
            if (b instanceof C25432c) {
                obj = m58639a((C25432c) b);
            } else if (b instanceof CallableMemberDescriptor) {
                C25442g b2 = ((CallableMemberDescriptor) b).mo53399b();
                C24362h.m61210e(b2, "declaration.containingDeclaration");
                if (b2 instanceof C25432c) {
                    kClassImpl = m58639a((C25432c) b2);
                } else {
                    C24757k kVar2 = null;
                    if (b instanceof C23731e) {
                        eVar = (C23731e) b;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        C23730d N = eVar.mo58959N();
                        C24746g gVar2 = (C24746g) (!(N instanceof C24746g) ? null : N);
                        if (gVar2 == null) {
                            kVar = null;
                        } else {
                            kVar = gVar2.f62646d;
                        }
                        C23293d dVar = (C23293d) (kVar instanceof C23293d ? kVar : kVar2);
                        if (dVar != null) {
                            Class<?> cls = dVar.f59074a;
                            C24362h.m61211f(cls, "<this>");
                            kClassImpl = (KClassImpl) C24365j.m61219a(cls);
                        } else {
                            throw new KotlinReflectionInternalError(C24362h.m61216k(eVar, "Container of deserialized member is not resolved: "));
                        }
                    } else {
                        throw new KotlinReflectionInternalError(C24362h.m61216k(b, "Non-class callable descriptor must be deserialized: "));
                    }
                }
                obj = b.mo53398B0(new C24961a(kClassImpl), C21050d.f52856a);
            } else {
                throw new KotlinReflectionInternalError(C24362h.m61216k(b, "Unknown type parameter container: "));
            }
            C24362h.m61210e(obj, "when (val declaration = … $declaration\")\n        }");
            gVar = (C24971g) obj;
        }
        this.f60278d = gVar;
    }

    /* renamed from: a */
    public static KClassImpl m58639a(C25432c cVar) {
        C24855b bVar;
        Class<?> g = C24979k.m62680g(cVar);
        if (g == null) {
            bVar = null;
        } else {
            bVar = C24365j.m61219a(g);
        }
        KClassImpl kClassImpl = (KClassImpl) bVar;
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError(C24362h.m61216k(cVar.mo53399b(), "Type parameter container is not resolved: "));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            return C24362h.m61206a(this.f60278d, kTypeParameterImpl.f60278d) && C24362h.m61206a(getName(), kTypeParameterImpl.getName());
        }
    }

    public final String getName() {
        String f = this.f60276b.getName().mo61604f();
        C24362h.m61210e(f, "descriptor.name.asString()");
        return f;
    }

    public final List<C24867k> getUpperBounds() {
        C24973i.C24974a aVar = this.f60277c;
        C24866j<Object> jVar = f60275e[0];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-upperBounds>(...)");
        return (List) invoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f60278d.hashCode() * 31);
    }

    /* renamed from: l */
    public final KVariance mo59356l() {
        int i = C23851a.f60279a[this.f60276b.mo53482l().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = C24370o.f61705a[mo59356l().ordinal()];
        if (i == 2) {
            sb.append("in ");
        } else if (i == 3) {
            sb.append("out ");
        }
        sb.append(getName());
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
