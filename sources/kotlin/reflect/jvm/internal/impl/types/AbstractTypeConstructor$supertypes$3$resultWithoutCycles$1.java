package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24274i0;
import lh0.C24307v;
import mf0.C24362h;

final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1 extends Lambda implements C24236l<C24274i0, Iterable<? extends C24307v>> {
    public final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public final Object invoke(Object obj) {
        C24274i0 i0Var = (C24274i0) obj;
        C24362h.m61211f(i0Var, "it");
        return AbstractTypeConstructor.m60456b(this.this$0, i0Var, false);
    }
}
