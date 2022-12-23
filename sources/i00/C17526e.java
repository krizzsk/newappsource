package i00;

import android.view.animation.Interpolator;
import ce0.C21100e;

/* renamed from: i00.e */
public final class C17526e implements Interpolator {

    /* renamed from: a */
    public final Interpolator f45112a;

    public C17526e(Interpolator interpolator) {
        C21100e.m49373x(interpolator, "interpolator");
        this.f45112a = interpolator;
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.f45112a.getInterpolation(1.0f - f);
    }
}
