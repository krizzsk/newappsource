package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;

public final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements C24236l<C25066c, Boolean> {
    public final /* synthetic */ C25066c $fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(C25066c cVar) {
        super(1);
        this.$fqName = cVar;
    }

    public final Object invoke(Object obj) {
        boolean z;
        C25066c cVar = (C25066c) obj;
        C24362h.m61211f(cVar, "it");
        if (cVar.mo61582d() || !C24362h.m61206a(cVar.mo61583e(), this.$fqName)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
