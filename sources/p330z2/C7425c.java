package p330z2;

import android.animation.TypeEvaluator;

/* renamed from: z2.c */
public final class C7425c implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f22819a;

    public C7425c(float[] fArr) {
        this.f22819a = fArr;
    }

    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.f22819a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = C16759e.m42347c(fArr2[i], f2, f, f2);
        }
        return fArr3;
    }
}
