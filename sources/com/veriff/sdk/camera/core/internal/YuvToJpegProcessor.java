package com.veriff.sdk.camera.core.internal;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CaptureProcessor;
import com.veriff.sdk.camera.core.impl.utils.ExifData;
import com.veriff.sdk.camera.core.internal.compat.ImageWriterCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import mf0.C24361g;

public class YuvToJpegProcessor implements CaptureProcessor {
    private static final Rect UNINITIALIZED_RECT = new Rect(0, 0, 0, 0);
    private boolean mClosed = false;
    private Rect mImageRect = UNINITIALIZED_RECT;
    private ImageWriter mImageWriter;
    private final Object mLock = new Object();
    private final int mMaxImages;
    private int mProcessingImages = 0;
    private final int mQuality;

    public YuvToJpegProcessor(int i, int i2) {
        this.mQuality = i;
        this.mMaxImages = i2;
    }

    private static ExifData getExifData(ImageProxy imageProxy) {
        ExifData.Builder builderForDevice = ExifData.builderForDevice();
        imageProxy.getImageInfo().populateExifData(builderForDevice);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                if (this.mProcessingImages != 0 || this.mImageWriter == null) {
                    Logger.m32239d("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                } else {
                    Logger.m32239d("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.mImageWriter.close();
                }
            }
        }
    }

    public void onOutputSurface(Surface surface, int i) {
        boolean z;
        if (i == 256) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("YuvToJpegProcessor only supports JPEG output format.", z);
        synchronized (this.mLock) {
            if (this.mClosed) {
                Logger.m32245w("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.mImageWriter == null) {
                this.mImageWriter = ImageWriterCompat.newInstance(surface, this.mMaxImages, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    public void onResolutionUpdate(Size size) {
        synchronized (this.mLock) {
            this.mImageRect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.veriff.sdk.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: android.media.Image} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: android.media.Image} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012a  */
    public void process(com.veriff.sdk.camera.core.impl.ImageProxyBundle r17) {
        /*
            r16 = this;
            r1 = r16
            java.util.List r0 = r17.getCaptureIds()
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.String r5 = "Processing image bundle have single capture id, but found "
            java.lang.StringBuilder r5 = p379.C13555b.m33972k(r5)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            mf0.C24361g.m61177o(r2, r5)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r17
            od.c r0 = r2.getImageProxy(r0)
            boolean r2 = r0.isDone()
            mf0.C24361g.m61175n(r2)
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            android.media.ImageWriter r5 = r1.mImageWriter     // Catch:{ all -> 0x01a8 }
            boolean r6 = r1.mClosed     // Catch:{ all -> 0x01a8 }
            if (r6 != 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            android.graphics.Rect r7 = r1.mImageRect     // Catch:{ all -> 0x01a8 }
            if (r6 == 0) goto L_0x0051
            int r8 = r1.mProcessingImages     // Catch:{ all -> 0x01a8 }
            int r8 = r8 + r4
            r1.mProcessingImages = r8     // Catch:{ all -> 0x01a8 }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
            r2 = 0
            java.lang.Object r4 = r0.get()     // Catch:{ InterruptedException -> 0x0126, ExecutionException -> 0x0124, all -> 0x0121 }
            com.veriff.sdk.camera.core.ImageProxy r4 = (com.veriff.sdk.camera.core.ImageProxy) r4     // Catch:{ InterruptedException -> 0x0126, ExecutionException -> 0x0124, all -> 0x0121 }
            if (r6 != 0) goto L_0x0088
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r7 = "Image enqueued for processing on closed processor."
            com.veriff.sdk.camera.core.Logger.m32245w(r0, r7)     // Catch:{ InterruptedException -> 0x011d, ExecutionException -> 0x011b, all -> 0x0117 }
            r4.close()     // Catch:{ InterruptedException -> 0x011d, ExecutionException -> 0x011b, all -> 0x0117 }
            java.lang.Object r7 = r1.mLock
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0077
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x0085 }
            int r2 = r0 + -1
            r1.mProcessingImages = r2     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0077
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0077
            r3 = 1
        L_0x0077:
            monitor-exit(r7)     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0084
            r5.close()
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            com.veriff.sdk.camera.core.Logger.m32239d(r0, r2)
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            android.media.Image r8 = r5.dequeueInputImage()     // Catch:{ InterruptedException -> 0x011d, ExecutionException -> 0x011b, all -> 0x0117 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0114, ExecutionException -> 0x0112, all -> 0x010f }
            r9 = r0
            com.veriff.sdk.camera.core.ImageProxy r9 = (com.veriff.sdk.camera.core.ImageProxy) r9     // Catch:{ InterruptedException -> 0x0114, ExecutionException -> 0x0112, all -> 0x010f }
            int r0 = r9.getFormat()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r4 = 35
            if (r0 != r4) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            java.lang.String r4 = "Input image is not expected YUV_420_888 image format"
            mf0.C24361g.m61193w(r4, r0)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            byte[] r11 = com.veriff.sdk.camera.core.internal.utils.ImageUtil.yuv_420_888toNv21(r9)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r12 = 17
            int r13 = r9.getWidth()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            int r14 = r9.getHeight()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            android.media.Image$Plane[] r4 = r8.getPlanes()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r4 = r4[r3]     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            int r10 = r4.position()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            com.veriff.sdk.camera.core.impl.utils.ExifOutputStream r11 = new com.veriff.sdk.camera.core.impl.utils.ExifOutputStream     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            com.veriff.sdk.camera.core.internal.YuvToJpegProcessor$ByteBufferOutputStream r12 = new com.veriff.sdk.camera.core.internal.YuvToJpegProcessor$ByteBufferOutputStream     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r12.<init>(r4)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            com.veriff.sdk.camera.core.impl.utils.ExifData r13 = getExifData(r9)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r11.<init>(r12, r13)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            int r12 = r1.mQuality     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r0.compressToJpeg(r7, r12, r11)     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            r9.close()     // Catch:{ InterruptedException -> 0x010c, ExecutionException -> 0x010a, all -> 0x0107 }
            int r0 = r4.position()     // Catch:{ InterruptedException -> 0x0105, ExecutionException -> 0x0103 }
            r4.limit(r0)     // Catch:{ InterruptedException -> 0x0105, ExecutionException -> 0x0103 }
            r4.position(r10)     // Catch:{ InterruptedException -> 0x0105, ExecutionException -> 0x0103 }
            r5.queueInputImage(r8)     // Catch:{ InterruptedException -> 0x0105, ExecutionException -> 0x0103 }
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            if (r6 == 0) goto L_0x00fb
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x0100 }
            int r2 = r0 + -1
            r1.mProcessingImages = r2     // Catch:{ all -> 0x0100 }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00fb
            r3 = 1
        L_0x00fb:
            monitor-exit(r4)     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x01a4
            goto L_0x019a
        L_0x0100:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0100 }
            throw r0
        L_0x0103:
            r0 = move-exception
            goto L_0x0128
        L_0x0105:
            r0 = move-exception
            goto L_0x0128
        L_0x0107:
            r0 = move-exception
            r2 = r9
            goto L_0x014e
        L_0x010a:
            r0 = move-exception
            goto L_0x010d
        L_0x010c:
            r0 = move-exception
        L_0x010d:
            r2 = r9
            goto L_0x0128
        L_0x010f:
            r0 = move-exception
            r2 = r8
            goto L_0x0118
        L_0x0112:
            r0 = move-exception
            goto L_0x0115
        L_0x0114:
            r0 = move-exception
        L_0x0115:
            r2 = r8
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
        L_0x0118:
            r8 = r2
            r2 = r4
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            goto L_0x011e
        L_0x011d:
            r0 = move-exception
        L_0x011e:
            r8 = r2
            r2 = r4
            goto L_0x0128
        L_0x0121:
            r0 = move-exception
            r8 = r2
            goto L_0x014e
        L_0x0124:
            r0 = move-exception
            goto L_0x0127
        L_0x0126:
            r0 = move-exception
        L_0x0127:
            r8 = r2
        L_0x0128:
            if (r6 == 0) goto L_0x017b
            java.lang.String r4 = "YuvToJpegProcessor"
            java.lang.String r7 = "Failed to process YUV -> JPEG"
            com.veriff.sdk.camera.core.Logger.m32242e(r4, r7, r0)     // Catch:{ all -> 0x014d }
            android.media.Image r4 = r5.dequeueInputImage()     // Catch:{ all -> 0x014d }
            android.media.Image$Plane[] r0 = r4.getPlanes()     // Catch:{ all -> 0x014a }
            r0 = r0[r3]     // Catch:{ all -> 0x014a }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x014a }
            r0.rewind()     // Catch:{ all -> 0x014a }
            r0.limit(r3)     // Catch:{ all -> 0x014a }
            r5.queueInputImage(r4)     // Catch:{ all -> 0x014a }
            r8 = r4
            goto L_0x017b
        L_0x014a:
            r0 = move-exception
            r8 = r4
            goto L_0x014e
        L_0x014d:
            r0 = move-exception
        L_0x014e:
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0160
            int r6 = r1.mProcessingImages     // Catch:{ all -> 0x0178 }
            int r7 = r6 + -1
            r1.mProcessingImages = r7     // Catch:{ all -> 0x0178 }
            if (r6 != 0) goto L_0x0160
            boolean r6 = r1.mClosed     // Catch:{ all -> 0x0178 }
            if (r6 == 0) goto L_0x0160
            r3 = 1
        L_0x0160:
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            if (r8 == 0) goto L_0x0166
            r8.close()
        L_0x0166:
            if (r2 == 0) goto L_0x016b
            r2.close()
        L_0x016b:
            if (r3 == 0) goto L_0x0177
            r5.close()
            java.lang.String r2 = "YuvToJpegProcessor"
            java.lang.String r3 = "Closed after completion of last image processed."
            com.veriff.sdk.camera.core.Logger.m32239d(r2, r3)
        L_0x0177:
            throw r0
        L_0x0178:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            throw r0
        L_0x017b:
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            if (r6 == 0) goto L_0x018d
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x01a5 }
            int r6 = r0 + -1
            r1.mProcessingImages = r6     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x018d
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x018d
            r3 = 1
        L_0x018d:
            monitor-exit(r4)     // Catch:{ all -> 0x01a5 }
            if (r8 == 0) goto L_0x0193
            r8.close()
        L_0x0193:
            if (r2 == 0) goto L_0x0198
            r2.close()
        L_0x0198:
            if (r3 == 0) goto L_0x01a4
        L_0x019a:
            r5.close()
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r2 = "Closed after completion of last image processed."
            com.veriff.sdk.camera.core.Logger.m32239d(r0, r2)
        L_0x01a4:
            return
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01a5 }
            throw r0
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.internal.YuvToJpegProcessor.process(com.veriff.sdk.camera.core.impl.ImageProxyBundle):void");
    }

    public static final class ByteBufferOutputStream extends OutputStream {
        private final ByteBuffer mByteBuffer;

        public ByteBufferOutputStream(ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
        }

        public void write(int i) throws IOException {
            if (this.mByteBuffer.hasRemaining()) {
                this.mByteBuffer.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.mByteBuffer.remaining() >= i2) {
                    this.mByteBuffer.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
