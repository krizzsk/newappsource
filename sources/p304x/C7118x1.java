package p304x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.lifecycle.C1043v;
import java.util.concurrent.Executor;
import p054d0.C4289j0;
import p115i0.C5225a;
import p291w.C6956a;
import p304x.C7090q;
import p316y.C7225s;

/* renamed from: x.x1 */
public final class C7118x1 {

    /* renamed from: a */
    public final C7090q f22123a;

    /* renamed from: b */
    public final Executor f22124b;

    /* renamed from: c */
    public final C7123y1 f22125c;

    /* renamed from: d */
    public final C1043v<Object> f22126d;

    /* renamed from: e */
    public final C7120b f22127e;

    /* renamed from: f */
    public boolean f22128f = false;

    /* renamed from: g */
    public C7119a f22129g = new C7119a();

    /* renamed from: x.x1$a */
    public class C7119a implements C7090q.C7093c {
        public C7119a() {
        }

        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            C7118x1.this.f22127e.onCaptureResult(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: x.x1$b */
    public interface C7120b {
        /* renamed from: a */
        void mo23264a(C6956a.C6957a aVar);

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();
    }

    public C7118x1(C7090q qVar, C7225s sVar, SequentialExecutor sequentialExecutor) {
        C7120b bVar;
        Range range;
        boolean z = false;
        this.f22123a = qVar;
        this.f22124b = sequentialExecutor;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) sVar.mo23532a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                C4289j0.m11435b("ZoomControl");
                range = null;
            }
            if (range != null) {
                z = true;
            }
        }
        if (z) {
            bVar = new C7023a(sVar);
        } else {
            bVar = new C7033c1(sVar);
        }
        this.f22127e = bVar;
        float maxZoom = bVar.getMaxZoom();
        float minZoom = bVar.getMinZoom();
        C7123y1 y1Var = new C7123y1(maxZoom, minZoom);
        this.f22125c = y1Var;
        y1Var.mo23374a();
        this.f22126d = new C1043v<>(new C5225a(y1Var.f22134a, maxZoom, minZoom, y1Var.f22137d));
        qVar.mo23326c(this.f22129g);
    }
}
