package com.veriff.sdk.camera.core.impl;

import android.util.Size;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.internal.ThreadConfig;
import fd0.C12689j;
import fd0.C12690k;
import fd0.C12691l;
import gd0.C12732b;
import gd0.C12734d;
import java.util.List;
import java.util.Set;
import p229r1.C6231a;

public final class PreviewConfig implements UseCaseConfig<Preview>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option<ImageInfoProcessor> IMAGE_INFO_PROCESSOR = Config.Option.create("camerax.core.preview.imageInfoProcessor", ImageInfoProcessor.class);
    public static final Config.Option<CaptureProcessor> OPTION_PREVIEW_CAPTURE_PROCESSOR = Config.Option.create("camerax.core.preview.captureProcessor", CaptureProcessor.class);
    private final OptionsBundle mConfig;

    public PreviewConfig(OptionsBundle optionsBundle) {
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

    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return C12691l.m32428c(this, optionUnpacker);
    }

    public CaptureProcessor getCaptureProcessor(CaptureProcessor captureProcessor) {
        return (CaptureProcessor) C12690k.m32424g(this, OPTION_PREVIEW_CAPTURE_PROCESSOR, captureProcessor);
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

    public ImageInfoProcessor getImageInfoProcessor(ImageInfoProcessor imageInfoProcessor) {
        return (ImageInfoProcessor) C12690k.m32424g(this, IMAGE_INFO_PROCESSOR, imageInfoProcessor);
    }

    public int getInputFormat() {
        return ((Integer) C12690k.m32423f(this, ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
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

    public final /* synthetic */ boolean hasTargetAspectRatio() {
        return C12689j.m32417g(this);
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
