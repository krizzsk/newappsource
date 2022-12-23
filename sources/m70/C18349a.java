package m70;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.sdk.maintenance.SdkMaintenanceWorker;
import com.moovit.sdk.profilers.ProfilerLog;
import com.unity3d.ads.metadata.MediationMetaData;
import e70.C4590c;
import e70.C4591d;
import h70.C25738b;
import h70.C25740c;
import java.util.concurrent.TimeUnit;
import l70.C18178a;
import org.json.JSONException;
import org.json.JSONObject;
import p081f3.C4648b;
import p081f3.C4665k;
import p389bl.C13641g;
import v70.C13174j;
import v70.C13175k;
import v70.C13177m;

/* renamed from: m70.a */
public final class C18349a implements C18178a {

    /* renamed from: m70.a$a */
    public static class C18350a extends C13175k<C18350a, C25738b> {
        /* renamed from: e */
        public final Object mo40054e(JSONObject jSONObject) throws BadResponseException {
            boolean z;
            try {
                if (jSONObject.getInt("useGoogleAnalytics") != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new C25738b(z);
            } catch (JSONException e) {
                throw new BadResponseException((Exception) e);
            }
        }
    }

    /* renamed from: a */
    public final String mo50598a() {
        return "configuration";
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
        ProfilerLog.m41879c(applicationContext).mo49244b("SdkConfigurationJob", "Running configuration job");
        Context applicationContext2 = sdkMaintenanceWorker.getApplicationContext();
        C25738b bVar = (C25738b) ((C18350a) new C13174j(new C13177m(applicationContext2, C4591d.m11903a(applicationContext2)), C4590c.server_path_cdn_server_url, C4590c.api_path_moovit_sdk_general_config, MediationMetaData.KEY_VERSION, C18350a.class).mo52626J()).f32718i;
        C25740c cVar = C25740c.f64175b;
        C21100e.m49373x(bVar, "sdkConfig");
        cVar.f64176a = bVar;
        C13641g.m34136y(applicationContext, "moovit_sdk_general_config", bVar, C25738b.f64173b);
        return new ListenableWorker.C1379a.C1382c();
    }
}
