package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p911xg.C20509q;

/* renamed from: com.google.protobuf.p */
public final class C14624p extends C14596c<Long> implements RandomAccess, C20509q {

    /* renamed from: c */
    public long[] f36871c;

    /* renamed from: d */
    public int f36872d;

    static {
        new C14624p(new long[0], 0).f36836b = false;
    }

    public C14624p() {
        this(new long[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo44030e();
        if (i < 0 || i > (i2 = this.f36872d)) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36872d);
            throw new IndexOutOfBoundsException(r.toString());
        }
        long[] jArr = this.f36871c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f36871c, i, jArr2, i + 1, this.f36872d - i);
            this.f36871c = jArr2;
        }
        this.f36871c[i] = longValue;
        this.f36872d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo44030e();
        Charset charset = C14610k.f36861a;
        collection.getClass();
        if (!(collection instanceof C14624p)) {
            return super.addAll(collection);
        }
        C14624p pVar = (C14624p) collection;
        int i = pVar.f36872d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36872d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f36871c;
            if (i3 > jArr.length) {
                this.f36871c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(pVar.f36871c, 0, this.f36871c, this.f36872d, pVar.f36872d);
            this.f36872d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c1 */
    public final C14610k.C14615e mo44086c1(int i) {
        if (i >= this.f36872d) {
            return new C14624p(Arrays.copyOf(this.f36871c, i), this.f36872d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14624p)) {
            return super.equals(obj);
        }
        C14624p pVar = (C14624p) obj;
        if (this.f36872d != pVar.f36872d) {
            return false;
        }
        long[] jArr = pVar.f36871c;
        for (int i = 0; i < this.f36872d; i++) {
            if (this.f36871c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo44120m(i);
        return Long.valueOf(this.f36871c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36872d; i2++) {
            i = (i * 31) + C14610k.m36622a(this.f36871c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo44118i(long j) {
        mo44030e();
        int i = this.f36872d;
        long[] jArr = this.f36871c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C13715c.m34237b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f36871c = jArr2;
        }
        long[] jArr3 = this.f36871c;
        int i2 = this.f36872d;
        this.f36872d = i2 + 1;
        jArr3[i2] = j;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f36872d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f36871c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final void mo44120m(int i) {
        if (i < 0 || i >= this.f36872d) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36872d);
            throw new IndexOutOfBoundsException(r.toString());
        }
    }

    public final Object remove(int i) {
        mo44030e();
        mo44120m(i);
        long[] jArr = this.f36871c;
        long j = jArr[i];
        int i2 = this.f36872d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f36872d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo44030e();
        if (i2 >= i) {
            long[] jArr = this.f36871c;
            System.arraycopy(jArr, i2, jArr, i, this.f36872d - i2);
            this.f36872d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo44030e();
        mo44120m(i);
        long[] jArr = this.f36871c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f36872d;
    }

    public C14624p(long[] jArr, int i) {
        this.f36871c = jArr;
        this.f36872d = i;
    }

    public final boolean add(Object obj) {
        mo44118i(((Long) obj).longValue());
        return true;
    }
}
