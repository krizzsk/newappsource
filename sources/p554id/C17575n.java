package p554id;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: id.n */
public final class C17575n implements Executor {

    /* renamed from: b */
    public final Handler f45197b = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f45197b.post(runnable);
    }
}
