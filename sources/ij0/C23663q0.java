package ij0;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: ij0.q0 */
public final class C23663q0 {

    /* renamed from: a */
    public final Method f59825a;

    /* renamed from: b */
    public final boolean f59826b;

    public C23663q0(Method method, boolean z) {
        this.f59826b = z;
        this.f59825a = method;
    }

    /* renamed from: a */
    public final Object mo58846a(C23639i1 i1Var, Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        HashMap hashMap = ((C23654n1) i1Var.f59778d).f59808b;
        if (!this.f59826b) {
            return this.f59825a.invoke(obj, new Object[0]);
        }
        return this.f59825a.invoke(obj, new Object[]{hashMap});
    }
}
