package p030bo.app;

import com.appboy.support.AppboyLogger;
import org.json.JSONException;

/* renamed from: bo.app.k */
public class C1616k implements C1632m {

    /* renamed from: a */
    public static final String f5768a = AppboyLogger.getBrazeLogTag(C1616k.class);

    /* renamed from: b */
    public C1594h2 mo6165b(String str) {
        try {
            return C1687s2.m4706c(str);
        } catch (JSONException e) {
            String str2 = f5768a;
            AppboyLogger.m5460w(str2, "Failed to create Content Cards control impression event for card: " + str, e);
            return null;
        }
    }

    /* renamed from: c */
    public C1594h2 mo6166c(String str) {
        try {
            return C1687s2.m4711e(str);
        } catch (JSONException e) {
            String str2 = f5768a;
            AppboyLogger.m5460w(str2, "Failed to create Content Cards impression event for card: " + str, e);
            return null;
        }
    }

    /* renamed from: d */
    public C1594h2 mo6167d(String str) {
        try {
            return C1687s2.m4708d(str);
        } catch (JSONException e) {
            String str2 = f5768a;
            AppboyLogger.m5460w(str2, "Failed to create Content Cards dismissed event for card: " + str, e);
            return null;
        }
    }

    /* renamed from: e */
    public C1687s2 mo6164a(String str) {
        try {
            return C1687s2.m4705b(str);
        } catch (JSONException e) {
            String str2 = f5768a;
            AppboyLogger.m5460w(str2, "Failed to create Content Cards click event for card: " + str, e);
            return null;
        }
    }
}
