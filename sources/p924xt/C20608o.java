package p924xt;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c20.C13744a;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.transit.BicycleStop;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import ja0.C12797f;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p504fz.C17133e;
import p583jk.C17884p;
import p924xt.C20590e;
import p977zz.C20964s0;

/* renamed from: xt.o */
public final class C20608o extends C20589d {
    public C20608o() {
        super(15);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        ResourceImage resourceImage;
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
        formatTextView.setText((CharSequence) null);
        C20589d.m48368f(formatTextView, itinerary);
        C20589d.m48367e(fVar, itinerary);
        BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) mo52791j(itinerary);
        DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
        if (c != null) {
            resourceImage = c.get().mo24299b();
        } else {
            resourceImage = new ResourceImage(R.drawable.ic_bicycle_24_on_surface_emphasis_high, new String[0]);
        }
        C13744a.m34300b((ImageView) fVar.mo39639f(R.id.leg_image), resourceImage);
        TextView textView = (TextView) fVar.mo39639f(R.id.metadata);
        UiUtils.m40236D(textView, C20604l.m48427d(textView.getContext(), bicycleRentalLeg, (C17133e) null), 8);
    }

    /* renamed from: b */
    public final void mo52789b(C20590e.C20591a aVar, Itinerary itinerary) {
        ResourceImage resourceImage;
        int i;
        Context context = aVar.f52079a.getContext();
        BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) mo52791j(itinerary);
        aVar.f52079a.setVisibility(0);
        aVar.f52081c.setText(R.string.tripplan_itinerary_rent_label);
        if (bicycleRentalLeg.mo48345c() != null) {
            resourceImage = bicycleRentalLeg.mo48345c().get().mo24299b();
        } else if (bicycleRentalLeg.mo48344b() != null) {
            resourceImage = bicycleRentalLeg.mo48344b().get().mo24299b();
        } else {
            resourceImage = new ResourceImage(R.drawable.ic_bicycle_24_on_surface_emphasis_high, new String[0]);
        }
        C17884p.m44354Y(aVar.f52080b).mo51642v(resourceImage).mo51628o0(resourceImage).mo10850T(aVar.f52080b);
        int c = (int) DistanceUtils.m17936c(context, ((Polylon) itinerary.mo48296w1()).mo24339Z0());
        aVar.f52082d.setText(DistanceUtils.m17934a(c, context));
        TextView textView = aVar.f52082d;
        int i2 = 4;
        if (c <= 0) {
            i = 4;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        long q = C16783l.m42485q(itinerary, TimeUnit.MINUTES);
        aVar.f52083e.setText(C7925b.f23935b.mo24603c(context, q, Collections.singleton(C20964s0.m49084b(context, R.attr.textAppearanceSupportive, R.attr.colorOnSurface))));
        TextView textView2 = aVar.f52083e;
        if (q > 0) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        C13382a.m33674j(aVar.f52079a, aVar.f52081c.getText(), aVar.f52083e.getText(), aVar.f52082d.getText());
    }

    /* renamed from: c */
    public final void mo52783c(C20590e.C20592b bVar, Itinerary itinerary, C16769e.C16772c cVar) {
        C17133e eVar;
        BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) mo52791j(itinerary);
        DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
        if (c != null) {
            eVar = cVar.f43665c.get(c.getServerId());
        } else {
            eVar = null;
        }
        TextView textView = (TextView) bVar.mo39639f(R.id.metadata);
        UiUtils.m40236D(textView, C20604l.m48427d(textView.getContext(), bicycleRentalLeg, eVar), 8);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        return C13715c.m34239e(viewGroup, R.layout.suggested_routes_single_bicycle_rental_leg_result, viewGroup, false);
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 12;
    }

    /* renamed from: m */
    public final void mo52784m(C20590e.C20592b bVar, Itinerary itinerary, StringBuilder sb) {
        C13382a.m33666b(sb, bVar.mo39638e().getString(R.string.voice_over_suggest_routs_single_bike));
        super.mo52784m(bVar, itinerary, sb);
        C13382a.m33666b(sb, ((TextView) bVar.mo39639f(R.id.metadata)).getText());
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42465B(itinerary, 12);
    }
}
