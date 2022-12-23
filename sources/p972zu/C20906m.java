package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/* renamed from: zu.m */
public final class C20906m extends C20894a<TransitLineLeg> {
    public C20906m(Context context, Navigable navigable, TransitLineLeg transitLineLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, transitLineLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_ride : R.drawable.notification_center_ride_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        if (navigationProgressEvent == null) {
            int size = transitLineLeg.f42111e.size();
            return this.f52646b.getResources().getQuantityString(R.plurals.stops, size, new Object[]{Integer.valueOf(size)});
        }
        int i = navigationProgressEvent.f15119j;
        if (i == 1) {
            return this.f52646b.getResources().getString(R.string.tripplan_itinerary_disembark_stop);
        }
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_disembark_stops, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: n */
    public final CharSequence mo52994n(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        if (navigationProgressEvent == null) {
            return C7925b.f23936c.mo24602b(this.f52646b, (long) ((int) C7925b.m18026n(transitLineLeg.f42108b.mo24631g(), transitLineLeg.f42109c.mo24631g()))).toString();
        }
        SimpleDateFormat simpleDateFormat = C7925b.f23934a;
        return C7925b.f23935b.mo24602b(this.f52646b, (long) ((int) TimeUnit.MINUTES.convert((long) navigationProgressEvent.f15120k, TimeUnit.SECONDS))).toString();
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
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_ride) + " " + ((TransitLineLeg) leg).mo48334e2().mo24313f();
    }
}
