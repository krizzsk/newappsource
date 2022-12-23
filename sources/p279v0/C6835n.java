package p279v0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: v0.n */
public final class C6835n implements C6834m {

    /* renamed from: a */
    public float f21152a;

    /* renamed from: b */
    public float f21153b;

    /* renamed from: c */
    public float f21154c;

    /* renamed from: d */
    public float f21155d;

    /* renamed from: e */
    public float f21156e;

    /* renamed from: f */
    public float f21157f;

    /* renamed from: g */
    public float f21158g;

    /* renamed from: h */
    public float f21159h;

    /* renamed from: i */
    public float f21160i;

    /* renamed from: j */
    public int f21161j;

    /* renamed from: k */
    public boolean f21162k = false;

    /* renamed from: l */
    public float f21163l;

    /* renamed from: m */
    public float f21164m;

    /* renamed from: a */
    public final float mo23068a() {
        return this.f21162k ? -mo23071c(this.f21164m) : mo23071c(this.f21164m);
    }

    /* renamed from: b */
    public final boolean mo23069b() {
        return mo23068a() < 1.0E-5f && Math.abs(this.f21160i - this.f21164m) < 1.0E-5f;
    }

    /* renamed from: c */
    public final float mo23071c(float f) {
        float f2;
        float f3;
        float f4 = this.f21155d;
        if (f <= f4) {
            f2 = this.f21152a;
            f3 = this.f21153b;
        } else {
            int i = this.f21161j;
            if (i == 1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            f -= f4;
            f4 = this.f21156e;
            if (f < f4) {
                f2 = this.f21153b;
                f3 = this.f21154c;
            } else if (i == 2) {
                return this.f21159h;
            } else {
                float f5 = f - f4;
                float f6 = this.f21157f;
                if (f5 >= f6) {
                    return this.f21160i;
                }
                float f7 = this.f21154c;
                return f7 - ((f5 * f7) / f6);
            }
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    /* renamed from: d */
    public final void mo23072d(float f, float f2, float f3, float f4, float f5) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0E-4f;
        }
        this.f21152a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f21161j = 2;
                this.f21152a = f;
                this.f21153b = sqrt;
                this.f21154c = BitmapDescriptorFactory.HUE_RED;
                float f8 = (sqrt - f) / f3;
                this.f21155d = f8;
                this.f21156e = sqrt / f3;
                this.f21158g = ((f + sqrt) * f8) / 2.0f;
                this.f21159h = f2;
                this.f21160i = f2;
                return;
            }
            this.f21161j = 3;
            this.f21152a = f;
            this.f21153b = f4;
            this.f21154c = f4;
            float f9 = (f4 - f) / f3;
            this.f21155d = f9;
            float f11 = f4 / f3;
            this.f21157f = f11;
            float f12 = ((f + f4) * f9) / 2.0f;
            float f13 = (f11 * f4) / 2.0f;
            this.f21156e = ((f2 - f12) - f13) / f4;
            this.f21158g = f12;
            this.f21159h = f2 - f13;
            this.f21160i = f2;
        } else if (f7 >= f2) {
            this.f21161j = 1;
            this.f21152a = f;
            this.f21153b = BitmapDescriptorFactory.HUE_RED;
            this.f21158g = f2;
            this.f21155d = (2.0f * f2) / f;
        } else {
            float f14 = f2 - f7;
            float f15 = f14 / f;
            if (f15 + f6 < f5) {
                this.f21161j = 2;
                this.f21152a = f;
                this.f21153b = f;
                this.f21154c = BitmapDescriptorFactory.HUE_RED;
                this.f21158g = f14;
                this.f21159h = f2;
                this.f21155d = f15;
                this.f21156e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) (((f * f) / 2.0f) + (f3 * f2)));
            float f16 = (sqrt2 - f) / f3;
            this.f21155d = f16;
            float f17 = sqrt2 / f3;
            this.f21156e = f17;
            if (sqrt2 < f4) {
                this.f21161j = 2;
                this.f21152a = f;
                this.f21153b = sqrt2;
                this.f21154c = BitmapDescriptorFactory.HUE_RED;
                this.f21155d = f16;
                this.f21156e = f17;
                this.f21158g = ((f + sqrt2) * f16) / 2.0f;
                this.f21159h = f2;
                return;
            }
            this.f21161j = 3;
            this.f21152a = f;
            this.f21153b = f4;
            this.f21154c = f4;
            float f18 = (f4 - f) / f3;
            this.f21155d = f18;
            float f19 = f4 / f3;
            this.f21157f = f19;
            float f21 = ((f + f4) * f18) / 2.0f;
            float f22 = (f19 * f4) / 2.0f;
            this.f21156e = ((f2 - f21) - f22) / f4;
            this.f21158g = f21;
            this.f21159h = f2 - f22;
            this.f21160i = f2;
        }
    }

    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f21155d;
        if (f <= f3) {
            float f4 = this.f21152a;
            f2 = ((((this.f21153b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f21161j;
            if (i == 1) {
                f2 = this.f21158g;
            } else {
                float f5 = f - f3;
                float f6 = this.f21156e;
                if (f5 < f6) {
                    float f7 = this.f21158g;
                    float f8 = this.f21153b;
                    f2 = ((((this.f21154c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f21159h;
                } else {
                    float f9 = f5 - f6;
                    float f11 = this.f21157f;
                    if (f9 <= f11) {
                        float f12 = this.f21159h;
                        float f13 = this.f21154c * f9;
                        f2 = (f12 + f13) - ((f13 * f9) / (f11 * 2.0f));
                    } else {
                        f2 = this.f21160i;
                    }
                }
            }
        }
        this.f21164m = f;
        if (this.f21162k) {
            return this.f21163l - f2;
        }
        return this.f21163l + f2;
    }
}
