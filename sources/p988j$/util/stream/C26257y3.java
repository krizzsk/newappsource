package p988j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.y3 */
abstract class C26257y3 {

    /* renamed from: a */
    protected final Spliterator f65065a;

    /* renamed from: b */
    protected final boolean f65066b;

    /* renamed from: c */
    private final long f65067c;

    /* renamed from: d */
    private final AtomicLong f65068d;

    C26257y3(Spliterator spliterator, long j, long j2) {
        this.f65065a = spliterator;
        long j3 = 0;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        this.f65066b = i < 0;
        this.f65067c = i >= 0 ? j2 : j3;
        this.f65068d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    C26257y3(Spliterator spliterator, C26257y3 y3Var) {
        this.f65065a = spliterator;
        this.f65066b = y3Var.f65066b;
        this.f65068d = y3Var.f65068d;
        this.f65067c = y3Var.f65067c;
    }

    public final int characteristics() {
        return this.f65065a.characteristics() & -16465;
    }

    public final long estimateSize() {
        return this.f65065a.estimateSize();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo84606j(long r10) {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLong r0 = r9.f65068d
            long r0 = r0.get()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            boolean r0 = r9.f65066b
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r10 = r2
        L_0x0012:
            return r10
        L_0x0013:
            long r4 = java.lang.Math.min(r0, r10)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicLong r6 = r9.f65068d
            long r7 = r0 - r4
            boolean r6 = r6.compareAndSet(r0, r7)
            if (r6 == 0) goto L_0x0000
        L_0x0025:
            boolean r6 = r9.f65066b
            if (r6 == 0) goto L_0x002f
            long r10 = r10 - r4
            long r10 = java.lang.Math.max(r10, r2)
            return r10
        L_0x002f:
            long r10 = r9.f65067c
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x003c
            long r0 = r0 - r10
            long r4 = r4 - r0
            long r10 = java.lang.Math.max(r4, r2)
            return r10
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26257y3.mo84606j(long):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Spliterator mo84592n(Spliterator spliterator);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo84607o() {
        if (this.f65068d.get() > 0) {
            return 2;
        }
        return this.f65066b ? 3 : 1;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f65068d.get() == 0 || (trySplit = this.f65065a.trySplit()) == null) {
            return null;
        }
        return mo84592n(trySplit);
    }
}
