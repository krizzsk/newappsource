package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

public interface IoConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_IO_EXECUTOR = Config.Option.create("camerax.core.io.ioExecutor", Executor.class);
}
