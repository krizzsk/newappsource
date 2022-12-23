package v80;

import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1019k0;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l30.C5575g;
import m80.C12887v;
import p009a8.C0113m;
import p054d0.C4314v;
import p304x.C7065j0;
import p80.C12991b;

/* renamed from: v80.d */
public final class C13186d extends C1019k0 {

    /* renamed from: b */
    public final C1001d0 f32739b;

    public C13186d(C1001d0 d0Var) {
        C21100e.m49373x(d0Var, "savedState");
        this.f32739b = d0Var;
    }

    /* renamed from: a */
    public final Task<String> mo40059a(C12991b bVar, PurchaseStepResult purchaseStepResult) {
        C12887v b = C12887v.m32668b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return Tasks.call(executorService, new C0113m(b, 3)).onSuccessTask(executorService, new C7065j0(4, bVar, purchaseStepResult)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C5575g(1)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C4314v(this, 19));
    }
}
