package com.veriff.sdk.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.impl.SingleImageProxyBundle;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ScheduledExecutorService;
import p695od.C18728c;

final class ProcessingSurface extends DeferrableSurface {
    private final CameraCaptureCallback mCameraCaptureCallback;
    public final CaptureProcessor mCaptureProcessor;
    public final CaptureStage mCaptureStage;
    private final Handler mImageReaderHandler;
    public final MetadataImageReader mInputImageReader;
    public final Surface mInputSurface;
    public final Object mLock = new Object();
    private final DeferrableSurface mOutputDeferrableSurface;
    public boolean mReleased;
    private String mTagBundleKey;

    public ProcessingSurface(int i, int i2, int i3, Handler handler, CaptureStage captureStage, CaptureProcessor captureProcessor, DeferrableSurface deferrableSurface, String str) {
        super(new Size(i, i2), i3);
        C12523h0 h0Var = new C12523h0(this);
        this.mReleased = false;
        Size size = new Size(i, i2);
        if (handler != null) {
            this.mImageReaderHandler = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mImageReaderHandler = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(this.mImageReaderHandler);
        MetadataImageReader metadataImageReader = new MetadataImageReader(i, i2, i3, 2);
        this.mInputImageReader = metadataImageReader;
        metadataImageReader.setOnImageAvailableListener(h0Var, newHandlerExecutor);
        this.mInputSurface = metadataImageReader.getSurface();
        this.mCameraCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onResolutionUpdate(size);
        this.mCaptureStage = captureStage;
        this.mOutputDeferrableSurface = deferrableSurface;
        this.mTagBundleKey = str;
        Futures.addCallback(deferrableSurface.getSurface(), new FutureCallback<Surface>() {
            public void onFailure(Throwable th) {
                Logger.m32242e("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
            }

            public void onSuccess(Surface surface) {
                synchronized (ProcessingSurface.this.mLock) {
                    ProcessingSurface.this.mCaptureProcessor.onOutputSurface(surface, 1);
                }
            }
        }, CameraXExecutors.directExecutor());
        getTerminationFuture().addListener(new C12567q(this, 1), CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            imageIncoming(imageReaderProxy);
        }
    }

    /* access modifiers changed from: private */
    public void release() {
        synchronized (this.mLock) {
            if (!this.mReleased) {
                this.mInputImageReader.close();
                this.mInputSurface.release();
                this.mOutputDeferrableSurface.close();
                this.mReleased = true;
            }
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        CameraCaptureCallback cameraCaptureCallback;
        synchronized (this.mLock) {
            if (!this.mReleased) {
                cameraCaptureCallback = this.mCameraCaptureCallback;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return cameraCaptureCallback;
    }

    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        if (!this.mReleased) {
            ImageProxy imageProxy = null;
            try {
                imageProxy = imageReaderProxy.acquireNextImage();
            } catch (IllegalStateException e) {
                Logger.m32242e("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
            }
            if (imageProxy != null) {
                ImageInfo imageInfo = imageProxy.getImageInfo();
                if (imageInfo == null) {
                    imageProxy.close();
                    return;
                }
                Integer num = (Integer) imageInfo.getTagBundle().getTag(this.mTagBundleKey);
                if (num == null) {
                    imageProxy.close();
                } else if (this.mCaptureStage.getId() != num.intValue()) {
                    Logger.m32245w("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
                    imageProxy.close();
                } else {
                    SingleImageProxyBundle singleImageProxyBundle = new SingleImageProxyBundle(imageProxy, this.mTagBundleKey);
                    this.mCaptureProcessor.process(singleImageProxyBundle);
                    singleImageProxyBundle.close();
                }
            }
        }
    }

    public C18728c<Surface> provideSurface() {
        C18728c<Surface> immediateFuture;
        synchronized (this.mLock) {
            immediateFuture = Futures.immediateFuture(this.mInputSurface);
        }
        return immediateFuture;
    }
}
