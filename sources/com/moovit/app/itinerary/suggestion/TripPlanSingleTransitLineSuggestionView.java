package com.moovit.app.itinerary.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import e20.C16769e;

public class TripPlanSingleTransitLineSuggestionView extends TripPlanTransitLineSuggestionView<WaitToTransitLineLeg> {
    public TripPlanSingleTransitLineSuggestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public final WaitToTransitLineLeg mo45331w(Leg leg, C16769e.C16772c cVar) {
        return (WaitToTransitLineLeg) leg;
    }

    public TripPlanSingleTransitLineSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
