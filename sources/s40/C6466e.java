package s40;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: s40.e */
public abstract class C6466e implements Continuation<C6465d, C6465d> {
    /* renamed from: a */
    public abstract void mo22585a(C6465d dVar) throws Exception;

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            C6465d dVar = (C6465d) task.getResult();
            if (dVar.f20199p == null) {
                mo22585a(dVar);
            }
            return dVar;
        }
        throw new RuntimeException(getClass().getSimpleName() + " Failed!", task.getException());
    }
}
