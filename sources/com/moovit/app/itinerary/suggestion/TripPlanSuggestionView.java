package com.moovit.app.itinerary.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import ce0.C21100e;
import com.google.android.flexbox.FlexboxLayout;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16769e;

public abstract class TripPlanSuggestionView<L extends Leg> extends FlexboxLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f38632x = 0;

    /* renamed from: s */
    public final ListItemView f38633s;

    /* renamed from: t */
    public final TextView f38634t;

    /* renamed from: u */
    public final TextView f38635u;

    /* renamed from: v */
    public Itinerary f38636v;

    /* renamed from: w */
    public L f38637w;

    /* renamed from: com.moovit.app.itinerary.suggestion.TripPlanSuggestionView$a */
    public static class C15068a implements Leg.C16144a<TripPlanSuggestionView<?>> {

        /* renamed from: b */
        public final Context f38638b;

        /* renamed from: c */
        public final Itinerary f38639c;

        public C15068a(Context context, Itinerary itinerary) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f38638b = context;
            C21100e.m49373x(itinerary, "itinerary");
            this.f38639c = itinerary;
        }

        /* renamed from: o */
        public static <L extends Leg, V extends TripPlanSuggestionView<L>> V m38154o(V v, Itinerary itinerary, L l) {
            C21100e.m49373x(itinerary, "itinerary");
            v.f38636v = itinerary;
            C21100e.m49373x(l, "leg");
            v.f38637w = l;
            if (v.mo45330v(v.f38633s, v.f38634t, v.f38635u, itinerary, l, (C16769e.C16772c) null)) {
                return v;
            }
            return null;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return m38154o(new TripPlanMultiTransitLineSuggestionView(this.f38638b, (AttributeSet) null), this.f38639c, waitToMultiTransitLinesLeg);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo39911c(TaxiLeg taxiLeg) {
            return null;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return m38154o(new TripPlanSingleTransitLineSuggestionView(this.f38638b, (AttributeSet) null), this.f38639c, waitToTransitLineLeg);
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            return m38154o(new TripPlanCarpoolSuggestionView(this.f38638b, (AttributeSet) null), this.f38639c, carpoolLeg);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ Object mo39917i(BicycleLeg bicycleLeg) {
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return null;
        }

        /* renamed from: l */
        public final /* bridge */ /* synthetic */ Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return null;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return null;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Object mo39922n(TransitLineLeg transitLineLeg) {
            return null;
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return null;
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return null;
        }
    }

    public TripPlanSuggestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Itinerary getItinerary() {
        return this.f38636v;
    }

    /* renamed from: v */
    public abstract boolean mo45330v(ListItemView listItemView, TextView textView, TextView textView2, Itinerary itinerary, L l, C16769e.C16772c cVar);

    public TripPlanSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAlignContent(2);
        setFlexDirection(0);
        setFlexWrap(1);
        int h = UiUtils.m40249h(context.getResources(), 6.0f);
        setPadding(0, h, 0, h);
        LayoutInflater.from(getContext()).inflate(R.layout.trip_plan_suggestion_view, this, true);
        this.f38633s = (ListItemView) findViewById(R.id.item);
        this.f38634t = (TextView) findViewById(R.id.title);
        this.f38635u = (TextView) findViewById(R.id.subtitle);
    }
}
