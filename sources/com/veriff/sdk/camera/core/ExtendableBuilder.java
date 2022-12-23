package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.MutableConfig;

public interface ExtendableBuilder<T> {
    MutableConfig getMutableConfig();
}
