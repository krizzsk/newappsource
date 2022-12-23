package p618kv;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.moovit.protocol.common.MVUserReportCategoryType;
import p269u2.C6677a;
import p500fv.C17091p;
import p543hq.C17474b;
import p567iq.C17635b;
import p618kv.C18145f;

/* renamed from: kv.g */
public final class C18149g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f46374b;

    /* renamed from: c */
    public final /* synthetic */ C18145f.C18148c f46375c;

    public C18149g(C18145f.C18148c cVar, int i) {
        this.f46375c = cVar;
        this.f46374b = i;
    }

    public final void onClick(View view) {
        AnalyticsFlowKey analyticsFlowKey;
        boolean z;
        int i;
        C17091p pVar = (C17091p) view.getTag();
        FragmentActivity activity = C18145f.this.getActivity();
        C18145f fVar = C18145f.this;
        Fragment parentFragment = fVar.getParentFragment();
        if (parentFragment instanceof C15682c) {
            analyticsFlowKey = ((C15682c) parentFragment).mo46778M1();
        } else {
            A a = fVar.f40792c;
            if (a != null) {
                analyticsFlowKey = a.f37306O;
            } else {
                analyticsFlowKey = null;
            }
        }
        if (analyticsFlowKey != null) {
            MVUserReportCategoryType i2 = C7841a.m17871i(pVar.mo49679b());
            boolean z2 = true;
            if (i2.setField_ == MVUserReportCategoryType._Fields.LINE_CATEGORY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = i2.mo26436m().getValue();
            } else {
                i = 0;
            }
            if (i2.setField_ != MVUserReportCategoryType._Fields.STOP_CATEOGRY) {
                z2 = false;
            }
            if (z2) {
                i = i2.mo26437n().getValue();
            }
            C6677a aVar = C17635b.m43779f(activity).f50173c;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.REPORT_ITEM_CLICKED);
            aVar2.mo49935c(AnalyticsAttributeKey.REPORT_TYPE, i);
            aVar.mo22850h(analyticsFlowKey, aVar2.mo49933a());
        }
        C18145f fVar2 = C18145f.this;
        int i3 = this.f46374b;
        int i4 = C18145f.f46369h;
        C15222d.m38901S1(i3, pVar.mo49679b(), (ReportEntityType) fVar2.getArguments().getSerializable("reportTypeExtra"), (ServerId) fVar2.getArguments().getParcelable("entityIdExtra")).show(fVar2.getFragmentManager(), "editReport");
        fVar2.dismiss();
    }
}
