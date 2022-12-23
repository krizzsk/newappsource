package p977zz;

import com.moovit.commons.utils.CallableRunnable;

/* renamed from: zz.d */
public final /* synthetic */ class C20933d {
    /* renamed from: b */
    public static Void m49027b(CallableRunnable callableRunnable) throws Exception {
        callableRunnable.runSafe();
        return null;
    }

    /* renamed from: c */
    public static void m49028c(CallableRunnable callableRunnable, Throwable th) {
    }

    /* renamed from: d */
    public static void m49029d(CallableRunnable callableRunnable) {
        try {
            callableRunnable.runSafe();
        } catch (Throwable th) {
            callableRunnable.onError(th);
        }
    }
}
