package com.veriff.sdk.camera.camera2;

import android.content.Context;
import bd0.C7571a;
import bd0.C7572b;
import bd0.C7573c;
import com.veriff.sdk.camera.camera2.internal.Camera2DeviceSurfaceManager;
import com.veriff.sdk.camera.camera2.internal.Camera2UseCaseConfigFactory;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.CameraXConfig;
import com.veriff.sdk.camera.core.InitializationException;
import com.veriff.sdk.camera.core.impl.CameraDeviceSurfaceManager;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

public final class Camera2Config {

    public static final class DefaultProvider implements CameraXConfig.Provider {
        public CameraXConfig getCameraXConfig() {
            return Camera2Config.defaultConfig();
        }
    }

    public static CameraXConfig defaultConfig() {
        C7571a aVar = new C7571a();
        C7572b bVar = new C7572b();
        return new CameraXConfig.Builder().setCameraFactoryProvider(aVar).setDeviceSurfaceManagerProvider(bVar).setUseCaseConfigFactoryProvider(new C7573c()).build();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CameraDeviceSurfaceManager lambda$defaultConfig$0(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ UseCaseConfigFactory lambda$defaultConfig$1(Context context) throws InitializationException {
        return new Camera2UseCaseConfigFactory(context);
    }
}
