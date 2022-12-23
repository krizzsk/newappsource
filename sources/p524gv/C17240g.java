package p524gv;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.reports.community.CommunityReportsActivity;
import com.tranzmate.R;
import p500fv.C17076a;
import p543hq.C17474b;

/* renamed from: gv.g */
public final class C17240g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C17241h f44568b;

    public C17240g(C17241h hVar) {
        this.f44568b = hVar;
    }

    public final void onClick(View view) {
        String str;
        C17076a aVar = (C17076a) view.getTag();
        C17241h hVar = this.f44568b;
        int i = C17241h.f44569n;
        CommunityReportsActivity communityReportsActivity = (CommunityReportsActivity) hVar.f40822c;
        communityReportsActivity.getClass();
        switch (CommunityReportsActivity.C15201a.f39180a[aVar.mo49679b().ordinal()]) {
            case 1:
                str = "station_closed_clicked";
                break;
            case 2:
                str = "wrong_location_clicked";
                break;
            case 3:
                str = "wrong_or_missing_line_clicked";
                break;
            case 4:
                str = "wronge_schedule_clicked";
                break;
            case 5:
                str = "line_not_active_cilcked";
                break;
            case 6:
                str = "wrong_route_clicked";
                break;
            default:
                str = "";
                break;
        }
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, str);
        communityReportsActivity.mo44545v2(aVar2.mo49933a());
        FragmentManager supportFragmentManager = communityReportsActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar3 = new C0909a(supportFragmentManager);
        aVar3.mo4112g(R.anim.slide_fragment_enter, R.anim.slide_fragment_exit, R.anim.slide_fragment_pop_enter, R.anim.slide_fragment_pop_exit);
        C17243j jVar = new C17243j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("reportEntityType", aVar.mo49679b());
        bundle.putInt("reportEntityLabelType", aVar.mo49676c());
        jVar.setArguments(bundle);
        aVar3.mo4111f(R.id.communityReportsContainer, jVar, "editReportTag");
        aVar3.mo4110c("editReportTag");
        aVar3.mo4040d();
    }
}
