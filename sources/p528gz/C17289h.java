package p528gz;

import ce0.C21100e;
import com.braze.Braze;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p304x.C7038d0;
import p528gz.C17272g;

/* renamed from: gz.h */
public abstract class C17289h implements OnSuccessListener<C17272g.C17277e> {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f44667b;

    public C17289h(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f44667b = moovitApplication;
    }

    /* renamed from: a */
    public final void mo49820a() {
        C17269d a = C17269d.m43283a();
        if (a.f44638b) {
            C17272g gVar = a.f44640d;
            gVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Braze.getInstance(gVar.f44658a).getCurrentUser(new C17271f(taskCompletionSource));
            Task onSuccessTask = taskCompletionSource.getTask().onSuccessTask(MoovitExecutors.COMPUTATION, new C7038d0(gVar, 16));
            ExecutorService executorService = MoovitExecutors.SINGLE;
            onSuccessTask.addOnSuccessListener((Executor) executorService, this).addOnSuccessListener((Executor) executorService, new C17270e());
        }
    }
}
