package ce0;

import java.lang.ref.WeakReference;

/* renamed from: ce0.w */
public final class C21122w implements Runnable {

    /* renamed from: b */
    public WeakReference<Runnable> f52986b;

    public C21122w(Runnable runnable) {
        this.f52986b = new WeakReference<>(runnable);
    }

    public final void run() {
        Runnable runnable = this.f52986b.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
