package p924xt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c20.C13744a;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.taxi.TaxiPrice;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import k00.C17988b;
import o00.C18669f;
import o00.C18670g;

/* renamed from: xt.v */
public final class C20615v extends C20584a {
    public C20615v() {
        super(9);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        TaxiLeg taxiLeg = (TaxiLeg) mo52791j(itinerary);
        ImageView imageView = (ImageView) fVar.mo39639f(R.id.backdropImage);
        Image image = null;
        imageView.setImageDrawable((Drawable) null);
        Context context = imageView.getContext();
        Parcelable.Creator<TaxiProvidersManager> creator = TaxiProvidersManager.CREATOR;
        TaxiProvider c = ((TaxiProvidersManager) context.getSystemService("taxi_providers_manager")).mo46163c(taxiLeg.f42097b);
        if (c != null) {
            image = c.f39977l.f39991e;
        }
        C13744a.m34301c(imageView, image, 8);
        TextView textView = (TextView) fVar.mo39639f(R.id.price);
        TaxiPrice taxiPrice = taxiLeg.f42103h;
        if (taxiPrice == null) {
            textView.setVisibility(8);
        } else {
            if (TaxiPrice.TaxiPriceType.METERED.equals(taxiPrice.f23230d)) {
                textView.setText(R.string.taxi_metered);
            } else {
                textView.setText(taxiPrice.f23228b);
            }
            if (taxiPrice.f23231e) {
                UiUtils.m40261t(textView, UiUtils.Edge.RIGHT, C17988b.m44611b(R.drawable.img_taxi_surge, textView.getContext()));
            }
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) fVar.mo39639f(R.id.order_button);
        TaxiProvider c2 = ((TaxiProvidersManager) textView2.getContext().getSystemService("taxi_providers_manager")).mo46163c(taxiLeg.f42097b);
        if (c2 != null) {
            C15413a.m39456a(textView2, c2.f39977l.f39992f);
        }
        TextView textView3 = (TextView) fVar.mo39639f(R.id.eta);
        Context context2 = textView3.getContext();
        textView3.setText(context2.getString(R.string.tod_suggested_routes_eta, new Object[]{C7925b.m18018f(context2, itinerary.mo48288K1().mo24631g(), false)}));
        C20589d.m48367e(fVar, itinerary);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        View e = C13715c.m34239e(viewGroup, R.layout.suggested_routes_single_taxi_leg_result, viewGroup, false);
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
        return C16783l.m42465B(itinerary, 5);
    }
}
