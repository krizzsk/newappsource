package p177n1;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* renamed from: n1.a */
public final class C5799a {
    /* renamed from: a */
    public static boolean m14227a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: b */
    public static boolean m14228b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || (i >= 30 && m14227a("S", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m14229c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 32 && m14227a("Tiramisu", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }
}
