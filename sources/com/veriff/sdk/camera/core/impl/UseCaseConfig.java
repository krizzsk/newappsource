package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.ExtendableBuilder;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.internal.TargetConfig;
import com.veriff.sdk.camera.core.internal.UseCaseEventConfig;
import java.util.Collection;
import p229r1.C6231a;

public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, UseCaseEventConfig, ImageInputConfig {
    public static final Config.Option<C6231a<Collection<UseCase>>> OPTION_ATTACHED_USE_CASES_UPDATE_LISTENER = Config.Option.create("camerax.core.useCase.attachedUseCasesUpdateListener", C6231a.class);
    public static final Config.Option<CameraSelector> OPTION_CAMERA_SELECTOR = Config.Option.create("camerax.core.useCase.cameraSelector", CameraSelector.class);
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends ExtendableBuilder<T> {
        C getUseCaseConfig();
    }

    C6231a<Collection<UseCase>> getAttachedUseCasesUpdateListener(C6231a<Collection<UseCase>> aVar);

    CameraSelector getCameraSelector(CameraSelector cameraSelector);

    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

    CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig);

    SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig);

    SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

    int getSurfaceOccupancyPriority(int i);
}
