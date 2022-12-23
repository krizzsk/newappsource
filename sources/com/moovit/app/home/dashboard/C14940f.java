package com.moovit.app.home.dashboard;

import a00.C13382a;
import aa0.C7530f;
import aa0.C7539k;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0441n1;
import b00.C13556a;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.location.places.Place;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.location.C16202a;
import com.moovit.request.RequestOptions;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16797v;
import e20.C16799x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p028ba.C1513g;
import p073e7.C4583a;
import p304x.C7087p;
import p373au.C13533e;
import p455dy.C16753e;
import p583jk.C17884p;
import p589jq.C17909a;
import p716oy.C18860a;
import p784rx.C19377c;
import p824tp.C19728f;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20941h;
import p977zz.C20964s0;
import q00.C19047a;
import q20.C19078d;
import v90.C13187a;

/* renamed from: com.moovit.app.home.dashboard.f */
public abstract class C14940f extends C15682c<MoovitActivity> implements C16753e.C16756c {

    /* renamed from: F */
    public static final long f38218F = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: G */
    public static final /* synthetic */ int f38219G = 0;

    /* renamed from: A */
    public C13187a f38220A;

    /* renamed from: B */
    public C17909a f38221B;

    /* renamed from: C */
    public final ArrayList f38222C = new ArrayList(2);

    /* renamed from: D */
    public LocationFavorite f38223D;

    /* renamed from: E */
    public String f38224E;

    /* renamed from: n */
    public final C14941a f38225n = new C14941a();

    /* renamed from: o */
    public final C0441n1 f38226o = new C0441n1(this, 11);

    /* renamed from: p */
    public C16769e f38227p;

    /* renamed from: q */
    public final Handler f38228q = new Handler();

    /* renamed from: r */
    public TextView f38229r;

    /* renamed from: s */
    public ViewGroup f38230s;

    /* renamed from: t */
    public TextView f38231t;

    /* renamed from: u */
    public View f38232u;

    /* renamed from: v */
    public View f38233v;

    /* renamed from: w */
    public UserAccountManager f38234w;

    /* renamed from: x */
    public C16753e f38235x;

    /* renamed from: y */
    public long f38236y;

    /* renamed from: z */
    public C13556a f38237z;

    /* renamed from: com.moovit.app.home.dashboard.f$a */
    public class C14941a extends C20438i<C16797v, C16799x> {
        public C14941a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C16797v vVar = (C16797v) cVar;
            C14940f.this.getTag();
            C14940f.this.f38237z = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16797v vVar = (C16797v) cVar;
            C14940f.this.getTag();
            C14940f fVar = C14940f.this;
            List<Itinerary> list = ((C16799x) gVar).f43752m;
            int i = C14940f.f38219G;
            fVar.mo45153z2(list);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16797v vVar = (C16797v) cVar;
            C14940f fVar = C14940f.this;
            int i = C14940f.f38219G;
            fVar.mo45144A2();
            return true;
        }
    }

    public C14940f() {
        super(MoovitActivity.class);
    }

    /* renamed from: A2 */
    public final void mo45144A2() {
        getTag();
        getTag();
        C16769e eVar = this.f38227p;
        if (eVar != null) {
            eVar.mo23803d();
        }
        LocationFavorite p2 = mo45116p2(this.f38235x);
        if (p2 != null) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) p2.f52687b;
            int round = Math.round(C7530f.m17271d(this.f38230s.getContext(), locationDescriptor.mo24310d()));
            if (round < 0) {
                mo45145B2(locationDescriptor);
            } else if (round <= 300) {
                getTag();
                mo45149t2(R.layout.favorite_item_text_content);
                TextView textView = (TextView) this.f38230s.findViewById(R.id.content);
                textView.setText(R.string.suggested_routes_close);
                textView.setTextColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisHigh, textView.getContext()));
                this.f38224E = "close_location";
            } else if (round <= 4000) {
                LatLonE6 d = locationDescriptor.mo24310d();
                getTag();
                mo45149t2(R.layout.favorite_item_walk);
                Context context = this.f38230s.getContext();
                TextView textView2 = (TextView) this.f38230s.findViewById(R.id.walk_time);
                int c = C19078d.m46201c(context, d, (C19047a) mo46776J1("CONFIGURATION"));
                textView2.setText(C7925b.f23935b.mo24602b(context, (long) c));
                textView2.setContentDescription(getString(R.string.voice_over_suggest_routs_walk, Integer.valueOf(c)));
                ((TextView) this.f38230s.findViewById(R.id.walk_distance)).setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, (float) round), context));
                this.f38224E = "walk";
            } else {
                mo45145B2(locationDescriptor);
            }
        }
    }

    /* renamed from: B2 */
    public final void mo45145B2(LocationDescriptor locationDescriptor) {
        mo45149t2(R.layout.favorite_item_text_content);
        UiUtils.m40236D((TextView) this.f38230s.findViewById(R.id.content), locationDescriptor.mo24313f(), 4);
        this.f38224E = "address";
    }

    /* renamed from: C2 */
    public final void mo45146C2() {
        UserAccountManager userAccountManager = this.f38234w;
        if (userAccountManager != null && !userAccountManager.mo46576g()) {
            Context requireContext = requireContext();
            C19377c.m46656a(requireContext, TrackingEvent.FAVORITE_LOCATION_CONNECT_POP_UP_DISPLAYED, new C7087p(10, this, requireContext));
        }
    }

    /* renamed from: D2 */
    public final void mo45147D2(int i) {
        View findViewById;
        A a = this.f40822c;
        if (a != null && (findViewById = a.findViewById(R.id.alert_conditions)) != null) {
            Snackbar.m35159l(findViewById, i, 0).mo42259p();
        }
    }

    /* renamed from: E2 */
    public final void mo45148E2() {
        if (this.f40824e && mo46775H1()) {
            LocationFavorite p2 = mo45116p2(this.f38235x);
            if (p2 == null || !p2.equals(this.f38223D)) {
                mo45151x2(p2);
                return;
            }
            C16753e eVar = this.f38235x;
            boolean z = false;
            if (!(eVar == null || mo45116p2(eVar) == null || SystemClock.elapsedRealtime() - this.f38236y < f38218F)) {
                z = true;
            }
            if (z) {
                mo45152y2();
                return;
            }
            this.f38228q.removeCallbacks(this.f38226o);
            this.f38228q.postDelayed(this.f38226o, f38218F);
            C16769e eVar2 = this.f38227p;
            if (eVar2 != null) {
                eVar2.mo23804e();
            }
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(5);
        hashSet.add("USER_ACCOUNT");
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f38220A = (C13187a) mo46776J1("TRIP_PLANNER_CONFIGURATION");
        this.f38221B = (C17909a) mo46776J1("ACCESSIBILITY_CONFIGURATION");
        UserAccountManager userAccountManager = (UserAccountManager) mo46776J1("USER_ACCOUNT");
        this.f38234w = userAccountManager;
        C16753e d = userAccountManager.mo46573d();
        this.f38235x = d;
        if (this.f40824e) {
            d.mo49434h(this);
        }
        mo45148E2();
    }

    /* renamed from: h */
    public final void mo44786h(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: k */
    public void mo44787k(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: m2 */
    public abstract Intent mo45113m2(LocationDescriptor locationDescriptor);

    /* renamed from: n2 */
    public abstract int mo45114n2();

    /* renamed from: o2 */
    public abstract int mo45115o2();

    public final void onActivityResult(int i, int i2, Intent intent) {
        LocationDescriptor locationDescriptor;
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    mo45146C2();
                    mo45147D2(mo45117q2());
                    return;
                }
                return;
            case 1002:
                if (i2 == -1) {
                    mo45146C2();
                    return;
                }
                return;
            case Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3 /*1003*/:
                if (i2 == -1 && intent != null && (locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result")) != null) {
                    startActivityForResult(mo45113m2(locationDescriptor), 1001);
                    return;
                }
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.favorite_location_item_fragment, viewGroup, false);
        inflate.setOnClickListener(new C4583a(this, 8));
        ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(mo45119s2());
        this.f38229r = (TextView) inflate.findViewById(R.id.title);
        this.f38230s = (ViewGroup) inflate.findViewById(R.id.content_layout);
        this.f38231t = (TextView) inflate.findViewById(R.id.show_more_view);
        this.f38233v = inflate.findViewById(R.id.menu_arrow);
        View findViewById = inflate.findViewById(R.id.menu_button);
        this.f38232u = findViewById;
        findViewById.setContentDescription(findViewById.getContext().getString(R.string.voice_over_options));
        View view = this.f38232u;
        view.setOnClickListener(new C7539k(view, R.menu.dashboard_menu_location_special, new C13533e(this, 7)));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C16753e eVar = this.f38235x;
        if (eVar != null) {
            eVar.mo49434h(this);
        }
        mo45148E2();
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f38237z;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38237z = null;
            this.f38236y = 0;
        }
        C16753e eVar = this.f38235x;
        if (eVar != null) {
            eVar.mo49446u(this);
        }
        getTag();
        C16769e eVar2 = this.f38227p;
        if (eVar2 != null) {
            eVar2.mo23803d();
        }
        this.f38228q.removeCallbacks(this.f38226o);
    }

    /* renamed from: p2 */
    public abstract LocationFavorite mo45116p2(C16753e eVar);

    /* renamed from: q2 */
    public abstract int mo45117q2();

    /* renamed from: r2 */
    public abstract String mo45118r2();

    /* renamed from: s */
    public final void mo44788s(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: s2 */
    public abstract int mo45119s2();

    /* renamed from: t1 */
    public void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: t2 */
    public final void mo45149t2(int i) {
        this.f38230s.removeAllViews();
        this.f38222C.clear();
        this.f38231t.setVisibility(8);
        getLayoutInflater().inflate(i, this.f38230s, true);
    }

    /* renamed from: u2 */
    public abstract void mo45120u2(LocationFavorite locationFavorite);

    /* renamed from: v2 */
    public abstract void mo45121v2(C16753e eVar);

    /* renamed from: w2 */
    public final void mo45150w2(int i) {
        startActivityForResult(SearchLocationActivity.m17347y2(requireContext(), new AppSearchLocationCallback(i, R.string.empty_location_search_history, true, true, false), "dashboard_favorites_section", (String) null), Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3);
    }

    /* renamed from: x2 */
    public final void mo45151x2(LocationFavorite locationFavorite) {
        String str;
        getTag();
        this.f38223D = locationFavorite;
        getTag();
        C16769e eVar = this.f38227p;
        if (eVar != null) {
            eVar.mo23803d();
        }
        if (locationFavorite != null) {
            TextView textView = this.f38229r;
            if (!C20964s0.m49090h(locationFavorite.f40599c)) {
                str = locationFavorite.f40599c;
            } else {
                str = getString(mo45114n2());
            }
            textView.setText(str);
            this.f38232u.setVisibility(0);
            this.f38233v.setVisibility(8);
        } else {
            this.f38229r.setText(mo45115o2());
            this.f38232u.setVisibility(8);
            this.f38233v.setVisibility(0);
        }
        if (locationFavorite == null) {
            Resources resources = getResources();
            C13382a.m33674j(getView(), resources.getString(mo45115o2()), resources.getString(R.string.voiceover_favorites_add));
            getTag();
            mo45149t2(R.layout.favorite_item_empty);
            return;
        }
        C13382a.m33674j(getView(), "");
        getTag();
        mo45149t2(R.layout.favorite_item_text_content);
        UiUtils.m40236D((TextView) this.f38230s.findViewById(R.id.content), ((LocationDescriptor) locationFavorite.f52687b).mo24313f(), 4);
        this.f38224E = "loading";
        mo45152y2();
    }

    /* renamed from: y0 */
    public final void mo44790y0(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: y2 */
    public final void mo45152y2() {
        LocationFavorite p2;
        if (this.f40822c != null && (p2 = mo45116p2(this.f38235x)) != null) {
            LatLonE6 j = LatLonE6.m40177j(mo46780O1());
            if (j == null) {
                getTag();
                mo45153z2((List<Itinerary>) null);
                return;
            }
            C16797v vVar = new C16797v(mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"), (C19047a) mo46776J1("CONFIGURATION"), TripPlannerTime.m17899f(), this.f38220A.mo40061b(), this.f38220A.mo40063d(), this.f38220A.mo40060a(), this.f38221B.mo50463a(), LocationDescriptor.m17770k(j), (LocationDescriptor) p2.f52687b, C18860a.m45884a().f48028p);
            getTag();
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C16797v.class, sb, "_");
            sb.append(C17884p.m44333D(C17884p.m44335F(vVar.f43745w), C17884p.m44335F(vVar.f43746x), C17884p.m44335F(vVar.f43748z), C17884p.m44335F(vVar.f43747y), C17884p.m44335F(vVar.f43737A), C17884p.m44335F(vVar.f43738B), C17884p.m44335F(vVar.f43739C), C17884p.m44335F(vVar.f43740D), C17884p.m44335F(vVar.f43741E), vVar.f43742F));
            String sb2 = sb.toString();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            L1.f42908e = true;
            this.f38237z = mo46793f2(sb2, vVar, L1, this.f38225n);
            this.f38236y = SystemClock.elapsedRealtime();
            this.f38228q.removeCallbacks(this.f38226o);
            this.f38228q.postDelayed(this.f38226o, f38218F);
        }
    }

    /* renamed from: z2 */
    public final void mo45153z2(List<Itinerary> list) {
        getTag();
        int i = 0;
        ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, new C1513g(this, 0));
        C13717b.m34261h(c);
        if (C13717b.m34258e(c)) {
            getTag();
            mo45144A2();
            return;
        }
        this.f38230s.removeAllViews();
        this.f38222C.clear();
        for (O o : c) {
            this.f38222C.add(o);
            this.f38230s.addView(o);
        }
        TextView textView = this.f38231t;
        if (this.f38230s.getChildCount() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (this.f38227p == null) {
            this.f38227p = new C14942g(this, requireContext());
        }
        C16769e eVar = this.f38227p;
        this.f38227p = eVar;
        eVar.mo49465g(list);
        this.f38227p.mo23804e();
        this.f38224E = "public_transit";
    }
}
