package p176n0;

import android.view.Surface;
import android.view.ViewGroup;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.C0658c;
import androidx.camera.view.C0663e;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import java.util.logging.Logger;
import mc0.C12912d;
import mf0.C24362h;
import p011aa.C0137a;
import p011aa.C0138b;
import p054d0.C4289j0;
import p237r9.C6274g;
import p275u9.C6743n;
import p275u9.C6751s;
import p288v9.C6885k;
import p695od.C18728c;
import yb0.C13295d;

/* renamed from: n0.m */
public final /* synthetic */ class C5794m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18742b;

    /* renamed from: c */
    public final /* synthetic */ Object f18743c;

    /* renamed from: d */
    public final /* synthetic */ Object f18744d;

    /* renamed from: e */
    public final /* synthetic */ Object f18745e;

    /* renamed from: f */
    public final /* synthetic */ Object f18746f;

    public /* synthetic */ C5794m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18742b = i;
        this.f18743c = obj;
        this.f18744d = obj2;
        this.f18745e = obj3;
        this.f18746f = obj4;
    }

    public final void run() {
        switch (this.f18742b) {
            case 0:
                C0663e eVar = (C0663e) this.f18743c;
                Surface surface = (Surface) this.f18744d;
                C18728c cVar = (C18728c) this.f18745e;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f18746f;
                eVar.getClass();
                C4289j0.m11435b("TextureViewImpl");
                C0658c.C0659a aVar = eVar.f2284l;
                if (aVar != null) {
                    ((C5789h) aVar).mo21664a();
                    eVar.f2284l = null;
                }
                surface.release();
                if (eVar.f2279g == cVar) {
                    eVar.f2279g = null;
                }
                if (eVar.f2280h == surfaceRequest) {
                    eVar.f2280h = null;
                    return;
                }
                return;
            case 1:
                C12912d dVar = (C12912d) this.f18744d;
                ViewGroup viewGroup = (ViewGroup) this.f18745e;
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f18746f;
                UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
                C24362h.m61211f((C13295d) this.f18743c, "$bAdHandler");
                C24362h.m61211f(dVar, "$bannerInfo");
                C24362h.m61211f(viewGroup, "$it");
                C24362h.m61211f(uMOAdKitBannerView, "this$0");
                C13295d.m33435O(dVar, viewGroup);
                UMOAdKitBannerView.m5802h(uMOAdKitBannerView, false);
                return;
            default:
                C0138b bVar = (C0138b) this.f18743c;
                C6751s sVar = (C6751s) this.f18744d;
                C6274g gVar = (C6274g) this.f18745e;
                C6743n nVar = (C6743n) this.f18746f;
                Logger logger = C0138b.f397f;
                bVar.getClass();
                try {
                    C6885k kVar = bVar.f400c.get(sVar.mo22910b());
                    if (kVar == null) {
                        String format = String.format("Transport backend '%s' is not registered", new Object[]{sVar.mo22910b()});
                        C0138b.f397f.warning(format);
                        gVar.mo21004d(new IllegalArgumentException(format));
                        return;
                    }
                    bVar.f402e.mo6658a(new C0137a(bVar, sVar, kVar.mo22594a(nVar)));
                    gVar.mo21004d((Exception) null);
                    return;
                } catch (Exception e) {
                    Logger logger2 = C0138b.f397f;
                    StringBuilder k = C13555b.m33972k("Error scheduling event ");
                    k.append(e.getMessage());
                    logger2.warning(k.toString());
                    gVar.mo21004d(e);
                    return;
                }
        }
    }
}
