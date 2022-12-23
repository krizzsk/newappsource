package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.widget.r1 */
public final class C0453r1 {

    /* renamed from: a */
    public static Method f1613a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f1613a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f1613a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m1265a(View view) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(view) == 1) {
            return true;
        }
        return false;
    }
}
