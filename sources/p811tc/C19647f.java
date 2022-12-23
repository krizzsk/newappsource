package p811tc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: tc.f */
public final class C19647f extends C19646e {

    /* renamed from: b */
    public final float f49835b;

    public C19647f(float f) {
        this.f49835b = f - 0.001f;
    }

    /* renamed from: g */
    public final void mo41045g(float f, float f2, float f3, C19659n nVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * ((double) this.f49835b)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f49835b, 2.0d) - Math.pow((double) sqrt, 2.0d));
        nVar.mo52035e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f49835b)) - ((double) this.f49835b)))) + sqrt2, 270.0f, BitmapDescriptorFactory.HUE_RED);
        nVar.mo52034d(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.f49835b)) - ((double) this.f49835b))));
        nVar.mo52034d(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f49835b)) - ((double) this.f49835b)))) + sqrt2);
    }
}
