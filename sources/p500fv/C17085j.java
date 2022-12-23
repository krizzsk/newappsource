package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.j */
public final class C17085j implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.LINE_OUT_OF_SERVICE.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.LINE_OUT_OF_SERVICE;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.line_out_of_service_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_line_out_of_service;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.line_out_of_service_title;
    }
}
