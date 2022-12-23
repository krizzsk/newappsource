package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25069e;

public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends Lambda implements C24236l<C25069e, Collection<? extends C23903e>> {
    public final /* synthetic */ C23903e $function;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(C23903e eVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.$function = eVar;
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "accessorName");
        if (C24362h.m61206a(this.$function.getName(), eVar)) {
            return C17875h.m44280D(this.$function);
        }
        return C23825c.m58527x0(LazyJavaClassMemberScope.m59075w(this.this$0, eVar), LazyJavaClassMemberScope.m59074v(this.this$0, eVar));
    }
}
