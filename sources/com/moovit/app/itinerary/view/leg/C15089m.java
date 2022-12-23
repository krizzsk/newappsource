package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.taxi.TaxiPrice;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import p373au.C13532d;
import p397bu.C13684b;

/* renamed from: com.moovit.app.itinerary.view.leg.m */
public final class C15089m extends AbstractLegView<WaitToTaxiLeg> {

    /* renamed from: C */
    public static final /* synthetic */ int f38721C = 0;

    public C15089m(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: H */
    public final void mo45375H(Leg leg) {
        String str;
        TaxiPrice taxiPrice = ((WaitToTaxiLeg) leg).f42126f;
        if (taxiPrice != null) {
            if (TaxiPrice.TaxiPriceType.METERED.equals(taxiPrice.f23230d)) {
                str = getResources().getString(R.string.taxi_metered);
            } else {
                str = taxiPrice.f23228b;
            }
            setFare(str);
        }
    }

    /* renamed from: K */
    public final TaxiProvider mo45403K(WaitToTaxiLeg waitToTaxiLeg) {
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(getContext().getApplicationContext());
        if (b == null) {
            return null;
        }
        return b.mo46163c(waitToTaxiLeg.f42122b);
    }

    public int getBottomExtraViewsDividerSpec() {
        return 0;
    }

    /* renamed from: q */
    public final List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        TaxiProvider K = mo45403K(waitToTaxiLeg);
        if (K == null || !(leg2 instanceof TaxiLeg)) {
            return Collections.emptyList();
        }
        TaxiButtonSpec taxiButtonSpec = K.f39977l.f39992f;
        Button button = (Button) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.taxi_action_view, linearLayout, false);
        C15413a.m39456a(button, taxiButtonSpec);
        button.setLayoutParams(C13532d.m33907b(getResources()));
        button.setOnClickListener(new C13684b(1, this, waitToTaxiLeg, leg2));
        return Collections.singletonList(button);
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        return AbstractLegView.FooterViewType.NONE;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_wait);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        TaxiProvider K = mo45403K((WaitToTaxiLeg) leg);
        if (K == null) {
            return null;
        }
        return K.f39972g;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        return new ResourceImage(R.drawable.ic_clock_24_on_surface_emphasis_high, new String[0]);
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ List mo45397y(Leg leg) {
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        return null;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        TaxiProvider K = mo45403K((WaitToTaxiLeg) leg);
        if (K == null) {
            return getContext().getString(R.string.taxi_title);
        }
        return K.f39977l.f39988b;
    }
}
