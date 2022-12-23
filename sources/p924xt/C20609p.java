package p924xt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.app.carpool.CarpoolLegDetailsView;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.tripplanner.TripPlannerLocations;
import e20.C16783l;
import ja0.C12797f;
import java.util.EnumSet;
import java.util.Set;
import p472er.C16865g;

/* renamed from: xt.p */
public final class C20609p extends C20589d {

    /* renamed from: c */
    public static final EnumSet f52120c = EnumSet.of(CarpoolLeg.CarpoolType.ANONYMOUS, CarpoolLeg.CarpoolType.SINGLE_DRIVER);

    public C20609p() {
        super(13);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        boolean z;
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        CarpoolLeg carpoolLeg = (CarpoolLeg) mo52791j(itinerary);
        Context e = fVar.mo39638e();
        Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
        AppDeepLink appDeepLink = carpoolLeg.f41978n;
        if (!C16865g.f43870a.contains(carpoolLeg.f41971g) || appDeepLink == null || appDeepLink.mo46945b(e)) {
            z = false;
        } else {
            z = true;
        }
        ((CarpoolLegDetailsView) fVar.itemView).mo44822d(itinerary, carpoolLeg, z);
        C20589d.m48367e(fVar, itinerary);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        CarpoolLegDetailsView carpoolLegDetailsView = new CarpoolLegDetailsView(viewGroup.getContext(), (AttributeSet) null);
        carpoolLegDetailsView.setLayoutParams(UiUtils.m40254m());
        return carpoolLegDetailsView;
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 7;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        if (!C16783l.m42465B(itinerary, 7)) {
            return false;
        }
        return f52120c.contains(((CarpoolLeg) mo52791j(itinerary)).f41972h);
    }
}
