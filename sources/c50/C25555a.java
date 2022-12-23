package c50;

import android.content.Context;
import c00.C13722f;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.external.ExternalPaymentAccountsFragment;
import com.moovit.payment.account.model.PaymentAccountContext;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import p810sz.C19617r;
import q80.C13036y;
import r80.C13048b;

/* renamed from: c50.a */
public final /* synthetic */ class C25555a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f63815b;

    /* renamed from: c */
    public final /* synthetic */ Context f63816c;

    public /* synthetic */ C25555a(Context context, int i) {
        this.f63815b = i;
        this.f63816c = context;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean z;
        switch (this.f63815b) {
            case 0:
                PaymentAccountContext paymentAccountContext = (PaymentAccountContext) obj;
                ExternalPaymentAccountHelper externalPaymentAccountHelper = (ExternalPaymentAccountHelper) ExternalPaymentAccountsFragment.f63974r.getOrDefault(paymentAccountContext.f64030b, null);
                if (externalPaymentAccountHelper == null || !externalPaymentAccountHelper.mo44688M1(paymentAccountContext.f64031c)) {
                    return false;
                }
                return true;
            default:
                Context context = this.f63816c;
                SuggestedTicketFare suggestedTicketFare = (SuggestedTicketFare) obj;
                C19617r rVar = C13036y.f32248a;
                if (suggestedTicketFare.f23320i != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || Boolean.TRUE.equals(C13048b.f32272c.isValid(context, suggestedTicketFare))) {
                    return true;
                }
                return false;
        }
    }
}
