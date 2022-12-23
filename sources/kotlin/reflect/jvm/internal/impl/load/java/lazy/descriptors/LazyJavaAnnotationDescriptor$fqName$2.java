package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import ug0.C25065b;
import ug0.C25066c;

public final class LazyJavaAnnotationDescriptor$fqName$2 extends Lambda implements C24225a<C25066c> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$fqName$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    public final Object invoke() {
        C25065b d = this.this$0.f60629b.mo58476d();
        if (d == null) {
            return null;
        }
        return d.mo61569b();
    }
}
