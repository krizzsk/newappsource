package p531he;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* renamed from: he.g */
public final class C17400g implements Continuation<Void, Object> {

    /* renamed from: b */
    public final /* synthetic */ Callable f44818b;

    public C17400g(Callable callable) {
        this.f44818b = callable;
    }

    public final Object then(Task<Void> task) throws Exception {
        return this.f44818b.call();
    }
}
