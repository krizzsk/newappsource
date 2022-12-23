package com.moovit.app.reports.community;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c70.C13752e;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.metro.ReportCategoryType;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.util.HashSet;
import p500fv.C17076a;
import p500fv.C17090o;
import p524gv.C17238e;
import p524gv.C17244k;
import p824tp.C19728f;

public class CommunityLineReportsActivity extends CommunityReportsActivity<TransitLine> {

    /* renamed from: Z */
    public static final /* synthetic */ int f39176Z = 0;

    /* renamed from: A2 */
    public final void mo45686A2(Parcelable parcelable) {
        TransitLine transitLine = (TransitLine) parcelable;
        ServerId serverId = this.f39178U;
        if (serverId != null) {
            if (transitLine == null || !serverId.equals(transitLine.f23687c)) {
                C13752e x1 = mo44548x1();
                String simpleName = getClass().getSimpleName();
                C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
                C5269e d = C16759e.m42348d(hVar, "metroInfo");
                d.mo21066a(MetroEntityType.TRANSIT_LINE, this.f39178U);
                C5267c cVar = new C5267c(x1, simpleName, hVar, d);
                mo44528l2(cVar.mo21061O(), cVar, new C17238e(this));
                return;
            }
            mo45687B2(transitLine);
        }
    }

    /* renamed from: B2 */
    public final void mo45687B2(TransitLine transitLine) {
        HashSet hashSet = C19728f.f50164e;
        C16181a.m41233b(((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.LINE_NEWS), (ListItemView) findViewById(R.id.header), transitLine);
    }

    /* renamed from: y2 */
    public final void mo45688y2() {
        if (getSupportFragmentManager().mo3923A("editReportTag") == null) {
            ((ListItemView) findViewById(R.id.header)).setVisibility(8);
            String stringExtra = getIntent().getStringExtra("lineNameExtra");
            C17076a a = C17090o.m43019c().mo49687a(ReportCategoryType.LINE_MISSING);
            setTitle(a.mo49682g());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0909a aVar = new C0909a(supportFragmentManager);
            C17244k kVar = new C17244k();
            Bundle bundle = new Bundle();
            bundle.putParcelable("reportEntityType", a.mo49679b());
            bundle.putString("lineNameExtra", stringExtra);
            bundle.putInt("reportEntityLabelType", a.mo49676c());
            kVar.setArguments(bundle);
            aVar.mo4041e(R.id.communityReportsContainer, kVar, "editReportTag", 1);
            aVar.mo4040d();
        }
    }

    /* renamed from: z2 */
    public final ReportEntityType mo45689z2() {
        return ReportEntityType.LINE;
    }
}
