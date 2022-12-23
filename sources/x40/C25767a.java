package x40;

import c70.C13752e;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.account.actions.PaymentAccountActionActivity;
import com.moovit.request.RequestOptions;
import kotlin.Metadata;
import mf0.C24362h;
import p057d3.C4339c;
import p543hq.C17474b;
import z40.C25780d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lx40/a;", "Lcom/moovit/c;", "Lcom/moovit/payment/account/actions/PaymentAccountActionActivity;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: x40.a */
public abstract class C25767a extends C15682c<PaymentAccountActionActivity> {
    public C25767a() {
        super(PaymentAccountActionActivity.class);
    }

    /* renamed from: m2 */
    public abstract String mo83334m2();

    /* renamed from: n2 */
    public abstract String mo83335n2();

    /* renamed from: o2 */
    public final void mo83596o2(C4339c cVar) {
        PaymentAccountActionActivity paymentAccountActionActivity = (PaymentAccountActionActivity) this.f40822c;
        paymentAccountActionActivity.getClass();
        C13752e x1 = paymentAccountActionActivity.mo44548x1();
        C24362h.m61210e(x1, "requestContext");
        C25780d dVar = new C25780d(x1, cVar);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        paymentAccountActionActivity.mo44527k2(C25780d.class.getName(), dVar, requestOptions, new C25770d(paymentAccountActionActivity, cVar));
    }

    public final void onStart() {
        super.onStart();
        ((PaymentAccountActionActivity) this.f40822c).setTitle(mo83335n2());
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "account_actions_step_impression");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, mo83334m2());
        mo46797j2(aVar.mo49933a());
    }
}
