package p009a8;

import android.content.SharedPreferences;
import mf0.C24362h;

/* renamed from: a8.f */
public final class C0106f {

    /* renamed from: a */
    public final SharedPreferences f316a;

    public C0106f() {
        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        C24362h.m61210e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f316a = sharedPreferences;
    }
}
