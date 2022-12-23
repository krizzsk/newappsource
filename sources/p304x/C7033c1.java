package p304x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import p291w.C6956a;
import p304x.C7118x1;
import p316y.C7225s;

/* renamed from: x.c1 */
public final class C7033c1 implements C7118x1.C7120b {

    /* renamed from: a */
    public final C7225s f21880a;

    public C7033c1(C7225s sVar) {
        this.f21880a = sVar;
    }

    /* renamed from: a */
    public final void mo23264a(C6956a.C6957a aVar) {
    }

    public final float getMaxZoom() {
        Float f = (Float) this.f21880a.mo23532a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float getMinZoom() {
        return 1.0f;
    }

    public final void onCaptureResult(TotalCaptureResult totalCaptureResult) {
    }

    public final void resetZoom() {
    }
}
