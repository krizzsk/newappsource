package com.moovit.maintenance;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c00.C13717b;
import com.moovit.commons.utils.ApplicationBugException;
import m20.C18322a;
import p241s0.C6302b;
import p435de.C16596f;

public final class MaintenanceWorker extends Worker {
    public MaintenanceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public final C18322a mo48595a() {
        C18322a aVar;
        for (String next : getTags()) {
            C6302b bVar = MaintenanceManager.f42315a;
            synchronized (bVar) {
                if (next.startsWith("one_time_")) {
                    next = next.substring(9);
                }
                aVar = (C18322a) bVar.getOrDefault(next, null);
            }
            if (aVar != null) {
                return aVar;
            }
        }
        throw new IllegalStateException("Missing job id!");
    }

    public final ListenableWorker.C1379a doWork() {
        try {
            C18322a a = mo48595a();
            a.mo50104a();
            Context applicationContext = getApplicationContext();
            getInputData();
            ListenableWorker.C1379a c = a.mo50106c(applicationContext);
            a.mo50104a();
            return c;
        } catch (Exception e) {
            C13717b.m34269p(getTags());
            C16596f a2 = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("Tags=");
            k.append(C13717b.m34269p(getTags()));
            a2.mo49363b(k.toString());
            a2.mo49364c(new ApplicationBugException("Maintenance job failure!", e));
            return new ListenableWorker.C1379a.C1380a();
        }
    }
}
