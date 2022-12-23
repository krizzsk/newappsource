package p304x;

import androidx.camera.camera2.internal.C0522m;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4289j0;
import p102h0.C5015a;
import p102h0.C5023g;
import p102h0.C5028j;
import p695od.C18728c;

/* renamed from: x.p1 */
public final /* synthetic */ class C7089p1 implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ C0522m f22033a;

    /* renamed from: b */
    public final /* synthetic */ List f22034b;

    public /* synthetic */ C7089p1(C0522m mVar, ArrayList arrayList) {
        this.f22033a = mVar;
        this.f22034b = arrayList;
    }

    public final C18728c apply(Object obj) {
        C0522m mVar = this.f22033a;
        List list = this.f22034b;
        List list2 = (List) obj;
        mVar.toString();
        C4289j0.m11435b("SyncCaptureSessionBase");
        if (list2.contains((Object) null)) {
            return new C5028j.C5029a(new DeferrableSurface.SurfaceClosedException((DeferrableSurface) list.get(list2.indexOf((Object) null)), "Surface closed"));
        }
        if (list2.isEmpty()) {
            return new C5028j.C5029a(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C5023g.m12857e(list2);
    }
}
