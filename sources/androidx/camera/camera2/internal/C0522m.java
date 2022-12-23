package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.activity.C0199g;
import androidx.camera.camera2.internal.C0520l;
import androidx.camera.camera2.internal.C0525o;
import androidx.camera.core.impl.C0583g;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import mf0.C24361g;
import p102h0.C5018c;
import p102h0.C5019d;
import p102h0.C5023g;
import p102h0.C5028j;
import p304x.C7041e;
import p304x.C7089p1;
import p304x.C7096q1;
import p316y.C7208f;
import p316y.C7226t;
import p327z.C7372g;
import p695od.C18728c;

/* renamed from: androidx.camera.camera2.internal.m */
public class C0522m extends C0520l.C0521a implements C0520l, C0525o.C0527b {

    /* renamed from: a */
    public final Object f1800a = new Object();

    /* renamed from: b */
    public final C0516i f1801b;

    /* renamed from: c */
    public final Handler f1802c;

    /* renamed from: d */
    public final Executor f1803d;

    /* renamed from: e */
    public final ScheduledExecutorService f1804e;

    /* renamed from: f */
    public C0520l.C0521a f1805f;

    /* renamed from: g */
    public C7208f f1806g;

    /* renamed from: h */
    public CallbackToFutureAdapter.C0675c f1807h;

    /* renamed from: i */
    public CallbackToFutureAdapter.C0673a<Void> f1808i;

    /* renamed from: j */
    public C5019d f1809j;

    /* renamed from: k */
    public List<DeferrableSurface> f1810k = null;

    /* renamed from: l */
    public boolean f1811l = false;

    /* renamed from: m */
    public boolean f1812m = false;

    /* renamed from: n */
    public boolean f1813n = false;

    /* renamed from: androidx.camera.camera2.internal.m$a */
    public class C0523a implements C5018c<Void> {
        public C0523a() {
        }

        public final void onFailure(Throwable th) {
            C0522m.this.mo2343n();
            C0522m mVar = C0522m.this;
            C0516i iVar = mVar.f1801b;
            iVar.mo2320a(mVar);
            synchronized (iVar.f1788b) {
                iVar.f1791e.remove(mVar);
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public C0522m(C0516i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f1801b = iVar;
        this.f1802c = handler;
        this.f1803d = executor;
        this.f1804e = scheduledExecutorService;
    }

    /* renamed from: a */
    public C18728c mo2340a(ArrayList arrayList) {
        synchronized (this.f1800a) {
            if (this.f1812m) {
                C5028j.C5029a aVar = new C5028j.C5029a(new CancellationException("Opener is disabled"));
                return aVar;
            }
            C5019d c = C5019d.m12842a(C0583g.m1629b(arrayList, this.f1803d, this.f1804e)).mo20734c(new C7089p1(this, arrayList), this.f1803d);
            this.f1809j = c;
            C18728c f = C5023g.m12858f(c);
            return f;
        }
    }

    /* renamed from: b */
    public C18728c<Void> mo2341b(CameraDevice cameraDevice, C7372g gVar, List<DeferrableSurface> list) {
        synchronized (this.f1800a) {
            if (this.f1812m) {
                C5028j.C5029a aVar = new C5028j.C5029a(new CancellationException("Opener is disabled"));
                return aVar;
            }
            C0516i iVar = this.f1801b;
            synchronized (iVar.f1788b) {
                iVar.f1791e.add(this);
            }
            CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C7096q1(this, (List) list, new C7226t(cameraDevice, this.f1802c), gVar));
            this.f1807h = a;
            C5023g.m12853a(a, new C0523a(), C14226d.m35352s0());
            C18728c<Void> f = C5023g.m12858f(this.f1807h);
            return f;
        }
    }

    /* renamed from: c */
    public final int mo2327c(ArrayList arrayList, C0513g gVar) throws CameraAccessException {
        C24361g.m61185s(this.f1806g, "Need to call openCaptureSession before using this API.");
        C7208f fVar = this.f1806g;
        return fVar.f22333a.mo23508a(arrayList, this.f1803d, gVar);
    }

    public void close() {
        C24361g.m61185s(this.f1806g, "Need to call openCaptureSession before using this API.");
        C0516i iVar = this.f1801b;
        synchronized (iVar.f1788b) {
            iVar.f1790d.add(this);
        }
        this.f1806g.f22333a.f22370a.close();
        this.f1803d.execute(new C0199g(this, 2));
    }

    /* renamed from: d */
    public C18728c<Void> mo2329d() {
        return C5023g.m12857e((Object) null);
    }

    /* renamed from: e */
    public final void mo2336e(C0522m mVar) {
        this.f1805f.mo2336e(mVar);
    }

    /* renamed from: f */
    public final void mo2337f(C0522m mVar) {
        this.f1805f.mo2337f(mVar);
    }

    public final void finishClose() {
        mo2343n();
    }

    /* renamed from: g */
    public void mo2338g(C0520l lVar) {
        CallbackToFutureAdapter.C0675c cVar;
        synchronized (this.f1800a) {
            try {
                if (!this.f1811l) {
                    this.f1811l = true;
                    C24361g.m61185s(this.f1807h, "Need to call openCaptureSession before using this API.");
                    cVar = this.f1807h;
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        mo2343n();
        if (cVar != null) {
            cVar.f2322c.addListener(new C0509c(1, this, lVar), C14226d.m35352s0());
        }
    }

    public final CameraDevice getDevice() {
        this.f1806g.getClass();
        return this.f1806g.mo23507a().getDevice();
    }

    public final C0522m getStateCallback() {
        return this;
    }

    /* renamed from: h */
    public final void mo2298h(C0520l lVar) {
        mo2343n();
        C0516i iVar = this.f1801b;
        iVar.mo2320a(this);
        synchronized (iVar.f1788b) {
            iVar.f1791e.remove(this);
        }
        this.f1805f.mo2298h(lVar);
    }

    /* renamed from: i */
    public void mo2299i(C0522m mVar) {
        C0516i iVar = this.f1801b;
        synchronized (iVar.f1788b) {
            iVar.f1789c.add(this);
            iVar.f1791e.remove(this);
        }
        iVar.mo2320a(this);
        this.f1805f.mo2299i(mVar);
    }

    /* renamed from: j */
    public final void mo2300j(C0522m mVar) {
        this.f1805f.mo2300j(mVar);
    }

    /* renamed from: k */
    public final void mo2301k(C0520l lVar) {
        CallbackToFutureAdapter.C0675c cVar;
        synchronized (this.f1800a) {
            try {
                if (!this.f1813n) {
                    this.f1813n = true;
                    C24361g.m61185s(this.f1807h, "Need to call openCaptureSession before using this API.");
                    cVar = this.f1807h;
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (cVar != null) {
            cVar.f2322c.addListener(new C7041e(3, this, lVar), C14226d.m35352s0());
        }
    }

    /* renamed from: l */
    public final void mo2339l(C0522m mVar, Surface surface) {
        this.f1805f.mo2339l(mVar, surface);
    }

    /* renamed from: m */
    public final void mo2342m(CameraCaptureSession cameraCaptureSession) {
        if (this.f1806g == null) {
            this.f1806g = new C7208f(cameraCaptureSession, this.f1802c);
        }
    }

    /* renamed from: n */
    public final void mo2343n() {
        synchronized (this.f1800a) {
            List<DeferrableSurface> list = this.f1810k;
            if (list != null) {
                for (DeferrableSurface b : list) {
                    b.mo2451b();
                }
                this.f1810k = null;
            }
        }
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C24361g.m61185s(this.f1806g, "Need to call openCaptureSession before using this API.");
        C7208f fVar = this.f1806g;
        return fVar.f22333a.setSingleRepeatingRequest(captureRequest, this.f1803d, captureCallback);
    }

    public boolean stop() {
        boolean z;
        boolean z2;
        C5019d dVar = null;
        try {
            synchronized (this.f1800a) {
                if (!this.f1812m) {
                    C5019d dVar2 = this.f1809j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f1812m = true;
                }
                synchronized (this.f1800a) {
                    z = false;
                    if (this.f1807h != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    z = true;
                }
            }
            return z;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final void stopRepeating() throws CameraAccessException {
        C24361g.m61185s(this.f1806g, "Need to call openCaptureSession before using this API.");
        this.f1806g.f22333a.f22370a.stopRepeating();
    }

    public final C7208f toCameraCaptureSessionCompat() {
        this.f1806g.getClass();
        return this.f1806g;
    }
}
