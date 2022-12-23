package ed0;

import android.hardware.camera2.TotalCaptureResult;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraControl;

/* renamed from: ed0.a */
public final /* synthetic */ class C12633a implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraControl f31228a;

    public /* synthetic */ C12633a(Camera2CameraControl camera2CameraControl) {
        this.f31228a = camera2CameraControl;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f31228a.lambda$new$0(totalCaptureResult);
    }
}
