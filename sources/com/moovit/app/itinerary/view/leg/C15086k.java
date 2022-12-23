package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c00.C13717b;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitType;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16783l;
import ea0.C12622a;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.k */
public final class C15086k extends AbstractLegView<TransitLineLeg> {

    /* renamed from: C */
    public LocationDescriptor f38716C;

    public C15086k(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        return ((TransitLineLeg) leg).mo48459b().getServerId();
    }

    /* renamed from: C */
    public final boolean mo45370C() {
        return true;
    }

    /* renamed from: H */
    public final void mo45375H(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        this.f38716C = transitLineLeg.mo48334e2();
        CurrencyAmount currencyAmount = transitLineLeg.f42113g;
        if (currencyAmount == null) {
            setFare((String) null);
        } else if (currencyAmount.f23845c.compareTo(BigDecimal.ZERO) >= 0) {
            setFare(currencyAmount.toString());
        } else {
            setFare(getResources().getString(R.string.ride_fare_fare_included));
        }
    }

    public Paint getLineConnectPaint() {
        Context context = getContext();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisMedium, context));
        paint.setStrokeWidth((float) UiUtils.m40248g(context, 2.0f));
        return paint;
    }

    /* renamed from: r */
    public final List mo45384r(Leg leg, Leg leg2) {
        int i;
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        if (leg2 != null) {
            i = leg2.getType();
        } else {
            i = -1;
        }
        if (i == 3) {
            View f = C16783l.m42474f(this, (WaitToTransitLineLeg) leg2);
            if (f != null) {
                return Collections.singletonList(f);
            }
            return Collections.emptyList();
        } else if (i == 8) {
            PathwayWalkLegExtraView pathwayWalkLegExtraView = new PathwayWalkLegExtraView(getContext(), (AttributeSet) null);
            pathwayWalkLegExtraView.mo45399a((PathwayWalkLeg) leg2);
            return Collections.singletonList(pathwayWalkLegExtraView);
        } else if (i != 10) {
            return Collections.emptyList();
        } else {
            View f2 = C16783l.m42474f(this, ((WaitToMultiTransitLinesLeg) leg2).mo48467b());
            if (f2 != null) {
                return Collections.singletonList(f2);
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        Resources resources = getResources();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(getContext(), transitLineLeg.f42108b.mo24631g(), transitLineLeg.f42109c.mo24631g());
        int size = transitLineLeg.f42111e.size() - 1;
        return resources.getString(R.string.transit_leg_footer_text, new Object[]{getResources().getQuantityString(R.plurals.stops, size, new Object[]{Integer.valueOf(size)}), e});
    }

    /* renamed from: t */
    public final View mo45392t(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        Context context = getContext();
        C12622a aVar = new C12622a(context, UiUtils.m40248g(context, 3.5f), UiUtils.m40249h(context.getResources(), 1.0f), C7843b.m17874a(context, transitLineLeg.f42110d.get().mo24369b()).f41007b, C20941h.m49043f(R.attr.colorOnStatus, context), C20941h.m49043f(R.attr.colorInfo, context));
        aVar.mo39414c(transitLineLeg.f42109c, DbEntityRef.getEntities(transitLineLeg.f42111e));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = UiUtils.m40248g(getContext(), 12.0f);
        layoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.screen_edge));
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        if (C13717b.m34258e(((TransitLineLeg) leg).f42111e)) {
            return AbstractLegView.FooterViewType.FIXED_TEXT;
        }
        return AbstractLegView.FooterViewType.EXPANDED_VIEW;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_ride);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        return this.f38716C.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        int i;
        TransitType d = C7843b.m17877d(C7843b.m17876c(((TransitLineLeg) leg).f42110d.get()));
        if (d != null) {
            i = d.f23760e.iconResId;
        } else {
            i = R.drawable.ic_transit_type_bus_24_on_surface;
        }
        return new ResourceImage(i, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        return this.f38716C.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        TransitLineLeg transitLineLeg = (TransitLineLeg) leg;
        return this.f38716C.f23651f;
    }
}
