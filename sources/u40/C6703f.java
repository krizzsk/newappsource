package u40;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: u40.f */
public abstract class C6703f implements Continuation<C6702e, C6702e> {
    /* renamed from: a */
    public abstract void mo22871a(C6702e eVar) throws Exception;

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            C6702e eVar = (C6702e) task.getResult();
            if (eVar.f20788i == null) {
                mo22871a(eVar);
            }
            return eVar;
        }
        throw new RuntimeException(getClass().getSimpleName() + " Failed!", task.getException());
    }
}
