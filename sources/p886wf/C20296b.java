package p886wf;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: wf.b */
public final /* synthetic */ class C20296b implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C20297c f51459b;

    /* renamed from: c */
    public final /* synthetic */ boolean f51460c = true;

    /* renamed from: d */
    public final /* synthetic */ C20299d f51461d;

    public /* synthetic */ C20296b(C20297c cVar, C20299d dVar) {
        this.f51459b = cVar;
        this.f51461d = dVar;
    }

    public final Task then(Object obj) {
        C20297c cVar = this.f51459b;
        boolean z = this.f51460c;
        C20299d dVar = this.f51461d;
        Void voidR = (Void) obj;
        if (z) {
            synchronized (cVar) {
                cVar.f51466c = Tasks.forResult(dVar);
            }
        } else {
            cVar.getClass();
        }
        return Tasks.forResult(dVar);
    }
}
