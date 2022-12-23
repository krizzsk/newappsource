package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import mf0.C24362h;
import sf0.C24862h;
import tf0.C24973i;
import zf0.C25491z;

public class KProperty0Impl<V> extends KPropertyImpl<V> implements C24862h<V> {

    /* renamed from: j */
    public final C24973i.C24975b<C23847a<V>> f60252j = C24973i.m62669b(new KProperty0Impl$_getter$1(this));

    /* renamed from: kotlin.reflect.jvm.internal.KProperty0Impl$a */
    public static final class C23847a<R> extends KPropertyImpl.Getter<R> implements C24862h.C24863a<R> {

        /* renamed from: f */
        public final KProperty0Impl<R> f60253f;

        public C23847a(KProperty0Impl<? extends R> kProperty0Impl) {
            C24362h.m61211f(kProperty0Impl, "property");
            this.f60253f = kProperty0Impl;
        }

        /* renamed from: h */
        public final KPropertyImpl mo59327h() {
            return this.f60253f;
        }

        public final R invoke() {
            return this.f60253f.get();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, C25491z zVar) {
        super(kDeclarationContainerImpl, zVar);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(zVar, "descriptor");
        C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateValue$1(this));
    }

    public final V get() {
        C23847a<V> invoke = this.f60252j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke.mo59295a(new Object[0]);
    }

    public final C24862h.C24863a getGetter() {
        C23847a<V> invoke = this.f60252j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke;
    }

    /* renamed from: i */
    public final KPropertyImpl.Getter mo59334i() {
        C23847a<V> invoke = this.f60252j.invoke();
        C24362h.m61210e(invoke, "_getter()");
        return invoke;
    }

    public final V invoke() {
        return get();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateValue$1(this));
    }
}
