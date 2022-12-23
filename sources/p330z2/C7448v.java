package p330z2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: z2.v */
public class C7448v extends C7447u {

    /* renamed from: h */
    public static boolean f22869h = true;

    /* renamed from: i */
    public static boolean f22870i = true;

    /* renamed from: j */
    public static boolean f22871j = true;

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo23702i(View view, Matrix matrix) {
        if (f22869h) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f22869h = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo23703j(View view, Matrix matrix) {
        if (f22870i) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f22870i = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: k */
    public void mo23704k(View view, Matrix matrix) {
        if (f22871j) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f22871j = false;
            }
        }
    }
}
