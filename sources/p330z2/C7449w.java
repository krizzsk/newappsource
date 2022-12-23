package p330z2;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: z2.w */
public class C7449w extends C7448v {

    /* renamed from: k */
    public static boolean f22872k = true;

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo23705d(View view, int i, int i2, int i3, int i4) {
        if (f22872k) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f22872k = false;
            }
        }
    }
}
