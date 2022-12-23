package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import c00.C13717b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.view.DirectionsView;
import com.tranzmate.R;
import e20.C16783l;
import java.util.Collections;
import java.util.List;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.a */
public final class C15076a extends AbstractLegView<BicycleLeg> {
    public C15076a(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        LocationDescriptor locationDescriptor = ((BicycleLeg) leg).f41942e;
        if (locationDescriptor.f23647b == LocationDescriptor.LocationType.STOP) {
            return locationDescriptor.f23649d;
        }
        return null;
    }

    public Paint getLineConnectPaint() {
        Context context = getContext();
        int g = UiUtils.m40248g(context, 1.5f);
        int h = UiUtils.m40249h(context.getResources(), 4.0f);
        Path path = new Path();
        path.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) g, Path.Direction.CW);
        Paint paint = new Paint(1);
        paint.setColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisMedium, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new PathDashPathEffect(path, (float) h, BitmapDescriptorFactory.HUE_RED, PathDashPathEffect.Style.TRANSLATE));
        return paint;
    }

    /* renamed from: r */
    public final List mo45384r(Leg leg, Leg leg2) {
        BicycleLeg bicycleLeg = (BicycleLeg) leg;
        if (leg2 == null || leg2.getType() != 8) {
            return Collections.emptyList();
        }
        PathwayWalkLegExtraView pathwayWalkLegExtraView = new PathwayWalkLegExtraView(getContext(), (AttributeSet) null);
        pathwayWalkLegExtraView.mo45399a((PathwayWalkLeg) leg2);
        return Collections.singletonList(pathwayWalkLegExtraView);
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        BicycleLeg bicycleLeg = (BicycleLeg) leg;
        Context context = getContext();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(context, bicycleLeg.f41939b.mo24631g(), bicycleLeg.f41940c.mo24631g());
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, bicycleLeg.f41943f.mo24339Z0()), context) + context.getString(R.string.string_list_delimiter_dot) + e;
    }

    /* renamed from: t */
    public final View mo45392t(Leg leg) {
        DirectionsView directionsView = new DirectionsView(getContext(), (AttributeSet) null);
        directionsView.mo24678a(C16783l.m42478j(getContext(), ((BicycleLeg) leg).f41944g));
        return directionsView;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        if (C13717b.m34258e(((BicycleLeg) leg).f41944g)) {
            return AbstractLegView.FooterViewType.FIXED_TEXT;
        }
        return AbstractLegView.FooterViewType.EXPANDED_VIEW;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        BicycleLeg bicycleLeg = (BicycleLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_bike);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return ((BicycleLeg) leg).f41942e.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        BicycleLeg bicycleLeg = (BicycleLeg) leg;
        return new ResourceImage(R.drawable.ic_bicycle_24_on_surface_emphasis_high, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        return ((BicycleLeg) leg).f41942e.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return ((BicycleLeg) leg).f41942e.f23651f;
    }
}
