package p176n0;

import android.graphics.RectF;

/* renamed from: n0.p */
public final class C5798p {

    /* renamed from: a */
    public static final RectF f18752a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static boolean m14226a(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Invalid rotation degrees: ", i));
    }
}
