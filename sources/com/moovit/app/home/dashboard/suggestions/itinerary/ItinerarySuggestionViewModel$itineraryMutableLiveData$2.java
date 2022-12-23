package com.moovit.app.home.dashboard.suggestions.itinerary;

import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import com.moovit.itinerary.model.Itinerary;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p522gt.C17227b;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Landroidx/lifecycle/t;", "Lzz/r;", "Lcom/moovit/itinerary/model/Itinerary;", "invoke", "()Landroidx/lifecycle/t;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class ItinerarySuggestionViewModel$itineraryMutableLiveData$2 extends Lambda implements C24225a<C1040t<C20961r<Itinerary>>> {
    public final /* synthetic */ ItinerarySuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItinerarySuggestionViewModel$itineraryMutableLiveData$2(ItinerarySuggestionViewModel itinerarySuggestionViewModel) {
        super(0);
        this.this$0 = itinerarySuggestionViewModel;
    }

    public final Object invoke() {
        C1040t tVar = new C1040t();
        ItinerarySuggestionViewModel itinerarySuggestionViewModel = this.this$0;
        tVar.addSource((C1043v) itinerarySuggestionViewModel.f38325c.getValue(), new C17227b(new ItinerarySuggestionViewModel$itineraryMutableLiveData$2$1$1(itinerarySuggestionViewModel)));
        return tVar;
    }
}
