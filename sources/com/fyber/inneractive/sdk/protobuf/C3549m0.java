package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3534j0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m0 */
public class C3549m0 implements C3546l0 {
    /* renamed from: a */
    public Map<?, ?> mo15092a(Object obj) {
        return (C3538k0) obj;
    }

    /* renamed from: b */
    public Object mo15093b(Object obj) {
        C3538k0 k0Var = C3538k0.f12505b;
        if (k0Var.isEmpty()) {
            return new C3538k0();
        }
        return new C3538k0(k0Var);
    }

    /* renamed from: c */
    public Map<?, ?> mo15094c(Object obj) {
        return (C3538k0) obj;
    }

    /* renamed from: d */
    public boolean mo15095d(Object obj) {
        return !((C3538k0) obj).f12506a;
    }

    /* renamed from: e */
    public Object mo15096e(Object obj) {
        ((C3538k0) obj).f12506a = false;
        return obj;
    }

    /* renamed from: f */
    public C3534j0.C3535a<?, ?> mo15097f(Object obj) {
        ((C3534j0) obj).getClass();
        return null;
    }

    /* renamed from: a */
    public Object mo15091a(Object obj, Object obj2) {
        C3538k0 k0Var = (C3538k0) obj;
        C3538k0 k0Var2 = (C3538k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f12506a) {
                k0Var = k0Var.isEmpty() ? new C3538k0() : new C3538k0(k0Var);
            }
            k0Var.mo15049a();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    /* renamed from: a */
    public int mo15090a(int i, Object obj, Object obj2) {
        C3538k0 k0Var = (C3538k0) obj;
        C3534j0 j0Var = (C3534j0) obj2;
        if (k0Var.isEmpty()) {
            return 0;
        }
        Iterator it = k0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        j0Var.getClass();
        C3540l.m9237b(i);
        throw null;
    }
}
