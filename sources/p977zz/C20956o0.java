package p977zz;

import com.moovit.commons.utils.SafeRunnable;

/* renamed from: zz.o0 */
public final /* synthetic */ class C20956o0 {
    /* renamed from: a */
    public static void m49073a(SafeRunnable safeRunnable, Throwable th) {
    }

    /* renamed from: b */
    public static void m49074b(SafeRunnable safeRunnable) {
        try {
            safeRunnable.safeRun();
        } catch (Throwable th) {
            safeRunnable.onError(th);
        }
    }
}
