package com.moovit.app.itinerary;

import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.tranzmate.R;
import p116i1.C5253g;

/* renamed from: com.moovit.app.itinerary.g */
public final /* synthetic */ class C15051g implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ ItineraryStepsBaseActivity f38589b;

    public /* synthetic */ C15051g(ItineraryStepsBaseActivity itineraryStepsBaseActivity) {
        this.f38589b = itineraryStepsBaseActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ItineraryStepsBaseActivity itineraryStepsBaseActivity = this.f38589b;
        if (itineraryStepsBaseActivity.f38506p0 == null) {
            return;
        }
        if (i != i5 || i3 != i7 || i4 != i8 || i2 != i6) {
            int height = itineraryStepsBaseActivity.f38502l0.getHeight() - itineraryStepsBaseActivity.getResources().getDimensionPixelSize(R.dimen.card_peek_size);
            PagerAdapter pagerAdapter = itineraryStepsBaseActivity.f38506p0.f47097a;
            if (pagerAdapter instanceof ItineraryStepsBaseActivity.C15030d) {
                ((ItineraryStepsBaseActivity.C15030d) pagerAdapter).f38518b = height;
            }
            itineraryStepsBaseActivity.f38502l0.post(new C5253g(height, 1, itineraryStepsBaseActivity));
        }
    }
}
