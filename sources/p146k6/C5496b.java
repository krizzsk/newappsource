package p146k6;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import p025b6.C1489d;
import p025b6.C1492e;
import p025b6.C1494g;
import p072e6.C4564b;

/* renamed from: k6.b */
public final class C5496b implements C1494g<Bitmap> {

    /* renamed from: c */
    public static final C1489d<Integer> f18038c = C1489d.m3904a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: d */
    public static final C1489d<Bitmap.CompressFormat> f18039d = new C1489d<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C1489d.f5391e);

    /* renamed from: b */
    public final C4564b f18040b;

    public C5496b(C4564b bVar) {
        this.f18040b = bVar;
    }

    /* renamed from: i */
    public final EncodeStrategy mo5852i(C1492e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(0)|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        if (r4 != null) goto L_0x0065;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[SYNTHETIC, Splitter:B:28:0x005f] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo979n(java.lang.Object r7, java.io.File r8, p025b6.C1492e r9) {
        /*
            r6 = this;
            d6.l r7 = (p060d6.C4397l) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            b6.d<android.graphics.Bitmap$CompressFormat> r1 = f18039d
            java.lang.Object r1 = r9.mo5848c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r7.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r7.getWidth()
            r7.getHeight()
            int r2 = p311x6.C7171h.f22255a     // Catch:{ all -> 0x0085 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0085 }
            b6.d<java.lang.Integer> r2 = f18038c     // Catch:{ all -> 0x0085 }
            java.lang.Object r2 = r9.mo5848c(r2)     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0085 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0085 }
            r3 = 0
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x005b }
            r5.<init>(r8)     // Catch:{ IOException -> 0x0054, all -> 0x005b }
            e6.b r8 = r6.f18040b     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            if (r8 == 0) goto L_0x004b
            com.bumptech.glide.load.data.c r8 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            e6.b r4 = r6.f18040b     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r8.<init>(r5, r4)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r4 = r8
            goto L_0x004c
        L_0x004b:
            r4 = r5
        L_0x004c:
            r7.compress(r1, r2, r4)     // Catch:{ IOException -> 0x0054, all -> 0x005b }
            r4.close()     // Catch:{ IOException -> 0x0054, all -> 0x005b }
            r3 = 1
            goto L_0x0065
        L_0x0054:
            goto L_0x0063
        L_0x0056:
            r7 = move-exception
            goto L_0x005d
        L_0x0058:
            r4 = r5
            goto L_0x0063
        L_0x005b:
            r7 = move-exception
            r5 = r4
        L_0x005d:
            if (r5 == 0) goto L_0x0062
            r5.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r7     // Catch:{ all -> 0x0085 }
        L_0x0063:
            if (r4 == 0) goto L_0x0068
        L_0x0065:
            r4.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0084
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0085 }
            p311x6.C7176l.m16783c(r7)     // Catch:{ all -> 0x0085 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0085 }
            b6.d<android.graphics.Bitmap$CompressFormat> r8 = f18039d     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = r9.mo5848c(r8)     // Catch:{ all -> 0x0085 }
            java.util.Objects.toString(r8)     // Catch:{ all -> 0x0085 }
            r7.hasAlpha()     // Catch:{ all -> 0x0085 }
        L_0x0084:
            return r3
        L_0x0085:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p146k6.C5496b.mo979n(java.lang.Object, java.io.File, b6.e):boolean");
    }
}
