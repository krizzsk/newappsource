package p732pq;

import com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity;
import com.moovit.app.itinerary.suggestion.TripPlanMultiTransitLineSuggestionView;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import java.util.Comparator;
import n10.C18509f;

/* renamed from: pq.n */
public final /* synthetic */ class C18954n implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f48262b;

    /* renamed from: c */
    public final /* synthetic */ Comparator f48263c;

    public /* synthetic */ C18954n(Comparator comparator, int i) {
        this.f48262b = i;
        this.f48263c = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f48262b) {
            case 0:
                int i = NotifyDriverLineSelectionActivity.f37425r0;
                return ((C18509f) this.f48263c).compare(((NotifyDriverLineSelectionActivity.C14721d) obj).f37439a.mo24369b().f23697e, ((NotifyDriverLineSelectionActivity.C14721d) obj2).f37439a.mo24369b().f23697e);
            default:
                Comparator comparator = this.f48263c;
                int i2 = TripPlanMultiTransitLineSuggestionView.f38631A;
                return comparator.compare(((WaitToTransitLineLeg) obj).f42138i.f42142b, ((WaitToTransitLineLeg) obj2).f42138i.f42142b);
        }
    }
}
