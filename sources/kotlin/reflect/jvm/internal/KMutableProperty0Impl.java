package kotlin.reflect.jvm.internal;

import bf0.C21050d;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import mf0.C24362h;
import sf0.C24859f;
import tf0.C24973i;
import zf0.C25491z;

public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements C24859f<V> {

    /* renamed from: k */
    public final C24973i.C24975b<C23845a<V>> f60235k = C24973i.m62669b(new KMutableProperty0Impl$_setter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.KMutableProperty0Impl$a */
    public static final class C23845a<R> extends KPropertyImpl.Setter<R> implements C24859f.C24860a<R> {

        /* renamed from: f */
        public final KMutableProperty0Impl<R> f60236f;

        public C23845a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            C24362h.m61211f(kMutableProperty0Impl, "property");
            this.f60236f = kMutableProperty0Impl;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60236f;
        }

        public final Object invoke(Object obj) {
            this.f60236f.set(obj);
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
    }

    public final C24859f.C24860a getSetter() {
        C23845a<V> invoke = this.f60235k.invoke();
        C24362h.m61210e(invoke, "_setter()");
        return invoke;
    }

    public final void set(V v) {
        C23845a<V> invoke = this.f60235k.invoke();
        C24362h.m61210e(invoke, "_setter()");
        invoke.mo59295a(v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
    }
}
