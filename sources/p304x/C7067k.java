package p304x;

import android.content.Context;
import com.appboy.Appboy;
import com.facebook.appevents.p047ml.ModelManager;
import com.facebook.internal.C2427r;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.core.ImageCapture;
import java.util.ArrayList;
import p009a8.C0115o;
import p110h8.C5139c;
import p110h8.C5147f;
import p123i8.C5305a;
import p262t8.C6606a;

/* renamed from: x.k */
public final /* synthetic */ class C7067k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21979b;

    public /* synthetic */ C7067k(int i) {
        this.f21979b = i;
    }

    public final void run() {
        Class<C5305a> cls;
        switch (this.f21979b) {
            case 0:
                return;
            case 1:
                Appboy.m5427l();
                return;
            case 2:
                Context a = C0115o.m210a();
                C5147f fVar = C5147f.f17185a;
                ArrayList<String> f = C5147f.m13044f(a, C5139c.f17155h);
                if (f.isEmpty()) {
                    Object obj = C5139c.f17155h;
                    Class<C5147f> cls2 = C5147f.class;
                    if (!C6606a.m15601b(cls2)) {
                        try {
                            ArrayList<String> arrayList = new ArrayList<>();
                            if (obj != null) {
                                C5147f fVar2 = C5147f.f17185a;
                                Class<?> b = fVar2.mo20869b(a, "com.android.vending.billing.IInAppBillingService");
                                if (b != null) {
                                    if (fVar2.mo20870c(b, "getPurchaseHistory") != null) {
                                        f = fVar2.mo20868a(fVar2.mo20871d(a, obj));
                                    }
                                }
                            }
                            f = arrayList;
                        } catch (Throwable th) {
                            C6606a.m15600a(cls2, th);
                        }
                    }
                    f = null;
                }
                C5139c.m13030a(C5139c.f17148a, a, f, false);
                return;
            case 3:
                ModelManager modelManager = ModelManager.f8546a;
                Class<ModelManager> cls3 = ModelManager.class;
                if (!C6606a.m15601b(cls3)) {
                    try {
                        C5305a aVar = C5305a.f17485a;
                        cls = C5305a.class;
                        if (!C6606a.m15601b(cls)) {
                            C5305a.f17486b = true;
                            C2427r rVar = C2427r.f8702a;
                            C5305a.f17487c = C2427r.m6380b("FBSDKFeatureIntegritySample", C0115o.m211b(), false);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C6606a.m15600a(cls3, th2);
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                Camera2CameraControlImpl.lambda$clearInteropConfig$2();
                return;
            default:
                ImageCapture.lambda$closeTorch$16();
                return;
        }
    }
}
