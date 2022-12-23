package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.DistanceUtils;
import com.tranzmate.R;
import e20.C16769e;

/* renamed from: zu.b */
public final class C20895b extends C20894a<BicycleLeg> {
    public C20895b(Context context, Navigable navigable, BicycleLeg bicycleLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, bicycleLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_bike : R.drawable.notification_center_bike_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        BicycleLeg bicycleLeg = (BicycleLeg) leg;
        if (navigationProgressEvent == null) {
            Context context = this.f52646b;
            return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, bicycleLeg.f41943f.mo24339Z0()), context);
        }
        Context context2 = this.f52646b;
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, (float) navigationProgressEvent.f15118i), context2);
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_minimized_bike, new Object[]{((BicycleLeg) leg).f41942e.mo24313f()});
    }
}
