package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.l */
public final class C17087l implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_ROUTE_CHANGE.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_ROUTE_CHANGE;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.line_route_change_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_route_change;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_route_change_title;
    }
}
