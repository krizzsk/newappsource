package ya0;

import android.annotation.TargetApi;

/* renamed from: ya0.j */
public final class C13288j {

    @TargetApi(19)
    /* renamed from: ya0.j$a */
    public static class C13289a {
    }

    static {
        new C13289a();
    }

    /* renamed from: a */
    public static double m33426a(double d) {
        if (d <= -500000.0d) {
            return -500000.0d;
        }
        if (d >= 500000.0d) {
            return 500000.0d;
        }
        return d;
    }

    /* renamed from: b */
    public static float m33427b(float f, float f2, float f3) {
        return f <= f2 ? f2 : f >= f3 ? f3 : f;
    }

    /* renamed from: c */
    public static int m33428c(int i) {
        if (i <= 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }
}
