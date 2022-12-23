package p924xt;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.taxi.TaxiPrice;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import o00.C18669f;
import o00.C18670g;

/* renamed from: xt.x */
public final class C20617x extends C20584a {
    public C20617x() {
        super(11);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
        formatTextView.setText((CharSequence) null);
        C20589d.m48368f(formatTextView, itinerary);
        C20589d.m48367e(fVar, itinerary);
        TaxiPrice taxiPrice = ((TaxiLeg) mo52791j(itinerary)).f42103h;
        ((TextView) fVar.mo39639f(R.id.price)).setVisibility(8);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        View e = C13715c.m34239e(viewGroup, R.layout.suggested_routes_taxi_default_result, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) e.findViewById(R.id.legs_preview);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.screen_edge) - UiUtils.m40249h(viewGroup.getResources(), 3.0f);
        recyclerView.mo4593g(C18669f.m45651e(dimensionPixelSize), -1);
        recyclerView.mo4593g(C18670g.m45652e(dimensionPixelSize), -1);
        return e;
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 5;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42469a(itinerary, 5);
    }
}
