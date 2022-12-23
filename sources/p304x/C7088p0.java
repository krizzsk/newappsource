package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import p032c0.C1755e;
import p291w.C6956a;
import p291w.C6958b;
import p291w.C6959c;

/* renamed from: x.p0 */
public final class C7088p0 implements SessionConfig.C0568d {

    /* renamed from: a */
    public static final C7088p0 f22032a = new C7088p0();

    /* renamed from: a */
    public final void mo2462a(C0595r<?> rVar, SessionConfig.C0566b bVar) {
        SessionConfig n = rVar.mo2495n();
        Config config = C0590n.f2014z;
        int i = SessionConfig.m1602a().f1937f.f1972c;
        if (n != null) {
            i = n.f1937f.f1972c;
            for (CameraDevice.StateCallback next : n.f1933b) {
                if (!bVar.f1941c.contains(next)) {
                    bVar.f1941c.add(next);
                }
            }
            for (CameraCaptureSession.StateCallback b : n.f1934c) {
                bVar.mo2459b(b);
            }
            bVar.f1940b.mo2479a(n.f1937f.f1973d);
            config = n.f1937f.f1971b;
        }
        C0578e.C0579a aVar = bVar.f1940b;
        aVar.getClass();
        aVar.f1978b = C0589m.m1675u(config);
        bVar.f1940b.f1979c = ((Integer) rVar.mo2423b(C6956a.f21713y, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) rVar.mo2423b(C6956a.f21714z, new C7107u0());
        if (!bVar.f1941c.contains(stateCallback)) {
            bVar.f1941c.add(stateCallback);
        }
        bVar.mo2459b((CameraCaptureSession.StateCallback) rVar.mo2423b(C6956a.f21708A, new C7101s0()));
        bVar.mo2458a(new C7122y0((CameraCaptureSession.CaptureCallback) rVar.mo2423b(C6956a.f21709B, new C7028b0())));
        C0589m t = C0589m.m1674t();
        C0572a aVar2 = C6956a.f21710C;
        t.mo2503w(aVar2, (C6959c) rVar.mo2423b(aVar2, new C6959c(new C6958b[0])));
        C0572a aVar3 = C6956a.f21712E;
        t.mo2503w(aVar3, (String) rVar.mo2423b(aVar3, null));
        bVar.f1940b.mo2481c(t);
        bVar.f1940b.mo2481c(C1755e.C1756a.m5005b(rVar).mo6514a());
    }
}
