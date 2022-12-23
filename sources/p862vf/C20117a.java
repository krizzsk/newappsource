package p862vf;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p102h0.C5021e;
import p886wf.C20295a;
import p886wf.C20296b;
import p886wf.C20297c;
import p886wf.C20299d;

/* renamed from: vf.a */
public final /* synthetic */ class C20117a implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C20118b f51036b;

    /* renamed from: c */
    public final /* synthetic */ Task f51037c;

    /* renamed from: d */
    public final /* synthetic */ Task f51038d;

    public /* synthetic */ C20117a(C20118b bVar, Task task, Task task2) {
        this.f51036b = bVar;
        this.f51037c = task;
        this.f51038d = task2;
    }

    public final Object then(Task task) {
        boolean z;
        C20118b bVar = this.f51036b;
        Task task2 = this.f51037c;
        Task task3 = this.f51038d;
        bVar.getClass();
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        C20299d dVar = (C20299d) task2.getResult();
        if (task3.isSuccessful()) {
            C20299d dVar2 = (C20299d) task3.getResult();
            if (dVar2 == null || !dVar.f51471c.equals(dVar2.f51471c)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return Tasks.forResult(Boolean.FALSE);
            }
        }
        C20297c cVar = bVar.f51042d;
        return Tasks.call(cVar.f51464a, new C20295a(0, cVar, dVar)).onSuccessTask(cVar.f51464a, new C20296b(cVar, dVar)).continueWith(bVar.f51040b, new C5021e(bVar, 0));
    }
}
