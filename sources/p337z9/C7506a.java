package p337z9;

import android.os.Build;
import android.util.Log;

/* renamed from: z9.a */
public final class C7506a {
    /* renamed from: a */
    public static void m17226a(String str, String str2, Object obj) {
        if (Log.isLoggable(m17227b(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: b */
    public static String m17227b(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C25541a.m63881k("TRuntime.", str);
        }
        String k = C25541a.m63881k("TRuntime.", str);
        if (k.length() > 23) {
            return k.substring(0, 23);
        }
        return k;
    }
}
