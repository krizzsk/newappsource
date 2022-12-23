package p924xt;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p924xt.C20590e;
import p977zz.C20964s0;

/* renamed from: xt.w */
public final class C20616w extends C20589d {
    public C20616w() {
        super(10);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        Context e = fVar.mo39638e();
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
        formatTextView.setText((CharSequence) null);
        C20589d.m48368f(formatTextView, itinerary);
        C20589d.m48367e(fVar, itinerary);
        ((TextView) fVar.mo39639f(R.id.metadata)).setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(e, ((WalkLeg) mo52791j(itinerary)).f42151f.mo24339Z0()), e));
    }

    /* renamed from: b */
    public final void mo52789b(C20590e.C20591a aVar, Itinerary itinerary) {
        int i;
        Context context = aVar.f52079a.getContext();
        WalkLeg walkLeg = (WalkLeg) mo52791j(itinerary);
        aVar.f52079a.setVisibility(0);
        aVar.f52081c.setText(R.string.tripplan_itinerary_walk_label);
        aVar.f52080b.setImageResource(R.drawable.ic_walk_24_on_surface_emphasis_high);
        int c = (int) DistanceUtils.m17936c(context, walkLeg.f42151f.mo24339Z0());
        aVar.f52082d.setText(DistanceUtils.m17934a(c, context));
        TextView textView = aVar.f52082d;
        int i2 = 4;
        if (c <= 0) {
            i = 4;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        long t = C16783l.m42488t(walkLeg, TimeUnit.MINUTES);
        aVar.f52083e.setText(C7925b.f23935b.mo24603c(context, t, Collections.singleton(C20964s0.m49084b(context, R.attr.textAppearanceSupportive, R.attr.colorOnSurface))));
        TextView textView2 = aVar.f52083e;
        if (t > 0) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        C13382a.m33674j(aVar.f52079a, aVar.f52081c.getText(), aVar.f52083e.getText(), aVar.f52082d.getText());
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        return C13715c.m34239e(viewGroup, R.layout.suggested_routes_single_walk_leg_result, viewGroup, false);
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 1;
    }

    /* renamed from: m */
    public final void mo52784m(C20590e.C20592b bVar, Itinerary itinerary, StringBuilder sb) {
        C13382a.m33666b(sb, bVar.mo39638e().getString(R.string.voice_over_suggest_routs_single_walking));
        super.mo52784m(bVar, itinerary, sb);
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42465B(itinerary, 1);
    }
}
