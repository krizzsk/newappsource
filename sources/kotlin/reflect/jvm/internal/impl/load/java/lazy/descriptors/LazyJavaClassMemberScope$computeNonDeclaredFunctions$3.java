package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24857d;
import ug0.C25069e;

final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements C24236l<C25069e, Collection<? extends C23903e>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(LazyJavaScope lazyJavaScope) {
        super(1, lazyJavaScope);
    }

    public final String getName() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    public final C24857d getOwner() {
        return C24365j.m61219a(LazyJavaClassMemberScope.class);
    }

    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "p0");
        return LazyJavaClassMemberScope.m59074v((LazyJavaClassMemberScope) this.receiver, eVar);
    }
}
