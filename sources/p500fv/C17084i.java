package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.i */
public final class C17084i implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_MISSING.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_MISSING;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.line_not_found_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return 0;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_not_found_title;
    }
}
