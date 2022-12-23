package com.moovit.sdk.profilers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ce0.C21100e;
import f00.C16919g;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import n70.C18535a;
import n70.C18536b;
import y70.C13261b;

public class ProfilersStateWorker extends Worker {

    /* renamed from: b */
    public static final C16919g.C16920a f43015b = new C16919g.C16920a("profilers_state_service_scheduled", false);

    public ProfilersStateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ListenableWorker.C1379a doWork() {
        boolean z;
        ProfilerLog.m41879c(getApplicationContext()).mo49244b("ProfilersStateWorker", "onRunTask");
        Context applicationContext = getApplicationContext();
        ProfilerLog c = ProfilerLog.m41879c(applicationContext);
        c.mo49244b("ProfilersStateWorker", "tryRestoreState");
        boolean z2 = false;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("profilers_state_service_prefs", 0);
        Long l = -1L;
        C21100e.m49373x(sharedPreferences, "prefs");
        long longValue = Long.valueOf(sharedPreferences.getLong("last_restore_time", l.longValue())).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder k = C13555b.m33972k("IS_SCHEDULED ");
        C16919g.C16920a aVar = f43015b;
        k.append(aVar.mo19759a(sharedPreferences));
        c.mo49244b("ProfilersStateWorker", k.toString());
        c.mo49244b("ProfilersStateWorker", "now " + C13261b.m33383a(currentTimeMillis));
        c.mo49244b("ProfilersStateWorker", "lastRestoreUTC " + C13261b.m33383a(longValue));
        if (currentTimeMillis - longValue >= TimeUnit.HOURS.toMillis(7)) {
            z = true;
        } else {
            z = false;
        }
        c.mo49244b("ProfilersStateWorker", "isThresholdWasPassed " + z);
        if (aVar.mo19759a(sharedPreferences).booleanValue() && z) {
            Long valueOf = Long.valueOf(currentTimeMillis);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("last_restore_time", valueOf.longValue());
            edit.apply();
            C18536b.m45451a().getClass();
            Iterator it = C18536b.m45452b(applicationContext).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C18535a) it.next()).mo50941j()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z2) {
                c.mo49244b("ProfilersStateWorker", "Sending broadcast");
                applicationContext.sendBroadcast(new Intent(applicationContext, ProfilersReactivator.class).setAction("com.moovit.profiler.ProfilersReactivator.RESTORE_STATE_ACTION"));
            }
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
