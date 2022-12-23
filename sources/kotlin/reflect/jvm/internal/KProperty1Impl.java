package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import mf0.C24362h;
import sf0.C24864i;
import tf0.C24973i;
import zf0.C25491z;

public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements C24864i<T, V> {

    /* renamed from: j */
    public final C24973i.C24975b<C23848a<T, V>> f60254j = C24973i.m62669b(new KProperty1Impl$_getter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.KProperty1Impl$a */
    public static final class C23848a<T, V> extends KPropertyImpl.Getter<V> implements C24864i.C24865a<T, V> {

        /* renamed from: f */
        public final KProperty1Impl<T, V> f60255f;

        public C23848a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            C24362h.m61211f(kProperty1Impl, "property");
            this.f60255f = kProperty1Impl;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60255f;
        }

        public final V invoke(T t) {
            return this.f60255f.get(t);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateSource$1(this));
    }

    public final V get(T t) {
        C23848a<T, V> invoke = this.f60254j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke.mo59295a(t);
    }

    public final C24864i.C24865a getGetter() {
        C23848a<T, V> invoke = this.f60254j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke;
    }

    /* renamed from: i */
    public final KPropertyImpl.Getter mo59334i() {
        C23848a<T, V> invoke = this.f60254j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke;
    }

    public final V invoke(T t) {
        return get(t);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
        C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateSource$1(this));
    }
}
