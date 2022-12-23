package p426ct;

import c00.C13717b;
import c00.C13732m;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.app.history.model.HistoryItem;
import java.util.List;
import p977zz.C20944i0;

/* renamed from: ct.a */
public final class C16490a implements Continuation<List<? extends HistoryItem>, C20944i0<Boolean, C13732m<HistoryItem>>> {

    /* renamed from: b */
    public final C13732m<HistoryItem> f43076b;

    public C16490a(C13732m<HistoryItem> mVar) {
        C21100e.m49373x(mVar, "items");
        this.f43076b = mVar;
    }

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            List list = (List) task.getResult();
            if (C13717b.m34258e(list)) {
                return new C20944i0(Boolean.FALSE, this.f43076b);
            }
            this.f43076b.mo40646d(list);
            return new C20944i0(Boolean.TRUE, this.f43076b);
        }
        throw new RuntimeException("Dependency task failed!", task.getException());
    }
}
