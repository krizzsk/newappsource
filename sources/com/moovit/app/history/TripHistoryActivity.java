package com.moovit.app.history;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.AlertMessageView;
import com.moovit.transit.Journey;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p001a0.C0016g;
import p073e7.C4585c;
import p372at.C13516c;
import p372at.C13518d;
import p372at.C13519e;
import p435de.C16596f;

public class TripHistoryActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38127U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        HistoryItem b = ((C13516c) getSystemService("history_controller")).mo40409b(getIntent().getStringExtra("historyItemId"));
        if (b != null) {
            setContentView((int) R.layout.trip_history_activity);
            HistoryItemResultsFragment historyItemResultsFragment = (HistoryItemResultsFragment) getSupportFragmentManager().mo3983z(R.id.trip_plan_history_fragment);
            if (historyItemResultsFragment == null) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Results fragment is null."));
                finish();
            } else {
                Journey journey = (Journey) b.mo45080Z1(new C13519e());
                findViewById(R.id.switch_directions).setVisibility(8);
                TextView textView = (TextView) findViewById(R.id.origin);
                textView.setText(journey.f23643b.mo24313f());
                textView.setContentDescription(getString(R.string.voice_over_tripplan_from, new Object[]{textView.getText()}));
                TextView textView2 = (TextView) findViewById(R.id.destination);
                textView2.setText(journey.f23644c.mo24313f());
                textView2.setContentDescription(getString(R.string.voice_over_tripplan_to, new Object[]{textView2.getText()}));
                ((TextView) findViewById(R.id.time)).setText(getString(R.string.trip_planned_at, new Object[]{C7925b.m18018f(this, b.getCreationTime(), false)}));
                findViewById(R.id.time_container).setOnClickListener(new C4585c(this, 8));
                historyItemResultsFragment.mo46523m2(new TripPlannerLocations(journey.f23643b, journey.f23644c), (TripPlannerOptions) b.mo45080Z1(new C13518d()));
                b.mo45080Z1(historyItemResultsFragment);
            }
        } else {
            setContentView((int) R.layout.trip_history_activity_empty_state);
            ((AlertMessageView) findViewById(R.id.empty_view)).setPositiveButtonClickListener(new C4051q(this, 11));
        }
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(false);
            supportActionBar.mo791m(true);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "HISTORY", "TAXI_PROVIDERS_MANAGER", "TWITTER_SERVICE_ALERTS_FEEDS", "TRIP_PLAN_SUPPORT_VALIDATOR");
        hashSet.add("LATEST_ITINERARY_CONTROLLER");
        return s1;
    }
}
