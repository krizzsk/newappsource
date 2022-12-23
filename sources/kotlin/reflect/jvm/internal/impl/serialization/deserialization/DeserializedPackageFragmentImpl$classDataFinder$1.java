package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import jh0.C23730d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25065b;
import zf0.C25435d0;

final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements C24236l<C25065b, C25435d0> {
    public final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    public final Object invoke(Object obj) {
        C24362h.m61211f((C25065b) obj, "it");
        C23730d dVar = this.this$0.f61236i;
        if (dVar == null) {
            return C25435d0.f63736a;
        }
        return dVar;
    }
}
