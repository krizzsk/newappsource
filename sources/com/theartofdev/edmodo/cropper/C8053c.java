package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.theartofdev.edmodo.cropper.c */
public final class C8053c {

    /* renamed from: a */
    public static final Rect f24480a = new Rect();

    /* renamed from: b */
    public static final RectF f24481b = new RectF();

    /* renamed from: c */
    public static final RectF f24482c = new RectF();

    /* renamed from: d */
    public static final float[] f24483d = new float[6];

    /* renamed from: e */
    public static final float[] f24484e = new float[6];

    /* renamed from: f */
    public static int f24485f;

    /* renamed from: g */
    public static Pair<String, WeakReference<Bitmap>> f24486g;

    /* renamed from: com.theartofdev.edmodo.cropper.c$a */
    public static final class C8054a {

        /* renamed from: a */
        public final Bitmap f24487a;

        /* renamed from: b */
        public final int f24488b;

        public C8054a(Bitmap bitmap, int i) {
            this.f24487a = bitmap;
            this.f24488b = i;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.c$b */
    public static final class C8055b {

        /* renamed from: a */
        public final Bitmap f24489a;

        /* renamed from: b */
        public final int f24490b;

        public C8055b(Bitmap bitmap, int i) {
            this.f24489a = bitmap;
            this.f24490b = i;
        }
    }

    /* renamed from: a */
    public static int m18371a(int i, int i2) {
        int i3 = 1;
        if (f24485f == 0) {
            int i4 = 2048;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
                int i5 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i5];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i5, iArr);
                int[] iArr2 = new int[1];
                int i6 = 0;
                for (int i7 = 0; i7 < iArr[0]; i7++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i7], 12332, iArr2);
                    int i8 = iArr2[0];
                    if (i6 < i8) {
                        i6 = i8;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i4 = Math.max(i6, 2048);
            } catch (Exception unused) {
            }
            f24485f = i4;
        }
        if (f24485f > 0) {
            while (true) {
                int i9 = i2 / i3;
                int i11 = f24485f;
                if (i9 <= i11 && i / i3 <= i11) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public static int m18372b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: c */
    public static void m18373c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static C8054a m18374d(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        OutOfMemoryError outOfMemoryError;
        int i8 = 1;
        do {
            try {
                return m18375e(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                i8 *= 2;
                if (i8 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
                }
            }
        } while (i8 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        throw new java.lang.RuntimeException("Failed to load sampled bitmap: " + r7 + "\r\n" + r0.getMessage(), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[SYNTHETIC, Splitter:B:41:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fd A[ExcHandler: Exception (r0v3 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:41:0x009f] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.theartofdev.edmodo.cropper.C8053c.C8054a m18375e(android.content.Context r18, android.net.Uri r19, float[] r20, int r21, int r22, int r23, boolean r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, int r31) {
        /*
            r7 = r19
            r0 = r20
            r10 = r21
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            android.graphics.Rect r8 = m18384n(r1, r2, r3, r4, r5, r6)
            if (r27 <= 0) goto L_0x001b
            r9 = r27
            goto L_0x0020
        L_0x001b:
            int r1 = r8.width()
            r9 = r1
        L_0x0020:
            if (r28 <= 0) goto L_0x0025
            r11 = r28
            goto L_0x002a
        L_0x0025:
            int r1 = r8.height()
            r11 = r1
        L_0x002a:
            r17 = 0
            r1 = r18
            r2 = r19
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r31
            com.theartofdev.edmodo.cropper.c$a r1 = m18381k(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0040 }
            android.graphics.Bitmap r2 = r1.f24487a     // Catch:{ Exception -> 0x0040 }
            int r1 = r1.f24488b     // Catch:{ Exception -> 0x0042 }
            r12 = r1
            r13 = r2
            goto L_0x0045
        L_0x0040:
            r2 = r17
        L_0x0042:
            r1 = 1
            r13 = r2
            r12 = 1
        L_0x0045:
            if (r13 == 0) goto L_0x009f
            if (r10 > 0) goto L_0x004d
            if (r29 != 0) goto L_0x004d
            if (r30 == 0) goto L_0x007e
        L_0x004d:
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x0098 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0098 }
            float r1 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0098 }
            r6.setRotate(r1)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r29 == 0) goto L_0x005f
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0061
        L_0x005f:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0061:
            if (r30 == 0) goto L_0x0065
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0065:
            r6.postScale(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r2 = 0
            r3 = 0
            int r4 = r13.getWidth()     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r13.getHeight()     // Catch:{ OutOfMemoryError -> 0x0098 }
            r7 = 0
            r1 = r13
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r1 == r13) goto L_0x007d
            r13.recycle()     // Catch:{ OutOfMemoryError -> 0x0098 }
        L_0x007d:
            r13 = r1
        L_0x007e:
            int r1 = r10 % 90
            if (r1 == 0) goto L_0x0092
            r1 = r13
            r2 = r20
            r3 = r8
            r4 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            android.graphics.Bitmap r13 = m18378h(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0098 }
        L_0x0092:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r13, r12)
            return r0
        L_0x0098:
            r0 = move-exception
            if (r13 == 0) goto L_0x009e
            r13.recycle()
        L_0x009e:
            throw r0
        L_0x009f:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            int r2 = r8.width()     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            int r3 = r8.height()     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            int r2 = m18372b(r2, r3, r9, r11)     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            int r2 = r2 * r31
            r1.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            android.content.ContentResolver r3 = r18.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            android.graphics.Bitmap r3 = m18379i(r3, r7, r1)     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00f5
            int r4 = r0.length     // Catch:{ all -> 0x00f0 }
            float[] r9 = new float[r4]     // Catch:{ all -> 0x00f0 }
            int r5 = r0.length     // Catch:{ all -> 0x00f0 }
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r9, r6, r5)     // Catch:{ all -> 0x00f0 }
        L_0x00c6:
            if (r6 >= r4) goto L_0x00d3
            r0 = r9[r6]     // Catch:{ all -> 0x00f0 }
            int r5 = r1.inSampleSize     // Catch:{ all -> 0x00f0 }
            float r5 = (float) r5     // Catch:{ all -> 0x00f0 }
            float r0 = r0 / r5
            r9[r6] = r0     // Catch:{ all -> 0x00f0 }
            int r6 = r6 + 1
            goto L_0x00c6
        L_0x00d3:
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r10 = r21
            r11 = r24
            r12 = r25
            r13 = r26
            r15 = r29
            r16 = r30
            android.graphics.Bitmap r1 = m18377g(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00f0 }
            if (r1 == r3) goto L_0x00f7
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x00ec, Exception -> 0x00fd }
            goto L_0x00f7
        L_0x00ec:
            r0 = move-exception
            r17 = r1
            goto L_0x0122
        L_0x00f0:
            r0 = move-exception
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0121, Exception -> 0x00fd }
        L_0x00f5:
            r1 = r17
        L_0x00f7:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r1, r2)
            return r0
        L_0x00fd:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load sampled bitmap: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "\r\n"
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            if (r17 == 0) goto L_0x0127
            r17.recycle()
        L_0x0127:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C8053c.m18375e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: f */
    public static C8054a m18376f(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new C8054a(m18377g(bitmap, fArr, i, z, i2, i3, 1.0f / ((float) i4), z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e;
                }
            }
        } while (i4 > 8);
        throw e;
    }

    /* renamed from: g */
    public static Bitmap m18377g(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2;
        Bitmap bitmap2 = bitmap;
        int i4 = i;
        float f3 = f;
        Rect n = m18384n(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i4, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        if (z2) {
            f2 = -f3;
        } else {
            f2 = f3;
        }
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f2, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, n.left, n.top, n.width(), n.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        if (i4 % 90 != 0) {
            return m18378h(createBitmap, fArr, n, i, z, i2, i3);
        }
        return createBitmap;
    }

    /* renamed from: h */
    public static Bitmap m18378h(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i);
        if (i < 90 || (i > 180 && i < 270)) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= fArr.length) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                break;
            }
            float f = fArr[i9];
            if (f >= ((float) (i4 - 1)) && f <= ((float) (i4 + 1))) {
                int i11 = i9 + 1;
                int abs = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i11])));
                int abs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i11] - ((float) rect.top))));
                int abs3 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i11])) / Math.cos(radians));
                i7 = abs2;
                i6 = abs3;
                i5 = abs;
                i8 = (int) Math.abs(((double) (fArr[i11] - ((float) rect.top))) / Math.sin(radians));
                break;
            }
            i9 += 2;
        }
        rect.set(i5, i7, i8 + i5, i6 + i7);
        if (z) {
            m18382l(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        m18373c((java.io.Closeable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r4.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        m18373c((java.io.Closeable) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m18379i(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Rect r1 = f24480a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0011 }
            m18373c(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            goto L_0x0038
        L_0x0011:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x000f }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x000f }
            m18373c(r0)
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Failed to decode image: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x0038:
            m18373c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C8053c.m18379i(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static C8054a m18380j(Context context, Uri uri, int i, int i2) {
        InputStream inputStream;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, f24480a, options);
                    options.inJustDecodeBounds = false;
                    m18373c(inputStream);
                    int i3 = options.outWidth;
                    if (i3 == -1) {
                        if (options.outHeight == -1) {
                            throw new RuntimeException("File is not a picture");
                        }
                    }
                    options.inSampleSize = Math.max(m18372b(i3, options.outHeight, i, i2), m18371a(options.outWidth, options.outHeight));
                    return new C8054a(m18379i(contentResolver, uri, options), options.inSampleSize);
                } catch (Throwable th) {
                    th = th;
                    m18373c(inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                m18373c(inputStream);
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        m18373c(r5);
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0039 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.theartofdev.edmodo.cropper.C8053c.C8054a m18381k(android.content.Context r5, android.net.Uri r6, android.graphics.Rect r7, int r8, int r9, int r10) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r1.<init>()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            int r2 = r7.width()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            int r3 = r7.height()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            int r8 = m18372b(r2, r3, r8, r9)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            int r10 = r10 * r8
            r1.inSampleSize = r10     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r8 = 0
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8)     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
        L_0x0023:
            com.theartofdev.edmodo.cropper.c$a r9 = new com.theartofdev.edmodo.cropper.c$a     // Catch:{ OutOfMemoryError -> 0x0039 }
            android.graphics.Bitmap r10 = r8.decodeRegion(r7, r1)     // Catch:{ OutOfMemoryError -> 0x0039 }
            int r2 = r1.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0039 }
            r9.<init>(r10, r2)     // Catch:{ OutOfMemoryError -> 0x0039 }
            m18373c(r5)
            r8.recycle()
            return r9
        L_0x0035:
            r6 = move-exception
            goto L_0x0052
        L_0x0037:
            r7 = move-exception
            goto L_0x0054
        L_0x0039:
            int r9 = r1.inSampleSize     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            int r9 = r9 * 2
            r1.inSampleSize = r9     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            r10 = 512(0x200, float:7.175E-43)
            if (r9 <= r10) goto L_0x0023
            m18373c(r5)
            if (r8 == 0) goto L_0x004b
            r8.recycle()
        L_0x004b:
            com.theartofdev.edmodo.cropper.c$a r5 = new com.theartofdev.edmodo.cropper.c$a
            r6 = 1
            r5.<init>(r0, r6)
            return r5
        L_0x0052:
            r0 = r8
            goto L_0x0057
        L_0x0054:
            r0 = r8
            goto L_0x005c
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x008b
        L_0x005b:
            r7 = move-exception
        L_0x005c:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0067
        L_0x0060:
            r5 = move-exception
            r6 = r5
            r5 = r0
            goto L_0x008b
        L_0x0064:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L_0x0067:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r9.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r10 = "Failed to load sampled bitmap: "
            r9.append(r10)     // Catch:{ all -> 0x008a }
            r9.append(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "\r\n"
            r9.append(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x008a }
            r9.append(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x008a:
            r6 = move-exception
        L_0x008b:
            m18373c(r0)
            if (r5 == 0) goto L_0x0093
            r5.recycle()
        L_0x0093:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C8053c.m18381k(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: l */
    public static void m18382l(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: m */
    public static float m18383m(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: n */
    public static Rect m18384n(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(BitmapDescriptorFactory.HUE_RED, m18385o(fArr))), Math.round(Math.max(BitmapDescriptorFactory.HUE_RED, m18387q(fArr))), Math.round(Math.min((float) i, m18386p(fArr))), Math.round(Math.min((float) i2, m18383m(fArr))));
        if (z) {
            m18382l(rect, i3, i4);
        }
        return rect;
    }

    /* renamed from: o */
    public static float m18385o(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: p */
    public static float m18386p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: q */
    public static float m18387q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: r */
    public static Bitmap m18388r(Bitmap bitmap, int i, int i2, CropImageView.RequestSizeOptions requestSizeOptions) {
        if (i > 0 && i2 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions2 = CropImageView.RequestSizeOptions.RESIZE_FIT;
                if (requestSizeOptions == requestSizeOptions2 || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_INSIDE || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        float max = Math.max(width / ((float) i), height / ((float) i2));
                        if (max > 1.0f || requestSizeOptions == requestSizeOptions2) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return bitmap;
    }
}
