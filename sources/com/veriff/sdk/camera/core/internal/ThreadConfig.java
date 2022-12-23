package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

public interface ThreadConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_BACKGROUND_EXECUTOR = Config.Option.create("camerax.core.thread.backgroundExecutor", Executor.class);
}
