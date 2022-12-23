package i10;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.gcm.GcmDismissIntentService;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.gcm.notification.GcmNotification;
import f10.C16930a;
import f10.C16935f;
import p269u2.C6677a;
import p543hq.C17474b;
import p824tp.C19731i;
import p977zz.C20927a0;

/* renamed from: i10.a */
public final class C17537a {

    /* renamed from: a */
    public static final C17537a f45127a = new C17537a();

    /* renamed from: a */
    public static void m43665a(GcmNotificationActivity gcmNotificationActivity, String str, boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PUSH_CLICKED);
        aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, str);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        C17474b a = aVar.mo49933a();
        C6677a aVar2 = C19731i.m47197a(gcmNotificationActivity).f50173c;
        aVar2.getClass();
        C6677a.m15759j(gcmNotificationActivity, AnalyticsFlowKey.PUSH, false, a);
    }

    /* renamed from: b */
    public final synchronized void mo50003b(Context context, GcmNotification gcmNotification) {
        C21100e.m49355o();
        gcmNotification.f41524g.mo47977c();
        PendingIntent b1 = GcmNotificationActivity.m40507b1(context, gcmNotification);
        String str = GcmDismissIntentService.f41488b;
        Intent intent = new Intent(context, C17537a.class);
        intent.putExtra(GcmDismissIntentService.f41489c, gcmNotification.f41525h);
        intent.putExtra(GcmDismissIntentService.f41488b, gcmNotification);
        NotificationManagerCompat.from(context).notify(gcmNotification.f41525h, gcmNotification.mo47968b(context, b1, PendingIntent.getService(context, gcmNotification.f41525h, intent, C20927a0.m49010e(268435456))));
        C16935f.m42761d(context, gcmNotification.f41524g.f41546b);
        C16930a.m42749a().mo49556g(context, gcmNotification);
    }
}
