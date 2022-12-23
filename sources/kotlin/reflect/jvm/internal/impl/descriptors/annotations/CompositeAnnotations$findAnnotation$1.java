package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ag0.C20986c;
import ag0.C20989e;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;

public final class CompositeAnnotations$findAnnotation$1 extends Lambda implements C24236l<C20989e, C20986c> {
    public final /* synthetic */ C25066c $fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(C25066c cVar) {
        super(1);
        this.$fqName = cVar;
    }

    public final Object invoke(Object obj) {
        C20989e eVar = (C20989e) obj;
        C24362h.m61211f(eVar, "it");
        return eVar.mo53071c(this.$fqName);
    }
}
