package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import java.util.Set;

/* renamed from: bo.app.i4 */
public class C1604i4 {

    /* renamed from: a */
    public static final String f5749a = AppboyLogger.getBrazeLogTag(C1604i4.class);

    /* renamed from: a */
    public static boolean m4315a(String str, Set<String> set) {
        if (str == null) {
            AppboyLogger.m5459w(f5749a, "Custom attribute key cannot be null.");
            return false;
        } else if (!set.contains(str)) {
            return true;
        } else {
            String str2 = f5749a;
            AppboyLogger.m5459w(str2, "Custom attribute key cannot be blocklisted attribute: " + str + ".");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4314a(String str) {
        if (str != null) {
            return true;
        }
        AppboyLogger.m5459w(f5749a, "Custom attribute value cannot be null.");
        return false;
    }

    /* renamed from: a */
    public static String[] m4316a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = ValidationUtils.ensureBrazeFieldLength(strArr[i]);
            }
        }
        return strArr;
    }
}
