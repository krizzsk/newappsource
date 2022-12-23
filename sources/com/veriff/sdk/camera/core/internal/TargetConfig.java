package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ReadableConfig;

public interface TargetConfig<T> extends ReadableConfig {
    public static final Config.Option<Class<?>> OPTION_TARGET_CLASS = Config.Option.create("camerax.core.target.class", Class.class);
    public static final Config.Option<String> OPTION_TARGET_NAME = Config.Option.create("camerax.core.target.name", String.class);

    String getTargetName(String str);
}
