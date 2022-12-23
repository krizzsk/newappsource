package p531he;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* renamed from: he.h0 */
public final class C17403h0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Callable f44820b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f44821c;

    /* renamed from: he.h0$a */
    public class C17404a implements Continuation<Object, Void> {
        public C17404a() {
        }

        public final Object then(Task task) throws Exception {
            if (task.isSuccessful()) {
                C17403h0.this.f44821c.setResult(task.getResult());
                return null;
            }
            C17403h0.this.f44821c.setException(task.getException());
            return null;
        }
    }

    public C17403h0(C17415r rVar, TaskCompletionSource taskCompletionSource) {
        this.f44820b = rVar;
        this.f44821c = taskCompletionSource;
    }

    public final void run() {
        try {
            ((Task) this.f44820b.call()).continueWith(new C17404a());
        } catch (Exception e) {
            this.f44821c.setException(e);
        }
    }
}
