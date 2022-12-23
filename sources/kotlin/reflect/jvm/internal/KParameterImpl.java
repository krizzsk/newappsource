package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import lf0.C24225a;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24866j;
import tf0.C24973i;
import ug0.C25069e;
import zf0.C25452k0;
import zf0.C25490y;
import zf0.C25491z;

public final class KParameterImpl implements KParameter {

    /* renamed from: e */
    public static final /* synthetic */ C24866j<Object>[] f60247e;

    /* renamed from: a */
    public final KCallableImpl<?> f60248a;

    /* renamed from: b */
    public final int f60249b;

    /* renamed from: c */
    public final KParameter.Kind f60250c;

    /* renamed from: d */
    public final C24973i.C24974a f60251d;

    static {
        Class<KParameterImpl> cls = KParameterImpl.class;
        f60247e = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i, KParameter.Kind kind, C24225a<? extends C25490y> aVar) {
        C24362h.m61211f(kCallableImpl, "callable");
        C24362h.m61211f(kind, "kind");
        this.f60248a = kCallableImpl;
        this.f60249b = i;
        this.f60250c = kind;
        this.f60251d = C24973i.m62670c(aVar);
        C24973i.m62670c(new KParameterImpl$annotations$2(this));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (!C24362h.m61206a(this.f60248a, kParameterImpl.f60248a) || this.f60249b != kParameterImpl.f60249b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String getName() {
        C25452k0 k0Var;
        C24973i.C24974a aVar = this.f60251d;
        C24866j<Object> jVar = f60247e[0];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-descriptor>(...)");
        C25490y yVar = (C25490y) invoke;
        if (yVar instanceof C25452k0) {
            k0Var = (C25452k0) yVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null || k0Var.mo53399b().mo53431j0()) {
            return null;
        }
        C25069e name = k0Var.getName();
        C24362h.m61210e(name, "valueParameter.name");
        if (name.f63264c) {
            return null;
        }
        return name.mo61604f();
    }

    public final int hashCode() {
        return Integer.valueOf(this.f60249b).hashCode() + (this.f60248a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        StringBuilder sb = new StringBuilder();
        int i = ReflectionObjectRenderer.C23852a.f60281a[this.f60250c.ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            StringBuilder k = C13555b.m33972k("parameter #");
            k.append(this.f60249b);
            k.append(' ');
            k.append(getName());
            sb.append(k.toString());
        }
        sb.append(" of ");
        CallableMemberDescriptor d = this.f60248a.mo59298d();
        if (d instanceof C25491z) {
            str = ReflectionObjectRenderer.m58643c((C25491z) d);
        } else if (d instanceof C23900c) {
            str = ReflectionObjectRenderer.m58642b((C23900c) d);
        } else {
            throw new IllegalStateException(C24362h.m61216k(d, "Illegal callable: ").toString());
        }
        sb.append(str);
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
