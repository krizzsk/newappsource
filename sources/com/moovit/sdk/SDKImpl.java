package com.moovit.sdk;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.JobIntentService;
import com.google.android.gms.search.SearchAuth;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilersManager;
import com.moovit.sdk.profilers.ProfilersReactivator;
import com.moovit.sdk.utils.WorkManagerReceiver;
import e70.C4591d;
import e70.C4593e;
import f00.C16919g;
import p977zz.C20927a0;
import p977zz.C20964s0;
import p977zz.C20975x0;

public final class SDKImpl {

    public static class SDKService extends JobIntentService {
        /* renamed from: d */
        public final void mo3360d(Intent intent) {
            boolean z;
            C16919g.C16920a aVar = C4593e.f15782a;
            boolean z2 = false;
            SharedPreferences sharedPreferences = getSharedPreferences("moovit_sdk_shared_prefs", 0);
            String action = intent.getAction();
            ProfilerLog c = ProfilerLog.m41879c(this);
            try {
                if (C20975x0.m49118e(action, "com.moovit.sdk.START")) {
                    c.mo49244b("SDKImpl", "SDK STARTED_V10");
                    String stringExtra = intent.getStringExtra("LICENSE_KEY_EXTRA");
                    String stringExtra2 = intent.getStringExtra("USER_ID_EXTRA");
                    C4591d.m11903a(this).getClass();
                    if (!C20975x0.m49118e(C4591d.f15777f.f15779b, stringExtra)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C4591d.m11903a(this).getClass();
                    if (C20964s0.m49090h(C4591d.f15777f.f15778a) || z) {
                        z2 = true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("User Key: ");
                    sb.append(C4591d.f15777f.f15778a);
                    sb.append(", needToCreateNewUser: ");
                    sb.append(z2);
                    sb.append(", start state: ");
                    C16919g.C16920a aVar2 = C4593e.f15782a;
                    sb.append(aVar2.mo19759a(sharedPreferences));
                    c.mo49244b("SDKImpl", sb.toString());
                    if (z2 || !aVar2.mo19759a(sharedPreferences).booleanValue()) {
                        C20927a0.m49016k(this, ProfilersReactivator.class, true);
                        aVar2.mo49545d(sharedPreferences, Boolean.TRUE);
                        C4593e.f15783b.mo49545d(sharedPreferences, stringExtra);
                        C4593e.f15784c.mo49545d(sharedPreferences, stringExtra2);
                        if (!z2 || CreateUserWorker.m11414b(this, stringExtra, stringExtra2)) {
                            JobIntentService.m2303a(this, ProfilersManager.class, SearchAuth.StatusCodes.AUTH_THROTTLED, new Intent(ProfilersManager.f43010i));
                            WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.SCEHDULE_PROFILERS_STATE");
                            WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.SCHEDULE_MAINTENANCE_JOBS");
                            WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.SCHEDULE_PROFILER_DATA_UPLOAD");
                            return;
                        }
                        WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.SCHEDULE_CREATE_USER");
                    }
                } else if (C20975x0.m49118e(action, "com.moovit.sdk.STOP")) {
                    c.mo49244b("SDKImpl", "SDK STOPPED");
                    C20927a0.m49016k(this, ProfilersReactivator.class, false);
                    C4593e.f15782a.mo49545d(sharedPreferences, Boolean.FALSE);
                    JobIntentService.m2303a(this, ProfilersManager.class, SearchAuth.StatusCodes.AUTH_THROTTLED, new Intent(ProfilersManager.f43011j));
                    WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.CANCEL_PROFILERS_STATE");
                    WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.CANCEL_MAINTENANCE_JOBS");
                    WorkManagerReceiver.m17339b(this, "com.moovit.sdk.action.CANCEL_PROFILER_DATA_UPLOAD");
                }
            } catch (Throwable th) {
                c.mo49243a("SDKImpl", th);
            }
        }
    }
}
