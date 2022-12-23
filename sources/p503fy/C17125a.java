package p503fy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.app.itinerary.C15053i;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p130j2.C5367a;
import p389bl.C13641g;
import p435de.C16596f;
import p479ey.C16889a;
import p479ey.C16890b;
import p503fy.C17127b;
import p810sz.C19575a;
import p829tu.C19783n;

/* renamed from: fy.a */
public final class C17125a implements UserAccountDataProvider<List<GcmNotification>> {

    /* renamed from: f */
    public static final Set<String> f44334f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"url", "ride_sharing_event"})));

    /* renamed from: a */
    public final Context f44335a;

    /* renamed from: b */
    public final UserAccountManager f44336b;

    /* renamed from: c */
    public final C13752e f44337c;

    /* renamed from: d */
    public final C17127b f44338d;

    /* renamed from: e */
    public C17126a f44339e;

    /* renamed from: fy.a$a */
    public class C17126a extends AsyncTask<Void, Void, Boolean> {
        public C17126a() {
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                List<GcmNotification> f = C17125a.this.mo46566c(C17125a.this.f44336b.mo46571b());
                if (f == null) {
                    return Boolean.TRUE;
                }
                C17125a.this.mo46565b(f);
                return Boolean.TRUE;
            } catch (ServerException | IOException e) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user notifications failure", e));
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            C17125a aVar = C17125a.this;
            synchronized (aVar) {
                if (bool.booleanValue()) {
                    aVar.mo49712e();
                }
                if (bool.booleanValue()) {
                    str = "com.moovit.useraccount.manager.notifications.user_notifications_update_success";
                } else {
                    str = "com.moovit.useraccount.manager.notifications.user_notifications_update_failure";
                }
                Intent intent = new Intent();
                intent.setAction(str);
                C5367a.m13473a(aVar.f44335a).mo21147c(intent);
                aVar.f44339e = null;
            }
        }
    }

    public C17125a(Context context, UserAccountManager userAccountManager, C13752e eVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f44335a = context.getApplicationContext();
        this.f44336b = userAccountManager;
        this.f44337c = eVar;
        this.f44338d = C17127b.m43096b(context);
    }

    /* renamed from: g */
    public static boolean m43087g(GcmNotification gcmNotification) {
        if (gcmNotification == null) {
            return false;
        }
        return f44334f.contains(gcmNotification.f41524g.mo47977c());
    }

    /* renamed from: h */
    public static void m43088h(Context context, BroadcastReceiver broadcastReceiver) {
        List<String> asList = Arrays.asList(new String[]{"com.moovit.useraccount.manager.notifications.user_notifications_update_failure", "com.moovit.useraccount.manager.notifications.user_notifications_update_success"});
        C5367a a = C5367a.m13473a(context);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : asList) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(broadcastReceiver, intentFilter);
    }

    /* renamed from: a */
    public final void mo46564a() {
    }

    /* renamed from: d */
    public final void mo46567d() {
    }

    /* renamed from: e */
    public final synchronized void mo49712e() {
        HashSet hashSet;
        C17127b bVar = this.f44338d;
        synchronized (bVar) {
            hashSet = bVar.f44348d;
        }
        Set<String> d = this.f44338d.mo49719d();
        HashSet hashSet2 = new HashSet();
        Objects.requireNonNull(hashSet);
        C13723g.m34283d(d, hashSet2, new C19783n(hashSet, 1));
        C17127b bVar2 = this.f44338d;
        synchronized (bVar2) {
            C17127b.f44342f.mo49545d(bVar2.f44346b, hashSet2);
        }
    }

    /* renamed from: f */
    public final List<GcmNotification> mo46566c(ServerId serverId) throws IOException, ServerException {
        List<GcmNotification> list;
        C17127b bVar = this.f44338d;
        synchronized (bVar) {
            list = bVar.f44347c;
        }
        C16890b bVar2 = (C16890b) new C16889a(this.f44337c, serverId, list.size()).mo52626J();
        if (bVar2.mo52635a()) {
            return (List) bVar2.f33924g;
        }
        return null;
    }

    public final UserAccountDataProvider.ProviderType getType() {
        return UserAccountDataProvider.ProviderType.NOTIFICATIONS;
    }

    /* renamed from: i */
    public final void mo46565b(List<GcmNotification> list) throws IOException, ServerException {
        C13723g.m34285f(list, (ArrayList) null, new C15053i(3));
        C17127b bVar = this.f44338d;
        synchronized (bVar) {
            bVar.f44347c = list;
            bVar.f44348d = C13720d.m34277g(list, (C13722f) null, C17127b.f44343g);
            new C17127b.C17128a(bVar.f44345a, bVar.f44347c).execute(new Void[0]);
        }
    }

    public final void load() {
        C17127b bVar = this.f44338d;
        synchronized (bVar) {
            List<GcmNotification> list = (List) C13641g.m34133v(bVar.f44345a, "user_notifications.dat", C19575a.m46957a(GcmNotification.f41518l, false));
            if (list != null) {
                bVar.f44347c = list;
                bVar.f44348d = C13720d.m34277g(list, (C13722f) null, C17127b.f44343g);
            }
        }
    }
}
