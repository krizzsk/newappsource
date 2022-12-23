package p531he;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C14450d;
import java.util.concurrent.Executor;
import p696oe.C18730b;

/* renamed from: he.j */
public final class C17407j implements SuccessContinuation<C18730b, Void> {

    /* renamed from: b */
    public final /* synthetic */ Executor f44824b;

    /* renamed from: c */
    public final /* synthetic */ String f44825c;

    /* renamed from: d */
    public final /* synthetic */ C17408k f44826d;

    public C17407j(C17408k kVar, Executor executor, String str) {
        this.f44826d = kVar;
        this.f44824b = executor;
        this.f44825c = str;
    }

    public final Task then(Object obj) throws Exception {
        String str = null;
        if (((C18730b) obj) == null) {
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = C14450d.m35976b(this.f44826d.f44832g);
        C17408k kVar = this.f44826d;
        C17397e0 e0Var = kVar.f44832g.f36491l;
        Executor executor = this.f44824b;
        if (kVar.f44831f) {
            str = this.f44825c;
        }
        taskArr[1] = e0Var.mo49873f(str, executor);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
