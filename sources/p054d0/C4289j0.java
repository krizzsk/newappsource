package p054d0;

import android.os.Build;
import android.util.Log;

/* renamed from: d0.j0 */
public final class C4289j0 {

    /* renamed from: a */
    public static int f15210a = 3;

    /* renamed from: a */
    public static boolean m11434a(String str) {
        String b = m11435b(str);
        if (f15210a <= 3 || Log.isLoggable(b, 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m11435b(String str) {
        if (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) {
            return str;
        }
        return str.substring(0, 23);
    }
}
