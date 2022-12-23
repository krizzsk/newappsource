package com.veriff.sdk.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import com.veriff.sdk.camera.core.ForwardingImageProxy;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import com.veriff.sdk.camera.core.internal.CameraCaptureResultImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {
    private final List<ImageProxy> mAcquiredImageProxies;
    private CameraCaptureCallback mCameraCaptureCallback;
    private boolean mClosed;
    private Executor mExecutor;
    private int mImageProxiesIndex;
    private final ImageReaderProxy mImageReaderProxy;
    public ImageReaderProxy.OnImageAvailableListener mListener;
    private final Object mLock;
    private final List<ImageProxy> mMatchedImageProxies;
    private final LongSparseArray<ImageInfo> mPendingImageInfos;
    private final LongSparseArray<ImageProxy> mPendingImages;
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        this(createImageReaderProxy(i, i2, i3, i4));
    }

    private static ImageReaderProxy createImageReaderProxy(int i, int i2, int i3, int i4) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }

    private void dequeImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            int indexOf = this.mMatchedImageProxies.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.mMatchedImageProxies.remove(indexOf);
                int i = this.mImageProxiesIndex;
                if (indexOf <= i) {
                    this.mImageProxiesIndex = i - 1;
                }
            }
            this.mAcquiredImageProxies.remove(imageProxy);
        }
    }

    private void enqueueImageProxy(SettableImageProxy settableImageProxy) {
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.mLock) {
            onImageAvailableListener = null;
            if (this.mMatchedImageProxies.size() < getMaxImages()) {
                settableImageProxy.addOnImageCloseListener(this);
                this.mMatchedImageProxies.add(settableImageProxy);
                onImageAvailableListener = this.mListener;
                executor = this.mExecutor;
            } else {
                Logger.m32239d("TAG", "Maximum image number reached.");
                settableImageProxy.close();
                executor = null;
            }
        }
        if (onImageAvailableListener == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C12510b(this, onImageAvailableListener, 1));
        } else {
            onImageAvailableListener.onImageAvailable(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueImageProxy$1(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    private void matchImages() {
        synchronized (this.mLock) {
            for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                ImageInfo valueAt = this.mPendingImageInfos.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                ImageProxy imageProxy = this.mPendingImages.get(timestamp);
                if (imageProxy != null) {
                    this.mPendingImages.remove(timestamp);
                    this.mPendingImageInfos.removeAt(size);
                    enqueueImageProxy(new SettableImageProxy(imageProxy, valueAt));
                }
            }
            removeStaleData();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void removeStaleData() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.mLock
            monitor-enter(r0)
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageInfo> r1 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r4 != 0) goto L_0x0032
            r2 = 1
        L_0x0032:
            mf0.C24361g.m61175n(r2)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            long r8 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            com.veriff.sdk.camera.core.ImageProxy r2 = (com.veriff.sdk.camera.core.ImageProxy) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageInfo> r2 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0087
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            r3.removeAt(r2)     // Catch:{ all -> 0x008e }
        L_0x0087:
            int r2 = r2 + -1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.MetadataImageReader.removeStaleData():void");
    }

    public ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex < this.mMatchedImageProxies.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.mMatchedImageProxies.size() - 1; i++) {
                    if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i))) {
                        arrayList.add(this.mMatchedImageProxies.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                int size = this.mMatchedImageProxies.size() - 1;
                List<ImageProxy> list = this.mMatchedImageProxies;
                this.mImageProxiesIndex = size + 1;
                ImageProxy imageProxy = list.get(size);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex < this.mMatchedImageProxies.size()) {
                List<ImageProxy> list = this.mMatchedImageProxies;
                int i = this.mImageProxiesIndex;
                this.mImageProxiesIndex = i + 1;
                ImageProxy imageProxy = list.get(i);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                Iterator it = new ArrayList(this.mMatchedImageProxies).iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                this.mMatchedImageProxies.clear();
                this.mImageReaderProxy.close();
                this.mClosed = true;
            }
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        return this.mCameraCaptureCallback;
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        return;
     */
    /* renamed from: imageIncoming */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$new$0(com.veriff.sdk.camera.core.impl.ImageReaderProxy r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mClosed     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0009:
            r1 = 0
        L_0x000a:
            r2 = 0
            com.veriff.sdk.camera.core.ImageProxy r2 = r7.acquireNextImage()     // Catch:{ IllegalStateException -> 0x0026 }
            if (r2 == 0) goto L_0x002e
            int r1 = r1 + 1
            android.util.LongSparseArray<com.veriff.sdk.camera.core.ImageProxy> r3 = r6.mPendingImages     // Catch:{ all -> 0x0039 }
            com.veriff.sdk.camera.core.ImageInfo r4 = r2.getImageInfo()     // Catch:{ all -> 0x0039 }
            long r4 = r4.getTimestamp()     // Catch:{ all -> 0x0039 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0039 }
            r6.matchImages()     // Catch:{ all -> 0x0039 }
            goto L_0x002e
        L_0x0024:
            r7 = move-exception
            goto L_0x0038
        L_0x0026:
            r3 = move-exception
            java.lang.String r4 = "MetadataImageReader"
            java.lang.String r5 = "Failed to acquire next image."
            com.veriff.sdk.camera.core.Logger.m32240d(r4, r5, r3)     // Catch:{ all -> 0x0024 }
        L_0x002e:
            if (r2 == 0) goto L_0x0036
            int r2 = r7.getMaxImages()     // Catch:{ all -> 0x0039 }
            if (r1 < r2) goto L_0x000a
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0038:
            throw r7     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.MetadataImageReader.lambda$new$0(com.veriff.sdk.camera.core.impl.ImageReaderProxy):void");
    }

    public void onImageClose(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            dequeImageProxy(imageProxy);
        }
    }

    public void resultIncoming(CameraCaptureResult cameraCaptureResult) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                matchImages();
            }
        }
    }

    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            onImageAvailableListener.getClass();
            this.mListener = onImageAvailableListener;
            executor.getClass();
            this.mExecutor = executor;
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, executor);
        }
    }

    public MetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.mLock = new Object();
        this.mCameraCaptureCallback = new CameraCaptureCallback() {
            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(cameraCaptureResult);
                MetadataImageReader.this.resultIncoming(cameraCaptureResult);
            }
        };
        this.mTransformedListener = new C12515d0(this);
        this.mClosed = false;
        this.mPendingImageInfos = new LongSparseArray<>();
        this.mPendingImages = new LongSparseArray<>();
        this.mAcquiredImageProxies = new ArrayList();
        this.mImageReaderProxy = imageReaderProxy;
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new ArrayList(getMaxImages());
    }
}
