package com.veriff.sdk.camera.lifecycle;

import android.content.Context;
import androidx.camera.camera2.internal.C0519k;
import androidx.lifecycle.C1033p;
import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraFilter;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.CameraX;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.ViewPort;
import com.veriff.sdk.camera.core.impl.CameraConfig;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.ExtendedCameraConfigProviderStore;
import com.veriff.sdk.camera.core.impl.utils.ContextUtil;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p695od.C18728c;

public final class ProcessCameraProvider {
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private CameraX mCameraX;
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository = new LifecycleCameraRepository();

    private ProcessCameraProvider() {
    }

    public static C18728c<ProcessCameraProvider> getInstance(Context context) {
        context.getClass();
        return Futures.transform(CameraX.getOrCreateInstance(context), new C0519k(context, 2), CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ProcessCameraProvider lambda$getInstance$0(Context context, CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = sAppInstance;
        processCameraProvider.setCameraX(cameraX);
        processCameraProvider.setContext(ContextUtil.getApplicationContext(context));
        return processCameraProvider;
    }

    private void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    private void setContext(Context context) {
        this.mContext = context;
    }

    public Camera bindToLifecycle(C1033p pVar, CameraSelector cameraSelector, UseCase... useCaseArr) {
        return bindToLifecycle(pVar, cameraSelector, (ViewPort) null, useCaseArr);
    }

    public void unbindAll() {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbindAll();
    }

    public Camera bindToLifecycle(C1033p pVar, CameraSelector cameraSelector, ViewPort viewPort, UseCase... useCaseArr) {
        CameraConfig cameraConfig;
        CameraConfig config;
        Threads.checkMainThread();
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i = 0;
        while (true) {
            cameraConfig = null;
            if (i >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i].getCurrentConfig().getCameraSelector((CameraSelector) null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    fromSelector.addCameraFilter(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> filter = fromSelector.build().filter(this.mCameraX.getCameraRepository().getCameras());
        LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(pVar, CameraUseCaseAdapter.generateCameraId(filter));
        Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
        for (UseCase useCase : useCaseArr) {
            for (LifecycleCamera next : lifecycleCameras) {
                if (next.isBound(useCase) && next != lifecycleCamera) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{useCase}));
                }
            }
        }
        if (lifecycleCamera == null) {
            lifecycleCamera = this.mLifecycleCameraRepository.createLifecycleCamera(pVar, new CameraUseCaseAdapter(filter, this.mCameraX.getCameraDeviceSurfaceManager(), this.mCameraX.getDefaultConfigFactory()));
        }
        Iterator<CameraFilter> it2 = cameraSelector.getCameraFilterSet().iterator();
        while (it2.hasNext()) {
            CameraFilter next2 = it2.next();
            if (!(next2.getIdentifier() == CameraFilter.DEFAULT_ID || (config = ExtendedCameraConfigProviderStore.getConfigProvider(next2.getIdentifier()).getConfig(lifecycleCamera.getCameraInfo(), this.mContext)) == null)) {
                if (cameraConfig == null) {
                    cameraConfig = config;
                } else {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
            }
        }
        lifecycleCamera.setExtendedConfig(cameraConfig);
        if (useCaseArr.length == 0) {
            return lifecycleCamera;
        }
        this.mLifecycleCameraRepository.bindToLifecycleCamera(lifecycleCamera, viewPort, Arrays.asList(useCaseArr));
        return lifecycleCamera;
    }
}
