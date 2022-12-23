package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import og0.C24609x;
import zf0.C25448i0;

public final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements C24225a<List<? extends C25448i0>> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final Object invoke() {
        ArrayList<C24609x> typeParameters = this.this$0.f60637j.getTypeParameters();
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(typeParameters, 10));
        for (C24609x xVar : typeParameters) {
            C25448i0 a = lazyJavaClassDescriptor.f60639l.f60081b.mo59013a(xVar);
            if (a != null) {
                arrayList.add(a);
            } else {
                throw new AssertionError("Parameter " + xVar + " surely belongs to class " + lazyJavaClassDescriptor.f60637j + ", so it must be resolved");
            }
        }
        return arrayList;
    }
}
