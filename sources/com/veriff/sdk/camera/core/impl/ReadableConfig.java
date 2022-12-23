package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.Config;
import java.util.Set;

public interface ReadableConfig extends Config {
    boolean containsOption(Config.Option<?> option);

    Config getConfig();

    Config.OptionPriority getOptionPriority(Config.Option<?> option);

    Set<Config.Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option);

    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, ValueT valuet);
}
