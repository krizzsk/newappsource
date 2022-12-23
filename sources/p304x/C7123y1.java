package p304x;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: x.y1 */
public final class C7123y1 {

    /* renamed from: a */
    public float f22134a;

    /* renamed from: b */
    public final float f22135b;

    /* renamed from: c */
    public final float f22136c;

    /* renamed from: d */
    public float f22137d;

    public C7123y1(float f, float f2) {
        this.f22135b = f;
        this.f22136c = f2;
    }

    /* renamed from: a */
    public final void mo23374a() throws IllegalArgumentException {
        float f = this.f22135b;
        float f2 = 1.0f;
        int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
        if (i <= 0) {
            float f3 = this.f22136c;
            if (1.0f >= f3) {
                this.f22134a = 1.0f;
                if (f != f3) {
                    if (i != 0) {
                        if (1.0f != f3) {
                            float f4 = 1.0f / f3;
                            f2 = (1.0f - f4) / ((1.0f / f) - f4);
                        }
                    }
                    this.f22137d = f2;
                    return;
                }
                f2 = BitmapDescriptorFactory.HUE_RED;
                this.f22137d = f2;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + 1.0f + " is not within valid range [" + this.f22136c + " , " + this.f22135b + "]");
    }
}
