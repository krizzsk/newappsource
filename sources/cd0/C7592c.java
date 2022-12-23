package cd0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;

/* renamed from: cd0.c */
public final /* synthetic */ class C7592c implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraControlImpl f23110b;

    public /* synthetic */ C7592c(Camera2CameraControlImpl camera2CameraControlImpl) {
        this.f23110b = camera2CameraControlImpl;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return this.f23110b.lambda$triggerAePrecapture$6(aVar);
    }
}
