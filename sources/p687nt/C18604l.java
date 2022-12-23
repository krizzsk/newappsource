package p687nt;

import a00.C13382a;
import aa0.C7540l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import b20.C13566a;
import c70.C13756i;
import c70.C13776p;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.moovit.C15676b;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14738f;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;
import com.moovit.app.map.layers.MapAdsLayerManager;
import com.moovit.app.map.layers.MapLayersManager;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.behavior.MyBottomSheetBehavior;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.view.AlertMessageView;
import com.moovit.location.C16202a;
import com.moovit.map.C16245a;
import com.moovit.map.C16277g;
import com.moovit.map.C16287l;
import com.moovit.map.MapFragment;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import com.moovit.map.items.MapItem;
import com.moovit.request.RequestOptions;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.view.ScheduleView;
import com.tranzmate.R;
import j00.C17688g;
import ja0.C12793c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n00.C18491a;
import n00.C18492b;
import o00.C18681n;
import o20.C18704j;
import p073e7.C4585c;
import p090g1.C4732a;
import p20.C18880g;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p259t5.C6592b;
import p450dt.C16703d;
import p455dy.C16753e;
import p471eq.C16850a;
import p543hq.C17474b;
import p567iq.C17635b;
import p663mt.C18432a;
import p687nt.C18589b;
import p687nt.C18618p;
import p824tp.C19728f;
import p831tw.C19787a;
import p831tw.C19789b;
import p858uz.C20061g;
import p874vr.C20199a;
import p977zz.C20932c0;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20944i0;
import q00.C19047a;
import q20.C19075a;
import x00.C20440a;

/* renamed from: nt.l */
public class C18604l extends C16703d implements C18618p.C18625g, C16753e.C16757d, C16753e.C16755b, C18589b.C18590a, C16287l.C16290c, C18704j {

    /* renamed from: T */
    public static final /* synthetic */ int f47374T = 0;

    /* renamed from: A */
    public C18618p.C18626h f47375A;

    /* renamed from: B */
    public C18612h f47376B;

    /* renamed from: C */
    public C18612h f47377C;

    /* renamed from: D */
    public MapFragment f47378D;

    /* renamed from: E */
    public ViewPager f47379E;

    /* renamed from: F */
    public AlertMessageView f47380F;

    /* renamed from: G */
    public TextView f47381G;

    /* renamed from: H */
    public boolean f47382H = false;

    /* renamed from: I */
    public C18595e f47383I;

    /* renamed from: J */
    public C16277g f47384J;

    /* renamed from: K */
    public final HashMap f47385K = new HashMap();

    /* renamed from: L */
    public C13566a f47386L;

    /* renamed from: M */
    public Object f47387M = null;

    /* renamed from: N */
    public C19787a f47388N;

    /* renamed from: O */
    public C18618p f47389O = null;

    /* renamed from: P */
    public C18618p f47390P = null;

    /* renamed from: Q */
    public final ExecutorService f47391Q = Executors.newSingleThreadExecutor(C20932c0.m49025a("nearby"));

    /* renamed from: R */
    public C18609e f47392R;

    /* renamed from: S */
    public C16287l f47393S;

    /* renamed from: o */
    public final C18605a f47394o = new C18605a();

    /* renamed from: p */
    public final C18600h f47395p = new C18600h(this);

    /* renamed from: q */
    public final C18606b f47396q = new C18606b();

    /* renamed from: r */
    public final C18607c f47397r = new C18607c();

    /* renamed from: s */
    public final C18601i f47398s = new C18601i(this);

    /* renamed from: t */
    public final C18608d f47399t = new C18608d();

    /* renamed from: u */
    public final C18613i f47400u = new C18613i();

    /* renamed from: v */
    public final C4585c f47401v = new C4585c(this, 12);

    /* renamed from: w */
    public C19728f f47402w = null;

    /* renamed from: x */
    public C19047a f47403x = null;

    /* renamed from: y */
    public TaxiProvider f47404y = null;

    /* renamed from: z */
    public C16753e f47405z = null;

    /* renamed from: nt.l$a */
    public class C18605a extends ViewPager.C15827c {
        public C18605a() {
        }

        /* renamed from: a */
        public final void mo45259a(int i) {
            String str;
            C16753e eVar;
            int b = C18604l.this.f47379E.mo47353b(i);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
            if (b == 0) {
                str = "nearby_clicked";
            } else {
                str = "favorites_clicked";
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            if (b == 1 && (eVar = C18604l.this.f47405z) != null) {
                aVar.mo49935c(AnalyticsAttributeKey.STOPS_COUNT, eVar.f43619c.size());
            }
            C18604l.this.mo46797j2(aVar.mo49933a());
        }

        /* renamed from: b */
        public final void mo47364b() {
        }
    }

    /* renamed from: nt.l$b */
    public class C18606b extends ScheduleView.C7927a {
        public C18606b() {
        }

        /* renamed from: a */
        public final void mo24745a() {
            C18604l lVar = C18604l.this;
            lVar.mo50996q2(lVar.f47375A);
        }
    }

    /* renamed from: nt.l$c */
    public class C18607c extends C7540l {
        public C18607c() {
        }

        /* renamed from: a */
        public final void mo19433a() {
            C18618p.C18624f fVar;
            C18604l lVar = C18604l.this;
            if (lVar.f40824e && lVar.f40822c != null && lVar.mo46783R1() != null) {
                C18604l lVar2 = C18604l.this;
                C18618p.C18626h hVar = lVar2.f47375A;
                if (hVar != null) {
                    fVar = hVar.f47465b;
                } else {
                    fVar = null;
                }
                lVar2.mo50996q2(fVar);
            }
        }

        /* renamed from: b */
        public final void mo21414b() {
            C18604l lVar = C18604l.this;
            if (!lVar.f40824e) {
                int i = C18604l.f47374T;
                C18618p pVar = lVar.f47390P;
                if (pVar != null) {
                    pVar.cancel(false);
                    C13776p andSet = pVar.f47446r.getAndSet((Object) null);
                    if (andSet != null) {
                        andSet.cancel(false);
                    }
                    lVar.f47390P = null;
                }
            }
        }
    }

    /* renamed from: nt.l$d */
    public class C18608d extends MapFragment.C16236q {

        /* renamed from: a */
        public LatLonE6 f47409a = null;

        /* renamed from: b */
        public float f47410b = -1.0f;

        public C18608d() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            LatLonE6 latLonE6;
            if (C18604l.this.f47403x != null) {
                boolean z = false;
                if (!MapFragment.C16236q.m41429a(i, 1) && (!MapFragment.C16236q.m41430b(i) || ((!MapFragment.C16236q.m41429a(i, 64) && MapFragment.C16236q.m41429a(i, 32)) || (!MapFragment.C16236q.m41429a(i, 4) && MapFragment.C16236q.m41429a(i, 2))))) {
                    z = true;
                }
                if (z) {
                    MapFragment X = C18604l.this.mo50993X();
                    LatLonE6 L2 = X.mo48615L2();
                    float S2 = X.mo48622S2();
                    if (S2 != this.f47410b || (latLonE6 = this.f47409a) == null || (!L2.equals(latLonE6) && LatLonE6.m40174c(L2, this.f47409a) >= ((float) ((Integer) C18604l.this.f47403x.mo51505b(C20199a.f51276g0)).intValue()))) {
                        C18604l lVar = C18604l.this;
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.MAP_MOVED);
                        aVar.mo49934b(AnalyticsAttributeKey.MAP_ZOOM, S2);
                        lVar.mo46797j2(aVar.mo49933a());
                        C18604l.this.mo50996q2((Object) null);
                        C18604l lVar2 = C18604l.this;
                        C19787a aVar2 = lVar2.f47388N;
                        if (aVar2 != null) {
                            C13756i a = C13756i.m34349a(lVar2.requireContext());
                            if (aVar2.f50306d.f39941d) {
                                C19789b bVar = new C19789b(L2, aVar2.f50305c, a.mo40679b());
                                StringBuilder sb = new StringBuilder();
                                C13715c.m34249o(C19789b.class, sb, "_");
                                sb.append(bVar.f50309w);
                                sb.append("_");
                                sb.append(bVar.f50310x);
                                String sb2 = sb.toString();
                                RequestOptions c = a.mo40680c();
                                c.f42909f = true;
                                a.mo40684g(sb2, bVar, c, aVar2.f50304b);
                            }
                        }
                        this.f47409a = L2;
                        this.f47410b = S2;
                    }
                }
            }
        }
    }

    /* renamed from: nt.l$e */
    public class C18609e extends C18432a {
        public C18609e(C15682c cVar, MapFragment mapFragment) {
            super(cVar, mapFragment);
        }

        /* renamed from: b */
        public final void mo50883b(LatLonE6 latLonE6, C15676b bVar, String str) {
            C18604l.this.f47383I.f47352c.setState(5);
            super.mo50883b(latLonE6, bVar, str);
        }
    }

    /* renamed from: nt.l$f */
    public class C18610f implements MapFragment.C16237r {

        /* renamed from: a */
        public final LatLonE6 f47413a;

        public C18610f(LatLonE6 latLonE6) {
            this.f47413a = latLonE6;
        }

        /* renamed from: a */
        public final void mo21406a() {
            MapFragment X = C18604l.this.mo50993X();
            X.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            X.mo48663x2(this.f47413a);
        }
    }

    /* renamed from: nt.l$g */
    public static class C18611g implements MapFragment.C16226h {

        /* renamed from: b */
        public final C16753e f47415b;

        public C18611g(C16753e eVar) {
            C21100e.m49373x(eVar, "fm");
            this.f47415b = eVar;
        }

        /* renamed from: c */
        public final boolean mo5858c(MapItem mapItem) {
            if (mapItem.f42549b != MapItem.Type.STOP || !this.f47415b.mo49442q(mapItem.f42550c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: nt.l$h */
    public class C18612h extends C18591c {

        /* renamed from: m */
        public final AlertMessageView f47416m;

        public C18612h(C18606b bVar, AlertMessageView alertMessageView) {
            super(bVar);
            C21100e.m49373x(alertMessageView, "emptyView");
            this.f47416m = alertMessageView;
        }
    }

    /* renamed from: nt.l$i */
    public class C18613i extends MapFragment.C16236q {
        public C18613i() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            LocationDescriptor locationDescriptor;
            LatLonE6 latLonE6;
            boolean z;
            if (C18604l.this.f47381G != null && !MapFragment.C16236q.m41430b(i) && (locationDescriptor = (LocationDescriptor) C18604l.this.f47381G.getTag()) != null) {
                MapFragment mapFragment = C18604l.this.f47378D;
                if (mapFragment != null) {
                    latLonE6 = mapFragment.mo48615L2();
                } else {
                    latLonE6 = null;
                }
                if (latLonE6 != null) {
                    LatLonE6 d = locationDescriptor.mo24310d();
                    if (latLonE6.equals(d) || LatLonE6.m40174c(latLonE6, d) <= 10.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C18604l.this.f47381G.setTag((Object) null);
                        C18604l lVar = C18604l.this;
                        C17688g.m43897a(lVar.f47381G, lVar.getString(R.string.search_locations_tab_hint), R.attr.colorOnSurfaceEmphasisMedium).start();
                    }
                }
            }
        }
    }

    /* renamed from: nt.l$j */
    public static class C18614j extends C18491a<RecyclerView> {

        /* renamed from: b */
        public final List<C20944i0<String, RecyclerView.Adapter<?>>> f47419b;

        public C18614j(ArrayList arrayList) {
            this.f47419b = arrayList;
        }

        /* renamed from: a */
        public final void mo23842a(int i, View view) {
            ((RecyclerView) view).setAdapter((RecyclerView.Adapter) this.f47419b.get(i).f52693b);
        }

        /* renamed from: b */
        public final View mo45295b(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), (AttributeSet) null);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setItemAnimator((RecyclerView.C1128j) null);
            C20440a aVar = C18591c.f47329l;
            SparseIntArray sparseIntArray = new SparseIntArray(5);
            sparseIntArray.put(5, R.drawable.divider_horizontal);
            sparseIntArray.put(6, R.drawable.divider_horizontal);
            sparseIntArray.put(2, R.drawable.divider_horizontal_full);
            sparseIntArray.put(3, R.drawable.divider_horizontal);
            sparseIntArray.put(4, R.drawable.divider_horizontal_full);
            recyclerView.mo4593g(new C18681n(context, sparseIntArray, false), -1);
            recyclerView.setAdapter(new C12793c());
            UiUtils.C15778b bVar = new UiUtils.C15778b();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15104u(recyclerView, bVar);
            return recyclerView;
        }

        public final int getCount() {
            return this.f47419b.size();
        }

        public final CharSequence getPageTitle(int i) {
            return (CharSequence) this.f47419b.get(i).f52692a;
        }
    }

    /* renamed from: C */
    public final void mo44784C() {
        mo50996q2((Object) null);
    }

    /* renamed from: F */
    public final void mo48822F(Set set) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            C18880g gVar = (C18880g) it.next();
            if (gVar instanceof C19075a) {
                C19075a aVar = (C19075a) gVar;
                if (aVar.mo51510a(DirectAdMetadata.class)) {
                    DirectAdMetadata directAdMetadata = (DirectAdMetadata) DirectAdMetadata.class.cast(aVar.f48497g);
                    if (sb.length() > 0) {
                        sb.append(';');
                    }
                    sb.append(directAdMetadata.f42489b);
                    if (sb2.length() > 0) {
                        sb2.append(';');
                    }
                    sb2.append(directAdMetadata.f42490c);
                    i++;
                }
            }
        }
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "direct_ads_impression");
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, sb.toString());
        aVar2.mo49939g(AnalyticsAttributeKey.RESULTS_QUERY_STRING, sb2.toString());
        aVar2.mo49935c(AnalyticsAttributeKey.COUNT, i);
        mo46797j2(aVar2.mo49933a());
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(6);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("GTFS_METRO_ENTITIES_LOADER");
        hashSet.add("GTFS_TRIPS_SCHEDULE_LOADER");
        hashSet.add("USER_ACCOUNT");
        hashSet.add("TAXI_PROVIDERS_MANAGER");
        return hashSet;
    }

    /* renamed from: N0 */
    public final void mo50982N0(LocationDescriptor locationDescriptor) {
        mo50995p2();
        TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
        dVar.f23790a = locationDescriptor;
        startActivity(SuggestRoutesActivity.m39325M2(this.f40822c, dVar.mo23958a(), true));
    }

    /* renamed from: S0 */
    public final void mo50983S0() {
        mo50995p2();
    }

    /* renamed from: T */
    public final void mo50992T(C18618p.C18626h hVar, boolean z) {
        boolean z2 = hVar.f47464a;
        View view = getView();
        boolean z3 = false;
        if (!(view == null || this.f47379E.getVisibility() == 0)) {
            this.f47379E.setVisibility(0);
            view.findViewById(R.id.tabs).setVisibility(0);
            view.findViewById(R.id.progress_indicator).setVisibility(8);
        }
        if (!hVar.f47464a) {
            this.f47390P = null;
            if (this.f47375A == null) {
                this.f47376B.mo50986j(hVar.f47467d, hVar.f47468e);
                this.f47377C.mo50986j(hVar.f47469f, hVar.f47470g);
                return;
            }
            return;
        }
        int size = hVar.f47465b.f47460e.size();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NEAR_ME_STOPS_SHOWN);
        aVar.mo49935c(AnalyticsAttributeKey.STOPS_COUNT, size);
        mo46797j2(aVar.mo49933a());
        if (this.f47385K.keySet().containsAll(hVar.f47465b.f47461f) && hVar.f47465b.f47461f.containsAll(this.f47385K.keySet())) {
            z3 = true;
        }
        if (!z3) {
            List<TransitStop> list = hVar.f47465b.f47461f;
            MapFragment X = mo50993X();
            X.mo48656t2(new C18599g(this, X, list));
        }
        this.f47376B.mo50986j(hVar.f47467d, hVar.f47468e);
        this.f47377C.mo50986j(hVar.f47469f, hVar.f47470g);
        if (!z) {
            this.f47390P = null;
            this.f47375A = hVar;
        }
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        TaxiProvider taxiProvider;
        super.mo40555V1();
        this.f47402w = (C19728f) mo46776J1("METRO_CONTEXT");
        this.f47403x = (C19047a) mo46776J1("CONFIGURATION");
        this.f47405z = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
        TaxiProvidersManager taxiProvidersManager = (TaxiProvidersManager) mo46776J1("TAXI_PROVIDERS_MANAGER");
        if (taxiProvidersManager.f39985b.isEmpty()) {
            taxiProvider = null;
        } else {
            taxiProvider = taxiProvidersManager.f39985b.get(0);
        }
        this.f47404y = taxiProvider;
        if (this.f40824e) {
            MapFragment X = mo50993X();
            C18611g gVar = new C18611g(this.f47405z);
            if (gVar != X.f42334A) {
                X.f42334A = gVar;
                X.mo48633d3();
            }
            this.f47405z.mo49436j(this);
            this.f47405z.mo49432f(this);
        }
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
        MoovitAppActivity moovitAppActivity = (MoovitAppActivity) this.f40822c;
        MapLayersManager mapLayersManager = new MapLayersManager(moovitAppActivity, aVar, mo50993X());
        if (mapLayersManager.f38923j != -1) {
            mapLayersManager.f38923j = -1;
            mapLayersManager.mo45503d();
            mapLayersManager.mo45502c();
        }
        moovitAppActivity.getLifecycle().mo4224a(mapLayersManager);
        moovitAppActivity.getLifecycle().mo4224a(new MapAdsLayerManager(moovitAppActivity, aVar, mo50993X()));
        mo50993X().mo48656t2(new C18598f(this));
    }

    /* renamed from: X */
    public final MapFragment mo50993X() {
        if (this.f47378D == null) {
            MapFragment mapFragment = (MapFragment) getChildFragmentManager().mo3983z(R.id.map_fragment);
            C21100e.m49373x(mapFragment, "mapFragment");
            this.f47378D = mapFragment;
        }
        return this.f47378D;
    }

    /* renamed from: X0 */
    public final void mo50994X0(int i) {
        this.f47382H = false;
        if (i < 5) {
            C18618p pVar = this.f47389O;
            if (pVar != null) {
                pVar.cancel(false);
                C13776p andSet = pVar.f47446r.getAndSet((Object) null);
                if (andSet != null) {
                    andSet.cancel(false);
                }
                this.f47389O = null;
            }
            MapFragment X = mo50993X();
            X.getClass();
            X.mo48607C2(new C16245a.C16253h(16.75f), true);
            return;
        }
        this.f47390P = this.f47389O;
        this.f47389O = null;
    }

    /* renamed from: f */
    public final void mo44785f() {
        mo50996q2((Object) null);
    }

    /* renamed from: f1 */
    public final void mo50984f1(LocationDescriptor locationDescriptor) {
        mo50995p2();
        startActivity(FavoriteLocationEditorActivity.m37663B2(this.f40822c, locationDescriptor));
    }

    /* renamed from: m2 */
    public final C17474b.C17475a mo49408m2(HomeActivity homeActivity) {
        C17474b.C17475a m2 = super.mo49408m2(homeActivity);
        C18618p.C18626h hVar = this.f47375A;
        if (hVar != null) {
            m2.mo49935c(AnalyticsAttributeKey.STOPS_COUNT, hVar.f47465b.f47460e.size());
        }
        return m2;
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) mo46799l2(R.id.tool_bar);
    }

    /* renamed from: o2 */
    public final boolean mo49409o2(Uri uri) {
        if (!"nearby".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String queryParameter = uri.getQueryParameter(ServerParameters.LAT_KEY);
        String queryParameter2 = uri.getQueryParameter(ServerParameters.LON_KEY);
        if (queryParameter == null || queryParameter2 == null) {
            return true;
        }
        try {
            mo50993X().mo48656t2(new C18610f(LatLonE6.m40176g(Double.parseDouble(queryParameter), Double.parseDouble(queryParameter2))));
            return true;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        LocationDescriptor locationDescriptor;
        if (i != 4333) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            C18613i iVar = this.f47400u;
            C18604l lVar = C18604l.this;
            A a = lVar.f40822c;
            C19728f fVar = lVar.f47402w;
            MapFragment X = lVar.mo50993X();
            TextView textView = C18604l.this.f47381G;
            if (a != null && fVar != null && textView != null && (locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result")) != null && locationDescriptor.mo24310d() != null) {
                X.mo48656t2(new C18615m(iVar, a, fVar, X, locationDescriptor));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f47386L = new C13566a(requireContext());
        if (bundle == null) {
            z = true;
        } else {
            z = false;
        }
        this.f47382H = z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.nearby_home_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.search_proxy);
        this.f47381G = textView;
        textView.setOnClickListener(new C16850a(this, 10));
        int h = UiUtils.m40249h(getResources(), 24.0f);
        AlertMessageView alertMessageView = new AlertMessageView(context, (AttributeSet) null);
        this.f47380F = alertMessageView;
        alertMessageView.setPadding(0, h, 0, h);
        this.f47376B = new C18612h(this.f47396q, this.f47380F);
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo46780O1());
        if (MobileAdsManager.m37073h().f37462d) {
            obj = new ConcatAdapter(this.f47376B, new C14738f(AdSource.NEARBY_INLINE_BANNER, hVar));
        } else {
            obj = this.f47376B;
        }
        AlertMessageView alertMessageView2 = new AlertMessageView(context, (AttributeSet) null);
        alertMessageView2.setPadding(0, h, 0, h);
        alertMessageView2.setImage((int) R.drawable.img_empty_favorite);
        alertMessageView2.setSubtitle((int) R.string.favorite_station_empty_state_message);
        alertMessageView2.setPositiveButton((int) R.string.favorite_empty_state_button);
        alertMessageView2.setPositiveButtonClickListener(new C6592b(this, 14));
        this.f47377C = new C18612h(this.f47396q, alertMessageView2);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C20944i0(context.getString(R.string.map_nearby_stations), obj));
        arrayList.add(new C20944i0(context.getString(R.string.stop_favorites_station_section_header), this.f47377C));
        this.f47379E = (ViewPager) inflate.findViewById(R.id.view_pager);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tabs);
        this.f47379E.setAdapter(new C18492b((PagerAdapter) new C18614j(arrayList), this.f47379E));
        this.f47379E.setCurrentLogicalItem(0);
        tabLayout.setupWithViewPager(this.f47379E);
        this.f47379E.addOnPageChangeListener(this.f47394o);
        View findViewById = inflate.findViewById(R.id.pager_container);
        if (!C13382a.m33671g(context)) {
            MyBottomSheetBehavior.from(findViewById).setPeekHeight(UiUtils.m40249h(context.getResources(), 300.0f));
        }
        MapFragment X = mo50993X();
        MapFragment mapFragment = X;
        this.f47383I = new C18595e(this, mapFragment, findViewById, (AppBarLayout) inflate.findViewById(R.id.app_bar), tabLayout, this.f47379E, inflate.findViewById(R.id.show_card_button), bundle);
        this.f47384J = new C16277g(context, X, R.layout.near_me_map_overlay);
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        A a = this.f40822c;
        int color = C4732a.getColor(a, R.color.transparent);
        if (C20943i.m49051d(21)) {
            a.getWindow().setStatusBarColor(color);
        }
    }

    public final void onResume() {
        super.onResume();
        A a = this.f40822c;
        int f = C20941h.m49043f(R.attr.colorSurfaceDark, a);
        if (C20943i.m49051d(21)) {
            a.getWindow().setStatusBarColor(f);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C18595e eVar = this.f47383I;
        if (eVar != null) {
            bundle.putBoolean("isHidden", eVar.f47358i);
            bundle.putBoolean("isExpanded", eVar.f47359j);
        }
    }

    public final void onStart() {
        super.onStart();
        MapFragment X = mo50993X();
        this.f47392R = new C18609e(this, X);
        X.mo48654s2(this.f47399t);
        X.mo48654s2(this.f47400u);
        X.f42342E.add(this.f47392R);
        X.f42344F.add(this.f47392R);
        X.f42352K.add(this.f47395p);
        X.mo48658u2(this.f47398s);
        this.f47384J.mo48762a();
        C16753e eVar = this.f47405z;
        if (eVar != null) {
            C18611g gVar = new C18611g(eVar);
            if (gVar != X.f42334A) {
                X.f42334A = gVar;
                X.mo48633d3();
            }
            this.f47405z.mo49436j(this);
            this.f47405z.mo49432f(this);
        }
        C16287l lVar = new C16287l(X);
        this.f47393S = lVar;
        lVar.f42563d.add(this);
        C16287l lVar2 = this.f47393S;
        lVar2.f42560a.mo48654s2(lVar2.f42561b);
    }

    public final void onStop() {
        super.onStop();
        C18618p pVar = this.f47389O;
        if (pVar != null) {
            pVar.cancel(false);
            C13776p andSet = pVar.f47446r.getAndSet((Object) null);
            if (andSet != null) {
                andSet.cancel(false);
            }
            this.f47389O = null;
        }
        C18618p pVar2 = this.f47390P;
        if (pVar2 != null) {
            pVar2.cancel(false);
            C13776p andSet2 = pVar2.f47446r.getAndSet((Object) null);
            if (andSet2 != null) {
                andSet2.cancel(false);
            }
            this.f47390P = null;
        }
        this.f47397r.mo23803d();
        MapFragment X = mo50993X();
        if (this.f47405z != null) {
            if (X.f42334A != null) {
                X.f42334A = null;
                X.mo48633d3();
            }
            this.f47405z.mo49448w(this);
            this.f47405z.mo49444s(this);
        }
        C16287l lVar = this.f47393S;
        lVar.f42560a.mo48635f3(lVar.f42561b);
        this.f47384J.mo48763b(false);
        X.mo48635f3(this.f47399t);
        X.mo48635f3(this.f47400u);
        X.f42342E.remove(this.f47392R);
        X.f42344F.remove(this.f47392R);
        X.f42352K.remove(this.f47395p);
        X.f42346G.remove(this.f47398s);
    }

    /* renamed from: p2 */
    public final void mo50995p2() {
        if (this.f47387M != null) {
            MapFragment X = mo50993X();
            if (X.mo48624U2()) {
                X.mo48636g3(this.f47387M);
                this.f47387M = null;
                C16277g gVar = this.f47384J;
                if (gVar != null) {
                    gVar.f42540g.clear();
                    return;
                }
                return;
            }
            X.mo48656t2(new C18603k(this, 0));
        }
    }

    /* renamed from: q */
    public final void mo44782q() {
        mo50996q2((Object) null);
    }

    /* renamed from: q2 */
    public final void mo50996q2(Object obj) {
        boolean z;
        boolean z2;
        C18618p pVar = this.f47390P;
        if (pVar != null) {
            pVar.cancel(false);
            C13776p andSet = pVar.f47446r.getAndSet((Object) null);
            if (andSet != null) {
                andSet.cancel(false);
            }
            this.f47390P = null;
        }
        MoovitAppActivity moovitAppActivity = (MoovitAppActivity) this.f40822c;
        if (moovitAppActivity != null && this.f47402w != null && this.f47403x != null && this.f47405z != null) {
            C18618p pVar2 = this.f47389O;
            if (pVar2 == null || pVar2.isCancelled() || AsyncTask.Status.FINISHED.equals(this.f47389O.getStatus())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C18618p pVar3 = this.f47389O;
                if (pVar3 != null) {
                    pVar3.cancel(false);
                    C13776p andSet2 = pVar3.f47446r.getAndSet((Object) null);
                    if (andSet2 != null) {
                        andSet2.cancel(false);
                    }
                    this.f47389O = null;
                }
                if (obj != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.f47375A = null;
                }
                C18618p pVar4 = new C18618p(this.f47402w, this.f47403x, (C13756i) moovitAppActivity.getSystemService("request_manager"), mo50993X(), this.f47405z, this.f40822c.mo44551z1(), C17635b.m43779f(moovitAppActivity).f50174d, this);
                pVar4.executeOnExecutor(this.f47391Q, new Object[]{obj, new C18618p.C18623e(Collections.unmodifiableList(this.f47376B.f47331h), Collections.unmodifiableList(this.f47377C.f47331h))});
                this.f47390P = pVar4;
            }
        }
    }

    /* renamed from: r1 */
    public final void mo50985r1(LocationDescriptor locationDescriptor) {
        mo50995p2();
        TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
        dVar.f23791b = locationDescriptor;
        startActivity(SuggestRoutesActivity.m39325M2(this.f40822c, dVar.mo23958a(), true));
    }

    /* renamed from: v0 */
    public final void mo44783v0() {
        mo50996q2((Object) null);
    }

    /* renamed from: x */
    public final C16277g mo50997x() {
        return this.f47384J;
    }
}
