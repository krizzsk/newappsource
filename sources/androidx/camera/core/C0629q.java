package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0554h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p054d0.C4272c;
import p054d0.C4282g0;
import p054d0.C4289j0;
import p054d0.C4291k0;
import p054d0.C4310t0;
import p066e0.C4424e;
import p066e0.C4428g;
import p066e0.C4462z;
import p115i0.C5226b;
import p304x.C7097r;

/* renamed from: androidx.camera.core.q */
public final class C0629q implements C4462z, C0554h.C0555a {

    /* renamed from: a */
    public final Object f2150a = new Object();

    /* renamed from: b */
    public C0630a f2151b = new C0630a();

    /* renamed from: c */
    public C4291k0 f2152c = new C4291k0(this, 0);

    /* renamed from: d */
    public boolean f2153d = false;

    /* renamed from: e */
    public final C4462z f2154e;

    /* renamed from: f */
    public C4462z.C4463a f2155f;

    /* renamed from: g */
    public Executor f2156g;

    /* renamed from: h */
    public final LongSparseArray<C4282g0> f2157h = new LongSparseArray<>();

    /* renamed from: i */
    public final LongSparseArray<C0627p> f2158i = new LongSparseArray<>();

    /* renamed from: j */
    public int f2159j;

    /* renamed from: k */
    public final ArrayList f2160k;

    /* renamed from: l */
    public final ArrayList f2161l = new ArrayList();

    /* renamed from: androidx.camera.core.q$a */
    public class C0630a extends C4424e {
        public C0630a() {
        }

        /* renamed from: b */
        public final void mo2570b(C4428g gVar) {
            C0629q qVar = C0629q.this;
            synchronized (qVar.f2150a) {
                if (!qVar.f2153d) {
                    qVar.f2157h.put(gVar.getTimestamp(), new C5226b(gVar));
                    qVar.mo2563e();
                }
            }
        }
    }

    public C0629q(int i, int i2, int i3, int i4) {
        C4272c cVar = new C4272c(ImageReader.newInstance(i, i2, i3, i4));
        this.f2154e = cVar;
        this.f2159j = 0;
        this.f2160k = new ArrayList(getMaxImages());
    }

    /* renamed from: a */
    public final void mo2556a(C4462z.C4463a aVar, Executor executor) {
        synchronized (this.f2150a) {
            aVar.getClass();
            this.f2155f = aVar;
            executor.getClass();
            this.f2156g = executor;
            this.f2154e.mo2556a(this.f2152c, executor);
        }
    }

    public final C0627p acquireLatestImage() {
        synchronized (this.f2150a) {
            if (this.f2160k.isEmpty()) {
                return null;
            }
            if (this.f2159j < this.f2160k.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f2160k.size() - 1; i++) {
                    if (!this.f2161l.contains(this.f2160k.get(i))) {
                        arrayList.add((C0627p) this.f2160k.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0627p) it.next()).close();
                }
                int size = this.f2160k.size() - 1;
                ArrayList arrayList2 = this.f2160k;
                this.f2159j = size + 1;
                C0627p pVar = (C0627p) arrayList2.get(size);
                this.f2161l.add(pVar);
                return pVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public final C0627p acquireNextImage() {
        synchronized (this.f2150a) {
            if (this.f2160k.isEmpty()) {
                return null;
            }
            if (this.f2159j < this.f2160k.size()) {
                ArrayList arrayList = this.f2160k;
                int i = this.f2159j;
                this.f2159j = i + 1;
                C0627p pVar = (C0627p) arrayList.get(i);
                this.f2161l.add(pVar);
                return pVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* renamed from: b */
    public final void mo2437b(C0627p pVar) {
        synchronized (this.f2150a) {
            mo2559c(pVar);
        }
    }

    /* renamed from: c */
    public final void mo2559c(C0627p pVar) {
        synchronized (this.f2150a) {
            int indexOf = this.f2160k.indexOf(pVar);
            if (indexOf >= 0) {
                this.f2160k.remove(indexOf);
                int i = this.f2159j;
                if (indexOf <= i) {
                    this.f2159j = i - 1;
                }
            }
            this.f2161l.remove(pVar);
        }
    }

    public final void clearOnImageAvailableListener() {
        synchronized (this.f2150a) {
            this.f2155f = null;
            this.f2156g = null;
        }
    }

    public final void close() {
        synchronized (this.f2150a) {
            if (!this.f2153d) {
                Iterator it = new ArrayList(this.f2160k).iterator();
                while (it.hasNext()) {
                    ((C0627p) it.next()).close();
                }
                this.f2160k.clear();
                this.f2154e.close();
                this.f2153d = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo2562d(C4310t0 t0Var) {
        C4462z.C4463a aVar;
        Executor executor;
        synchronized (this.f2150a) {
            aVar = null;
            if (this.f2160k.size() < getMaxImages()) {
                t0Var.mo2436a(this);
                this.f2160k.add(t0Var);
                aVar = this.f2155f;
                executor = this.f2156g;
            } else {
                C4289j0.m11435b("TAG");
                t0Var.close();
                executor = null;
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C7097r(4, this, aVar));
        } else {
            aVar.mo2538c(this);
        }
    }

    /* renamed from: e */
    public final void mo2563e() {
        synchronized (this.f2150a) {
            for (int size = this.f2157h.size() - 1; size >= 0; size--) {
                C4282g0 valueAt = this.f2157h.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                C0627p pVar = this.f2158i.get(timestamp);
                if (pVar != null) {
                    this.f2158i.remove(timestamp);
                    this.f2157h.removeAt(size);
                    mo2562d(new C4310t0(pVar, (Size) null, valueAt));
                }
            }
            mo2564f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2564f() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f2150a
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.p> r1 = r10.f2158i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<d0.g0> r1 = r10.f2157h     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<androidx.camera.core.p> r1 = r10.f2158i     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<d0.g0> r3 = r10.f2157h     // Catch:{ all -> 0x008e }
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
            android.util.LongSparseArray<androidx.camera.core.p> r1 = r10.f2158i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.p> r2 = r10.f2158i     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<androidx.camera.core.p> r2 = r10.f2158i     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            androidx.camera.core.p r2 = (androidx.camera.core.C0627p) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.p> r2 = r10.f2158i     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<d0.g0> r2 = r10.f2157h     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<d0.g0> r3 = r10.f2157h     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0087
            android.util.LongSparseArray<d0.g0> r3 = r10.f2157h     // Catch:{ all -> 0x008e }
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0629q.mo2564f():void");
    }

    public final int getHeight() {
        int height;
        synchronized (this.f2150a) {
            height = this.f2154e.getHeight();
        }
        return height;
    }

    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f2150a) {
            imageFormat = this.f2154e.getImageFormat();
        }
        return imageFormat;
    }

    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f2150a) {
            maxImages = this.f2154e.getMaxImages();
        }
        return maxImages;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f2150a) {
            surface = this.f2154e.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.f2150a) {
            width = this.f2154e.getWidth();
        }
        return width;
    }
}
