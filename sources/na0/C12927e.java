package na0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ya0.C13288j;

/* renamed from: na0.e */
public final class C12927e {

    /* renamed from: e */
    public static final C12934k f32015e = new C12934k(BitmapDescriptorFactory.HUE_RED, 24.0f);

    /* renamed from: a */
    public C12934k f32016a = f32015e;

    /* renamed from: b */
    public C12934k f32017b;

    /* renamed from: c */
    public C12934k f32018c;

    /* renamed from: d */
    public boolean f32019d = true;

    static {
        new C12934k(30.0f, 90.0f);
        new C12922a(-500000.0d, 500000.0d, 500000.0d, -500000.0d);
    }

    public C12927e() {
        float b = C13288j.m33427b(30.0f, 30.0f, 90.0f);
        float b2 = C13288j.m33427b(90.0f, 30.0f, 90.0f);
        this.f32017b = new C12934k(b, b2);
        this.f32018c = new C12934k(b * 0.017453292f, b2 * 0.017453292f);
    }
}
