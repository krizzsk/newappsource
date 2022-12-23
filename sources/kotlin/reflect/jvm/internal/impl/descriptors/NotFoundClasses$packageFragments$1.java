package kotlin.reflect.jvm.internal.impl.descriptors;

import cg0.C21187p;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;
import zf0.C25486u;

public final class NotFoundClasses$packageFragments$1 extends Lambda implements C24236l<C25066c, C25486u> {
    public final /* synthetic */ NotFoundClasses this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    public final Object invoke(Object obj) {
        C25066c cVar = (C25066c) obj;
        C24362h.m61211f(cVar, "fqName");
        return new C21187p(this.this$0.f60420b, cVar);
    }
}
