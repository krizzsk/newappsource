package p500fv;

import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.v */
public final class C17097v extends C17092q {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return ReportCategoryType.STOP_FACILITY_CONDITION.equals(reportCategoryType);
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.STOP_FACILITY_CONDITION;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_facility_condition;
    }

    /* renamed from: f */
    public final int mo49681f() {
        return R.drawable.wdg_ic_report_facility_condition;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.stop_facility_condition_title;
    }

    public final ReportEntityType getType() {
        return ReportEntityType.STOP;
    }

    /* renamed from: h */
    public final View mo49684h(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        return C17092q.m43026j(moovitActivity, R.string.stop_facility_condition_title, R.array.stop_facility_condition_options_array, R.string.stop_facility_condition_hint, aVar);
    }

    /* renamed from: i */
    public final int mo49686i() {
        return R.array.stop_facility_condition_options_array;
    }
}
