package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0581f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p054d0.C4269b;
import p054d0.C4272c;
import p054d0.C4309t;
import p054d0.C4312u0;
import p066e0.C4449p;
import p066e0.C4451q;
import p066e0.C4462z;
import p102h0.C5018c;
import p102h0.C5023g;
import p695od.C18728c;

/* renamed from: androidx.camera.core.s */
public final class C0636s implements C4462z {

    /* renamed from: a */
    public final Object f2175a = new Object();

    /* renamed from: b */
    public C0637a f2176b = new C0637a();

    /* renamed from: c */
    public C0638b f2177c = new C0638b();

    /* renamed from: d */
    public C0639c f2178d = new C0639c();

    /* renamed from: e */
    public boolean f2179e = false;

    /* renamed from: f */
    public boolean f2180f = false;

    /* renamed from: g */
    public final C4462z f2181g;

    /* renamed from: h */
    public final C4272c f2182h;

    /* renamed from: i */
    public C4462z.C4463a f2183i;

    /* renamed from: j */
    public Executor f2184j;

    /* renamed from: k */
    public CallbackToFutureAdapter.C0673a<Void> f2185k;

    /* renamed from: l */
    public CallbackToFutureAdapter.C0675c f2186l;

    /* renamed from: m */
    public final Executor f2187m;

    /* renamed from: n */
    public final C4451q f2188n;

    /* renamed from: o */
    public final C18728c<Void> f2189o;

    /* renamed from: p */
    public String f2190p = new String();

    /* renamed from: q */
    public C4312u0 f2191q = new C4312u0(Collections.emptyList(), this.f2190p);

    /* renamed from: r */
    public final ArrayList f2192r = new ArrayList();

    /* renamed from: s */
    public C18728c<List<C0627p>> f2193s = C5023g.m12857e(new ArrayList());

    /* renamed from: t */
    public C0641e f2194t;

    /* renamed from: u */
    public Executor f2195u;

    /* renamed from: androidx.camera.core.s$a */
    public class C0637a implements C4462z.C4463a {
        public C0637a() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2538c(p066e0.C4462z r5) {
            /*
                r4 = this;
                androidx.camera.core.s r0 = androidx.camera.core.C0636s.this
                java.lang.Object r1 = r0.f2175a
                monitor-enter(r1)
                boolean r2 = r0.f2179e     // Catch:{ all -> 0x0042 }
                if (r2 == 0) goto L_0x000b
                monitor-exit(r1)     // Catch:{ all -> 0x0042 }
                goto L_0x0040
            L_0x000b:
                androidx.camera.core.p r5 = r5.acquireNextImage()     // Catch:{ IllegalStateException -> 0x003a }
                if (r5 == 0) goto L_0x003f
                d0.g0 r2 = r5.getImageInfo()     // Catch:{ all -> 0x0042 }
                e0.p0 r2 = r2.getTagBundle()     // Catch:{ all -> 0x0042 }
                java.lang.String r3 = r0.f2190p     // Catch:{ all -> 0x0042 }
                java.lang.Object r2 = r2.mo19986a(r3)     // Catch:{ all -> 0x0042 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0042 }
                java.util.ArrayList r3 = r0.f2192r     // Catch:{ all -> 0x0042 }
                boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0042 }
                if (r2 != 0) goto L_0x0032
                java.lang.String r0 = "ProcessingImageReader"
                p054d0.C4289j0.m11435b(r0)     // Catch:{ all -> 0x0042 }
                r5.close()     // Catch:{ all -> 0x0042 }
                goto L_0x003f
            L_0x0032:
                d0.u0 r0 = r0.f2191q     // Catch:{ all -> 0x0042 }
                r0.mo19830a(r5)     // Catch:{ all -> 0x0042 }
                goto L_0x003f
            L_0x0038:
                r5 = move-exception
                goto L_0x0041
            L_0x003a:
                java.lang.String r5 = "ProcessingImageReader"
                p054d0.C4289j0.m11435b(r5)     // Catch:{ all -> 0x0038 }
            L_0x003f:
                monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            L_0x0040:
                return
            L_0x0041:
                throw r5     // Catch:{ all -> 0x0042 }
            L_0x0042:
                r5 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0042 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0636s.C0637a.mo2538c(e0.z):void");
        }
    }

    /* renamed from: androidx.camera.core.s$b */
    public class C0638b implements C4462z.C4463a {
        public C0638b() {
        }

        /* renamed from: c */
        public final void mo2538c(C4462z zVar) {
            C4462z.C4463a aVar;
            Executor executor;
            synchronized (C0636s.this.f2175a) {
                C0636s sVar = C0636s.this;
                aVar = sVar.f2183i;
                executor = sVar.f2184j;
                sVar.f2191q.mo19832c();
                C0636s.this.mo2579d();
            }
            if (aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new C4309t(1, this, aVar));
            } else {
                aVar.mo2538c(C0636s.this);
            }
        }
    }

    /* renamed from: androidx.camera.core.s$c */
    public class C0639c implements C5018c<List<C0627p>> {
        public C0639c() {
        }

        public final void onFailure(Throwable th) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r0.f2188n.mo19822a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            monitor-enter(r5.f2198a.f2175a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r5.f2198a.f2191q.mo19832c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
            r4.execute(new p316y.C7229u(1, r3, r6));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccess(java.lang.Object r6) {
            /*
                r5 = this;
                java.util.List r6 = (java.util.List) r6
                androidx.camera.core.s r6 = androidx.camera.core.C0636s.this
                java.lang.Object r6 = r6.f2175a
                monitor-enter(r6)
                androidx.camera.core.s r0 = androidx.camera.core.C0636s.this     // Catch:{ all -> 0x004e }
                boolean r1 = r0.f2179e     // Catch:{ all -> 0x004e }
                if (r1 == 0) goto L_0x000f
                monitor-exit(r6)     // Catch:{ all -> 0x004e }
                goto L_0x0047
            L_0x000f:
                r1 = 1
                r0.f2180f = r1     // Catch:{ all -> 0x004e }
                d0.u0 r2 = r0.f2191q     // Catch:{ all -> 0x004e }
                androidx.camera.core.s$e r3 = r0.f2194t     // Catch:{ all -> 0x004e }
                java.util.concurrent.Executor r4 = r0.f2195u     // Catch:{ all -> 0x004e }
                monitor-exit(r6)     // Catch:{ all -> 0x004e }
                e0.q r6 = r0.f2188n     // Catch:{ Exception -> 0x001f }
                r6.mo19822a(r2)     // Catch:{ Exception -> 0x001f }
                goto L_0x0039
            L_0x001f:
                r6 = move-exception
                androidx.camera.core.s r0 = androidx.camera.core.C0636s.this
                java.lang.Object r0 = r0.f2175a
                monitor-enter(r0)
                androidx.camera.core.s r2 = androidx.camera.core.C0636s.this     // Catch:{ all -> 0x004b }
                d0.u0 r2 = r2.f2191q     // Catch:{ all -> 0x004b }
                r2.mo19832c()     // Catch:{ all -> 0x004b }
                if (r3 == 0) goto L_0x0038
                if (r4 == 0) goto L_0x0038
                y.u r2 = new y.u     // Catch:{ all -> 0x004b }
                r2.<init>(r1, r3, r6)     // Catch:{ all -> 0x004b }
                r4.execute(r2)     // Catch:{ all -> 0x004b }
            L_0x0038:
                monitor-exit(r0)     // Catch:{ all -> 0x004b }
            L_0x0039:
                androidx.camera.core.s r6 = androidx.camera.core.C0636s.this
                java.lang.Object r6 = r6.f2175a
                monitor-enter(r6)
                androidx.camera.core.s r0 = androidx.camera.core.C0636s.this     // Catch:{ all -> 0x0048 }
                r1 = 0
                r0.f2180f = r1     // Catch:{ all -> 0x0048 }
                monitor-exit(r6)     // Catch:{ all -> 0x0048 }
                r0.mo2577b()
            L_0x0047:
                return
            L_0x0048:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0048 }
                throw r0
            L_0x004b:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004b }
                throw r6
            L_0x004e:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x004e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0636s.C0639c.onSuccess(java.lang.Object):void");
        }
    }

    /* renamed from: androidx.camera.core.s$d */
    public static final class C0640d {

        /* renamed from: a */
        public final C4462z f2199a;

        /* renamed from: b */
        public final C4449p f2200b;

        /* renamed from: c */
        public final C4451q f2201c;

        /* renamed from: d */
        public int f2202d;

        /* renamed from: e */
        public Executor f2203e = Executors.newSingleThreadExecutor();

        public C0640d(C4462z zVar, C4449p pVar, C4451q qVar) {
            this.f2199a = zVar;
            this.f2200b = pVar;
            this.f2201c = qVar;
            this.f2202d = zVar.getImageFormat();
        }
    }

    /* renamed from: androidx.camera.core.s$e */
    public interface C0641e {
    }

    public C0636s(C0640d dVar) {
        if (dVar.f2199a.getMaxImages() >= dVar.f2200b.getCaptureStages().size()) {
            C4462z zVar = dVar.f2199a;
            this.f2181g = zVar;
            int width = zVar.getWidth();
            int height = zVar.getHeight();
            int i = dVar.f2202d;
            if (i == 256) {
                width = ((int) (((float) (width * height)) * 1.5f)) + 64000;
                height = 1;
            }
            C4272c cVar = new C4272c(ImageReader.newInstance(width, height, i, zVar.getMaxImages()));
            this.f2182h = cVar;
            this.f2187m = dVar.f2203e;
            C4451q qVar = dVar.f2201c;
            this.f2188n = qVar;
            qVar.onOutputSurface(cVar.getSurface(), dVar.f2202d);
            qVar.onResolutionUpdate(new Size(zVar.getWidth(), zVar.getHeight()));
            this.f2189o = qVar.mo19823b();
            mo2578c(dVar.f2200b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    /* renamed from: a */
    public final void mo2556a(C4462z.C4463a aVar, Executor executor) {
        synchronized (this.f2175a) {
            aVar.getClass();
            this.f2183i = aVar;
            executor.getClass();
            this.f2184j = executor;
            this.f2181g.mo2556a(this.f2176b, executor);
            this.f2182h.mo2556a(this.f2177c, executor);
        }
    }

    public final C0627p acquireLatestImage() {
        C0627p acquireLatestImage;
        synchronized (this.f2175a) {
            acquireLatestImage = this.f2182h.acquireLatestImage();
        }
        return acquireLatestImage;
    }

    public final C0627p acquireNextImage() {
        C0627p acquireNextImage;
        synchronized (this.f2175a) {
            acquireNextImage = this.f2182h.acquireNextImage();
        }
        return acquireNextImage;
    }

    /* renamed from: b */
    public final void mo2577b() {
        boolean z;
        boolean z2;
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.f2175a) {
            z = this.f2179e;
            z2 = this.f2180f;
            aVar = this.f2185k;
            if (z && !z2) {
                this.f2181g.close();
                this.f2191q.mo19831b();
                this.f2182h.close();
            }
        }
        if (z && !z2) {
            this.f2189o.addListener(new C4269b(2, this, aVar), C14226d.m35352s0());
        }
    }

    /* renamed from: c */
    public final void mo2578c(C4449p pVar) {
        synchronized (this.f2175a) {
            if (!this.f2179e) {
                synchronized (this.f2175a) {
                    if (!this.f2193s.isDone()) {
                        this.f2193s.cancel(true);
                    }
                    this.f2191q.mo19832c();
                }
                if (pVar.getCaptureStages() != null) {
                    if (this.f2181g.getMaxImages() >= pVar.getCaptureStages().size()) {
                        this.f2192r.clear();
                        for (C0581f next : pVar.getCaptureStages()) {
                            if (next != null) {
                                ArrayList arrayList = this.f2192r;
                                next.getId();
                                arrayList.add(0);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                }
                String num = Integer.toString(pVar.hashCode());
                this.f2190p = num;
                this.f2191q = new C4312u0(this.f2192r, num);
                mo2579d();
            }
        }
    }

    public final void clearOnImageAvailableListener() {
        synchronized (this.f2175a) {
            this.f2183i = null;
            this.f2184j = null;
            this.f2181g.clearOnImageAvailableListener();
            this.f2182h.clearOnImageAvailableListener();
            if (!this.f2180f) {
                this.f2191q.mo19831b();
            }
        }
    }

    public final void close() {
        synchronized (this.f2175a) {
            if (!this.f2179e) {
                this.f2181g.clearOnImageAvailableListener();
                this.f2182h.clearOnImageAvailableListener();
                this.f2179e = true;
                this.f2188n.close();
                mo2577b();
            }
        }
    }

    /* renamed from: d */
    public final void mo2579d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2192r.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f2191q.getImageProxy(((Integer) it.next()).intValue()));
        }
        this.f2193s = C5023g.m12854b(arrayList);
        C5023g.m12853a(C5023g.m12854b(arrayList), this.f2178d, this.f2187m);
    }

    public final int getHeight() {
        int height;
        synchronized (this.f2175a) {
            height = this.f2181g.getHeight();
        }
        return height;
    }

    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f2175a) {
            imageFormat = this.f2182h.getImageFormat();
        }
        return imageFormat;
    }

    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f2175a) {
            maxImages = this.f2181g.getMaxImages();
        }
        return maxImages;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f2175a) {
            surface = this.f2181g.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.f2175a) {
            width = this.f2181g.getWidth();
        }
        return width;
    }
}
