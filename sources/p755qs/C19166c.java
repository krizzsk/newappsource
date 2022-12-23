package p755qs;

import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.settings.privacy.PrivacySettingsActivity;
import com.moovit.design.view.list.AbstractListItemView;
import p543hq.C17474b;

/* renamed from: qs.c */
public final /* synthetic */ class C19166c implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ PrivacySettingsActivity f48747a;

    public /* synthetic */ C19166c(PrivacySettingsActivity privacySettingsActivity) {
        this.f48747a = privacySettingsActivity;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        PrivacySettingsActivity privacySettingsActivity = this.f48747a;
        int i = PrivacySettingsActivity.f38067l0;
        privacySettingsActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "sell_data_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.SELLING_DATA_STATE, z);
        privacySettingsActivity.mo44545v2(aVar.mo49933a());
    }
}
