package p054d0;

import android.media.ImageReader;
import android.util.Size;
import androidx.camera.core.C0544a;
import androidx.camera.core.C0627p;
import p066e0.C4450p0;

/* renamed from: d0.m0 */
public final class C4295m0 extends C4272c {

    /* renamed from: c */
    public volatile C4450p0 f15219c = null;

    public C4295m0(ImageReader imageReader) {
        super(imageReader);
    }

    public final C0627p acquireLatestImage() {
        return mo19818b((C0544a) super.acquireNextImage());
    }

    public final C0627p acquireNextImage() {
        return mo19818b((C0544a) super.acquireNextImage());
    }

    /* renamed from: b */
    public final C4310t0 mo19818b(C0544a aVar) {
        C4450p0 p0Var;
        C4277e eVar = aVar.f1884d;
        if (this.f15219c != null) {
            p0Var = this.f15219c;
        } else {
            p0Var = eVar.f15196a;
        }
        return new C4310t0(aVar, (Size) null, new C4277e(p0Var, eVar.f15197b, eVar.f15198c, eVar.f15199d));
    }
}
