package com.moovit.app.home.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.C15584c;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.tranzmate.R;
import p001a0.C0017h;
import p450dt.C16703d;
import p543hq.C17474b;

/* renamed from: com.moovit.app.home.dashboard.a */
public abstract class C14925a<O extends TripPlannerOptions, LF extends C15578a, OF extends C15581b<O>> extends C16703d implements C15578a.C15580b, C15581b.C15582a, C15584c.C15585a {
    /* renamed from: D1 */
    public void mo44858D1(TripPlannerLocations tripPlannerLocations) {
    }

    /* renamed from: G1 */
    public void mo45128G1() {
    }

    /* renamed from: h1 */
    public final void mo45129h1() {
        if (getContext() != null) {
            C15578a r2 = mo45133r2();
            C15581b bVar = (C15581b) getChildFragmentManager().mo3923A("trip_plan_options_fragment_tag");
            if (r2 != null && bVar != null) {
                TripPlannerLocations s2 = r2.mo46532s2();
                O o = bVar.f40537p;
                boolean b = s2.mo24458b();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SEARCH_ROUTES_CLICKED);
                aVar.mo49941i(AnalyticsAttributeKey.IS_LOCATION_DESCRIPTORS_SET, b);
                mo46797j2(aVar.mo49933a());
                if (!b) {
                    r2.mo46531m2();
                } else {
                    mo45134s2(s2, o);
                }
            }
        }
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) mo46799l2(R.id.tool_bar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.trip_planner_dashboard_home_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        super.onViewCreated(view, bundle);
        boolean z3 = false;
        if (mo45133r2() == null) {
            z = true;
        } else {
            z = false;
        }
        if (((C15581b) getChildFragmentManager().mo3923A("trip_plan_options_fragment_tag")) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((C15584c) getChildFragmentManager().mo3923A("trip_plan_search_button_fragment_tag")) == null) {
            z3 = true;
        }
        if (z || z2) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
            if (z) {
                K.mo4041e(R.id.tool_bar, mo45131p2(), "trip_plan_locations_fragment_tag", 1);
            }
            if (z2) {
                K.mo4041e(R.id.app_bar, mo45132q2(), "trip_plan_options_fragment_tag", 1);
            }
            if (z3) {
                K.mo4041e(R.id.app_bar, new C15584c(), "trip_plan_search_button_fragment_tag", 1);
            }
            K.mo4040d();
        }
    }

    /* renamed from: p2 */
    public abstract LF mo45131p2();

    /* renamed from: q2 */
    public abstract OF mo45132q2();

    /* renamed from: r2 */
    public final LF mo45133r2() {
        return (C15578a) getChildFragmentManager().mo3923A("trip_plan_locations_fragment_tag");
    }

    /* renamed from: s2 */
    public abstract void mo45134s2(TripPlannerLocations tripPlannerLocations, O o);
}
