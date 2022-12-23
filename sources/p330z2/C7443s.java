package p330z2;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* renamed from: z2.s */
public final class C7443s {

    /* renamed from: a */
    public static boolean f22862a = true;

    /* renamed from: b */
    public static Method f22863b;

    /* renamed from: c */
    public static boolean f22864c;

    /* renamed from: a */
    public static void m17081a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f22862a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f22862a = false;
            }
        }
    }
}
