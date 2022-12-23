package ij0;

import java.lang.reflect.Array;
import kj0.C23811f;

/* renamed from: ij0.d */
public final class C23620d implements C23666r0 {

    /* renamed from: a */
    public final C23811f f59705a;

    /* renamed from: b */
    public final Class f59706b;

    /* renamed from: c */
    public final int f59707c;

    public C23620d(C23811f fVar) {
        this.f59707c = fVar.getLength();
        this.f59706b = fVar.getType();
        this.f59705a = fVar;
    }

    /* renamed from: a */
    public final boolean mo58773a() {
        return this.f59705a.mo5645a();
    }

    /* renamed from: b */
    public final Object mo58774b(Object obj) {
        C23811f fVar = this.f59705a;
        if (fVar != null) {
            fVar.setValue(obj);
        }
        return obj;
    }

    public final Object getInstance() throws Exception {
        if (this.f59705a.mo5645a()) {
            return this.f59705a.getValue();
        }
        Object newInstance = Array.newInstance(this.f59706b, this.f59707c);
        C23811f fVar = this.f59705a;
        if (fVar != null) {
            fVar.setValue(newInstance);
        }
        return newInstance;
    }

    public final Class getType() {
        return this.f59706b;
    }
}
