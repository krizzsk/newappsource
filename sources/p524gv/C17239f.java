package p524gv;

import com.moovit.app.reports.community.CommunityReportsActivity;
import com.moovit.app.reports.service.CreateReportRequestData;
import ga0.C12704f;
import p567iq.C17635b;
import p594jv.C17930a;
import p594jv.C17931b;
import p594jv.C17937g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: gv.f */
public final class C17239f extends C20438i<C17930a, C17931b> {

    /* renamed from: b */
    public final /* synthetic */ CreateReportRequestData f44564b;

    /* renamed from: c */
    public final /* synthetic */ String f44565c;

    /* renamed from: d */
    public final /* synthetic */ String f44566d;

    /* renamed from: e */
    public final /* synthetic */ CommunityReportsActivity f44567e;

    public C17239f(CommunityReportsActivity communityReportsActivity, CreateReportRequestData createReportRequestData, String str, String str2) {
        this.f44567e = communityReportsActivity;
        this.f44564b = createReportRequestData;
        this.f44565c = str;
        this.f44566d = str2;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17930a aVar = (C17930a) cVar;
        C17931b bVar = (C17931b) gVar;
        CommunityReportsActivity communityReportsActivity = this.f44567e;
        C12704f fVar = communityReportsActivity.f39179X;
        if (fVar == null || fVar.getDialog() == null) {
            communityReportsActivity.setResult(-1);
            communityReportsActivity.finish();
            return;
        }
        communityReportsActivity.f39179X.mo39495T1();
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C17930a aVar = (C17930a) cVar;
        CommunityReportsActivity communityReportsActivity = this.f44567e;
        CreateReportRequestData createReportRequestData = this.f44564b;
        String str = this.f44565c;
        String str2 = this.f44566d;
        int i = CommunityReportsActivity.f39177Y;
        communityReportsActivity.getClass();
        C17635b.m43779f(communityReportsActivity).f50172b.mo42913b(new C17937g(communityReportsActivity, createReportRequestData, str, str2), true);
        CommunityReportsActivity communityReportsActivity2 = this.f44567e;
        C12704f fVar = communityReportsActivity2.f39179X;
        if (fVar == null || fVar.getDialog() == null) {
            communityReportsActivity2.setResult(-1);
            communityReportsActivity2.finish();
        } else {
            communityReportsActivity2.f39179X.mo39495T1();
        }
        return true;
    }
}
