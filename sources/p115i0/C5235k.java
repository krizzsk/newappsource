package p115i0;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0627p;
import androidx.camera.core.impl.utils.C0602a;
import androidx.camera.core.impl.utils.ExifData;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import mf0.C24361g;
import p054d0.C4289j0;
import p054d0.C4314v;
import p066e0.C4451q;
import p078f0.C4640f;
import p102h0.C5023g;
import p128j0.C5345a;
import p695od.C18728c;

/* renamed from: i0.k */
public final class C5235k implements C4451q {

    /* renamed from: k */
    public static final Rect f17327k = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    public final int f17328a;

    /* renamed from: b */
    public final Object f17329b = new Object();

    /* renamed from: c */
    public int f17330c;

    /* renamed from: d */
    public int f17331d = 0;

    /* renamed from: e */
    public boolean f17332e = false;

    /* renamed from: f */
    public int f17333f = 0;

    /* renamed from: g */
    public ImageWriter f17334g;

    /* renamed from: h */
    public Rect f17335h = f17327k;

    /* renamed from: i */
    public CallbackToFutureAdapter.C0673a<Void> f17336i;

    /* renamed from: j */
    public CallbackToFutureAdapter.C0675c f17337j;

    public C5235k(int i, int i2) {
        this.f17330c = i;
        this.f17328a = i2;
    }

    /* renamed from: c */
    public static ExifData m13247c(C0627p pVar, int i) {
        C4640f[] fVarArr = ExifData.f2038c;
        ExifData.C0599b bVar = new ExifData.C0599b(ByteOrder.BIG_ENDIAN);
        bVar.mo2510c("Orientation", String.valueOf(1), bVar.f2049a);
        bVar.mo2510c("XResolution", "72/1", bVar.f2049a);
        bVar.mo2510c("YResolution", "72/1", bVar.f2049a);
        bVar.mo2510c("ResolutionUnit", String.valueOf(2), bVar.f2049a);
        bVar.mo2510c("YCbCrPositioning", String.valueOf(1), bVar.f2049a);
        bVar.mo2510c("Make", Build.MANUFACTURER, bVar.f2049a);
        bVar.mo2510c("Model", Build.MODEL, bVar.f2049a);
        pVar.getImageInfo().mo19800a(bVar);
        bVar.mo2511d(i);
        bVar.mo2510c("ImageWidth", String.valueOf(pVar.getWidth()), bVar.f2049a);
        bVar.mo2510c("ImageLength", String.valueOf(pVar.getHeight()), bVar.f2049a);
        ArrayList list = Collections.list(new C0602a(bVar));
        if (!((Map) list.get(1)).isEmpty()) {
            bVar.mo2509b("ExposureProgram", String.valueOf(0), list);
            bVar.mo2509b("ExifVersion", "0230", list);
            bVar.mo2509b("ComponentsConfiguration", "1,2,3,0", list);
            bVar.mo2509b("MeteringMode", String.valueOf(0), list);
            bVar.mo2509b("LightSource", String.valueOf(0), list);
            bVar.mo2509b("FlashpixVersion", "0100", list);
            bVar.mo2509b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            bVar.mo2509b("FileSource", String.valueOf(3), list);
            bVar.mo2509b("SceneType", String.valueOf(1), list);
            bVar.mo2509b("CustomRendered", String.valueOf(0), list);
            bVar.mo2509b("SceneCaptureType", String.valueOf(0), list);
            bVar.mo2509b("Contrast", String.valueOf(0), list);
            bVar.mo2509b("Saturation", String.valueOf(0), list);
            bVar.mo2509b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            bVar.mo2509b("GPSVersionID", "2300", list);
            bVar.mo2509b("GPSSpeedRef", "K", list);
            bVar.mo2509b("GPSTrackRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.mo2509b("GPSImgDirectionRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.mo2509b("GPSDestBearingRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.mo2509b("GPSDestDistanceRef", "K", list);
        }
        return new ExifData(bVar.f2050b, list);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0132  */
    /* renamed from: a */
    public final void mo19822a(p066e0.C4461y r19) {
        /*
            r18 = this;
            r1 = r18
            java.util.List r0 = r19.getCaptureIds()
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
            r2 = r19
            od.c r0 = r2.getImageProxy(r0)
            boolean r2 = r0.isDone()
            mf0.C24361g.m61175n(r2)
            java.lang.Object r2 = r1.f17329b
            monitor-enter(r2)
            android.media.ImageWriter r5 = r1.f17334g     // Catch:{ all -> 0x01b4 }
            boolean r6 = r1.f17332e     // Catch:{ all -> 0x01b4 }
            if (r6 != 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            android.graphics.Rect r7 = r1.f17335h     // Catch:{ all -> 0x01b4 }
            if (r6 == 0) goto L_0x0051
            int r8 = r1.f17333f     // Catch:{ all -> 0x01b4 }
            int r8 = r8 + r4
            r1.f17333f = r8     // Catch:{ all -> 0x01b4 }
        L_0x0051:
            int r4 = r1.f17330c     // Catch:{ all -> 0x01b4 }
            int r8 = r1.f17331d     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b4 }
            r2 = 0
            java.lang.Object r9 = r0.get()     // Catch:{ Exception -> 0x012d, all -> 0x0129 }
            androidx.camera.core.p r9 = (androidx.camera.core.C0627p) r9     // Catch:{ Exception -> 0x012d, all -> 0x0129 }
            if (r6 != 0) goto L_0x008f
            java.lang.String r0 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r0)     // Catch:{ Exception -> 0x0126, all -> 0x0123 }
            r9.close()     // Catch:{ Exception -> 0x0126, all -> 0x0123 }
            java.lang.Object r4 = r1.f17329b
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0079
            int r0 = r1.f17333f     // Catch:{ all -> 0x008c }
            int r6 = r0 + -1
            r1.f17333f = r6     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0079
            boolean r0 = r1.f17332e     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0079
            r3 = 1
        L_0x0079:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r1.f17336i     // Catch:{ all -> 0x008c }
            monitor-exit(r4)     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x008b
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r3)
            if (r0 == 0) goto L_0x008b
            r0.mo2697b(r2)
        L_0x008b:
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008c }
            throw r0
        L_0x008f:
            android.media.Image r10 = r5.dequeueInputImage()     // Catch:{ Exception -> 0x0126, all -> 0x0123 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0121 }
            r11 = r0
            androidx.camera.core.p r11 = (androidx.camera.core.C0627p) r11     // Catch:{ Exception -> 0x0121 }
            int r0 = r11.getFormat()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r9 = 35
            if (r0 != r9) goto L_0x00a4
            r0 = 1
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            java.lang.String r9 = "Input image is not expected YUV_420_888 image format"
            mf0.C24361g.m61193w(r9, r0)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            byte[] r13 = p164m0.C5661a.m13931a(r11)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r14 = 17
            int r15 = r11.getWidth()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            int r16 = r11.getHeight()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r17 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            android.media.Image$Plane[] r9 = r10.getPlanes()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r9 = r9[r3]     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.nio.ByteBuffer r9 = r9.getBuffer()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            int r12 = r9.position()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            androidx.camera.core.impl.utils.b r13 = new androidx.camera.core.impl.utils.b     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            i0.k$a r14 = new i0.k$a     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r14.<init>(r9)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            androidx.camera.core.impl.utils.ExifData r8 = m13247c(r11, r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r13.<init>(r14, r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r0.compressToJpeg(r7, r4, r13)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r11.close()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            int r0 = r9.position()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r9.limit(r0)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r9.position(r12)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r5.queueInputImage(r10)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.Object r4 = r1.f17329b
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0101
            int r0 = r1.f17333f     // Catch:{ all -> 0x0112 }
            int r6 = r0 + -1
            r1.f17333f = r6     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0101
            boolean r0 = r1.f17332e     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0101
            r3 = 1
        L_0x0101:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r1.f17336i     // Catch:{ all -> 0x0112 }
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x01b0
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r3)
            if (r0 == 0) goto L_0x01b0
            goto L_0x01ad
        L_0x0112:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            r0 = move-exception
            r9 = r2
            goto L_0x0150
        L_0x0118:
            r9 = r2
            goto L_0x0130
        L_0x011b:
            r0 = move-exception
            r9 = r11
            goto L_0x0150
        L_0x011e:
            r9 = r11
            goto L_0x0130
        L_0x0121:
            goto L_0x0130
        L_0x0123:
            r0 = move-exception
            r10 = r2
            goto L_0x0150
        L_0x0126:
            r10 = r2
            goto L_0x0130
        L_0x0129:
            r0 = move-exception
            r9 = r2
            r10 = r9
            goto L_0x0150
        L_0x012d:
            r9 = r2
            r10 = r9
        L_0x0130:
            if (r6 == 0) goto L_0x0182
            java.lang.String r0 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r0)     // Catch:{ all -> 0x014f }
            android.media.Image r10 = r5.dequeueInputImage()     // Catch:{ all -> 0x014f }
            android.media.Image$Plane[] r0 = r10.getPlanes()     // Catch:{ all -> 0x014f }
            r0 = r0[r3]     // Catch:{ all -> 0x014f }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x014f }
            r0.rewind()     // Catch:{ all -> 0x014f }
            r0.limit(r3)     // Catch:{ all -> 0x014f }
            r5.queueInputImage(r10)     // Catch:{ all -> 0x014f }
            goto L_0x0182
        L_0x014f:
            r0 = move-exception
        L_0x0150:
            java.lang.Object r4 = r1.f17329b
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0162
            int r6 = r1.f17333f     // Catch:{ all -> 0x017f }
            int r7 = r6 + -1
            r1.f17333f = r7     // Catch:{ all -> 0x017f }
            if (r6 != 0) goto L_0x0162
            boolean r6 = r1.f17332e     // Catch:{ all -> 0x017f }
            if (r6 == 0) goto L_0x0162
            r3 = 1
        L_0x0162:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r6 = r1.f17336i     // Catch:{ all -> 0x017f }
            monitor-exit(r4)     // Catch:{ all -> 0x017f }
            if (r10 == 0) goto L_0x016a
            r10.close()
        L_0x016a:
            if (r9 == 0) goto L_0x016f
            r9.close()
        L_0x016f:
            if (r3 == 0) goto L_0x017e
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r3)
            if (r6 == 0) goto L_0x017e
            r6.mo2697b(r2)
        L_0x017e:
            throw r0
        L_0x017f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017f }
            throw r0
        L_0x0182:
            java.lang.Object r4 = r1.f17329b
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0194
            int r0 = r1.f17333f     // Catch:{ all -> 0x01b1 }
            int r6 = r0 + -1
            r1.f17333f = r6     // Catch:{ all -> 0x01b1 }
            if (r0 != 0) goto L_0x0194
            boolean r0 = r1.f17332e     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0194
            r3 = 1
        L_0x0194:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r1.f17336i     // Catch:{ all -> 0x01b1 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b1 }
            if (r10 == 0) goto L_0x019c
            r10.close()
        L_0x019c:
            if (r9 == 0) goto L_0x01a1
            r9.close()
        L_0x01a1:
            if (r3 == 0) goto L_0x01b0
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r3)
            if (r0 == 0) goto L_0x01b0
        L_0x01ad:
            r0.mo2697b(r2)
        L_0x01b0:
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b1 }
            throw r0
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i0.C5235k.mo19822a(e0.y):void");
    }

    /* renamed from: b */
    public final C18728c<Void> mo19823b() {
        C18728c<Void> cVar;
        synchronized (this.f17329b) {
            if (!this.f17332e || this.f17333f != 0) {
                if (this.f17337j == null) {
                    this.f17337j = CallbackToFutureAdapter.m1884a(new C4314v(this, 1));
                }
                cVar = C5023g.m12858f(this.f17337j);
            } else {
                cVar = C5023g.m12857e((Object) null);
            }
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r1.mo2697b(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17329b
            monitor-enter(r0)
            boolean r1 = r3.f17332e     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0009:
            r1 = 1
            r3.f17332e = r1     // Catch:{ all -> 0x002f }
            int r1 = r3.f17333f     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0022
            android.media.ImageWriter r1 = r3.f17334g     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r1)     // Catch:{ all -> 0x002f }
            android.media.ImageWriter r1 = r3.f17334g     // Catch:{ all -> 0x002f }
            r1.close()     // Catch:{ all -> 0x002f }
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r1 = r3.f17336i     // Catch:{ all -> 0x002f }
            goto L_0x0028
        L_0x0022:
            java.lang.String r1 = "YuvToJpegProcessor"
            p054d0.C4289j0.m11435b(r1)     // Catch:{ all -> 0x002f }
            r1 = r2
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002e
            r1.mo2697b(r2)
        L_0x002e:
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i0.C5235k.close():void");
    }

    public final void onOutputSurface(Surface surface, int i) {
        boolean z;
        if (i == 256) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("YuvToJpegProcessor only supports JPEG output format.", z);
        synchronized (this.f17329b) {
            if (this.f17332e) {
                C4289j0.m11435b("YuvToJpegProcessor");
            } else if (this.f17334g == null) {
                this.f17334g = C5345a.m13399b(surface, this.f17328a, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    public final void onResolutionUpdate(Size size) {
        synchronized (this.f17329b) {
            this.f17335h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* renamed from: i0.k$a */
    public static final class C5236a extends OutputStream {

        /* renamed from: b */
        public final ByteBuffer f17338b;

        public C5236a(ByteBuffer byteBuffer) {
            this.f17338b = byteBuffer;
        }

        public final void write(int i) throws IOException {
            if (this.f17338b.hasRemaining()) {
                this.f17338b.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.f17338b.remaining() >= i2) {
                    this.f17338b.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
