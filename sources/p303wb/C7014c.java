package p303wb;

import android.opengl.Matrix;
import p277ub.C6811x;

/* renamed from: wb.c */
public final class C7014c {

    /* renamed from: a */
    public final float[] f21824a = new float[16];

    /* renamed from: b */
    public final float[] f21825b = new float[16];

    /* renamed from: c */
    public final C6811x f21826c = new C6811x();

    /* renamed from: d */
    public boolean f21827d;

    /* renamed from: a */
    public static void m16510a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
