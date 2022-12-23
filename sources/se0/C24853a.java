package se0;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import pe0.C24689b;

/* renamed from: se0.a */
public final class C24853a<T> implements C24689b {

    /* renamed from: j */
    public static final int f62850j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: k */
    public static final Object f62851k = new Object();

    /* renamed from: b */
    public final AtomicLong f62852b;

    /* renamed from: c */
    public int f62853c;

    /* renamed from: d */
    public long f62854d;

    /* renamed from: e */
    public final int f62855e;

    /* renamed from: f */
    public AtomicReferenceArray<Object> f62856f;

    /* renamed from: g */
    public final int f62857g;

    /* renamed from: h */
    public AtomicReferenceArray<Object> f62858h;

    /* renamed from: i */
    public final AtomicLong f62859i = new AtomicLong();

    public C24853a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f62852b = atomicLong;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f62856f = atomicReferenceArray;
        this.f62855e = i2;
        this.f62853c = Math.min(numberOfLeadingZeros / 4, f62850j);
        this.f62858h = atomicReferenceArray;
        this.f62857g = i2;
        this.f62854d = (long) (i2 - 1);
        atomicLong.lazySet(0);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f62852b.get() == this.f62859i.get()) {
            return true;
        }
        return false;
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f62856f;
            long j = this.f62852b.get();
            int i = this.f62855e;
            int i2 = ((int) j) & i;
            if (j < this.f62854d) {
                atomicReferenceArray.lazySet(i2, t);
                this.f62852b.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.f62853c) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f62854d = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.f62852b.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.f62852b.lazySet(j3);
                return true;
            }
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f62856f = atomicReferenceArray2;
            this.f62854d = (((long) i) + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f62851k);
            this.f62852b.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f62858h;
        long j = this.f62859i.get();
        int i = this.f62857g;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        if (t == f62851k) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.f62859i.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.f62858h = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                this.f62859i.lazySet(j + 1);
            }
            return t2;
        }
    }
}
