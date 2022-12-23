package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.card.MaterialCardView;
import com.moovit.genies.Genie;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.R;
import kotlin.C23812a;
import kotlin.Metadata;
import m10.C18316a;
import mf0.C24362h;
import p073e7.C4584b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/itinerary/LatestItinerarySuggestionFragment;", "Lcom/moovit/app/home/dashboard/suggestions/itinerary/ItinerarySuggestionFragment;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class LatestItinerarySuggestionFragment extends ItinerarySuggestionFragment {

    /* renamed from: t */
    public static final /* synthetic */ int f38329t = 0;

    /* renamed from: s */
    public final C21049c f38330s = C23812a.m58432b(new LatestItinerarySuggestionFragment$params$2(this));

    /* renamed from: m2 */
    public final ItineraryFragmentParams mo45169m2() {
        return (ItineraryFragmentParams) this.f38330s.getValue();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Itinerary itinerary;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.more_info);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.more_info)");
        Button button = (Button) findViewById;
        button.setVisibility(0);
        button.setOnClickListener(new C4584b(this, 13));
        Bundle arguments = getArguments();
        if (arguments != null) {
            itinerary = (Itinerary) arguments.getParcelable("itinerary");
        } else {
            itinerary = null;
        }
        C24362h.m61208c(itinerary);
        mo45181o2(itinerary);
        View findViewById2 = view.findViewById(R.id.card_view);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.card_view)");
        C18316a.f46708c.mo50767a(Genie.PERSONALIZED_SUGGESTIONS_LATEST_ROUTE, (MaterialCardView) findViewById2, this.f40822c);
    }
}
