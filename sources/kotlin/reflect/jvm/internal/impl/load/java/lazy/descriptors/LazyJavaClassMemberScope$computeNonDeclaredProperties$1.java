package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;

final class LazyJavaClassMemberScope$computeNonDeclaredProperties$1 extends Lambda implements C24236l<C25069e, Collection<? extends C23903e>> {
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$computeNonDeclaredProperties$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "it");
        return LazyJavaClassMemberScope.m59074v(this.this$0, eVar);
    }
}
