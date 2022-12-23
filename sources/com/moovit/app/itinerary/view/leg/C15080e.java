package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c00.C13717b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
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
import p373au.C13532d;
import p397bu.C13685c;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.e */
public final class C15080e extends AbstractLegView<DocklessCarLeg> implements MicroMobilityIntegrationView.C4150c {
    public C15080e(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        LocationDescriptor locationDescriptor = ((DocklessCarLeg) leg).f42021e;
        if (locationDescriptor.f23647b == LocationDescriptor.LocationType.STOP) {
            return locationDescriptor.f23649d;
        }
        return null;
    }

    /* renamed from: C */
    public final boolean mo45370C() {
        return true;
    }

    /* renamed from: W0 */
    public final void mo19494W0(ServerId serverId) {
        mo45374G(serverId);
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

    /* renamed from: m */
    public final void mo19495m(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        mo45373F(microMobilityIntegrationItem, microMobilityIntegrationFlow);
    }

    /* renamed from: q */
    public final List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg;
        MicroMobilityIntegrationItem microMobilityIntegrationItem = docklessCarLeg.f42026j;
        if (microMobilityIntegrationItem != null) {
            MicroMobilityIntegrationView d = C13532d.m33909d(linearLayout, microMobilityIntegrationItem);
            d.setLayoutParams(C13532d.m33907b(getResources()));
            d.setListener(this);
            return Collections.singletonList(d);
        }
        AppDeepLink appDeepLink = docklessCarLeg.f42025i;
        if (appDeepLink == null) {
            return Collections.emptyList();
        }
        View c = C13532d.m33908c(linearLayout, appDeepLink);
        c.setLayoutParams(C13532d.m33907b(getResources()));
        c.setOnClickListener(new C13685c(0, this, docklessCarLeg, leg2));
        return Collections.singletonList(c);
    }

    /* renamed from: r */
    public final List mo45384r(Leg leg, Leg leg2) {
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg;
        ArrayList arrayList = new ArrayList(Collections.emptyList());
        if (leg2 != null && leg2.getType() == 8) {
            PathwayWalkLegExtraView pathwayWalkLegExtraView = new PathwayWalkLegExtraView(getContext(), (AttributeSet) null);
            pathwayWalkLegExtraView.mo45399a((PathwayWalkLeg) leg2);
            arrayList.add(pathwayWalkLegExtraView);
        }
        return arrayList;
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg;
        Context context = getContext();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(context, docklessCarLeg.f42018b.mo24631g(), docklessCarLeg.f42019c.mo24631g());
        return DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, docklessCarLeg.f42022f.mo24339Z0()), context) + context.getString(R.string.string_list_delimiter_dot) + e;
    }

    /* renamed from: t */
    public final View mo45392t(Leg leg) {
        DirectionsView directionsView = new DirectionsView(getContext(), (AttributeSet) null);
        directionsView.mo24678a(C16783l.m42478j(getContext(), ((DocklessCarLeg) leg).f42023g));
        return directionsView;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        if (C13717b.m34258e(((DocklessCarLeg) leg).f42023g)) {
            return AbstractLegView.FooterViewType.FIXED_TEXT;
        }
        return AbstractLegView.FooterViewType.EXPANDED_VIEW;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_drive_with, new Object[]{((DocklessCarLeg) getLeg()).f42024h.f42029c});
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return ((DocklessCarLeg) leg).f42021e.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg;
        return new ResourceImage(R.drawable.ic_car_24_on_surface, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        return ((DocklessCarLeg) leg).f42021e.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return ((DocklessCarLeg) leg).f42021e.f23651f;
    }
}
