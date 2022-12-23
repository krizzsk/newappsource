package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24225a;
import og0.C24585a;
import ug0.C25065b;

public final class LazyJavaClassDescriptor$moduleAnnotations$2 extends Lambda implements C24225a<List<? extends C24585a>> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$moduleAnnotations$2(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final Object invoke() {
        C25065b f = DescriptorUtilsKt.m60285f(this.this$0);
        if (f == null) {
            return null;
        }
        this.this$0.f60636i.f60080a.f60077w.mo53294c(f);
        return null;
    }
}
