package p926xv;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.servicealerts.LineServiceAlertSelectionActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p039c7.C1800c;

/* renamed from: xv.d */
public final /* synthetic */ class C20623d implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ LineServiceAlertSelectionActivity f52136b;

    /* renamed from: c */
    public final /* synthetic */ List f52137c;

    public /* synthetic */ C20623d(LineServiceAlertSelectionActivity lineServiceAlertSelectionActivity, ArrayList arrayList) {
        this.f52136b = lineServiceAlertSelectionActivity;
        this.f52137c = arrayList;
    }

    public final void onComplete(Task task) {
        LineServiceAlertSelectionActivity lineServiceAlertSelectionActivity = this.f52136b;
        List list = this.f52137c;
        int i = LineServiceAlertSelectionActivity.f39551X;
        lineServiceAlertSelectionActivity.getClass();
        if (task.isSuccessful()) {
            lineServiceAlertSelectionActivity.f39552U = (Map) task.getResult();
            lineServiceAlertSelectionActivity.mo45843y2(list);
            return;
        }
        lineServiceAlertSelectionActivity.setContentView((int) R.layout.activity_loading_failed);
        ((AlertMessageView) lineServiceAlertSelectionActivity.findViewById(R.id.error_view)).setNegativeButtonClickListener(new C1800c(lineServiceAlertSelectionActivity, 20));
    }
}
