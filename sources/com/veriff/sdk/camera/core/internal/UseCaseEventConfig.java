package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ReadableConfig;

public interface UseCaseEventConfig extends ReadableConfig {
    public static final Config.Option<UseCase.EventCallback> OPTION_USE_CASE_EVENT_CALLBACK = Config.Option.create("camerax.core.useCaseEventCallback", UseCase.EventCallback.class);

    UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback);
}
