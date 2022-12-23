package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ag0.C20986c;
import ig0.C23595b;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import og0.C24585a;
import ug0.C25069e;

public final class LazyJavaAnnotations$annotationDescriptors$1 extends Lambda implements C24236l<C24585a, C20986c> {
    public final /* synthetic */ LazyJavaAnnotations this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotations$annotationDescriptors$1(LazyJavaAnnotations lazyJavaAnnotations) {
        super(1);
        this.this$0 = lazyJavaAnnotations;
    }

    public final Object invoke(Object obj) {
        C24585a aVar = (C24585a) obj;
        C24362h.m61211f(aVar, "annotation");
        C25069e eVar = C23595b.f59671a;
        LazyJavaAnnotations lazyJavaAnnotations = this.this$0;
        return C23595b.m57783b(lazyJavaAnnotations.f60605b, aVar, lazyJavaAnnotations.f60607d);
    }
}
