package p030bo.app;

import com.appboy.support.AppboyLogger;
import org.json.JSONException;

/* renamed from: bo.app.l */
public class C1624l implements C1632m {

    /* renamed from: a */
    public static final String f5804a = AppboyLogger.getBrazeLogTag(C1624l.class);

    /* renamed from: a */
    public C1594h2 mo6164a(String str) {
        try {
            return C1687s2.m4713f(str);
        } catch (JSONException e) {
            String str2 = f5804a;
            AppboyLogger.m5460w(str2, "Failed to create feed card click event for card: " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public C1594h2 mo6165b(String str) {
        String str2 = f5804a;
        AppboyLogger.m5459w(str2, "Cannot create card control event for Feed card. Returning null. Card id: " + str);
        return null;
    }

    /* renamed from: c */
    public C1594h2 mo6166c(String str) {
        try {
            return C1687s2.m4715g(str);
        } catch (JSONException e) {
            String str2 = f5804a;
            AppboyLogger.m5460w(str2, "Failed to create feed card impression event for card: " + str, e);
            return null;
        }
    }

    /* renamed from: d */
    public C1594h2 mo6167d(String str) {
        String str2 = f5804a;
        AppboyLogger.m5459w(str2, "Cannot create card dismissed event for Feed card. Returning null. Card id: " + str);
        return null;
    }
}
