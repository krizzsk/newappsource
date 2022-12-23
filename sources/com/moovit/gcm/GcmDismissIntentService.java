package com.moovit.gcm;

import android.app.IntentService;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.popup.GcmPopup;
import f10.C16930a;
import f10.C16935f;
import i10.C17537a;
import java.util.List;
import k10.C17993a;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19731i;

public class GcmDismissIntentService extends IntentService {

    /* renamed from: b */
    public static final String f41488b;

    /* renamed from: c */
    public static final String f41489c;

    static {
        String k = C25541a.m63881k(GcmDismissIntentService.class.getName(), ".extra");
        f41488b = C25541a.m63881k(k, ".gcm_notification");
        f41489c = C25541a.m63881k(k, ".notification_id");
    }

    public GcmDismissIntentService() {
        super("GcmDismissIntentService");
        setIntentRedelivery(true);
    }

    public final void onHandleIntent(Intent intent) {
        GcmPopup c;
        if (intent == null) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("GcmCallbackService intent is null!"));
            return;
        }
        int intExtra = intent.getIntExtra(f41489c, GcmNotification.f41516j);
        GcmNotification gcmNotification = (GcmNotification) intent.getParcelableExtra(f41488b);
        synchronized (C17537a.f45127a) {
            C21100e.m49355o();
            if (gcmNotification == null) {
                NotificationManagerCompat.from(this).cancel(intExtra);
                return;
            }
            gcmNotification.f41524g.mo47977c();
            C16935f.m42761d(this, (String) null);
            String str = gcmNotification.f41524g.f41546b;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PUSH_DISMISSED);
            aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, str);
            C17474b a = aVar.mo49933a();
            C6677a aVar2 = C19731i.m47197a(this).f50173c;
            aVar2.getClass();
            C6677a.m15759j(this, AnalyticsFlowKey.PUSH, false, a);
            C17993a aVar3 = C17993a.f46075a;
            String str2 = gcmNotification.f41524g.f41546b;
            synchronized (aVar3) {
                C21100e.m49355o();
                List<GcmPopup> d = C17993a.m44616d(this);
                if (!(str2 == null || (c = C17993a.m44615c(str2, d)) == null || !d.remove(c))) {
                    C17993a.m44623m(this, d);
                }
                C17993a.m44622l(d);
                C17993a.m44619g(this, d);
            }
            C16930a.m42749a().getClass();
        }
    }
}
