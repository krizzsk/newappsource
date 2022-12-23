package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import java.util.concurrent.TimeUnit;

/* renamed from: zu.e */
public final class C20898e extends C20894a<DocklessBicycleLeg> {
    public C20898e(Context context, Navigable navigable, DocklessBicycleLeg docklessBicycleLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, docklessBicycleLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_bike : R.drawable.notification_center_bike_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) leg;
        if (navigationProgressEvent == null) {
            Context context = this.f52646b;
            return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, docklessBicycleLeg.f42000f.mo24339Z0()), context);
        }
        Context context2 = this.f52646b;
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, (float) navigationProgressEvent.f15118i), context2);
    }

    /* renamed from: n */
    public final CharSequence mo52994n(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) leg;
        if (navigationProgressEvent == null) {
            return C7925b.f23936c.mo24605e(this.f52646b, docklessBicycleLeg.f41996b.mo24631g(), docklessBicycleLeg.f41997c.mo24631g()).toString();
        }
        return C7925b.f23936c.mo24602b(this.f52646b, (long) ((int) TimeUnit.SECONDS.toMinutes((long) navigationProgressEvent.f15120k))).toString();
    }

    /* renamed from: o */
    public final int mo52995o() {
        if (mo52998r()) {
            return R.drawable.ic_real_time_12_live;
        }
        return 0;
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) leg;
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_ride_with, new Object[]{docklessBicycleLeg.f42002h.f42007c}) + " " + docklessBicycleLeg.f41999e.mo24313f();
    }
}
