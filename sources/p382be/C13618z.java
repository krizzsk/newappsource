package p382be;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: be.z */
public final class C13618z {

    /* renamed from: a */
    public static final C13618z f33590a = new C13618z();

    /* renamed from: a */
    public static void m34028a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* renamed from: b */
    public static final SharedPreferences m34029b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }
}
