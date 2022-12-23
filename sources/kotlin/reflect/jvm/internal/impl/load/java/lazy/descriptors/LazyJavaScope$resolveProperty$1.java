package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cg0.C21164d0;
import jg0.C23724e;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import og0.C24599n;
import zg0.C25498g;

final class LazyJavaScope$resolveProperty$1 extends Lambda implements C24225a<C25498g<?>> {
    public final /* synthetic */ C24599n $field;
    public final /* synthetic */ C21164d0 $propertyDescriptor;
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$resolveProperty$1(LazyJavaScope lazyJavaScope, C24599n nVar, C23724e eVar) {
        super(0);
        this.this$0 = lazyJavaScope;
        this.$field = nVar;
        this.$propertyDescriptor = eVar;
    }

    public final Object invoke() {
        this.this$0.f60684b.f60080a.f60062h.mo58735a(this.$field, this.$propertyDescriptor);
        return null;
    }
}
