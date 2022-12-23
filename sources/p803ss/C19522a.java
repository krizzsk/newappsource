package p803ss;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import f00.C16919g;
import java.util.WeakHashMap;

/* renamed from: ss.a */
public final class C19522a {

    /* renamed from: b */
    public static WeakHashMap<Context, C19522a> f49615b = new WeakHashMap<>();

    /* renamed from: c */
    public static C16919g.C16928i f49616c = new C16919g.C16928i("user_profile_nickname", "");

    /* renamed from: d */
    public static C16919g.C16928i f49617d = new C16919g.C16928i("user_profile_email", "");

    /* renamed from: e */
    public static C16919g.C16924e f49618e = new C16919g.C16924e("user_profile_avatar_id", 1);

    /* renamed from: f */
    public static C16919g.C16928i f49619f = new C16919g.C16928i("user_profile_phone_number", "");

    /* renamed from: a */
    public final SharedPreferences f49620a;

    public C19522a(SharedPreferences sharedPreferences) {
        C21100e.m49373x(sharedPreferences, "prefs");
        this.f49620a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C19522a m46888a(Context context) {
        C19522a aVar;
        synchronized (C19522a.class) {
            Context applicationContext = context.getApplicationContext();
            aVar = f49615b.get(applicationContext);
            if (aVar == null) {
                aVar = new C19522a(applicationContext.getSharedPreferences("com.moovit.general.userprofile.UserProfilePrefs", 0));
                f49615b.put(applicationContext, aVar);
            }
        }
        return aVar;
    }
}
