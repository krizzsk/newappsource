package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import lf0.C24236l;
import mf0.C24362h;
import qg0.C24736a;
import qg0.C24757k;

final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends Lambda implements C24236l<C24757k, AbstractBinaryClassAnnotationAndConstantLoader.C23976a<Object, Object>> {
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader) {
        super(1);
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
    }

    public final Object invoke(Object obj) {
        C24757k kVar = (C24757k) obj;
        C24362h.m61211f(kVar, "kotlinClass");
        AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader = this.this$0;
        abstractBinaryClassAnnotationAndConstantLoader.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        kVar.mo58418a(new C24736a(abstractBinaryClassAnnotationAndConstantLoader, hashMap, hashMap2));
        return new AbstractBinaryClassAnnotationAndConstantLoader.C23976a(hashMap, hashMap2);
    }
}
