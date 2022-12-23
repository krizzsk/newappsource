package p849uq;

import android.os.SystemClock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.ads.loaders.LoadAdException;
import java.util.concurrent.TimeUnit;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p921xq.C20554a;
import p977zz.C20944i0;

/* renamed from: uq.b */
public final /* synthetic */ class C19978b implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ C19979c f50809b;

    /* renamed from: c */
    public final /* synthetic */ Trace f50810c;

    /* renamed from: d */
    public final /* synthetic */ MoovitApplication f50811d;

    /* renamed from: e */
    public final /* synthetic */ boolean f50812e;

    /* renamed from: f */
    public final /* synthetic */ String f50813f;

    /* renamed from: g */
    public final /* synthetic */ String f50814g;

    /* renamed from: h */
    public final /* synthetic */ String f50815h;

    /* renamed from: i */
    public final /* synthetic */ String f50816i;

    /* renamed from: j */
    public final /* synthetic */ long f50817j;

    public /* synthetic */ C19978b(C19979c cVar, Trace trace, MoovitApplication moovitApplication, boolean z, String str, String str2, String str3, String str4, long j) {
        this.f50809b = cVar;
        this.f50810c = trace;
        this.f50811d = moovitApplication;
        this.f50812e = z;
        this.f50813f = str;
        this.f50814g = str2;
        this.f50815h = str3;
        this.f50816i = str4;
        this.f50817j = j;
    }

    public final void onComplete(Task task) {
        String str;
        int i;
        C19979c cVar = this.f50809b;
        Trace trace = this.f50810c;
        MoovitApplication moovitApplication = this.f50811d;
        boolean z = this.f50812e;
        String str2 = this.f50813f;
        String str3 = this.f50814g;
        String str4 = this.f50815h;
        String str5 = this.f50816i;
        long j = this.f50817j;
        cVar.getClass();
        if (task != null) {
            try {
                if (task.isSuccessful()) {
                    C20554a aVar = (C20554a) task.getResult();
                    if (aVar != null) {
                        String b = aVar.mo52756b();
                        if (b != null) {
                            trace.putAttribute("adMediationName", b);
                        }
                    }
                }
            } catch (Exception e) {
                C16596f.m42113a().mo49364c(e);
            }
        }
        trace.stop();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        boolean isSuccessful = task.isSuccessful();
        String str6 = null;
        if (isSuccessful || !(task.getException() instanceof LoadAdException)) {
            i = -1;
            str = null;
        } else {
            LoadAdException loadAdException = (LoadAdException) task.getException();
            i = loadAdException.mo44751a();
            str = loadAdException.getMessage();
            C16596f.m42113a().mo49364c(loadAdException);
        }
        if (isSuccessful) {
            str6 = ((C20554a) task.getResult()).mo52756b();
        }
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j2 = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar2 = moovitApplication.mo44558j().f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        MoovitApplication moovitApplication2 = moovitApplication;
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar3.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, z);
        aVar3.mo49939g(AnalyticsAttributeKey.SOURCE, str2);
        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "ad_load_end");
        aVar3.mo49939g(AnalyticsAttributeKey.AD_ID, str4);
        aVar3.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, str3);
        aVar3.mo49939g(AnalyticsAttributeKey.ID, str5);
        aVar3.mo49941i(AnalyticsAttributeKey.SUCCESS, isSuccessful);
        aVar3.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar3.mo49935c(AnalyticsAttributeKey.ERROR_CODE, i);
        aVar3.mo49945m(AnalyticsAttributeKey.PROVIDER, str6);
        aVar3.mo49945m(AnalyticsAttributeKey.ERROR_MESSAGE, str);
        aVar3.mo49945m(AnalyticsAttributeKey.SESSION_ID, j2);
        aVar3.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar3.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar3.mo49933a()};
        aVar2.getClass();
        C6677a.m15759j(moovitApplication2, analyticsFlowKey, true, bVarArr);
        TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime);
    }
}
