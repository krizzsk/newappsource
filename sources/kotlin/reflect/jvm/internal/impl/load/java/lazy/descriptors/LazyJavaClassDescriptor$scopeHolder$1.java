package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mh0.C24378d;
import og0.C24592g;

public final class LazyJavaClassDescriptor$scopeHolder$1 extends Lambda implements C24236l<C24378d, LazyJavaClassMemberScope> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final Object invoke(Object obj) {
        boolean z;
        C24362h.m61211f((C24378d) obj, "it");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        C23780d dVar = lazyJavaClassDescriptor.f60639l;
        C24592g gVar = lazyJavaClassDescriptor.f60637j;
        if (lazyJavaClassDescriptor.f60638k != null) {
            z = true;
        } else {
            z = false;
        }
        return new LazyJavaClassMemberScope(dVar, lazyJavaClassDescriptor, gVar, z, lazyJavaClassDescriptor.f60646s);
    }
}
