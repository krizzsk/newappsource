package p435de;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: de.d */
public final class C16594d implements Continuation<Void, Object> {
    public final Object then(Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        task.getException();
        return null;
    }
}
