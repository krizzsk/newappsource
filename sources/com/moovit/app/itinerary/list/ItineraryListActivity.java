package com.moovit.app.itinerary.list;

import android.content.Intent;
import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.TripPlanConfig;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p001a0.C0016g;

public class ItineraryListActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38595U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        TripPlanConfig tripPlanConfig = (TripPlanConfig) intent.getParcelableExtra("config");
        if (tripPlanConfig != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("itineraries");
            if (parcelableArrayListExtra != null) {
                String stringExtra = intent.getStringExtra("title");
                if (stringExtra != null) {
                    setTitle(stringExtra);
                }
                setContentView((int) R.layout.itinerary_list_activity);
                ItineraryListFragment itineraryListFragment = (ItineraryListFragment) mo44529n1(R.id.itinerary_list_fragment);
                itineraryListFragment.mo40558y2();
                itineraryListFragment.mo52810z2(tripPlanConfig);
                itineraryListFragment.mo52808q2(parcelableArrayListExtra);
                return;
            }
            throw new ApplicationBugException("Did you use createStartIntent(...)?");
        }
        throw new ApplicationBugException("Did you use createStartIntent(...)?");
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "TWITTER_SERVICE_ALERTS_FEEDS", "USER_ACCOUNT", "HISTORY", "TAXI_PROVIDERS_MANAGER");
        hashSet.add("LATEST_ITINERARY_CONTROLLER");
        return s1;
    }
}
