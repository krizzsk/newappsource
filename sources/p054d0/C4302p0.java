package p054d0;

import android.view.Surface;
import p102h0.C5018c;

/* renamed from: d0.p0 */
public final class C4302p0 implements C5018c<Surface> {

    /* renamed from: a */
    public final /* synthetic */ C4304q0 f15230a;

    public C4302p0(C4304q0 q0Var) {
        this.f15230a = q0Var;
    }

    public final void onFailure(Throwable th) {
        C4289j0.m11435b("ProcessingSurfaceTextur");
    }

    public final void onSuccess(Object obj) {
        Surface surface = (Surface) obj;
        synchronized (this.f15230a.f15232m) {
            this.f15230a.f15237r.onOutputSurface(surface, 1);
        }
    }
}
