package com.veriff.sdk.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

final class AndroidImageReaderProxy implements ImageReaderProxy {
    private final ImageReader mImageReader;

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    private boolean isImageReaderContextNotInitializedException(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        executor.execute(new C12510b(this, onImageAvailableListener, 0));
    }

    public synchronized ImageProxy acquireLatestImage() {
        Image image;
        try {
            image = this.mImageReader.acquireLatestImage();
        } catch (RuntimeException e) {
            if (isImageReaderContextNotInitializedException(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new AndroidImageProxy(image);
    }

    public synchronized ImageProxy acquireNextImage() {
        Image image;
        try {
            image = this.mImageReader.acquireNextImage();
        } catch (RuntimeException e) {
            if (isImageReaderContextNotInitializedException(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new AndroidImageProxy(image);
    }

    public synchronized void clearOnImageAvailableListener() {
        this.mImageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
    }

    public synchronized void close() {
        this.mImageReader.close();
    }

    public synchronized int getHeight() {
        return this.mImageReader.getHeight();
    }

    public synchronized int getImageFormat() {
        return this.mImageReader.getImageFormat();
    }

    public synchronized int getMaxImages() {
        return this.mImageReader.getMaxImages();
    }

    public synchronized Surface getSurface() {
        return this.mImageReader.getSurface();
    }

    public synchronized int getWidth() {
        return this.mImageReader.getWidth();
    }

    public synchronized void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        this.mImageReader.setOnImageAvailableListener(new C12508a(this, executor, onImageAvailableListener), MainThreadAsyncHandler.getInstance());
    }
}
