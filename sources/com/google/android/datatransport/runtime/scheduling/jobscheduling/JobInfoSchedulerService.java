package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.appboy.models.InAppMessageBase;
import p028ba.C1508b;
import p028ba.C1515i;
import p086fa.C4715a;
import p275u9.C6738j;
import p275u9.C6751s;
import p275u9.C6756w;
import p304x.C7078n;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: b */
    public static final /* synthetic */ int f13391b = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(InAppMessageBase.EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C6756w.m15897b(getApplicationContext());
        C6738j.C6739a a = C6751s.m15889a();
        a.mo22916b(string);
        a.mo22917c(C4715a.m12026b(i));
        if (string2 != null) {
            a.f20867b = Base64.decode(string2, 0);
        }
        C1515i iVar = C6756w.m15896a().f20892d;
        iVar.f5446e.execute(new C1508b(iVar, a.mo22915a(), i2, new C7078n(6, this, jobParameters)));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
