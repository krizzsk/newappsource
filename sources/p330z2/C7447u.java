package p330z2;

import android.annotation.SuppressLint;
import android.view.View;
import p609km.C18097c;

/* renamed from: z2.u */
public class C7447u extends C18097c {

    /* renamed from: g */
    public static boolean f22868g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public float mo23700f(View view) {
        if (f22868g) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f22868g = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo23701h(View view, float f) {
        if (f22868g) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f22868g = false;
            }
        }
        view.setAlpha(f);
    }
}
