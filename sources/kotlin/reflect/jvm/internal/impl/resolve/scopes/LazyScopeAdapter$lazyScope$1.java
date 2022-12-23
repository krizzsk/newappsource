package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import eh0.C23300a;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

public final class LazyScopeAdapter$lazyScope$1 extends Lambda implements C24225a<MemberScope> {
    public final /* synthetic */ C24225a<MemberScope> $getScope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter$lazyScope$1(C24225a<? extends MemberScope> aVar) {
        super(0);
        this.$getScope = aVar;
    }

    public final Object invoke() {
        MemberScope invoke = this.$getScope.invoke();
        if (invoke instanceof C23300a) {
            return ((C23300a) invoke).mo58434h();
        }
        return invoke;
    }
}
