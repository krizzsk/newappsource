package com.veriff.sdk.camera.core.impl;

import android.util.Size;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.ImageReaderProxyProvider;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.internal.IoConfig;
import fd0.C12689j;
import fd0.C12690k;
import fd0.C12691l;
import gd0.C12732b;
import gd0.C12734d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p229r1.C6231a;

public final class ImageCaptureConfig implements UseCaseConfig<ImageCapture>, ImageOutputConfig, IoConfig {
    public static final Config.Option<Integer> OPTION_BUFFER_FORMAT;
    public static final Config.Option<CaptureBundle> OPTION_CAPTURE_BUNDLE = Config.Option.create("camerax.core.imageCapture.captureBundle", CaptureBundle.class);
    public static final Config.Option<CaptureProcessor> OPTION_CAPTURE_PROCESSOR = Config.Option.create("camerax.core.imageCapture.captureProcessor", CaptureProcessor.class);
    public static final Config.Option<Integer> OPTION_FLASH_MODE;
    public static final Config.Option<Integer> OPTION_IMAGE_CAPTURE_MODE;
    public static final Config.Option<ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = Config.Option.create("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class);
    public static final Config.Option<Integer> OPTION_MAX_CAPTURE_STAGES;
    public static final Config.Option<Boolean> OPTION_USE_SOFTWARE_JPEG_ENCODER = Config.Option.create("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
    private final OptionsBundle mConfig;

    static {
        Class<Integer> cls = Integer.class;
        Class cls2 = Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = Config.Option.create("camerax.core.imageCapture.captureMode", cls2);
        OPTION_FLASH_MODE = Config.Option.create("camerax.core.imageCapture.flashMode", cls2);
        OPTION_BUFFER_FORMAT = Config.Option.create("camerax.core.imageCapture.bufferFormat", cls);
        OPTION_MAX_CAPTURE_STAGES = Config.Option.create("camerax.core.imageCapture.maxCaptureStages", cls);
    }

    public ImageCaptureConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public final /* synthetic */ boolean containsOption(Config.Option option) {
        return C12690k.m32418a(this, option);
    }

    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C12690k.m32419b(this, str, optionMatcher);
    }

    public final /* synthetic */ C6231a getAttachedUseCasesUpdateListener(C6231a aVar) {
        return C12691l.m32426a(this, aVar);
    }

    public final /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
        return C12691l.m32427b(this, cameraSelector);
    }

    public CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        return (CaptureBundle) C12690k.m32424g(this, OPTION_CAPTURE_BUNDLE, captureBundle);
    }

    public int getCaptureMode() {
        return ((Integer) C12690k.m32423f(this, OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return C12691l.m32428c(this, optionUnpacker);
    }

    public CaptureProcessor getCaptureProcessor(CaptureProcessor captureProcessor) {
        return (CaptureProcessor) C12690k.m32424g(this, OPTION_CAPTURE_PROCESSOR, captureProcessor);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public final /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
        return C12691l.m32429d(this, captureConfig);
    }

    public final /* synthetic */ Size getDefaultResolution(Size size) {
        return C12689j.m32411a(this, size);
    }

    public final /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
        return C12691l.m32430e(this, sessionConfig);
    }

    public int getFlashMode(int i) {
        return ((Integer) C12690k.m32424g(this, OPTION_FLASH_MODE, Integer.valueOf(i))).intValue();
    }

    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (ImageReaderProxyProvider) C12690k.m32424g(this, OPTION_IMAGE_READER_PROXY_PROVIDER, (Object) null);
    }

    public int getInputFormat() {
        return ((Integer) C12690k.m32423f(this, ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    public Executor getIoExecutor(Executor executor) {
        return (Executor) C12690k.m32424g(this, IoConfig.OPTION_IO_EXECUTOR, executor);
    }

    public int getMaxCaptureStages(int i) {
        return ((Integer) C12690k.m32424g(this, OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i))).intValue();
    }

    public final /* synthetic */ Size getMaxResolution(Size size) {
        return C12689j.m32412b(this, size);
    }

    public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C12690k.m32420c(this, option);
    }

    public final /* synthetic */ Set getPriorities(Config.Option option) {
        return C12690k.m32421d(this, option);
    }

    public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        return C12691l.m32431f(this, optionUnpacker);
    }

    public final /* synthetic */ List getSupportedResolutions(List list) {
        return C12689j.m32413c(this, list);
    }

    public final /* synthetic */ int getSurfaceOccupancyPriority(int i) {
        return C12691l.m32432g(this, i);
    }

    public final /* synthetic */ int getTargetAspectRatio() {
        return C12689j.m32414d(this);
    }

    public final /* synthetic */ String getTargetName(String str) {
        return C12732b.m32502a(this, str);
    }

    public final /* synthetic */ Size getTargetResolution(Size size) {
        return C12689j.m32415e(this, size);
    }

    public final /* synthetic */ int getTargetRotation(int i) {
        return C12689j.m32416f(this, i);
    }

    public final /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
        return C12734d.m32504a(this, eventCallback);
    }

    public boolean hasCaptureMode() {
        return C12690k.m32418a(this, OPTION_IMAGE_CAPTURE_MODE);
    }

    public final /* synthetic */ boolean hasTargetAspectRatio() {
        return C12689j.m32417g(this);
    }

    public boolean isSoftwareJpegEncoderRequested() {
        return ((Boolean) C12690k.m32424g(this, OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.FALSE)).booleanValue();
    }

    public final /* synthetic */ Set listOptions() {
        return C12690k.m32422e(this);
    }

    public final /* synthetic */ Object retrieveOption(Config.Option option) {
        return C12690k.m32423f(this, option);
    }

    public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return C12690k.m32424g(this, option, obj);
    }

    public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return C12690k.m32425h(this, option, optionPriority);
    }
}
