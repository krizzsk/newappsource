package p664mu;

import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.C15682c;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import m30.C5679b;
import q00.C19047a;

/* renamed from: mu.g */
public final /* synthetic */ class C18448g implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f47026b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f47027c;

    /* renamed from: d */
    public final /* synthetic */ Object f47028d;

    public /* synthetic */ C18448g(C15682c cVar, Object obj, int i) {
        this.f47026b = i;
        this.f47027c = cVar;
        this.f47028d = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f47026b) {
            case 0:
                int i = C18451j.f47036q;
                ((C18451j) this.f47027c).mo50897p2((Trace) this.f47028d, (PaymentAccount) null);
                return;
            case 1:
                int i2 = C5679b.f18460q;
                ((C5679b) this.f47027c).mo21528j0((Bundle) this.f47028d, exc);
                return;
            default:
                int i3 = PaymentAccountPaymentMethodsFragment.f64045q;
                ((PaymentAccountPaymentMethodsFragment) this.f47027c).mo83528p2((C19047a) this.f47028d, (PaymentAccount) null);
                return;
        }
    }
}
