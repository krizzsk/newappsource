package bd0;

import android.content.Context;
import com.veriff.sdk.camera.camera2.Camera2Config;
import com.veriff.sdk.camera.core.impl.CameraDeviceSurfaceManager;
import java.util.Set;

/* renamed from: bd0.b */
public final /* synthetic */ class C7572b implements CameraDeviceSurfaceManager.Provider {
    public final CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set set) {
        return Camera2Config.lambda$defaultConfig$0(context, obj, set);
    }
}
