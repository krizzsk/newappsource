package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import com.tranzmate.R;
import java.util.List;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.j */
public final class C15085j extends AbstractLegView<TaxiLeg> {
    public C15085j(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        LocationDescriptor locationDescriptor = ((TaxiLeg) leg).f42101f;
        if (locationDescriptor.f23647b == LocationDescriptor.LocationType.STOP) {
            return locationDescriptor.f23649d;
        }
        return null;
    }

    /* renamed from: C */
    public final boolean mo45370C() {
        return true;
    }

    public Paint getLineConnectPaint() {
        Context context = getContext();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C20941h.m49043f(R.attr.colorOnSurface, context));
        paint.setStrokeWidth((float) UiUtils.m40248g(context, 2.0f));
        return paint;
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        Context context = getContext();
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, ((TaxiLeg) leg).f42102g.mo24339Z0()), context);
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        TaxiLeg taxiLeg = (TaxiLeg) leg;
        return AbstractLegView.FooterViewType.FIXED_TEXT;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        TaxiLeg taxiLeg = (TaxiLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_ride);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return ((TaxiLeg) leg).f42101f.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        TaxiLeg taxiLeg = (TaxiLeg) leg;
        return new ResourceImage(R.drawable.ic_taxi_24_on_surface, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        return ((TaxiLeg) leg).f42101f.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return ((TaxiLeg) leg).f42101f.f23651f;
    }
}
