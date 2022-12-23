package com.moovit.app.history;

import android.os.Bundle;
import c00.C13717b;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import java.util.Collections;
import java.util.List;
import l40.C5617e;
import p924xt.C20598h;

public class HistoryItemResultsFragment extends C20598h<TripPlannerOptions> implements HistoryItem.C14912a<Void> {

    /* renamed from: A */
    public boolean f38126A;

    /* renamed from: C2 */
    public final boolean mo45070C2() {
        return this.f38126A;
    }

    /* renamed from: D */
    public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
        TripPlanConfig tripPlanConfig = tripPlanHistoryItem.f38146e;
        List<Itinerary> list = tripPlanHistoryItem.f38148g;
        if (C13717b.m34258e(list)) {
            return null;
        }
        mo40558y2();
        mo52810z2(tripPlanConfig);
        mo52808q2(list);
        this.f38126A = false;
        return null;
    }

    /* renamed from: e1 */
    public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
        List<Itinerary> list = offlineTripPlanHistoryItem.f38139f;
        if (C13717b.m34258e(list)) {
            return null;
        }
        mo40558y2();
        mo52810z2(C5617e.m13872a(requireContext()));
        mo52808q2(list);
        this.f38126A = true;
        return null;
    }

    /* renamed from: o2 */
    public final void mo40556o2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
    }

    /* renamed from: u2 */
    public final void mo40557u2(Itinerary itinerary) {
        startActivity(ItineraryActivity.m37992z2(requireContext(), Collections.singletonList(itinerary), true, true));
    }

    /* renamed from: w2 */
    public final void mo45071w2(Bundle bundle) {
    }

    /* renamed from: x2 */
    public final void mo45072x2(Bundle bundle) {
    }
}
