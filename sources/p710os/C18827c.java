package p710os;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import f00.C16919g;

/* renamed from: os.c */
public final class C18827c {

    /* renamed from: b */
    public static C18827c f47937b;

    /* renamed from: c */
    public static C16919g.C16920a f47938c = new C16919g.C16920a("SHOW_TAXI_FLOATING_BUTTON_ON_MAP", true);

    /* renamed from: a */
    public final SharedPreferences f47939a;

    public C18827c(SharedPreferences sharedPreferences) {
        C21100e.m49373x(sharedPreferences, "prefs");
        this.f47939a = sharedPreferences;
    }

    /* renamed from: a */
    public static C18827c m45824a(Context context) {
        if (f47937b == null) {
            synchronized (C18827c.class) {
                if (f47937b == null) {
                    f47937b = new C18827c(context.getApplicationContext().getSharedPreferences("com.moovit.general.settings.map.MapSettingsPref", 0));
                }
            }
        }
        return f47937b;
    }
}
