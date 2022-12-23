package p030bo.app;

import android.content.Context;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import p244s3.C6447v;

/* renamed from: bo.app.t1 */
public class C1693t1 {

    /* renamed from: e */
    public static final String f6001e = AppboyLogger.getBrazeLogTag(C1693t1.class);

    /* renamed from: a */
    public final Context f6002a;

    /* renamed from: b */
    public final boolean f6003b;

    /* renamed from: c */
    public final boolean f6004c = C1689s4.m4740a("com.google.firebase.messaging.FirebaseMessaging", "getToken", (Class<?>[]) new Class[0]);

    /* renamed from: d */
    public final C1742z1 f6005d;

    public C1693t1(Context context, C1742z1 z1Var) {
        Class<String> cls = String.class;
        this.f6002a = context;
        this.f6005d = z1Var;
        this.f6003b = C1689s4.m4740a("com.google.firebase.iid.FirebaseInstanceId", "getToken", (Class<?>[]) new Class[]{cls, cls});
    }

    /* renamed from: a */
    public void mo6373a(String str) {
        try {
            if (this.f6004c) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new C6447v(this, 0));
            } else if (this.f6003b) {
                mo6375b(str);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(f6001e, "Failed to register for Firebase Cloud Messaging", e);
        }
    }

    /* renamed from: b */
    public final void mo6375b(String str) {
        Class<String> cls = String.class;
        String str2 = f6001e;
        AppboyLogger.m5457v(str2, "Registering for Firebase Cloud Messaging token using sender id: " + str);
        try {
            Method b = C1689s4.m4741b("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0]);
            if (b == null) {
                AppboyLogger.m5448d(str2, "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.");
                return;
            }
            Object a = C1689s4.m4738a((Object) null, b, new Object[0]);
            if (a == null) {
                AppboyLogger.m5448d(str2, "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.");
                return;
            }
            Method a2 = C1689s4.m4739a(a.getClass(), "getToken", (Class<?>[]) new Class[]{cls, cls});
            if (a2 == null) {
                AppboyLogger.m5448d(str2, "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.");
                return;
            }
            Object a3 = C1689s4.m4738a(a, a2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (a3 instanceof String) {
                AppboyLogger.m5457v(str2, "Automatically obtained Firebase Cloud Messaging token: " + a3);
                this.f6005d.mo5913a((String) a3);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(f6001e, "Failed to get push token via instance id", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4753a(Task task) {
        if (!task.isSuccessful()) {
            task.getException();
            return;
        }
        String str = (String) task.getResult();
        String str2 = f6001e;
        AppboyLogger.m5457v(str2, "Automatically obtained Firebase Cloud Messaging token: " + str);
        this.f6005d.mo5913a(str);
    }

    /* renamed from: a */
    public boolean mo6374a() {
        if (!C1645n4.m4527b(this.f6002a)) {
            AppboyLogger.m5459w(f6001e, "Firebase Cloud Messaging requires the Google Play Store to be installed.");
            return false;
        } else if (this.f6003b || this.f6004c) {
            return true;
        } else {
            return false;
        }
    }
}
