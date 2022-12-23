package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.os.PersistableBundle;
import p277ub.C6774a0;

public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        if (new Requirements(extras.getInt("requirements")).mo16270b(this) == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            if (C6774a0.f20959a >= 26) {
                ComponentName unused = startForegroundService(intent);
                return false;
            }
            startService(intent);
            return false;
        }
        jobFinished(jobParameters, true);
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
