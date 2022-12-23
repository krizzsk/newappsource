package p304x;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import androidx.camera.core.C0548d;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.C0658c;
import androidx.camera.view.C0663e;
import com.appboy.Appboy;
import com.appboy.lrucache.AppboyLruImageLoader;
import com.google.android.exoplayer2.drm.C3912b;
import com.moovit.app.home.dashboard.C14940f;
import com.moovit.app.home.dashboard.C14946k;
import com.moovit.app.useraccount.ConnectPopUpActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import fc0.C12669a;
import fc0.C12675e;
import java.util.List;
import jc0.C12804b;
import kc0.C12844i;
import mf0.C24362h;
import p030bo.app.C1602i2;
import p030bo.app.C1695t3;
import p066e0.C4424e;
import p066e0.C4428g;
import p176n0.C5789h;
import p229r1.C6231a;
import p316y.C7197a0;
import p316y.C7208f;
import p316y.C7226t;

/* renamed from: x.p */
public final /* synthetic */ class C7087p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22029b;

    /* renamed from: c */
    public final /* synthetic */ Object f22030c;

    /* renamed from: d */
    public final /* synthetic */ Object f22031d;

    public /* synthetic */ C7087p(int i, Object obj, Object obj2) {
        this.f22029b = i;
        this.f22030c = obj;
        this.f22031d = obj2;
    }

    public final void run() {
        C12675e eVar;
        Class<ConnectPopUpActivity> cls = ConnectPopUpActivity.class;
        switch (this.f22029b) {
            case 0:
                ((C4424e) this.f22030c).mo2570b((C4428g) this.f22031d);
                return;
            case 1:
                ((C7208f.C7211c) this.f22030c).f22336a.onConfigured((CameraCaptureSession) this.f22031d);
                return;
            case 2:
                ((C7226t.C7228b) this.f22030c).f22377a.onDisconnected((CameraDevice) this.f22031d);
                return;
            case 3:
                ((C7197a0.C7198a) this.f22030c).f22326b.onCameraUnavailable((String) this.f22031d);
                return;
            case 4:
                ((C6231a) this.f22030c).accept(new C0548d(3, (Surface) this.f22031d));
                return;
            case 5:
                C0663e eVar2 = (C0663e) this.f22030c;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f22031d;
                SurfaceRequest surfaceRequest2 = eVar2.f2280h;
                if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
                    eVar2.f2280h = null;
                    eVar2.f2279g = null;
                }
                C0658c.C0659a aVar = eVar2.f2284l;
                if (aVar != null) {
                    ((C5789h) aVar).mo21664a();
                    eVar2.f2284l = null;
                    return;
                }
                return;
            case 6:
                ((C1695t3) this.f22030c).m4763b((List) this.f22031d);
                return;
            case 7:
                ((Appboy) this.f22030c).m5400b((C1602i2) this.f22031d);
                return;
            case 8:
                ((AppboyLruImageLoader.C1980c) this.f22030c).m5444a((Bitmap) this.f22031d);
                return;
            case 9:
                C3912b.C3913a aVar2 = (C3912b.C3913a) this.f22030c;
                ((C3912b) this.f22031d).mo15995R(aVar2.f13725a, aVar2.f13726b);
                return;
            case 10:
                C14940f fVar = (C14940f) this.f22030c;
                int i = C14940f.f38219G;
                fVar.getClass();
                int i2 = ConnectPopUpActivity.f40551l0;
                fVar.startActivity(new Intent((Context) this.f22031d, cls));
                return;
            case 11:
                C14946k kVar = (C14946k) this.f22030c;
                int i3 = C14946k.f38246t;
                kVar.getClass();
                int i4 = ConnectPopUpActivity.f40551l0;
                kVar.startActivity(new Intent((Context) this.f22031d, cls));
                return;
            default:
                C12844i iVar = (C12844i) this.f22030c;
                String str = (String) this.f22031d;
                int i5 = C12844i.f31735I;
                C24362h.m61211f(iVar, "this$0");
                iVar.f31762t = true;
                String str2 = iVar.f31744b;
                Context context = iVar.getContext();
                C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
                C12675e eVar3 = new C12675e(context, str2);
                iVar.f31765w = eVar3;
                eVar3.setHandler(iVar.f31757o);
                iVar.f31764v = false;
                String str3 = iVar.f31744b;
                C12675e eVar4 = iVar.f31765w;
                C24362h.m61208c(eVar4);
                C12844i.C12846b bVar = iVar.f31758p;
                C24362h.m61208c(bVar);
                iVar.f31763u = new C12669a(str3, eVar4, bVar);
                if (!(str == null || (eVar = iVar.f31765w) == null)) {
                    eVar.loadUrl(str);
                }
                C12804b bVar2 = new C12804b(iVar.getContext(), iVar.f31750h, iVar.f31751i, iVar.f31753k, iVar);
                iVar.f31759q = bVar2;
                C12675e eVar5 = iVar.f31765w;
                C24362h.m61208c(eVar5);
                C12804b.m32607c(bVar2, eVar5);
                C12804b bVar3 = iVar.f31759q;
                if (bVar3 != null) {
                    bVar3.show();
                    return;
                }
                return;
        }
    }
}
