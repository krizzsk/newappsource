package com.moovit.payment.account.subscription;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import androidx.recyclerview.widget.RecyclerView;
import c20.C13744a;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.moovit.commons.utils.UiUtils;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscriptionProgress;
import com.moovit.util.InfoBoxData;
import com.moovit.util.PriceInfo;
import com.moovit.view.PriceView;
import ja0.C12791b;
import ja0.C12793c;
import ja0.C12797f;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p242s1.C6333d0;
import p310x5.C7158c;
import p478ex.C16888a;
import p977zz.C20941h;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/payment/account/subscription/AccountMySubscriptionActivity;", "Lcom/moovit/payment/MoovitPaymentActivity;", "<init>", "()V", "a", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountMySubscriptionActivity extends MoovitPaymentActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f64120X = 0;

    /* renamed from: U */
    public final C1021l0 f64121U = new C1021l0(C24365j.m61219a(AccountSubscriptionViewModel.class), new C25712x1568e34d(this), new C25711x1568e34c(this), new C25713x1568e34e(this));

    /* renamed from: com.moovit.payment.account.subscription.AccountMySubscriptionActivity$a */
    public final class C25710a extends C12791b<PaymentAccountSubscription> {
        public C25710a(List<PaymentAccountSubscription> list) {
            super(list, C25751f.account_my_subscriptions_item, (C12791b.C12792a) null);
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            int i;
            PaymentAccountSubscription paymentAccountSubscription = (PaymentAccountSubscription) obj;
            C24362h.m61211f(fVar, "holder");
            C24362h.m61211f(paymentAccountSubscription, "item");
            UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.title), paymentAccountSubscription.f64133c);
            UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.subtitle), paymentAccountSubscription.f64134d);
            PriceInfo priceInfo = paymentAccountSubscription.f64135e;
            if (priceInfo != null) {
                ((PriceView) fVar.mo39639f(C25750e.price_view)).mo24682a(priceInfo.f23865b, priceInfo.f23866c, priceInfo.f23867d);
            }
            TextView textView = (TextView) fVar.mo39639f(C25750e.days_counter);
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) fVar.mo39639f(C25750e.progress_bar);
            PaymentAccountSubscriptionProgress paymentAccountSubscriptionProgress = paymentAccountSubscription.f64136f;
            if (paymentAccountSubscriptionProgress != null) {
                textView.setText(paymentAccountSubscriptionProgress.f64140b);
                linearProgressIndicator.setProgress(paymentAccountSubscriptionProgress.f64142d);
                i = 0;
            } else {
                i = 8;
            }
            UiUtils.m40238F(i, textView, linearProgressIndicator);
            InfoBoxData infoBoxData = paymentAccountSubscription.f64137g;
            if (infoBoxData != null) {
                TextView textView2 = (TextView) fVar.mo39639f(C25750e.info);
                C13744a.m34299a(textView2, UiUtils.Edge.LEFT, infoBoxData.f23850b);
                textView2.setText(C20964s0.m49099q(C20964s0.f52718a, infoBoxData.f23851c, infoBoxData.f23852d));
                C6333d0.m15032t(textView2, C20941h.m49044g(infoBoxData.f23853e.getColorAttrId(), fVar.mo39638e()));
            }
            ((Button) fVar.mo39639f(C25750e.show_more_btn)).setOnClickListener(new C7158c(6, this, paymentAccountSubscription));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.account_my_subscriptions_activity);
        ((RecyclerView) findViewById(C25750e.recycler_view)).setAdapter(new C12793c());
        ((AccountSubscriptionViewModel) this.f64121U.getValue()).f64130e.observe(this, new C16888a(new AccountMySubscriptionActivity$onReady$1(this), 3));
    }
}
