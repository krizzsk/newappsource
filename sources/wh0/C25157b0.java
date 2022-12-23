package wh0;

import bi0.C21073k;
import bi0.C21080r;
import ci0.C21207b;
import kotlinx.coroutines.C24184b;

/* renamed from: wh0.b0 */
public final class C25157b0 {

    /* renamed from: a */
    public static final C25171e0 f63434a;

    static {
        String str;
        boolean z;
        C25171e0 e0Var;
        int i = C21080r.f52895a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            e0Var = C24184b.f61423j;
        } else {
            C21207b bVar = C25184i0.f63459a;
            C25179g1 g1Var = C21073k.f52890a;
            g1Var.mo60300z();
            if (!(g1Var instanceof C25171e0)) {
                e0Var = C24184b.f61423j;
            } else {
                e0Var = (C25171e0) g1Var;
            }
        }
        f63434a = e0Var;
    }
}
