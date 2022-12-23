package p474et;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.moovit.app.home.dashboard.suggestions.itinerary.FrequentItinerarySuggestionFragment;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItineraryFragmentParams;
import com.moovit.transit.LocationDescriptor;
import mf0.C24362h;

/* renamed from: et.a */
public final class C16869a extends C16872d {

    /* renamed from: c */
    public final int f43876c;

    /* renamed from: d */
    public final LocationDescriptor f43877d;

    /* renamed from: e */
    public final LocationDescriptor f43878e;

    /* renamed from: f */
    public final String f43879f;

    public /* synthetic */ C16869a(String str, int i, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        this(str, i, locationDescriptor, locationDescriptor2, (String) null);
    }

    /* renamed from: a */
    public final Fragment mo49530a(int i) {
        int i2 = FrequentItinerarySuggestionFragment.f38307u;
        int i3 = this.f43876c;
        LocationDescriptor locationDescriptor = this.f43877d;
        LocationDescriptor locationDescriptor2 = this.f43878e;
        String str = this.f43879f;
        if (str == null) {
            str = locationDescriptor2.f23651f;
        }
        ItineraryFragmentParams itineraryFragmentParams = new ItineraryFragmentParams(i3, locationDescriptor, locationDescriptor2, str, this.f43883a, i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", itineraryFragmentParams);
        FrequentItinerarySuggestionFragment frequentItinerarySuggestionFragment = new FrequentItinerarySuggestionFragment();
        frequentItinerarySuggestionFragment.setArguments(bundle);
        return frequentItinerarySuggestionFragment;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16869a(String str, int i, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, String str2) {
        super(str);
        C24362h.m61211f(str, "source");
        this.f43876c = i;
        this.f43877d = locationDescriptor;
        this.f43878e = locationDescriptor2;
        this.f43879f = str2;
    }
}
