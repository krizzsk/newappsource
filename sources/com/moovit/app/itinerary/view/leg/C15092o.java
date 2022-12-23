package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c00.C13717b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.view.DirectionsView;
import com.tranzmate.R;
import e20.C16783l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.o */
public final class C15092o extends AbstractLegView<WalkLeg> {

    /* renamed from: C */
    public TextView f38726C;

    public C15092o(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        LocationDescriptor locationDescriptor = ((WalkLeg) leg).f42150e;
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
        WalkLeg walkLeg = (WalkLeg) leg;
        ArrayList arrayList = new ArrayList(Collections.emptyList());
        if (leg2 != null && leg2.getType() == 8) {
            PathwayWalkLegExtraView pathwayWalkLegExtraView = new PathwayWalkLegExtraView(getContext(), (AttributeSet) null);
            pathwayWalkLegExtraView.mo45399a((PathwayWalkLeg) leg2);
            arrayList.add(pathwayWalkLegExtraView);
        }
        Context context = getContext();
        this.f38726C = (TextView) LayoutInflater.from(context).inflate(R.layout.wait_leg_bicycle_rental_availability_view, this, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int g = UiUtils.m40248g(context, 5.0f);
        layoutParams.setMargins(0, g, 0, g);
        this.f38726C.setLayoutParams(layoutParams);
        this.f38726C.setVisibility(8);
        arrayList.add(this.f38726C);
        return arrayList;
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        WalkLeg walkLeg = (WalkLeg) leg;
        Context context = getContext();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(context, walkLeg.f42147b.mo24631g(), walkLeg.f42148c.mo24631g());
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, walkLeg.f42151f.mo24339Z0()), context) + context.getString(R.string.string_list_delimiter_dot) + e;
    }

    public void setAvailableBicyclesAtDestination(int i) {
        if (i == -1) {
            this.f38726C.setVisibility(8);
            mo45377J();
            return;
        }
        String quantityString = getResources().getQuantityString(R.plurals.available_bicycles, i, new Object[]{Integer.valueOf(i)});
        this.f38726C.setText(quantityString);
        this.f38726C.setContentDescription(quantityString);
        this.f38726C.setVisibility(0);
        mo45377J();
    }

    /* renamed from: t */
    public final View mo45392t(Leg leg) {
        DirectionsView directionsView = new DirectionsView(getContext(), (AttributeSet) null);
        directionsView.mo24678a(C16783l.m42478j(getContext(), ((WalkLeg) leg).f42152g));
        return directionsView;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        if (C13717b.m34258e(((WalkLeg) leg).f42152g)) {
            return AbstractLegView.FooterViewType.FIXED_TEXT;
        }
        return AbstractLegView.FooterViewType.EXPANDED_VIEW;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        WalkLeg walkLeg = (WalkLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_walk);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return ((WalkLeg) leg).f42150e.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        WalkLeg walkLeg = (WalkLeg) leg;
        return new ResourceImage(R.drawable.ic_walk_24_on_surface, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        return ((WalkLeg) leg).f42150e.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return ((WalkLeg) leg).f42150e.f23651f;
    }
}
