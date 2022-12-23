package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p646lz.C18299a;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider", mo58555f = "ReturnTripSuggestionCardsProvider.kt", mo58556l = {78, 81}, mo58557m = "retrieveDestination")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class ReturnTripSuggestionCardsProvider$retrieveDestination$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C14978g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReturnTripSuggestionCardsProvider$retrieveDestination$1(C14978g gVar, C23349c<? super ReturnTripSuggestionCardsProvider$retrieveDestination$1> cVar) {
        super(cVar);
        this.this$0 = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C14978g.m37845f(this.this$0, (Context) null, (C18299a) null, (ItineraryHistoryItem) null, this);
    }
}
