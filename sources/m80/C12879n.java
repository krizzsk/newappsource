package m80;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import java.util.ArrayList;
import java.util.List;
import s60.C19437c;

/* renamed from: m80.n */
public final /* synthetic */ class C12879n implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C12887v f31880b;

    /* renamed from: c */
    public final /* synthetic */ List f31881c;

    public /* synthetic */ C12879n(C12887v vVar, ArrayList arrayList) {
        this.f31880b = vVar;
        this.f31881c = arrayList;
    }

    public final Object then(Task task) {
        C12887v vVar = this.f31880b;
        List list = this.f31881c;
        vVar.getClass();
        if (task.isSuccessful()) {
            return task;
        }
        return vVar.mo39733a(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C19437c(list));
    }
}
