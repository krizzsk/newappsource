package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

/* renamed from: bo.app.j */
public class C1607j {

    /* renamed from: b */
    public static final String f5752b = AppboyLogger.getBrazeLogTag(C1607j.class);

    /* renamed from: a */
    public final SharedPreferences f5753a;

    public C1607j(Context context, String str, String str2) {
        StringBuilder k = C13555b.m33972k("com.braze.storage.sdk_auth_cache");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f5753a = context.getSharedPreferences(k.toString(), 0);
    }

    /* renamed from: a */
    public void mo6158a(String str) {
        String str2 = f5752b;
        AppboyLogger.m5457v(str2, "Setting signature to: " + str);
        this.f5753a.edit().putString("auth_signature", str).apply();
    }

    /* renamed from: a */
    public String mo6157a() {
        return this.f5753a.getString("auth_signature", (String) null);
    }
}
