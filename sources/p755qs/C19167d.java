package p755qs;

import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.settings.privacy.PrivacySettingsActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import p543hq.C17474b;
import v40.C25750e;

/* renamed from: qs.d */
public final /* synthetic */ class C19167d implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ int f48748a;

    /* renamed from: b */
    public final /* synthetic */ MoovitActivity f48749b;

    public /* synthetic */ C19167d(MoovitActivity moovitActivity, int i) {
        this.f48748a = i;
        this.f48749b = moovitActivity;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        switch (this.f48748a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f48749b;
                int i = PrivacySettingsActivity.f38067l0;
                privacySettingsActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "background_location_tracking_clicked");
                aVar.mo49941i(AnalyticsAttributeKey.BACKGROUND_LOCATION_TRACKING_STATE, z);
                privacySettingsActivity.mo44545v2(aVar.mo49933a());
                return;
            default:
                PaymentAccountSettingsActivity paymentAccountSettingsActivity = (PaymentAccountSettingsActivity) this.f48749b;
                int i2 = PaymentAccountSettingsActivity.f64114l0;
                paymentAccountSettingsActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "marketing_consent_clicked");
                aVar2.mo49941i(AnalyticsAttributeKey.STATE, z);
                paymentAccountSettingsActivity.mo44545v2(aVar2.mo49933a());
                abstractListItemView.setTag(C25750e.view_tag_param1, Boolean.valueOf(z));
                return;
        }
    }
}
