package p977zz;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: zz.y0 */
public final class C20977y0 {
    /* renamed from: a */
    public static boolean m49122a(Activity activity) {
        Drawable drawable;
        View decorView = activity.getWindow().getDecorView();
        if (decorView == null) {
            drawable = null;
        } else {
            drawable = decorView.getBackground();
        }
        if (drawable == null || drawable.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m49123b(Activity activity, boolean z) {
        int i;
        if (!C20943i.m49051d(23)) {
            return false;
        }
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & -8193;
        }
        decorView.setSystemUiVisibility(i);
        return true;
    }

    /* renamed from: c */
    public static void m49124c(Activity activity) {
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(C20941h.m49043f(16842801, activity)));
    }
}
