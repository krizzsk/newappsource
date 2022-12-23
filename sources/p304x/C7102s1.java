package p304x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.C0516i;
import androidx.camera.camera2.internal.C0520l;
import androidx.camera.camera2.internal.C0522m;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p019b0.C1427d;
import p019b0.C1428e;
import p019b0.C1438o;
import p054d0.C4289j0;
import p066e0.C4436j0;
import p102h0.C5019d;
import p102h0.C5023g;
import p327z.C7372g;
import p373au.C13533e;
import p695od.C18728c;

/* renamed from: x.s1 */
public final class C7102s1 extends C0522m {

    /* renamed from: o */
    public final Object f22081o = new Object();

    /* renamed from: p */
    public List<DeferrableSurface> f22082p;

    /* renamed from: q */
    public C5019d f22083q;

    /* renamed from: r */
    public final C1428e f22084r;

    /* renamed from: s */
    public final C1438o f22085s;

    /* renamed from: t */
    public final C1427d f22086t;

    public C7102s1(Handler handler, C0516i iVar, C4436j0 j0Var, C4436j0 j0Var2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(iVar, executor, scheduledExecutorService, handler);
        this.f22084r = new C1428e(j0Var, j0Var2);
        this.f22085s = new C1438o(j0Var);
        this.f22086t = new C1427d(j0Var2);
    }

    /* renamed from: o */
    public static void m16642o(C7102s1 s1Var) {
        s1Var.getClass();
        C4289j0.m11435b("SyncCaptureSessionImpl");
        super.close();
    }

    /* renamed from: a */
    public final C18728c mo2340a(ArrayList arrayList) {
        C18728c a;
        synchronized (this.f22081o) {
            this.f22082p = arrayList;
            a = super.mo2340a(arrayList);
        }
        return a;
    }

    /* renamed from: b */
    public final C18728c<Void> mo2341b(CameraDevice cameraDevice, C7372g gVar, List<DeferrableSurface> list) {
        ArrayList arrayList;
        C18728c<Void> f;
        synchronized (this.f22081o) {
            C1438o oVar = this.f22085s;
            C0516i iVar = this.f1801b;
            synchronized (iVar.f1788b) {
                arrayList = new ArrayList(iVar.f1790d);
            }
            C7071l0 l0Var = new C7071l0(this, 1);
            oVar.getClass();
            C5019d a = C1438o.m3824a(cameraDevice, gVar, l0Var, list, arrayList);
            this.f22083q = a;
            f = C5023g.m12858f(a);
        }
        return f;
    }

    public final void close() {
        C4289j0.m11435b("SyncCaptureSessionImpl");
        C1438o oVar = this.f22085s;
        synchronized (oVar.f5294b) {
            if (oVar.f5293a && !oVar.f5297e) {
                oVar.f5295c.cancel(true);
            }
        }
        C5023g.m12858f(this.f22085s.f5295c).addListener(new C7099r1(this, 0), this.f1803d);
    }

    /* renamed from: d */
    public final C18728c<Void> mo2329d() {
        return C5023g.m12858f(this.f22085s.f5295c);
    }

    /* renamed from: g */
    public final void mo2338g(C0520l lVar) {
        synchronized (this.f22081o) {
            this.f22084r.mo5767a(this.f22082p);
        }
        C4289j0.m11435b("SyncCaptureSessionImpl");
        super.mo2338g(lVar);
    }

    /* renamed from: i */
    public final void mo2299i(C0522m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        C0520l lVar;
        C0520l lVar2;
        C4289j0.m11435b("SyncCaptureSessionImpl");
        C1427d dVar = this.f22086t;
        C0516i iVar = this.f1801b;
        synchronized (iVar.f1788b) {
            arrayList = new ArrayList(iVar.f1791e);
        }
        C0516i iVar2 = this.f1801b;
        synchronized (iVar2.f1788b) {
            arrayList2 = new ArrayList(iVar2.f1789c);
        }
        boolean z2 = true;
        C13533e eVar = new C13533e(this, 1);
        if (dVar.f5274a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinkedHashSet<C0520l> linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (lVar2 = (C0520l) it.next()) != mVar) {
                linkedHashSet.add(lVar2);
            }
            for (C0520l lVar3 : linkedHashSet) {
                lVar3.getStateCallback().mo2298h(lVar3);
            }
        }
        eVar.mo40420d(mVar);
        if (dVar.f5274a == null) {
            z2 = false;
        }
        if (z2) {
            LinkedHashSet<C0520l> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext() && (lVar = (C0520l) it2.next()) != mVar) {
                linkedHashSet2.add(lVar);
            }
            for (C0520l lVar4 : linkedHashSet2) {
                lVar4.getStateCallback().mo2338g(lVar4);
            }
        }
    }

    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int singleRepeatingRequest;
        C1438o oVar = this.f22085s;
        synchronized (oVar.f5294b) {
            if (oVar.f5293a) {
                C7024a0 a0Var = new C7024a0(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{oVar.f5298f, captureCallback}));
                oVar.f5297e = true;
                captureCallback = a0Var;
            }
            singleRepeatingRequest = super.setSingleRepeatingRequest(captureRequest, captureCallback);
        }
        return singleRepeatingRequest;
    }

    public final boolean stop() {
        boolean z;
        boolean stop;
        synchronized (this.f22081o) {
            synchronized (this.f1800a) {
                if (this.f1807h != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f22084r.mo5767a(this.f22082p);
            } else {
                C5019d dVar = this.f22083q;
                if (dVar != null) {
                    dVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
