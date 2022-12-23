package com.veriff.sdk.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImageInfoProcessor;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.MutableConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.PreviewConfig;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.internal.CameraCaptureResultImageInfo;
import com.veriff.sdk.camera.core.internal.TargetConfig;
import fd0.C12685f;
import java.util.UUID;
import java.util.concurrent.Executor;
import p054d0.C4268a1;
import p304x.C7078n;

public final class Preview extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Executor DEFAULT_SURFACE_PROVIDER_EXECUTOR = CameraXExecutors.mainThreadExecutor();
    public SurfaceRequest mCurrentSurfaceRequest;
    private boolean mHasUnsentSurfaceRequest = false;
    private DeferrableSurface mSessionDeferrableSurface;
    private SurfaceProvider mSurfaceProvider;
    private Executor mSurfaceProviderExecutor = DEFAULT_SURFACE_PROVIDER_EXECUTOR;
    private Size mSurfaceSize;

    public static final class Builder implements UseCaseConfig.Builder<Preview, PreviewConfig, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public Preview build() {
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                return new Preview(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetClass(Class<Preview> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<Preview> cls = Preview.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public PreviewConfig getUseCaseConfig() {
            return new PreviewConfig(OptionsBundle.from(this.mMutableConfig));
        }
    }

    public static final class Defaults {
        private static final PreviewConfig DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(2).setTargetAspectRatio(0).getUseCaseConfig();

        public PreviewConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public interface SurfaceProvider {
        void onSurfaceRequested(SurfaceRequest surfaceRequest);
    }

    public Preview(PreviewConfig previewConfig) {
        super(previewConfig);
    }

    private Rect getCropRect(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$0(String str, PreviewConfig previewConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (isCurrentCamera(str)) {
            updateSessionConfig(createPipeline(str, previewConfig, size).build());
            notifyReset();
        }
    }

    private boolean sendSurfaceRequestIfReady() {
        SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
        SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        if (surfaceProvider == null || surfaceRequest == null) {
            return false;
        }
        this.mSurfaceProviderExecutor.execute(new C7078n(16, surfaceProvider, surfaceRequest));
        return true;
    }

    private void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        Rect cropRect = getCropRect(this.mSurfaceSize);
        SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
        if (camera != null && surfaceProvider != null && cropRect != null) {
            surfaceRequest.updateTransformationInfo(SurfaceRequest.TransformationInfo.m32266of(cropRect, getRelativeRotation(camera), getTargetRotation()));
        }
    }

    private void updateConfigAndOutput(String str, PreviewConfig previewConfig, Size size) {
        updateSessionConfig(createPipeline(str, previewConfig, size).build());
    }

    public SessionConfig.Builder createPipeline(String str, PreviewConfig previewConfig, Size size) {
        boolean z;
        PreviewConfig previewConfig2 = previewConfig;
        Size size2 = size;
        Threads.checkMainThread();
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(previewConfig);
        CaptureProcessor captureProcessor = previewConfig2.getCaptureProcessor((CaptureProcessor) null);
        DeferrableSurface deferrableSurface = this.mSessionDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        CameraInternal camera = getCamera();
        if (captureProcessor != null) {
            z = true;
        } else {
            z = false;
        }
        SurfaceRequest surfaceRequest = new SurfaceRequest(size2, camera, z);
        this.mCurrentSurfaceRequest = surfaceRequest;
        if (sendSurfaceRequestIfReady()) {
            sendTransformationInfoIfReady();
        } else {
            this.mHasUnsentSurfaceRequest = true;
        }
        if (captureProcessor != null) {
            CaptureStage.DefaultCaptureStage defaultCaptureStage = new CaptureStage.DefaultCaptureStage();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(defaultCaptureStage.hashCode());
            ProcessingSurface processingSurface = r5;
            ProcessingSurface processingSurface2 = new ProcessingSurface(size.getWidth(), size.getHeight(), previewConfig.getInputFormat(), new Handler(handlerThread.getLooper()), defaultCaptureStage, captureProcessor, surfaceRequest.getDeferrableSurface(), num);
            createFrom.addCameraCaptureCallback(processingSurface.getCameraCaptureCallback());
            processingSurface.getTerminationFuture().addListener(new C4268a1(handlerThread, 18), CameraXExecutors.directExecutor());
            this.mSessionDeferrableSurface = processingSurface;
            createFrom.addTag(num, Integer.valueOf(defaultCaptureStage.getId()));
        } else {
            final ImageInfoProcessor imageInfoProcessor = previewConfig2.getImageInfoProcessor((ImageInfoProcessor) null);
            if (imageInfoProcessor != null) {
                createFrom.addCameraCaptureCallback(new CameraCaptureCallback() {
                    public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                        super.onCaptureCompleted(cameraCaptureResult);
                        if (imageInfoProcessor.process(new CameraCaptureResultImageInfo(cameraCaptureResult))) {
                            Preview.this.notifyUpdated();
                        }
                    }
                });
            }
            this.mSessionDeferrableSurface = surfaceRequest.getDeferrableSurface();
        }
        createFrom.addSurface(this.mSessionDeferrableSurface);
        createFrom.addErrorListener(new C12517e0(this, str, previewConfig2, size2));
        return createFrom;
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.PREVIEW);
        if (z) {
            config = C12685f.m32409b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public void onDetached() {
        DeferrableSurface deferrableSurface = this.mSessionDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mCurrentSurfaceRequest = null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.veriff.sdk.camera.core.ExtendableBuilder, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.camera.core.impl.UseCaseConfig<?> onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal r3, com.veriff.sdk.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r4) {
        /*
            r2 = this;
            com.veriff.sdk.camera.core.impl.MutableConfig r3 = r4.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<com.veriff.sdk.camera.core.impl.CaptureProcessor> r0 = com.veriff.sdk.camera.core.impl.PreviewConfig.OPTION_PREVIEW_CAPTURE_PROCESSOR
            r1 = 0
            java.lang.Object r3 = r3.retrieveOption(r0, r1)
            if (r3 == 0) goto L_0x001d
            com.veriff.sdk.camera.core.impl.MutableConfig r3 = r4.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r0 = com.veriff.sdk.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.insertOption(r0, r1)
            goto L_0x002c
        L_0x001d:
            com.veriff.sdk.camera.core.impl.MutableConfig r3 = r4.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$Option<java.lang.Integer> r0 = com.veriff.sdk.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.insertOption(r0, r1)
        L_0x002c:
            com.veriff.sdk.camera.core.impl.UseCaseConfig r3 = r4.getUseCaseConfig()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.Preview.onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder):com.veriff.sdk.camera.core.impl.UseCaseConfig");
    }

    public Size onSuggestedResolutionUpdated(Size size) {
        this.mSurfaceSize = size;
        updateConfigAndOutput(getCameraId(), (PreviewConfig) getCurrentConfig(), this.mSurfaceSize);
        return size;
    }

    public void setSurfaceProvider(Executor executor, SurfaceProvider surfaceProvider) {
        Threads.checkMainThread();
        if (surfaceProvider == null) {
            this.mSurfaceProvider = null;
            notifyInactive();
            return;
        }
        this.mSurfaceProvider = surfaceProvider;
        this.mSurfaceProviderExecutor = executor;
        notifyActive();
        if (this.mHasUnsentSurfaceRequest) {
            if (sendSurfaceRequestIfReady()) {
                sendTransformationInfoIfReady();
                this.mHasUnsentSurfaceRequest = false;
            }
        } else if (getAttachedSurfaceResolution() != null) {
            updateConfigAndOutput(getCameraId(), (PreviewConfig) getCurrentConfig(), getAttachedSurfaceResolution());
            notifyReset();
        }
    }

    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Preview:");
        k.append(getName());
        return k.toString();
    }

    public void setSurfaceProvider(SurfaceProvider surfaceProvider) {
        setSurfaceProvider(DEFAULT_SURFACE_PROVIDER_EXECUTOR, surfaceProvider);
    }
}
