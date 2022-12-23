package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y */
public final class C14635y<E> extends C14596c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C14635y<Object> f36900e;

    /* renamed from: c */
    public E[] f36901c;

    /* renamed from: d */
    public int f36902d;

    static {
        C14635y<Object> yVar = new C14635y<>(new Object[0], 0);
        f36900e = yVar;
        yVar.f36836b = false;
    }

    public C14635y(E[] eArr, int i) {
        this.f36901c = eArr;
        this.f36902d = i;
    }

    public final boolean add(E e) {
        mo44030e();
        int i = this.f36902d;
        E[] eArr = this.f36901c;
        if (i == eArr.length) {
            this.f36901c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f36901c;
        int i2 = this.f36902d;
        this.f36902d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: c1 */
    public final C14610k.C14615e mo44086c1(int i) {
        if (i >= this.f36902d) {
            return new C14635y(Arrays.copyOf(this.f36901c, i), this.f36902d);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        mo44152i(i);
        return this.f36901c[i];
    }

    /* renamed from: i */
    public final void mo44152i(int i) {
        if (i < 0 || i >= this.f36902d) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36902d);
            throw new IndexOutOfBoundsException(r.toString());
        }
    }

    public final E remove(int i) {
        mo44030e();
        mo44152i(i);
        E[] eArr = this.f36901c;
        E e = eArr[i];
        int i2 = this.f36902d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f36902d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo44030e();
        mo44152i(i);
        E[] eArr = this.f36901c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f36902d;
    }

    public final void add(int i, E e) {
        int i2;
        mo44030e();
        if (i < 0 || i > (i2 = this.f36902d)) {
            StringBuilder r = C25541a.m63887r("Index:", i, ", Size:");
            r.append(this.f36902d);
            throw new IndexOutOfBoundsException(r.toString());
        }
        E[] eArr = this.f36901c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C13715c.m34237b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f36901c, i, eArr2, i + 1, this.f36902d - i);
            this.f36901c = eArr2;
        }
        this.f36901c[i] = e;
        this.f36902d++;
        this.modCount++;
    }
}
