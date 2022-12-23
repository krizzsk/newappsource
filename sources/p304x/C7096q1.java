package p304x;

import androidx.camera.camera2.internal.C0522m;
import androidx.camera.core.impl.C0583g;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.List;
import mf0.C24361g;
import p316y.C7226t;
import p327z.C7372g;

/* renamed from: x.q1 */
public final /* synthetic */ class C7096q1 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ int f22064b = 0;

    /* renamed from: c */
    public final /* synthetic */ List f22065c;

    /* renamed from: d */
    public final /* synthetic */ Object f22066d;

    /* renamed from: e */
    public final /* synthetic */ Object f22067e;

    /* renamed from: f */
    public final /* synthetic */ Object f22068f;

    public /* synthetic */ C7096q1(C0522m mVar, List list, C7226t tVar, C7372g gVar) {
        this.f22066d = mVar;
        this.f22065c = list;
        this.f22067e = tVar;
        this.f22068f = gVar;
    }

    public /* synthetic */ C7096q1(ImageCapture imageCapture, CaptureConfig.Builder builder, ArrayList arrayList, CaptureStage captureStage) {
        this.f22066d = imageCapture;
        this.f22067e = builder;
        this.f22065c = arrayList;
        this.f22068f = captureStage;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        boolean z;
        String str;
        switch (this.f22064b) {
            case 0:
                C0522m mVar = (C0522m) this.f22066d;
                List<DeferrableSurface> list = this.f22065c;
                C7226t tVar = (C7226t) this.f22067e;
                C7372g gVar = (C7372g) this.f22068f;
                synchronized (mVar.f1800a) {
                    synchronized (mVar.f1800a) {
                        mVar.mo2343n();
                        C0583g.m1628a(list);
                        mVar.f1810k = list;
                    }
                    if (mVar.f1808i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24361g.m61193w("The openCaptureSessionCompleter can only set once!", z);
                    mVar.f1808i = aVar;
                    tVar.f22376a.mo23533a(gVar);
                    str = "openCaptureSession[session=" + mVar + "]";
                }
                return str;
            default:
                return ((ImageCapture) this.f22066d).lambda$issueTakePicture$19((CaptureConfig.Builder) this.f22067e, this.f22065c, (CaptureStage) this.f22068f, aVar);
        }
    }
}
