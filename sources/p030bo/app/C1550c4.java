package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.c4 */
public class C1550c4 {

    /* renamed from: b */
    public static final String f5583b = AppboyLogger.getBrazeLogTag(C1550c4.class);

    /* renamed from: a */
    public final SharedPreferences f5584a;

    public C1550c4(Context context) {
        this.f5584a = context.getSharedPreferences("persistent.com.appboy.storage.sdk_enabled_cache", 0);
    }

    /* renamed from: a */
    public boolean mo5958a() {
        return this.f5584a.getBoolean("appboy_sdk_disabled", false);
    }

    /* renamed from: a */
    public void mo5957a(boolean z) {
        String str = f5583b;
        AppboyLogger.m5453i(str, "Setting Appboy SDK disabled to: " + z);
        this.f5584a.edit().putBoolean("appboy_sdk_disabled", z).apply();
    }
}
