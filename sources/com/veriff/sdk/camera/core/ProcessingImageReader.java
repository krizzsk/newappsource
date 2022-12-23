package com.veriff.sdk.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CaptureBundle;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p695od.C18728c;

class ProcessingImageReader implements ImageReaderProxy {
    private final List<Integer> mCaptureIdList;
    public final CaptureProcessor mCaptureProcessor;
    private FutureCallback<List<ImageProxy>> mCaptureStageReadyCallback;
    public CallbackToFutureAdapter.C0673a<Void> mCloseCompleter;
    private C18728c<Void> mCloseFuture;
    public boolean mClosed;
    public Executor mExecutor;
    private ImageReaderProxy.OnImageAvailableListener mImageProcessedListener;
    public final MetadataImageReader mInputImageReader;
    public ImageReaderProxy.OnImageAvailableListener mListener;
    public final Object mLock;
    public final ImageReaderProxy mOutputImageReader;
    public final Executor mPostProcessExecutor;
    public boolean mProcessing;
    public SettableImageProxyBundle mSettableImageProxyBundle;
    private String mTagBundleKey;
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    public ProcessingImageReader(int i, int i2, int i3, int i4, Executor executor, CaptureBundle captureBundle, CaptureProcessor captureProcessor, int i5) {
        this(new MetadataImageReader(i, i2, i3, i4), executor, captureBundle, captureProcessor, i5);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$0(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "ProcessingImageReader-close";
    }

    public ImageProxy acquireLatestImage() {
        ImageProxy acquireLatestImage;
        synchronized (this.mLock) {
            acquireLatestImage = this.mOutputImageReader.acquireLatestImage();
        }
        return acquireLatestImage;
    }

    public ImageProxy acquireNextImage() {
        ImageProxy acquireNextImage;
        synchronized (this.mLock) {
            acquireNextImage = this.mOutputImageReader.acquireNextImage();
        }
        return acquireNextImage;
    }

    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
            this.mInputImageReader.clearOnImageAvailableListener();
            this.mOutputImageReader.clearOnImageAvailableListener();
            if (!this.mProcessing) {
                this.mSettableImageProxyBundle.close();
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mOutputImageReader.clearOnImageAvailableListener();
                if (!this.mProcessing) {
                    this.mInputImageReader.close();
                    this.mSettableImageProxyBundle.close();
                    this.mOutputImageReader.close();
                    CallbackToFutureAdapter.C0673a<Void> aVar = this.mCloseCompleter;
                    if (aVar != null) {
                        aVar.mo2697b(null);
                    }
                }
                this.mClosed = true;
            }
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        CameraCaptureCallback cameraCaptureCallback;
        synchronized (this.mLock) {
            cameraCaptureCallback = this.mInputImageReader.getCameraCaptureCallback();
        }
        return cameraCaptureCallback;
    }

    public C18728c<Void> getCloseFuture() {
        C18728c<Void> cVar;
        synchronized (this.mLock) {
            if (!this.mClosed || this.mProcessing) {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = CallbackToFutureAdapter.m1884a(new C12519f0(this));
                }
                cVar = Futures.nonCancellationPropagating(this.mCloseFuture);
            } else {
                cVar = Futures.immediateFuture(null);
            }
        }
        return cVar;
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mInputImageReader.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mOutputImageReader.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mInputImageReader.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mInputImageReader.getSurface();
        }
        return surface;
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mInputImageReader.getWidth();
        }
        return width;
    }

    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                try {
                    ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                    if (acquireNextImage != null) {
                        Integer num = (Integer) acquireNextImage.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                        if (!this.mCaptureIdList.contains(num)) {
                            Logger.m32245w("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                            acquireNextImage.close();
                        } else {
                            this.mSettableImageProxyBundle.addImageProxy(acquireNextImage);
                        }
                    }
                } catch (IllegalStateException e) {
                    Logger.m32242e("ProcessingImageReader", "Failed to acquire latest image.", e);
                }
                return;
            }
            return;
        }
    }

    public void setCaptureBundle(CaptureBundle captureBundle) {
        synchronized (this.mLock) {
            if (captureBundle.getCaptureStages() != null) {
                if (this.mInputImageReader.getMaxImages() >= captureBundle.getCaptureStages().size()) {
                    this.mCaptureIdList.clear();
                    for (CaptureStage next : captureBundle.getCaptureStages()) {
                        if (next != null) {
                            this.mCaptureIdList.add(Integer.valueOf(next.getId()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(captureBundle.hashCode());
            this.mTagBundleKey = num;
            this.mSettableImageProxyBundle = new SettableImageProxyBundle(this.mCaptureIdList, num);
            setupSettableImageProxyBundleCallbacks();
        }
    }

    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            onImageAvailableListener.getClass();
            this.mListener = onImageAvailableListener;
            executor.getClass();
            this.mExecutor = executor;
            this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, executor);
            this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, executor);
        }
    }

    public void setupSettableImageProxyBundleCallbacks() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.mCaptureIdList) {
            arrayList.add(this.mSettableImageProxyBundle.getImageProxy(intValue.intValue()));
        }
        Futures.addCallback(Futures.allAsList(arrayList), this.mCaptureStageReadyCallback, this.mPostProcessExecutor);
    }

    public ProcessingImageReader(MetadataImageReader metadataImageReader, Executor executor, CaptureBundle captureBundle, CaptureProcessor captureProcessor, int i) {
        this.mLock = new Object();
        this.mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() {
            public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ProcessingImageReader.this.imageIncoming(imageReaderProxy);
            }
        };
        this.mImageProcessedListener = new ImageReaderProxy.OnImageAvailableListener() {
            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onImageAvailable$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
                onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
            }

            public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
                Executor executor;
                synchronized (ProcessingImageReader.this.mLock) {
                    ProcessingImageReader processingImageReader = ProcessingImageReader.this;
                    onImageAvailableListener = processingImageReader.mListener;
                    executor = processingImageReader.mExecutor;
                    processingImageReader.mSettableImageProxyBundle.reset();
                    ProcessingImageReader.this.setupSettableImageProxyBundleCallbacks();
                }
                if (onImageAvailableListener == null) {
                    return;
                }
                if (executor != null) {
                    executor.execute(new C12521g0(0, this, onImageAvailableListener));
                } else {
                    onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
                }
            }
        };
        this.mCaptureStageReadyCallback = new FutureCallback<List<ImageProxy>>() {
            public void onFailure(Throwable th) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
                monitor-enter(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                r3 = r2.this$0;
                r3.mProcessing = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
                if (r3.mClosed == false) goto L_0x0043;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
                r3.mInputImageReader.close();
                r2.this$0.mSettableImageProxyBundle.close();
                r2.this$0.mOutputImageReader.close();
                r3 = r2.this$0.mCloseCompleter;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
                if (r3 == null) goto L_0x0043;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
                r3.mo2697b(null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
                monitor-exit(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
                r0.mCaptureProcessor.process(r1);
                r0 = r2.this$0.mLock;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(java.util.List<com.veriff.sdk.camera.core.ImageProxy> r3) {
                /*
                    r2 = this;
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this
                    java.lang.Object r3 = r3.mLock
                    monitor-enter(r3)
                    com.veriff.sdk.camera.core.ProcessingImageReader r0 = com.veriff.sdk.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0048 }
                    boolean r1 = r0.mClosed     // Catch:{ all -> 0x0048 }
                    if (r1 == 0) goto L_0x000d
                    monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                    return
                L_0x000d:
                    r1 = 1
                    r0.mProcessing = r1     // Catch:{ all -> 0x0048 }
                    com.veriff.sdk.camera.core.SettableImageProxyBundle r1 = r0.mSettableImageProxyBundle     // Catch:{ all -> 0x0048 }
                    monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                    com.veriff.sdk.camera.core.impl.CaptureProcessor r3 = r0.mCaptureProcessor
                    r3.process(r1)
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this
                    java.lang.Object r0 = r3.mLock
                    monitor-enter(r0)
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0045 }
                    r1 = 0
                    r3.mProcessing = r1     // Catch:{ all -> 0x0045 }
                    boolean r1 = r3.mClosed     // Catch:{ all -> 0x0045 }
                    if (r1 == 0) goto L_0x0043
                    com.veriff.sdk.camera.core.MetadataImageReader r3 = r3.mInputImageReader     // Catch:{ all -> 0x0045 }
                    r3.close()     // Catch:{ all -> 0x0045 }
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0045 }
                    com.veriff.sdk.camera.core.SettableImageProxyBundle r3 = r3.mSettableImageProxyBundle     // Catch:{ all -> 0x0045 }
                    r3.close()     // Catch:{ all -> 0x0045 }
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0045 }
                    com.veriff.sdk.camera.core.impl.ImageReaderProxy r3 = r3.mOutputImageReader     // Catch:{ all -> 0x0045 }
                    r3.close()     // Catch:{ all -> 0x0045 }
                    com.veriff.sdk.camera.core.ProcessingImageReader r3 = com.veriff.sdk.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0045 }
                    androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r3 = r3.mCloseCompleter     // Catch:{ all -> 0x0045 }
                    if (r3 == 0) goto L_0x0043
                    r1 = 0
                    r3.mo2697b(r1)     // Catch:{ all -> 0x0045 }
                L_0x0043:
                    monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                    return
                L_0x0045:
                    r3 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                    throw r3
                L_0x0048:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.ProcessingImageReader.C125003.onSuccess(java.util.List):void");
            }
        };
        this.mClosed = false;
        this.mProcessing = false;
        this.mTagBundleKey = new String();
        this.mSettableImageProxyBundle = new SettableImageProxyBundle(Collections.emptyList(), this.mTagBundleKey);
        this.mCaptureIdList = new ArrayList();
        if (metadataImageReader.getMaxImages() >= captureBundle.getCaptureStages().size()) {
            this.mInputImageReader = metadataImageReader;
            int width = metadataImageReader.getWidth();
            int height = metadataImageReader.getHeight();
            if (i == 256) {
                width = metadataImageReader.getWidth() * metadataImageReader.getHeight();
                height = 1;
            }
            AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(width, height, i, metadataImageReader.getMaxImages()));
            this.mOutputImageReader = androidImageReaderProxy;
            this.mPostProcessExecutor = executor;
            this.mCaptureProcessor = captureProcessor;
            captureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), i);
            captureProcessor.onResolutionUpdate(new Size(metadataImageReader.getWidth(), metadataImageReader.getHeight()));
            setCaptureBundle(captureBundle);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }
}
