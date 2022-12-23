package p589jq;

import android.widget.Toast;
import c00.C13723g;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.accessibility.UserAccessibilityPrefActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p543hq.C17474b;
import p593ju.C17929e;
import v90.C13187a;

/* renamed from: jq.g */
public final /* synthetic */ class C17915g implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ UserAccessibilityPrefActivity f45968a;

    /* renamed from: b */
    public final /* synthetic */ C17909a f45969b;

    /* renamed from: c */
    public final /* synthetic */ C13187a f45970c;

    public /* synthetic */ C17915g(UserAccessibilityPrefActivity userAccessibilityPrefActivity, C17909a aVar, C13187a aVar2) {
        this.f45968a = userAccessibilityPrefActivity;
        this.f45969b = aVar;
        this.f45970c = aVar2;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        UserAccessibilityPrefActivity userAccessibilityPrefActivity = this.f45968a;
        C17909a aVar = this.f45969b;
        C13187a aVar2 = this.f45970c;
        int i = UserAccessibilityPrefActivity.f37419X;
        userAccessibilityPrefActivity.getClass();
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "accessibility_hide_micro_mobility__clicked");
        aVar3.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
        userAccessibilityPrefActivity.mo44545v2(aVar3.mo49933a());
        if (z) {
            List<TripPlannerTransportType> list = aVar.f45952c;
            HashSet hashSet = new HashSet(aVar2.mo40063d());
            Objects.requireNonNull(list);
            C13723g.m34285f(hashSet, (ArrayList) null, new C17916h(list, 0));
            aVar2.f32743d.mo49544c(hashSet);
            int a = userAccessibilityPrefActivity.f37420U.mo50470a();
            C17929e eVar = userAccessibilityPrefActivity.f37420U;
            eVar.f45995b.mo49545d(eVar.f45994a, Integer.valueOf(a & (~aVar.f45953d)));
            Toast.makeText(userAccessibilityPrefActivity, R.string.settings_accessibility_mm_confirm, 0).show();
            return;
        }
        HashSet hashSet2 = new HashSet(aVar2.mo40063d());
        hashSet2.addAll(aVar.f45952c);
        aVar2.f32743d.mo49544c(hashSet2);
        int a2 = userAccessibilityPrefActivity.f37420U.mo50470a();
        C17929e eVar2 = userAccessibilityPrefActivity.f37420U;
        eVar2.f45995b.mo49545d(eVar2.f45994a, Integer.valueOf(a2 | aVar.f45953d));
    }
}
