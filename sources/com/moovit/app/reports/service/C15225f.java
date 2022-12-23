package com.moovit.app.reports.service;

import android.widget.RatingBar;

/* renamed from: com.moovit.app.reports.service.f */
public final class C15225f implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C15226g f39253a;

    public C15225f(C15226g gVar) {
        this.f39253a = gVar;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        C15226g gVar = this.f39253a;
        gVar.f39255i = f;
        gVar.mo45724b();
    }
}
