package com.moovit.app.reports.community;

import android.os.Parcelable;
import c70.C13752e;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.design.view.list.ListItemView;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import p524gv.C17242i;
import p824tp.C19728f;

public class CommunityStopReportsActivity extends CommunityReportsActivity<TransitStop> {

    /* renamed from: Z */
    public static final /* synthetic */ int f39181Z = 0;

    /* renamed from: A2 */
    public final void mo45686A2(Parcelable parcelable) {
        TransitStop transitStop = (TransitStop) parcelable;
        ServerId serverId = this.f39178U;
        if (serverId != null) {
            if (transitStop == null || !serverId.equals(transitStop.f23730b)) {
                C13752e x1 = mo44548x1();
                String simpleName = getClass().getSimpleName();
                C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
                C5269e d = C16759e.m42348d(hVar, "metroInfo");
                d.mo21066a(MetroEntityType.TRANSIT_STOP, this.f39178U);
                C5267c cVar = new C5267c(x1, simpleName, hVar, d);
                mo44528l2(cVar.mo21061O(), cVar, new C17242i(this));
                return;
            }
            ListItemView listItemView = (ListItemView) findViewById(R.id.header);
            listItemView.setIcon(transitStop.f23734f);
            listItemView.setTitle((CharSequence) transitStop.f23731c);
            listItemView.setSubtitle((CharSequence) transitStop.f23733e);
        }
    }

    /* renamed from: z2 */
    public final ReportEntityType mo45689z2() {
        return ReportEntityType.STOP;
    }
}
