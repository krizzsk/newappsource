package kotlin.reflect.jvm.internal.impl.types;

import ag0.C20989e;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;

final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends Lambda implements C24236l<C24378d, C24312z> {
    public final /* synthetic */ C20989e $annotations;
    public final /* synthetic */ List<C24281l0> $arguments;
    public final /* synthetic */ C24274i0 $constructor;
    public final /* synthetic */ MemberScope $memberScope;
    public final /* synthetic */ boolean $nullable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(List list, C20989e eVar, MemberScope memberScope, C24274i0 i0Var, boolean z) {
        super(1);
        this.$constructor = i0Var;
        this.$arguments = list;
        this.$annotations = eVar;
        this.$nullable = z;
        this.$memberScope = memberScope;
    }

    public final Object invoke(Object obj) {
        C24378d dVar = (C24378d) obj;
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        int i = KotlinTypeFactory.f61338a;
        KotlinTypeFactory.m60472a(this.$constructor, dVar, this.$arguments);
        return null;
    }
}
