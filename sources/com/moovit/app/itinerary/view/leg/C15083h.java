package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c00.C13717b;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
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
import p824tp.C19728f;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.view.leg.h */
public final class C15083h extends AbstractLegView<MultiTransitLinesLeg> {

    /* renamed from: D */
    public static final /* synthetic */ int f38714D = 0;

    /* renamed from: C */
    public LocationDescriptor f38715C;

    public C15083h(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        return ((MultiTransitLinesLeg) leg).mo48440b().mo48459b().getServerId();
    }

    /* renamed from: C */
    public final boolean mo45370C() {
        return true;
    }

    /* renamed from: H */
    public final void mo45375H(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        this.f38715C = multiTransitLinesLeg.mo48334e2();
        CurrencyAmount currencyAmount = multiTransitLinesLeg.mo48440b().f42113g;
        if (currencyAmount == null) {
            setFare((String) null);
        } else if (currencyAmount.f23845c.compareTo(BigDecimal.ZERO) >= 0) {
            setFare(currencyAmount.toString());
        } else {
            setFare(getResources().getString(R.string.ride_fare_fare_included));
        }
    }

    /* renamed from: K */
    public final View mo45401K(WaitToTransitLineLeg waitToTransitLineLeg) {
        View f = C16783l.m42474f(this, waitToTransitLineLeg);
        if (f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            int h = UiUtils.m40249h(getResources(), 11.0f);
            marginLayoutParams.bottomMargin = h;
            marginLayoutParams.topMargin = h;
            f.setLayoutParams(marginLayoutParams);
        }
        return f;
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
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        if (leg2 != null) {
            i = leg2.getType();
        } else {
            i = -1;
        }
        if (i == 3) {
            View K = mo45401K((WaitToTransitLineLeg) leg2);
            if (K != null) {
                return Collections.singletonList(K);
            }
            return Collections.emptyList();
        } else if (i == 8) {
            PathwayWalkLegExtraView pathwayWalkLegExtraView = new PathwayWalkLegExtraView(getContext(), (AttributeSet) null);
            pathwayWalkLegExtraView.mo45399a((PathwayWalkLeg) leg2);
            return Collections.singletonList(pathwayWalkLegExtraView);
        } else if (i != 10) {
            return Collections.emptyList();
        } else {
            View K2 = mo45401K(((WaitToMultiTransitLinesLeg) leg2).mo48467b());
            if (K2 != null) {
                return Collections.singletonList(K2);
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: s */
    public final String mo45385s(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        Resources resources = getResources();
        SpannableStringBuilder e = C7925b.f23935b.mo24605e(getContext(), multiTransitLinesLeg.mo48339o1().mo24631g(), multiTransitLinesLeg.mo48331K1().mo24631g());
        int size = multiTransitLinesLeg.mo48440b().f42111e.size() - 1;
        return resources.getString(R.string.transit_leg_footer_text, new Object[]{getResources().getQuantityString(R.plurals.stops, size, new Object[]{Integer.valueOf(size)}), e});
    }

    /* renamed from: t */
    public final View mo45392t(Leg leg) {
        int i;
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        TransitLineLeg b = multiTransitLinesLeg.mo48440b();
        Context context = getContext();
        C12622a aVar = new C12622a(context, UiUtils.m40248g(context, 3.5f), UiUtils.m40249h(context.getResources(), 1.0f), C7843b.m17874a(context, b.f42110d.get().mo24369b()).f41007b, C20941h.m49043f(R.attr.colorOnStatus, context), C20941h.m49043f(R.attr.colorInfo, context));
        aVar.mo39414c(multiTransitLinesLeg.mo48331K1(), DbEntityRef.getEntities(multiTransitLinesLeg.mo48440b().f42111e));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = UiUtils.m40248g(getContext(), 12.0f);
        layoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.screen_edge));
        aVar.setLayoutParams(layoutParams);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.multi_transit_line_leg_view_footer, this, false);
        viewGroup.addView(aVar);
        boolean z = true;
        if (multiTransitLinesLeg.f42086b.size() <= 1) {
            z = false;
        }
        View findViewById = viewGroup.findViewById(R.id.header_bar);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (z) {
            viewGroup.findViewById(R.id.footer_action).setOnClickListener(new C4054t(4, this, multiTransitLinesLeg));
            C19728f a = C19728f.m47195a(getContext());
            ListItemView listItemView = (ListItemView) viewGroup.findViewById(R.id.line_view);
            C16181a.m41233b(a.mo52082b(LinePresentationType.ITINERARY), listItemView, multiTransitLinesLeg.mo48440b().f42110d.get());
            listItemView.setVisibility(0);
        }
        return viewGroup;
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        if (C13717b.m34258e(((MultiTransitLinesLeg) leg).mo48440b().f42111e)) {
            return AbstractLegView.FooterViewType.FIXED_TEXT;
        }
        return AbstractLegView.FooterViewType.EXPANDED_VIEW;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        return getResources().getString(R.string.tripplan_itinerary_ride);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        return this.f38715C.f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        int i;
        TransitType d = C7843b.m17877d(C7843b.m17876c(((MultiTransitLinesLeg) leg).mo48440b().f42110d.get()));
        if (d != null) {
            i = d.f23760e.iconResId;
        } else {
            i = R.drawable.ic_transit_type_bus_24_on_surface;
        }
        return new ResourceImage(i, new String[0]);
    }

    /* renamed from: y */
    public final List mo45397y(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        return this.f38715C.f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
        return this.f38715C.f23651f;
    }
}
