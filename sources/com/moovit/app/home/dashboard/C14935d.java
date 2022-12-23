package com.moovit.app.home.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p039c7.C1800c;
import p543hq.C17474b;
import p784rx.C19377c;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: com.moovit.app.home.dashboard.d */
public class C14935d extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f38201q = 0;

    /* renamed from: n */
    public final C1800c f38202n = new C1800c(this, 5);

    /* renamed from: o */
    public ListItemView f38203o;

    /* renamed from: p */
    public ListItemView f38204p;

    public C14935d() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        boolean z = false;
        UiUtils.m40238F(8, this.f38203o, this.f38204p);
        if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51296q0)).booleanValue()) {
            Context context = getContext();
            TrackingEvent trackingEvent = TrackingEvent.COMMUNITY_DASHBOARD_SECTION_DISPLAYED;
            if (context.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
                z = true;
            }
            if (!z) {
                C19377c.m46656a(getContext(), trackingEvent, new C14934c(this));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.community_section_fragment, viewGroup, false);
        this.f38203o = (ListItemView) inflate.findViewById(R.id.header);
        this.f38204p = (ListItemView) inflate.findViewById(R.id.item);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        ListItemView listItemView = this.f38203o;
        if (listItemView != null && listItemView.getVisibility() == 0) {
            mo46797j2(new C17474b(AnalyticsEventKey.COMMUNITY_SECTION_SHOWN));
        }
    }
}
