package p450dt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.appsflyer.ServerParameters;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.home.HomeActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.genies.Genie;
import m10.C18316a;
import p269u2.C6677a;
import p503fy.C17127b;
import p543hq.C17474b;
import p543hq.C17476c;
import p567iq.C17635b;
import p977zz.C20934d0;

/* renamed from: dt.d */
public abstract class C16703d extends C15682c<HomeActivity> {

    /* renamed from: n */
    public AnalyticsFlowKey f43498n;

    public C16703d() {
        super(HomeActivity.class);
    }

    /* renamed from: M1 */
    public final AnalyticsFlowKey mo46778M1() {
        return this.f43498n;
    }

    /* renamed from: j2 */
    public final void mo46797j2(C17474b bVar) {
        AnalyticsFlowKey analyticsFlowKey;
        Context context = getContext();
        if (context != null && (analyticsFlowKey = this.f43498n) != null) {
            C6677a aVar = C17635b.m43779f(context).f50173c;
            getContext();
            aVar.mo22850h(analyticsFlowKey, bVar);
        }
    }

    /* renamed from: m2 */
    public C17474b.C17475a mo49408m2(HomeActivity homeActivity) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_ACTIVITY);
        aVar.mo49941i(AnalyticsAttributeKey.GPS_STATUS, C20934d0.m49033d(homeActivity, "gps", ServerParameters.NETWORK));
        aVar.mo49935c(AnalyticsAttributeKey.RED_BADGE_COUNT, C17127b.m43096b(homeActivity).mo49718c());
        return aVar;
    }

    /* renamed from: n2 */
    public abstract Toolbar mo45130n2();

    /* renamed from: o2 */
    public boolean mo49409o2(Uri uri) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43498n = ((C17476c) C17635b.m43779f(requireContext()).f50173c.f20758b).mo49947a(getClass());
    }

    public void onPause() {
        super.onPause();
        Context requireContext = requireContext();
        AnalyticsFlowKey analyticsFlowKey = this.f43498n;
        if (analyticsFlowKey != null) {
            C6677a aVar = C17635b.m43779f(requireContext).f50173c;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CLOSE_ACTIVITY);
            aVar2.mo49941i(AnalyticsAttributeKey.GPS_STATUS, C20934d0.m49033d(requireContext, "gps", ServerParameters.NETWORK));
            aVar.mo22850h(analyticsFlowKey, aVar2.mo49933a());
            aVar.mo22847b(requireContext, analyticsFlowKey, true);
        }
    }

    public void onResume() {
        Toolbar n2;
        super.onResume();
        HomeActivity homeActivity = (HomeActivity) this.f40822c;
        homeActivity.setSupportActionBar(mo45130n2());
        AnalyticsFlowKey analyticsFlowKey = this.f43498n;
        if (analyticsFlowKey != null) {
            C6677a aVar = C17635b.m43779f(homeActivity).f50173c;
            aVar.mo22849g(homeActivity, analyticsFlowKey);
            aVar.mo22850h(analyticsFlowKey, mo49408m2(homeActivity).mo49933a());
        }
        Context context = getContext();
        if (context != null && C17127b.m43096b(context).mo49720e() && (n2 = mo45130n2()) != null) {
            int childCount = n2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = n2.getChildAt(i);
                if (childAt instanceof ImageView) {
                    Drawable drawable = ((ImageView) childAt).getDrawable();
                    if ((drawable instanceof C16700a) && ((C16700a) drawable).f43492p) {
                        C18316a.f46708c.mo50768b(Genie.DRAWER_BADGE, childAt, this.f40822c, (int) UiUtils.m40246e(getContext(), 7.0f), -((int) UiUtils.m40246e(getContext(), 14.0f)));
                        return;
                    }
                }
            }
        }
    }
}
