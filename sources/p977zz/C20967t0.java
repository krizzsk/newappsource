package p977zz;

import java.lang.Thread;

/* renamed from: zz.t0 */
public abstract class C20967t0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f52723a;

    public C20967t0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f52723a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public abstract void mo50094a(Throwable th);

    public final void uncaughtException(Thread thread, Throwable th) {
        mo50094a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f52723a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
