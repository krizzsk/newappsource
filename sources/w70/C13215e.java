package w70;

import android.content.Context;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.utils.WorkManagerReceiver;
import e70.C4591d;
import p626lf.C18201b;

/* renamed from: w70.e */
public final class C13215e implements C13216f {
    /* renamed from: a */
    public final void mo40086a(Context context) {
        if (!C18201b.m44922s(context)) {
            ProfilerLog.m41879c(context).mo49244b("SDKUpgrader428To429", "SDK is not started");
            return;
        }
        C4591d.m11903a(context).getClass();
        if (C4591d.m11904b()) {
            ProfilerLog.m41879c(context).mo49244b("SDKUpgrader428To429", "SDK is started and there is an active user");
            WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCEHDULE_PROFILERS_STATE");
            WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCHEDULE_PROFILER_DATA_UPLOAD");
            WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCHEDULE_MAINTENANCE_JOBS");
            return;
        }
        ProfilerLog.m41879c(context).mo49244b("SDKUpgrader428To429", "SDK is started, but there isn't any active user - create one now");
        WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCHEDULE_CREATE_USER");
    }
}
