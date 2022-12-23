package p137ja;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p102h0.C5021e;
import p126ib.C5334b;
import p126ib.C5335c;
import p126ib.C5340g;
import p137ja.C5415f;
import p583jk.C17875h;

/* renamed from: ja.g */
public abstract class C5417g<I extends DecoderInputBuffer, O extends C5415f, E extends DecoderException> implements C5412c<I, O, E> {

    /* renamed from: a */
    public final C5418a f17778a;

    /* renamed from: b */
    public final Object f17779b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f17780c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f17781d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f17782e;

    /* renamed from: f */
    public final O[] f17783f;

    /* renamed from: g */
    public int f17784g;

    /* renamed from: h */
    public int f17785h;

    /* renamed from: i */
    public I f17786i;

    /* renamed from: j */
    public SubtitleDecoderException f17787j;

    /* renamed from: k */
    public boolean f17788k;

    /* renamed from: l */
    public boolean f17789l;

    /* renamed from: ja.g$a */
    public class C5418a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ C5417g f17790b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5418a(C5334b bVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f17790b = bVar;
        }

        public final void run() {
            C5417g gVar = this.f17790b;
            gVar.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (gVar.mo21184f());
        }
    }

    public C5417g(I[] iArr, O[] oArr) {
        this.f17782e = iArr;
        this.f17784g = iArr.length;
        for (int i = 0; i < this.f17784g; i++) {
            this.f17782e[i] = new C5340g();
        }
        this.f17783f = oArr;
        this.f17785h = oArr.length;
        for (int i2 = 0; i2 < this.f17785h; i2++) {
            this.f17783f[i2] = new C5335c(new C5021e((C5334b) this, 2));
        }
        C5418a aVar = new C5418a((C5334b) this);
        this.f17778a = aVar;
        aVar.start();
    }

    /* renamed from: a */
    public final void mo21176a(C5340g gVar) throws DecoderException {
        boolean z;
        synchronized (this.f17779b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f17787j;
                if (subtitleDecoderException == null) {
                    boolean z2 = true;
                    if (gVar == this.f17786i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C17875h.m44301k(z);
                    this.f17780c.addLast(gVar);
                    if (this.f17780c.isEmpty() || this.f17785h <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f17779b.notify();
                    }
                    this.f17786i = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final Object mo21177c() throws DecoderException {
        C5415f fVar;
        synchronized (this.f17779b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f17787j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                } else if (this.f17781d.isEmpty()) {
                    fVar = null;
                } else {
                    fVar = (C5415f) this.f17781d.removeFirst();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* renamed from: d */
    public final Object mo21178d() throws DecoderException {
        boolean z;
        I i;
        synchronized (this.f17779b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f17787j;
                if (subtitleDecoderException == null) {
                    if (this.f17786i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C17875h.m44304o(z);
                    int i2 = this.f17784g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.f17782e;
                        int i3 = i2 - 1;
                        this.f17784g = i3;
                        i = iArr[i3];
                    }
                    this.f17786i = i;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* renamed from: e */
    public abstract SubtitleDecoderException mo21118e(DecoderInputBuffer decoderInputBuffer, C5415f fVar, boolean z);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* renamed from: f */
    public final boolean mo21184f() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f17779b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r7.f17789l     // Catch:{ all -> 0x0017 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque<I> r1 = r7.f17780c     // Catch:{ all -> 0x0017 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x001a
            int r1 = r7.f17785h     // Catch:{ all -> 0x0017 }
            if (r1 <= 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x0017:
            r1 = move-exception
            goto L_0x00a8
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r7.f17779b     // Catch:{ all -> 0x0017 }
            r1.wait()     // Catch:{ all -> 0x0017 }
            goto L_0x0003
        L_0x0023:
            boolean r1 = r7.f17789l     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x0029:
            java.util.ArrayDeque<I> r1 = r7.f17780c     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0017 }
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch:{ all -> 0x0017 }
            O[] r4 = r7.f17783f     // Catch:{ all -> 0x0017 }
            int r5 = r7.f17785h     // Catch:{ all -> 0x0017 }
            int r5 = r5 - r3
            r7.f17785h = r5     // Catch:{ all -> 0x0017 }
            r4 = r4[r5]     // Catch:{ all -> 0x0017 }
            boolean r5 = r7.f17788k     // Catch:{ all -> 0x0017 }
            r7.f17788k = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r0 = 4
            boolean r6 = r1.mo21174d(r0)
            if (r6 == 0) goto L_0x004c
            int r2 = r4.f17757b
            r0 = r0 | r2
            r4.f17757b = r0
            goto L_0x007c
        L_0x004c:
            boolean r0 = r1.mo21175g()
            if (r0 == 0) goto L_0x0059
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r4.f17757b
            r0 = r0 | r6
            r4.f17757b = r0
        L_0x0059:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r7.mo21118e(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0067, OutOfMemoryError -> 0x005e }
            goto L_0x0070
        L_0x005e:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x006f
        L_0x0067:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007c
            java.lang.Object r5 = r7.f17779b
            monitor-enter(r5)
            r7.f17787j = r0     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            return r2
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            java.lang.Object r2 = r7.f17779b
            monitor-enter(r2)
            boolean r0 = r7.f17788k     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0087
            r4.mo21120h()     // Catch:{ all -> 0x00a5 }
            goto L_0x0096
        L_0x0087:
            boolean r0 = r4.mo21175g()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0091
            r4.mo21120h()     // Catch:{ all -> 0x00a5 }
            goto L_0x0096
        L_0x0091:
            java.util.ArrayDeque<O> r0 = r7.f17781d     // Catch:{ all -> 0x00a5 }
            r0.addLast(r4)     // Catch:{ all -> 0x00a5 }
        L_0x0096:
            r1.mo15948h()     // Catch:{ all -> 0x00a5 }
            I[] r0 = r7.f17782e     // Catch:{ all -> 0x00a5 }
            int r4 = r7.f17784g     // Catch:{ all -> 0x00a5 }
            int r5 = r4 + 1
            r7.f17784g = r5     // Catch:{ all -> 0x00a5 }
            r0[r4] = r1     // Catch:{ all -> 0x00a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            return r3
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            throw r0
        L_0x00a8:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p137ja.C5417g.mo21184f():boolean");
    }

    public final void flush() {
        synchronized (this.f17779b) {
            this.f17788k = true;
            I i = this.f17786i;
            if (i != null) {
                i.mo15948h();
                I[] iArr = this.f17782e;
                int i2 = this.f17784g;
                this.f17784g = i2 + 1;
                iArr[i2] = i;
                this.f17786i = null;
            }
            while (!this.f17780c.isEmpty()) {
                I i3 = (DecoderInputBuffer) this.f17780c.removeFirst();
                i3.mo15948h();
                I[] iArr2 = this.f17782e;
                int i4 = this.f17784g;
                this.f17784g = i4 + 1;
                iArr2[i4] = i3;
            }
            while (!this.f17781d.isEmpty()) {
                ((C5415f) this.f17781d.removeFirst()).mo21120h();
            }
        }
    }

    public final void release() {
        synchronized (this.f17779b) {
            this.f17789l = true;
            this.f17779b.notify();
        }
        try {
            this.f17778a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
