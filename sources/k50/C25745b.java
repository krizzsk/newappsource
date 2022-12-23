package k50;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.MoovitApplication;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PersonalDetails;
import java.util.HashSet;
import p066e0.C4454r0;
import p528gz.C17272g;
import p528gz.C17290i;

/* renamed from: k50.b */
public final class C25745b extends C17290i {

    /* renamed from: c */
    public final PaymentAccount f64182c;

    public C25745b(MoovitApplication<?, ?, ?> moovitApplication, PaymentAccount paymentAccount) {
        super(moovitApplication);
        this.f64182c = paymentAccount;
    }

    /* renamed from: b */
    public final void onSuccess(C17272g.C17277e eVar) {
        super.onSuccess(eVar);
        PaymentAccount paymentAccount = this.f64182c;
        PersonalDetails personalDetails = paymentAccount.f64015d;
        HashSet<O> hashSet = null;
        if (!C13717b.m34258e(paymentAccount.f64017f)) {
            hashSet = C13720d.m34277g(paymentAccount.f64017f, (C13722f) null, new C4454r0(18));
        }
        eVar.mo49818a(C17272g.f44652l, personalDetails.f64038b);
        eVar.mo49818a(C17272g.f44653m, personalDetails.f64039c);
        eVar.mo49818a(C17272g.f44654n, personalDetails.f64040d);
        eVar.mo49818a(C17272g.f44656p, personalDetails.f64041e);
        eVar.mo49818a(C17272g.f44655o, Long.valueOf(personalDetails.f64043g));
        eVar.mo49818a(C17272g.f44650j, hashSet);
        eVar.mo49818a(C17272g.f44651k, paymentAccount.f64020i.f64113b);
    }
}
