package p099ga;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ga.s0 */
public final class C4932s0 {

    /* renamed from: d */
    public static final C4932s0 f16695d = new C4932s0(1.0f, 1.0f);

    /* renamed from: a */
    public final float f16696a;

    /* renamed from: b */
    public final float f16697b;

    /* renamed from: c */
    public final int f16698c;

    public C4932s0(float f, float f2) {
        boolean z;
        boolean z2 = true;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        C17875h.m44301k(f2 <= BitmapDescriptorFactory.HUE_RED ? false : z2);
        this.f16696a = f;
        this.f16697b = f2;
        this.f16698c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4932s0.class != obj.getClass()) {
            return false;
        }
        C4932s0 s0Var = (C4932s0) obj;
        if (this.f16696a == s0Var.f16696a && this.f16697b == s0Var.f16697b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f16697b) + ((Float.floatToRawIntBits(this.f16696a) + 527) * 31);
    }

    public final String toString() {
        return C6774a0.m15950j("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f16696a), Float.valueOf(this.f16697b));
    }
}
