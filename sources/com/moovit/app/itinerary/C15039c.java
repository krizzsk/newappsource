package com.moovit.app.itinerary;

import android.animation.Animator;
import com.moovit.itinerary.model.Itinerary;
import j00.C17682a;

/* renamed from: com.moovit.app.itinerary.c */
public final class C15039c extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ Itinerary f38539a;

    /* renamed from: b */
    public final /* synthetic */ ItineraryActivity f38540b;

    public C15039c(ItineraryActivity itineraryActivity, Itinerary itinerary) {
        this.f38540b = itineraryActivity;
        this.f38539a = itinerary;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38540b.f38485q0.mo45311b(this.f38539a);
    }
}
