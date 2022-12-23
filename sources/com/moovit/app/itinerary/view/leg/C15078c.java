package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.moovit.network.model.ServerId;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import f00.C16919g;
import java.util.ArrayList;
import java.util.List;
import p373au.C13532d;
import p397bu.C13683a;
import p877vu.C20233c;
import p977zz.C20941h;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.itinerary.view.leg.c */
public final class C15078c extends AbstractLegView<CarLeg> implements MicroMobilityIntegrationView.C4150c {
    public C15078c(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: W0 */
    public final void mo19494W0(ServerId serverId) {
        mo45374G(serverId);
    }

    public Paint getLineConnectPaint() {
        Context context = getContext();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C20941h.m49043f(R.attr.colorPrimary, context));
        paint.setStrokeWidth((float) UiUtils.m40248g(context, 2.0f));
        return paint;
    }

    /* renamed from: m */
    public final void mo19495m(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        mo45373F(microMobilityIntegrationItem, microMobilityIntegrationFlow);
    }

    /* renamed from: q */
    public final List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        boolean z;
        CarLeg carLeg = (CarLeg) leg;
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (carLeg.f41963g != null) {
            z = true;
        } else {
            z = false;
        }
        C16919g.C16920a aVar = C20233c.f51336a;
        if (!C20975x0.m49121h(context, "com.waze") && !C20975x0.m49121h(context, "com.google.android.apps.maps")) {
            z2 = false;
        }
        if (z) {
            MicroMobilityIntegrationView d = C13532d.m33909d(linearLayout, carLeg.f41963g);
            ViewGroup.MarginLayoutParams b = C13532d.m33907b(getResources());
            if (z2) {
                b.bottomMargin = 0;
            }
            d.setLayoutParams(b);
            d.setListener(this);
            arrayList.add(d);
        }
        if (z2) {
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.car_leg_navigate_action_view, linearLayout, false);
            ViewGroup.MarginLayoutParams b2 = C13532d.m33907b(getResources());
            if (z) {
                b2.topMargin = 0;
            }
            inflate.setLayoutParams(b2);
            inflate.setOnClickListener(new C13683a(0, this, carLeg, leg2));
            arrayList.add(inflate);
        }
        return arrayList;
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        CarLeg carLeg = (CarLeg) leg;
        Context context = getContext();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(context, carLeg.f41958b.mo24631g(), carLeg.f41959c.mo24631g());
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, carLeg.f41962f.mo24339Z0()), context) + context.getString(R.string.string_list_delimiter_dot) + e;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        CarLeg carLeg = (CarLeg) leg;
        return AbstractLegView.FooterViewType.FIXED_TEXT;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        CarLeg carLeg = (CarLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_drive);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return ((CarLeg) leg).f41961e.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        CarLeg carLeg = (CarLeg) leg;
        return new ResourceImage(R.drawable.ic_car_24_on_surface, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        return ((CarLeg) leg).f41961e.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return ((CarLeg) leg).f41961e.f23651f;
    }
}
