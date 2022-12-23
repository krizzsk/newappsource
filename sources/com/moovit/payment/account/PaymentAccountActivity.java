package com.moovit.payment.account;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.model.PaymentAccount;
import p451du.C16705b;
import p543hq.C17474b;
import v40.C25751f;
import w40.C25761d;

public class PaymentAccountActivity extends MoovitPaymentActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f63829X = 0;

    /* renamed from: U */
    public final C25601a f63830U = new C25601a();

    /* renamed from: com.moovit.payment.account.PaymentAccountActivity$a */
    public class C25601a extends BroadcastReceiver {
        public C25601a() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountActivity paymentAccountActivity = PaymentAccountActivity.this;
            int i = PaymentAccountActivity.f63829X;
            paymentAccountActivity.mo44543u2((CharSequence) null);
            C25761d.m64299a().mo83587b(true).addOnCompleteListener((Activity) paymentAccountActivity, new C16705b(paymentAccountActivity, 3));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_activity);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        C25761d.m64300h(this, this.f63830U);
        mo44543u2((CharSequence) null);
        C25761d.m64299a().mo83587b(true).addOnCompleteListener((Activity) this, new C16705b(this, 3));
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C25761d.m64301k(this, this.f63830U);
    }

    /* renamed from: y2 */
    public final void mo83327y2(PaymentAccount paymentAccount, String str) {
        Integer num;
        if (paymentAccount == null || C13717b.m34258e(paymentAccount.f64017f)) {
            num = null;
        } else {
            num = Integer.valueOf(paymentAccount.f64017f.size());
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.STATE, str);
        aVar.mo49944l(AnalyticsAttributeKey.COUNT, num);
        mo44545v2(aVar.mo49933a());
    }
}
