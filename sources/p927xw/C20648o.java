package p927xw;

import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.app.tod.C15462b;
import com.moovit.payment.account.model.PaymentAccount;
import g50.C25730d;

/* renamed from: xw.o */
public final /* synthetic */ class C20648o implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f52218b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f52219c;

    public /* synthetic */ C20648o(C15682c cVar, int i) {
        this.f52218b = i;
        this.f52219c = cVar;
    }

    public final void onFailure(Exception exc) {
        switch (this.f52218b) {
            case 0:
                int i = C15462b.f40053x;
                ((C15462b) this.f52219c).mo46205p2((PaymentAccount) null);
                return;
            default:
                C25730d dVar = (C25730d) this.f52219c;
                int i2 = C25730d.f64163o;
                dVar.mo46795h2(C13751d.m34341b(dVar.requireContext(), "getProfilesErrorTag", exc));
                return;
        }
    }
}
