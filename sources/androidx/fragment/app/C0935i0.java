package androidx.fragment.app;

import android.view.View;
import androidx.transition.C1323d;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.i0 */
public final class C0935i0 {

    /* renamed from: a */
    public static final C0939k0 f3800a = new C0939k0();

    /* renamed from: b */
    public static final C0954o0 f3801b;

    static {
        C0954o0 o0Var;
        try {
            o0Var = C1323d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o0Var = null;
        }
        f3801b = o0Var;
    }

    /* renamed from: a */
    public static void m2746a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }
}
