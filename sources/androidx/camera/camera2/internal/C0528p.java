package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.C0520l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p304x.C7098r0;
import p304x.C7101s0;
import p316y.C7200b;
import p316y.C7204d;

/* renamed from: androidx.camera.camera2.internal.p */
public final class C0528p extends C0520l.C0521a {

    /* renamed from: a */
    public final ArrayList f1824a;

    /* renamed from: androidx.camera.camera2.internal.p$a */
    public static class C0529a extends C0520l.C0521a {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f1825a;

        public C0529a(List<CameraCaptureSession.StateCallback> list) {
            CameraCaptureSession.StateCallback stateCallback;
            if (list.isEmpty()) {
                stateCallback = new C7101s0();
            } else if (list.size() == 1) {
                stateCallback = list.get(0);
            } else {
                stateCallback = new C7098r0(list);
            }
            this.f1825a = stateCallback;
        }

        /* renamed from: e */
        public final void mo2336e(C0522m mVar) {
            this.f1825a.onActive(mVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: f */
        public final void mo2337f(C0522m mVar) {
            C7204d.m16813b(this.f1825a, mVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: g */
        public final void mo2338g(C0520l lVar) {
            this.f1825a.onClosed(lVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: h */
        public final void mo2298h(C0520l lVar) {
            this.f1825a.onConfigureFailed(lVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: i */
        public final void mo2299i(C0522m mVar) {
            this.f1825a.onConfigured(mVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: j */
        public final void mo2300j(C0522m mVar) {
            this.f1825a.onReady(mVar.toCameraCaptureSessionCompat().f22333a.f22370a);
        }

        /* renamed from: k */
        public final void mo2301k(C0520l lVar) {
        }

        /* renamed from: l */
        public final void mo2339l(C0522m mVar, Surface surface) {
            C7200b.m16805a(this.f1825a, mVar.toCameraCaptureSessionCompat().f22333a.f22370a, surface);
        }
    }

    public C0528p(List<C0520l.C0521a> list) {
        ArrayList arrayList = new ArrayList();
        this.f1824a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: e */
    public final void mo2336e(C0522m mVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2336e(mVar);
        }
    }

    /* renamed from: f */
    public final void mo2337f(C0522m mVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2337f(mVar);
        }
    }

    /* renamed from: g */
    public final void mo2338g(C0520l lVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2338g(lVar);
        }
    }

    /* renamed from: h */
    public final void mo2298h(C0520l lVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2298h(lVar);
        }
    }

    /* renamed from: i */
    public final void mo2299i(C0522m mVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2299i(mVar);
        }
    }

    /* renamed from: j */
    public final void mo2300j(C0522m mVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2300j(mVar);
        }
    }

    /* renamed from: k */
    public final void mo2301k(C0520l lVar) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2301k(lVar);
        }
    }

    /* renamed from: l */
    public final void mo2339l(C0522m mVar, Surface surface) {
        Iterator it = this.f1824a.iterator();
        while (it.hasNext()) {
            ((C0520l.C0521a) it.next()).mo2339l(mVar, surface);
        }
    }
}
