package p177n1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: n1.f */
public final class C5806f implements Executor {

    /* renamed from: b */
    public final Handler f18756b;

    public C5806f(Handler handler) {
        this.f18756b = handler;
    }

    public final void execute(Runnable runnable) {
        Handler handler = this.f18756b;
        runnable.getClass();
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(this.f18756b + " is shutting down");
        }
    }
}
