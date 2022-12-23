package com.moovit.app.reports.service;

import android.app.Dialog;
import android.os.Bundle;
import com.moovit.C15676b;
import com.moovit.app.reports.list.ReportsListActivity;
import com.tranzmate.R;
import ga0.C12709i;
import p618kv.C18140a;
import p824tp.C19740r;
import p824tp.C19746x;

public class ActionReportDialog extends C15676b<ReportsListActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f39206j = 0;

    /* renamed from: h */
    public ReportUserAction f39207h;

    /* renamed from: i */
    public String f39208i;

    public enum ReportUserAction {
        DELETE,
        INAPPROPRIATE
    }

    /* renamed from: com.moovit.app.reports.service.ActionReportDialog$a */
    public static /* synthetic */ class C15211a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction[] r0 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39209a = r0
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction r1 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.DELETE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39209a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.reports.service.ActionReportDialog$ReportUserAction r1 = com.moovit.app.reports.service.ActionReportDialog.ReportUserAction.INAPPROPRIATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.service.ActionReportDialog.C15211a.<clinit>():void");
        }
    }

    public ActionReportDialog() {
        super(ReportsListActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C12709i iVar = new C12709i(this.f40792c);
        this.f39207h = ReportUserAction.values()[getArguments().getInt("userAction")];
        this.f39208i = getArguments().getString("reportId");
        int i = C15211a.f39209a[this.f39207h.ordinal()];
        if (i == 1) {
            iVar.setTitle((CharSequence) getString(R.string.delete_report));
            iVar.mo39502c(getString(R.string.delete_report_description));
        } else if (i == 2) {
            iVar.setTitle((CharSequence) getString(R.string.inappropriate_report_dialog_title));
            iVar.mo39502c(getString(R.string.inappropriate_report_dialog_description));
        }
        C12709i iVar2 = iVar;
        iVar2.mo39500a(C19740r.positive_button, -1, (CharSequence) null, C19746x.std_positive_button, new C18140a(this));
        C12709i iVar3 = iVar;
        iVar3.mo39500a(C19740r.negative_button, -2, (CharSequence) null, C19746x.std_negative_button, C12709i.f31386b);
        return iVar;
    }
}
