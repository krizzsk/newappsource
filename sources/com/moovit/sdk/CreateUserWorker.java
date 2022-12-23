package com.moovit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Looper;
import androidx.core.app.JobIntentService;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilersManager;
import com.moovit.sdk.utils.WorkManagerReceiver;
import e70.C4591d;
import e70.C4593e;
import f00.C16919g;
import java.util.concurrent.TimeUnit;
import p092g3.C4763k;
import p205p3.C6038c;
import p218q3.C6166b;
import p735pt.C18982c;
import p858uz.C20050c;
import p858uz.C20051d;
import p858uz.C20059f;
import p977zz.C20934d0;
import p977zz.C20944i0;
import v70.C13166c;
import v70.C13167d;
import v70.C13177m;

public class CreateUserWorker extends Worker {
    public CreateUserWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static LatLonE6 m11413a(Context context) {
        LatLonE6 latLonE6;
        if (!C20934d0.m49032c(context)) {
            return null;
        }
        try {
            C20051d dVar = new C20051d(context, Looper.getMainLooper());
            LatLonE6 j = LatLonE6.m40177j((Location) Tasks.await(dVar.mo50016n()));
            if (j != null) {
                return j;
            }
            LocationRequest smallestDisplacement = LocationRequest.create().setSmallestDisplacement(10000.0f);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            LocationRequest priority = smallestDisplacement.setInterval(timeUnit.toMillis(10)).setFastestInterval(timeUnit.toMillis(5)).setPriority(104);
            if (dVar.f48034d) {
                if (dVar.f50887k != null) {
                    dVar.f50884h.removeLocationUpdates((LocationCallback) dVar.f50883g).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C20050c());
                }
                dVar.f50887k = priority;
                if (priority != null) {
                    dVar.f50884h.requestLocationUpdates(priority, (LocationCallback) dVar.f50883g, dVar.f50885i).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C18982c(1));
                }
            } else {
                dVar.f50887k = priority;
            }
            C20059f.C20060a aVar = new C20059f.C20060a();
            dVar.mo50015m(aVar);
            C20944i0 a = aVar.mo53033a(TimeUnit.SECONDS.toMillis(10));
            if (((Boolean) a.f52692a).booleanValue()) {
                latLonE6 = LatLonE6.m40177j((Location) a.f52693b);
            } else {
                dVar.mo50904b(aVar);
                latLonE6 = null;
            }
            if (latLonE6 != null) {
                return latLonE6;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static boolean m11414b(Context context, String str, String str2) {
        ProfilerLog c = ProfilerLog.m41879c(context);
        StringBuilder k = C13555b.m33972k("verifyUserCreated, UserKey: ");
        C4591d.m11903a(context).getClass();
        k.append(C4591d.f15777f.f15778a);
        c.mo49244b("CreateUserTask", k.toString());
        C4591d.m11903a(context).getClass();
        if (C4591d.m11904b()) {
            return true;
        }
        C4591d.m11905c(context, (String) null, str, str2, (String) null);
        try {
            C13167d dVar = (C13167d) new C13166c(new C13177m(context, C4591d.m11903a(context)), m11413a(context)).mo52626J();
            ProfilerLog c2 = ProfilerLog.m41879c(context);
            c2.mo49244b("CreateUserTask", "User key: " + dVar.f32711f);
            C4591d.m11905c(context, dVar.f32711f, str, str2, String.valueOf(dVar.f32712g));
            return true;
        } catch (Throwable th) {
            ProfilerLog.m41879c(context).mo49243a("CreateUserTask", th);
            return false;
        }
    }

    public final ListenableWorker.C1379a doWork() {
        Context applicationContext = getApplicationContext();
        C16919g.C16920a aVar = C4593e.f15782a;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("moovit_sdk_shared_prefs", 0);
        String e = C4593e.f15783b.mo19759a(sharedPreferences);
        if (e == null) {
            return new ListenableWorker.C1379a.C1381b();
        }
        if (m11414b(applicationContext, e, C4593e.f15784c.mo19759a(sharedPreferences))) {
            C4763k g = C4763k.m12079g(applicationContext);
            g.getClass();
            ((C6166b) g.f16073d).mo22153a(new C6038c(g, "sdk_create_user", true));
            JobIntentService.m2303a(applicationContext, ProfilersManager.class, SearchAuth.StatusCodes.AUTH_THROTTLED, new Intent(ProfilersManager.f43010i));
            WorkManagerReceiver.m17339b(applicationContext, "com.moovit.sdk.action.SCEHDULE_PROFILERS_STATE");
            WorkManagerReceiver.m17339b(applicationContext, "com.moovit.sdk.action.SCHEDULE_MAINTENANCE_JOBS");
            WorkManagerReceiver.m17339b(applicationContext, "com.moovit.sdk.action.SCHEDULE_PROFILER_DATA_UPLOAD");
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
