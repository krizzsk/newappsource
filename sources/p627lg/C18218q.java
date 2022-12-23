package p627lg;

import java.util.ArrayDeque;

/* renamed from: lg.q */
public final /* synthetic */ class C18218q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Runnable f46485b;

    public /* synthetic */ C18218q(Runnable runnable) {
        this.f46485b = runnable;
    }

    public final void run() {
        Runnable runnable = this.f46485b;
        C18209h.f46467c.set(new ArrayDeque());
        runnable.run();
    }
}
