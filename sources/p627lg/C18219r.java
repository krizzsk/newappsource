package p627lg;

import java.util.concurrent.ThreadFactory;

/* renamed from: lg.r */
public final /* synthetic */ class C18219r implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ ThreadFactory f46486b;

    public /* synthetic */ C18219r(ThreadFactory threadFactory) {
        this.f46486b = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f46486b.newThread(new C18218q(runnable));
    }
}
