package p572iw;

import android.content.Intent;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import p543hq.C17474b;
import p664mu.C18462q;

/* renamed from: iw.g */
public final /* synthetic */ class C17665g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C17666h f45399b;

    /* renamed from: c */
    public final /* synthetic */ boolean f45400c;

    /* renamed from: d */
    public final /* synthetic */ PaymentAccount f45401d;

    public /* synthetic */ C17665g(C17666h hVar, boolean z, PaymentAccount paymentAccount) {
        this.f45399b = hVar;
        this.f45400c = z;
        this.f45401d = paymentAccount;
    }

    public final void onClick(View view) {
        C17666h hVar = this.f45399b;
        boolean z = this.f45400c;
        PaymentAccount paymentAccount = this.f45401d;
        int i = C17666h.f45402O;
        hVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_routes_banner_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, z);
        hVar.mo46797j2(aVar.mo49933a());
        if (z) {
            C18462q.m45321a(hVar.f40822c);
        } else if (MotAccountCreationWelcomeActivity.m38725y2(hVar.requireContext(), paymentAccount)) {
            hVar.startActivity(new Intent(hVar.requireContext(), MotAccountCreationWelcomeActivity.class));
        } else {
            hVar.startActivity(PaymentRegistrationActivity.m41717A2(hVar.requireContext(), PaymentRegistrationType.PURCHASE, "IsraelMot"));
        }
    }
}
