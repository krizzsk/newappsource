package p304x;

import androidx.camera.core.C0627p;
import p066e0.C4462z;

/* renamed from: x.a2 */
public final /* synthetic */ class C7026a2 implements C4462z.C4463a {

    /* renamed from: b */
    public final /* synthetic */ C7034c2 f21871b;

    public /* synthetic */ C7026a2(C7034c2 c2Var) {
        this.f21871b = c2Var;
    }

    /* renamed from: c */
    public final void mo2538c(C4462z zVar) {
        C7034c2 c2Var = this.f21871b;
        c2Var.getClass();
        C0627p acquireLatestImage = zVar.acquireLatestImage();
        if (acquireLatestImage != null) {
            c2Var.f21881a.add(acquireLatestImage);
        }
    }
}
