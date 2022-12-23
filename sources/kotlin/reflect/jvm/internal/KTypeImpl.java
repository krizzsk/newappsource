package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import kotlin.NotImplementedError;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import lf0.C24225a;
import lh0.C24281l0;
import lh0.C24299r0;
import lh0.C24307v;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import p389bl.C13641g;
import sf0.C24856c;
import sf0.C24866j;
import sf0.C24867k;
import tf0.C24971g;
import tf0.C24973i;
import tf0.C24979k;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25446h0;
import zf0.C25448i0;

public final class KTypeImpl implements C24867k {

    /* renamed from: d */
    public static final /* synthetic */ C24866j<Object>[] f60269d;

    /* renamed from: a */
    public final C24307v f60270a;

    /* renamed from: b */
    public final C24973i.C24974a<Type> f60271b;

    /* renamed from: c */
    public final C24973i.C24974a f60272c;

    static {
        Class<KTypeImpl> cls = KTypeImpl.class;
        f60269d = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), WidgetMessageParser.KEY_ARGUMENTS, "getArguments()Ljava/util/List;"))};
    }

    public KTypeImpl(C24307v vVar, C24225a<? extends Type> aVar) {
        C24973i.C24974a<Type> aVar2;
        C24362h.m61211f(vVar, "type");
        this.f60270a = vVar;
        C24973i.C24974a<Type> aVar3 = null;
        if (aVar instanceof C24973i.C24974a) {
            aVar2 = aVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            aVar3 = aVar2;
        } else if (aVar != null) {
            aVar3 = C24973i.m62670c(aVar);
        }
        this.f60271b = aVar3;
        this.f60272c = C24973i.m62670c(new KTypeImpl$classifier$2(this));
        C24973i.m62670c(new KTypeImpl$arguments$2(this, aVar));
    }

    /* renamed from: a */
    public final C24856c mo59347a() {
        C24973i.C24974a aVar = this.f60272c;
        C24866j<Object> jVar = f60269d[0];
        return (C24856c) aVar.invoke();
    }

    /* renamed from: b */
    public final C24856c mo59348b(C24307v vVar) {
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o instanceof C25432c) {
            Class<?> g = C24979k.m62680g((C25432c) o);
            if (g == null) {
                return null;
            }
            if (g.isArray()) {
                C24281l0 l0Var = (C24281l0) C23825c.m58493E0(vVar.mo60410N0());
                if (l0Var == null) {
                    return new KClassImpl(g);
                }
                C24307v type = l0Var.getType();
                C24362h.m61210e(type, "type.arguments.singleOrN…return KClassImpl(jClass)");
                C24856c b = mo59348b(type);
                if (b != null) {
                    return new KClassImpl(Array.newInstance(C24361g.m61144N(C13641g.m34125n(b)), 0).getClass());
                }
                throw new KotlinReflectionInternalError(C24362h.m61216k(this, "Cannot determine classifier for array element type: "));
            } else if (C24299r0.m60975g(vVar)) {
                return new KClassImpl(g);
            } else {
                Class<?> cls = ReflectClassUtilKt.f60531b.get(g);
                if (cls != null) {
                    g = cls;
                }
                return new KClassImpl(g);
            }
        } else if (o instanceof C25448i0) {
            return new KTypeParameterImpl((C24971g) null, (C25448i0) o);
        } else {
            if (!(o instanceof C25446h0)) {
                return null;
            }
            throw new NotImplementedError(C24362h.m61216k("Type alias classifiers are not yet supported", "An operation is not implemented: "));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KTypeImpl) && C24362h.m61206a(this.f60270a, ((KTypeImpl) obj).f60270a);
    }

    public final int hashCode() {
        return this.f60270a.hashCode();
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        return ReflectionObjectRenderer.m58644d(this.f60270a);
    }
}
