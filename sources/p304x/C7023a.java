package p304x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import p291w.C6956a;
import p304x.C7118x1;
import p316y.C7225s;

/* renamed from: x.a */
public final class C7023a implements C7118x1.C7120b {

    /* renamed from: a */
    public final Range<Float> f21868a;

    /* renamed from: b */
    public float f21869b = 1.0f;

    public C7023a(C7225s sVar) {
        this.f21868a = (Range) sVar.mo23532a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    /* renamed from: a */
    public final void mo23264a(C6956a.C6957a aVar) {
        aVar.mo23202a(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f21869b));
    }

    public final float getMaxZoom() {
        return this.f21868a.getUpper().floatValue();
    }

    public final float getMinZoom() {
        return this.f21868a.getLower().floatValue();
    }

    public final void onCaptureResult(TotalCaptureResult totalCaptureResult) {
    }

    public final void resetZoom() {
        this.f21869b = 1.0f;
    }
}
