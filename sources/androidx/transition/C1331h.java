package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* renamed from: androidx.transition.h */
public final class C1331h {

    /* renamed from: a */
    public static final boolean f5016a = true;

    /* renamed from: b */
    public static final boolean f5017b = true;

    /* renamed from: c */
    public static final boolean f5018c;

    /* renamed from: androidx.transition.h$a */
    public static class C1332a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final float[] f5019a = new float[9];

        /* renamed from: b */
        public final float[] f5020b = new float[9];

        /* renamed from: c */
        public final Matrix f5021c = new Matrix();

        public final Object evaluate(float f, Object obj, Object obj2) {
            ((Matrix) obj).getValues(this.f5019a);
            ((Matrix) obj2).getValues(this.f5020b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f5020b;
                float f2 = fArr[i];
                float f3 = this.f5019a[i];
                fArr[i] = C16759e.m42347c(f2, f3, f, f3);
            }
            this.f5021c.setValues(this.f5020b);
            return this.f5021c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f5018c = z;
    }
}
