package g50;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13751d;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.moovit.payment.account.model.PaymentAccount;
import h60.C17368x;
import java.util.List;
import p589jq.C17917i;
import p638lr.C18267n;

/* renamed from: g50.c */
public final /* synthetic */ class C25729c implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C25730d f64160b;

    /* renamed from: c */
    public final /* synthetic */ Task f64161c;

    /* renamed from: d */
    public final /* synthetic */ Task f64162d;

    public /* synthetic */ C25729c(C25730d dVar, Task task, Task task2) {
        this.f64160b = dVar;
        this.f64161c = task;
        this.f64162d = task2;
    }

    public final void onSuccess(Object obj) {
        C25730d dVar = this.f64160b;
        Task task = this.f64161c;
        Task task2 = this.f64162d;
        List list = (List) obj;
        int i = C25730d.f64163o;
        dVar.getClass();
        PaymentAccount paymentAccount = (PaymentAccount) task.getResult();
        C17368x xVar = (C17368x) task2.getResult();
        if (paymentAccount == null || xVar == null || C13717b.m34258e(xVar.f44760m)) {
            dVar.mo46795h2(C13751d.m34341b(dVar.requireContext(), "getProfilesErrorTag", (Exception) null));
            return;
        }
        dVar.f64164n.setAdapter(new C25732f(C13723g.m34282c(xVar.f44760m, new C17917i(C13720d.m34277g(paymentAccount.f64017f, (C13722f) null, new C18267n(17)), 2)), dVar));
    }
}
