package p028ba;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.appboy.models.InAppMessageBase;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p041ca.C1815d;
import p086fa.C4715a;
import p275u9.C6751s;
import p337z9.C7506a;

/* renamed from: ba.a */
public final class C1507a implements C1519m {

    /* renamed from: a */
    public final Context f5417a;

    /* renamed from: b */
    public final C1815d f5418b;

    /* renamed from: c */
    public final SchedulerConfig f5419c;

    public C1507a(Context context, C1815d dVar, SchedulerConfig schedulerConfig) {
        this.f5417a = context;
        this.f5418b = dVar;
        this.f5419c = schedulerConfig;
    }

    /* renamed from: a */
    public final void mo5853a(C6751s sVar, int i) {
        mo5854b(sVar, i, false);
    }

    /* renamed from: b */
    public final void mo5854b(C6751s sVar, int i, boolean z) {
        boolean z2;
        C6751s sVar2 = sVar;
        int i2 = i;
        ComponentName componentName = new ComponentName(this.f5417a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5417a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5417a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.mo22910b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C4715a.m12025a(sVar.mo22912d())).array());
        if (sVar.mo22911c() != null) {
            adler32.update(sVar.mo22911c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                C7506a.m17226a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sVar2);
                return;
            }
        }
        long I = this.f5418b.mo6647I(sVar2);
        SchedulerConfig schedulerConfig = this.f5419c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d = sVar.mo22912d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(schedulerConfig.mo15781b(d, I, i2));
        Set<SchedulerConfig.Flag> b = schedulerConfig.mo15782c().get(d).mo15784b();
        if (b.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", sVar.mo22910b());
        persistableBundle.putInt("priority", C4715a.m12025a(sVar.mo22912d()));
        if (sVar.mo22911c() != null) {
            persistableBundle.putString(InAppMessageBase.EXTRAS, Base64.encodeToString(sVar.mo22911c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar2, Integer.valueOf(value), Long.valueOf(this.f5419c.mo15781b(sVar.mo22912d(), I, i2)), Long.valueOf(I), Integer.valueOf(i)};
        if (Log.isLoggable(C7506a.m17227b(str), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
