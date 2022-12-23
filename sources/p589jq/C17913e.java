package p589jq;

import android.widget.Toast;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.accessibility.UserAccessibilityPrefActivity;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import java.util.HashSet;
import p543hq.C17474b;
import v90.C13187a;

/* renamed from: jq.e */
public final /* synthetic */ class C17913e implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ int f45962a;

    /* renamed from: b */
    public final /* synthetic */ Object f45963b;

    /* renamed from: c */
    public final /* synthetic */ Object f45964c;

    public /* synthetic */ C17913e(int i, Object obj, Object obj2) {
        this.f45962a = i;
        this.f45963b = obj;
        this.f45964c = obj2;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        switch (this.f45962a) {
            case 0:
                UserAccessibilityPrefActivity userAccessibilityPrefActivity = (UserAccessibilityPrefActivity) this.f45963b;
                C17909a aVar = (C17909a) this.f45964c;
                int i = UserAccessibilityPrefActivity.f37419X;
                userAccessibilityPrefActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "accessibility_settings_enable_train_assistance_clicked");
                aVar2.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
                userAccessibilityPrefActivity.mo44545v2(aVar2.mo49933a());
                aVar.f45954e.mo49544c(new AccessibilityPersonalPrefs(aVar.mo50463a().f37352b, z));
                if (z) {
                    Toast.makeText(userAccessibilityPrefActivity, R.string.settings_accessibility_train_assistance_success, 0).show();
                    return;
                }
                return;
            default:
                C13187a aVar3 = (C13187a) this.f45963b;
                TripPlannerTransportTypeInfo tripPlannerTransportTypeInfo = (TripPlannerTransportTypeInfo) this.f45964c;
                int i2 = TripPlanOptionsActivity.f39809o0;
                if (z) {
                    TripPlannerTransportType tripPlannerTransportType = tripPlannerTransportTypeInfo.f23802b;
                    aVar3.getClass();
                    HashSet hashSet = new HashSet(aVar3.f32743d.mo49542a());
                    hashSet.add(tripPlannerTransportType);
                    aVar3.f32743d.mo49544c(hashSet);
                    return;
                }
                TripPlannerTransportType tripPlannerTransportType2 = tripPlannerTransportTypeInfo.f23802b;
                aVar3.getClass();
                HashSet hashSet2 = new HashSet(aVar3.f32743d.mo49542a());
                hashSet2.remove(tripPlannerTransportType2);
                aVar3.f32743d.mo49544c(hashSet2);
                return;
        }
    }
}
