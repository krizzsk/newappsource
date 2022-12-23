package p068e2;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: e2.d */
public abstract class C4527d implements Interpolator {

    /* renamed from: a */
    public final float[] f15649a;

    /* renamed from: b */
    public final float f15650b;

    public C4527d(float[] fArr) {
        this.f15649a = fArr;
        this.f15650b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f15649a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f15650b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f15649a;
        float f4 = fArr2[min];
        return C16759e.m42347c(fArr2[min + 1], f4, f3, f4);
    }
}
