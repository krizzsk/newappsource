package wh0;

import bi0.C21073k;
import ci0.C21207b;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: wh0.g1 */
public abstract class C25179g1 extends CoroutineDispatcher {
    public String toString() {
        String str;
        C25179g1 g1Var;
        C21207b bVar = C25184i0.f63459a;
        C25179g1 g1Var2 = C21073k.f52890a;
        if (this == g1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g1Var = g1Var2.mo60300z();
            } catch (UnsupportedOperationException unused) {
                g1Var = null;
            }
            if (this == g1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C25154a0.m63137b(this);
    }

    /* renamed from: z */
    public abstract C25179g1 mo60300z();
}
