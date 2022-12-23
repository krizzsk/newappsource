package com.veriff.sdk.camera.core;

import android.media.ImageReader;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;

final class ImageReaderProxys {
    public static ImageReaderProxy createIsolatedReader(int i, int i2, int i3, int i4) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }
}
