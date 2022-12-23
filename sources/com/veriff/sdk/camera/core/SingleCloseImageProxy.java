package com.veriff.sdk.camera.core;

final class SingleCloseImageProxy extends ForwardingImageProxy {
    private boolean mClosed = false;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
    }

    public synchronized void close() {
        if (!this.mClosed) {
            this.mClosed = true;
            super.close();
        }
    }
}
