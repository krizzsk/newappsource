package com.moovit.app.linedetail.p416ui;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.appboy.Constants;
import com.google.android.exoplayer2.p052ui.C4057w;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleLocation;
import com.tranzmate.R;
import g20.C17161i;
import h10.C17293a;
import j80.C12775d;
import j80.C12778f;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p001a0.C0017h;
import p297w5.C6994a;
import p304x.C7097r;
import p304x.C7099r1;
import p435de.C16596f;
import p451du.C16704a;
import p451du.C16705b;
import p451du.C16707d;
import p451du.C16711h;
import p471eq.C16855d;
import p523gu.C17231c;
import p543hq.C17474b;
import p567iq.C17635b;
import p567iq.C17637d;
import p613kq.C18118d;
import p824tp.C19728f;
import p858uz.C20061g;
import p872vp.C20195b;
import p874vr.C20199a;
import p926xv.C20630k;
import p977zz.C20969u0;

/* renamed from: com.moovit.app.linedetail.ui.LineDetailActivity */
public class LineDetailActivity extends MoovitAppActivity implements C15101a.C15108g, LineDetailMapFragment.C15094a, C20630k.C20631a {

    /* renamed from: y0 */
    public static final /* synthetic */ int f38727y0 = 0;

    /* renamed from: U */
    public final C15093a f38728U = new C15093a();

    /* renamed from: X */
    public ServerId f38729X;

    /* renamed from: Y */
    public C15101a f38730Y;

    /* renamed from: Z */
    public LineDetailMapFragment f38731Z;

    /* renamed from: l0 */
    public ListItemView f38732l0;

    /* renamed from: m0 */
    public C18118d f38733m0;

    /* renamed from: n0 */
    public ConstraintLayout f38734n0;

    /* renamed from: o0 */
    public TextView f38735o0;

    /* renamed from: p0 */
    public C17161i<C16181a.C16184c, TransitLine> f38736p0;

    /* renamed from: q0 */
    public MenuItem f38737q0;

    /* renamed from: r0 */
    public C12775d f38738r0 = null;

    /* renamed from: s0 */
    public C12778f f38739s0;

    /* renamed from: t0 */
    public final C4057w f38740t0 = new C4057w(this, 1);

    /* renamed from: u0 */
    public final HashSet f38741u0 = new HashSet();

    /* renamed from: v0 */
    public boolean f38742v0 = false;

    /* renamed from: w0 */
    public View f38743w0;

    /* renamed from: x0 */
    public BottomSheetBehavior<View> f38744x0 = null;

    /* renamed from: com.moovit.app.linedetail.ui.LineDetailActivity$a */
    public class C15093a extends BottomSheetBehavior.C13920c {
        public C15093a() {
        }

        public final void onSlide(View view, float f) {
            LineDetailActivity lineDetailActivity = LineDetailActivity.this;
            int i = LineDetailActivity.f38727y0;
            lineDetailActivity.mo45418J2();
        }

        public final void onStateChanged(View view, int i) {
            LineDetailActivity lineDetailActivity = LineDetailActivity.this;
            int i2 = LineDetailActivity.f38727y0;
            lineDetailActivity.mo45418J2();
            if (i == 6 && LineDetailActivity.this.f38730Y.mo45467u2()) {
                LineDetailActivity.this.mo45411F2();
            }
        }
    }

    /* renamed from: B2 */
    public static boolean m38385B2(Uri uri) {
        return C20969u0.m49111b(uri, "moovit") && "line".equalsIgnoreCase(uri.getHost());
    }

    /* renamed from: y2 */
    public static Intent m38386y2(Context context, ServerId serverId, ServerId serverId2, ServerId serverId3, Time time) {
        Intent intent = new Intent(context, LineDetailActivity.class);
        C21100e.m49373x(serverId, "lineGroupId");
        intent.putExtra("lgi", serverId);
        if (serverId2 != null) {
            intent.putExtra("li", serverId2);
        }
        if (serverId3 != null) {
            intent.putExtra("si", serverId3);
        }
        if (time != null) {
            intent.putExtra(Constants.APPBOY_PUSH_TITLE_KEY, time);
        }
        return intent;
    }

    /* renamed from: z2 */
    public static ServerId m38387z2(Intent intent, String str) {
        Uri data = intent.getData();
        if (!m38385B2(data)) {
            return (ServerId) intent.getParcelableExtra(str);
        }
        String queryParameter = data.getQueryParameter(str);
        if (queryParameter != null) {
            return ServerId.m11392b(queryParameter);
        }
        return null;
    }

    /* renamed from: A2 */
    public final void mo45406A2() {
        Time time;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C15101a aVar = this.f38730Y;
        if (aVar != null) {
            aVar.setTargetFragment((Fragment) null, 0);
        }
        ServerId serverId = this.f38729X;
        ServerId z2 = m38387z2(getIntent(), "li");
        ServerId z22 = m38387z2(getIntent(), "si");
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (m38385B2(data)) {
            String queryParameter = data.getQueryParameter(Constants.APPBOY_PUSH_TITLE_KEY);
            if (queryParameter != null) {
                time = new Time(Long.parseLong(queryParameter));
            } else {
                time = null;
            }
        } else {
            time = (Time) intent.getParcelableExtra(Constants.APPBOY_PUSH_TITLE_KEY);
        }
        int i = C15101a.f38810T;
        Bundle bundle = new Bundle();
        C21100e.m49373x(serverId, "lineGroupId");
        bundle.putParcelable("lineGroupId", serverId);
        if (z2 != null) {
            bundle.putParcelable("lineId", z2);
        }
        if (z22 != null) {
            bundle.putParcelable("stopId", z22);
        }
        if (time != null) {
            bundle.putParcelable("time", time);
        }
        C15101a aVar2 = new C15101a();
        aVar2.setArguments(bundle);
        this.f38730Y = aVar2;
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        K.mo4111f(R.id.line_detail_content, this.f38730Y, (String) null);
        K.mo4040d();
        LineDetailMapFragment lineDetailMapFragment = this.f38731Z;
        if (lineDetailMapFragment != null) {
            this.f38730Y.setTargetFragment(lineDetailMapFragment, 0);
        }
    }

    /* renamed from: B0 */
    public final void mo45407B0() {
        mo45410E2();
    }

    /* renamed from: C2 */
    public final void mo45408C2(C12775d dVar) {
        boolean z;
        this.f38738r0 = dVar;
        MenuItem menuItem = this.f38737q0;
        if (menuItem != null) {
            if (dVar == null) {
                menuItem.setVisible(false);
                return;
            }
            ServiceStatusCategory serviceStatusCategory = dVar.f31580b.f23213b;
            menuItem.setIcon(serviceStatusCategory.getIconResId());
            if (serviceStatusCategory != ServiceStatusCategory.UNKNOWN && getSupportFragmentManager().mo3923A("service_alert_preview_dialog_fragment_tag") == null) {
                if (dVar.f31581c.mo49542a().longValue() != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(serviceStatusCategory)) {
                    mo45415H2(dVar);
                    return;
                }
                this.f38737q0.setVisible(false);
                String str = dVar.f31579a;
                ServerId serverId = this.f38729X;
                int i = C20630k.f52155o;
                Bundle bundle = new Bundle();
                bundle.putString("alertId", str);
                bundle.putParcelable("lineGroupId", serverId);
                C20630k kVar = new C20630k();
                kVar.setArguments(bundle);
                kVar.show(getSupportFragmentManager(), "service_alert_preview_dialog_fragment_tag");
            }
        }
    }

    /* renamed from: D2 */
    public final boolean mo45409D2() {
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("Bundle[");
        k.append(System.identityHashCode(this));
        k.append("]=");
        k.append(getIntent().getExtras());
        a.mo49363b(k.toString());
        a.mo49363b("Uri[" + System.identityHashCode(this) + "]=" + getIntent().getData());
        ServerId z2 = m38387z2(getIntent(), "lgi");
        this.f38729X = z2;
        if (z2 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: E2 */
    public final void mo45410E2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0942l lVar = (C0942l) supportFragmentManager.mo3923A("report_stop_dialog_fragment_tag");
        if (lVar != null) {
            lVar.dismiss();
        }
        C0942l lVar2 = (C0942l) supportFragmentManager.mo3923A("report_line_dialog_fragment_tag");
        if (lVar2 != null) {
            lVar2.dismiss();
        }
        supportFragmentManager.mo3981x();
    }

    /* renamed from: F2 */
    public final void mo45411F2() {
        C17231c p2;
        BottomSheetBehavior<View> bottomSheetBehavior = this.f38744x0;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f34359J != 4) {
            C15101a aVar = this.f38730Y;
            if (aVar.getView() != null && (p2 = aVar.mo45462p2()) != null && aVar.mo45465s2() != null) {
                View view = (View) ((ViewPager) aVar.mo46799l2(R.id.pager)).getPrimaryItem();
                if (view instanceof RecyclerView) {
                    int i = p2.f44552v;
                    RecyclerView recyclerView = (RecyclerView) view;
                    if (recyclerView.getLayoutManager() != null) {
                        C16711h hVar = new C16711h(recyclerView.getContext());
                        hVar.f4336a = i;
                        recyclerView.post(new C7097r(17, recyclerView, hVar));
                    }
                }
            }
        }
    }

    /* renamed from: G0 */
    public final void mo45412G0() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f38744x0;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    /* renamed from: G2 */
    public final void mo45413G2() {
        this.f38739s0.mo39625e(this.f38729X).addOnCompleteListener((Activity) this, new C16705b(this, 0));
    }

    /* renamed from: H */
    public final void mo45414H() {
        supportInvalidateOptionsMenu();
    }

    /* renamed from: H2 */
    public final void mo45415H2(C12775d dVar) {
        ServiceStatusCategory serviceStatusCategory = dVar.f31580b.f23213b;
        this.f38737q0.setIcon(serviceStatusCategory.getIconResId());
        this.f38737q0.setVisible(true);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SERVICE_ALERT_MENU_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceStatusCategory));
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, dVar.f31579a);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: I0 */
    public final void mo45416I0(boolean z, boolean z2, TransitLine transitLine, BoxE6 boxE6, List list, List list2, TransitStop transitStop, Integer num, ServerId serverId) {
        C16181a.m41233b(this.f38736p0, this.f38732l0, transitLine);
        String l = C20195b.m47768l(transitLine);
        ListItemView listItemView = this.f38732l0;
        boolean z3 = true;
        C13382a.m33674j(listItemView, getString(R.string.voice_over_lineview_header, new Object[]{l, listItemView.getSubtitle()}));
        if (!z || z2) {
            z3 = false;
        }
        mo45417I2(z3);
        C18118d dVar = this.f38733m0;
        if (dVar != null) {
            dVar.mo50565c();
        }
        if (this.f38744x0 != null) {
            this.f38743w0.post(new C7099r1(this, 10));
        }
    }

    /* renamed from: I2 */
    public final void mo45417I2(boolean z) {
        this.f38742v0 = z;
        if (m38385B2(getIntent().getData())) {
            if (this.f38734n0.getVisibility() != 0) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "bottom_bar_directions");
                mo44545v2(aVar.mo49933a());
            }
            this.f38734n0.setVisibility(0);
        } else {
            this.f38734n0.setVisibility(8);
        }
        if (this.f38733m0.mo50564a()) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "bottom_bar_navigate");
            mo44545v2(aVar2.mo49933a());
        }
    }

    /* renamed from: J2 */
    public final void mo45418J2() {
        LineDetailMapFragment lineDetailMapFragment = this.f38731Z;
        if (lineDetailMapFragment != null) {
            lineDetailMapFragment.mo48645n3(0, 0, 0, this.f38743w0.getHeight() - this.f38743w0.getTop());
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        if (this.f38730Y.f38816F == null) {
            return super.mo19421Q1(menu);
        }
        getMenuInflater().inflate(R.menu.line_detail_menu, menu);
        this.f38737q0 = menu.findItem(R.id.service_alert_action);
        C12775d dVar = this.f38738r0;
        if (dVar == null) {
            mo45413G2();
            return true;
        }
        mo45408C2(dVar);
        return true;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        if (!mo45409D2()) {
            C16596f.m42113a().mo49364c(new IllegalStateException("LineDetailActivity illegal arguments!"));
            finish();
            return;
        }
        mo45406A2();
        mo45413G2();
    }

    /* renamed from: c1 */
    public final void mo45419c1(List<Time> list) {
        if (!C13717b.m34258e(list)) {
            for (Time time : list) {
                TimeVehicleLocation timeVehicleLocation = time.f23912m;
                if (timeVehicleLocation != null) {
                    this.f38741u0.add(timeVehicleLocation.f23924b);
                }
            }
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        mo45410E2();
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        return new C16855d(this, R.id.content_container, Collections.singletonList(new C17293a(this, "line_detail")));
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        int size = this.f38741u0.size();
        this.f38741u0.clear();
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49935c(AnalyticsAttributeKey.COUNT, size);
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        if (!mo45409D2()) {
            C16596f.m42113a().mo49364c(new IllegalStateException("LineDetailActivity illegal arguments!"));
            finish();
            return;
        }
        if (((C17637d) getSystemService("ui_configuration")).f45347d) {
            i = R.layout.line_detail_activity_with_map;
        } else {
            i = R.layout.line_detail_activity_without_map;
        }
        setContentView(i);
        this.f38735o0 = (TextView) findViewById(R.id.time_selected);
        this.f38731Z = (LineDetailMapFragment) mo44529n1(R.id.map_fragment);
        HashSet hashSet = C19728f.f50164e;
        this.f38736p0 = ((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.LINE_DETAIL);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo792n();
        }
        this.f38732l0 = (ListItemView) toolbar.findViewById(R.id.line_header);
        mo45406A2();
        this.f38733m0 = new C18118d(this, C20199a.f51253O0);
        findViewById(R.id.bottom_bars_barrier).addOnLayoutChangeListener(this.f38740t0);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.directions_bar_container);
        this.f38734n0 = constraintLayout;
        constraintLayout.setOnClickListener(new C6994a(this, 15));
        this.f38743w0 = findViewById(R.id.line_detail_content);
        if (((C17637d) getSystemService("ui_configuration")).f45347d) {
            BottomSheetBehavior<View> e = BottomSheetBehavior.m34710e(this.f38743w0);
            this.f38744x0 = e;
            int h = UiUtils.m40249h(getResources(), 10.0f);
            if (h >= 0) {
                e.f34350A = h;
                this.f38744x0.mo41052a(this.f38728U);
                this.f38743w0.addOnLayoutChangeListener(new C16704a(this, 0));
            } else {
                e.getClass();
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.LINE_SCREEN_BANNER, hVar);
        this.f38739s0 = C17635b.m43779f(this).f50174d;
        mo45413G2();
    }

    /* renamed from: i */
    public final void mo45420i(boolean z, List<TransitPatternTrips> list, TransitStop transitStop, int i, List<TransitStop> list2, TransitStop transitStop2, int i2) {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f38744x0;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19427i2() {
        /*
            r11 = this;
            super.mo19427i2()
            com.moovit.app.linedetail.ui.a r0 = r11.f38730Y
            if (r0 != 0) goto L_0x0009
            goto L_0x0096
        L_0x0009:
            com.moovit.transit.TransitLineGroup r1 = r0.f38817G
            if (r1 != 0) goto L_0x000f
            goto L_0x0096
        L_0x000f:
            uz.g r2 = r11.f37295D
            android.location.Location r2 = r2.mo50014i()
            com.moovit.commons.geo.LatLonE6 r9 = com.moovit.commons.geo.LatLonE6.m40177j(r2)
            boolean r2 = r0.mo45466t2()
            r3 = 0
            if (r2 != 0) goto L_0x006c
            com.moovit.transit.TransitLine r2 = r0.f38816F
            boolean r4 = r0.mo45466t2()
            if (r4 == 0) goto L_0x002a
            r4 = r3
            goto L_0x0030
        L_0x002a:
            gu.c r4 = r0.mo45462p2()
            com.moovit.transit.TransitStop r4 = r4.f44551u
        L_0x0030:
            boolean r5 = r0.mo45466t2()
            if (r5 == 0) goto L_0x0038
        L_0x0036:
            r7 = r3
            goto L_0x0062
        L_0x0038:
            gu.c r0 = r0.mo45462p2()
            int r5 = r0.f44552v
            int r6 = r0.getItemViewType(r5)
            r7 = 2
            if (r6 == r7) goto L_0x0046
            goto L_0x0036
        L_0x0046:
            com.moovit.transit.TransitStop r6 = r0.f44551u
            if (r6 != 0) goto L_0x004b
            goto L_0x0036
        L_0x004b:
            com.moovit.network.model.ServerId r6 = r6.f23730b
            com.moovit.transit.Schedule r7 = r0.mo49674k(r5, r6)
            gu.c$b r8 = r0.f44549s
            boolean r8 = r8.mo45460e()
            if (r8 == 0) goto L_0x005b
            r0 = r3
            goto L_0x005f
        L_0x005b:
            com.moovit.transit.Schedule r0 = r0.mo49673j(r5, r6)
        L_0x005f:
            if (r0 == 0) goto L_0x0062
            r7 = r0
        L_0x0062:
            if (r7 == 0) goto L_0x006a
            com.moovit.util.time.Time r0 = r7.mo24326m()
            r10 = r0
            goto L_0x006f
        L_0x006a:
            r10 = r3
            goto L_0x006f
        L_0x006c:
            r2 = r3
            r4 = r2
            r10 = r4
        L_0x006f:
            com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent r0 = new com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent
            long r5 = java.lang.System.currentTimeMillis()
            com.moovit.database.DbEntityRef r1 = com.moovit.database.DbEntityRef.newTransitLineGroupRef((com.moovit.transit.TransitLineGroup) r1)
            if (r2 == 0) goto L_0x0081
            com.moovit.database.DbEntityRef r2 = com.moovit.database.DbEntityRef.newTransitLineRef((com.moovit.transit.TransitLine) r2)
            r7 = r2
            goto L_0x0082
        L_0x0081:
            r7 = r3
        L_0x0082:
            if (r4 == 0) goto L_0x008a
            com.moovit.database.DbEntityRef r2 = com.moovit.database.DbEntityRef.newTransitStopRef((com.moovit.transit.TransitStop) r4)
            r8 = r2
            goto L_0x008b
        L_0x008a:
            r8 = r3
        L_0x008b:
            r3 = r0
            r4 = r5
            r6 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10)
            nw.a r1 = p690nw.C18641a.f47503b
            r1.mo51027a(r0)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.linedetail.p416ui.LineDetailActivity.mo19427i2():void");
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: k0 */
    public final void mo45421k0(Time time) {
        int i;
        String str;
        TextView textView = this.f38735o0;
        if (time != null) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f38735o0;
        if (time != null) {
            str = C7925b.m18018f(this, time.mo24631g(), false);
        } else {
            str = getString(R.string.now);
        }
        textView2.setText(str);
        TextView textView3 = this.f38735o0;
        textView3.setContentDescription(getString(R.string.voice_over_tripplan_time, new Object[]{textView3.getText()}));
    }

    /* renamed from: l1 */
    public final void mo45422l1(TransitLine transitLine) {
        if (transitLine != null) {
            C16181a.m41233b(this.f38736p0, this.f38732l0, transitLine);
            String l = C20195b.m47768l(transitLine);
            ListItemView listItemView = this.f38732l0;
            C13382a.m33674j(listItemView, getString(R.string.voice_over_lineview_header, new Object[]{l, listItemView.getSubtitle()}));
        }
        mo45417I2(false);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        ServerId z2 = m38387z2(getIntent(), "lgi");
        if (z2 != null) {
            m1.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, z2);
        }
        ServerId z22 = m38387z2(getIntent(), "li");
        if (z22 != null) {
            m1.mo49937e(AnalyticsAttributeKey.LINE_ID, z22);
        }
        ServerId z23 = m38387z2(getIntent(), "si");
        if (z23 != null) {
            m1.mo49937e(AnalyticsAttributeKey.STOP_ID, z23);
        }
        return m1;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        if (i == 108 && menu != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "context_menu_clicked");
            mo44545v2(aVar.mo49933a());
        }
        return super.onMenuOpened(i, menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f38730Y.f38816F == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != R.id.service_alert_action) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.f38738r0 != null) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "line_status_clicked");
                aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(this.f38738r0.f31580b.f23213b));
                aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, this.f38738r0.f31579a);
                mo44545v2(aVar.mo49933a());
                startActivity(ServiceAlertDetailsActivity.m39148z2(this, this.f38729X, this.f38738r0.f31579a));
            }
            return true;
        }
    }

    /* renamed from: q */
    public final void mo45423q(String str) {
        C12775d dVar;
        if (this.f38737q0 != null && (dVar = this.f38738r0) != null && dVar.f31579a.equals(str)) {
            mo45415H2(this.f38738r0);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "GTFS_METRO_ENTITIES_LOADER", "GTFS_TRIPS_SCHEDULE_LOADER", "USER_ACCOUNT", "TWITTER_SERVICE_ALERTS_FEEDS");
        hashSet.add("CONFIGURATION");
        return s1;
    }

    /* renamed from: u0 */
    public final void mo45424u0(int i, TransitStop transitStop) {
        boolean z;
        if (!this.f38730Y.mo45466t2()) {
            TransitType.ViewType e = C7843b.m17878e(this.f38730Y.f38816F);
            if (e == null || e == TransitType.ViewType.DEFAULT) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stop_map_icon_clicked");
                mo44545v2(aVar.mo49933a());
                C15101a aVar2 = this.f38730Y;
                C17231c p2 = aVar2.mo45462p2();
                aVar2.f38813C = transitStop.f23730b;
                TransitStop transitStop2 = p2.f44551u;
                int i2 = p2.f44552v;
                p2.f44551u = transitStop;
                p2.f44552v = i;
                p2.f44546p.f31630k = i;
                p2.mo49794m();
                p2.notifyDataSetChanged();
                aVar2.mo46786U1(C15101a.C15108g.class, new C16707d(aVar2, p2, p2.f44551u, i, p2.f44545o, transitStop2, i2));
                aVar2.mo45469w2();
                aVar2.mo45457L2(p2);
                aVar2.mo45449D2();
                BottomSheetBehavior<View> bottomSheetBehavior = this.f38744x0;
                if (bottomSheetBehavior == null || bottomSheetBehavior.f34359J == 6) {
                    mo45411F2();
                } else {
                    bottomSheetBehavior.setState(6);
                }
            } else {
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "go_to_station_clicked_map");
                mo44545v2(aVar3.mo49933a());
                startActivity(StopDetailActivity.m39207B2(this, transitStop.f23730b, (ServerId) null, (TransitStop) null, (List) null));
            }
        }
    }

    /* renamed from: w0 */
    public final void mo45425w0(TransitLineGroup transitLineGroup, boolean z, boolean z2) {
        mo45417I2(!z2);
        supportInvalidateOptionsMenu();
    }
}
