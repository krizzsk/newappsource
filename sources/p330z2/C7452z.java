package p330z2;

import android.view.View;
import ci0.C21211f;

/* renamed from: z2.z */
public abstract class C7452z extends C21211f {

    /* renamed from: b */
    public static final String[] f22874b = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: w */
    public static int m17099w(C7441q qVar, int i) {
        int[] iArr;
        if (qVar == null || (iArr = (int[]) qVar.f22854a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: f */
    public final void mo23707f(C7441q qVar) {
        View view = qVar.f22855b;
        Integer num = (Integer) qVar.f22854a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        qVar.f22854a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = round;
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        qVar.f22854a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: n */
    public final void mo23708n() {
    }
}
