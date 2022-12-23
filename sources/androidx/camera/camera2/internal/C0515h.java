package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.C0520l;
import androidx.camera.camera2.internal.C0528p;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import p054d0.C4289j0;
import p102h0.C5015a;
import p102h0.C5028j;
import p291w.C6956a;
import p291w.C6958b;
import p291w.C6959c;
import p304x.C7079n0;
import p327z.C7363b;
import p327z.C7372g;
import p695od.C18728c;

/* renamed from: androidx.camera.camera2.internal.h */
public final /* synthetic */ class C0515h implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f1784a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f1785b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f1786c;

    public /* synthetic */ C0515h(CaptureSession captureSession, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        this.f1784a = captureSession;
        this.f1785b = sessionConfig;
        this.f1786c = cameraDevice;
    }

    public final C18728c apply(Object obj) {
        C18728c<Void> cVar;
        CaptureRequest captureRequest;
        CaptureSession captureSession = this.f1784a;
        SessionConfig sessionConfig = this.f1785b;
        CameraDevice cameraDevice = this.f1786c;
        List list = (List) obj;
        synchronized (captureSession.f1727a) {
            int i = CaptureSession.C0503c.f1743a[captureSession.f1738l.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    captureSession.f1736j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        captureSession.f1736j.put(captureSession.f1737k.get(i2), (Surface) list.get(i2));
                    }
                    ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
                    captureSession.f1738l = CaptureSession.State.OPENING;
                    C4289j0.m11435b("CaptureSession");
                    C0528p pVar = new C0528p(Arrays.asList(new C0520l.C0521a[]{captureSession.f1730d, new C0528p.C0529a(sessionConfig.f1934c)}));
                    Config config = sessionConfig.f1937f.f1971b;
                    C6956a aVar = new C6956a(config);
                    C6959c cVar2 = (C6959c) config.mo2423b(C6956a.f21710C, new C6959c(new C6958b[0]));
                    captureSession.f1735i = cVar2;
                    cVar2.getClass();
                    List<C6958b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar2.f15497a));
                    ArrayList arrayList2 = new ArrayList();
                    for (C6958b add : unmodifiableList) {
                        arrayList2.add(add);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((C6958b) it.next()).getClass();
                    }
                    C0578e.C0579a aVar2 = new C0578e.C0579a(sessionConfig.f1937f);
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        aVar2.mo2481c(((C0578e) it2.next()).f1971b);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        captureRequest = null;
                        if (!it3.hasNext()) {
                            break;
                        }
                        C7363b bVar = new C7363b((Surface) it3.next());
                        bVar.f22589a.mo23575a((String) aVar.f6156x.mo2423b(C6956a.f21712E, null));
                        arrayList4.add(bVar);
                    }
                    C0522m mVar = (C0522m) captureSession.f1731e.f1816a;
                    mVar.f1805f = pVar;
                    C7372g gVar = new C7372g(arrayList4, mVar.f1803d, new C0524n(mVar));
                    try {
                        C0578e d = aVar2.mo2482d();
                        if (cameraDevice != null) {
                            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(d.f1972c);
                            C7079n0.m16605a(createCaptureRequest, d.f1971b);
                            captureRequest = createCaptureRequest.build();
                        }
                        if (captureRequest != null) {
                            gVar.f22600a.setSessionParameters(captureRequest);
                        }
                        C0525o oVar = captureSession.f1731e;
                        cVar = oVar.f1816a.mo2341b(cameraDevice, gVar, captureSession.f1737k);
                    } catch (CameraAccessException e) {
                        cVar = new C5028j.C5029a<>(e);
                    }
                } else if (i != 5) {
                    cVar = new C5028j.C5029a<>(new CancellationException("openCaptureSession() not execute in state: " + captureSession.f1738l));
                }
            }
            cVar = new C5028j.C5029a<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + captureSession.f1738l));
        }
        return cVar;
    }
}
