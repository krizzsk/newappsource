package p091g2;

import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import mf0.C24362h;

/* renamed from: g2.b */
public final class C4748b implements C1026n0.C1028b {

    /* renamed from: a */
    public final C4751e<?>[] f16034a;

    public C4748b(C4751e<?>... eVarArr) {
        C24362h.m61211f(eVarArr, "initializers");
        this.f16034a = eVarArr;
    }

    /* renamed from: a */
    public final C1019k0 mo4064a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public final C1019k0 mo4065b(Class cls, C4749c cVar) {
        C1019k0 k0Var = null;
        for (C4751e<?> eVar : this.f16034a) {
            if (C24362h.m61206a(eVar.f16035a, cls)) {
                T invoke = eVar.f16036b.invoke(cVar);
                if (invoke instanceof C1019k0) {
                    k0Var = (C1019k0) invoke;
                } else {
                    k0Var = null;
                }
            }
        }
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalArgumentException(C25541a.m63876f(cls, C13555b.m33972k("No initializer set for given class ")));
    }
}
