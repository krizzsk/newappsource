package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import java.util.concurrent.TimeUnit;

/* renamed from: zu.g */
public final class C20900g extends C20894a<DocklessMopedLeg> {
    public C20900g(Context context, Navigable navigable, DocklessMopedLeg docklessMopedLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, docklessMopedLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_moped : R.drawable.notification_center_moped_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) leg;
        if (navigationProgressEvent == null) {
            Context context = this.f52646b;
            return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, docklessMopedLeg.f42044f.mo24339Z0()), context);
        }
        Context context2 = this.f52646b;
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, (float) navigationProgressEvent.f15118i), context2);
    }

    /* renamed from: n */
    public final CharSequence mo52994n(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) leg;
        if (navigationProgressEvent == null) {
            return C7925b.f23936c.mo24605e(this.f52646b, docklessMopedLeg.f42040b.mo24631g(), docklessMopedLeg.f42041c.mo24631g()).toString();
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
        DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) leg;
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_ride_with, new Object[]{docklessMopedLeg.f42046h.f42051c}) + " " + docklessMopedLeg.f42043e.mo24313f();
    }
}
