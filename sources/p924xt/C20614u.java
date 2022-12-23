package p924xt;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.app.ridesharing.view.EventView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.tripplanner.TripPlannerLocations;
import e20.C16783l;
import ja0.C12797f;

/* renamed from: xt.u */
public final class C20614u extends C20589d {
    public C20614u() {
        super(17);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        ((EventView) fVar.itemView).mo45800u(((EventLeg) mo52791j(itinerary)).f42083b, false);
        C20589d.m48367e(fVar, itinerary);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        EventView eventView = new EventView(viewGroup.getContext(), (AttributeSet) null);
        eventView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return eventView;
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 13;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42465B(itinerary, 13);
    }
}
