package p811tc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p221q6.C6181b;

/* renamed from: tc.d */
public final class C19645d extends C6181b {

    /* renamed from: b */
    public float f49834b = -1.0f;

    /* renamed from: i */
    public final void mo22174i(float f, float f2, C19659n nVar) {
        nVar.mo52035e(BitmapDescriptorFactory.HUE_RED, f2 * f, 180.0f, 90.0f);
        double d = (double) f2;
        double d2 = (double) f;
        nVar.mo52034d((float) (Math.sin(Math.toRadians((double) 90.0f)) * d * d2), (float) (Math.sin(Math.toRadians((double) BitmapDescriptorFactory.HUE_RED)) * d * d2));
    }
}
