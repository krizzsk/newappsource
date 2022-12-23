package p531he;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* renamed from: he.g0 */
public final /* synthetic */ class C17401g0 implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f44819b;

    public /* synthetic */ C17401g0(TaskCompletionSource taskCompletionSource) {
        this.f44819b = taskCompletionSource;
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = this.f44819b;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
