package com.moovit.app.tripplanner;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.home.tab.HomeTabSpec;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.C15584c;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.genies.Genie;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.C16245a;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerParams;
import com.tranzmate.R;
import j00.C17691i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import m10.C18316a;
import p001a0.C0016g;
import p001a0.C0017h;
import p145k5.C5487f;
import p543hq.C17474b;
import p567iq.C17637d;
import p716oy.C18860a;
import p805su.C19542d;
import p808sx.C19565a;
import p808sx.C19567c;
import p927xw.C20634c;
import z20.C20806a;

public abstract class TripPlannerActivity<P extends TripPlannerParams, O extends TripPlannerOptions, LF extends C15578a, OF extends C15581b<O>, RF extends TripPlannerResultsFragment<O>> extends MoovitAppActivity implements C15578a.C15580b, C15581b.C15582a, C15584c.C15585a, TripPlannerResultsFragment.C15577a<O> {

    /* renamed from: q0 */
    public static final /* synthetic */ int f40505q0 = 0;

    /* renamed from: U */
    public final C19565a f40506U = new C19565a(this);

    /* renamed from: X */
    public LineStyle f40507X = null;

    /* renamed from: Y */
    public int f40508Y = 0;

    /* renamed from: Z */
    public MarkerZoomStyle f40509Z;

    /* renamed from: l0 */
    public Object f40510l0 = null;

    /* renamed from: m0 */
    public MarkerZoomStyle f40511m0;

    /* renamed from: n0 */
    public Object f40512n0 = null;

    /* renamed from: o0 */
    public Object f40513o0;

    /* renamed from: p0 */
    public boolean f40514p0 = false;

    /* renamed from: z2 */
    public static <P extends TripPlannerParams, O extends TripPlannerOptions, LF extends C15578a, OF extends C15581b<O>, RF extends TripPlannerResultsFragment<O>, A extends TripPlannerActivity<P, O, LF, OF, RF>> Intent m39768z2(Context context, Class<A> cls, P p, boolean z) {
        Intent intent = new Intent(context, cls);
        intent.addFlags(603979776);
        intent.putExtra("extra_trip_plan_params", p);
        intent.putExtra("extra_auto_search", z);
        return intent;
    }

    /* renamed from: A2 */
    public abstract C15578a mo45660A2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions);

    /* renamed from: B2 */
    public abstract OF mo45661B2(O o);

    /* renamed from: C2 */
    public abstract RF mo45662C2(TripPlannerLocations tripPlannerLocations, O o);

    /* renamed from: D1 */
    public final void mo44858D1(TripPlannerLocations tripPlannerLocations) {
        mo46522L2(tripPlannerLocations);
        if (this.f40508Y == 1) {
            mo45129h1();
        }
    }

    /* renamed from: D2 */
    public final LF mo46519D2() {
        return (C15578a) getSupportFragmentManager().mo3923A("trip_plan_locations_fragment_tag");
    }

    /* renamed from: E2 */
    public final OF mo46520E2() {
        return (C15581b) getSupportFragmentManager().mo3923A("trip_plan_options_fragment_tag");
    }

    /* renamed from: F2 */
    public TripPlannerLocations mo45957F2(Intent intent) {
        TripPlannerParams tripPlannerParams = (TripPlannerParams) intent.getParcelableExtra("extra_trip_plan_params");
        if (tripPlannerParams == null) {
            return null;
        }
        return new TripPlannerLocations(tripPlannerParams.f23788b, tripPlannerParams.f23789c);
    }

    /* renamed from: G1 */
    public final void mo45128G1() {
        if (this.f40508Y == 1) {
            mo45129h1();
        }
    }

    /* renamed from: G2 */
    public O mo45663G2(Intent intent) {
        return null;
    }

    /* renamed from: H2 */
    public boolean mo45958H2(Intent intent) {
        return intent.getBooleanExtra("extra_auto_search", false);
    }

    /* renamed from: I2 */
    public final void mo46521I2(int i) {
        if (this.f40508Y != i) {
            this.f40508Y = i;
            long j = 0;
            if (i == 0) {
                boolean z = !this.f40514p0;
                C15578a D2 = mo46519D2();
                Resources resources = D2.getResources();
                int h = UiUtils.m40249h(resources, 29.0f);
                int h2 = UiUtils.m40249h(resources, 40.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                View view = D2.f40524p;
                C17691i.C17694c cVar = C17691i.f45443a;
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofInt(view, cVar, new int[]{h, h2}), ObjectAnimator.ofInt(D2.f40525q, cVar, new int[]{h, h2})});
                if (z) {
                    j = (long) D2.getResources().getInteger(17694721);
                }
                animatorSet.setDuration(j);
                animatorSet.start();
            } else if (i == 1) {
                boolean z2 = !this.f40514p0;
                C15578a D22 = mo46519D2();
                Resources resources2 = D22.getResources();
                int h3 = UiUtils.m40249h(resources2, 40.0f);
                int h4 = UiUtils.m40249h(resources2, 29.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                View view2 = D22.f40524p;
                C17691i.C17694c cVar2 = C17691i.f45443a;
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofInt(view2, cVar2, new int[]{h3, h4}), ObjectAnimator.ofInt(D22.f40525q, cVar2, new int[]{h3, h4})});
                if (z2) {
                    j = (long) D22.getResources().getInteger(17694721);
                }
                animatorSet2.setDuration(j);
                animatorSet2.start();
            }
        }
    }

    /* renamed from: J2 */
    public void mo45959J2(TripPlannerLocations tripPlannerLocations) {
        boolean z;
        int i;
        View view;
        int i2 = 0;
        this.f40514p0 = false;
        boolean b = tripPlannerLocations.mo24458b();
        if (this.f40508Y == 1) {
            z = true;
        } else {
            z = false;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SEARCH_ROUTE_REQUEST);
        aVar.mo49941i(AnalyticsAttributeKey.IS_LOCATION_DESCRIPTORS_SET, b);
        aVar.mo49941i(AnalyticsAttributeKey.IS_IN_REFINE_MODE, z);
        mo44545v2(aVar.mo49933a());
        C20806a.C20807a aVar2 = new C20806a.C20807a("find_routes_tap");
        aVar2.mo52934b(tripPlannerLocations.f23786b.mo24313f(), "origin_address");
        aVar2.mo52934b(tripPlannerLocations.f23787c.mo24313f(), "destination_address");
        aVar2.f52526d = 30;
        aVar2.mo52935c();
        C15581b E2 = mo46520E2();
        O o = E2.f40537p;
        if (C18860a.m45884a().f48028p == TripPlannerAlgorithmType.PREFERRED && (view = E2.getView()) != null) {
            C18316a.f46708c.mo50767a(Genie.TRIP_PLAN_PREFERENCES, view.findViewById(R.id.route_options), this);
        }
        TripPlannerResultsFragment tripPlannerResultsFragment = (TripPlannerResultsFragment) getSupportFragmentManager().mo3923A("trip_plan_results_fragment_tag");
        if (tripPlannerResultsFragment != null) {
            tripPlannerResultsFragment.mo46523m2(tripPlannerLocations, o);
            return;
        }
        C15584c cVar = (C15584c) getSupportFragmentManager().mo3923A("trip_plan_search_button_fragment_tag");
        TripPlannerResultsFragment C2 = mo45662C2(tripPlannerLocations, o);
        C2.f40515n = this;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        boolean z2 = this.f40514p0;
        if (z2) {
            i = 0;
        } else {
            i = R.anim.trip_planner_enter_results;
        }
        if (!z2) {
            i2 = R.anim.trip_planner_exit_options;
        }
        K.mo4112g(i, i2, R.anim.trip_planner_pop_enter_options, R.anim.trip_planner_pop_exit_results);
        K.mo4049o(cVar);
        K.mo4041e(R.id.fragments_container, C2, "trip_plan_results_fragment_tag", 1);
        K.mo4110c("trip_plan_results_fragment_tag");
        K.mo4040d();
    }

    /* renamed from: K2 */
    public boolean mo45664K2() {
        for (HomeTabSpec homeTabSpec : ((C17637d) getSystemService("ui_configuration")).f45344a) {
            if (HomeTab.TRIP_PLANNER.equals(homeTabSpec.f38422b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L2 */
    public final void mo46522L2(TripPlannerLocations tripPlannerLocations) {
        boolean z;
        LatLonE6 latLonE6;
        boolean z2;
        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3923A("trip_plan_map_fragment_tag");
        if (mapFragment != null && mapFragment.mo48624U2()) {
            Object obj = this.f40513o0;
            LatLonE6 latLonE62 = null;
            if (obj != null) {
                mapFragment.mo48639j3(obj);
                this.f40513o0 = null;
            }
            Object obj2 = this.f40510l0;
            if (obj2 != null) {
                mapFragment.mo48636g3(obj2);
                this.f40510l0 = null;
            }
            Object obj3 = this.f40512n0;
            if (obj3 != null) {
                mapFragment.mo48636g3(obj3);
                this.f40512n0 = null;
            }
            LocationDescriptor locationDescriptor = tripPlannerLocations.f23786b;
            if (locationDescriptor != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                latLonE6 = locationDescriptor.mo24310d();
            } else {
                latLonE6 = null;
            }
            LocationDescriptor locationDescriptor2 = tripPlannerLocations.f23787c;
            if (locationDescriptor2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                latLonE62 = locationDescriptor2.mo24310d();
            }
            if (latLonE6 != null) {
                if (this.f40509Z == null) {
                    this.f40509Z = new MarkerZoomStyle(new ResourceImage(R.drawable.ic_trip_start_16_on_surface_emphasis_high, new String[0]));
                }
                this.f40510l0 = mapFragment.mo48646o2(latLonE6, latLonE6, this.f40509Z);
            }
            if (latLonE62 != null) {
                if (this.f40511m0 == null) {
                    this.f40511m0 = new MarkerZoomStyle(new ResourceImage(R.drawable.ic_map_end_trip_36_secondary, new String[0]));
                }
                this.f40512n0 = mapFragment.mo48646o2(latLonE62, latLonE62, this.f40511m0);
            }
            if (latLonE6 != null && latLonE62 != null) {
                Tasks.call(MoovitExecutors.COMPUTATION, new C5487f(3, latLonE6, latLonE62)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C19542d(1, this, mapFragment));
            } else if (latLonE62 != null) {
                mapFragment.mo48607C2(new C16245a.C16247b(latLonE62), true);
                mapFragment.mo48607C2(new C16245a.C16253h(mapFragment.mo48618O2()), true);
            } else if (latLonE6 != null) {
                mapFragment.mo48607C2(new C16245a.C16247b(latLonE6), true);
                mapFragment.mo48607C2(new C16245a.C16253h(mapFragment.mo48618O2()), true);
            }
        }
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        boolean z;
        if (!mo45664K2() || this.f40508Y != 1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return this instanceof AdjustAdsPreferencesActivity;
        }
        if (!onSupportNavigateUp()) {
            finish();
        }
        return true;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        C15581b E2 = mo46520E2();
        if (E2 != null) {
            TripPlannerOptions G2 = mo45663G2(intent);
            if (G2 != null) {
                E2.mo46541p2(G2, 0);
            }
            TripPlannerLocations F2 = mo45957F2(intent);
            if (F2 != null) {
                C15578a D2 = mo46519D2();
                LocationDescriptor locationDescriptor = F2.f23786b;
                LocationDescriptor locationDescriptor2 = F2.f23787c;
                if (locationDescriptor != null) {
                    D2.mo46538y2(locationDescriptor);
                }
                if (locationDescriptor2 != null) {
                    D2.mo46537x2(locationDescriptor2);
                } else {
                    D2.getClass();
                }
            }
            this.f40514p0 = mo45958H2(intent);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        MapFragment y2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.trip_planner);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo793o(false);
        }
        if (bundle != null) {
            this.f40508Y = bundle.getInt("fragmentsState");
        } else {
            Intent intent = getIntent();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.mo3923A("trip_plan_locations_fragment_tag") == null) {
                C15578a A2 = mo45660A2(mo45957F2(intent), mo45663G2(intent));
                C0909a aVar = new C0909a(supportFragmentManager);
                aVar.mo4041e(R.id.tool_bar, A2, "trip_plan_locations_fragment_tag", 1);
                aVar.mo4040d();
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            if (supportFragmentManager2.mo3923A("trip_plan_map_fragment_tag") == null && (y2 = mo45665y2()) != null) {
                y2.mo48649p3(false, false);
                C0909a aVar2 = new C0909a(supportFragmentManager2);
                aVar2.mo4041e(R.id.fragments_container, y2, "trip_plan_map_fragment_tag", 1);
                aVar2.mo4040d();
                findViewById(R.id.fragments_container).getViewTreeObserver().addOnGlobalLayoutListener(new C19567c(this));
                y2.mo48656t2(new C20634c(this, 1));
            }
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            if (supportFragmentManager3.mo3923A("trip_plan_options_fragment_tag") == null) {
                C15581b B2 = mo45661B2(mo45663G2(intent));
                C0909a aVar3 = new C0909a(supportFragmentManager3);
                aVar3.mo4041e(R.id.options_fragment_container, B2, "trip_plan_options_fragment_tag", 1);
                aVar3.mo4040d();
            }
            FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            if (supportFragmentManager4.mo3923A("trip_plan_search_button_fragment_tag") == null) {
                C15584c cVar = new C15584c();
                C0909a aVar4 = new C0909a(supportFragmentManager4);
                aVar4.mo4041e(R.id.fragments_container, cVar, "trip_plan_search_button_fragment_tag", 1);
                aVar4.mo4040d();
            }
            getSupportFragmentManager().mo3981x();
            this.f40514p0 = mo45958H2(intent);
        }
        TripPlannerResultsFragment tripPlannerResultsFragment = (TripPlannerResultsFragment) getSupportFragmentManager().mo3923A("trip_plan_results_fragment_tag");
        if (tripPlannerResultsFragment != null) {
            tripPlannerResultsFragment.f40515n = this;
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        boolean z;
        super.mo24881f2();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_routes");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.AUTO_SEND;
        if (!this.f40514p0 || !mo46519D2().mo46532s2().mo24458b()) {
            z = false;
        } else {
            z = true;
        }
        aVar.mo49941i(analyticsAttributeKey, z);
        mo44545v2(aVar.mo49933a());
        if (this.f40514p0) {
            mo45129h1();
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putInt("fragmentsState", this.f40508Y);
    }

    /* renamed from: h1 */
    public void mo45129h1() {
        C15578a D2 = mo46519D2();
        TripPlannerLocations s2 = D2.mo46532s2();
        if (!s2.mo24458b()) {
            D2.mo46531m2();
        } else {
            mo45959J2(s2);
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        getSupportFragmentManager().mo3948b(this.f40506U);
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19565a aVar = this.f40506U;
        ArrayList<FragmentManager.C0897m> arrayList = supportFragmentManager.f3634m;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "HISTORY", "TAXI_PROVIDERS_MANAGER", "TRIP_PLANNER_CONFIGURATION", "TRIP_PLAN_SUPPORT_VALIDATOR");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        hashSet.add("LATEST_ITINERARY_CONTROLLER");
        return s1;
    }

    /* renamed from: y2 */
    public abstract MapFragment mo45665y2();
}
