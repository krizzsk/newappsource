package p500fv;

import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;

/* renamed from: fv.u */
public final class C17096u extends C17093r {
    /* renamed from: a */
    public final boolean mo49678a(ReportCategoryType reportCategoryType) {
        return reportCategoryType == ReportCategoryType.STOP_CROWDEDNESS;
    }

    /* renamed from: b */
    public final ReportCategoryType mo49679b() {
        return ReportCategoryType.STOP_CROWDEDNESS;
    }

    /* renamed from: e */
    public final int mo49680e() {
        return R.drawable.img_report_crowdedness;
    }

    /* renamed from: f */
    public final int mo49681f() {
        return R.drawable.wdg_ic_report_crowdedness;
    }

    /* renamed from: g */
    public final int mo49682g() {
        return R.string.crowdedness_title;
    }

    public final ReportEntityType getType() {
        return ReportEntityType.STOP;
    }

    /* renamed from: h */
    public final View mo49684h(MoovitActivity moovitActivity, C15222d.C15223a aVar) {
        return C17093r.m43029j(moovitActivity, R.string.crowdedness_title, R.array.stop_crowdedness_options_array, R.array.report_station_crowdedness, R.string.stop_crowdedness_hint, aVar);
    }

    /* renamed from: i */
    public final int mo49685i() {
        return R.array.stop_crowdedness_options_array;
    }
}
