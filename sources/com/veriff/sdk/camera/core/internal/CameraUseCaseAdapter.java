package com.veriff.sdk.camera.core.internal;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.ViewPort;
import com.veriff.sdk.camera.core.impl.CameraConfig;
import com.veriff.sdk.camera.core.impl.CameraConfigs;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CameraDeviceSurfaceManager;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import gd0.C12731a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p229r1.C6231a;
import p304x.C7029b1;
import p394br.C13660f;

public final class CameraUseCaseAdapter implements Camera {
    private boolean mAttached = true;
    private CameraConfig mCameraConfig = CameraConfigs.emptyConfig();
    private final CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;
    private CameraInternal mCameraInternal;
    private List<UseCase> mExtraUseCases = new ArrayList();
    private final CameraId mId;
    private Config mInteropConfig = null;
    private final Object mLock = new Object();
    private final UseCaseConfigFactory mUseCaseConfigFactory;
    private final List<UseCase> mUseCases = new ArrayList();
    private ViewPort mViewPort;

    public static final class CameraException extends Exception {
        public CameraException(String str) {
            super(str);
        }
    }

    public static final class CameraId {
        private final List<String> mIds = new ArrayList();

        public CameraId(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.mIds.add(it.next().getCameraInfoInternal().getCameraId());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof CameraId) {
                return this.mIds.equals(((CameraId) obj).mIds);
            }
            return false;
        }

        public int hashCode() {
            return this.mIds.hashCode() * 53;
        }
    }

    public static class ConfigPair {
        public UseCaseConfig<?> mCameraConfig;
        public UseCaseConfig<?> mExtendedConfig;

        public ConfigPair(UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
            this.mExtendedConfig = useCaseConfig;
            this.mCameraConfig = useCaseConfig2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<CameraInternal> linkedHashSet, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        this.mCameraInternal = linkedHashSet.iterator().next();
        this.mId = new CameraId(new LinkedHashSet(linkedHashSet));
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    private List<UseCase> calculateRequiredExtraUseCases(List<UseCase> list, List<UseCase> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean isExtraPreviewRequired = isExtraPreviewRequired(list);
        boolean isExtraImageCaptureRequired = isExtraImageCaptureRequired(list);
        UseCase useCase = null;
        UseCase useCase2 = null;
        for (UseCase next : list2) {
            if (isPreview(next)) {
                useCase = next;
            } else if (isImageCapture(next)) {
                useCase2 = next;
            }
        }
        if (isExtraPreviewRequired && useCase == null) {
            arrayList.add(createExtraPreview());
        } else if (!isExtraPreviewRequired && useCase != null) {
            arrayList.remove(useCase);
        }
        if (isExtraImageCaptureRequired && useCase2 == null) {
            arrayList.add(createExtraImageCapture());
        } else if (!isExtraImageCaptureRequired && useCase2 != null) {
            arrayList.remove(useCase2);
        }
        return arrayList;
    }

    private Map<UseCase, Size> calculateSuggestedResolutions(CameraInfoInternal cameraInfoInternal, List<UseCase> list, List<UseCase> list2, Map<UseCase, ConfigPair> map) {
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap hashMap = new HashMap();
        for (UseCase next : list2) {
            arrayList.add(this.mCameraDeviceSurfaceManager.transformSurfaceConfig(cameraId, next.getImageFormat(), next.getAttachedSurfaceResolution()));
            hashMap.put(next, next.getAttachedSurfaceResolution());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (UseCase next2 : list) {
                ConfigPair configPair = map.get(next2);
                hashMap2.put(next2.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig), next2);
            }
            Map<UseCaseConfig<?>, Size> suggestedResolutions = this.mCameraDeviceSurfaceManager.getSuggestedResolutions(cameraId, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((UseCase) entry.getValue(), suggestedResolutions.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    private ImageCapture createExtraImageCapture() {
        return new ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }

    private Preview createExtraPreview() {
        Preview build = new Preview.Builder().setTargetName("Preview-Extra").build();
        build.setSurfaceProvider(new C13660f(11));
        return build;
    }

    private void detachUnnecessaryUseCases(List<UseCase> list) {
        synchronized (this.mLock) {
            if (!list.isEmpty()) {
                this.mCameraInternal.detachUseCases(list);
                for (UseCase next : list) {
                    if (this.mUseCases.contains(next)) {
                        next.onDetach(this.mCameraInternal);
                    } else {
                        Logger.m32241e("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + next);
                    }
                }
                this.mUseCases.removeAll(list);
            }
        }
    }

    public static CameraId generateCameraId(LinkedHashSet<CameraInternal> linkedHashSet) {
        return new CameraId(linkedHashSet);
    }

    private Map<UseCase, ConfigPair> getConfigs(List<UseCase> list, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap hashMap = new HashMap();
        for (UseCase next : list) {
            hashMap.put(next, new ConfigPair(next.getDefaultConfig(false, useCaseConfigFactory), next.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
        boolean z;
        synchronized (this.mLock) {
            z = true;
            if (this.mCameraConfig.getUseCaseCombinationRequiredRule() != 1) {
                z = false;
            }
        }
        return z;
    }

    private boolean isExtraImageCaptureRequired(List<UseCase> list) {
        boolean z = false;
        boolean z2 = false;
        for (UseCase next : list) {
            if (isPreview(next)) {
                z = true;
            } else if (isImageCapture(next)) {
                z2 = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    private boolean isExtraPreviewRequired(List<UseCase> list) {
        boolean z = false;
        boolean z2 = false;
        for (UseCase next : list) {
            if (isPreview(next)) {
                z2 = true;
            } else if (isImageCapture(next)) {
                z = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    private boolean isImageCapture(UseCase useCase) {
        return useCase instanceof ImageCapture;
    }

    private boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$1(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$2(SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, CameraXExecutors.directExecutor(), new C12731a(surface, surfaceTexture));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyAttachedUseCasesChange$0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6231a<Collection<UseCase>> attachedUseCasesUpdateListener = ((UseCase) it.next()).getCurrentConfig().getAttachedUseCasesUpdateListener((C6231a<Collection<UseCase>>) null);
            if (attachedUseCasesUpdateListener != null) {
                attachedUseCasesUpdateListener.accept(Collections.unmodifiableList(list));
            }
        }
    }

    private void notifyAttachedUseCasesChange(List<UseCase> list) {
        CameraXExecutors.mainThreadExecutor().execute(new C7029b1(list, 16));
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            if (this.mInteropConfig != null) {
                this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
            }
        }
    }

    private void updateViewPort(Map<UseCase, Size> map, Collection<UseCase> collection) {
        boolean z;
        synchronized (this.mLock) {
            if (this.mViewPort != null) {
                if (this.mCameraInternal.getCameraInfoInternal().getLensFacing().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Map<UseCase, Rect> calculateViewPortRects = ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), z, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), map);
                for (UseCase next : collection) {
                    Rect rect = calculateViewPortRects.get(next);
                    rect.getClass();
                    next.setViewPortCropRect(rect);
                }
            }
        }
    }

    public void addUseCases(Collection<UseCase> collection) throws CameraException {
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList();
            for (UseCase next : collection) {
                if (this.mUseCases.contains(next)) {
                    Logger.m32239d("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.mUseCases);
            List<UseCase> emptyList = Collections.emptyList();
            ArrayList arrayList3 = Collections.emptyList();
            if (isCoexistingPreviewImageCaptureRequired()) {
                arrayList2.removeAll(this.mExtraUseCases);
                arrayList2.addAll(arrayList);
                emptyList = calculateRequiredExtraUseCases(arrayList2, new ArrayList(this.mExtraUseCases));
                ArrayList arrayList4 = new ArrayList(emptyList);
                arrayList4.removeAll(this.mExtraUseCases);
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(this.mExtraUseCases);
                arrayList5.removeAll(emptyList);
                arrayList3 = arrayList5;
            }
            Map<UseCase, ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
            try {
                ArrayList arrayList6 = new ArrayList(this.mUseCases);
                arrayList6.removeAll(arrayList3);
                Map<UseCase, Size> calculateSuggestedResolutions = calculateSuggestedResolutions(this.mCameraInternal.getCameraInfoInternal(), arrayList, arrayList6, configs);
                updateViewPort(calculateSuggestedResolutions, collection);
                this.mExtraUseCases = emptyList;
                detachUnnecessaryUseCases(arrayList3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UseCase useCase = (UseCase) it.next();
                    ConfigPair configPair = configs.get(useCase);
                    useCase.onAttach(this.mCameraInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                    Size size = calculateSuggestedResolutions.get(useCase);
                    size.getClass();
                    useCase.updateSuggestedResolution(size);
                }
                this.mUseCases.addAll(arrayList);
                if (this.mAttached) {
                    notifyAttachedUseCasesChange(this.mUseCases);
                    this.mCameraInternal.attachUseCases(arrayList);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UseCase) it2.next()).notifyState();
                }
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            if (!this.mAttached) {
                this.mCameraInternal.attachUseCases(this.mUseCases);
                notifyAttachedUseCasesChange(this.mUseCases);
                restoreInteropConfig();
                for (UseCase notifyState : this.mUseCases) {
                    notifyState.notifyState();
                }
                this.mAttached = true;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            if (this.mAttached) {
                this.mCameraInternal.detachUseCases(new ArrayList(this.mUseCases));
                cacheInteropConfig();
                this.mAttached = false;
            }
        }
    }

    public CameraControl getCameraControl() {
        return this.mCameraInternal.getCameraControlInternal();
    }

    public CameraId getCameraId() {
        return this.mId;
    }

    public CameraInfo getCameraInfo() {
        return this.mCameraInternal.getCameraInfoInternal();
    }

    public List<UseCase> getUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mUseCases);
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeUseCases(java.util.Collection<com.veriff.sdk.camera.core.UseCase> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ all -> 0x0028 }
            r2.detachUnnecessaryUseCases(r1)     // Catch:{ all -> 0x0028 }
            boolean r1 = r2.isCoexistingPreviewImageCaptureRequired()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            java.util.List<com.veriff.sdk.camera.core.UseCase> r1 = r2.mExtraUseCases     // Catch:{ all -> 0x0028 }
            r1.removeAll(r3)     // Catch:{ all -> 0x0028 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ CameraException -> 0x001e }
            r2.addUseCases(r3)     // Catch:{ CameraException -> 0x001e }
            goto L_0x0026
        L_0x001e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Failed to add extra fake Preview or ImageCapture use case!"
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter.removeUseCases(java.util.Collection):void");
    }

    public void setExtendedConfig(CameraConfig cameraConfig) {
        synchronized (this.mLock) {
            if (cameraConfig == null) {
                cameraConfig = CameraConfigs.emptyConfig();
            }
            if (!this.mUseCases.isEmpty()) {
                if (!this.mCameraConfig.getCompatibilityId().equals(cameraConfig.getCompatibilityId())) {
                    throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                }
            }
            this.mCameraConfig = cameraConfig;
        }
    }

    public void setViewPort(ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }
}
