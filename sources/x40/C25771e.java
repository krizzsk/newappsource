package x40;

import c70.C13751d;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.payment.account.actions.PaymentAccountActionActivity;
import je0.C23715f;
import mf0.C24362h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import z40.C25778b;
import z40.C25779c;

/* renamed from: x40.e */
public final class C25771e extends C20438i<C25778b, C25779c> {

    /* renamed from: b */
    public final /* synthetic */ PaymentAccountActionActivity f64286b;

    public C25771e(PaymentAccountActionActivity paymentAccountActionActivity) {
        this.f64286b = paymentAccountActionActivity;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C24362h.m61211f((C25778b) cVar, "request");
        this.f64286b.mo44506I1();
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C25779c cVar2 = (C25779c) gVar;
        C24362h.m61211f((C25778b) cVar, "request");
        C24362h.m61211f(cVar2, Payload.RESPONSE);
        PaymentAccountActionActivity paymentAccountActionActivity = this.f64286b;
        C23715f fVar = cVar2.f64303m;
        if (fVar != null) {
            int i = PaymentAccountActionActivity.f63869X;
            paymentAccountActionActivity.mo83343z2(fVar);
            return;
        }
        C24362h.m61217l("stepResult");
        throw null;
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C25778b bVar = (C25778b) cVar;
        PaymentAccountActionActivity paymentAccountActionActivity = this.f64286b;
        paymentAccountActionActivity.mo44530n2(C13751d.m34341b(paymentAccountActionActivity, (String) null, exc));
        return true;
    }
}
