package com.moovit.app.stopdetail;

import a00.C13382a;
import aa0.C7540l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b00.C13556a;
import c70.C13752e;
import c70.C13753f;
import ce0.C21100e;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.app.realtimehelp.RealTimeHelpActivity;
import com.moovit.app.realtimehelp.RealTimeHelpBannerView;
import com.moovit.app.reports.service.CreateReportRequestData;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.C15356f;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.surveys.recorder.events.SurveyStopEvent;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.metro.ReportCategoryType;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.navigation.NavigationService;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.tracing.TraceEvent;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.ParcelableMemRef;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import com.moovit.view.dialogs.DropDownListPopup;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel;
import f00.C16919g;
import g30.C4776h;
import ga0.C12699d;
import ga0.C12704f;
import h10.C17293a;
import i30.C5267c;
import i30.C5269e;
import j80.C12775d;
import j80.C12778f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00.C18669f;
import o00.C18681n;
import p001a0.C0016g;
import p011aa.C0141e;
import p028ba.C1512f;
import p028ba.C1513g;
import p373au.C13536h;
import p399bw.C13701e;
import p399bw.C13702f;
import p399bw.C13704g;
import p435de.C16596f;
import p453dw.C16728d;
import p453dw.C16729e;
import p453dw.C16731g;
import p453dw.C16732h;
import p453dw.C16733i;
import p453dw.C16734j;
import p453dw.C16738n;
import p453dw.C16743q;
import p471eq.C16855d;
import p543hq.C17474b;
import p567iq.C17635b;
import p567iq.C17637d;
import p583jk.C17884p;
import p594jv.C17930a;
import p594jv.C17931b;
import p613kq.C18118d;
import p614kr.C18120b;
import p618kv.C18150h;
import p690nw.C18641a;
import p824tp.C19728f;
import p858uz.C20061g;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p952yy.C20785a;
import p952yy.C20786b;
import p952yy.C20787c;
import p952yy.C20792f;
import p968zq.C20883a;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20974x;
import p977zz.C20975x0;
import q00.C19047a;
import t90.C13120a;
import t90.C13121b;
import z20.C20806a;

public class StopDetailActivity extends MoovitAppActivity implements C15340c.C15345e, C12704f.C12706b, C15356f.C15357a {

    /* renamed from: z0 */
    public static final /* synthetic */ int f39653z0 = 0;

    /* renamed from: U */
    public final C15329a f39654U = new C15329a();

    /* renamed from: X */
    public final C15330b f39655X = new C15330b();

    /* renamed from: Y */
    public C18118d f39656Y;

    /* renamed from: Z */
    public ServerId f39657Z;

    /* renamed from: l0 */
    public TransitStop f39658l0 = null;

    /* renamed from: m0 */
    public Map<ArrivalsResponseKey, Map<ServerId, C20787c>> f39659m0 = null;

    /* renamed from: n0 */
    public Time f39660n0 = null;

    /* renamed from: o0 */
    public boolean f39661o0 = false;

    /* renamed from: p0 */
    public C15340c f39662p0 = null;

    /* renamed from: q0 */
    public SwipeRefreshLayout f39663q0;

    /* renamed from: r0 */
    public SearchView f39664r0;

    /* renamed from: s0 */
    public MenuItem f39665s0;

    /* renamed from: t0 */
    public ListItemView f39666t0;

    /* renamed from: u0 */
    public RecyclerView f39667u0;

    /* renamed from: v0 */
    public C13556a f39668v0 = null;

    /* renamed from: w0 */
    public C15331c f39669w0 = null;

    /* renamed from: x0 */
    public C12778f f39670x0;

    /* renamed from: y0 */
    public C16738n f39671y0;

    /* renamed from: com.moovit.app.stopdetail.StopDetailActivity$a */
    public class C15329a extends C7540l {
        public C15329a() {
        }

        /* renamed from: a */
        public final void mo19433a() {
            if (StopDetailActivity.this.mo44548x1() == null) {
                C16596f a = C16596f.m42113a();
                a.mo49363b(StopDetailActivity.this.mo44544v1() + ": " + StopDetailActivity.this.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(StopDetailActivity.this.mo44544v1());
                sb.append(" refresh runnable invoked without RequestContext");
                a.mo49364c(new IllegalStateException(sb.toString()));
                return;
            }
            StopDetailActivity.this.mo45905H2();
        }

        /* renamed from: b */
        public final void mo21414b() {
            StopDetailActivity stopDetailActivity = StopDetailActivity.this;
            if (!stopDetailActivity.f37313z) {
                int i = StopDetailActivity.f39653z0;
                C15331c cVar = stopDetailActivity.f39669w0;
                if (cVar != null) {
                    cVar.cancel(true);
                    stopDetailActivity.f39669w0 = null;
                }
            }
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopDetailActivity$b */
    public class C15330b extends ScheduleView.C7927a {
        public C15330b() {
        }

        /* renamed from: a */
        public final void mo24745a() {
            StopDetailActivity stopDetailActivity = StopDetailActivity.this;
            Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map = stopDetailActivity.f39659m0;
            if (map != null) {
                stopDetailActivity.f39662p0.mo45924k(stopDetailActivity, stopDetailActivity.f39660n0, stopDetailActivity.f39661o0, map);
            }
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopDetailActivity$c */
    public class C15331c extends C16743q {
        public C15331c(ArrayList arrayList, ServerId serverId) {
            super(serverId, arrayList);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopDetailActivity$d */
    public class C15332d extends C0141e {
        public C15332d() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17930a aVar = (C17930a) cVar;
            C17931b bVar = (C17931b) gVar;
            StopDetailActivity stopDetailActivity = StopDetailActivity.this;
            int i = StopDetailActivity.f39653z0;
            stopDetailActivity.mo45905H2();
        }
    }

    /* renamed from: A2 */
    public static Intent m39206A2(Context context, ServerId serverId) {
        return m39207B2(context, serverId, (ServerId) null, (TransitStop) null, (List) null);
    }

    /* renamed from: B2 */
    public static Intent m39207B2(Context context, ServerId serverId, ServerId serverId2, TransitStop transitStop, List list) {
        Intent intent = new Intent(context, StopDetailActivity.class);
        intent.putExtra("stop_id", serverId);
        intent.putExtra("line_id", serverId2);
        intent.putExtra("smart_feature", false);
        if (transitStop != null) {
            intent.putExtra("stop", new ParcelableMemRef(transitStop));
        }
        if (list != null) {
            intent.putExtra("line_arrivals", new ParcelableMemRef(list));
        }
        return intent;
    }

    /* renamed from: A */
    public final void mo45899A(ServerId serverId, CongestionLevel congestionLevel) {
        String str;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "crowdedness_submit_clicked");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.REPORT_TYPE;
        switch (C20883a.f52622g[congestionLevel.ordinal()]) {
            case 1:
                str = MVCongestionLevel.EMPTY.name();
                break;
            case 2:
                str = MVCongestionLevel.FEW.name();
                break;
            case 3:
                str = MVCongestionLevel.LOW.name();
                break;
            case 4:
                str = MVCongestionLevel.MED.name();
                break;
            case 5:
                str = MVCongestionLevel.HIGH.name();
                break;
            case 6:
                str = MVCongestionLevel.FULL.name();
                break;
            case 7:
                str = MVCongestionLevel.PACKED.name();
                break;
            default:
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                break;
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, serverId);
        mo44545v2(aVar.mo49933a());
        mo45906I2(serverId, congestionLevel);
    }

    /* renamed from: C2 */
    public final void mo45900C2(Intent intent) {
        TransitStop transitStop;
        boolean z;
        List list = null;
        this.f39657Z = null;
        this.f39658l0 = null;
        this.f39659m0 = null;
        this.f39662p0 = null;
        this.f39666t0.setVisibility(8);
        this.f39666t0.setOnClickListener((View.OnClickListener) null);
        UiUtils.m40259r(this.f39663q0, new C18120b(this, 1));
        ServerId serverId = (ServerId) intent.getParcelableExtra("stop_id");
        if (serverId != null) {
            this.f39657Z = serverId;
            C13121b z1 = mo44551z1();
            TraceEvent traceEvent = TraceEvent.STOP_DETAIL_ACTIVITY_LOADED;
            ((C13120a) z1).mo40026d(traceEvent, new C20944i0("stop_id", this.f39657Z.mo19751c()));
            ParcelableMemRef parcelableMemRef = (ParcelableMemRef) intent.getParcelableExtra("stop");
            if (parcelableMemRef == null) {
                transitStop = null;
            } else {
                transitStop = (TransitStop) parcelableMemRef.mo24562b();
            }
            if (transitStop != null) {
                mo45902E2(transitStop);
            }
            ParcelableMemRef parcelableMemRef2 = (ParcelableMemRef) intent.getParcelableExtra("line_arrivals");
            if (parcelableMemRef2 != null) {
                list = (List) parcelableMemRef2.mo24562b();
            }
            if (list != null) {
                HashMap hashMap = new HashMap(1);
                hashMap.put(ArrivalsResponseKey.getKeyType(this.f39660n0, this.f39661o0), C20785a.m48772d(list));
                Time time = this.f39660n0;
                boolean z2 = this.f39661o0;
                this.f39659m0 = hashMap;
                this.f39663q0.setRefreshing(false);
                this.f39662p0.mo45924k(this, time, z2, this.f39659m0);
                ((C13120a) mo44551z1()).mo40025c(traceEvent);
            }
            if (intent.getBooleanExtra("smart_feature", false)) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
                CoordinatorLayout.C0752e eVar = new CoordinatorLayout.C0752e();
                eVar.f3271c = 81;
                C13704g gVar = C13704g.f33778b;
                if (C13704g.f33780d.mo19759a(gVar.f33781a).booleanValue() || C13704g.f33779c.mo19759a(gVar.f33781a).intValue() >= 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C16919g.C16924e eVar2 = C13704g.f33779c;
                    SharedPreferences sharedPreferences = gVar.f33781a;
                    eVar2.mo49545d(sharedPreferences, Integer.valueOf(eVar2.mo19759a(sharedPreferences).intValue() + 1));
                    ListItemView listItemView = (ListItemView) LayoutInflater.from(coordinatorLayout.getContext()).inflate(R.layout.helpfulness_query_view, coordinatorLayout, false);
                    C13701e eVar3 = new C13701e(gVar, listItemView, this, coordinatorLayout, eVar);
                    View accessoryView = listItemView.getAccessoryView();
                    accessoryView.findViewById(R.id.action_yes).setOnClickListener(eVar3);
                    accessoryView.findViewById(R.id.action_no).setOnClickListener(eVar3);
                    listItemView.setVisibility(4);
                    eVar.height = listItemView.getLayoutParams().height;
                    eVar.width = listItemView.getLayoutParams().width;
                    coordinatorLayout.addView(listItemView, eVar);
                    UiUtils.m40259r(listItemView, new C13702f(true, listItemView, coordinatorLayout));
                }
                intent.putExtra("smart_feature", false);
            }
            C12704f fVar = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
            mo45903F2();
            this.f39656Y.mo50564a();
            return;
        }
        throw new IllegalStateException("Stop detail can not be initiated without stop id!");
    }

    /* renamed from: D2 */
    public final void mo45901D2(Time time, boolean z) {
        String str;
        if (z) {
            str = "last";
        } else if (time == null) {
            str = "now";
        } else {
            str = InneractiveMediationNameConsts.OTHER;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.EDIT_TIME_DIALOG);
        aVar.mo49939g(AnalyticsAttributeKey.CHOSEN_TIME, str);
        mo44545v2(aVar.mo49933a());
        if (!C20975x0.m49118e(this.f39660n0, time) || this.f39661o0 != z) {
            this.f39660n0 = time;
            this.f39661o0 = z;
            if (this.f39662p0 != null) {
                mo45905H2();
            }
        }
    }

    /* renamed from: E2 */
    public final void mo45902E2(TransitStop transitStop) {
        boolean z;
        int i;
        DbEntityRef<TransitLine> b;
        TransitLine transitLine;
        TransitAgency transitAgency;
        TransitType transitType;
        boolean z2;
        C21100e.m49373x(transitStop, "stop");
        this.f39658l0 = transitStop;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STOP_LOADED);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.WHEELCHAIR_ACCESSIBLE;
        if ((transitStop.f23745q.f23627b & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo49941i(analyticsAttributeKey, z);
        mo44545v2(aVar.mo49933a());
        C20806a.C20807a aVar2 = new C20806a.C20807a("station_view");
        aVar2.mo52936d("station_id", transitStop.f23730b);
        aVar2.mo52934b(transitStop.f23731c, "station_name");
        aVar2.mo52934b(transitStop.f23733e, "stop_code");
        aVar2.f52526d = 30;
        MarketingEventImpressionBinder.m41586a(this, aVar2.mo52933a());
        MenuItem menuItem = this.f39665s0;
        if (menuItem != null) {
            if (this.f39658l0 == null || !((C17637d) getSystemService("ui_configuration")).f45346c) {
                z2 = false;
            } else {
                z2 = true;
            }
            menuItem.setVisible(z2);
        }
        Intent intent = getIntent();
        ServerId serverId = (ServerId) intent.getParcelableExtra("line_id");
        if (serverId != null) {
            intent.putExtra("line_id", (Parcelable) null);
        }
        this.f39662p0 = new C15340c(this, transitStop, serverId, this.f39655X, this, this.f39671y0);
        HashSet hashSet = C19728f.f50164e;
        ArrayList arrayList = new ArrayList(((C19728f) getSystemService("metro_context")).f50165a.mo20299a());
        arrayList.retainAll(Collections.unmodifiableSet(this.f39662p0.f39708m.keySet()));
        ListItemView listItemView = this.f39666t0;
        if (arrayList.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        listItemView.setVisibility(i);
        this.f39666t0.setOnClickListener(new C13536h(3, this, arrayList));
        if (arrayList.size() <= 1) {
            ListItemView listItemView2 = this.f39666t0;
            C20974x xVar = C20974x.f52733b;
            listItemView2.setOnTouchListener(xVar);
            listItemView2.setOnLongClickListener(xVar);
            listItemView2.setOnKeyListener(xVar);
            this.f39666t0.getBackground().setAlpha(0);
        } else {
            ListItemView listItemView3 = this.f39666t0;
            listItemView3.setOnTouchListener((View.OnTouchListener) null);
            listItemView3.setOnLongClickListener((View.OnLongClickListener) null);
            listItemView3.setOnKeyListener((View.OnKeyListener) null);
            this.f39666t0.getBackground().setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
        if (!arrayList.isEmpty()) {
            TransitType transitType2 = transitStop.f23744p.get();
            if (!(serverId == null || (b = transitStop.mo24410b(serverId)) == null || (transitLine = b.get()) == null || (transitAgency = transitLine.mo24369b().f23696d.get()) == null || (transitType = transitAgency.f23674d.get()) == null)) {
                transitType2 = transitType;
            }
            mo45907J2(Math.max(0, arrayList.indexOf(transitType2)), arrayList);
            mo45916z2();
        }
        mo45905H2();
        C15340c cVar = this.f39662p0;
        if (cVar != null) {
            C12778f fVar = this.f39670x0;
            fVar.mo39624d(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C1512f(8, fVar, this.f39657Z)).addOnCompleteListener((Activity) this, new C16729e(0, this, cVar));
        }
        if (this.f39669w0 == null) {
            this.f39667u0.mo4627l0(this.f39662p0);
        }
        this.f39663q0.setEnabled(!transitStop.f23735g.isEmpty());
        this.f39656Y.mo50565c();
    }

    /* renamed from: F2 */
    public final void mo45903F2() {
        C13556a aVar = this.f39668v0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39668v0 = null;
        }
        ServerId serverId = this.f39657Z;
        TransitStop transitStop = this.f39658l0;
        if (transitStop == null || !transitStop.f23730b.equals(serverId)) {
            C13752e x1 = mo44548x1();
            String simpleName = getClass().getSimpleName();
            C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
            d.mo21066a(metroEntityType, serverId);
            d.mo21067b(metroEntityType);
            C5267c cVar = new C5267c(x1, simpleName, hVar, d);
            this.f39668v0 = mo44528l2(cVar.mo21061O(), cVar, new C16732h(this, serverId));
        }
        mo45905H2();
        C15340c cVar2 = this.f39662p0;
        if (cVar2 != null) {
            C12778f fVar = this.f39670x0;
            fVar.mo39624d(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C1512f(8, fVar, this.f39657Z)).addOnCompleteListener((Activity) this, new C16729e(0, this, cVar2));
        }
        C14741h hVar2 = new C14741h();
        hVar2.mo44745a(1, mo44542u1());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.STATION_SCREEN_BANNER, hVar2);
    }

    /* renamed from: G2 */
    public final void mo45904G2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0942l lVar = (C0942l) supportFragmentManager.mo3923A("report_line_dialog_fragment_tag");
        if (lVar != null) {
            lVar.dismiss();
        }
        C0942l lVar2 = (C0942l) supportFragmentManager.mo3923A("time_picker_dialog_fragment_tag");
        if (lVar2 != null) {
            lVar2.dismiss();
        }
        supportFragmentManager.mo3981x();
    }

    /* renamed from: H2 */
    public final void mo45905H2() {
        TransitStop transitStop;
        if (this.f39662p0 != null && (transitStop = this.f39658l0) != null) {
            if (transitStop.f23735g.isEmpty()) {
                this.f39663q0.setRefreshing(false);
                return;
            }
            this.f39654U.mo23803d();
            C15331c cVar = this.f39669w0;
            if (cVar != null) {
                cVar.cancel(true);
                this.f39669w0 = null;
            }
            HashSet hashSet = this.f39662p0.f39707l;
            ArrayList arrayList = new ArrayList(2);
            C20792f y2 = mo45915y2(true, hashSet);
            String str = y2.f52475A;
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            arrayList.add(new C13753f(str, y2, requestOptions));
            if (hashSet.contains(TransitType.ViewType.DEFAULT) && (this.f39660n0 != null || this.f39661o0)) {
                C20792f y22 = mo45915y2(false, hashSet);
                String str2 = y22.f52475A;
                RequestOptions requestOptions2 = new RequestOptions();
                requestOptions2.f42909f = true;
                arrayList.add(new C13753f(str2, y22, requestOptions2));
            }
            C15331c cVar2 = new C15331c(arrayList, this.f39657Z);
            this.f39669w0 = cVar2;
            cVar2.mo40705b(this);
            if (C13382a.m33671g(this)) {
                this.f39654U.mo23802c();
            }
        }
    }

    /* renamed from: I2 */
    public final void mo45906I2(ServerId serverId, CongestionLevel congestionLevel) {
        int i;
        LatLonE6 j = LatLonE6.m40177j(mo44542u1());
        Parcelable.Creator<CreateReportRequestData> creator = CreateReportRequestData.CREATOR;
        switch (CreateReportRequestData.C15215d.f39220a[congestionLevel.ordinal()]) {
            case 2:
            case 3:
                i = 1;
                break;
            case 4:
            case 5:
                i = 2;
                break;
            case 6:
            case 7:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        CreateReportRequestData createReportRequestData = new CreateReportRequestData(ReportEntityType.STOP, serverId, (String) null, j, ReportCategoryType.STOP_CROWDEDNESS, (String) null, Integer.valueOf(i), System.currentTimeMillis());
        C17930a aVar = new C17930a(mo44548x1(), createReportRequestData, (String) null, (String) null);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17930a.class, sb, "_");
        sb.append(C17884p.m44335F(aVar.f33922v));
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, aVar, requestOptions, new C15332d());
        ReportCategoryType reportCategoryType = createReportRequestData.f39216f;
        ReportEntityType reportEntityType = createReportRequestData.f39212b;
        ServerId serverId2 = createReportRequestData.f39213c;
        if (C18150h.f46376f.contains(reportCategoryType)) {
            MoovitExecutors.COMPUTATION.submit(new C18150h(this, reportCategoryType, reportEntityType, serverId2));
        }
        Toast.makeText(this, R.string.station_crowdedness_report_confirmation, 1).show();
    }

    /* renamed from: J2 */
    public final void mo45907J2(int i, List list) {
        TransitType transitType;
        String str;
        boolean z;
        boolean z2;
        CharSequence charSequence;
        TransitType transitType2 = (TransitType) list.get(i);
        int i2 = i + 1;
        if (i2 < list.size()) {
            transitType = (TransitType) list.get(i2);
        } else {
            transitType = (TransitType) list.get(0);
        }
        String string = getString(R.string.stop_multiple_type_switch_label, new Object[]{getString(transitType.f23758c)});
        this.f39666t0.setText(transitType2.f23758c);
        ListItemView listItemView = this.f39666t0;
        if (list.size() > 1) {
            str = string;
        } else {
            str = null;
        }
        listItemView.setSubtitle((CharSequence) str);
        ListItemView listItemView2 = this.f39666t0;
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        listItemView2.setClickable(z);
        ListItemView listItemView3 = this.f39666t0;
        if (list.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        listItemView3.setLongClickable(z2);
        ListItemView listItemView4 = this.f39666t0;
        if (list.size() > 1) {
            charSequence = C13382a.m33667c(getString(R.string.voiceover_stop_multiple_type), getString(R.string.voiceover_selected, new Object[]{this.f39666t0.getTitle()}), string);
        } else {
            charSequence = this.f39666t0.getTitle();
        }
        listItemView4.setContentDescription(charSequence);
        C15340c cVar = this.f39662p0;
        if (!C20975x0.m49118e(cVar.f39712q, transitType2)) {
            cVar.f39712q = transitType2;
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: K */
    public final void mo39497K() {
        mo44545v2(new C17474b(AnalyticsEventKey.PHOTO_SENT));
    }

    /* renamed from: N */
    public final void mo45908N() {
        RealTimeHelpBannerView.m38837c(this);
        mo44545v2(new C17474b(AnalyticsEventKey.RT_HELP_BANNER_DISMISS_CLICKED));
    }

    /* renamed from: N0 */
    public final void mo45909N0() {
        startActivity(new Intent(this, RealTimeHelpActivity.class));
        mo44545v2(new C17474b(AnalyticsEventKey.RT_HELP_BANNER_LINK_CLICKED));
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        boolean z;
        getMenuInflater().inflate(R.menu.stop_detail_activity, menu);
        MenuItem findItem = menu.findItem(R.id.action_map);
        this.f39665s0 = findItem;
        boolean z2 = false;
        if (findItem != null) {
            if (this.f39658l0 == null || !((C17637d) getSystemService("ui_configuration")).f45346c) {
                z = false;
            } else {
                z = true;
            }
            findItem.setVisible(z);
        }
        if (((C17637d) getSystemService("ui_configuration")).f45349f == 1) {
            z2 = true;
        }
        MenuItem findItem2 = menu.findItem(R.id.direction_to_here);
        if (findItem2 != null) {
            findItem2.setVisible(z2);
        }
        MenuItem findItem3 = menu.findItem(R.id.directions_from_here);
        if (findItem3 != null) {
            findItem3.setVisible(z2);
        }
        return true;
    }

    /* renamed from: R */
    public final void mo45910R(TransitStop transitStop, CongestionLevel congestionLevel) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "crowdedness_section_still_crowded_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, this.f39657Z);
        mo44545v2(aVar.mo49933a());
        mo45906I2(transitStop.f23730b, congestionLevel);
    }

    /* renamed from: S1 */
    public final void mo19483S1(int i, String str) {
        Time time;
        if ("time_picker_dialog_fragment_tag".equals(str) && i == -1) {
            C12699d dVar = (C12699d) mo44539t1(str);
            if (dVar.f31361z) {
                time = null;
            } else {
                time = new Time(dVar.mo39477W1());
            }
            mo45901D2(time, false);
        }
    }

    /* renamed from: T */
    public final void mo45911T(TransitStop transitStop) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "crowdedness_section_not_crowded_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, this.f39657Z);
        mo44545v2(aVar.mo49933a());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str = C15356f.f39753h;
        if (supportFragmentManager.mo3923A(str) == null) {
            ServerId serverId = transitStop.f23730b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("stop_id", serverId);
            C15356f fVar = new C15356f();
            fVar.setArguments(bundle);
            fVar.show(supportFragmentManager, str);
        }
    }

    /* renamed from: W */
    public final void mo45912W(TextView textView, Time time) {
        if (mo44539t1("time_picker_dialog_fragment_tag") == null) {
            mo45904G2();
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_text_item_dropdown);
            arrayAdapter.add(getString(R.string.time_picker_select_time));
            arrayAdapter.add(getString(R.string.time_filter_next));
            arrayAdapter.add(getString(R.string.time_filter_last));
            DropDownListPopup dropDownListPopup = new DropDownListPopup(this);
            dropDownListPopup.setAdapter(arrayAdapter);
            dropDownListPopup.setModal(true);
            dropDownListPopup.setAnchorView(textView);
            dropDownListPopup.setOnItemClickListener(new C16731g(this, dropDownListPopup, time));
            dropDownListPopup.show();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "change_time_clicked");
            mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: Y */
    public final void mo45913Y(TransitLine transitLine, C12775d dVar, String str) {
        ServiceStatusCategory serviceStatusCategory;
        ServerId serverId = transitLine.mo24369b().f23694b;
        ServerId serverId2 = transitLine.f23687c;
        if (dVar != null) {
            serviceStatusCategory = dVar.f31580b.f23213b;
        } else {
            serviceStatusCategory = null;
        }
        startActivity(LineDetailActivity.m38386y2(this, serverId, serverId2, this.f39657Z, this.f39660n0));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LINE_SELECTED);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, serverId);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, serverId2);
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, this.f39657Z);
        aVar.mo49939g(AnalyticsAttributeKey.SCHEDULE_TYPE, str);
        aVar.mo49945m(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceStatusCategory));
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45900C2(intent);
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f39654U.mo23803d();
        C15331c cVar = this.f39669w0;
        if (cVar != null) {
            cVar.cancel(true);
            this.f39669w0 = null;
        }
        mo45904G2();
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        return new C16855d(this, R.id.coordinator_layout, Collections.singletonList(new C17293a(this, "stop_detail")));
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49937e(AnalyticsAttributeKey.STOP_ID, this.f39657Z);
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.stop_detail_activity);
        this.f39670x0 = C17635b.m43779f(this).f50174d;
        this.f39671y0 = C16738n.m42285w2(getSupportFragmentManager());
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo793o(false);
        }
        this.f39666t0 = (ListItemView) findViewById(R.id.spinner);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f39667u0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f39667u0;
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        sparseIntArray.put(10, R.drawable.divider_horizontal);
        sparseIntArray.put(11, R.drawable.divider_horizontal_full_8_surface_variant);
        sparseIntArray.put(12, R.drawable.divider_horizontal);
        sparseIntArray.put(20, R.drawable.divider_horizontal);
        sparseIntArray.put(22, R.drawable.divider_horizontal);
        sparseIntArray.put(31, R.drawable.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(this, sparseIntArray, false), -1);
        this.f39667u0.mo4593g(C18669f.m45651e(UiUtils.m40249h(getResources(), 75.0f)), -1);
        this.f39667u0.mo4615h(new C16733i(this));
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.f39664r0 = searchView;
        searchView.setOnQueryTextListener(new C16734j(this));
        this.f39664r0.setOnQueryTextFocusChangeListener(new C16728d(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.f39663q0 = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(R.attr.colorSecondary, this));
        this.f39663q0.setOnRefreshListener(new C1513g(this, 7));
        if (this.f39656Y == null) {
            this.f39656Y = new C18118d(this, C20199a.f51252N0);
        }
        ((C13120a) mo44551z1()).mo40024b(TraceEvent.STOP_DETAIL_ACTIVITY_LOADED);
        mo45900C2(getIntent());
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        mo45903F2();
    }

    /* renamed from: h0 */
    public final void mo45914h0(TransitLine transitLine, Time time, C12775d dVar) {
        ServiceStatusCategory serviceStatusCategory;
        ServerId serverId = transitLine.mo24369b().f23694b;
        ServerId serverId2 = transitLine.f23687c;
        if (dVar != null) {
            serviceStatusCategory = dVar.f31580b.f23213b;
        } else {
            serviceStatusCategory = null;
        }
        startActivity(LineTripPatternActivity.m38437z2(this, serverId, serverId2, this.f39657Z, time));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LINE_SELECTED);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, serverId);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, serverId2);
        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, this.f39657Z);
        aVar.mo49945m(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceStatusCategory));
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        Map map;
        super.mo19427i2();
        TransitStop transitStop = this.f39658l0;
        Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map2 = this.f39659m0;
        Time time = null;
        if (map2 == null) {
            map = null;
        } else if (map2.size() > 1) {
            map = this.f39659m0.get((Object) null);
        } else {
            map = (Map) this.f39659m0.entrySet().iterator().next().getValue();
        }
        if (transitStop != null) {
            LatLonE6 j = LatLonE6.m40177j(this.f37295D.mo50014i());
            if (map != null) {
                for (C20787c cVar : map.values()) {
                    Time m = cVar.f52458c.mo24326m();
                    if (m != null && (time == null || m.compareTo(time) < 0)) {
                        time = m;
                    }
                }
            }
            C18641a.f47503b.mo51027a(new SurveyStopEvent(System.currentTimeMillis(), DbEntityRef.newTransitStopRef(transitStop), j, time));
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
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
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_map) {
            TransitStop transitStop = this.f39658l0;
            Intent intent = new Intent(this, StopDetailMapActivity.class);
            intent.putExtra("stop", transitStop);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.direction_to_here) {
            TransitStop transitStop2 = this.f39658l0;
            mo44545v2(new C17474b(AnalyticsEventKey.SET_AS_DESTINATION_CLICKED));
            TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
            dVar.f23791b = LocationDescriptor.m17769c(transitStop2);
            startActivity(SuggestRoutesActivity.m39325M2(this, dVar.mo23958a(), true));
            return true;
        } else if (itemId != R.id.directions_from_here) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            TransitStop transitStop3 = this.f39658l0;
            mo44545v2(new C17474b(AnalyticsEventKey.SET_AS_ORIGIN_CLICKED));
            TripPlanParams.C7626d dVar2 = new TripPlanParams.C7626d();
            dVar2.f23790a = LocationDescriptor.m17769c(transitStop3);
            startActivity(SuggestRoutesActivity.m39325M2(this, dVar2.mo23958a(), true));
            return true;
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("GTFS_METRO_ENTITIES_LOADER");
        hashSet.add("GTFS_TRIPS_SCHEDULE_LOADER");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("confirm_new_trip_dialog_tag".equals(str)) {
            if (i == -1) {
                NavigationService.m11306G(this);
                startActivity(MultiLegNavActivity.m38729U2(this, ((TransitLine) bundle.getParcelable("line")).f23687c));
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final C20792f mo45915y2(boolean z, HashSet hashSet) {
        Time time;
        C13752e x1 = mo44548x1();
        HashSet hashSet2 = C19728f.f50164e;
        C19728f fVar = (C19728f) getSystemService("metro_context");
        C19047a.C19048a aVar = C19047a.f48441d;
        C19047a aVar2 = (C19047a) getSystemService("user_configuration");
        C21100e.m49373x(x1, "requestContext");
        C21100e.m49373x(fVar, "metroContext");
        C21100e.m49373x(aVar2, "configuration");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C20786b bVar = new C20786b();
        linkedHashSet.add(this.f39657Z);
        bVar.f52453g = true;
        if (hashSet.contains(TransitType.ViewType.DEFAULT) || hashSet.contains(TransitType.ViewType.PLATFORMS)) {
            bVar.f52450d = true;
        }
        if (z) {
            if (hashSet.contains(TransitType.ViewType.TRIPS)) {
                bVar.f52452f = true;
                bVar.f52455i = true;
            }
            Time time2 = this.f39660n0;
            if (time2 != null) {
                long g = time2.mo24631g();
                if (g < 0) {
                    time = null;
                } else {
                    time = new Time(g);
                }
                bVar.f52447a = time;
            }
            if (this.f39661o0) {
                bVar.f52450d = true;
                bVar.f52451e = true;
            }
        }
        return new C20792f(x1, fVar, aVar2, new ArrayList(linkedHashSet), bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0 != false) goto L_0x0023;
     */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45916z2() {
        /*
            r5 = this;
            com.moovit.app.stopdetail.c r0 = r5.f39662p0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.moovit.transit.TransitType r3 = r0.f39712q
            if (r3 != 0) goto L_0x000b
            goto L_0x001e
        L_0x000b:
            s0.b r0 = r0.f39708m
            r4 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r4)
            com.moovit.app.stopdetail.c$i r0 = (com.moovit.app.stopdetail.C15340c.C15349i) r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.mo45893f()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            androidx.appcompat.widget.SearchView r0 = r5.f39664r0
            if (r1 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 8
        L_0x002a:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stopdetail.StopDetailActivity.mo45916z2():void");
    }
}
