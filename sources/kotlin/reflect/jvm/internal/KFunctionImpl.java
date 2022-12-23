package kotlin.reflect.jvm.internal;

import ce0.C21100e;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import lf0.C24225a;
import lf0.C24226b;
import lf0.C24227c;
import lf0.C24228d;
import lf0.C24229e;
import lf0.C24230f;
import lf0.C24231g;
import lf0.C24232h;
import lf0.C24233i;
import lf0.C24234j;
import lf0.C24235k;
import lf0.C24236l;
import lf0.C24237m;
import lf0.C24238n;
import lf0.C24239o;
import lf0.C24240p;
import lf0.C24241q;
import lf0.C24242r;
import lf0.C24243s;
import lf0.C24244t;
import lf0.C24245u;
import lf0.C24246v;
import lf0.C24247w;
import lh0.C24307v;
import mf0.C24360f;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import p389bl.C13637c;
import sf0.C24858e;
import sf0.C24866j;
import tf0.C24973i;
import tf0.C24979k;
import uf0.C25032b;
import uf0.C25034c;
import xg0.C25260c;
import xg0.C25261d;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25452k0;
import zf0.C25455m;

public final class KFunctionImpl extends KCallableImpl<Object> implements C24360f<Object>, C24858e<Object>, C24225a, C24236l, C24226b, C24227c, C24228d, C24229e, C24230f, C24231g, C24232h, C24233i, C24234j, C24235k, C24240p, C24237m, C24238n, C24239o, C24241q, C24242r, C24243s, C24244t, C24245u, C24246v, C24247w {

    /* renamed from: h */
    public static final /* synthetic */ C24866j<Object>[] f60229h;

    /* renamed from: c */
    public final KDeclarationContainerImpl f60230c;

    /* renamed from: d */
    public final String f60231d;

    /* renamed from: e */
    public final Object f60232e;

    /* renamed from: f */
    public final C24973i.C24974a f60233f;

    /* renamed from: g */
    public final C24973i.C24975b f60234g;

    static {
        Class<KFunctionImpl> cls = KFunctionImpl.class;
        f60229h = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, C23900c cVar, Object obj) {
        this.f60230c = kDeclarationContainerImpl;
        this.f60231d = str2;
        this.f60232e = obj;
        this.f60233f = new C24973i.C24974a(cVar, new KFunctionImpl$descriptor$2(this, str));
        this.f60234g = new C24973i.C24975b(new KFunctionImpl$caller$2(this));
        new KFunctionImpl$defaultCaller$2(this);
    }

    /* renamed from: g */
    public static final C25034c m58602g(KFunctionImpl kFunctionImpl, Constructor constructor, C23900c cVar) {
        C25430b bVar;
        kFunctionImpl.getClass();
        if (cVar instanceof C25430b) {
            bVar = (C25430b) cVar;
        } else {
            bVar = null;
        }
        boolean z = false;
        if (bVar != null && !C25455m.m63776e(bVar.mo53429g())) {
            C25432c g0 = bVar.mo53500g0();
            C24362h.m61210e(g0, "constructorDescriptor.constructedClass");
            if (!C25261d.m63407b(g0) && !C25260c.m63400q(bVar.mo53500g0())) {
                List<C25452k0> h = bVar.mo53442h();
                C24362h.m61210e(h, "constructorDescriptor.valueParameters");
                if (!h.isEmpty()) {
                    Iterator<T> it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C24307v type = ((C25452k0) it.next()).getType();
                        C24362h.m61210e(type, "it.type");
                        if (C24361g.m61173l0(type)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        if (z) {
            if (kFunctionImpl.mo59300f()) {
                return new C25034c.C25035a(constructor, C13637c.m34072l(kFunctionImpl.f60232e, kFunctionImpl.mo59298d()));
            }
            return new C25034c.C25036b(constructor);
        } else if (kFunctionImpl.mo59300f()) {
            return new C25034c.C25037c(constructor, C13637c.m34072l(kFunctionImpl.f60232e, kFunctionImpl.mo59298d()));
        } else {
            return new C25034c.C25038d(constructor);
        }
    }

    /* renamed from: b */
    public final C25032b<?> mo59296b() {
        C24973i.C24975b bVar = this.f60234g;
        C24866j<Object> jVar = f60229h[1];
        Object invoke = bVar.invoke();
        C24362h.m61210e(invoke, "<get-caller>(...)");
        return (C25032b) invoke;
    }

    /* renamed from: c */
    public final KDeclarationContainerImpl mo59297c() {
        return this.f60230c;
    }

    public final boolean equals(Object obj) {
        KFunctionImpl a = C24979k.m62674a(obj);
        if (a != null && C24362h.m61206a(this.f60230c, a.f60230c) && C24362h.m61206a(getName(), a.getName()) && C24362h.m61206a(this.f60231d, a.f60231d) && C24362h.m61206a(this.f60232e, a.f60232e)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo59300f() {
        return !C24362h.m61206a(this.f60232e, CallableReference.NO_RECEIVER);
    }

    public final int getArity() {
        return C21100e.m49330Y(mo59296b());
    }

    public final String getName() {
        String f = mo59298d().getName().mo61604f();
        C24362h.m61210e(f, "descriptor.name.asString()");
        return f;
    }

    /* renamed from: h */
    public final C23900c mo59298d() {
        C24973i.C24974a aVar = this.f60233f;
        C24866j<Object> jVar = f60229h[0];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-descriptor>(...)");
        return (C23900c) invoke;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.f60231d.hashCode() + ((hashCode + (this.f60230c.hashCode() * 31)) * 31);
    }

    public final Object invoke() {
        return mo59295a(new Object[0]);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw null;
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        return ReflectionObjectRenderer.m58642b(mo59298d());
    }

    public final Object invoke(Object obj) {
        return mo59295a(obj);
    }

    public final Object invoke(Object obj, Object obj2) {
        return mo59295a(obj, obj2);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return mo59295a(obj, obj2, obj3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, kotlin.reflect.jvm.internal.impl.descriptors.C23900c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "descriptor"
            mf0.C24362h.m61211f(r9, r0)
            ug0.e r0 = r9.getName()
            java.lang.String r3 = r0.mo61604f()
            java.lang.String r0 = "descriptor.name.asString()"
            mf0.C24362h.m61210e(r3, r0)
            kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = tf0.C24978j.m62673c(r9)
            java.lang.String r4 = r0.mo59293a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.c):void");
    }
}
