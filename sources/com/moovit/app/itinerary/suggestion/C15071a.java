package com.moovit.app.itinerary.suggestion;

import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.transit.Schedule;
import e20.C16769e;
import java.util.Comparator;

/* renamed from: com.moovit.app.itinerary.suggestion.a */
public final /* synthetic */ class C15071a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C16769e.C16772c f38647b;

    /* renamed from: c */
    public final /* synthetic */ Comparator f38648c;

    public /* synthetic */ C15071a(C16769e.C16772c cVar, Schedule.C7799d dVar) {
        this.f38647b = cVar;
        this.f38648c = dVar;
    }

    public final int compare(Object obj, Object obj2) {
        C16769e.C16772c cVar = this.f38647b;
        Comparator comparator = this.f38648c;
        int i = TripPlanMultiTransitLineSuggestionView.f38631A;
        return comparator.compare(TripPlanTransitLineSuggestionView.m38172x((WaitToTransitLineLeg) obj, cVar), TripPlanTransitLineSuggestionView.m38172x((WaitToTransitLineLeg) obj2, cVar));
    }
}
