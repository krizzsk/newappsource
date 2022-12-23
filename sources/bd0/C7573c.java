package bd0;

import android.content.Context;
import com.veriff.sdk.camera.camera2.Camera2Config;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;

/* renamed from: bd0.c */
public final /* synthetic */ class C7573c implements UseCaseConfigFactory.Provider {
    public final UseCaseConfigFactory newInstance(Context context) {
        return Camera2Config.lambda$defaultConfig$1(context);
    }
}
