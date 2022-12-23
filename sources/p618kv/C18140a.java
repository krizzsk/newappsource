package p618kv;

import android.content.DialogInterface;
import com.moovit.app.reports.list.C15210a;
import com.moovit.app.reports.list.ReportsListActivity;
import com.moovit.app.reports.service.ActionReportDialog;
import com.moovit.request.RequestOptions;
import p567iq.C17635b;
import p594jv.C17932c;
import p594jv.C17945m;

/* renamed from: kv.a */
public final /* synthetic */ class C18140a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ActionReportDialog f46364b;

    public /* synthetic */ C18140a(ActionReportDialog actionReportDialog) {
        this.f46364b = actionReportDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActionReportDialog actionReportDialog = this.f46364b;
        int i2 = ActionReportDialog.f39206j;
        ReportsListActivity reportsListActivity = (ReportsListActivity) actionReportDialog.f40792c;
        ActionReportDialog.ReportUserAction reportUserAction = actionReportDialog.f39207h;
        String str = actionReportDialog.f39208i;
        reportsListActivity.getClass();
        int i3 = ReportsListActivity.C15204c.f39194b[reportUserAction.ordinal()];
        if (i3 == 1) {
            C17932c cVar = new C17932c(reportsListActivity.mo44548x1(), str);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            reportsListActivity.mo44527k2("deleteReportRequest", cVar, requestOptions, new C15210a(reportsListActivity, str));
        } else if (i3 == 2) {
            C17635b.m43779f(reportsListActivity).f50172b.mo42913b(new C17945m(reportsListActivity, str), true);
        }
        actionReportDialog.dismiss();
    }
}
