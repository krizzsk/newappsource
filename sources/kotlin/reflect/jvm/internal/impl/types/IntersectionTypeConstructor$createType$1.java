package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;

public final class IntersectionTypeConstructor$createType$1 extends Lambda implements C24236l<C24378d, C24312z> {
    public final /* synthetic */ IntersectionTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$createType$1(IntersectionTypeConstructor intersectionTypeConstructor) {
        super(1);
        this.this$0 = intersectionTypeConstructor;
    }

    public final Object invoke(Object obj) {
        C24378d dVar = (C24378d) obj;
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this.this$0.mo60235c(dVar).mo60233a();
    }
}
