package p500fv;

import android.content.Context;
import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.C15226g;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.f */
public final class C17081f implements C17091p {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_DRIVERS_RANK.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_DRIVERS_RANK;
    }

    /* renamed from: d */
    public final String mo49677d(int i, Context context) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(context.getString(R.string.unicode_black_star));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_driver_rank;
    }

    /* renamed from: f */
    public final int mo49681f() {
        return R.drawable.wdg_ic_report_driver_rank;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_driver_rank_title;
    }

    public final ReportEntityType getType() {
        return ReportEntityType.LINE;
    }

    /* renamed from: h */
    public final View mo49684h(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        return new C15226g(moovitActivity, aVar);
    }
}
