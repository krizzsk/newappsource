package com.moovit.sdk.maintenance;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c00.C13717b;
import com.moovit.sdk.profilers.ProfilerLog;
import java.util.Calendar;
import l70.C18178a;
import p241s0.C6302b;
import p988j$.util.DesugarTimeZone;

public final class SdkMaintenanceWorker extends Worker {
    public SdkMaintenanceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public final C18178a mo49238a() {
        C18178a aVar;
        for (String next : getTags()) {
            C6302b bVar = SdkMaintenanceManager.f43000a;
            synchronized (bVar) {
                aVar = (C18178a) bVar.getOrDefault(next, null);
            }
            if (aVar != null) {
                return aVar;
            }
        }
        throw new IllegalStateException("Missing job id!");
    }

    public final ListenableWorker.C1379a doWork() {
        try {
            if (Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(12) == 0) {
                return new ListenableWorker.C1379a.C1381b();
            }
            C18178a a = mo49238a();
            a.mo50598a();
            ProfilerLog c = ProfilerLog.m41879c(getApplicationContext());
            c.mo49244b("SdkMaintenanceWorker", "Performing maintenance job: " + a.mo50598a());
            return a.mo50600c(this);
        } catch (Exception e) {
            C13717b.m34269p(getTags());
            ProfilerLog c2 = ProfilerLog.m41879c(getApplicationContext());
            StringBuilder k = C13555b.m33972k("Maintenance work failure! Tags=");
            k.append(C13717b.m34269p(getTags()));
            c2.mo49244b("SdkMaintenanceWorker", k.toString());
            c2.mo49243a("SdkMaintenanceWorker", e);
            return new ListenableWorker.C1379a.C1380a();
        }
    }
}
