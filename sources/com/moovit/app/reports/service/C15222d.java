package com.moovit.app.reports.service;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.reports.service.C15220c;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.R;
import p001a0.C0017h;
import p500fv.C17090o;
import p500fv.C17091p;
import p543hq.C17474b;
import p548hv.C17499b;
import p594jv.C17942l;
import p618kv.C18143d;
import p618kv.C18150h;
import p618kv.C18152i;

/* renamed from: com.moovit.app.reports.service.d */
public class C15222d extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f39248j = 0;

    /* renamed from: h */
    public ReportCategoryType f39249h;

    /* renamed from: i */
    public boolean f39250i;

    /* renamed from: com.moovit.app.reports.service.d$a */
    public class C15223a implements C15220c.C15221a {

        /* renamed from: a */
        public final /* synthetic */ C17091p f39251a;

        public C15223a(C17091p pVar) {
            this.f39251a = pVar;
        }

        /* renamed from: a */
        public final void mo45721a(C18152i iVar) {
            C15222d dVar = C15222d.this;
            C17091p pVar = this.f39251a;
            int i = C15222d.f39248j;
            InputMethodManager inputMethodManager = (InputMethodManager) dVar.f40792c.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(dVar.getDialog().findViewById(R.id.report_edit_text).getWindowToken(), 0);
            }
            LatLonE6 j = LatLonE6.m40177j(C16202a.get(dVar.f40792c).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i());
            CreateReportRequestData createReportRequestData = new CreateReportRequestData((ReportEntityType) dVar.mo46752K1().getSerializable("reportTypeExtra"), (ServerId) dVar.mo46752K1().getParcelable("entityIdExtra"), (String) null, j, pVar.mo49679b(), iVar.f46383b, iVar.f46382a, System.currentTimeMillis());
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.REPORT_SEND_CLICKED);
            aVar.mo49938f(AnalyticsAttributeKey.REPORT_TYPE, C7841a.m17871i(createReportRequestData.f39216f));
            aVar.mo49938f(AnalyticsAttributeKey.TYPE, C17499b.m43613a(createReportRequestData.f39212b));
            aVar.mo49937e(AnalyticsAttributeKey.ID, createReportRequestData.f39213c);
            dVar.mo22564R1(aVar.mo49933a());
            A a = dVar.f40792c;
            ReportCategoryType reportCategoryType = createReportRequestData.f39216f;
            ReportEntityType reportEntityType = createReportRequestData.f39212b;
            ServerId serverId = createReportRequestData.f39213c;
            if (C18150h.f46376f.contains(reportCategoryType)) {
                MoovitExecutors.COMPUTATION.submit(new C18150h(a, reportCategoryType, reportEntityType, serverId));
            }
            C17942l lVar = (C17942l) dVar.getFragmentManager().mo3923A("sendReportFragmentTag");
            if (lVar == null) {
                FragmentManager fragmentManager = dVar.getFragmentManager();
                C0909a K = C0017h.m54K(fragmentManager, fragmentManager);
                C17942l lVar2 = new C17942l();
                Bundle bundle = new Bundle();
                bundle.putParcelable("reportRequestDataExtra", createReportRequestData);
                lVar2.setArguments(bundle);
                K.mo4041e(0, lVar2, "sendReportFragmentTag", 1);
                K.mo4040d();
            } else {
                lVar.mo50472m2(createReportRequestData);
            }
            dVar.f39250i = true;
        }

        /* renamed from: b */
        public final void mo45722b() {
            C15222d.this.dismissAllowingStateLoss();
        }
    }

    public C15222d() {
        super(MoovitActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: S1 */
    public static C15222d m38901S1(int i, ReportCategoryType reportCategoryType, ReportEntityType reportEntityType, ServerId serverId) {
        Bundle bundle = new Bundle();
        bundle.putInt("selectedPageExtra", i);
        C21100e.m49373x(reportCategoryType, "reportCategory");
        bundle.putSerializable("categoryReportExtra", reportCategoryType);
        C21100e.m49373x(reportEntityType, "reportEntityType");
        bundle.putSerializable("reportTypeExtra", reportEntityType);
        C21100e.m49373x(serverId, "entityId");
        bundle.putParcelable("entityIdExtra", serverId);
        C15222d dVar = new C15222d();
        dVar.setArguments(bundle);
        return dVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f39249h = (ReportCategoryType) mo46752K1().getSerializable("categoryReportExtra");
        C17091p d = C17090o.m43019c().mo49689d(this.f39249h);
        View h = d.mo49684h(this.f40792c, new C15223a(d));
        if (d.getType().equals(ReportEntityType.LINE)) {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager.mo3923A("sendReportFragmentTag") == null) {
                C0909a aVar = new C0909a(fragmentManager);
                C17942l lVar = new C17942l();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("reportRequestDataExtra", (Parcelable) null);
                lVar.setArguments(bundle2);
                aVar.mo4041e(0, lVar, "sendReportFragmentTag", 1);
                aVar.mo4040d();
            }
        }
        return h;
    }

    public final void onResume() {
        super.onResume();
        getDialog().setOnKeyListener(new C18143d(this));
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "quick_action_report_dialog_impression");
        aVar.mo49938f(AnalyticsAttributeKey.REPORT_TYPE, C7841a.m17871i(this.f39249h));
        mo22564R1(aVar.mo49933a());
    }
}
