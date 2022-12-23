package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.media.ImageWriter;
import android.os.Build;
import androidx.camera.core.C0556i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p054d0.C4272c;
import p054d0.C4289j0;
import p066e0.C4462z;
import p128j0.C5345a;
import p128j0.C5346b;

/* renamed from: androidx.camera.core.j */
public abstract class C0608j implements C4462z.C4463a {

    /* renamed from: u */
    public static final RectF f2082u = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: b */
    public C0556i.C0557a f2083b;

    /* renamed from: c */
    public volatile int f2084c;

    /* renamed from: d */
    public volatile int f2085d;

    /* renamed from: e */
    public volatile int f2086e = 1;

    /* renamed from: f */
    public volatile boolean f2087f;

    /* renamed from: g */
    public volatile boolean f2088g;

    /* renamed from: h */
    public Executor f2089h;

    /* renamed from: i */
    public C0642t f2090i;

    /* renamed from: j */
    public ImageWriter f2091j;

    /* renamed from: k */
    public Rect f2092k = new Rect();

    /* renamed from: l */
    public Rect f2093l = new Rect();

    /* renamed from: m */
    public Matrix f2094m = new Matrix();

    /* renamed from: n */
    public Matrix f2095n = new Matrix();

    /* renamed from: o */
    public ByteBuffer f2096o;

    /* renamed from: p */
    public ByteBuffer f2097p;

    /* renamed from: q */
    public ByteBuffer f2098q;

    /* renamed from: r */
    public ByteBuffer f2099r;

    /* renamed from: s */
    public final Object f2100s = new Object();

    /* renamed from: t */
    public boolean f2101t = true;

    /* renamed from: a */
    public abstract C0627p mo2536a(C4462z zVar);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    /* renamed from: b */
    public final p695od.C18728c<java.lang.Void> mo2537b(androidx.camera.core.C0627p r15) {
        /*
            r14 = this;
            boolean r0 = r14.f2087f
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r14.f2084c
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            java.lang.Object r2 = r14.f2100s
            monitor-enter(r2)
            java.util.concurrent.Executor r9 = r14.f2089h     // Catch:{ all -> 0x00c2 }
            androidx.camera.core.i$a r10 = r14.f2083b     // Catch:{ all -> 0x00c2 }
            boolean r3 = r14.f2087f     // Catch:{ all -> 0x00c2 }
            r11 = 1
            if (r3 == 0) goto L_0x001b
            int r3 = r14.f2085d     // Catch:{ all -> 0x00c2 }
            if (r0 == r3) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            if (r12 == 0) goto L_0x0021
            r14.mo2543h(r15, r0)     // Catch:{ all -> 0x00c2 }
        L_0x0021:
            boolean r3 = r14.f2087f     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0028
            r14.mo2540e(r15)     // Catch:{ all -> 0x00c2 }
        L_0x0028:
            androidx.camera.core.t r3 = r14.f2090i     // Catch:{ all -> 0x00c2 }
            android.media.ImageWriter r4 = r14.f2091j     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r5 = r14.f2096o     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r6 = r14.f2097p     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r7 = r14.f2098q     // Catch:{ all -> 0x00c2 }
            java.nio.ByteBuffer r8 = r14.f2099r     // Catch:{ all -> 0x00c2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            if (r10 == 0) goto L_0x00b4
            if (r9 == 0) goto L_0x00b4
            boolean r2 = r14.f2101t
            if (r2 == 0) goto L_0x00b4
            if (r3 == 0) goto L_0x0068
            int r2 = r14.f2086e
            r13 = 2
            if (r2 != r13) goto L_0x004b
            boolean r2 = r14.f2088g
            d0.v0 r2 = androidx.camera.core.ImageProcessingUtil.m1488b(r15, r3, r5, r0, r2)
            goto L_0x0069
        L_0x004b:
            int r2 = r14.f2086e
            if (r2 != r11) goto L_0x0068
            boolean r2 = r14.f2088g
            if (r2 == 0) goto L_0x0056
            androidx.camera.core.ImageProcessingUtil.m1487a(r15)
        L_0x0056:
            if (r4 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0068
            if (r7 == 0) goto L_0x0068
            if (r8 == 0) goto L_0x0068
            r2 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            d0.v0 r2 = androidx.camera.core.ImageProcessingUtil.m1490d(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 != 0) goto L_0x006c
            r1 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x0070
            r8 = r15
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            java.lang.Object r3 = r14.f2100s
            monitor-enter(r3)
            if (r12 == 0) goto L_0x0095
            if (r1 != 0) goto L_0x0095
            int r1 = r15.getWidth()     // Catch:{ all -> 0x00b1 }
            int r4 = r15.getHeight()     // Catch:{ all -> 0x00b1 }
            int r5 = r8.getWidth()     // Catch:{ all -> 0x00b1 }
            int r6 = r8.getHeight()     // Catch:{ all -> 0x00b1 }
            r14.mo2542g(r1, r4, r5, r6)     // Catch:{ all -> 0x00b1 }
        L_0x0095:
            r14.f2085d = r0     // Catch:{ all -> 0x00b1 }
            android.graphics.Rect r0 = r14.f2093l     // Catch:{ all -> 0x00b1 }
            r2.set(r0)     // Catch:{ all -> 0x00b1 }
            android.graphics.Matrix r0 = r14.f2095n     // Catch:{ all -> 0x00b1 }
            r7.set(r0)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            d0.w r0 = new d0.w
            r3 = r0
            r4 = r14
            r5 = r9
            r6 = r15
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            androidx.concurrent.futures.CallbackToFutureAdapter$c r15 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r0)
            goto L_0x00c1
        L_0x00b1:
            r15 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            throw r15
        L_0x00b4:
            androidx.core.os.OperationCanceledException r15 = new androidx.core.os.OperationCanceledException
            java.lang.String r0 = "No analyzer or executor currently set."
            r15.<init>(r0)
            h0.j$a r0 = new h0.j$a
            r0.<init>(r15)
            r15 = r0
        L_0x00c1:
            return r15
        L_0x00c2:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0608j.mo2537b(androidx.camera.core.p):od.c");
    }

    /* renamed from: c */
    public final void mo2538c(C4462z zVar) {
        try {
            C0627p a = mo2536a(zVar);
            if (a != null) {
                mo2541f(a);
            }
        } catch (IllegalStateException unused) {
            C4289j0.m11435b("ImageAnalysisAnalyzer");
        }
    }

    /* renamed from: d */
    public abstract void mo2539d();

    /* renamed from: e */
    public final void mo2540e(C0627p pVar) {
        if (this.f2086e == 1) {
            if (this.f2097p == null) {
                this.f2097p = ByteBuffer.allocateDirect(pVar.getHeight() * pVar.getWidth());
            }
            this.f2097p.position(0);
            if (this.f2098q == null) {
                this.f2098q = ByteBuffer.allocateDirect((pVar.getHeight() * pVar.getWidth()) / 4);
            }
            this.f2098q.position(0);
            if (this.f2099r == null) {
                this.f2099r = ByteBuffer.allocateDirect((pVar.getHeight() * pVar.getWidth()) / 4);
            }
            this.f2099r.position(0);
        } else if (this.f2086e == 2 && this.f2096o == null) {
            this.f2096o = ByteBuffer.allocateDirect(pVar.getHeight() * pVar.getWidth() * 4);
        }
    }

    /* renamed from: f */
    public abstract void mo2541f(C0627p pVar);

    /* renamed from: g */
    public final void mo2542g(int i, int i2, int i3, int i4) {
        int i5 = this.f2084c;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
            RectF rectF2 = f2082u;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            matrix.postRotate((float) i5);
            RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i3, (float) i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f2092k);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f2093l = rect;
        this.f2095n.setConcat(this.f2094m, matrix);
    }

    /* renamed from: h */
    public final void mo2543h(C0627p pVar, int i) {
        boolean z;
        int i2;
        C0642t tVar = this.f2090i;
        if (tVar != null) {
            tVar.mo2580b();
            int width = pVar.getWidth();
            int height = pVar.getHeight();
            int imageFormat = this.f2090i.getImageFormat();
            int maxImages = this.f2090i.getMaxImages();
            if (i == 90 || i == 270) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = height;
            } else {
                i2 = width;
            }
            if (!z) {
                width = height;
            }
            this.f2090i = new C0642t(new C4272c(ImageReader.newInstance(i2, width, imageFormat, maxImages)));
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23 && this.f2086e == 1) {
                ImageWriter imageWriter = this.f2091j;
                if (imageWriter != null) {
                    if (i3 >= 23) {
                        C5346b.m13401a(imageWriter);
                    } else {
                        throw new RuntimeException(C25541a.m63878h("Unable to call close() on API ", i3, ". Version 23 or higher required."));
                    }
                }
                this.f2091j = C5345a.m13398a(this.f2090i.getMaxImages(), this.f2090i.getSurface());
            }
        }
    }
}
