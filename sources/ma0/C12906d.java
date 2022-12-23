package ma0;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ya0.C13281g;

/* renamed from: ma0.d */
public final class C12906d {

    /* renamed from: f */
    public static final C12906d f31937f = new C12906d();

    /* renamed from: g */
    public static final Bitmap f31938g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: a */
    public int f31939a = 1048576;

    /* renamed from: b */
    public int f31940b;

    /* renamed from: c */
    public final LinkedList<SoftReference<Bitmap>> f31941c = new LinkedList<>();

    /* renamed from: d */
    public final C12907a f31942d = new C12907a();

    /* renamed from: e */
    public final ArrayList f31943e = new ArrayList();

    /* renamed from: ma0.d$a */
    public class C12907a extends C13281g<Bitmap> {
        public C12907a() {
        }

        /* renamed from: b */
        public final void mo39777b(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C12906d dVar = C12906d.this;
            synchronized (dVar) {
                if (bitmap != C12906d.f31938g) {
                    dVar.mo39776e(bitmap, dVar.mo39774c(bitmap) + 1);
                }
            }
        }

        /* renamed from: c */
        public final void mo39778c(Object obj) {
            C12906d.this.mo39775d((Bitmap) obj);
        }

        /* renamed from: f */
        public final boolean mo39760f(long j, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C12906d dVar = C12906d.this;
            int i = 0;
            if (dVar.f31940b <= dVar.f31939a) {
                return false;
            }
            if (bitmap != null) {
                i = bitmap.getAllocationByteCount();
            }
            dVar.f31940b -= i;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo39772a(long r5, byte[] r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r7 != 0) goto L_0x0009
            android.graphics.Bitmap r7 = f31938g     // Catch:{ all -> 0x0007 }
            goto L_0x0022
        L_0x0007:
            r5 = move-exception
            goto L_0x003a
        L_0x0009:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x001a }
            r1.<init>()     // Catch:{ all -> 0x001a }
            r2 = 0
            r1.inScaled = r2     // Catch:{ all -> 0x001a }
            r4.mo39773b(r1)     // Catch:{ all -> 0x001a }
            int r3 = r7.length     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r2, r3, r1)     // Catch:{ all -> 0x001a }
            goto L_0x0022
        L_0x001a:
            r7 = move-exception
            r7.getMessage()     // Catch:{ all -> 0x0007 }
            r7.printStackTrace()     // Catch:{ all -> 0x0007 }
            r7 = r0
        L_0x0022:
            if (r7 != 0) goto L_0x0026
            monitor-exit(r4)
            return r0
        L_0x0026:
            int r0 = r4.f31939a     // Catch:{ all -> 0x0007 }
            if (r0 <= 0) goto L_0x0038
            int r0 = r4.f31940b     // Catch:{ all -> 0x0007 }
            int r1 = r7.getAllocationByteCount()     // Catch:{ all -> 0x0007 }
            int r0 = r0 + r1
            r4.f31940b = r0     // Catch:{ all -> 0x0007 }
            ma0.d$a r0 = r4.f31942d     // Catch:{ all -> 0x0007 }
            r0.mo40146d(r5, r7)     // Catch:{ all -> 0x0007 }
        L_0x0038:
            monitor-exit(r4)
            return r7
        L_0x003a:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C12906d.mo39772a(long, byte[]):android.graphics.Bitmap");
    }

    @TargetApi(11)
    /* renamed from: b */
    public final void mo39773b(BitmapFactory.Options options) {
        Bitmap bitmap;
        synchronized (this) {
            Iterator<SoftReference<Bitmap>> it = this.f31941c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bitmap = null;
                    break;
                }
                bitmap = (Bitmap) it.next().get();
                it.remove();
                if (bitmap != null) {
                    break;
                }
            }
        }
        options.inBitmap = bitmap;
        options.inMutable = true;
        options.inSampleSize = 1;
    }

    /* renamed from: c */
    public final int mo39774c(Bitmap bitmap) {
        Iterator it = this.f31943e.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && pair.first == bitmap) {
                return ((Integer) pair.second).intValue();
            }
        }
        return 0;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo39775d(android.graphics.Bitmap r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.graphics.Bitmap r0 = f31938g     // Catch:{ all -> 0x002e }
            if (r3 != r0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            int r0 = r2.mo39774c(r3)     // Catch:{ all -> 0x002e }
            int r0 = r0 + -1
            r2.mo39776e(r3, r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            monitor-enter(r2)     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0021
            java.util.LinkedList<java.lang.ref.SoftReference<android.graphics.Bitmap>> r0 = r2.f31941c     // Catch:{ all -> 0x0029 }
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0029 }
            r1.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0.add(r1)     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x0021:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "bitmap may not be null"
            r3.<init>(r0)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C12906d.mo39775d(android.graphics.Bitmap):void");
    }

    /* renamed from: e */
    public final void mo39776e(Bitmap bitmap, int i) {
        Pair pair;
        if (i == 0) {
            pair = null;
        } else {
            pair = new Pair(bitmap, Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < this.f31943e.size()) {
            Pair pair2 = (Pair) this.f31943e.get(i2);
            if (pair2 == null || pair2.first != bitmap) {
                i2++;
            } else {
                this.f31943e.set(i2, pair);
                return;
            }
        }
        if (pair != null) {
            for (int i3 = 0; i3 < this.f31943e.size(); i3++) {
                if (this.f31943e.get(i3) == null) {
                    this.f31943e.set(i3, pair);
                    return;
                }
            }
        }
        if (pair != null) {
            this.f31943e.add(pair);
        }
    }
}
