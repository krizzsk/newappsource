package com.moovit.app.itinerary.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.transit.Schedule;
import e20.C16769e;
import java.util.Collections;
import java.util.List;
import p732pq.C18954n;

public class TripPlanMultiTransitLineSuggestionView extends TripPlanTransitLineSuggestionView<WaitToMultiTransitLinesLeg> {

    /* renamed from: A */
    public static final /* synthetic */ int f38631A = 0;

    public TripPlanMultiTransitLineSuggestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public final WaitToTransitLineLeg mo45331w(Leg leg, C16769e.C16772c cVar) {
        List<WaitToTransitLineLeg> list = ((WaitToMultiTransitLinesLeg) leg).f42117b;
        Schedule.C7799d D = Schedule.m17782D();
        if (cVar != null) {
            return (WaitToTransitLineLeg) Collections.min(list, new C15071a(cVar, D));
        }
        return (WaitToTransitLineLeg) Collections.min(list, new C18954n(D, 1));
    }

    public TripPlanMultiTransitLineSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
