package kotlin.reflect.jvm.internal.impl.types;

import bf0.C21050d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import zf0.C25443g0;

public final class AbstractTypeConstructor$supertypes$3 extends Lambda implements C24236l<AbstractTypeConstructor.C24153a, C21050d> {
    public final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public final Object invoke(Object obj) {
        AbstractTypeConstructor.C24153a aVar = (AbstractTypeConstructor.C24153a) obj;
        C24362h.m61211f(aVar, "supertypes");
        C25443g0 f = this.this$0.mo53488f();
        AbstractTypeConstructor abstractTypeConstructor = this.this$0;
        Collection a = f.mo62738a(abstractTypeConstructor, aVar.f61330a, new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(abstractTypeConstructor), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.this$0));
        List list = null;
        if (a.isEmpty()) {
            C24307v d = this.this$0.mo53487d();
            if (d == null) {
                a = null;
            } else {
                a = C17875h.m44280D(d);
            }
            if (a == null) {
                a = EmptyList.f60173b;
            }
        }
        this.this$0.getClass();
        AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
        if (a instanceof List) {
            list = (List) a;
        }
        if (list == null) {
            list = C23825c.m58499K0(a);
        }
        List<C24307v> h = abstractTypeConstructor2.mo53489h(list);
        C24362h.m61211f(h, "<set-?>");
        aVar.f61331b = h;
        return C21050d.f52856a;
    }
}
