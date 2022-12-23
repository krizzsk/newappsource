package p500fv;

import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.g */
public final class C17082g extends C17092q {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_INCIDENT.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_INCIDENT;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_incident;
    }

    /* renamed from: f */
    public final int mo49681f() {
        return R.drawable.wdg_ic_report_incident;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.incident_title;
    }

    public final ReportEntityType getType() {
        return ReportEntityType.LINE;
    }

    /* renamed from: h */
    public final View mo49684h(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        return C17092q.m43026j(moovitActivity, R.string.incident_title, R.array.line_incident_options_array, R.string.line_incident_hint, aVar);
    }

    /* renamed from: i */
    public final int mo49686i() {
        return R.array.line_incident_options_array;
    }
}
