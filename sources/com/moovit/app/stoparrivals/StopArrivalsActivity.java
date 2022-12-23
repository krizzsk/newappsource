package com.moovit.app.stoparrivals;

import aa0.C7540l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C1021l0;
import androidx.viewpager2.widget.ViewPager2;
import bf0.C21049c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.commons.utils.UiUtils;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleLocation;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import ff0.C23349c;
import fk0.C23407f;
import g20.C17161i;
import ja0.C12791b;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.C24179b;
import mf0.C24362h;
import mf0.C24365j;
import n00.C18502h;
import p073e7.C4583a;
import p073e7.C4584b;
import p259t5.C6592b;
import p259t5.C6593c;
import p429cw.C16511a;
import p429cw.C16512b;
import p429cw.C16513c;
import p429cw.C16518h;
import p471eq.C16850a;
import p474et.C16877i;
import p474et.C16878j;
import p543hq.C17474b;
import p583jk.C17875h;
import p777rq.C19314d;
import p781ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import p824tp.C19728f;
import p858uz.C20061g;
import p977zz.C20941h;
import p977zz.C20964s0;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/StopArrivalsActivity;", "Lcom/moovit/app/MoovitAppActivity;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class StopArrivalsActivity extends MoovitAppActivity {

    /* renamed from: q0 */
    public static final /* synthetic */ int f39603q0 = 0;

    /* renamed from: U */
    public final C15317b f39604U = new C15317b(this);

    /* renamed from: X */
    public final C1021l0 f39605X = new C1021l0(C24365j.m61219a(C15322a.class), new StopArrivalsActivity$special$$inlined$viewModels$default$2(this), new StopArrivalsActivity$special$$inlined$viewModels$default$1(this), new StopArrivalsActivity$special$$inlined$viewModels$default$3(this));

    /* renamed from: Y */
    public final C21049c f39606Y = C23812a.m58432b(new StopArrivalsActivity$mapHelper$2(this));

    /* renamed from: Z */
    public final Rect f39607Z = new Rect();

    /* renamed from: l0 */
    public TextView f39608l0;

    /* renamed from: m0 */
    public ViewPager2 f39609m0;

    /* renamed from: n0 */
    public Button f39610n0;

    /* renamed from: o0 */
    public TextView f39611o0;

    /* renamed from: p0 */
    public View f39612p0;

    /* renamed from: com.moovit.app.stoparrivals.StopArrivalsActivity$a */
    public final class C15316a extends C12791b<StopArrival> {

        /* renamed from: k */
        public final int f39613k;

        /* renamed from: l */
        public final int f39614l;

        /* renamed from: m */
        public final C17161i<C16181a.C16184c, TransitLine> f39615m;

        public C15316a(C19728f fVar) {
            super(new ArrayList(), R.layout.stop_arrivals_card_view, (C12791b.C12792a) null);
            this.f39613k = C20941h.m49043f(R.attr.colorOnSurfaceEmphasisMedium, StopArrivalsActivity.this);
            this.f39614l = C20941h.m49043f(R.attr.colorCritical, StopArrivalsActivity.this);
            C17161i<C16181a.C16184c, TransitLine> b = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
            C24362h.m61210e(b, "metroContext.getTransitL…entationType.STOP_DETAIL)");
            this.f39615m = b;
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            int i;
            SpannableString spannableString;
            TextAppearanceSpan textAppearanceSpan;
            StopArrival stopArrival = (StopArrival) obj;
            C24362h.m61211f(fVar, "holder");
            C24362h.m61211f(stopArrival, "stopArrival");
            View f = fVar.mo39639f(R.id.item);
            C24362h.m61210e(f, "holder.getViewById(R.id.item)");
            TransitLineListItemView transitLineListItemView = (TransitLineListItemView) f;
            transitLineListItemView.mo24765v(this.f39615m, stopArrival.f39599b);
            transitLineListItemView.setSchedule(Schedule.m17783E(stopArrival.f39600c));
            ServiceStatusCategory serviceStatusCategory = stopArrival.f39602e;
            if (serviceStatusCategory != null) {
                i = serviceStatusCategory.getSmallIconResId();
            } else {
                i = 0;
            }
            transitLineListItemView.setIconTopEndDecorationDrawable(i);
            Time time = stopArrival.f39600c;
            TimeVehicleLocation timeVehicleLocation = time.f23912m;
            if (timeVehicleLocation != null) {
                int i2 = time.f23906g;
                View f2 = fVar.mo39639f(R.id.timer_view);
                C24362h.m61210e(f2, "holder.getViewById(R.id.timer_view)");
                Chronometer chronometer = (Chronometer) f2;
                chronometer.setBase(timeVehicleLocation.f23925c);
                Integer num = null;
                chronometer.setFormat((String) null);
                chronometer.setOnClickListener(new C4583a(this, 25));
                chronometer.setOnChronometerTickListener(new C16512b(this));
                chronometer.start();
                chronometer.setVisibility(0);
                View f3 = fVar.mo39639f(R.id.stops_view);
                C24362h.m61210e(f3, "holder.getViewById(R.id.stops_view)");
                TextView textView = (TextView) f3;
                TimeVehicleLocation.VehicleProgress vehicleProgress = timeVehicleLocation.f23927e;
                if (vehicleProgress != null) {
                    num = Integer.valueOf(vehicleProgress.f23929b);
                }
                if (num != null) {
                    int intValue = i2 - num.intValue();
                    if (intValue < 0) {
                        textView.setVisibility(4);
                    } else {
                        if (intValue == 0) {
                            spannableString = new SpannableString(textView.getContext().getString(R.string.live_location_info_next_stop));
                            textAppearanceSpan = C20964s0.m49084b(textView.getContext(), R.attr.textAppearanceCaptionStrong, R.attr.colorGood);
                        } else {
                            SpannableString spannableString2 = new SpannableString(textView.getContext().getResources().getQuantityString(R.plurals.live_location_stops_away, intValue, new Object[]{Integer.valueOf(intValue)}));
                            textAppearanceSpan = C20964s0.m49084b(textView.getContext(), R.attr.textAppearanceCaptionStrong, R.attr.colorOnSurfaceEmphasisMedium);
                            spannableString = spannableString2;
                        }
                        String valueOf = String.valueOf(intValue);
                        int M = C24179b.m60565M(spannableString, valueOf, 0, false, 6);
                        if (M == -1) {
                            spannableString.setSpan(textAppearanceSpan, 0, spannableString.length(), 33);
                        } else {
                            spannableString.setSpan(textAppearanceSpan, M, valueOf.length() + M, 33);
                        }
                        textView.setText(spannableString);
                        textView.setVisibility(0);
                    }
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                View f4 = fVar.mo39639f(R.id.empty_view);
                C24362h.m61210e(f4, "holder.getViewById(R.id.empty_view)");
                ((TextView) f4).setVisibility(8);
                return;
            }
            View f5 = fVar.mo39639f(R.id.stops_view);
            C24362h.m61210e(f5, "holder.getViewById(R.id.stops_view)");
            View f6 = fVar.mo39639f(R.id.timer_view);
            C24362h.m61210e(f6, "holder.getViewById(R.id.timer_view)");
            UiUtils.m40238F(8, (TextView) f5, (Chronometer) f6);
            View f7 = fVar.mo39639f(R.id.empty_view);
            C24362h.m61210e(f7, "holder.getViewById(R.id.empty_view)");
            TextView textView2 = (TextView) f7;
            textView2.setOnClickListener(new C4584b(this, 23));
            textView2.setVisibility(0);
        }

        /* renamed from: m */
        public final void mo45869m() {
            StopArrivalsActivity stopArrivalsActivity = StopArrivalsActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "line_status_clicked");
            stopArrivalsActivity.mo44545v2(aVar.mo49933a());
            new C16518h().show(StopArrivalsActivity.this.getSupportFragmentManager(), "vehicle_status_info_fragment");
        }
    }

    /* renamed from: com.moovit.app.stoparrivals.StopArrivalsActivity$b */
    public static final class C15317b extends C7540l {

        /* renamed from: d */
        public final /* synthetic */ StopArrivalsActivity f39617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15317b(StopArrivalsActivity stopArrivalsActivity) {
            super(10000);
            this.f39617d = stopArrivalsActivity;
        }

        /* renamed from: a */
        public final void mo19433a() {
            ServerId serverId = (ServerId) this.f39617d.getIntent().getParcelableExtra("stopId");
            if (serverId != null) {
                ArrayList parcelableArrayListExtra = this.f39617d.getIntent().getParcelableArrayListExtra("lineIds");
                if (parcelableArrayListExtra != null) {
                    C15322a y2 = this.f39617d.mo45868y2();
                    y2.getClass();
                    C25177g.m63218b(C17875h.m44315z(y2), (CoroutineContext) null, new StopArrivalsViewModel$refreshArrivals$1(y2, serverId, parcelableArrayListExtra, (C23349c<? super StopArrivalsViewModel$refreshArrivals$1>) null), 3);
                    mo23802c();
                    return;
                }
                throw new IllegalStateException("Did you use LiveLocationFragment.newInstance(...)?");
            }
            throw new IllegalStateException("Did you use LiveLocationFragment.newInstance(...)?");
        }
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        Integer num;
        List<StopArrival> list;
        C17474b.C17475a e1 = super.mo44521e1();
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.NUMBER_OF_RESULTS;
        TripsUpdateResult tripsUpdateResult = (TripsUpdateResult) mo45868y2().f39636h.getValue();
        if (tripsUpdateResult == null || (list = tripsUpdateResult.f39628c) == null) {
            num = null;
        } else {
            num = Integer.valueOf(list.size());
        }
        e1.mo49938f(analyticsAttributeKey, num);
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.stop_arrivals_activity);
        Fragment n1 = mo44529n1(R.id.map_fragment);
        C24362h.m61210e(n1, "fragmentById(R.id.map_fragment)");
        MapFragment mapFragment = (MapFragment) n1;
        mapFragment.mo48640k3(MapFragment.MapFollowMode.NONE);
        MapOverlaysLayout mapOverlaysLayout = mapFragment.f42386w;
        C24362h.m61210e(mapOverlaysLayout, "mapFragment.overlaysParent");
        LayoutInflater.from(this).inflate(R.layout.stop_arrivals_map_overlay, mapOverlaysLayout, true);
        View findViewById = mapOverlaysLayout.findViewById(R.id.stop_name);
        C24362h.m61210e(findViewById, "mapOverlay.findViewById(R.id.stop_name)");
        TextView textView = (TextView) findViewById;
        this.f39608l0 = textView;
        textView.setSelected(true);
        View findViewById2 = mapOverlaysLayout.findViewById(R.id.close_button);
        C24362h.m61210e(findViewById2, "mapOverlay.findViewById(R.id.close_button)");
        ((ImageButton) findViewById2).setOnClickListener(new C16850a(this, 20));
        View findViewById3 = mapOverlaysLayout.findViewById(R.id.map_zoom_line_button);
        C24362h.m61210e(findViewById3, "mapOverlay.findViewById(R.id.map_zoom_line_button)");
        ((ImageButton) findViewById3).setOnClickListener(new C6592b(this, 27));
        View findViewById4 = findViewById(R.id.view_pager);
        C24362h.m61210e(findViewById4, "findViewById(R.id.view_pager)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById4;
        this.f39609m0 = viewPager2;
        Resources resources = viewPager2.getContext().getResources();
        C18502h hVar = new C18502h(UiUtils.m40249h(resources, (float) 16), UiUtils.m40249h(resources, (float) 12), UiUtils.m40249h(resources, (float) 24));
        viewPager2.setOffscreenPageLimit(Math.max(1, viewPager2.getOffscreenPageLimit()));
        viewPager2.f5074k.mo4593g(hVar, -1);
        viewPager2.setPageTransformer(hVar);
        C19728f fVar = (C19728f) mo44537r1("METRO_CONTEXT");
        ViewPager2 viewPager22 = this.f39609m0;
        if (viewPager22 != null) {
            viewPager22.setAdapter(new C15316a(fVar));
            ViewPager2 viewPager23 = this.f39609m0;
            if (viewPager23 != null) {
                viewPager23.f5067d.f5104a.add(new C16513c(this));
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.pager_indicator_container);
                View findViewById5 = viewGroup.findViewById(R.id.reset_button);
                C24362h.m61210e(findViewById5, "findViewById(R.id.reset_button)");
                Button button = (Button) findViewById5;
                this.f39610n0 = button;
                button.setOnClickListener(new C6593c(this, 28));
                View findViewById6 = viewGroup.findViewById(R.id.indicator);
                C24362h.m61210e(findViewById6, "findViewById(R.id.indicator)");
                ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) findViewById6;
                ViewPager2 viewPager24 = this.f39609m0;
                if (viewPager24 != null) {
                    scrollingPagerIndicator.mo61315b(viewPager24, new C23407f());
                    View findViewById7 = viewGroup.findViewById(R.id.slider_indicator);
                    C24362h.m61210e(findViewById7, "findViewById(R.id.slider_indicator)");
                    TextView textView2 = (TextView) findViewById7;
                    this.f39611o0 = textView2;
                    textView2.setText(getString(R.string.slider_indication, new Object[]{0, 0}));
                    TextView textView3 = this.f39611o0;
                    if (textView3 != null) {
                        textView3.setVisibility(4);
                        View findViewById8 = viewGroup.findViewById(R.id.progress);
                        C24362h.m61210e(findViewById8, "findViewById(R.id.progress)");
                        this.f39612p0 = findViewById8;
                        findViewById8.setVisibility(0);
                        View findViewById9 = findViewById(R.id.banner_ad_fragment);
                        C24362h.m61210e(findViewById9, "viewById(R.id.banner_ad_fragment)");
                        C14741h hVar2 = new C14741h();
                        hVar2.mo44745a(1, mo44542u1());
                        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById9).getFragment()).mo44739o2(AdSource.STOP_ARRIVALS_SCREEN_BANNER, hVar2);
                        View findViewById10 = findViewById(R.id.root);
                        C24362h.m61210e(findViewById10, "findViewById(R.id.root)");
                        findViewById10.getViewTreeObserver().addOnGlobalLayoutListener(new C16511a(this));
                        mo45868y2().f39639k.observe(this, new C16877i(new StopArrivalsActivity$onReady$2(this), 2));
                        mo45868y2().f39636h.observe(this, new C16878j(new StopArrivalsActivity$onReady$3(this), 1));
                        mo45868y2().f39638j.observe(this, new C19314d(new StopArrivalsActivity$onReady$4(this), 1));
                        return;
                    }
                    C24362h.m61217l("slidesIndicator");
                    throw null;
                }
                C24362h.m61217l("viewPager");
                throw null;
            }
            C24362h.m61217l("viewPager");
            throw null;
        }
        C24362h.m61217l("viewPager");
        throw null;
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f39604U.mo23804e();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        this.f39604U.mo23803d();
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        C20061g permissionAwareHighAccuracyFrequentUpdates = C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
        C24362h.m61210e(permissionAwareHighAccuracyFrequentUpdates, "get(this).permissionAwar…ghAccuracyFrequentUpdates");
        return permissionAwareHighAccuracyFrequentUpdates;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        C24362h.m61211f(bundle, "args");
        if (C24362h.m61206a(str, "empty_results_dialog_tag")) {
            if (i == -1) {
                finish();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final C15322a mo45868y2() {
        return (C15322a) this.f39605X.getValue();
    }
}
