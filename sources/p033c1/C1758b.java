package p033c1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: c1.b */
public final class C1758b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f6162a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f6163b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m5008a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m5008a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
