package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.ImageInfo;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;
import p695od.C18728c;

public final class SingleImageProxyBundle implements ImageProxyBundle {
    private final int mCaptureId;
    private final ImageProxy mImageProxy;

    public SingleImageProxyBundle(ImageProxy imageProxy, String str) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo != null) {
            Integer num = (Integer) imageInfo.getTagBundle().getTag(str);
            if (num != null) {
                this.mCaptureId = num.intValue();
                this.mImageProxy = imageProxy;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    public void close() {
        this.mImageProxy.close();
    }

    public List<Integer> getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.mCaptureId));
    }

    public C18728c<ImageProxy> getImageProxy(int i) {
        if (i != this.mCaptureId) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return Futures.immediateFuture(this.mImageProxy);
    }
}
