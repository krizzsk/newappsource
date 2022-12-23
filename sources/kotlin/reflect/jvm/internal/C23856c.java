package kotlin.reflect.jvm.internal;

import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24240p;
import mf0.C24362h;
import tf0.C24973i;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.c */
public class C23856c<D, E, V> extends KPropertyImpl<V> implements C24240p {

    /* renamed from: j */
    public final C24973i.C24975b<C23857a<D, E, V>> f60288j = C24973i.m62669b(new KProperty2Impl$_getter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.c$a */
    public static final class C23857a<D, E, V> extends KPropertyImpl.Getter<V> implements C24240p {

        /* renamed from: f */
        public final C23856c<D, E, V> f60289f;

        public C23857a(C23856c<D, E, ? extends V> cVar) {
            C24362h.m61211f(cVar, "property");
            this.f60289f = cVar;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60289f;
        }

        public final V invoke(D d, E e) {
            C23857a<D, E, V> invoke = this.f60289f.f60288j.invoke();
            C24362h.m61210e(invoke, "_getter()");
            return invoke.mo59295a(d, e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23856c(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
        C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KProperty2Impl$delegateSource$1(this));
    }

    /* renamed from: i */
    public final KPropertyImpl.Getter mo59334i() {
        C23857a<D, E, V> invoke = this.f60288j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke;
    }

    public final V invoke(D d, E e) {
        C23857a<D, E, V> invoke = this.f60288j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke.mo59295a(d, e);
    }
}
