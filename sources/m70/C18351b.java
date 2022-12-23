package m70;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import ce0.C21100e;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.moovit.sdk.analytics.SdkAnalyticsAttributeKey;
import com.moovit.sdk.analytics.SdkAnalyticsEventKey;
import com.moovit.sdk.analytics.SdkAnalyticsFlowKey;
import com.moovit.sdk.maintenance.SdkMaintenanceWorker;
import com.moovit.sdk.profilers.ProfilerLog;
import e70.C4590c;
import e70.C4591d;
import f70.C4706a;
import f70.C4707b;
import h70.C25738b;
import h70.C25740c;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l70.C18178a;
import p081f3.C4648b;
import p081f3.C4665k;
import p229r1.C6233c;
import p389bl.C13641g;
import v70.C13168e;
import v70.C13169f;
import v70.C13177m;
import y70.C13256a;

/* renamed from: m70.b */
public final class C18351b implements C18178a {
    /* renamed from: a */
    public final String mo50598a() {
        return "google_analytics";
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
        Context applicationContext = sdkMaintenanceWorker.getApplicationContext();
        ProfilerLog.m41879c(applicationContext).mo49244b("SdkGoogleAnalyticsJob", "Running Google Analytics work");
        C25740c cVar = C25740c.f64175b;
        if (cVar.f64176a == null) {
            cVar.f64176a = (C25738b) C13641g.m34133v(applicationContext, "moovit_sdk_general_config", C25738b.f64173b);
        }
        if (cVar.f64176a == null) {
            cVar.f64176a = new C25738b(false);
        }
        if (!cVar.f64176a.f64174a) {
            return new ListenableWorker.C1379a.C1382c();
        }
        GoogleAnalytics instance = GoogleAnalytics.getInstance(applicationContext);
        Tracker newTracker = instance.newTracker(applicationContext.getString(C4590c.moovit_sdk_ga_tracking_id));
        newTracker.enableAdvertisingIdCollection(true);
        newTracker.setAnonymizeIp(false);
        Context applicationContext2 = sdkMaintenanceWorker.getApplicationContext();
        C13168e eVar = new C13168e(new C13177m(applicationContext2, C4591d.m11903a(applicationContext2)));
        eVar.mo40057M();
        C13169f fVar = (C13169f) eVar.mo52626J();
        if (!fVar.f32725h) {
            List<C13169f.C13170a> list = (List) fVar.f32718i;
            int i = 0;
            for (C13169f.C13170a aVar : list) {
                if (i >= 59) {
                    newTracker = instance.newTracker(applicationContext.getString(C4590c.moovit_sdk_ga_tracking_id));
                    newTracker.enableAdvertisingIdCollection(true);
                    newTracker.setAnonymizeIp(false);
                    i = 0;
                }
                i++;
                HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder("od_events", aVar.f32713a);
                for (C6233c next : aVar.f32714b) {
                    eventBuilder.setCustomDimension(((Integer) next.f19679a).intValue(), (String) next.f19680b);
                }
                newTracker.send(eventBuilder.build());
            }
            C13256a b = C13256a.m33377b(applicationContext);
            SdkAnalyticsFlowKey sdkAnalyticsFlowKey = SdkAnalyticsFlowKey.DATA_COLLECTION;
            SdkAnalyticsEventKey sdkAnalyticsEventKey = SdkAnalyticsEventKey.GOOGLE_ANALYTICS_REPORTED;
            C21100e.m49373x(sdkAnalyticsEventKey, "eventKey");
            EnumMap enumMap = new EnumMap(SdkAnalyticsAttributeKey.class);
            enumMap.put(SdkAnalyticsAttributeKey.COUNT, Integer.toString(list.size()));
            b.mo40132a(new C4707b(applicationContext, sdkAnalyticsFlowKey, new C4706a(sdkAnalyticsEventKey, enumMap)));
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
