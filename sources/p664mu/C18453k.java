package p664mu;

import android.content.Intent;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.view.PromotionBannerView;
import p543hq.C17474b;

/* renamed from: mu.k */
public final class C18453k implements PromotionBannerView.C7926a {

    /* renamed from: a */
    public final /* synthetic */ PaymentAccount f47041a;

    /* renamed from: b */
    public final /* synthetic */ C18451j f47042b;

    public C18453k(C18451j jVar, PaymentAccount paymentAccount) {
        this.f47042b = jVar;
        this.f47041a = paymentAccount;
    }

    /* renamed from: a */
    public final void mo24257a() {
        C18451j jVar = this.f47042b;
        int i = C18451j.f47036q;
        jVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_banner_dismiss");
        jVar.mo46797j2(aVar.mo49933a());
    }

    /* renamed from: b */
    public final void mo24258b() {
        C18451j jVar = this.f47042b;
        PaymentAccount paymentAccount = this.f47041a;
        int i = C18451j.f47036q;
        jVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_join_service_clicked");
        jVar.mo46797j2(aVar.mo49933a());
        if (MotAccountCreationWelcomeActivity.m38725y2(jVar.requireContext(), paymentAccount)) {
            jVar.startActivity(new Intent(jVar.requireContext(), MotAccountCreationWelcomeActivity.class));
        } else {
            jVar.startActivity(PaymentRegistrationActivity.m41717A2(jVar.requireContext(), PaymentRegistrationType.PURCHASE, "IsraelMot"));
        }
    }
}
