package com.veriff.sdk.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.ImageProxyBundle;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import mf0.C24361g;
import p695od.C18728c;

class CaptureProcessorPipeline implements CaptureProcessor {
    private final Executor mExecutor;
    private ImageReaderProxy mIntermediateImageReader = null;
    private final int mMaxImages;
    private final CaptureProcessor mPostCaptureProcessor;
    private final CaptureProcessor mPreCaptureProcessor;
    private ImageInfo mSourceImageInfo = null;

    public CaptureProcessorPipeline(CaptureProcessor captureProcessor, int i, CaptureProcessor captureProcessor2, Executor executor) {
        this.mPreCaptureProcessor = captureProcessor;
        this.mPostCaptureProcessor = captureProcessor2;
        this.mExecutor = executor;
        this.mMaxImages = i;
    }

    public void close() {
        ImageReaderProxy imageReaderProxy = this.mIntermediateImageReader;
        if (imageReaderProxy != null) {
            imageReaderProxy.clearOnImageAvailableListener();
            this.mIntermediateImageReader.close();
        }
    }

    public void onOutputSurface(Surface surface, int i) {
        this.mPostCaptureProcessor.onOutputSurface(surface, i);
    }

    public void onResolutionUpdate(Size size) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.mMaxImages));
        this.mIntermediateImageReader = androidImageReaderProxy;
        this.mPreCaptureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), 35);
        this.mPreCaptureProcessor.onResolutionUpdate(size);
        this.mPostCaptureProcessor.onResolutionUpdate(size);
        this.mIntermediateImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() {
            public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                CaptureProcessorPipeline.this.postProcess(imageReaderProxy.acquireNextImage());
            }
        }, this.mExecutor);
    }

    public void postProcess(ImageProxy imageProxy) {
        Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        this.mSourceImageInfo.getClass();
        String next = this.mSourceImageInfo.getTagBundle().listKeys().iterator().next();
        int intValue = ((Integer) this.mSourceImageInfo.getTagBundle().getTag(next)).intValue();
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, this.mSourceImageInfo);
        this.mSourceImageInfo = null;
        SettableImageProxyBundle settableImageProxyBundle = new SettableImageProxyBundle(Collections.singletonList(Integer.valueOf(intValue)), next);
        settableImageProxyBundle.addImageProxy(settableImageProxy);
        this.mPostCaptureProcessor.process(settableImageProxyBundle);
    }

    public void process(ImageProxyBundle imageProxyBundle) {
        C18728c<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(imageProxyBundle.getCaptureIds().get(0).intValue());
        C24361g.m61175n(imageProxy.isDone());
        try {
            this.mSourceImageInfo = imageProxy.get().getImageInfo();
            this.mPreCaptureProcessor.process(imageProxyBundle);
        } catch (InterruptedException | ExecutionException unused) {
            throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
        }
    }
}
