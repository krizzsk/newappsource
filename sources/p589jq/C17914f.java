package p589jq;

import android.widget.Toast;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.accessibility.UserAccessibilityPrefActivity;
import com.moovit.app.suggestedroutes.TripPlanWalkingPrefActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.tranzmate.R;
import p543hq.C17474b;
import v90.C13187a;

/* renamed from: jq.f */
public final /* synthetic */ class C17914f implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ int f45965a;

    /* renamed from: b */
    public final /* synthetic */ MoovitAppActivity f45966b;

    /* renamed from: c */
    public final /* synthetic */ Object f45967c;

    public /* synthetic */ C17914f(MoovitAppActivity moovitAppActivity, Object obj, int i) {
        this.f45965a = i;
        this.f45966b = moovitAppActivity;
        this.f45967c = obj;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        switch (this.f45965a) {
            case 0:
                UserAccessibilityPrefActivity userAccessibilityPrefActivity = (UserAccessibilityPrefActivity) this.f45966b;
                C17909a aVar = (C17909a) this.f45967c;
                int i = UserAccessibilityPrefActivity.f37419X;
                userAccessibilityPrefActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "accessibility_accessibile_routes_clicked");
                aVar2.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
                userAccessibilityPrefActivity.mo44545v2(aVar2.mo49933a());
                aVar.f45954e.mo49544c(new AccessibilityPersonalPrefs(z, aVar.mo50463a().f37353c));
                if (z) {
                    Toast.makeText(userAccessibilityPrefActivity, R.string.settings_accessibility_routes_confirm, 0).show();
                    return;
                }
                return;
            default:
                TripPlanWalkingPrefActivity tripPlanWalkingPrefActivity = (TripPlanWalkingPrefActivity) this.f45966b;
                C13187a aVar3 = (C13187a) this.f45967c;
                int i2 = TripPlanWalkingPrefActivity.f39818Z;
                tripPlanWalkingPrefActivity.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "trip_plan_slow_walk_options_clicked");
                aVar4.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
                tripPlanWalkingPrefActivity.mo44545v2(aVar4.mo49933a());
                aVar3.f32747h.mo49544c(new TripPlannerPersonalPrefs(z, aVar3.mo40060a().f23794c));
                Toast.makeText(tripPlanWalkingPrefActivity, R.string.walk_options_speed_success_message, 0).show();
                return;
        }
    }
}
