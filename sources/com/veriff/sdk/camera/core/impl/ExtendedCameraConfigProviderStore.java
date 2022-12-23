package com.veriff.sdk.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

public final class ExtendedCameraConfigProviderStore {
    private static final Map<Object, CameraConfigProvider> CAMERA_CONFIG_PROVIDERS = new HashMap();
    private static final Object LOCK = new Object();

    public static CameraConfigProvider getConfigProvider(Object obj) {
        CameraConfigProvider cameraConfigProvider;
        synchronized (LOCK) {
            cameraConfigProvider = CAMERA_CONFIG_PROVIDERS.get(obj);
        }
        if (cameraConfigProvider == null) {
            return CameraConfigProvider.EMPTY;
        }
        return cameraConfigProvider;
    }
}
