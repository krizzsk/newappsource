package m70;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import androidx.core.app.JobIntentService;
import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.google.android.gms.search.SearchAuth;
import com.moovit.sdk.datacollection.visibility.LocationStatusInfoChecker;
import com.moovit.sdk.maintenance.SdkMaintenanceWorker;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilersManager;
import e70.C4591d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k70.C18016b;
import l70.C18178a;
import p081f3.C4648b;
import p081f3.C4665k;
import p988j$.util.DesugarTimeZone;
import v70.C13171g;
import v70.C13177m;
import w70.C13217g;
import y70.C13256a;

/* renamed from: m70.c */
public final class C18352c implements C18178a {
    /* renamed from: a */
    public final String mo50598a() {
        return "heart_beat";
    }

    /* renamed from: b */
    public final C4665k mo50599b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        return (C4665k) ((C4665k.C4666a) ((C4665k.C4666a) C16759e.m42346b(this, timeUnit, timeUnit).mo20191e(BackoffPolicy.LINEAR, TimeUnit.SECONDS)).mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50600c(SdkMaintenanceWorker sdkMaintenanceWorker) throws Exception {
        ArrayList arrayList;
        int wifiState;
        String str;
        boolean z;
        if (Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(12) == 0) {
            return new ListenableWorker.C1379a.C1381b();
        }
        Context applicationContext = sdkMaintenanceWorker.getApplicationContext();
        ProfilerLog.m41879c(applicationContext).mo49244b("SdkHeartBeatJob", "Running heartbeat job");
        String str2 = LocationStatusInfoChecker.f42998i;
        JobIntentService.m2303a(applicationContext, LocationStatusInfoChecker.class, 10002, new Intent(LocationStatusInfoChecker.f42999j));
        ProfilerLog.m41879c(applicationContext).mo49244b("WifiStateChecker", "check");
        WifiManager wifiManager = (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null && ((wifiState = wifiManager.getWifiState()) == 1 || wifiState == 3)) {
            C4591d.m11903a(applicationContext).getClass();
            if (C4591d.m11904b()) {
                ProfilerLog c = ProfilerLog.m41879c(applicationContext);
                StringBuilder k = C13555b.m33972k("Wifi is ");
                if (wifiState == 3) {
                    str = "on";
                } else {
                    str = "off";
                }
                k.append(str);
                c.mo49244b("WifiStateChecker", k.toString());
                if (wifiState == 3) {
                    z = true;
                } else {
                    z = false;
                }
                C13256a.m33377b(applicationContext).mo40132a(new C18016b(z));
            }
        }
        JobIntentService.m2303a(applicationContext, ProfilersManager.class, SearchAuth.StatusCodes.AUTH_THROTTLED, new Intent(ProfilersManager.f43012k));
        new C13217g(applicationContext).mo40088a(false);
        Context applicationContext2 = sdkMaintenanceWorker.getApplicationContext();
        C13177m mVar = new C13177m(applicationContext2, C4591d.m11903a(applicationContext2));
        C13256a b = C13256a.m33377b(applicationContext);
        synchronized (b) {
            arrayList = new ArrayList(b.f32907a);
        }
        C13171g gVar = new C13171g(mVar, arrayList);
        gVar.mo5818H();
        if (gVar.f51768k / 200 == 1) {
            C13256a b2 = C13256a.m33377b(applicationContext);
            List<C13256a.C13259c> list = gVar.f32715t;
            synchronized (b2) {
                b2.f32907a.removeAll(list);
                b2.f32908b.deleteFile("moovit_sdk_async_message_version_store");
                Iterator it = b2.f32907a.iterator();
                while (it.hasNext()) {
                    b2.mo40133c((C13256a.C13259c) it.next());
                }
            }
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
