package p531he;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: he.y */
public final class C17423y implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f44877b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f44878c;

    /* renamed from: he.y$a */
    public class C17424a extends C17391c {

        /* renamed from: b */
        public final /* synthetic */ Runnable f44879b;

        public C17424a(Runnable runnable) {
            this.f44879b = runnable;
        }

        /* renamed from: a */
        public final void mo49866a() {
            this.f44879b.run();
        }
    }

    public C17423y(String str, AtomicLong atomicLong) {
        this.f44877b = str;
        this.f44878c = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new C17424a(runnable));
        newThread.setName(this.f44877b + this.f44878c.getAndIncrement());
        return newThread;
    }
}
