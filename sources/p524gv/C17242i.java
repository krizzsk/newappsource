package p524gv;

import com.moovit.app.reports.community.CommunityStopReportsActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5271f;
import i30.C5272g;
import java.util.ArrayList;

/* renamed from: gv.i */
public final class C17242i extends C5272g<C5267c, C5271f> {

    /* renamed from: d */
    public final /* synthetic */ CommunityStopReportsActivity f44570d;

    public C17242i(CommunityStopReportsActivity communityStopReportsActivity) {
        this.f44570d = communityStopReportsActivity;
    }

    /* renamed from: e */
    public final void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList) {
        C5267c cVar = (C5267c) aVar;
        if (arrayList.isEmpty()) {
            TransitStop c = dVar.mo21064c(this.f44570d.f39178U);
            CommunityStopReportsActivity communityStopReportsActivity = this.f44570d;
            int i = CommunityStopReportsActivity.f39181Z;
            ListItemView listItemView = (ListItemView) communityStopReportsActivity.findViewById(R.id.header);
            listItemView.setIcon(c.f23734f);
            listItemView.setTitle((CharSequence) c.f23731c);
            listItemView.setSubtitle((CharSequence) c.f23733e);
        }
    }
}
