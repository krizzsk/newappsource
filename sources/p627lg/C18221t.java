package p627lg;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* renamed from: lg.t */
public final /* synthetic */ class C18221t implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Executor f46492b;

    /* renamed from: c */
    public final /* synthetic */ CancellationToken f46493c;

    /* renamed from: d */
    public final /* synthetic */ CancellationTokenSource f46494d;

    /* renamed from: e */
    public final /* synthetic */ TaskCompletionSource f46495e;

    public /* synthetic */ C18221t(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.f46492b = executor;
        this.f46493c = cancellationToken;
        this.f46494d = cancellationTokenSource;
        this.f46495e = taskCompletionSource;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f46492b;
        CancellationToken cancellationToken = this.f46493c;
        CancellationTokenSource cancellationTokenSource = this.f46494d;
        TaskCompletionSource taskCompletionSource = this.f46495e;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e);
            }
            throw e;
        }
    }
}
