package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lg0.C24252d;
import mf0.C24362h;
import og0.C24609x;

public final class LazyJavaTypeParameterResolver$resolve$1 extends Lambda implements C24236l<C24609x, C24252d> {
    public final /* synthetic */ LazyJavaTypeParameterResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterResolver$resolve$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        super(1);
        this.this$0 = lazyJavaTypeParameterResolver;
    }

    public final Object invoke(Object obj) {
        C24609x xVar = (C24609x) obj;
        C24362h.m61211f(xVar, "typeParameter");
        Integer num = (Integer) this.this$0.f60614d.get(xVar);
        if (num == null) {
            return null;
        }
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.this$0;
        int intValue = num.intValue();
        C23780d dVar = lazyJavaTypeParameterResolver.f60611a;
        C24362h.m61211f(dVar, "<this>");
        return new C24252d(ContextKt.m59010c(new C23780d(dVar.f60080a, lazyJavaTypeParameterResolver, dVar.f60082c), lazyJavaTypeParameterResolver.f60612b.getAnnotations()), xVar, lazyJavaTypeParameterResolver.f60613c + intValue, lazyJavaTypeParameterResolver.f60612b);
    }
}
