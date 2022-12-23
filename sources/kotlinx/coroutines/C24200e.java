package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import wh0.C25224v1;

/* renamed from: kotlinx.coroutines.e */
public final class C24200e extends CoroutineDispatcher {

    /* renamed from: d */
    public static final /* synthetic */ int f61447d = 0;

    static {
        new C24200e();
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        C25224v1 v1Var = (C25224v1) coroutineContext.mo53081c(C25224v1.f63499d);
        if (v1Var != null) {
            v1Var.f63500c = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
