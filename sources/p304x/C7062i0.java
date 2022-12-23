package p304x;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.C0627p;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.List;
import p019b0.C1431h;
import p054d0.C4282g0;
import p066e0.C4428g;
import p102h0.C5015a;
import p102h0.C5023g;
import p115i0.C5226b;
import p291w.C6956a;
import p304x.C7045f0;
import p695od.C18728c;

/* renamed from: x.i0 */
public final /* synthetic */ class C7062i0 implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ C7045f0.C7048c f21958a;

    /* renamed from: b */
    public final /* synthetic */ List f21959b;

    /* renamed from: c */
    public final /* synthetic */ int f21960c;

    public /* synthetic */ C7062i0(C7045f0.C7048c cVar, List list, int i) {
        this.f21958a = cVar;
        this.f21959b = list;
        this.f21960c = i;
    }

    public final C18728c apply(Object obj) {
        int i;
        boolean z;
        C7045f0.C7048c cVar = this.f21958a;
        List<C0578e> list = this.f21959b;
        int i2 = this.f21960c;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C0578e eVar : list) {
            C0578e.C0579a aVar = new C0578e.C0579a(eVar);
            C4428g gVar = null;
            boolean z2 = true;
            if (eVar.f1972c == 5) {
                C0627p b = cVar.f21926c.f22045l.mo23288b();
                if (b == null || !cVar.f21926c.f22045l.mo23289c(b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C4282g0 imageInfo = b.getImageInfo();
                    if (imageInfo instanceof C5226b) {
                        gVar = ((C5226b) imageInfo).f17318a;
                    }
                }
            }
            if (gVar != null) {
                aVar.f1983g = gVar;
            } else {
                if (cVar.f21924a != 3 || cVar.f21928e) {
                    int i3 = eVar.f1972c;
                    if (i3 == -1 || i3 == 5) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = 4;
                }
                if (i != -1) {
                    aVar.f1979c = i;
                }
            }
            C1431h hVar = cVar.f21927d;
            if (!hVar.f5280b || i2 != 0 || !hVar.f5279a) {
                z2 = false;
            }
            if (z2) {
                C0589m t = C0589m.m1674t();
                t.mo2503w(C6956a.m16424s(CaptureRequest.CONTROL_AE_MODE), 3);
                aVar.mo2481c(new C6956a(C0590n.m1678s(t)));
            }
            arrayList.add(CallbackToFutureAdapter.m1884a(new C7065j0(0, cVar, aVar)));
            arrayList2.add(aVar.mo2482d());
        }
        cVar.f21926c.mo23337p(arrayList2);
        return C5023g.m12854b(arrayList);
    }
}
