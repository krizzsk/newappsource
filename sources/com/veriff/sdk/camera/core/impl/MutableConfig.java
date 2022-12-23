package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.Config;

public interface MutableConfig extends Config {
    <ValueT> void insertOption(Config.Option<ValueT> option, Config.OptionPriority optionPriority, ValueT valuet);

    <ValueT> void insertOption(Config.Option<ValueT> option, ValueT valuet);
}
