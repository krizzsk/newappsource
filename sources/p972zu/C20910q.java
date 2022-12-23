package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import p641lu.C18277b;

/* renamed from: zu.q */
public final class C20910q extends C20894a<WalkLeg> {
    public C20910q(Context context, Navigable navigable, WalkLeg walkLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, walkLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_walk : R.drawable.notification_center_walk_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        int i;
        WalkLeg walkLeg = (WalkLeg) leg;
        T t = this.f52648d;
        LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.BICYCLE_STOP;
        C18277b bVar = C16783l.f43688a;
        if (t.mo48334e2().mo24316j(locationType)) {
            C16769e.C16772c cVar = this.f52651g;
            if (cVar == null) {
                i = -1;
            } else {
                i = C16783l.m42481m(cVar, ((WalkLeg) this.f52648d).f42150e.f23649d);
            }
            if (i != -1) {
                return this.f52646b.getResources().getQuantityString(R.plurals.available_bicycles, i, new Object[]{Integer.valueOf(i)});
            }
        }
        if (navigationProgressEvent == null) {
            Context context = this.f52646b;
            return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, walkLeg.f42151f.mo24339Z0()), context);
        }
        Context context2 = this.f52646b;
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, (float) navigationProgressEvent.f15118i), context2);
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_minimized_walk, new Object[]{((WalkLeg) leg).f42150e.mo24313f()});
    }

    /* renamed from: r */
    public final boolean mo52998r() {
        int i;
        T t = this.f52648d;
        LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.BICYCLE_STOP;
        C18277b bVar = C16783l.f43688a;
        if (!t.mo48334e2().mo24316j(locationType)) {
            return super.mo52998r();
        }
        C16769e.C16772c cVar = this.f52651g;
        if (cVar == null) {
            i = -1;
        } else {
            i = C16783l.m42481m(cVar, ((WalkLeg) this.f52648d).f42150e.f23649d);
        }
        if (i != -1 || super.mo52998r()) {
            return true;
        }
        return false;
    }
}
