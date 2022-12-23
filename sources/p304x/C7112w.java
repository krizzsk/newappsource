package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import com.appboy.Appboy;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12952c;
import p030bo.app.C1546c0;
import p316y.C7200b;
import p316y.C7208f;
import yb0.C13295d;

/* renamed from: x.w */
public final /* synthetic */ class C7112w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22103b;

    /* renamed from: c */
    public final /* synthetic */ Object f22104c;

    /* renamed from: d */
    public final /* synthetic */ Object f22105d;

    /* renamed from: e */
    public final /* synthetic */ Object f22106e;

    public /* synthetic */ C7112w(int i, Object obj, Object obj2, Object obj3) {
        this.f22103b = i;
        this.f22104c = obj;
        this.f22105d = obj2;
        this.f22106e = obj3;
    }

    public final void run() {
        switch (this.f22103b) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.f22104c;
                String str = (String) this.f22105d;
                camera2CameraImpl.getClass();
                camera2CameraImpl.mo2251j("Use case " + str + " UPDATED");
                camera2CameraImpl.f1685b.mo2507d(str, (SessionConfig) this.f22106e);
                camera2CameraImpl.mo2234A();
                return;
            case 1:
                C7200b.m16805a(((C7208f.C7211c) this.f22104c).f22336a, (CameraCaptureSession) this.f22105d, (Surface) this.f22106e);
                return;
            case 2:
                ((Appboy) this.f22104c).m5389a((String) this.f22105d, (C1546c0) this.f22106e);
                return;
            default:
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f22104c;
                C12912d dVar = (C12912d) this.f22106e;
                C24362h.m61211f((C13295d) this.f22105d, "this$0");
                C24362h.m61211f(dVar, "$bannerInfo");
                if (uMOAdKitBannerView != null) {
                    C12952c.m32797g(uMOAdKitBannerView);
                }
                ViewGroup viewGroup = dVar.f31973i;
                C24362h.m61208c(viewGroup);
                C13295d.m33435O(dVar, viewGroup);
                return;
        }
    }
}
