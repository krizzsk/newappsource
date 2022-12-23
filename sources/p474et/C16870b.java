package p474et;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItineraryFragmentParams;
import com.moovit.app.home.dashboard.suggestions.itinerary.LatestItinerarySuggestionFragment;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import mf0.C24362h;

/* renamed from: et.b */
public final class C16870b extends C16872d {

    /* renamed from: c */
    public final Itinerary f43880c;

    public C16870b(Itinerary itinerary) {
        super("suggestion_latest_route");
        this.f43880c = itinerary;
    }

    /* renamed from: a */
    public final Fragment mo49530a(int i) {
        LocationDescriptor W = this.f43880c.mo48289b().mo48332W();
        C24362h.m61210e(W, "itinerary.firstLeg.origin");
        LocationDescriptor e2 = this.f43880c.mo48290c().mo48334e2();
        C24362h.m61210e(e2, "itinerary.lastLeg.destination");
        ItineraryFragmentParams itineraryFragmentParams = new ItineraryFragmentParams(R.string.smart_component_recently_viewed_trip, W, e2, e2.f23651f, this.f43883a, i);
        int i2 = LatestItinerarySuggestionFragment.f38329t;
        Itinerary itinerary = this.f43880c;
        C24362h.m61211f(itinerary, "itinerary");
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", itineraryFragmentParams);
        bundle.putParcelable("itinerary", itinerary);
        LatestItinerarySuggestionFragment latestItinerarySuggestionFragment = new LatestItinerarySuggestionFragment();
        latestItinerarySuggestionFragment.setArguments(bundle);
        return latestItinerarySuggestionFragment;
    }
}
