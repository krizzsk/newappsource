package kotlin.reflect.jvm.internal;

import bf0.C21050d;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24240p;
import mf0.C24362h;
import sf0.C24861g;
import tf0.C24973i;
import zf0.C25491z;

public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements C24861g<T, V> {

    /* renamed from: k */
    public final C24973i.C24975b<C23846a<T, V>> f60237k = C24973i.m62669b(new KMutableProperty1Impl$_setter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.KMutableProperty1Impl$a */
    public static final class C23846a<T, V> extends KPropertyImpl.Setter<V> implements C24240p {

        /* renamed from: f */
        public final KMutableProperty1Impl<T, V> f60238f;

        public C23846a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            C24362h.m61211f(kMutableProperty1Impl, "property");
            this.f60238f = kMutableProperty1Impl;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60238f;
        }

        public final Object invoke(Object obj, Object obj2) {
            C23846a<T, V> invoke = this.f60238f.f60237k.invoke();
            C24362h.m61210e(invoke, "_setter()");
            invoke.mo59295a(obj, obj2);
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
    }
}
