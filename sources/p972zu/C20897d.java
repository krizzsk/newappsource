package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.DistanceUtils;
import com.tranzmate.R;
import e20.C16769e;

/* renamed from: zu.d */
public final class C20897d extends C20894a<CarLeg> {
    public C20897d(Context context, Navigable navigable, CarLeg carLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, carLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notificaiton_center_car : R.drawable.notificaiton_center_car_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        CarLeg carLeg = (CarLeg) leg;
        if (navigationProgressEvent == null) {
            Context context = this.f52646b;
            return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, carLeg.f41962f.mo24339Z0()), context);
        }
        Context context2 = this.f52646b;
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, (float) navigationProgressEvent.f15118i), context2);
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_drive) + " " + ((CarLeg) leg).f41961e.mo24313f();
    }
}
