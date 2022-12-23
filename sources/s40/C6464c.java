package s40;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import p358af.C13437d;
import r40.C6252c;

/* renamed from: s40.c */
public final class C6464c implements Continuation<C6465d, C6252c> {
    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            C6465d dVar = (C6465d) task.getResult();
            if (dVar != null) {
                C6252c cVar = dVar.f20199p;
                if (cVar != null) {
                    return cVar;
                }
                throw new ApplicationBugException("LineTripsResult is null!");
            }
            throw new ApplicationBugException("LineTripsState is null!");
        }
        throw new RuntimeException(C13437d.m33705j(C6464c.class, new StringBuilder(), " Failed!"), task.getException());
    }
}
