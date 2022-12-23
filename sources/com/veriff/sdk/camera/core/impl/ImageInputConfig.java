package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.Config;

public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);

    int getInputFormat();
}
