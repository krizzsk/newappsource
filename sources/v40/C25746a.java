package v40;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.payment.account.model.PaymentAccount;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25189k;
import wh0.C25192l;

/* renamed from: v40.a */
public final class C25746a implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C25189k<PaymentAccount> f64183b;

    public C25746a(C25192l lVar) {
        this.f64183b = lVar;
    }

    public final void onFailure(Exception exc) {
        C24362h.m61211f(exc, "e");
        this.f64183b.resumeWith(C17885a.m44400G(exc));
    }
}
