package p618kv;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;

/* renamed from: kv.d */
public final /* synthetic */ class C18143d implements DialogInterface.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ C15222d f46367b;

    public /* synthetic */ C18143d(C15222d dVar) {
        this.f46367b = dVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C15222d dVar = this.f46367b;
        int i2 = C15222d.f39248j;
        dVar.getClass();
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            return true;
        }
        if (dVar.f39250i) {
            dVar.dismissAllowingStateLoss();
            return true;
        }
        int i3 = dVar.getArguments().getInt("selectedPageExtra", -1);
        if (i3 == -1) {
            dVar.dismissAllowingStateLoss();
            return true;
        }
        C18145f.m44854S1((ReportEntityType) dVar.getArguments().getSerializable("reportTypeExtra"), (ServerId) dVar.getArguments().getParcelable("entityIdExtra"), i3).show(dVar.getFragmentManager(), "categoryReportList");
        dVar.dismissAllowingStateLoss();
        return true;
    }
}
