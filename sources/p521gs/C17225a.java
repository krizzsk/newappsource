package p521gs;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.moovit.MoovitActivity;
import com.moovit.app.index.AppIndexingUpdateService;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.appdata.UserContextLoader;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.sdk.SDKImpl;
import com.moovit.sdk.profilers.ProfilerLog;
import com.usebutton.sdk.internal.events.Events;
import e70.C4591d;
import ei0.C23315b;
import f10.C16930a;
import java.util.Map;
import p435de.C16596f;
import p503fy.C17125a;
import p503fy.C17127b;
import p545hs.C17486a;
import p545hs.C17487b;
import p569is.C17651a;
import p591js.C17920a;
import p626lf.C18201b;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;
import p824tp.C19722a0;
import w40.C25761d;
import y90.C13272f;

/* renamed from: gs.a */
public final class C17225a extends C16930a {
    /* renamed from: b */
    public final GcmPayload.C15923a<Void> mo49551b(MoovitActivity moovitActivity) {
        return new C17487b(moovitActivity);
    }

    /* renamed from: c */
    public final GcmPayload.C15923a mo49552c(MoovitActivity moovitActivity) {
        return new C17486a(moovitActivity);
    }

    /* renamed from: d */
    public final GcmPayload.C15923a mo49553d(GcmNotificationActivity gcmNotificationActivity) {
        return new C17651a(gcmNotificationActivity);
    }

    /* renamed from: e */
    public final GcmPayload.C15923a<Void> mo49554e(MoovitActivity moovitActivity) {
        return new C17920a(moovitActivity);
    }

    /* renamed from: f */
    public final void mo49555f(Context context, String str, Map<String, String> map) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2128957731:
                if (str.equals("start_sdk")) {
                    c = 0;
                    break;
                }
                break;
            case -989937227:
                if (str.equals("tod_rides_invalidate")) {
                    c = 1;
                    break;
                }
                break;
            case -838595071:
                if (str.equals("upload")) {
                    c = 2;
                    break;
                }
                break;
            case 946872948:
                if (str.equals("google_app_indexing")) {
                    c = 3;
                    break;
                }
                break;
            case 1117956454:
                if (str.equals("payment_account_invalidate")) {
                    c = 4;
                    break;
                }
                break;
            case 1715151485:
                if (str.equals("stop_sdk")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    C19722a0 a0Var = null;
                    if (UserContextLoader.m40004l(context)) {
                        C13272f m = UserContextLoader.m40005m(context);
                        if (m != null) {
                            a0Var = new C19722a0(m);
                        }
                    }
                    if (a0Var != null) {
                        C18201b.m44928z(context.getApplicationContext(), a0Var.f50160a.f32925a);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    C16596f.m42113a().mo49364c(e);
                    return;
                }
            case 1:
                TodRidesProvider.m39561c().f40034c.f40043e = -1;
                return;
            case 2:
                String str2 = map.get("what");
                if (str2 != null && str2.equals("profiler_log")) {
                    ProfilerLog c2 = ProfilerLog.m41879c(context);
                    StringBuilder k = C13555b.m33972k("User Key: ");
                    C4591d.m11903a(context).getClass();
                    k.append(C4591d.f15777f.f15778a);
                    c2.mo49244b("ProfilerLog", k.toString());
                    JobIntentService.m2303a(context, ProfilerLog.LogUploader.class, 986318, new Intent());
                    return;
                }
                return;
            case 3:
                String str3 = map.get(Events.PROPERTY_ACTION);
                if (str3 != null) {
                    if (str3.equals("upload_index")) {
                        int i = AppIndexingUpdateService.f38434l;
                        Intent intent = new Intent();
                        intent.setAction("UPDATE_APP_INDEXING_FROM_STORE");
                        JobIntentService.m2303a(context, AppIndexingUpdateService.class, 1974, intent);
                        return;
                    } else if (str3.equals("delete_index")) {
                        int i2 = AppIndexingUpdateService.f38434l;
                        Intent intent2 = new Intent();
                        intent2.setAction("REMOVE_ALL_APP_INDEXING");
                        JobIntentService.m2303a(context, AppIndexingUpdateService.class, 1974, intent2);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                C25761d.m64299a().mo83591f();
                return;
            case 5:
                JobIntentService.m2303a(context.getApplicationContext(), SDKImpl.SDKService.class, 10000, new Intent("com.moovit.sdk.STOP"));
                return;
            default:
                super.mo49555f(context, str, map);
                return;
        }
    }

    /* renamed from: g */
    public final void mo49556g(Context context, GcmNotification gcmNotification) {
        if (C17125a.m43087g(gcmNotification)) {
            C17127b.m43096b(context).mo49721f(true);
            try {
                C23315b.m57413a(1, context.getApplicationContext());
            } catch (ShortcutBadgeException unused) {
            }
        }
    }

    /* renamed from: h */
    public final void mo49557h(GcmNotificationActivity gcmNotificationActivity, GcmNotification gcmNotification) {
        if (C17125a.m43087g(gcmNotification)) {
            C17127b.m43096b(gcmNotificationActivity).mo49717a(gcmNotification);
            C17127b.m43096b(gcmNotificationActivity).mo49721f(false);
            try {
                C23315b.m57413a(0, gcmNotificationActivity.getApplicationContext());
            } catch (ShortcutBadgeException unused) {
            }
        }
    }
}
