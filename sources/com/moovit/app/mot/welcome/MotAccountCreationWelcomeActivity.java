package com.moovit.app.mot.welcome;

import android.content.Context;
import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.tranzmate.R;
import p242s1.C6333d0;
import p259t5.C6593c;
import z20.C20806a;

public class MotAccountCreationWelcomeActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f39100U = 0;

    /* renamed from: y2 */
    public static boolean m38725y2(Context context, PaymentAccount paymentAccount) {
        boolean z;
        boolean z2;
        TrackingEvent trackingEvent = TrackingEvent.MOT_ACCOUNT_CREATION_WELCOME;
        if (context.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (paymentAccount == null) {
            return true;
        }
        PaymentAccountContextStatus b = paymentAccount.mo83495b("IsraelMot");
        if (b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return PaymentAccountContextStatus.isStatusOf(b, PaymentAccountContextStatus.INCOMPLETE);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_account_creation_welcome_activity);
        findViewById(R.id.continue_button).setOnClickListener(new C6593c(this, 22));
        C6333d0.m15030r(findViewById(R.id.title), true);
        C20806a.C20807a aVar = new C20806a.C20807a("welcome_screen_view");
        aVar.mo52934b("mot", "feature");
        aVar.mo52934b("IsraelMot", "payment_context");
        MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
    }
}
