package p019b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0520l;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.C0019j;
import p066e0.C4436j0;
import p102h0.C5019d;
import p102h0.C5023g;
import p102h0.C5035n;
import p304x.C7071l0;
import p327z.C7372g;
import p695od.C18728c;

/* renamed from: b0.o */
public final class C1438o {

    /* renamed from: a */
    public final boolean f5293a;

    /* renamed from: b */
    public final Object f5294b = new Object();

    /* renamed from: c */
    public final C18728c<Void> f5295c;

    /* renamed from: d */
    public CallbackToFutureAdapter.C0673a<Void> f5296d;

    /* renamed from: e */
    public boolean f5297e;

    /* renamed from: f */
    public final C1439a f5298f = new C1439a();

    /* renamed from: b0.o$a */
    public class C1439a extends CameraCaptureSession.CaptureCallback {
        public C1439a() {
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            CallbackToFutureAdapter.C0673a<Void> aVar = C1438o.this.f5296d;
            if (aVar != null) {
                boolean z = true;
                aVar.f2320d = true;
                CallbackToFutureAdapter.C0675c<T> cVar = aVar.f2318b;
                if (cVar == null || !cVar.f2322c.cancel(true)) {
                    z = false;
                }
                if (z) {
                    aVar.f2317a = null;
                    aVar.f2318b = null;
                    aVar.f2319c = null;
                }
                C1438o.this.f5296d = null;
            }
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            CallbackToFutureAdapter.C0673a<Void> aVar = C1438o.this.f5296d;
            if (aVar != null) {
                aVar.mo2697b(null);
                C1438o.this.f5296d = null;
            }
        }
    }

    @FunctionalInterface
    /* renamed from: b0.o$b */
    public interface C1440b {
    }

    public C1438o(C4436j0 j0Var) {
        boolean e = j0Var.mo19959e(C0019j.class);
        this.f5293a = e;
        if (e) {
            this.f5295c = CallbackToFutureAdapter.m1884a(new C1436m(this, 0));
        } else {
            this.f5295c = C5023g.m12857e((Object) null);
        }
    }

    /* renamed from: a */
    public static C5019d m3824a(CameraDevice cameraDevice, C7372g gVar, C7071l0 l0Var, List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0520l) it.next()).mo2329d());
        }
        return C5019d.m12842a(new C5035n(new ArrayList(arrayList2), false, C14226d.m35352s0())).mo20734c(new C1437n(l0Var, cameraDevice, gVar, list), C14226d.m35352s0());
    }
}
