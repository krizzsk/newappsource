package p522gt;

import androidx.lifecycle.C1044w;
import com.moovit.app.home.dashboard.suggestions.itinerary.FrequentItinerarySuggestionFragment;
import com.moovit.app.tod.shuttle.booking.passengersselection.TodAdditionalPassengersSelectionDialogFragment;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: gt.a */
public final /* synthetic */ class C17226a implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f44526a;

    /* renamed from: b */
    public final /* synthetic */ C24236l f44527b;

    public /* synthetic */ C17226a(C24236l lVar, int i) {
        this.f44526a = i;
        this.f44527b = lVar;
    }

    public final void onChanged(Object obj) {
        switch (this.f44526a) {
            case 0:
                C24236l lVar = this.f44527b;
                int i = FrequentItinerarySuggestionFragment.f38307u;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            default:
                C24236l lVar2 = this.f44527b;
                int i2 = TodAdditionalPassengersSelectionDialogFragment.f40405i;
                C24362h.m61211f(lVar2, "$tmp0");
                lVar2.invoke(obj);
                return;
        }
    }
}
