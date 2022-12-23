package u40;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import p358af.C13437d;
import t40.C6590a;

/* renamed from: u40.b */
public final class C6699b implements Continuation<C6702e, C6590a> {
    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            C6702e eVar = (C6702e) task.getResult();
            if (eVar != null) {
                C6590a aVar = eVar.f20788i;
                if (aVar != null) {
                    return aVar;
                }
                throw new ApplicationBugException("LineGroupTripsResult is null!");
            }
            throw new ApplicationBugException("LineGroupTripsState is null!");
        }
        throw new RuntimeException(C13437d.m33705j(C6699b.class, new StringBuilder(), " Failed!"), task.getException());
    }
}
