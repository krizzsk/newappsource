package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h0 */
public final class C3506h0 extends C3482c<Long> implements C3609z.C3619i, RandomAccess, C3621z0 {

    /* renamed from: d */
    public static final C3506h0 f12436d;

    /* renamed from: b */
    public long[] f12437b;

    /* renamed from: c */
    public int f12438c;

    static {
        C3506h0 h0Var = new C3506h0(new long[0], 0);
        f12436d = h0Var;
        h0Var.f12405a = false;
    }

    public C3506h0() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    public void mo14915a(long j) {
        mo14793e();
        int i = this.f12438c;
        long[] jArr = this.f12437b;
        if (i == jArr.length) {
            long[] jArr2 = new long[C13715c.m34237b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f12437b = jArr2;
        }
        long[] jArr3 = this.f12437b;
        int i2 = this.f12438c;
        this.f12438c = i2 + 1;
        jArr3[i2] = j;
    }

    public void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo14793e();
        if (i < 0 || i > (i2 = this.f12438c)) {
            throw new IndexOutOfBoundsException(mo14920e(i));
        }
        long[] jArr = this.f12437b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f12437b, i, jArr2, i + 1, this.f12438c - i);
            this.f12437b = jArr2;
        }
        this.f12437b[i] = longValue;
        this.f12438c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo14793e();
        Charset charset = C3609z.f12640a;
        collection.getClass();
        if (!(collection instanceof C3506h0)) {
            return super.addAll(collection);
        }
        C3506h0 h0Var = (C3506h0) collection;
        int i = h0Var.f12438c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12438c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f12437b;
            if (i3 > jArr.length) {
                this.f12437b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(h0Var.f12437b, 0, this.f12437b, this.f12438c, h0Var.f12438c);
            this.f12438c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo14917c(int i) {
        if (i < 0 || i >= this.f12438c) {
            throw new IndexOutOfBoundsException(mo14920e(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public long mo14919d(int i) {
        mo14917c(i);
        return this.f12437b[i];
    }

    /* renamed from: e */
    public final String mo14920e(int i) {
        StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
        r.append(this.f12438c);
        return r.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3506h0)) {
            return super.equals(obj);
        }
        C3506h0 h0Var = (C3506h0) obj;
        if (this.f12438c != h0Var.f12438c) {
            return false;
        }
        long[] jArr = h0Var.f12437b;
        for (int i = 0; i < this.f12438c; i++) {
            if (this.f12437b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public C3609z.C3619i mo14808b(int i) {
        if (i >= this.f12438c) {
            return new C3506h0(Arrays.copyOf(this.f12437b, i), this.f12438c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo14917c(i);
        return Long.valueOf(this.f12437b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12438c; i2++) {
            i = (i * 31) + C3609z.m9635a(this.f12437b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f12438c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12437b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo14793e();
        mo14917c(i);
        long[] jArr = this.f12437b;
        long j = jArr[i];
        int i2 = this.f12438c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f12438c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public void removeRange(int i, int i2) {
        mo14793e();
        if (i2 >= i) {
            long[] jArr = this.f12437b;
            System.arraycopy(jArr, i2, jArr, i, this.f12438c - i2);
            this.f12438c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo14793e();
        mo14917c(i);
        long[] jArr = this.f12437b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f12438c;
    }

    public C3506h0(long[] jArr, int i) {
        this.f12437b = jArr;
        this.f12438c = i;
    }

    public boolean add(Object obj) {
        mo14915a(((Long) obj).longValue());
        return true;
    }
}
