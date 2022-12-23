package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kg0.C23780d;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25442g;
import zf0.C25491z;

public final class LazyJavaScope$properties$1 extends Lambda implements C24236l<C25069e, List<? extends C25491z>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "name");
        ArrayList arrayList = new ArrayList();
        C24361g.m61168j(this.this$0.f60689g.invoke(eVar), arrayList);
        this.this$0.mo59538n(arrayList, eVar);
        C25442g q = this.this$0.mo59541q();
        int i = C25260c.f63536a;
        if (C25260c.m63397n(q, ClassKind.ANNOTATION_CLASS)) {
            return C23825c.m58499K0(arrayList);
        }
        C23780d dVar = this.this$0.f60684b;
        return C23825c.m58499K0(dVar.f60080a.f60072r.mo59573a(dVar, arrayList));
    }
}
