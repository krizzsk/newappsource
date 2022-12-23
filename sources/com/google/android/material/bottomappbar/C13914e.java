package com.google.android.material.bottomappbar;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p811tc.C19646e;
import p811tc.C19659n;

/* renamed from: com.google.android.material.bottomappbar.e */
public final class C13914e extends C19646e implements Cloneable {

    /* renamed from: b */
    public float f34343b;

    /* renamed from: c */
    public float f34344c;

    /* renamed from: d */
    public float f34345d;

    /* renamed from: e */
    public float f34346e;

    /* renamed from: f */
    public float f34347f;

    /* renamed from: g */
    public float f34348g = -1.0f;

    public C13914e(float f, float f2, float f3) {
        this.f34344c = f;
        this.f34343b = f2;
        if (f3 >= BitmapDescriptorFactory.HUE_RED) {
            this.f34346e = f3;
            this.f34347f = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: g */
    public final void mo41045g(float f, float f2, float f3, C19659n nVar) {
        boolean z;
        float f4;
        float f5;
        float f6 = f;
        float f7 = f3;
        C19659n nVar2 = nVar;
        float f8 = this.f34345d;
        if (f8 == BitmapDescriptorFactory.HUE_RED) {
            nVar2.mo52034d(f6, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f9 = ((this.f34344c * 2.0f) + f8) / 2.0f;
        float f11 = f7 * this.f34343b;
        float f12 = f2 + this.f34347f;
        float c = C16759e.m42347c(1.0f, f7, f9, this.f34346e * f7);
        if (c / f9 >= 1.0f) {
            nVar2.mo52034d(f6, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f13 = this.f34348g;
        float f14 = f13 * f7;
        if (f13 == -1.0f || Math.abs((f13 * 2.0f) - f8) < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f5 = 1.75f;
            f4 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f5 = BitmapDescriptorFactory.HUE_RED;
            f4 = c;
        }
        float f15 = f9 + f11;
        float f16 = f4 + f11;
        float sqrt = (float) Math.sqrt((double) ((f15 * f15) - (f16 * f16)));
        float f17 = f12 - sqrt;
        float f18 = f12 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f16)));
        float f19 = (90.0f - degrees) + f5;
        nVar2.mo52034d(f17, BitmapDescriptorFactory.HUE_RED);
        float f21 = f11 * 2.0f;
        float f22 = degrees;
        nVar.mo52031a(f17 - f11, BitmapDescriptorFactory.HUE_RED, f17 + f11, f21, 270.0f, degrees);
        if (z) {
            nVar.mo52031a(f12 - f9, (-f9) - f4, f12 + f9, f9 - f4, 180.0f - f19, (f19 * 2.0f) - 180.0f);
        } else {
            float f23 = this.f34344c;
            float f24 = f14 * 2.0f;
            float f25 = f12 - f9;
            float f26 = f14 + f23;
            nVar.mo52031a(f25, -f26, f25 + f23 + f24, f26, 180.0f - f19, ((f19 * 2.0f) - 180.0f) / 2.0f);
            float f27 = f12 + f9;
            float f28 = this.f34344c;
            nVar2.mo52034d(f27 - ((f28 / 2.0f) + f14), f28 + f14);
            float f29 = this.f34344c;
            float f31 = f14 + f29;
            nVar.mo52031a(f27 - (f24 + f29), -f31, f27, f31, 90.0f, f19 - 0.049804688f);
        }
        nVar.mo52031a(f18 - f11, BitmapDescriptorFactory.HUE_RED, f18 + f11, f21, 270.0f - f22, f22);
        nVar2.mo52034d(f6, BitmapDescriptorFactory.HUE_RED);
    }
}
