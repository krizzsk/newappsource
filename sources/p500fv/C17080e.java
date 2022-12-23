package p500fv;

import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.C15224e;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.e */
public final class C17080e extends C17077b {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_LINE_DIDNT_STOP.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_LINE_DIDNT_STOP;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_line_not_stop;
    }

    /* renamed from: f */
    public final int mo49681f() {
        return R.drawable.wdg_ic_report_line_not_stop;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_didnt_stop_title;
    }

    public final ReportEntityType getType() {
        return ReportEntityType.LINE;
    }

    /* renamed from: h */
    public final View mo49684h(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        return new C15224e(moovitActivity, aVar);
    }
}
