package com.moovit.app.home.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerActivity;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerParams;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import java.util.Set;
import l40.C5621i;
import p104h2.C5037a;
import p117i2.C5260b;
import p398bv.C13692b;
import p398bv.C13695d;
import p543hq.C17474b;
import p567iq.C17635b;
import p824tp.C19728f;
import s00.C19391d;

/* renamed from: com.moovit.app.home.dashboard.r */
public class C14957r extends C14925a<OfflineTripPlannerOptions, C13695d, C13692b> implements C5037a.C5038a<C5621i.C5623b> {
    /* renamed from: D1 */
    public final void mo44858D1(TripPlannerLocations tripPlannerLocations) {
        mo45162t2();
    }

    /* renamed from: G1 */
    public final void mo45128G1() {
        mo45162t2();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "GTFS_CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo45162t2();
    }

    public final C5260b<C5621i.C5623b> onCreateLoader(int i, Bundle bundle) {
        C17635b f = C17635b.m43779f(getContext());
        f.getClass();
        C19391d c = f.mo52085c(((C19728f) mo46776J1("METRO_CONTEXT")).f50165a);
        C5621i.C5623b bVar = new C5621i.C5623b(((C13695d) mo45133r2()).mo46532s2(), ((OfflineTripPlannerOptions) ((C13692b) ((C15581b) getChildFragmentManager().mo3923A("trip_plan_options_fragment_tag"))).f40537p).f39163b);
        return new C5621i(getContext(), (GtfsConfiguration) mo46776J1("GTFS_CONFIGURATION"), c, bVar);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(C5260b bVar, Object obj) {
        C5621i.C5623b bVar2 = (C5621i.C5623b) obj;
    }

    public final void onLoaderReset(C5260b<C5621i.C5623b> bVar) {
    }

    /* renamed from: p2 */
    public final C15578a mo45131p2() {
        return C13695d.m34207B2((LocationDescriptor) null, (LocationDescriptor) null);
    }

    /* renamed from: q2 */
    public final C15581b mo45132q2() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("options", (Parcelable) null);
        C13692b bVar = new C13692b();
        bVar.setArguments(bundle);
        return bVar;
    }

    /* renamed from: s2 */
    public final void mo45134s2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        mo46797j2(new C17474b(AnalyticsEventKey.SEARCH_ROUTES_CLICKED));
        OfflineTripPlannerParams offlineTripPlannerParams = new OfflineTripPlannerParams(tripPlannerLocations.f23786b, tripPlannerLocations.f23787c, ((OfflineTripPlannerOptions) tripPlannerOptions).f39163b);
        Context context = getContext();
        int i = OfflineTripPlannerActivity.f39160r0;
        startActivity(TripPlannerActivity.m39768z2(context, OfflineTripPlannerActivity.class, offlineTripPlannerParams, true));
    }

    /* renamed from: t2 */
    public final void mo45162t2() {
        C15578a r2;
        if (getView() != null && mo46775H1() && (r2 = mo45133r2()) != null) {
            TripPlannerLocations s2 = r2.mo46532s2();
            if (s2.f23786b != null || s2.f23787c != null) {
                C5037a.m12866a(this).mo20760b(this);
            }
        }
    }
}
