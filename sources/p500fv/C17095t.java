package p500fv;

import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.t */
public final class C17095t implements C17076a {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.STOP_STATION_CLOSED.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.STOP_STATION_CLOSED;
    }

    /* renamed from: c */
    public final int mo49676c() {
        return R.string.stop_station_closed_label;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_station_closed;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.stop_station_closed_title;
    }
}
