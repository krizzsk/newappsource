package androidx.camera.core;

import android.util.Log;
import android.view.Surface;
import androidx.camera.core.C0544a;
import java.nio.ByteBuffer;
import java.util.Locale;
import p054d0.C4289j0;
import p054d0.C4315v0;

final class ImageProcessingUtil {

    /* renamed from: a */
    public static int f1839a;

    public enum Result {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: a */
    public static void m1487a(C0627p pVar) {
        Result result;
        if (!m1489c(pVar)) {
            C4289j0.m11435b("ImageProcessingUtil");
            return;
        }
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int c = ((C0544a.C0545a) pVar.getPlanes()[0]).mo2408c();
        int c2 = ((C0544a.C0545a) pVar.getPlanes()[1]).mo2408c();
        int c3 = ((C0544a.C0545a) pVar.getPlanes()[2]).mo2408c();
        int b = ((C0544a.C0545a) pVar.getPlanes()[0]).mo2407b();
        int b2 = ((C0544a.C0545a) pVar.getPlanes()[1]).mo2407b();
        if (nativeShiftPixel(((C0544a.C0545a) pVar.getPlanes()[0]).mo2406a(), c, ((C0544a.C0545a) pVar.getPlanes()[1]).mo2406a(), c2, ((C0544a.C0545a) pVar.getPlanes()[2]).mo2406a(), c3, b, b2, width, height, b, b2, b2) != 0) {
            result = Result.ERROR_CONVERSION;
        } else {
            result = Result.SUCCESS;
        }
        if (result == Result.ERROR_CONVERSION) {
            C4289j0.m11435b("ImageProcessingUtil");
        }
    }

    /* renamed from: b */
    public static C4315v0 m1488b(C0627p pVar, C0642t tVar, ByteBuffer byteBuffer, int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        Result result;
        int i5 = i;
        if (!m1489c(pVar)) {
            C4289j0.m11435b("ImageProcessingUtil");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i5 == 0 || i5 == 90 || i5 == 180 || i5 == 270) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C4289j0.m11435b("ImageProcessingUtil");
            return null;
        }
        Surface surface = tVar.getSurface();
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int c = ((C0544a.C0545a) pVar.getPlanes()[0]).mo2408c();
        int c2 = ((C0544a.C0545a) pVar.getPlanes()[1]).mo2408c();
        int c3 = ((C0544a.C0545a) pVar.getPlanes()[2]).mo2408c();
        int b = ((C0544a.C0545a) pVar.getPlanes()[0]).mo2407b();
        int b2 = ((C0544a.C0545a) pVar.getPlanes()[1]).mo2407b();
        if (z) {
            i2 = b;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = b2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = b2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(((C0544a.C0545a) pVar.getPlanes()[0]).mo2406a(), c, ((C0544a.C0545a) pVar.getPlanes()[1]).mo2406a(), c2, ((C0544a.C0545a) pVar.getPlanes()[2]).mo2406a(), c3, b, b2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            result = Result.ERROR_CONVERSION;
        } else {
            result = Result.SUCCESS;
        }
        if (result == Result.ERROR_CONVERSION) {
            C4289j0.m11435b("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1839a)});
            C4289j0.m11435b("ImageProcessingUtil");
            f1839a++;
        }
        C0627p acquireLatestImage = tVar.acquireLatestImage();
        if (acquireLatestImage == null) {
            C4289j0.m11435b("ImageProcessingUtil");
            return null;
        }
        C4315v0 v0Var = new C4315v0(acquireLatestImage);
        v0Var.mo2436a(new C0625n(acquireLatestImage, pVar));
        return v0Var;
    }

    /* renamed from: c */
    public static boolean m1489c(C0627p pVar) {
        if (pVar.getFormat() == 35 && pVar.getPlanes().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0137  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p054d0.C4315v0 m1490d(androidx.camera.core.C0627p r26, androidx.camera.core.C0642t r27, android.media.ImageWriter r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, int r32) {
        /*
            r6 = r32
            boolean r0 = m1489c(r26)
            r22 = 0
            java.lang.String r23 = "ImageProcessingUtil"
            if (r0 != 0) goto L_0x0010
            p054d0.C4289j0.m11435b(r23)
            return r22
        L_0x0010:
            r1 = 0
            r3 = 1
            if (r6 == 0) goto L_0x0023
            r0 = 90
            if (r6 == r0) goto L_0x0023
            r0 = 180(0xb4, float:2.52E-43)
            if (r6 == r0) goto L_0x0023
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 != r0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 != 0) goto L_0x002a
            p054d0.C4289j0.m11435b(r23)
            return r22
        L_0x002a:
            androidx.camera.core.ImageProcessingUtil$Result r5 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x012c
            if (r6 <= 0) goto L_0x012c
            int r19 = r26.getWidth()
            int r20 = r26.getHeight()
            androidx.camera.core.p$a[] r4 = r26.getPlanes()
            r4 = r4[r1]
            androidx.camera.core.a$a r4 = (androidx.camera.core.C0544a.C0545a) r4
            int r16 = r4.mo2408c()
            androidx.camera.core.p$a[] r4 = r26.getPlanes()
            r4 = r4[r3]
            androidx.camera.core.a$a r4 = (androidx.camera.core.C0544a.C0545a) r4
            int r17 = r4.mo2408c()
            androidx.camera.core.p$a[] r4 = r26.getPlanes()
            r15 = 2
            r4 = r4[r15]
            androidx.camera.core.a$a r4 = (androidx.camera.core.C0544a.C0545a) r4
            int r18 = r4.mo2408c()
            androidx.camera.core.p$a[] r4 = r26.getPlanes()
            r4 = r4[r3]
            androidx.camera.core.a$a r4 = (androidx.camera.core.C0544a.C0545a) r4
            int r21 = r4.mo2407b()
            if (r0 < r2) goto L_0x011e
            android.media.Image r14 = p128j0.C5346b.m13402b(r28)
            if (r14 != 0) goto L_0x0077
            goto L_0x012c
        L_0x0077:
            androidx.camera.core.p$a[] r0 = r26.getPlanes()
            r0 = r0[r1]
            androidx.camera.core.a$a r0 = (androidx.camera.core.C0544a.C0545a) r0
            java.nio.ByteBuffer r0 = r0.mo2406a()
            androidx.camera.core.p$a[] r2 = r26.getPlanes()
            r2 = r2[r3]
            androidx.camera.core.a$a r2 = (androidx.camera.core.C0544a.C0545a) r2
            java.nio.ByteBuffer r2 = r2.mo2406a()
            androidx.camera.core.p$a[] r4 = r26.getPlanes()
            r4 = r4[r15]
            androidx.camera.core.a$a r4 = (androidx.camera.core.C0544a.C0545a) r4
            java.nio.ByteBuffer r4 = r4.mo2406a()
            android.media.Image$Plane[] r7 = r14.getPlanes()
            r7 = r7[r1]
            java.nio.ByteBuffer r7 = r7.getBuffer()
            android.media.Image$Plane[] r8 = r14.getPlanes()
            r8 = r8[r1]
            int r8 = r8.getRowStride()
            android.media.Image$Plane[] r9 = r14.getPlanes()
            r1 = r9[r1]
            int r9 = r1.getPixelStride()
            android.media.Image$Plane[] r1 = r14.getPlanes()
            r1 = r1[r3]
            java.nio.ByteBuffer r10 = r1.getBuffer()
            android.media.Image$Plane[] r1 = r14.getPlanes()
            r1 = r1[r3]
            int r11 = r1.getRowStride()
            android.media.Image$Plane[] r1 = r14.getPlanes()
            r1 = r1[r3]
            int r12 = r1.getPixelStride()
            android.media.Image$Plane[] r1 = r14.getPlanes()
            r1 = r1[r15]
            java.nio.ByteBuffer r13 = r1.getBuffer()
            android.media.Image$Plane[] r1 = r14.getPlanes()
            r1 = r1[r15]
            int r1 = r1.getRowStride()
            r3 = r14
            r14 = r1
            android.media.Image$Plane[] r1 = r3.getPlanes()
            r1 = r1[r15]
            int r15 = r1.getPixelStride()
            r1 = r16
            r24 = r3
            r3 = r17
            r25 = r5
            r5 = r18
            r6 = r21
            r16 = r29
            r17 = r30
            r18 = r31
            r21 = r32
            int r0 = nativeRotateYUV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x0112
            goto L_0x012e
        L_0x0112:
            r0 = r28
            r1 = r24
            p128j0.C5345a.m13400c(r0, r1)
            androidx.camera.core.ImageProcessingUtil$Result r5 = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS
            r0 = r25
            goto L_0x0131
        L_0x011e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to call dequeueInputImage() on API "
            java.lang.String r3 = ". Version 23 or higher required."
            java.lang.String r0 = p379.C25541a.m63878h(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x012c:
            r25 = r5
        L_0x012e:
            r0 = r25
            r5 = r0
        L_0x0131:
            if (r5 != r0) goto L_0x0137
            p054d0.C4289j0.m11435b(r23)
            return r22
        L_0x0137:
            androidx.camera.core.p r0 = r27.acquireLatestImage()
            if (r0 != 0) goto L_0x0141
            p054d0.C4289j0.m11435b(r23)
            return r22
        L_0x0141:
            d0.v0 r1 = new d0.v0
            r1.<init>(r0)
            androidx.camera.core.o r2 = new androidx.camera.core.o
            r3 = r26
            r2.<init>(r0, r3)
            r1.mo2436a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.m1490d(androidx.camera.core.p, androidx.camera.core.t, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):d0.v0");
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i11, int i12);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i11, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i12, int i13, int i14);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i11);
}
