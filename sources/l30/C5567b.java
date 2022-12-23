package l30;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import java.util.Set;

/* renamed from: l30.b */
public final /* synthetic */ class C5567b implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C5577i f18191b;

    /* renamed from: c */
    public final /* synthetic */ String f18192c;

    /* renamed from: d */
    public final /* synthetic */ String f18193d;

    /* renamed from: e */
    public final /* synthetic */ Set f18194e;

    public /* synthetic */ C5567b(C5577i iVar, String str, String str2, Set set) {
        this.f18191b = iVar;
        this.f18192c = str;
        this.f18193d = str2;
        this.f18194e = set;
    }

    public final Object then(Task task) {
        C5577i iVar = this.f18191b;
        String str = this.f18192c;
        String str2 = this.f18193d;
        Set set = this.f18194e;
        iVar.getClass();
        if (task.isSuccessful()) {
            return task;
        }
        return iVar.mo21402b().onSuccessTask(MoovitExecutors.COMPUTATION, new C5571d(str, str2, set));
    }
}
