package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24307v;
import mh0.C24378d;

final class LazyWrappedType$refine$1 extends Lambda implements C24225a<C24307v> {
    public final /* synthetic */ C24378d $kotlinTypeRefiner;
    public final /* synthetic */ C24162a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(C24378d dVar, C24162a aVar) {
        super(0);
        this.$kotlinTypeRefiner = dVar;
        this.this$0 = aVar;
    }

    public final Object invoke() {
        return this.$kotlinTypeRefiner.mo60522A(this.this$0.f61357d.invoke());
    }
}
