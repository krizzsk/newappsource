package com.moovit.payment.account.subscription;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import c20.C13744a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import com.moovit.util.InfoBoxData;
import com.moovit.util.PriceInfo;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import kotlin.Metadata;
import p216q1.C6133b;
import p242s1.C6333d0;
import p977zz.C20941h;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/payment/account/subscription/AccountSubscriptionDetailsActivity;", "Lcom/moovit/payment/MoovitPaymentActivity;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountSubscriptionDetailsActivity extends MoovitPaymentActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f64123U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.account_subscription_details_activity);
        PaymentAccountSubscription paymentAccountSubscription = (PaymentAccountSubscription) getIntent().getParcelableExtra("subscription");
        if (paymentAccountSubscription != null) {
            UiUtils.m40234B((TextView) findViewById(C25750e.title), paymentAccountSubscription.f64133c);
            UiUtils.m40234B((TextView) findViewById(C25750e.subtitle), paymentAccountSubscription.f64134d);
            PriceInfo priceInfo = paymentAccountSubscription.f64135e;
            if (priceInfo != null) {
                ((PriceView) findViewById(C25750e.price_view)).mo24682a(priceInfo.f23865b, priceInfo.f23866c, priceInfo.f23867d);
            }
            InfoBoxData infoBoxData = paymentAccountSubscription.f64137g;
            if (infoBoxData != null) {
                TextView textView = (TextView) findViewById(C25750e.info);
                C13744a.m34299a(textView, UiUtils.Edge.LEFT, infoBoxData.f23850b);
                textView.setText(C20964s0.m49099q(C20964s0.f52718a, infoBoxData.f23851c, infoBoxData.f23852d));
                C6333d0.m15032t(textView, C20941h.m49044g(infoBoxData.f23853e.getColorAttrId(), this));
            }
            FormatTextView formatTextView = (FormatTextView) findViewById(C25750e.valid_from_date_value);
            Long l = paymentAccountSubscription.f64139i;
            if (l != null) {
                formatTextView.setArguments(C7925b.m18022j(this, l.longValue()), C7925b.m18024l(this, l.longValue()));
                formatTextView.setVisibility(0);
            } else {
                formatTextView.setVisibility(8);
            }
            String str = paymentAccountSubscription.f64138h;
            if (str != null) {
                TextView textView2 = (TextView) findViewById(C25750e.description);
                textView2.setText(C6133b.m14694a(str));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            return;
        }
        throw new IllegalStateException("Did you use AccountSubscriptionDetailsActivity.createStartIntent(...)?");
    }
}
