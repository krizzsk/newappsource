package p734ps;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import f00.C16919g;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* renamed from: ps.e */
public final class C18977e {

    /* renamed from: b */
    public static final WeakHashMap<Context, C18977e> f48312b = new WeakHashMap<>();

    /* renamed from: c */
    public static final C16919g.C16924e f48313c = new C16919g.C16924e("userDeliverySchedule", 0);

    /* renamed from: d */
    public static final C16919g.C16920a f48314d = new C16919g.C16920a(UserNotificationSetting.PushNotificationNewsAndUpdate.getId(), true);

    /* renamed from: e */
    public static final C16919g.C16920a f48315e = new C16919g.C16920a(UserNotificationSetting.PushNotificationMyFavorite.getId(), true);

    /* renamed from: f */
    public static final C16919g.C16920a f48316f = new C16919g.C16920a(UserNotificationSetting.PushNotificationStopGeofence.getId(), true);

    /* renamed from: g */
    public static final C16919g.C16920a f48317g = new C16919g.C16920a(UserNotificationSetting.PushNotificationServiceAlert.getId(), true);

    /* renamed from: h */
    public static final C16919g.C16920a f48318h = new C16919g.C16920a(UserNotificationSetting.PushNotificationMobileTicketing.getId(), true);

    /* renamed from: a */
    public final SharedPreferences f48319a;

    public C18977e(SharedPreferences sharedPreferences) {
        C21100e.m49373x(sharedPreferences, "prefs");
        this.f48319a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C18977e m46090a(Context context) {
        C18977e eVar;
        synchronized (C18977e.class) {
            Context applicationContext = context.getApplicationContext();
            WeakHashMap<Context, C18977e> weakHashMap = f48312b;
            eVar = weakHashMap.get(applicationContext);
            if (eVar == null) {
                eVar = new C18977e(applicationContext.getSharedPreferences("com.moovit.general.settings.notifications.NotificationsPrefs", 0));
                weakHashMap.put(applicationContext, eVar);
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final TreeMap mo51488b() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(UserNotificationSetting.PushNotificationNewsAndUpdate, f48314d.mo19759a(this.f48319a));
        treeMap.put(UserNotificationSetting.PushNotificationMyFavorite, f48315e.mo19759a(this.f48319a));
        treeMap.put(UserNotificationSetting.PushNotificationServiceAlert, f48317g.mo19759a(this.f48319a));
        treeMap.put(UserNotificationSetting.PushNotificationMobileTicketing, f48318h.mo19759a(this.f48319a));
        treeMap.put(UserNotificationSetting.PushNotificationStopGeofence, f48316f.mo19759a(this.f48319a));
        return treeMap;
    }

    /* renamed from: c */
    public final UserDeliverySchedule mo51489c() {
        return UserDeliverySchedule.values()[f48313c.mo19759a(this.f48319a).intValue()];
    }
}
