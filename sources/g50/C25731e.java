package g50;

import android.net.Uri;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.ticketing.purchase.filter.C7688a;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import p543hq.C17474b;
import p977zz.C20927a0;
import p977zz.C20935e;

/* renamed from: g50.e */
public final /* synthetic */ class C25731e implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f64165b;

    /* renamed from: c */
    public final /* synthetic */ Object f64166c;

    public /* synthetic */ C25731e(Object obj, int i) {
        this.f64165b = i;
        this.f64166c = obj;
    }

    public final void invoke(Object obj) {
        switch (this.f64165b) {
            case 0:
                PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = (PaymentAccountEditProfileActivity) this.f64166c;
                int i = PaymentAccountEditProfileActivity.f64099l0;
                paymentAccountEditProfileActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_edit_profile_support_clicked");
                paymentAccountEditProfileActivity.mo44545v2(aVar.mo49933a());
                C20927a0.m49017l(paymentAccountEditProfileActivity, C20927a0.m49014i(Uri.parse((String) obj)));
                return;
            default:
                C7688a.m17558p2((C7688a) this.f64166c, (PurchaseFilter) obj);
                return;
        }
    }
}
