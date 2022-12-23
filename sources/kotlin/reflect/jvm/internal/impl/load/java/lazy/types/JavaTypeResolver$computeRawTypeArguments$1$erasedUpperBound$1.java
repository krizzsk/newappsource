package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24274i0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import og0.C24595j;
import zf0.C25437e;
import zf0.C25448i0;

final class JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 extends Lambda implements C24225a<C24307v> {
    public final /* synthetic */ C24371a $attr;
    public final /* synthetic */ C24274i0 $constructor;
    public final /* synthetic */ C24595j $javaType;
    public final /* synthetic */ C25448i0 $parameter;
    public final /* synthetic */ C23943a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(C23943a aVar, C25448i0 i0Var, C24595j jVar, C24371a aVar2, C24274i0 i0Var2) {
        super(0);
        this.this$0 = aVar;
        this.$parameter = i0Var;
        this.$javaType = jVar;
        this.$attr = aVar2;
        this.$constructor = i0Var2;
    }

    public final Object invoke() {
        C24312z zVar;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.this$0.f60723c;
        C25448i0 i0Var = this.$parameter;
        boolean u = this.$javaType.mo58495u();
        C24371a aVar = this.$attr;
        C25437e o = this.$constructor.mo53460o();
        if (o == null) {
            zVar = null;
        } else {
            zVar = o.mo53412q();
        }
        aVar.getClass();
        C24307v a = typeParameterUpperBoundEraser.mo59565a(i0Var, u, C24371a.m61248a(aVar, (JavaTypeFlexibility) null, (Set) null, zVar, 15));
        C24362h.m61210e(a, "typeParameterUpperBoundE…efaultType)\n            )");
        return a;
    }
}
