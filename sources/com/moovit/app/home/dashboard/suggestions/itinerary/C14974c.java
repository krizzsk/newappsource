package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionFragment;
import mf0.C24362h;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.c */
public final class C14974c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    public final /* synthetic */ ItinerarySuggestionFragment.C14971a f38332b;

    public C14974c(ItinerarySuggestionFragment.C14971a aVar) {
        this.f38332b = aVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C24362h.m61211f(motionEvent, "e");
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C24362h.m61211f(motionEvent, "e");
        if (!this.f38332b.f38323a.isClickable()) {
            return false;
        }
        this.f38332b.f38323a.performClick();
        return true;
    }
}
