package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/moovit/app/home/dashboard/suggestions/itinerary/ItineraryFragmentParams;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class FrequentItinerarySuggestionFragment$params$2 extends Lambda implements C24225a<ItineraryFragmentParams> {
    public final /* synthetic */ FrequentItinerarySuggestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrequentItinerarySuggestionFragment$params$2(FrequentItinerarySuggestionFragment frequentItinerarySuggestionFragment) {
        super(0);
        this.this$0 = frequentItinerarySuggestionFragment;
    }

    public final Object invoke() {
        Bundle arguments = this.this$0.getArguments();
        ItineraryFragmentParams itineraryFragmentParams = arguments != null ? (ItineraryFragmentParams) arguments.getParcelable("params") : null;
        C24362h.m61208c(itineraryFragmentParams);
        return itineraryFragmentParams;
    }
}
