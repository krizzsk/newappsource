package p531he;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: he.l */
public final class C17409l implements SuccessContinuation<Void, Boolean> {
    public final Task then(Object obj) throws Exception {
        Void voidR = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }
}
