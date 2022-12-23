package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

public interface ImageReaderProxyProvider {
    ImageReaderProxy newInstance(int i, int i2, int i3, int i4, long j);
}
