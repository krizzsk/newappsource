package p426ct;

import c00.C13732m;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.app.history.model.HistoryItem;
import java.util.Collection;
import java.util.List;
import p977zz.C20944i0;

/* renamed from: ct.d */
public final class C16495d implements Continuation<List<? extends HistoryItem>, C20944i0<Boolean, C13732m<HistoryItem>>> {

    /* renamed from: b */
    public final C13732m<HistoryItem> f43081b;

    public C16495d(C13732m<HistoryItem> mVar) {
        C21100e.m49373x(mVar, "items");
        this.f43081b = mVar;
    }

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            return new C20944i0(Boolean.valueOf(this.f43081b.mo40648f((Collection) task.getResult())), this.f43081b);
        }
        throw new RuntimeException("Dependency task failed!", task.getException());
    }
}
