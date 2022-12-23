package p688nu;

import android.content.Context;
import androidx.lifecycle.C1043v;
import c00.C13717b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;

/* renamed from: nu.d */
public final /* synthetic */ class C18632d implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f47483b;

    /* renamed from: c */
    public final /* synthetic */ Object f47484c;

    public /* synthetic */ C18632d(Object obj, int i) {
        this.f47483b = i;
        this.f47484c = obj;
    }

    public final void onComplete(Task task) {
        switch (this.f47483b) {
            case 0:
                C18633e eVar = (C18633e) this.f47484c;
                int i = C18633e.f47485r;
                eVar.getClass();
                if (!task.isSuccessful()) {
                    eVar.f47489q.mo4627l0(eVar.f47487o);
                    return;
                }
                List list = (List) task.getResult();
                if (C13717b.m34258e(list)) {
                    eVar.f47489q.mo4627l0(eVar.f47486n);
                    return;
                }
                C18627a aVar = new C18627a(eVar.f47489q.getContext(), list);
                aVar.f47476l = eVar;
                eVar.f47489q.setAdapter(aVar);
                return;
            case 1:
                ServiceAlertDetailsActivity serviceAlertDetailsActivity = (ServiceAlertDetailsActivity) this.f47484c;
                int i2 = ServiceAlertDetailsActivity.f39553Y;
                if (!serviceAlertDetailsActivity.isFinishing() && !serviceAlertDetailsActivity.isDestroyed()) {
                    if (task.isSuccessful()) {
                        serviceAlertDetailsActivity.f39555X = (ServiceAlert) task.getResult();
                        serviceAlertDetailsActivity.mo45845B2();
                        return;
                    }
                    serviceAlertDetailsActivity.setContentView((int) R.layout.service_alert_failure_loading);
                    return;
                }
                return;
            case 2:
                ((C1043v) this.f47484c).postValue(Boolean.valueOf(task.isSuccessful()));
                return;
            case 3:
                Context context = (Context) this.f47484c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("FusedLocationClientCommands", "requestLocationUpdates-completed successfully");
                    return;
                }
                ProfilerLog c = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("requestLocationUpdates-failed with error ");
                k.append(task.getException());
                c.mo49244b("FusedLocationClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            default:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                ((C12887v) this.f47484c).mo39737i();
                return;
        }
    }
}
