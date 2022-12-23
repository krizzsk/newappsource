package g70;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.schedule.ScheduleBasedProfiler;
import com.moovit.sdk.profilers.schedule.ScheduleConfig;
import com.moovit.ticketing.ticket.C7762g;
import h90.C12740b;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p451du.C16705b;
import p714ow.C18847a;
import p977zz.C20927a0;

/* renamed from: g70.a */
public final /* synthetic */ class C4843a implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f16267b;

    /* renamed from: c */
    public final /* synthetic */ Object f16268c;

    public /* synthetic */ C4843a(Object obj, int i) {
        this.f16267b = i;
        this.f16268c = obj;
    }

    public final void onComplete(Task task) {
        int i = 0;
        switch (this.f16267b) {
            case 0:
                Context context = (Context) this.f16268c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("FusedLocationClientCommands", "flushLocations-completed successfully");
                    return;
                }
                ProfilerLog c = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("flushLocations-failed with error ");
                k.append(task.getException());
                c.mo49244b("FusedLocationClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            case 1:
                ScheduleBasedProfiler scheduleBasedProfiler = (ScheduleBasedProfiler) this.f16268c;
                ScheduleConfig scheduleConfig = (ScheduleConfig) scheduleBasedProfiler.mo50937b();
                if (scheduleConfig == null) {
                    ProfilerLog.m41879c(scheduleBasedProfiler.f47186a).mo49244b("ScheduleBasedProfiler", "Missing configuration!");
                    return;
                }
                ProfilerLog.m41879c(scheduleBasedProfiler.f47186a).mo49244b("ScheduleBasedProfiler", "updateScheduleFences()");
                FenceUpdateRequest build = new FenceUpdateRequest.Builder().addFence(scheduleBasedProfiler.f47189d, AwarenessFence.m63925or((Collection<AwarenessFence>) C13720d.m34273c(scheduleConfig.f43047e, (C13722f) null, new C18847a(5))), scheduleBasedProfiler.mo49274v(C20927a0.m49010e(134217728))).build();
                Context context2 = scheduleBasedProfiler.f47186a;
                Awareness.getFenceClient(context2).updateFences(build).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C16705b(context2, 6));
                return;
            case 2:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                ((C12887v) this.f16268c).mo39737i();
                return;
            case 3:
                ((C12740b) this.f16268c).f31477q.setRefreshing(false);
                return;
            default:
                C7762g gVar = (C7762g) this.f16268c;
                int i2 = 0;
                while (true) {
                    if (i2 < gVar.f23558t.getChildCount()) {
                        View childAt = gVar.f23558t.getChildAt(i2);
                        if (childAt == gVar.f23560v || childAt.getVisibility() != 0) {
                            i2++;
                        }
                    } else {
                        i = 8;
                    }
                }
                gVar.f23560v.setVisibility(i);
                return;
        }
    }
}
