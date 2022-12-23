package p009a8;

import android.content.SharedPreferences;
import mf0.C24362h;

/* renamed from: a8.a */
public final class C0090a {

    /* renamed from: a */
    public final SharedPreferences f270a;

    /* renamed from: a8.a$a */
    public static final class C0091a {
    }

    public C0090a() {
        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C24362h.m61210e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        new C0091a();
        this.f270a = sharedPreferences;
    }
}
