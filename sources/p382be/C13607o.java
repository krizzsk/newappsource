package p382be;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: be.o */
public final class C13607o {

    /* renamed from: a */
    public static final ArrayList f33573a = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"}));

    /* renamed from: b */
    public static final C13607o f33574b = new C13607o();

    /* renamed from: a */
    public static final void m34022a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = f33573a.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.commit();
    }
}
