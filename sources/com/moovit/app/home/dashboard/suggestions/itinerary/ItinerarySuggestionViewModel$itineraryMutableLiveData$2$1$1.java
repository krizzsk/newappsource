package com.moovit.app.home.dashboard.suggestions.itinerary;

import bf0.C21050d;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.transit.LocationDescriptor;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import wh0.C25177g;
import wh0.C25184i0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lcom/moovit/transit/LocationDescriptor;", "kotlin.jvm.PlatformType", "location", "Lbf0/d;", "invoke", "(Lcom/moovit/transit/LocationDescriptor;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class ItinerarySuggestionViewModel$itineraryMutableLiveData$2$1$1 extends Lambda implements C24236l<LocationDescriptor, C21050d> {
    public final /* synthetic */ ItinerarySuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItinerarySuggestionViewModel$itineraryMutableLiveData$2$1$1(ItinerarySuggestionViewModel itinerarySuggestionViewModel) {
        super(1);
        this.this$0 = itinerarySuggestionViewModel;
    }

    public final Object invoke(Object obj) {
        LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
        ItinerarySuggestionViewModel itinerarySuggestionViewModel = this.this$0;
        C24362h.m61210e(locationDescriptor, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        itinerarySuggestionViewModel.getClass();
        C25177g.m63218b(C17875h.m44315z(itinerarySuggestionViewModel), C25184i0.f63460b, new ItinerarySuggestionViewModel$getItinerary$1(itinerarySuggestionViewModel, locationDescriptor, (C23349c<? super ItinerarySuggestionViewModel$getItinerary$1>) null), 2);
        return C21050d.f52856a;
    }
}
