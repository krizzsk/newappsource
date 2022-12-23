package bd0;

import android.content.Context;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraFactory;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.impl.CameraFactory;
import com.veriff.sdk.camera.core.impl.CameraThreadConfig;

/* renamed from: bd0.a */
public final /* synthetic */ class C7571a implements CameraFactory.Provider {
    public final CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
        return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector);
    }
}
