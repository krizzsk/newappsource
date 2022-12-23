package kotlin.reflect.jvm.internal;

import bf0.C21050d;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24241q;
import mf0.C24362h;
import tf0.C24973i;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.b */
public final class C23854b<D, E, V> extends C23856c<D, E, V> {

    /* renamed from: k */
    public final C24973i.C24975b<C23855a<D, E, V>> f60286k = C24973i.m62669b(new KMutableProperty2Impl$_setter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.b$a */
    public static final class C23855a<D, E, V> extends KPropertyImpl.Setter<V> implements C24241q {

        /* renamed from: f */
        public final C23854b<D, E, V> f60287f;

        public C23855a(C23854b<D, E, V> bVar) {
            C24362h.m61211f(bVar, "property");
            this.f60287f = bVar;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60287f;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C23855a<D, E, V> invoke = this.f60287f.f60286k.invoke();
            C24362h.m61210e(invoke, "_setter()");
            invoke.mo59295a(obj, obj2, obj3);
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23854b(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
    }
}
