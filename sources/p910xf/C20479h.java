package p910xf;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p484ff.C16984m;
import p910xf.C20482k;

/* renamed from: xf.h */
public final /* synthetic */ class C20479h implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ SuccessContinuation f51850b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f51851c;

    /* renamed from: d */
    public final /* synthetic */ CancellationTokenSource f51852d;

    public /* synthetic */ C20479h(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f51850b = successContinuation;
        this.f51851c = taskCompletionSource;
        this.f51852d = cancellationTokenSource;
    }

    public final void onSuccess(Object obj) {
        SuccessContinuation successContinuation = this.f51850b;
        TaskCompletionSource taskCompletionSource = this.f51851c;
        CancellationTokenSource cancellationTokenSource = this.f51852d;
        try {
            Task then = successContinuation.then((C20482k.C20483a) obj);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new C16984m(taskCompletionSource, 1));
            then.addOnFailureListener(new C20481j(taskCompletionSource, 0));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new C20480i(cancellationTokenSource));
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
