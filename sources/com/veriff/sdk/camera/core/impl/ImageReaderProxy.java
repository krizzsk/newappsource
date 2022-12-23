package com.veriff.sdk.camera.core.impl;

import android.view.Surface;
import com.veriff.sdk.camera.core.ImageProxy;
import java.util.concurrent.Executor;

public interface ImageReaderProxy {

    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReaderProxy imageReaderProxy);
    }

    ImageProxy acquireLatestImage();

    ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Executor executor);
}
