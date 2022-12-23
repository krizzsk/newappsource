package p924xt;

import a00.C13382a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c20.C13744a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import p924xt.C20590e;

/* renamed from: xt.t */
public final class C20613t extends C20589d {
    public C20613t() {
        super(19);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        DocklessScooterLeg docklessScooterLeg = (DocklessScooterLeg) mo52791j(itinerary);
        DocklessScooterLeg.DocklessScooterLegInfo docklessScooterLegInfo = docklessScooterLeg.f42068h;
        ItineraryMetadata itineraryMetadata = itinerary.f41895c;
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
        formatTextView.setText((CharSequence) null);
        C20589d.m48368f(formatTextView, itinerary);
        C20589d.m48367e(fVar, itinerary);
        C13744a.m34300b((ImageView) fVar.mo39639f(R.id.leg_image), docklessScooterLegInfo.f42076f);
        UiUtils.m40236D((TextView) fVar.mo39639f(R.id.price), docklessScooterLegInfo.f42081k, 8);
        UiUtils.m40234B((TextView) fVar.mo39639f(R.id.origin), docklessScooterLeg.f42064d.mo24313f());
        TextView textView = (TextView) fVar.mo39639f(R.id.attributes);
        UiUtils.m40236D(textView, C20604l.m48425b(textView.getContext(), docklessScooterLegInfo.f42078h, docklessScooterLegInfo.f42079i, itineraryMetadata.f41909k), 8);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        return C13715c.m34239e(viewGroup, R.layout.suggested_routes_single_dockless_scooter_leg_result, viewGroup, false);
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 15;
    }

    /* renamed from: m */
    public final void mo52784m(C20590e.C20592b bVar, Itinerary itinerary, StringBuilder sb) {
        super.mo52784m(bVar, itinerary, sb);
        C13382a.m33666b(sb, ((TextView) bVar.mo39639f(R.id.origin)).getText());
        C13382a.m33666b(sb, ((TextView) bVar.mo39639f(R.id.attributes)).getText());
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42465B(itinerary, 15);
    }
}
