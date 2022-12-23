package p957zf;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p404ce.C13784b;
import p404ce.C13792g;

/* renamed from: zf.b */
public final class C20841b implements C13792g {
    /* renamed from: a */
    public final List<C13784b<?>> mo243a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C13784b next : componentRegistrar.getComponents()) {
            String str = next.f33933a;
            if (str != null) {
                next = new C13784b(str, next.f33934b, next.f33935c, next.f33936d, next.f33937e, new C20840a(str, next), next.f33939g);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
