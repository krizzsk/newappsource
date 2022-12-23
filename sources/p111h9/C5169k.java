package p111h9;

import android.widget.ImageView;

/* renamed from: h9.k */
public final class C5169k {

    /* renamed from: h9.k$a */
    public static /* synthetic */ class C5170a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17255a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f17255a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13085a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
