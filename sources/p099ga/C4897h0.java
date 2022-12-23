package p099ga;

import android.os.Build;
import java.util.HashSet;
import p001a0.C0016g;

/* renamed from: ga.h0 */
public final class C4897h0 {

    /* renamed from: a */
    public static final HashSet<String> f16510a = new HashSet<>();

    /* renamed from: b */
    public static String f16511b = "goog.exo.core";

    static {
        new StringBuilder(C0016g.m25h(Build.VERSION.RELEASE, 57));
    }

    /* renamed from: a */
    public static synchronized void m12445a() {
        synchronized (C4897h0.class) {
            if (f16510a.add("goog.exo.ui")) {
                String str = f16511b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + "goog.exo.ui".length());
                sb.append(str);
                sb.append(", ");
                sb.append("goog.exo.ui");
                f16511b = sb.toString();
            }
        }
    }
}
