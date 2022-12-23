package n20;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.C14343z0;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p269u2.C6677a;
import p543hq.C17474b;
import p824tp.C19731i;

/* renamed from: n20.e */
public final class C18515e implements C18322a {
    /* renamed from: a */
    public final String mo50104a() {
        return "kinesis_flush";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        C4665k.C4666a b = C16530d.m42009b(this, 6, timeUnit, 2, timeUnit);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) throws Exception {
        String str;
        UsageStatsManager usageStatsManager;
        C6677a aVar = C19731i.m47197a(context).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APP;
        C17474b[] bVarArr = new C17474b[1];
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.IS_ALIVE);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        if (Build.VERSION.SDK_INT >= 28 && (usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats")) != null) {
            int a = usageStatsManager.getAppStandbyBucket();
            if (a == 10) {
                str = "STANDBY_BUCKET_ACTIVE";
            } else if (a == 20) {
                str = "STANDBY_BUCKET_WORKING_SET";
            } else if (a == 30) {
                str = "STANDBY_BUCKET_FREQUENT";
            } else if (a == 40) {
                str = "STANDBY_BUCKET_RARE";
            }
            aVar2.mo49945m(analyticsAttributeKey, str);
            bVarArr[0] = aVar2.mo49933a();
            aVar.getClass();
            C6677a.m15759j(context, analyticsFlowKey, false, bVarArr);
            C14343z0 z0Var = C19731i.m47197a(context).f50172b;
            z0Var.getClass();
            Tasks.await(z0Var.mo42914c(Collections.emptyList(), true));
            return new ListenableWorker.C1379a.C1382c();
        }
        str = null;
        aVar2.mo49945m(analyticsAttributeKey, str);
        bVarArr[0] = aVar2.mo49933a();
        aVar.getClass();
        C6677a.m15759j(context, analyticsFlowKey, false, bVarArr);
        C14343z0 z0Var2 = C19731i.m47197a(context).f50172b;
        z0Var2.getClass();
        Tasks.await(z0Var2.mo42914c(Collections.emptyList(), true));
        return new ListenableWorker.C1379a.C1382c();
    }
}
