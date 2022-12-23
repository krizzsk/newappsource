package p009a8;

import android.content.SharedPreferences;
import mf0.C24362h;

/* renamed from: a8.v */
public final class C0126v {

    /* renamed from: a */
    public final SharedPreferences f368a;

    public C0126v() {
        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C24362h.m61210e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f368a = sharedPreferences;
    }
}
