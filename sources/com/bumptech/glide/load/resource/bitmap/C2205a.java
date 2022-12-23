package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p025b6.C1489d;
import p025b6.C1492e;
import p072e6.C4564b;
import p072e6.C4566d;
import p146k6.C5498d;
import p146k6.C5510o;
import p311x6.C7176l;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public final class C2205a {

    /* renamed from: f */
    public static final C1489d<DecodeFormat> f7169f = C1489d.m3904a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final C1489d<PreferredColorSpace> f7170g = new C1489d<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C1489d.f5391e);

    /* renamed from: h */
    public static final C1489d<Boolean> f7171h;

    /* renamed from: i */
    public static final C1489d<Boolean> f7172i;

    /* renamed from: j */
    public static final Set<String> f7173j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    public static final C2206a f7174k = new C2206a();

    /* renamed from: l */
    public static final ArrayDeque f7175l = new ArrayDeque(0);

    /* renamed from: a */
    public final C4566d f7176a;

    /* renamed from: b */
    public final DisplayMetrics f7177b;

    /* renamed from: c */
    public final C4564b f7178c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f7179d;

    /* renamed from: e */
    public final C5510o f7180e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class C2206a implements C2207b {
        /* renamed from: a */
        public final void mo11007a(Bitmap bitmap, C4566d dVar) {
        }

        /* renamed from: b */
        public final void mo11008b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface C2207b {
        /* renamed from: a */
        void mo11007a(Bitmap bitmap, C4566d dVar) throws IOException;

        /* renamed from: b */
        void mo11008b();
    }

    static {
        DownsampleStrategy.C2196e eVar = DownsampleStrategy.f7148a;
        Boolean bool = Boolean.FALSE;
        f7171h = C1489d.m3904a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f7172i = C1489d.m3904a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C7176l.f22265a;
    }

    public C2205a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C4566d dVar, C4564b bVar) {
        if (C5510o.f18056j == null) {
            synchronized (C5510o.class) {
                if (C5510o.f18056j == null) {
                    C5510o.f18056j = new C5510o();
                }
            }
        }
        this.f7180e = C5510o.f18056j;
        this.f7179d = list;
        C17885a.m44458r(displayMetrics);
        this.f7177b = displayMetrics;
        C17885a.m44458r(dVar);
        this.f7176a = dVar;
        C17885a.m44458r(bVar);
        this.f7178c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0038 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m5730c(com.bumptech.glide.load.resource.bitmap.C2208b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C2205a.C2207b r6, p072e6.C4566d r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.mo11008b()
            r4.mo11010b()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p146k6.C5516u.f18075d
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo11009a(r5)     // Catch:{ IllegalArgumentException -> 0x001f }
            r3.unlock()
            return r4
        L_0x001d:
            r4 = move-exception
            goto L_0x003a
        L_0x001f:
            r3 = move-exception
            java.io.IOException r0 = m5732e(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0039
            r7.mo20086d(r1)     // Catch:{ IOException -> 0x0038 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0038 }
            android.graphics.Bitmap r4 = m5730c(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0038 }
            java.util.concurrent.locks.Lock r5 = p146k6.C5516u.f18075d
            r5.unlock()
            return r4
        L_0x0038:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x003a:
            java.util.concurrent.locks.Lock r5 = p146k6.C5516u.f18075d
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2205a.m5730c(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, e6.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: d */
    public static String m5731d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder k = C13555b.m33972k(" (");
        k.append(bitmap.getAllocationByteCount());
        k.append(")");
        String sb = k.toString();
        StringBuilder k2 = C13555b.m33972k("[");
        k2.append(bitmap.getWidth());
        k2.append("x");
        k2.append(bitmap.getHeight());
        k2.append("] ");
        k2.append(bitmap.getConfig());
        k2.append(sb);
        return k2.toString();
    }

    /* renamed from: e */
    public static IOException m5732e(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder s = C0016g.m35s("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        s.append(str);
        s.append(", inBitmap: ");
        s.append(m5731d(options.inBitmap));
        return new IOException(s.toString(), illegalArgumentException);
    }

    /* renamed from: f */
    public static void m5733f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public final C5498d mo11005a(C2208b bVar, int i, int i2, C1492e eVar, C2207b bVar2) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        C1492e eVar2 = eVar;
        byte[] bArr = (byte[]) this.f7178c.mo20074c(SQLiteDatabase.OPEN_FULLMUTEX, byte[].class);
        synchronized (C2205a.class) {
            arrayDeque = f7175l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m5733f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar2.mo5848c(f7169f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) eVar2.mo5848c(f7170g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar2.mo5848c(DownsampleStrategy.f7153f);
        boolean booleanValue = ((Boolean) eVar2.mo5848c(f7171h)).booleanValue();
        C1489d dVar = f7172i;
        if (eVar2.mo5848c(dVar) == null || !((Boolean) eVar2.mo5848c(dVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            C5498d c = C5498d.m13681c(mo11006b(bVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, z, i, i2, booleanValue, bVar2), this.f7176a);
            m5733f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f7178c.put(bArr);
            return c;
        } catch (Throwable th) {
            m5733f(options2);
            ArrayDeque arrayDeque2 = f7175l;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f7178c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01bf  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo11006b(com.bumptech.glide.load.resource.bitmap.C2208b r24, android.graphics.BitmapFactory.Options r25, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r26, com.bumptech.glide.load.DecodeFormat r27, com.bumptech.glide.load.PreferredColorSpace r28, boolean r29, int r30, int r31, boolean r32, com.bumptech.glide.load.resource.bitmap.C2205a.C2207b r33) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r8 = r25
            r2 = r26
            r9 = r28
            r10 = r33
            int r3 = p311x6.C7171h.f22255a
            android.os.SystemClock.elapsedRealtimeNanos()
            e6.d r3 = r0.f7176a
            r4 = 1
            r8.inJustDecodeBounds = r4
            m5730c(r1, r8, r10, r3)
            r3 = 0
            r8.inJustDecodeBounds = r3
            int r11 = r8.outWidth
            int r12 = r8.outHeight
            r3 = -1
            if (r11 == r3) goto L_0x0029
            if (r12 != r3) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r6 = r29
            goto L_0x002b
        L_0x0029:
            r3 = 0
            r6 = 0
        L_0x002b:
            int r13 = r24.mo11011c()
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            switch(r13) {
                case 3: goto L_0x003e;
                case 4: goto L_0x003e;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0038;
                case 8: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r5 = 0
            goto L_0x0040
        L_0x0038:
            r5 = 270(0x10e, float:3.78E-43)
            goto L_0x0040
        L_0x003b:
            r5 = 90
            goto L_0x0040
        L_0x003e:
            r5 = 180(0xb4, float:2.52E-43)
        L_0x0040:
            switch(r13) {
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0045;
                case 8: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r7 = 0
            goto L_0x0046
        L_0x0045:
            r7 = 1
        L_0x0046:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r30
            if (r15 != r14) goto L_0x005e
            if (r5 == r4) goto L_0x0053
            if (r5 != r3) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r3 = 0
            goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            if (r3 == 0) goto L_0x005a
            r3 = r31
            r15 = r12
            goto L_0x0060
        L_0x005a:
            r3 = r31
            r15 = r11
            goto L_0x0060
        L_0x005e:
            r3 = r31
        L_0x0060:
            if (r3 != r14) goto L_0x0072
            if (r5 == r4) goto L_0x006b
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 != r3) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r3 = 0
            goto L_0x006c
        L_0x006b:
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x0070
            r14 = r11
            goto L_0x0073
        L_0x0070:
            r14 = r12
            goto L_0x0073
        L_0x0072:
            r14 = r3
        L_0x0073:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r24.mo11012d()
            e6.d r4 = r0.f7176a
            r29 = r13
            java.lang.String r13 = "Downsampler"
            if (r11 <= 0) goto L_0x023b
            if (r12 > 0) goto L_0x008d
            r2 = 3
            r17 = r6
            r16 = r7
            r9 = r11
            r0 = r13
            r11 = r14
            r13 = r12
            r12 = r15
            goto L_0x0248
        L_0x008d:
            r9 = 90
            if (r5 == r9) goto L_0x0098
            r9 = 270(0x10e, float:3.78E-43)
            if (r5 != r9) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r5 = 0
            goto L_0x0099
        L_0x0098:
            r5 = 1
        L_0x0099:
            r16 = r7
            if (r5 == 0) goto L_0x00a0
            r9 = r11
            r5 = r12
            goto L_0x00a2
        L_0x00a0:
            r5 = r11
            r9 = r12
        L_0x00a2:
            float r7 = r2.mo10993b(r5, r9, r15, r14)
            r17 = 0
            int r17 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r17 <= 0) goto L_0x01f6
            r17 = r6
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r6 = r2.mo10992a(r5, r9, r15, r14)
            if (r6 == 0) goto L_0x01ee
            float r0 = (float) r5
            r30 = r13
            float r13 = r7 * r0
            r18 = r11
            r19 = r12
            double r11 = (double) r13
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r11 = r11 + r20
            int r11 = (int) r11
            float r12 = (float) r9
            float r13 = r7 * r12
            r31 = r14
            double r13 = (double) r13
            double r13 = r13 + r20
            int r13 = (int) r13
            int r11 = r5 / r11
            int r13 = r9 / r13
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r14 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
            if (r6 != r14) goto L_0x00d9
            int r11 = java.lang.Math.max(r11, r13)
            goto L_0x00dd
        L_0x00d9:
            int r11 = java.lang.Math.min(r11, r13)
        L_0x00dd:
            int r13 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r13 > r2) goto L_0x00f1
            java.util.Set<java.lang.String> r2 = f7173j
            r22 = r15
            java.lang.String r15 = r8.outMimeType
            boolean r2 = r2.contains(r15)
            if (r2 == 0) goto L_0x00f3
            r2 = 1
            goto L_0x0108
        L_0x00f1:
            r22 = r15
        L_0x00f3:
            int r2 = java.lang.Integer.highestOneBit(r11)
            r11 = 1
            int r2 = java.lang.Math.max(r11, r2)
            if (r6 != r14) goto L_0x0108
            float r6 = (float) r2
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 / r7
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0108
            int r2 = r2 << 1
        L_0x0108:
            r8.inSampleSize = r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r3 != r6) goto L_0x0129
            r3 = 8
            int r4 = java.lang.Math.min(r2, r3)
            float r4 = (float) r4
            float r0 = r0 / r4
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            float r12 = r12 / r4
            double r4 = (double) r12
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r2 = r2 / r3
            if (r2 <= 0) goto L_0x0186
            int r0 = r0 / r2
            int r4 = r4 / r2
            goto L_0x0186
        L_0x0129:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r3 == r6) goto L_0x0177
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r3 != r6) goto L_0x0132
            goto L_0x0177
        L_0x0132:
            boolean r3 = r3.isWebp()
            if (r3 == 0) goto L_0x0157
            r3 = 24
            if (r13 < r3) goto L_0x0148
            float r2 = (float) r2
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            float r12 = r12 / r2
            int r4 = java.lang.Math.round(r12)
            goto L_0x0186
        L_0x0148:
            float r2 = (float) r2
            float r0 = r0 / r2
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            float r12 = r12 / r2
            double r2 = (double) r12
            double r2 = java.lang.Math.floor(r2)
            goto L_0x0185
        L_0x0157:
            int r0 = r5 % r2
            if (r0 != 0) goto L_0x0165
            int r0 = r9 % r2
            if (r0 == 0) goto L_0x0160
            goto L_0x0165
        L_0x0160:
            int r0 = r5 / r2
            int r4 = r9 / r2
            goto L_0x0186
        L_0x0165:
            r0 = 1
            r8.inJustDecodeBounds = r0
            m5730c(r1, r8, r10, r4)
            r0 = 0
            r8.inJustDecodeBounds = r0
            int r0 = r8.outWidth
            int r2 = r8.outHeight
            r3 = r26
            r11 = r31
            goto L_0x018b
        L_0x0177:
            float r2 = (float) r2
            float r0 = r0 / r2
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            float r12 = r12 / r2
            double r2 = (double) r12
            double r2 = java.lang.Math.floor(r2)
        L_0x0185:
            int r4 = (int) r2
        L_0x0186:
            r3 = r26
            r11 = r31
            r2 = r4
        L_0x018b:
            r12 = r22
            float r0 = r3.mo10993b(r0, r2, r12, r11)
            double r2 = (double) r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x019a
            r6 = r2
            goto L_0x019c
        L_0x019a:
            double r6 = r4 / r2
        L_0x019c:
            r13 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r6 = r6 * r13
            long r6 = java.lang.Math.round(r6)
            int r7 = (int) r6
            double r13 = (double) r7
            double r13 = r13 * r2
            double r13 = r13 + r20
            int r6 = (int) r13
            float r9 = (float) r6
            float r7 = (float) r7
            float r9 = r9 / r7
            double r13 = (double) r9
            double r13 = r2 / r13
            double r6 = (double) r6
            double r13 = r13 * r6
            double r13 = r13 + r20
            int r6 = (int) r13
            r8.inTargetDensity = r6
            if (r0 > 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            double r2 = r4 / r2
        L_0x01c1:
            r4 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)
            int r0 = (int) r2
            r8.inDensity = r0
            int r2 = r8.inTargetDensity
            if (r2 <= 0) goto L_0x01d9
            if (r0 <= 0) goto L_0x01d9
            if (r2 == r0) goto L_0x01d9
            r0 = 1
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            if (r0 == 0) goto L_0x01e0
            r0 = 1
            r8.inScaled = r0
            goto L_0x01e5
        L_0x01e0:
            r0 = 0
            r8.inTargetDensity = r0
            r8.inDensity = r0
        L_0x01e5:
            r14 = r23
            r0 = r30
            r9 = r18
            r13 = r19
            goto L_0x0253
        L_0x01ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x01f6:
            r3 = r2
            r18 = r11
            r19 = r12
            r11 = r14
            r12 = r15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot scale with factor: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            java.lang.String r2 = "x"
            java.lang.String r3 = "], target: ["
            r9 = r18
            r13 = r19
            p001a0.C0016g.m41y(r1, r9, r2, r13, r3)
            r1.append(r12)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x023b:
            r17 = r6
            r16 = r7
            r9 = r11
            r30 = r13
            r11 = r14
            r13 = r12
            r12 = r15
            r2 = 3
            r0 = r30
        L_0x0248:
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L_0x0251
            java.util.Objects.toString(r3)
        L_0x0251:
            r14 = r23
        L_0x0253:
            k6.o r2 = r14.f7180e
            r3 = r12
            r4 = r11
            r5 = r25
            r6 = r17
            r7 = r16
            boolean r2 = r2.mo21383b(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0264
            goto L_0x0294
        L_0x0264:
            com.bumptech.glide.load.DecodeFormat r2 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            r3 = r27
            if (r3 == r2) goto L_0x0290
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r24.mo11012d()     // Catch:{ IOException -> 0x0273 }
            boolean r2 = r2.hasAlpha()     // Catch:{ IOException -> 0x0273 }
            goto L_0x027f
        L_0x0273:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L_0x027e
            java.util.Objects.toString(r27)
        L_0x027e:
            r2 = 0
        L_0x027f:
            if (r2 == 0) goto L_0x0284
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0286
        L_0x0284:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L_0x0286:
            r8.inPreferredConfig = r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            if (r2 != r3) goto L_0x0294
            r2 = 1
            r8.inDither = r2
            goto L_0x0294
        L_0x0290:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r8.inPreferredConfig = r2
        L_0x0294:
            int r2 = android.os.Build.VERSION.SDK_INT
            int r3 = r8.inSampleSize
            if (r9 < 0) goto L_0x02a0
            if (r13 < 0) goto L_0x02a0
            if (r32 == 0) goto L_0x02a0
            r15 = r12
            goto L_0x02d7
        L_0x02a0:
            int r4 = r8.inTargetDensity
            if (r4 <= 0) goto L_0x02ac
            int r5 = r8.inDensity
            if (r5 <= 0) goto L_0x02ac
            if (r4 == r5) goto L_0x02ac
            r5 = 1
            goto L_0x02ad
        L_0x02ac:
            r5 = 0
        L_0x02ad:
            if (r5 == 0) goto L_0x02b5
            float r4 = (float) r4
            int r5 = r8.inDensity
            float r5 = (float) r5
            float r4 = r4 / r5
            goto L_0x02b7
        L_0x02b5:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x02b7:
            float r5 = (float) r9
            float r3 = (float) r3
            float r5 = r5 / r3
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            float r6 = (float) r13
            float r6 = r6 / r3
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r3 = (int) r6
            float r5 = (float) r5
            float r5 = r5 * r4
            int r15 = java.lang.Math.round(r5)
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r11 = r3
        L_0x02d7:
            r3 = 26
            r4 = 0
            if (r15 <= 0) goto L_0x02f7
            if (r11 <= 0) goto L_0x02f7
            e6.d r5 = r14.f7176a
            if (r2 < r3) goto L_0x02ec
            android.graphics.Bitmap$Config r6 = r8.inPreferredConfig
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE
            if (r6 != r7) goto L_0x02e9
            goto L_0x02f7
        L_0x02e9:
            android.graphics.Bitmap$Config r6 = r8.outConfig
            goto L_0x02ed
        L_0x02ec:
            r6 = r4
        L_0x02ed:
            if (r6 != 0) goto L_0x02f1
            android.graphics.Bitmap$Config r6 = r8.inPreferredConfig
        L_0x02f1:
            android.graphics.Bitmap r5 = r5.mo20085c(r15, r11, r6)
            r8.inBitmap = r5
        L_0x02f7:
            r5 = r28
            if (r5 == 0) goto L_0x0328
            r6 = 28
            if (r2 < r6) goto L_0x031e
            com.bumptech.glide.load.PreferredColorSpace r2 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            if (r5 != r2) goto L_0x030f
            android.graphics.ColorSpace r2 = r8.outColorSpace
            if (r2 == 0) goto L_0x030f
            boolean r2 = r2.isWideGamut()
            if (r2 == 0) goto L_0x030f
            r2 = 1
            goto L_0x0310
        L_0x030f:
            r2 = 0
        L_0x0310:
            if (r2 == 0) goto L_0x0315
            android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0317
        L_0x0315:
            android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.SRGB
        L_0x0317:
            android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
            r8.inPreferredColorSpace = r2
            goto L_0x0328
        L_0x031e:
            if (r2 < r3) goto L_0x0328
            android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
            r8.inPreferredColorSpace = r2
        L_0x0328:
            e6.d r2 = r14.f7176a
            android.graphics.Bitmap r1 = m5730c(r1, r8, r10, r2)
            e6.d r2 = r14.f7176a
            r10.mo11007a(r1, r2)
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L_0x034c
            m5731d(r1)
            android.graphics.Bitmap r0 = r8.inBitmap
            m5731d(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getName()
            android.os.SystemClock.elapsedRealtimeNanos()
        L_0x034c:
            if (r1 == 0) goto L_0x03f2
            android.util.DisplayMetrics r0 = r14.f7177b
            int r0 = r0.densityDpi
            r1.setDensity(r0)
            e6.d r0 = r14.f7176a
            switch(r29) {
                case 2: goto L_0x035c;
                case 3: goto L_0x035c;
                case 4: goto L_0x035c;
                case 5: goto L_0x035c;
                case 6: goto L_0x035c;
                case 7: goto L_0x035c;
                case 8: goto L_0x035c;
                default: goto L_0x035a;
            }
        L_0x035a:
            r2 = 0
            goto L_0x035d
        L_0x035c:
            r2 = 1
        L_0x035d:
            if (r2 != 0) goto L_0x0362
            r4 = r1
            goto L_0x03e7
        L_0x0362:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r29) {
                case 2: goto L_0x039a;
                case 3: goto L_0x0396;
                case 4: goto L_0x038d;
                case 5: goto L_0x0384;
                case 6: goto L_0x0380;
                case 7: goto L_0x0377;
                case 8: goto L_0x0373;
                default: goto L_0x0372;
            }
        L_0x0372:
            goto L_0x039f
        L_0x0373:
            r2.setRotate(r3)
            goto L_0x039f
        L_0x0377:
            r2.setRotate(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r6, r3)
            goto L_0x039f
        L_0x0380:
            r2.setRotate(r4)
            goto L_0x039f
        L_0x0384:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r4)
            r2.postScale(r6, r3)
            goto L_0x039f
        L_0x038d:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r5)
            r2.postScale(r6, r3)
            goto L_0x039f
        L_0x0396:
            r2.setRotate(r5)
            goto L_0x039f
        L_0x039a:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r6, r3)
        L_0x039f:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r1.getWidth()
            float r4 = (float) r4
            int r5 = r1.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            if (r6 == 0) goto L_0x03cd
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            goto L_0x03cf
        L_0x03cd:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x03cf:
            android.graphics.Bitmap r0 = r0.mo20087e(r4, r5, r6)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r1.hasAlpha()
            r0.setHasAlpha(r3)
            p146k6.C5516u.m13720a(r1, r0, r2)
            r4 = r0
        L_0x03e7:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x03f2
            e6.d r0 = r14.f7176a
            r0.mo20086d(r1)
        L_0x03f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2205a.mo11006b(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.a$b):android.graphics.Bitmap");
    }
}
