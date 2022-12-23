package p627lg;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* renamed from: lg.p */
public final /* synthetic */ class C18217p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Callable f46483b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f46484c;

    public /* synthetic */ C18217p(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f46483b = callable;
        this.f46484c = taskCompletionSource;
    }

    public final void run() {
        Callable callable = this.f46483b;
        TaskCompletionSource taskCompletionSource = this.f46484c;
        try {
            taskCompletionSource.setResult(callable.call());
        } catch (MlKitException e) {
            taskCompletionSource.setException(e);
        } catch (Exception e2) {
            taskCompletionSource.setException(new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e2));
        }
    }
}
