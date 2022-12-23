package p918xn;

import android.content.Context;
import android.provider.Settings;
import com.appsflyer.ServerParameters;

/* renamed from: xn.a */
public final class C20542a {

    /* renamed from: a */
    public final Context f51975a;

    public C20542a(Context context) {
        this.f51975a = context;
    }

    /* renamed from: a */
    public final String mo52741a() {
        String string = Settings.Secure.getString(this.f51975a.getContentResolver(), ServerParameters.ANDROID_ID);
        if (string == null || string.equals("9774d56d682e549c") || string.equals("1234567890ABCDEF")) {
            return "9264d56f6e1ec41e";
        }
        return string;
    }
}
