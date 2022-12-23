package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.h */
public final class C17083h implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_LATE_DELAY.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_LATE_DELAY;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.line_schedule_incorrect_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_late;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_schedule_incorrect_title;
    }
}
