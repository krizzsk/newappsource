package p910xf;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p578jf.C17843u;
import p578jf.C17844v;

/* renamed from: xf.g */
public final /* synthetic */ class C20478g implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ C20482k f51846b;

    /* renamed from: c */
    public final /* synthetic */ Continuation f51847c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f51848d;

    /* renamed from: e */
    public final /* synthetic */ CancellationTokenSource f51849e;

    public /* synthetic */ C20478g(C20482k kVar, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f51846b = kVar;
        this.f51847c = continuation;
        this.f51848d = taskCompletionSource;
        this.f51849e = cancellationTokenSource;
    }

    public final void onComplete(Task task) {
        C20482k kVar = this.f51846b;
        Continuation continuation = this.f51847c;
        TaskCompletionSource taskCompletionSource = this.f51848d;
        CancellationTokenSource cancellationTokenSource = this.f51849e;
        kVar.getClass();
        try {
            Task task2 = (Task) continuation.then(kVar);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new C17843u(taskCompletionSource, 1));
            task2.addOnFailureListener(new C17844v(taskCompletionSource, 1));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new C20480i(cancellationTokenSource));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e.getCause());
            } else {
                taskCompletionSource.setException(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }
}
