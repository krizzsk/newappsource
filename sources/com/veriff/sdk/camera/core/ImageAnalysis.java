package com.veriff.sdk.camera.core;

import android.util.Size;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImageAnalysisConfig;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.ImmediateSurface;
import com.veriff.sdk.camera.core.impl.MutableConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.internal.TargetConfig;
import com.veriff.sdk.camera.core.internal.UseCaseEventConfig;
import fd0.C12685f;
import gd0.C12733c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class ImageAnalysis extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private final Object mAnalysisLock = new Object();
    private DeferrableSurface mDeferrableSurface;
    public final ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    private Analyzer mSubscribedAnalyzer;

    public interface Analyzer {
        void analyze(ImageProxy imageProxy);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    public static final class Builder implements UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public ImageAnalysis build() {
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                return new ImageAnalysis(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setBackpressureStrategy(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i));
            return this;
        }

        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetClass(Class<ImageAnalysis> cls) {
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

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<ImageAnalysis> cls = ImageAnalysis.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }
    }

    public static final class Defaults {
        private static final ImageAnalysisConfig DEFAULT_CONFIG;

        static {
            Size size = new Size(640, 480);
            DEFAULT_CONFIG = new Builder().setDefaultResolution(size).setMaxResolution(new Size(1920, 1080)).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).getUseCaseConfig();
        }

        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        if (((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
            return;
        }
        Executor highPriorityExecutor = CameraXExecutors.highPriorityExecutor();
        imageAnalysisConfig.getClass();
        this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(C12733c.m32503a(imageAnalysisConfig, highPriorityExecutor));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$0(String str, ImageAnalysisConfig imageAnalysisConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.clearCache();
        if (isCurrentCamera(str)) {
            updateSessionConfig(createPipeline(str, imageAnalysisConfig, size).build());
            notifyReset();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setAnalyzer$1(Analyzer analyzer, ImageProxy imageProxy) {
        if (getViewPortCropRect() != null) {
            imageProxy.setCropRect(getViewPortCropRect());
        }
        analyzer.analyze(imageProxy);
    }

    private void tryUpdateRelativeRotation() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
        }
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, Size size) {
        int i;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        Threads.checkMainThread();
        Executor highPriorityExecutor = CameraXExecutors.highPriorityExecutor();
        imageAnalysisConfig.getClass();
        Executor a = C12733c.m32503a(imageAnalysisConfig, highPriorityExecutor);
        a.getClass();
        if (getBackpressureStrategy() == 1) {
            i = getImageQueueDepth();
        } else {
            i = 4;
        }
        if (imageAnalysisConfig.getImageReaderProxyProvider() != null) {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(size.getWidth(), size.getHeight(), getImageFormat(), i, 0));
        } else {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), getImageFormat(), i));
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(this.mImageAnalysisAbstractAnalyzer, a);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig);
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), size, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new C12561l(safeCloseImageReaderProxy, 0), CameraXExecutors.mainThreadExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        createFrom.addErrorListener(new C12563m(this, str, imageAnalysisConfig, size));
        return createFrom;
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
        if (z) {
            config = C12685f.m32409b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public void onAttached() {
        this.mImageAnalysisAbstractAnalyzer.attach();
    }

    public void onDetached() {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.detach();
    }

    public Size onSuggestedResolutionUpdated(Size size) {
        updateSessionConfig(createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), size).build());
        return size;
    }

    public void setAnalyzer(Executor executor, Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, new C12559k(this, analyzer));
            if (this.mSubscribedAnalyzer == null) {
                notifyActive();
            }
            this.mSubscribedAnalyzer = analyzer;
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ImageAnalysis:");
        k.append(getName());
        return k.toString();
    }
}
