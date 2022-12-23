package com.veriff.sdk.camera.camera2.internal;

import android.content.Context;
import com.veriff.sdk.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraManagerCompat;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.InitializationException;
import com.veriff.sdk.camera.core.impl.CameraFactory;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CameraStateRegistry;
import com.veriff.sdk.camera.core.impl.CameraThreadConfig;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Camera2CameraFactory implements CameraFactory {
    private final List<String> mAvailableCameraIds;
    private final Map<String, Camera2CameraInfoImpl> mCameraInfos = new HashMap();
    private final CameraManagerCompat mCameraManager;
    private final CameraStateRegistry mCameraStateRegistry;
    private final CameraThreadConfig mThreadConfig;

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) throws InitializationException {
        this.mThreadConfig = cameraThreadConfig;
        this.mCameraStateRegistry = new CameraStateRegistry(1);
        this.mCameraManager = CameraManagerCompat.from(context, cameraThreadConfig.getSchedulerHandler());
        this.mAvailableCameraIds = CameraSelectionOptimizer.getSelectedAvailableCameraIds(this, cameraSelector);
    }

    public Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.mAvailableCameraIds);
    }

    public CameraInternal getCamera(String str) throws CameraUnavailableException {
        if (this.mAvailableCameraIds.contains(str)) {
            return new Camera2CameraImpl(this.mCameraManager, str, getCameraInfo(str), this.mCameraStateRegistry, this.mThreadConfig.getCameraExecutor(), this.mThreadConfig.getSchedulerHandler());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public Camera2CameraInfoImpl getCameraInfo(String str) throws CameraUnavailableException {
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = this.mCameraInfos.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.mCameraManager.getCameraCharacteristicsCompat(str));
            this.mCameraInfos.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    public CameraManagerCompat getCameraManager() {
        return this.mCameraManager;
    }
}
