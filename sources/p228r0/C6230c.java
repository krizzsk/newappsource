package p228r0;

import android.graphics.drawable.Drawable;

/* renamed from: r0.c */
public final class C6230c extends Drawable {

    /* renamed from: a */
    public static final double f19677a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f19678b = 0;

    /* renamed from: a */
    public static float m14815a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f19677a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
