package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.appcompat.widget.C0436m1;
import androidx.appcompat.widget.C0441n1;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.C0556i;
import androidx.camera.core.C0612l;
import androidx.camera.core.C0631r;
import androidx.camera.core.impl.C0583g;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import com.google.android.play.core.appupdate.C14226d;
import java.util.List;
import java.util.Objects;
import mf0.C24361g;
import p054d0.C4289j0;
import p066e0.C4418c;
import p102h0.C5015a;
import p102h0.C5023g;
import p102h0.C5028j;
import p304x.C7081n1;
import p695od.C18728c;

/* renamed from: androidx.camera.camera2.internal.j */
public final /* synthetic */ class C0518j implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ ProcessingCaptureSession f1794a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f1795b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f1796c;

    /* renamed from: d */
    public final /* synthetic */ C0525o f1797d;

    public /* synthetic */ C0518j(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, C0525o oVar) {
        this.f1794a = processingCaptureSession;
        this.f1795b = sessionConfig;
        this.f1796c = cameraDevice;
        this.f1797d = oVar;
    }

    public final C18728c apply(Object obj) {
        C18728c f;
        ProcessingCaptureSession processingCaptureSession = this.f1794a;
        SessionConfig sessionConfig = this.f1795b;
        CameraDevice cameraDevice = this.f1796c;
        C0525o oVar = this.f1797d;
        List list = (List) obj;
        processingCaptureSession.getClass();
        C4289j0.m11435b("ProcessingCaptureSession");
        if (processingCaptureSession.f1756j == ProcessingCaptureSession.ProcessorState.CLOSED) {
            return new C5028j.C5029a(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        if (list.contains((Object) null)) {
            f = new C5028j.C5029a(new DeferrableSurface.SurfaceClosedException(sessionConfig.mo2457b().get(list.indexOf((Object) null)), "Surface closed"));
        } else {
            try {
                C0583g.m1628a(processingCaptureSession.f1751e);
                boolean z = false;
                for (int i = 0; i < sessionConfig.mo2457b().size(); i++) {
                    DeferrableSurface deferrableSurface = sessionConfig.mo2457b().get(i);
                    if (Objects.equals(deferrableSurface.f1931h, C0631r.class)) {
                        new C4418c(deferrableSurface.mo2452c().get(), new Size(deferrableSurface.f1929f.getWidth(), deferrableSurface.f1929f.getHeight()), deferrableSurface.f1930g);
                    } else if (Objects.equals(deferrableSurface.f1931h, C0612l.class)) {
                        new C4418c(deferrableSurface.mo2452c().get(), new Size(deferrableSurface.f1929f.getWidth(), deferrableSurface.f1929f.getHeight()), deferrableSurface.f1930g);
                    } else if (Objects.equals(deferrableSurface.f1931h, C0556i.class)) {
                        new C4418c(deferrableSurface.mo2452c().get(), new Size(deferrableSurface.f1929f.getWidth(), deferrableSurface.f1929f.getHeight()), deferrableSurface.f1930g);
                    }
                }
                processingCaptureSession.f1756j = ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED;
                C4289j0.m11435b("ProcessingCaptureSession");
                SessionConfig d = processingCaptureSession.f1747a.mo19968d();
                processingCaptureSession.f1754h = d;
                d.mo2457b().get(0).mo2453d().addListener(new C0436m1(processingCaptureSession, 1), C14226d.m35352s0());
                for (DeferrableSurface next : processingCaptureSession.f1754h.mo2457b()) {
                    ProcessingCaptureSession.f1745o.add(next);
                    next.mo2453d().addListener(new C0441n1(next, 2), processingCaptureSession.f1748b);
                }
                SessionConfig.C0569e eVar = new SessionConfig.C0569e();
                eVar.mo2463a(sessionConfig);
                eVar.f1939a.clear();
                eVar.f1940b.f1977a.clear();
                eVar.mo2463a(processingCaptureSession.f1754h);
                if (eVar.f1949j && eVar.f1948i) {
                    z = true;
                }
                C24361g.m61177o(z, "Cannot transform the SessionConfig");
                SessionConfig b = eVar.mo2464b();
                CaptureSession captureSession = processingCaptureSession.f1750d;
                cameraDevice.getClass();
                f = captureSession.mo2290f(b, cameraDevice, oVar);
                C5023g.m12853a(f, new C7081n1(processingCaptureSession), processingCaptureSession.f1748b);
            } catch (DeferrableSurface.SurfaceClosedException e) {
                return new C5028j.C5029a(e);
            }
        }
        return f;
    }
}
