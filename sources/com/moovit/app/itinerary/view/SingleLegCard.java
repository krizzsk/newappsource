package com.moovit.app.itinerary.view;

import a00.C13382a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c20.C13744a;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.leg.PathwayWalkLegExtraView;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.taxi.providers.TaxiTripPlanConfig;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.l10n.C16181a;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseItemIntent;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.taxi.TaxiPrice;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.C7843b;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.moovit.util.time.Time;
import com.moovit.view.DirectionsView;
import com.moovit.view.ScheduleView;
import com.tranzmate.R;
import e20.C16783l;
import ea0.C12622a;
import f00.C16919g;
import g20.C17161i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p310x5.C7157b;
import p310x5.C7158c;
import p373au.C13532d;
import p373au.C13535g;
import p373au.C13536h;
import p453dw.C16738n;
import p496fr.C17065b;
import p543hq.C17474b;
import p584jl.C17885a;
import p638lr.C18262i;
import p638lr.C18267n;
import p716oy.C18860a;
import p872vp.C20195b;
import p877vu.C20233c;
import p899ws.C20406f;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20975x0;
import x00.C20440a;

public class SingleLegCard extends CoordinatorLayout implements MicroMobilityIntegrationView.C4150c {

    /* renamed from: n0 */
    public static final /* synthetic */ int f38664n0 = 0;

    /* renamed from: A */
    public TextView f38665A;

    /* renamed from: B */
    public TextView f38666B;

    /* renamed from: C */
    public ImageView f38667C;

    /* renamed from: D */
    public TextView f38668D;

    /* renamed from: E */
    public ImagesOrTextsView f38669E;

    /* renamed from: F */
    public ImageView f38670F;

    /* renamed from: G */
    public ScheduleView f38671G;

    /* renamed from: H */
    public Space f38672H;

    /* renamed from: I */
    public PathwayWalkLegExtraView f38673I;

    /* renamed from: J */
    public LinearLayout f38674J;

    /* renamed from: K */
    public TextView f38675K;

    /* renamed from: L */
    public LinearLayout f38676L;

    /* renamed from: M */
    public View f38677M;

    /* renamed from: N */
    public MaterialCardView f38678N;

    /* renamed from: O */
    public boolean f38679O;

    /* renamed from: P */
    public C15073a f38680P;

    /* renamed from: Q */
    public Leg f38681Q;

    /* renamed from: R */
    public C17161i<C16181a.C16184c, TransitLine> f38682R;

    /* renamed from: S */
    public FloatingActionButton f38683S;

    /* renamed from: T */
    public Schedule f38684T;

    /* renamed from: U */
    public TextView f38685U;

    /* renamed from: l0 */
    public ImageView f38686l0;

    /* renamed from: m0 */
    public NextArrivalsView f38687m0;

    public static class Behavior extends CoordinatorLayout.Behavior<FloatingActionButton> {

        /* renamed from: a */
        public boolean f38688a;

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int i = ((CoordinatorLayout.C0752e) floatingActionButton.getLayoutParams()).topMargin;
            if (floatingActionButton.getTop() < i) {
                floatingActionButton.offsetTopAndBottom(i - floatingActionButton.getTop());
                this.f38688a = true;
                return true;
            }
            this.f38688a = false;
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view2);
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            return this.f38688a;
        }
    }

    /* renamed from: com.moovit.app.itinerary.view.SingleLegCard$a */
    public interface C15073a {
    }

    public SingleLegCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setupCarLeg(CarLeg carLeg) {
        boolean z;
        boolean z2;
        Context context = getContext();
        LocationDescriptor locationDescriptor = carLeg.f41961e;
        setupIcon(locationDescriptor.f23655j);
        UiUtils.m40234B(this.f38668D, locationDescriptor.f23651f);
        setupSubtitle(locationDescriptor.f23652g);
        mo45352J(carLeg.f41958b, carLeg.f41959c);
        setInstruction(getResources().getString(R.string.tripplan_itinerary_ride));
        this.f38677M.setVisibility(8);
        this.f38675K.setText(getResources().getString(R.string.units_distance_left, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, carLeg.f41962f.mo24339Z0()), context)}));
        this.f38666B.setVisibility(0);
        if (carLeg.f41963g != null) {
            z = true;
        } else {
            z = false;
        }
        C16919g.C16920a aVar = C20233c.f51336a;
        if (C20975x0.m49121h(context, "com.waze") || C20975x0.m49121h(context, "com.google.android.apps.maps")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            MicroMobilityIntegrationView d = C13532d.m33909d(this.f38674J, carLeg.f41963g);
            d.setListener(this);
            ViewGroup.MarginLayoutParams a = C13532d.m33906a(getResources());
            if (z2) {
                a.bottomMargin = 0;
            }
            this.f38674J.addView(d, a);
        }
        if (z2) {
            LinearLayout linearLayout = this.f38674J;
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.car_leg_navigate_action_view, linearLayout, false);
            inflate.setOnClickListener(new C7157b(1, this, carLeg));
            ViewGroup.MarginLayoutParams a2 = C13532d.m33906a(getResources());
            if (z) {
                a2.topMargin = 0;
            }
            this.f38674J.addView(inflate, a2);
        }
    }

    private void setupExtraNextArrivalsView(WaitToTransitLineLeg waitToTransitLineLeg) {
        Time time = null;
        NextArrivalsView nextArrivalsView = new NextArrivalsView(getContext(), (AttributeSet) null);
        this.f38687m0 = nextArrivalsView;
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
        }
        nextArrivalsView.setBaseTime(time);
        this.f38687m0.mo45343a(waitToTransitLineLeg, waitToTransitLineLeg.f42138i.f42142b);
        this.f38674J.addView(this.f38687m0);
    }

    private void setupExtraShowMoreOptionsView(WaitToTransitLineLeg waitToTransitLineLeg) {
        if (!C13532d.m33910e(getContext())) {
            this.f38677M.setVisibility(8);
            return;
        }
        Button button = (Button) LayoutInflater.from(getContext()).inflate(R.layout.single_card_leg_wait_leg_action_view, this, false);
        button.setText(R.string.tripplan_itinerary_more);
        button.setOnClickListener(new C13535g(0, this, waitToTransitLineLeg));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(UiUtils.m40249h(getResources(), 8.0f));
        this.f38676L.addView(button, layoutParams);
    }

    private void setupIcon(Image image) {
        C13744a.m34300b(this.f38667C, image);
    }

    private void setupPathwayWalkLeg(Leg leg) {
        if (leg == null || leg.getType() != 8) {
            this.f38673I.setVisibility(8);
            return;
        }
        this.f38673I.mo45399a((PathwayWalkLeg) leg);
        this.f38673I.setVisibility(0);
    }

    private void setupSubtitle(List<C20440a> list) {
        if (!C13717b.m34258e(list)) {
            this.f38669E.setItems(list);
            this.f38669E.setVisibility(0);
            return;
        }
        this.f38669E.setVisibility(8);
    }

    private void setupWaitToMultiTransitLinesLeg(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        Time time;
        int i;
        mo45349G();
        this.f38675K.setVisibility(8);
        WaitToTransitLineLeg b = waitToMultiTransitLinesLeg.mo48467b();
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(b.f42132c);
        } else {
            time = null;
        }
        ArrayList<O> c = C13720d.m34273c(waitToMultiTransitLinesLeg.f42117b, (C13722f) null, new C18262i(2));
        NextArrivalsView nextArrivalsView = new NextArrivalsView(getContext(), (AttributeSet) null);
        this.f38687m0 = nextArrivalsView;
        nextArrivalsView.setBaseTime(time);
        this.f38687m0.setLinesSchedules(c);
        this.f38674J.addView(this.f38687m0);
        int size = C13720d.m34277g(this.f38687m0.getDisplayedLinesSchedules(), (C13722f) null, new C18267n(5)).size();
        if (!C13532d.m33910e(getContext())) {
            this.f38677M.setVisibility(8);
        } else {
            int size2 = waitToMultiTransitLinesLeg.f42117b.size() - size;
            Button button = (Button) LayoutInflater.from(getContext()).inflate(R.layout.single_card_leg_wait_leg_action_view, this, false);
            if (size2 > 0) {
                button.setText(getResources().getQuantityString(R.plurals.tripplan_itinerary_view_show_more_options, size2, new Object[]{Integer.valueOf(size2)}));
            } else {
                button.setText(getResources().getString(R.string.tripplan_itinerary_more));
            }
            button.setOnClickListener(new C7158c(1, this, waitToMultiTransitLinesLeg));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(UiUtils.m40249h(getResources(), 8.0f));
            this.f38676L.addView(button, layoutParams);
        }
        setupWaitToMultiTransitLinesServiceAlertView(waitToMultiTransitLinesLeg);
        List<C20944i0<WaitToTransitLineLeg, Schedule>> displayedLinesSchedules = this.f38687m0.getDisplayedLinesSchedules();
        Resources resources = getResources();
        if (displayedLinesSchedules.size() > 1) {
            i = R.string.tripplan_itinerary_wait_multiple;
        } else {
            i = R.string.tripplan_itinerary_wait;
        }
        setInstruction(resources.getString(i));
        C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38687m0.getContentDescription());
        C13382a.m33672h(this.f38665A);
        C13382a.m33672h(this.f38668D);
        C13382a.m33672h(this.f38669E);
        C13382a.m33672h(this.f38675K);
    }

    private void setupWaitToMultiTransitLinesServiceAlertView(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        ArrayList z = C16783l.m42494z(waitToMultiTransitLinesLeg);
        if (C13723g.m34280a(z, new C20406f(5))) {
            Context context = getContext();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, UiUtils.m40248g(context, 5.0f), 0, UiUtils.m40249h(context.getResources(), 1.0f));
            LineServiceAlertDigestView lineServiceAlertDigestView = new LineServiceAlertDigestView(context, (AttributeSet) null);
            lineServiceAlertDigestView.setLayoutParams(layoutParams);
            lineServiceAlertDigestView.setLineServiceAlertDigests(z);
            this.f38674J.addView(lineServiceAlertDigestView);
        }
    }

    private void setupWaitToTransitLineLeg(WaitToTransitLineLeg waitToTransitLineLeg) {
        mo45349G();
        this.f38675K.setVisibility(8);
        setupExtraNextArrivalsView(waitToTransitLineLeg);
        setupExtraShowMoreOptionsView(waitToTransitLineLeg);
        setupWaitToTransitLineServiceAlertView(waitToTransitLineLeg);
        setInstruction(getResources().getString(R.string.tripplan_itinerary_wait));
        C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38687m0.getContentDescription());
        C13382a.m33672h(this.f38665A);
        C13382a.m33672h(this.f38668D);
        C13382a.m33672h(this.f38669E);
        C13382a.m33672h(this.f38675K);
    }

    private void setupWaitToTransitLineServiceAlertView(WaitToTransitLineLeg waitToTransitLineLeg) {
        LineServiceAlertDigest lineServiceAlertDigest = waitToTransitLineLeg.f42139j;
        if (lineServiceAlertDigest != null && ServiceStatusCategory.IMPORTANT_LEVEL.contains(lineServiceAlertDigest.f23186c.f23213b)) {
            Context context = getContext();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int g = UiUtils.m40248g(context, 10.0f);
            layoutParams.setMargins(0, g, 0, g);
            LineServiceAlertDigestView lineServiceAlertDigestView = new LineServiceAlertDigestView(context, (AttributeSet) null);
            lineServiceAlertDigestView.setLayoutParams(layoutParams);
            lineServiceAlertDigestView.setLineServiceAlertDigest(lineServiceAlertDigest);
            this.f38674J.addView(lineServiceAlertDigestView);
        }
    }

    /* renamed from: F */
    public final C12622a mo45348F(TransitLineLeg transitLineLeg) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.transit_leg_stops_radius);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.transit_leg_stops_stroke_size);
        Context context = getContext();
        C12622a aVar = new C12622a(context, dimensionPixelSize, dimensionPixelSize2, C7843b.m17874a(context, transitLineLeg.f42110d.get().mo24369b()).f41007b, C20941h.m49043f(R.attr.colorOnStatus, context), C20941h.m49043f(R.attr.colorInfo, context));
        aVar.setTag("stops_view");
        return aVar;
    }

    /* renamed from: G */
    public final void mo45349G() {
        this.f38667C.setVisibility(8);
        this.f38668D.setVisibility(8);
        this.f38669E.setVisibility(8);
        this.f38670F.setVisibility(8);
        this.f38671G.setVisibility(8);
        this.f38672H.setVisibility(8);
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: H */
    public final void mo45350H(Leg leg, Leg leg2, boolean z, C17161i<C16181a.C16184c, TransitLine> iVar, C16738n nVar) {
        boolean z2;
        int i;
        int i2;
        Image image;
        Leg leg3 = leg;
        Leg leg4 = leg2;
        C16738n nVar2 = nVar;
        this.f38681Q = leg3;
        this.f38682R = iVar;
        int indexOfChild = this.f38676L.indexOfChild(this.f38677M) + 1;
        if (this.f38676L.getChildCount() > indexOfChild) {
            LinearLayout linearLayout = this.f38676L;
            linearLayout.removeViews(indexOfChild, linearLayout.getChildCount() - indexOfChild);
        }
        this.f38670F.setVisibility(8);
        this.f38671G.setVisibility(8);
        this.f38672H.setVisibility(8);
        this.f38673I.setVisibility(8);
        this.f38674J.removeAllViews();
        this.f38674J.setVisibility(8);
        this.f38677M.setVisibility(0);
        if (z) {
            Context context = getContext();
            LocationDescriptor W = leg.mo48332W();
            setupIcon(leg.mo48332W().f23655j);
            UiUtils.m40234B(this.f38668D, W.f23651f);
            setupSubtitle(W.f23652g);
            this.f38677M.setVisibility(8);
            setInstruction(context.getResources().getString(R.string.tripplan_itinerary_startfrom));
            String l = C7925b.m18024l(context, leg.mo48339o1().mo24631g());
            this.f38675K.setText(context.getResources().getString(R.string.tripplan_itinerary_leave_time, new Object[]{l}));
            if (W.f23647b == LocationDescriptor.LocationType.STOP) {
                mo45354L(nVar2, W.f23649d);
            }
            C13382a.m33674j(this.f38678N, context.getResources().getString(R.string.tripplan_itinerary_startfrom), W.f23651f, C20195b.m47767k(W.f23652g), this.f38675K.getText());
            C13382a.m33672h(this.f38665A);
            C13382a.m33672h(this.f38675K);
            return;
        }
        TaxiProvider taxiProvider = null;
        switch (leg.getType()) {
            case 1:
                WalkLeg walkLeg = (WalkLeg) leg3;
                Context context2 = getContext();
                LocationDescriptor locationDescriptor = walkLeg.f42150e;
                setupIcon(locationDescriptor.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor.f23651f);
                setupSubtitle(locationDescriptor.f23652g);
                SpannableStringBuilder e = C7925b.f23935b.mo24605e(context2, walkLeg.f42147b.mo24631g(), walkLeg.f42148c.mo24631g());
                setInstruction(getResources().getString(R.string.tripplan_itinerary_walk_to_time, new Object[]{e}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context2, walkLeg.f42151f.mo24339Z0()), context2));
                DirectionsView directionsView = new DirectionsView(context2, (AttributeSet) null);
                directionsView.mo24678a(C16783l.m42478j(context2, walkLeg.f42152g));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
                this.f38676L.addView(directionsView, layoutParams);
                mo45351I();
                LocationDescriptor locationDescriptor2 = walkLeg.f42150e;
                if (locationDescriptor2.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor2.f23649d);
                }
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38685U.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 2:
                if (mo45355M(leg4)) {
                    this.f38677M.setVisibility(4);
                }
                TransitLineLeg transitLineLeg = (TransitLineLeg) leg3;
                LocationDescriptor e2 = transitLineLeg.mo48334e2();
                setupIcon(e2.f23655j);
                UiUtils.m40234B(this.f38668D, e2.f23651f);
                setupSubtitle(e2.f23652g);
                mo45352J(transitLineLeg.f42108b, transitLineLeg.f42109c);
                int size = transitLineLeg.f42111e.size() - 1;
                setInstruction(getResources().getQuantityString(R.plurals.ride_stops_to, size, new Object[]{Integer.valueOf(size)}));
                C12622a F = mo45348F(transitLineLeg);
                F.mo39414c(transitLineLeg.f42109c, DbEntityRef.getEntities(transitLineLeg.f42111e));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams2.rightMargin = dimensionPixelSize2;
                layoutParams2.leftMargin = dimensionPixelSize2;
                this.f38676L.addView(F, layoutParams2);
                this.f38675K.setVisibility(8);
                this.f38666B.setVisibility(0);
                mo45354L(nVar2, transitLineLeg.mo48459b().getServerId());
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38666B.getContentDescription(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33673i(this.f38666B);
                break;
            case 3:
                setupWaitToTransitLineLeg((WaitToTransitLineLeg) leg3);
                break;
            case 5:
                TaxiLeg taxiLeg = (TaxiLeg) leg3;
                Context context3 = getContext();
                LocationDescriptor locationDescriptor3 = taxiLeg.f42101f;
                setupIcon(locationDescriptor3.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor3.f23651f);
                setupSubtitle(locationDescriptor3.f23652g);
                mo45352J(taxiLeg.f42098c, taxiLeg.f42099d);
                setInstruction(getResources().getString(R.string.tripplan_itinerary_ride));
                this.f38675K.setText(getResources().getString(R.string.units_distance_left, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(context3, taxiLeg.f42102g.mo24339Z0()), context3)}));
                this.f38666B.setVisibility(0);
                break;
            case 6:
                WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg3;
                TaxiProvidersManager b = TaxiProvidersManager.m39496b(getContext().getApplicationContext());
                if (b != null) {
                    taxiProvider = b.mo46163c(waitToTaxiLeg.f42122b);
                }
                if (taxiProvider != null) {
                    TaxiTripPlanConfig taxiTripPlanConfig = taxiProvider.f39977l;
                    setupIcon(taxiProvider.f39971f);
                    this.f38668D.setText(taxiTripPlanConfig.f39988b);
                    TaxiPrice taxiPrice = waitToTaxiLeg.f42126f;
                    if (taxiPrice != null) {
                        if (TaxiPrice.TaxiPriceType.METERED.equals(taxiPrice.f23230d)) {
                            this.f38669E.setText(R.string.taxi_metered);
                        } else {
                            this.f38669E.setText(taxiPrice.f23228b);
                        }
                        this.f38669E.setVisibility(0);
                    }
                    if (leg4 instanceof TaxiLeg) {
                        LinearLayout linearLayout2 = this.f38674J;
                        TaxiButtonSpec taxiButtonSpec = taxiTripPlanConfig.f39992f;
                        Button button = (Button) LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.taxi_action_view, linearLayout2, false);
                        C15413a.m39456a(button, taxiButtonSpec);
                        button.setOnClickListener(new C13536h(0, this, leg4));
                        this.f38674J.addView(button, C13532d.m33906a(getResources()));
                    }
                    int i3 = waitToTaxiLeg.f42127g;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    long millis = TimeUnit.SECONDS.toMillis((long) i3) + System.currentTimeMillis();
                    Schedule E = Schedule.m17783E(new Time(millis, millis));
                    this.f38671G.setSpanSystem(MinutesSpanFormatter.SpanSystem.PASSIVE);
                    this.f38671G.setPeekTimesMode(0);
                    this.f38671G.setSchedule(E);
                    this.f38671G.setVisibility(0);
                    this.f38672H.setVisibility(0);
                    setInstruction(getResources().getString(R.string.tripplan_itinerary_wait));
                    this.f38675K.setVisibility(8);
                    break;
                }
                break;
            case 9:
                if (mo45355M(leg4)) {
                    this.f38677M.setVisibility(4);
                }
                MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg3;
                TransitLineLeg b2 = multiTransitLinesLeg.mo48440b();
                LocationDescriptor e22 = multiTransitLinesLeg.mo48334e2();
                setupIcon(e22.f23655j);
                UiUtils.m40234B(this.f38668D, e22.f23651f);
                setupSubtitle(e22.f23652g);
                mo45352J(multiTransitLinesLeg.mo48339o1(), multiTransitLinesLeg.mo48331K1());
                int size2 = b2.f42111e.size() - 1;
                setInstruction(getResources().getQuantityString(R.plurals.ride_stops_to, size2, new Object[]{Integer.valueOf(size2)}));
                C12622a F2 = mo45348F(b2);
                F2.mo39414c(multiTransitLinesLeg.mo48331K1(), DbEntityRef.getEntities(b2.f42111e));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = UiUtils.m40248g(getContext(), 12.0f);
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams3.rightMargin = dimensionPixelSize3;
                layoutParams3.leftMargin = dimensionPixelSize3;
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.multi_transit_line_single_card_view_footer, this, false);
                viewGroup.addView(F2, layoutParams3);
                this.f38676L.addView(viewGroup);
                if (multiTransitLinesLeg.f42086b.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                View findViewById = viewGroup.findViewById(R.id.header_bar);
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById.setVisibility(i);
                if (z2) {
                    viewGroup.findViewById(R.id.footer_action).setOnClickListener(new C4054t(3, this, multiTransitLinesLeg));
                    ListItemView listItemView = (ListItemView) viewGroup.findViewById(R.id.line_view);
                    C16181a.m41233b(this.f38682R, listItemView, multiTransitLinesLeg.mo48440b().f42110d.get());
                    View findViewById2 = viewGroup.findViewById(R.id.footer_message_group);
                    if (this.f38679O) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    findViewById2.setVisibility(i2);
                }
                this.f38675K.setVisibility(8);
                this.f38666B.setVisibility(0);
                mo45354L(nVar2, b2.mo48459b().getServerId());
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38666B.getContentDescription(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33673i(this.f38666B);
                break;
            case 10:
                setupWaitToMultiTransitLinesLeg((WaitToMultiTransitLinesLeg) leg3);
                break;
            case 11:
                BicycleLeg bicycleLeg = (BicycleLeg) leg3;
                Context context4 = getContext();
                LocationDescriptor locationDescriptor4 = bicycleLeg.f41942e;
                setupIcon(locationDescriptor4.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor4.f23651f);
                setupSubtitle(locationDescriptor4.f23652g);
                SpannableStringBuilder e3 = C7925b.f23935b.mo24605e(context4, bicycleLeg.f41939b.mo24631g(), bicycleLeg.f41940c.mo24631g());
                setInstruction(getResources().getString(R.string.tripplan_itinerary_bike_time, new Object[]{e3}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context4, bicycleLeg.f41943f.mo24339Z0()), context4));
                DirectionsView directionsView2 = new DirectionsView(context4, (AttributeSet) null);
                directionsView2.mo24678a(C16783l.m42478j(context4, bicycleLeg.f41944g));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams4.rightMargin = dimensionPixelSize4;
                layoutParams4.leftMargin = dimensionPixelSize4;
                this.f38676L.addView(directionsView2, layoutParams4);
                LocationDescriptor locationDescriptor5 = bicycleLeg.f41942e;
                if (locationDescriptor5.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor5.f23649d);
                }
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 12:
                BicycleRentalLeg bicycleRentalLeg = (BicycleRentalLeg) leg3;
                Context context5 = getContext();
                LocationDescriptor e23 = bicycleRentalLeg.mo48334e2();
                if (bicycleRentalLeg.mo48344b() != null) {
                    Context context6 = this.f38667C.getContext();
                    bicycleRentalLeg.mo48344b().get().getClass();
                    image = BicycleStop.m17760c(context6);
                } else {
                    image = e23.f23655j;
                }
                setupIcon(image);
                UiUtils.m40234B(this.f38668D, e23.f23651f);
                setupSubtitle(e23.f23652g);
                SpannableStringBuilder e4 = C7925b.f23935b.mo24605e(context5, bicycleRentalLeg.f41947b.mo24631g(), bicycleRentalLeg.f41948c.mo24631g());
                setInstruction(getResources().getString(R.string.tripplan_itinerary_bike_time, new Object[]{e4}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context5, bicycleRentalLeg.f41953h.mo24339Z0()), context5));
                DirectionsView directionsView3 = new DirectionsView(context5, (AttributeSet) null);
                directionsView3.mo24678a(C16783l.m42478j(context5, bicycleRentalLeg.f41954i));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams5.rightMargin = dimensionPixelSize5;
                layoutParams5.leftMargin = dimensionPixelSize5;
                this.f38676L.addView(directionsView3, layoutParams5);
                if (bicycleRentalLeg.mo48334e2().f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, bicycleRentalLeg.mo48334e2().f23649d);
                }
                mo45351I();
                mo45353K(bicycleRentalLeg.f41955j, (AppDeepLink) null);
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38685U.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 14:
                DocklessCarLeg docklessCarLeg = (DocklessCarLeg) leg3;
                Context context7 = getContext();
                LocationDescriptor locationDescriptor6 = docklessCarLeg.f42021e;
                setupIcon(locationDescriptor6.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor6.f23651f);
                setupSubtitle(locationDescriptor6.f23652g);
                setInstruction(getResources().getString(R.string.tripplan_itinerary_drive_with, new Object[]{docklessCarLeg.f42024h.f42029c}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context7, docklessCarLeg.f42022f.mo24339Z0()), context7));
                DirectionsView directionsView4 = new DirectionsView(context7, (AttributeSet) null);
                directionsView4.mo24678a(C16783l.m42478j(context7, docklessCarLeg.f42023g));
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize6 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams6.rightMargin = dimensionPixelSize6;
                layoutParams6.leftMargin = dimensionPixelSize6;
                this.f38676L.addView(directionsView4, layoutParams6);
                LocationDescriptor locationDescriptor7 = docklessCarLeg.f42021e;
                if (locationDescriptor7.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor7.f23649d);
                }
                mo45353K(docklessCarLeg.f42026j, docklessCarLeg.f42025i);
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 15:
                DocklessScooterLeg docklessScooterLeg = (DocklessScooterLeg) leg3;
                Context context8 = getContext();
                LocationDescriptor locationDescriptor8 = docklessScooterLeg.f42065e;
                setupIcon(locationDescriptor8.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor8.f23651f);
                setupSubtitle(locationDescriptor8.f23652g);
                setInstruction(getResources().getString(R.string.tripplan_itinerary_ride_with, new Object[]{docklessScooterLeg.f42068h.f42073c}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context8, docklessScooterLeg.f42066f.mo24339Z0()), context8));
                DirectionsView directionsView5 = new DirectionsView(context8, (AttributeSet) null);
                directionsView5.mo24678a(C16783l.m42478j(context8, docklessScooterLeg.f42067g));
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize7 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams7.rightMargin = dimensionPixelSize7;
                layoutParams7.leftMargin = dimensionPixelSize7;
                this.f38676L.addView(directionsView5, layoutParams7);
                LocationDescriptor locationDescriptor9 = docklessScooterLeg.f42065e;
                if (locationDescriptor9.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor9.f23649d);
                }
                mo45353K(docklessScooterLeg.f42070j, docklessScooterLeg.f42069i);
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 16:
                DocklessMopedLeg docklessMopedLeg = (DocklessMopedLeg) leg3;
                Context context9 = getContext();
                LocationDescriptor locationDescriptor10 = docklessMopedLeg.f42043e;
                setupIcon(locationDescriptor10.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor10.f23651f);
                setupSubtitle(locationDescriptor10.f23652g);
                setInstruction(getResources().getString(R.string.tripplan_itinerary_ride_with, new Object[]{docklessMopedLeg.f42046h.f42051c}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context9, docklessMopedLeg.f42044f.mo24339Z0()), context9));
                DirectionsView directionsView6 = new DirectionsView(context9, (AttributeSet) null);
                directionsView6.mo24678a(C16783l.m42478j(context9, docklessMopedLeg.f42045g));
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize8 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams8.rightMargin = dimensionPixelSize8;
                layoutParams8.leftMargin = dimensionPixelSize8;
                this.f38676L.addView(directionsView6, layoutParams8);
                LocationDescriptor locationDescriptor11 = docklessMopedLeg.f42043e;
                if (locationDescriptor11.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor11.f23649d);
                }
                mo45353K(docklessMopedLeg.f42048j, docklessMopedLeg.f42047i);
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 17:
                DocklessBicycleLeg docklessBicycleLeg = (DocklessBicycleLeg) leg3;
                Context context10 = getContext();
                LocationDescriptor locationDescriptor12 = docklessBicycleLeg.f41999e;
                setupIcon(locationDescriptor12.f23655j);
                UiUtils.m40234B(this.f38668D, locationDescriptor12.f23651f);
                setupSubtitle(locationDescriptor12.f23652g);
                setInstruction(getResources().getString(R.string.tripplan_itinerary_ride_with, new Object[]{docklessBicycleLeg.f42002h.f42007c}));
                this.f38675K.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context10, docklessBicycleLeg.f42000f.mo24339Z0()), context10));
                DirectionsView directionsView7 = new DirectionsView(context10, (AttributeSet) null);
                directionsView7.mo24678a(C16783l.m42478j(context10, docklessBicycleLeg.f42001g));
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
                int dimensionPixelSize9 = getResources().getDimensionPixelSize(R.dimen.screen_edge);
                layoutParams9.rightMargin = dimensionPixelSize9;
                layoutParams9.leftMargin = dimensionPixelSize9;
                this.f38676L.addView(directionsView7, layoutParams9);
                LocationDescriptor locationDescriptor13 = docklessBicycleLeg.f41999e;
                if (locationDescriptor13.f23647b == LocationDescriptor.LocationType.STOP) {
                    mo45354L(nVar2, locationDescriptor13.f23649d);
                }
                mo45353K(docklessBicycleLeg.f42004j, docklessBicycleLeg.f42003i);
                C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38675K.getText());
                C13382a.m33672h(this.f38665A);
                C13382a.m33672h(this.f38668D);
                C13382a.m33672h(this.f38669E);
                C13382a.m33672h(this.f38675K);
                break;
            case 18:
                setupCarLeg((CarLeg) leg3);
                break;
        }
        setupPathwayWalkLeg(leg4);
        if (this.f38674J.getChildCount() > 0) {
            this.f38674J.setVisibility(0);
        }
    }

    /* renamed from: I */
    public final void mo45351I() {
        Context context = getContext();
        this.f38685U = (TextView) LayoutInflater.from(context).inflate(R.layout.bicycle_rental_leg_availability_view, this, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, UiUtils.m40248g(context, 4.0f), 0, UiUtils.m40249h(context.getResources(), 12.0f));
        this.f38685U.setLayoutParams(layoutParams);
        this.f38685U.setVisibility(8);
        this.f38674J.addView(this.f38685U);
    }

    /* renamed from: J */
    public final void mo45352J(Time time, Time time2) {
        MinutesSpanFormatter minutesSpanFormatter = C7925b.f23935b;
        this.f38666B.setText(minutesSpanFormatter.mo24606f(getContext(), time.mo24631g(), time2.mo24631g(), 60, Collections.emptyList()));
        C13382a.m33674j(this.f38666B, minutesSpanFormatter.mo24601a(getContext(), time.mo24631g(), time2.mo24631g(), 60, Collections.emptyList()));
    }

    /* renamed from: K */
    public final void mo45353K(MicroMobilityIntegrationItem microMobilityIntegrationItem, AppDeepLink appDeepLink) {
        if (microMobilityIntegrationItem != null) {
            MicroMobilityIntegrationView d = C13532d.m33909d(this.f38674J, microMobilityIntegrationItem);
            d.setListener(this);
            this.f38674J.addView(d, C13532d.m33906a(getResources()));
        } else if (appDeepLink != null) {
            View c = C13532d.m33908c(this.f38674J, appDeepLink);
            c.setOnClickListener(new C17065b(3, this, appDeepLink));
            this.f38674J.addView(c, C13532d.m33906a(getResources()));
        }
    }

    /* renamed from: L */
    public final void mo45354L(C16738n nVar, ServerId serverId) {
        if (serverId != null) {
            this.f38670F.setVisibility(0);
            nVar.mo49422v2(serverId, this.f38670F);
        } else {
            this.f38670F.setVisibility(8);
        }
        this.f38672H.setVisibility(this.f38670F.getVisibility());
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: M */
    public final boolean mo45355M(Leg leg) {
        int i;
        WaitToTransitLineLeg waitToTransitLineLeg;
        View f;
        if (leg != null) {
            i = leg.getType();
        } else {
            i = -1;
        }
        if (i == 3) {
            waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        } else if (i != 10) {
            waitToTransitLineLeg = null;
        } else {
            waitToTransitLineLeg = ((WaitToMultiTransitLinesLeg) leg).mo48467b();
        }
        if (waitToTransitLineLeg == null || (f = C16783l.m42474f(this.f38674J, waitToTransitLineLeg)) == null) {
            return false;
        }
        C13382a.m33674j(this.f38678N, f.getContentDescription());
        C13382a.m33672h(f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, UiUtils.m40248g(getContext(), 10.0f), 0, 0);
        this.f38674J.addView(f, layoutParams);
        return true;
    }

    /* renamed from: N */
    public final void mo45356N(int i) {
        int i2;
        if (i == -1) {
            this.f38685U.setVisibility(8);
            return;
        }
        if (this.f38681Q.getType() == 1) {
            i2 = R.plurals.available_bicycles;
        } else {
            i2 = R.plurals.available_bicycle_docks;
        }
        this.f38685U.setText(getResources().getQuantityString(i2, i, new Object[]{Integer.valueOf(i)}));
        this.f38685U.setVisibility(0);
        C13382a.m33674j(this.f38678N, this.f38665A.getText(), this.f38668D.getText(), this.f38669E.getText(), this.f38685U.getText(), this.f38675K.getText());
        C13382a.m33672h(this.f38665A);
        C13382a.m33672h(this.f38668D);
        C13382a.m33672h(this.f38669E);
        C13382a.m33672h(this.f38675K);
    }

    /* renamed from: W0 */
    public final void mo19494W0(ServerId serverId) {
        C15073a aVar = this.f38680P;
        if (aVar != null) {
            ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "view_ride_clicked");
            aVar2.mo49937e(AnalyticsAttributeKey.ID, serverId);
            itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
            itineraryStepsBaseActivity.startActivity(MicroMobilityRideActivity.m11106y2(itineraryStepsBaseActivity, serverId));
        }
    }

    public Schedule getLineSchedule() {
        return this.f38684T;
    }

    /* renamed from: m */
    public final void mo19495m(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        C15073a aVar = this.f38680P;
        if (aVar != null) {
            ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_integration_button_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C25541a.m63892w(microMobilityIntegrationFlow));
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, microMobilityIntegrationItem.f14812b);
            aVar2.mo49939g(AnalyticsAttributeKey.ITEM_ID, microMobilityIntegrationItem.f14813c);
            itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
            int i = ItineraryStepsBaseActivity.C15029c.f38517a[microMobilityIntegrationFlow.ordinal()];
            if (i == 1) {
                AppDeepLink appDeepLink = microMobilityIntegrationItem.f14815e;
                if (appDeepLink != null) {
                    appDeepLink.mo46946c(itineraryStepsBaseActivity);
                }
            } else if (i == 2 || i == 3) {
                MicroMobilityPurchaseItemIntent microMobilityPurchaseItemIntent = new MicroMobilityPurchaseItemIntent(microMobilityIntegrationItem.f14812b, microMobilityIntegrationItem.f14813c, microMobilityIntegrationFlow);
                int i2 = MicroMobilityPurchaseActivity.f14911Y;
                Intent intent = new Intent(itineraryStepsBaseActivity, MicroMobilityPurchaseActivity.class);
                intent.putExtra("purchaseIntent", microMobilityPurchaseItemIntent);
                itineraryStepsBaseActivity.startActivity(intent);
            }
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f38665A = (TextView) findViewById(R.id.leg_instruction);
        this.f38666B = (TextView) findViewById(R.id.duration_view);
        this.f38667C = (ImageView) findViewById(R.id.icon);
        this.f38668D = (TextView) findViewById(R.id.title);
        this.f38669E = (ImagesOrTextsView) findViewById(R.id.subtitle);
        this.f38670F = (ImageView) findViewById(R.id.stop_view);
        this.f38671G = (ScheduleView) findViewById(R.id.schedule_view);
        this.f38672H = (Space) findViewById(R.id.barrier_space);
        this.f38673I = (PathwayWalkLegExtraView) findViewById(R.id.pathway_view);
        this.f38674J = (LinearLayout) findViewById(R.id.leg_target_extra_views);
        this.f38675K = (TextView) findViewById(R.id.leg_metadata);
        this.f38676L = (LinearLayout) findViewById(R.id.content_container);
        this.f38677M = findViewById(R.id.divider);
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.card_view);
        this.f38678N = materialCardView;
        materialCardView.setCardBackgroundColor(materialCardView.getStrokeColorStateList());
        this.f38683S = (FloatingActionButton) findViewById(R.id.floating_button);
        this.f38686l0 = (ImageView) findViewById(R.id.last_leg_icon_view);
        ((CoordinatorLayout.C0752e) this.f38683S.getLayoutParams()).mo3351b(new Behavior());
    }

    public void setCardBottomExtraMargin(int i) {
        View findViewById = findViewById(R.id.card_wrapper);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + i);
    }

    public void setCardTopMargin(int i) {
        findViewById(R.id.spacer).setMinimumHeight(i);
    }

    public void setFabClickListener(View.OnClickListener onClickListener) {
        this.f38683S.setOnClickListener(onClickListener);
    }

    public void setFabStyle(boolean z) {
        if (z) {
            this.f38683S.setImageResource(R.drawable.ic_edit_24_on_primary);
            C17885a.m44443j(this.f38683S, 2131952807);
            return;
        }
        this.f38683S.setImageResource(R.drawable.ic_go_24);
        C17885a.m44443j(this.f38683S, 2131952806);
    }

    public void setInstruction(CharSequence charSequence) {
        this.f38665A.setText(charSequence);
    }

    public void setIsLastLeg(boolean z) {
        int i;
        ImageView imageView = this.f38686l0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (this.f38686l0.getVisibility() == 0 && this.f38667C.getVisibility() == 8) {
            setupIcon(new ResourceImage(R.drawable.ic_location_24_secondary, new String[0]));
        }
    }

    public void setLegActionsListener(C15073a aVar) {
        this.f38680P = aVar;
    }

    @SuppressLint({"NewApi"})
    public void setLiveLegType(boolean z) {
        this.f38679O = z;
        setActivated(z);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
    }

    public SingleLegCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
