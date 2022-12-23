package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.y */
public final class C17100y implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.STOP_MISSING_LINE.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.STOP_MISSING_LINE;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.stop_missing_line_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_missing_line;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.stop_missing_line_title;
    }
}
