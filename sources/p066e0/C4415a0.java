package p066e0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import p102h0.C5023g;
import p695od.C18728c;

/* renamed from: e0.a0 */
public final class C4415a0 extends DeferrableSurface {

    /* renamed from: m */
    public final Surface f15477m;

    public C4415a0(Surface surface, Size size, int i) {
        super(size, i);
        this.f15477m = surface;
    }

    /* renamed from: g */
    public final C18728c<Surface> mo2360g() {
        return C5023g.m12857e(this.f15477m);
    }

    public C4415a0(Surface surface) {
        this.f15477m = surface;
    }
}
