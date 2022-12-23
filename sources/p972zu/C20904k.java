package p972zu;

import android.content.Context;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.tranzmate.R;
import e20.C16769e;

/* renamed from: zu.k */
public final class C20904k extends C20894a<PathwayWalkLeg> {
    public C20904k(Context context, Navigable navigable, PathwayWalkLeg pathwayWalkLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, pathwayWalkLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_walk : R.drawable.notification_center_walk_disable;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        PathwayWalkLeg pathwayWalkLeg = (PathwayWalkLeg) leg;
        return "";
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        return this.f52646b.getResources().getString(R.string.tripplan_itinerary_minimized_walk, new Object[]{((PathwayWalkLeg) leg).mo48334e2().mo24313f()});
    }
}
