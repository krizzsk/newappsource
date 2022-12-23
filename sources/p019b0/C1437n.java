package p019b0;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import p019b0.C1438o;
import p102h0.C5015a;
import p304x.C7071l0;
import p327z.C7372g;
import p695od.C18728c;

/* renamed from: b0.n */
public final /* synthetic */ class C1437n implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ C1438o.C1440b f5289a;

    /* renamed from: b */
    public final /* synthetic */ CameraDevice f5290b;

    /* renamed from: c */
    public final /* synthetic */ C7372g f5291c;

    /* renamed from: d */
    public final /* synthetic */ List f5292d;

    public /* synthetic */ C1437n(C7071l0 l0Var, CameraDevice cameraDevice, C7372g gVar, List list) {
        this.f5289a = l0Var;
        this.f5290b = cameraDevice;
        this.f5291c = gVar;
        this.f5292d = list;
    }

    public final C18728c apply(Object obj) {
        C1438o.C1440b bVar = this.f5289a;
        List list = (List) obj;
        return C1437n.super.mo2341b(this.f5290b, this.f5291c, this.f5292d);
    }
}
