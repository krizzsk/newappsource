package p330z2;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: z2.y */
public final class C7451y extends C7450x {
    /* renamed from: d */
    public final void mo23705d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: e */
    public final void mo23706e(int i, View view) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: f */
    public final float mo23700f(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: h */
    public final void mo23701h(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: i */
    public final void mo23702i(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: j */
    public final void mo23703j(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: k */
    public final void mo23704k(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
