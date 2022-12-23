package p116i1;

import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import p116i1.C5247f;

/* renamed from: i1.g */
public final /* synthetic */ class C5253g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f17373b;

    /* renamed from: c */
    public final /* synthetic */ int f17374c;

    /* renamed from: d */
    public final /* synthetic */ Object f17375d;

    public /* synthetic */ C5253g(int i, int i2, Object obj) {
        this.f17373b = i2;
        this.f17375d = obj;
        this.f17374c = i;
    }

    public final void run() {
        switch (this.f17373b) {
            case 0:
                ((C5247f.C5252e) this.f17375d).mo2199c(this.f17374c);
                return;
            default:
                ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) this.f17375d;
                int i = this.f17374c;
                for (int i2 = 0; i2 < itineraryStepsBaseActivity.f38502l0.getPageCount(); i2++) {
                    SingleLegCard singleLegCard = (SingleLegCard) itineraryStepsBaseActivity.f38502l0.mo47352a(i2);
                    if (singleLegCard != null) {
                        singleLegCard.setCardTopMargin(i);
                    }
                }
                return;
        }
    }
}
