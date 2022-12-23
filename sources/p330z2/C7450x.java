package p330z2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: z2.x */
public class C7450x extends C7449w {

    /* renamed from: l */
    public static boolean f22873l = true;

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo23706e(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo23706e(i, view);
        } else if (f22873l) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f22873l = false;
            }
        }
    }
}
