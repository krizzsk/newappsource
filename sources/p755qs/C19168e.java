package p755qs;

import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.settings.privacy.PrivacySettingsActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: qs.e */
public final /* synthetic */ class C19168e implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ PrivacySettingsActivity f48750a;

    public /* synthetic */ C19168e(PrivacySettingsActivity privacySettingsActivity) {
        this.f48750a = privacySettingsActivity;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        Boolean bool;
        PrivacySettingsActivity privacySettingsActivity = this.f48750a;
        int i = PrivacySettingsActivity.f38067l0;
        privacySettingsActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "personalized_ads_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.PERSONALIZED_ADS_STATE, z);
        privacySettingsActivity.mo44545v2(aVar.mo49933a());
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        abstractListItemView.setTag(R.id.view_tag_param1, bool);
    }
}
