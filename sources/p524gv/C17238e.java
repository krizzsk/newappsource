package p524gv;

import com.moovit.app.reports.community.CommunityLineReportsActivity;
import com.moovit.transit.TransitLine;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5271f;
import i30.C5272g;
import java.util.ArrayList;

/* renamed from: gv.e */
public final class C17238e extends C5272g<C5267c, C5271f> {

    /* renamed from: d */
    public final /* synthetic */ CommunityLineReportsActivity f44563d;

    public C17238e(CommunityLineReportsActivity communityLineReportsActivity) {
        this.f44563d = communityLineReportsActivity;
    }

    /* renamed from: e */
    public final void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList) {
        C5267c cVar = (C5267c) aVar;
        if (arrayList.isEmpty()) {
            TransitLine b = dVar.mo21063b(this.f44563d.f39178U);
            CommunityLineReportsActivity communityLineReportsActivity = this.f44563d;
            int i = CommunityLineReportsActivity.f39176Z;
            communityLineReportsActivity.mo45687B2(b);
        }
    }
}
