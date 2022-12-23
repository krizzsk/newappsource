package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.CameraX;
import com.veriff.sdk.camera.lifecycle.ProcessCameraProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mf0.C24361g;
import p066e0.C4442l0;
import p227r.C6227a;
import p269u2.C6678b;

/* renamed from: androidx.camera.camera2.internal.k */
public final /* synthetic */ class C0519k implements C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f1798b;

    /* renamed from: c */
    public final /* synthetic */ Object f1799c;

    public /* synthetic */ C0519k(Object obj, int i) {
        this.f1798b = i;
        this.f1799c = obj;
    }

    public final Object apply(Object obj) {
        boolean z;
        switch (this.f1798b) {
            case 0:
                ProcessingCaptureSession processingCaptureSession = (ProcessingCaptureSession) this.f1799c;
                Void voidR = (Void) obj;
                CaptureSession captureSession = processingCaptureSession.f1750d;
                if (processingCaptureSession.f1756j == ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder k = C13555b.m33972k("Invalid state state:");
                k.append(processingCaptureSession.f1756j);
                C24361g.m61177o(z, k.toString());
                List<DeferrableSurface> b = processingCaptureSession.f1754h.mo2457b();
                ArrayList arrayList = new ArrayList();
                for (DeferrableSurface next : b) {
                    C24361g.m61177o(next instanceof C4442l0, "Surface must be SessionProcessorSurface");
                    arrayList.add((C4442l0) next);
                }
                processingCaptureSession.f1753g = new C0512f(captureSession, arrayList);
                processingCaptureSession.f1747a.mo19969e();
                processingCaptureSession.f1756j = ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED;
                SessionConfig sessionConfig = processingCaptureSession.f1752f;
                if (sessionConfig != null) {
                    processingCaptureSession.mo2289e(sessionConfig);
                }
                if (processingCaptureSession.f1757k != null) {
                    List asList = Arrays.asList(new C0578e[]{processingCaptureSession.f1757k});
                    processingCaptureSession.f1757k = null;
                    processingCaptureSession.mo2284a(asList);
                }
                return null;
            case 1:
                ((C6678b) obj).execSQL((String) this.f1799c);
                return null;
            default:
                return ProcessCameraProvider.lambda$getInstance$0((Context) this.f1799c, (CameraX) obj);
        }
    }
}
