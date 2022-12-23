package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p177n1.C5813l;

/* renamed from: androidx.recyclerview.widget.o */
public final class C1223o implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<C1223o> f4607f = new ThreadLocal<>();

    /* renamed from: g */
    public static C1224a f4608g = new C1224a();

    /* renamed from: b */
    public ArrayList<RecyclerView> f4609b = new ArrayList<>();

    /* renamed from: c */
    public long f4610c;

    /* renamed from: d */
    public long f4611d;

    /* renamed from: e */
    public ArrayList<C1226c> f4612e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.o$a */
    public class C1224a implements Comparator<C1226c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.o$c r7 = (androidx.recyclerview.widget.C1223o.C1226c) r7
                androidx.recyclerview.widget.o$c r8 = (androidx.recyclerview.widget.C1223o.C1226c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f4620d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f4620d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.f4617a
                boolean r3 = r8.f4617a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.f4618b
                int r1 = r7.f4618b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.f4619c
                int r8 = r8.f4619c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1223o.C1224a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.o$b */
    public static class C1225b implements RecyclerView.C1134m.C1137c {

        /* renamed from: a */
        public int f4613a;

        /* renamed from: b */
        public int f4614b;

        /* renamed from: c */
        public int[] f4615c;

        /* renamed from: d */
        public int f4616d;

        /* renamed from: a */
        public final void mo5117a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4616d * 2;
                int[] iArr = this.f4615c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4615c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4615c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4615c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4616d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public final void mo5118b(RecyclerView recyclerView, boolean z) {
            boolean z2 = false;
            this.f4616d = 0;
            int[] iArr = this.f4615c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1134m mVar = recyclerView.f4271n;
            if (recyclerView.f4269m != null && mVar != null && mVar.isItemPrefetchEnabled()) {
                if (!z) {
                    if (!recyclerView.f4287v || recyclerView.f4229E || recyclerView.f4260e.mo4999g()) {
                        z2 = true;
                    }
                    if (!z2) {
                        mVar.collectAdjacentPrefetchPositions(this.f4613a, this.f4614b, recyclerView.f4288v0, this);
                    }
                } else if (!recyclerView.f4260e.mo4999g()) {
                    mVar.collectInitialPrefetchPositions(recyclerView.f4269m.getItemCount(), this);
                }
                int i = this.f4616d;
                if (i > mVar.mPrefetchMaxCountObserved) {
                    mVar.mPrefetchMaxCountObserved = i;
                    mVar.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.f4258c.mo4927l();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$c */
    public static class C1226c {

        /* renamed from: a */
        public boolean f4617a;

        /* renamed from: b */
        public int f4618b;

        /* renamed from: c */
        public int f4619c;

        /* renamed from: d */
        public RecyclerView f4620d;

        /* renamed from: e */
        public int f4621e;
    }

    /* renamed from: c */
    public static RecyclerView.C1119a0 m3307c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f4261f.mo5034h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.C1119a0 K = RecyclerView.m3001K(recyclerView.f4261f.mo5033g(i2));
            if (K.mPosition == i && !K.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C1145s sVar = recyclerView.f4258c;
        try {
            recyclerView.mo4560R();
            RecyclerView.C1119a0 j2 = sVar.mo4925j(j, i);
            if (j2 != null) {
                if (!j2.isBound() || j2.isInvalid()) {
                    sVar.mo4916a(j2, false);
                } else {
                    sVar.mo4922g(j2.itemView);
                }
            }
            return j2;
        } finally {
            recyclerView.mo4561S(false);
        }
    }

    /* renamed from: a */
    public final void mo5113a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4610c == 0) {
            this.f4610c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1225b bVar = recyclerView.f4286u0;
        bVar.f4613a = i;
        bVar.f4614b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r2 = r13.f4612e.get(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5114b(long r14) {
        /*
            r13 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r13.f4609b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0009:
            if (r2 >= r0) goto L_0x0026
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r13.f4609b
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 != 0) goto L_0x0023
            androidx.recyclerview.widget.o$b r5 = r4.f4286u0
            r5.mo5118b(r4, r1)
            androidx.recyclerview.widget.o$b r4 = r4.f4286u0
            int r4 = r4.f4616d
            int r3 = r3 + r4
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0026:
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r2 = r13.f4612e
            r2.ensureCapacity(r3)
            r2 = 0
            r3 = 0
        L_0x002d:
            r4 = 1
            if (r2 >= r0) goto L_0x008f
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r5 = r13.f4609b
            java.lang.Object r5 = r5.get(r2)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            int r6 = r5.getWindowVisibility()
            if (r6 == 0) goto L_0x003f
            goto L_0x008c
        L_0x003f:
            androidx.recyclerview.widget.o$b r6 = r5.f4286u0
            int r7 = r6.f4613a
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.f4614b
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r7 = 0
        L_0x004f:
            int r9 = r6.f4616d
            int r9 = r9 * 2
            if (r7 >= r9) goto L_0x008c
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r9 = r13.f4612e
            int r9 = r9.size()
            if (r3 < r9) goto L_0x0068
            androidx.recyclerview.widget.o$c r9 = new androidx.recyclerview.widget.o$c
            r9.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r10 = r13.f4612e
            r10.add(r9)
            goto L_0x0070
        L_0x0068:
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r9 = r13.f4612e
            java.lang.Object r9 = r9.get(r3)
            androidx.recyclerview.widget.o$c r9 = (androidx.recyclerview.widget.C1223o.C1226c) r9
        L_0x0070:
            int[] r10 = r6.f4615c
            int r11 = r7 + 1
            r11 = r10[r11]
            if (r11 > r8) goto L_0x007a
            r12 = 1
            goto L_0x007b
        L_0x007a:
            r12 = 0
        L_0x007b:
            r9.f4617a = r12
            r9.f4618b = r8
            r9.f4619c = r11
            r9.f4620d = r5
            r10 = r10[r7]
            r9.f4621e = r10
            int r3 = r3 + 1
            int r7 = r7 + 2
            goto L_0x004f
        L_0x008c:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x008f:
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r0 = r13.f4612e
            androidx.recyclerview.widget.o$a r2 = f4608g
            java.util.Collections.sort(r0, r2)
            r0 = 0
        L_0x0097:
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r2 = r13.f4612e
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0137
            java.util.ArrayList<androidx.recyclerview.widget.o$c> r2 = r13.f4612e
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.o$c r2 = (androidx.recyclerview.widget.C1223o.C1226c) r2
            androidx.recyclerview.widget.RecyclerView r3 = r2.f4620d
            if (r3 != 0) goto L_0x00ad
            goto L_0x0137
        L_0x00ad:
            boolean r5 = r2.f4617a
            if (r5 == 0) goto L_0x00b7
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b8
        L_0x00b7:
            r5 = r14
        L_0x00b8:
            int r7 = r2.f4621e
            androidx.recyclerview.widget.RecyclerView$a0 r3 = m3307c(r3, r7, r5)
            if (r3 == 0) goto L_0x0128
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r5 = r3.mNestedRecyclerView
            if (r5 == 0) goto L_0x0128
            boolean r5 = r3.isBound()
            if (r5 == 0) goto L_0x0128
            boolean r5 = r3.isInvalid()
            if (r5 != 0) goto L_0x0128
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r3 = r3.mNestedRecyclerView
            java.lang.Object r3 = r3.get()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 != 0) goto L_0x00db
            goto L_0x0128
        L_0x00db:
            boolean r5 = r3.f4229E
            if (r5 == 0) goto L_0x00ea
            androidx.recyclerview.widget.e r5 = r3.f4261f
            int r5 = r5.mo5034h()
            if (r5 == 0) goto L_0x00ea
            r3.mo4567Y()
        L_0x00ea:
            androidx.recyclerview.widget.o$b r5 = r3.f4286u0
            r5.mo5118b(r3, r4)
            int r6 = r5.f4616d
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = "RV Nested Prefetch"
            int r7 = p177n1.C5813l.f18762a     // Catch:{ all -> 0x0121 }
            p177n1.C5813l.C5814a.m14246a(r6)     // Catch:{ all -> 0x0121 }
            androidx.recyclerview.widget.RecyclerView$x r6 = r3.f4288v0     // Catch:{ all -> 0x0121 }
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r3.f4269m     // Catch:{ all -> 0x0121 }
            r6.f4352d = r4     // Catch:{ all -> 0x0121 }
            int r7 = r7.getItemCount()     // Catch:{ all -> 0x0121 }
            r6.f4353e = r7     // Catch:{ all -> 0x0121 }
            r6.f4355g = r1     // Catch:{ all -> 0x0121 }
            r6.f4356h = r1     // Catch:{ all -> 0x0121 }
            r6.f4357i = r1     // Catch:{ all -> 0x0121 }
            r6 = 0
        L_0x010d:
            int r7 = r5.f4616d     // Catch:{ all -> 0x0121 }
            int r7 = r7 * 2
            if (r6 >= r7) goto L_0x011d
            int[] r7 = r5.f4615c     // Catch:{ all -> 0x0121 }
            r7 = r7[r6]     // Catch:{ all -> 0x0121 }
            m3307c(r3, r7, r14)     // Catch:{ all -> 0x0121 }
            int r6 = r6 + 2
            goto L_0x010d
        L_0x011d:
            p177n1.C5813l.C5814a.m14247b()
            goto L_0x0128
        L_0x0121:
            r14 = move-exception
            int r15 = p177n1.C5813l.f18762a
            p177n1.C5813l.C5814a.m14247b()
            throw r14
        L_0x0128:
            r2.f4617a = r1
            r2.f4618b = r1
            r2.f4619c = r1
            r3 = 0
            r2.f4620d = r3
            r2.f4621e = r1
            int r0 = r0 + 1
            goto L_0x0097
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1223o.mo5114b(long):void");
    }

    public final void run() {
        try {
            int i = C5813l.f18762a;
            C5813l.C5814a.m14246a("RV Prefetch");
            if (this.f4609b.isEmpty()) {
                this.f4610c = 0;
                C5813l.C5814a.m14247b();
                return;
            }
            int size = this.f4609b.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f4609b.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f4610c = 0;
                C5813l.C5814a.m14247b();
                return;
            }
            mo5114b(TimeUnit.MILLISECONDS.toNanos(j) + this.f4611d);
            this.f4610c = 0;
            C5813l.C5814a.m14247b();
        } catch (Throwable th) {
            this.f4610c = 0;
            int i3 = C5813l.f18762a;
            C5813l.C5814a.m14247b();
            throw th;
        }
    }
}
